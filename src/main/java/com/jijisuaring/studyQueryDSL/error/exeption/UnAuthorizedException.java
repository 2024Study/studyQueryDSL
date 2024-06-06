package com.jijisuaring.studyQueryDSL.error.exeption;

import com.jijisuaring.studyQueryDSL.error.ErrorCode;
import lombok.Getter;

@Getter
public class UnAuthorizedException extends BusinessException {

    public UnAuthorizedException(String message, ErrorCode errorCode) {
        super(message,errorCode);
    }
}
