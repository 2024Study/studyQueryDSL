package com.jijisuaring.studyQueryDSL.error.exeption;

import com.jijisuaring.studyQueryDSL.error.ErrorCode;
import lombok.Getter;

@Getter
public class NotFoundException extends BusinessException{

    public NotFoundException(String message, ErrorCode errorCode) {
        super(message, errorCode);
    }
}