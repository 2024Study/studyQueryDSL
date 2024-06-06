package com.jijisuaring.studyQueryDSL.error.exeption;

import com.gamza.ItEat.error.ErrorCode;

public class ForbiddenException extends BusinessException {

    public ForbiddenException(String message, ErrorCode errorCode)
    {
        super(message, errorCode);
    }
}
