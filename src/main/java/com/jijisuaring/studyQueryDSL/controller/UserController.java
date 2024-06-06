package com.jijisuaring.studyQueryDSL.controller;

import com.jijisuaring.studyQueryDSL.dto.request.RequestUserLoginDto;
import com.jijisuaring.studyQueryDSL.dto.request.RequestUserSignUpDto;
import com.jijisuaring.studyQueryDSL.service.Interface.UserService;
import jakarta.servlet.http.HttpServletResponse;
import lombok.AllArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.http.HttpRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/user")
public class UserController {

    UserService userService;

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody RequestUserLoginDto requestDto, HttpServletResponse response) {
        userService.login(requestDto, response);
        return ResponseEntity.ok("로그인 완료");

    }

    @PostMapping("/signup")
    public ResponseEntity<String> userSignUp(@RequestBody RequestUserSignUpDto requestDto, HttpServletResponse response) {
        userService.signUp(requestDto, response);
        return ResponseEntity.ok("회원가입 완료.");
    }



}
