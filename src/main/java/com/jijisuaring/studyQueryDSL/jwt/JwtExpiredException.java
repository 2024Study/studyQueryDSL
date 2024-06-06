package com.jijisuaring.studyQueryDSL.jwt;

import javax.security.sasl.AuthenticationException;

public class JwtExpiredException extends AuthenticationException {
    public JwtExpiredException(String message) {

        super(message);
    }
}