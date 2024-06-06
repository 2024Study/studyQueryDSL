package com.jijisuaring.studyQueryDSL.error.exeption;

import com.jijisuaring.studyQueryDSL.error.ErrorCode;

public class BadRequestException extends BusinessException {

    public BadRequestException(String message, ErrorCode errorCode) {
        super(message, errorCode);
    }
}
