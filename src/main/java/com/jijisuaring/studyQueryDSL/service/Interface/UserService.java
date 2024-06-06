package com.jijisuaring.studyQueryDSL.service.Interface;

import com.jijisuaring.studyQueryDSL.dto.request.RequestUserLoginDto;
import com.jijisuaring.studyQueryDSL.dto.request.RequestUserSignUpDto;
import jakarta.servlet.http.HttpServletResponse;

public interface UserService {

    void login(RequestUserLoginDto requestDto, HttpServletResponse response);

    void signUp(RequestUserSignUpDto requestDto, HttpServletResponse response);

}
