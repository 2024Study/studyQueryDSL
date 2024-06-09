package com.jijisuaring.studyQueryDSL.service.impl;

import com.jijisuaring.studyQueryDSL.dto.request.RequestUserLoginDto;
import com.jijisuaring.studyQueryDSL.dto.request.RequestUserSignUpDto;
import com.jijisuaring.studyQueryDSL.entity.UserEntity;
import com.jijisuaring.studyQueryDSL.enums.UserRole;
import com.jijisuaring.studyQueryDSL.error.ErrorCode;
import com.jijisuaring.studyQueryDSL.error.exeption.NotFoundException;
import com.jijisuaring.studyQueryDSL.error.exeption.UnAuthorizedException;
import com.jijisuaring.studyQueryDSL.jwt.JwtProvider;
import com.jijisuaring.studyQueryDSL.repository.UserRepository;
import com.jijisuaring.studyQueryDSL.service.Interface.UserService;
import com.jijisuaring.studyQueryDSL.service.jwt.RedisService;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

import static com.jijisuaring.studyQueryDSL.error.ErrorCode.ACCESS_DENIED_EXCEPTION;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtProvider jwtProvider;
    private final RedisService redisService;


    @Override
    public void login(RequestUserLoginDto requestDto, HttpServletResponse response) {
        UserEntity user = userRepository.findByEmail(requestDto.getUserEmail()).orElseThrow();

        if (!passwordEncoder.matches(requestDto.getUserPw(), user.getPassword())) {
            throw new UnAuthorizedException("401", ACCESS_DENIED_EXCEPTION);    // 패스워드 불일치
        }

        this.setJwtTokenInHeader(requestDto.getUserEmail(), response);

    }

    @Override
    @Transactional
    public void signUp(RequestUserSignUpDto requestDto, HttpServletResponse response) {

        requestDto.setUserPw(passwordEncoder.encode(requestDto.getUserPw()));

        UserEntity user = requestDto.toEntity();
        userRepository.save(user);

    }
    public void setJwtTokenInHeader(String email, HttpServletResponse response) {
        Optional<UserEntity> user = userRepository.findByEmail(email);

        if (user.isEmpty()) {
            throw new NotFoundException("Not Found User", ErrorCode.NOT_FOUND_EXCEPTION);
        }

        UserRole userRole = user.get().getUserRole();

        String accessToken = jwtProvider.createAccessToken(email, userRole);
        String refreshToken = jwtProvider.createRefreshToken(email, userRole);

        jwtProvider.setHeaderAT(response, accessToken);
        jwtProvider.setHeaderRT(response, refreshToken);

        redisService.setValues(refreshToken, email);
    }

}
