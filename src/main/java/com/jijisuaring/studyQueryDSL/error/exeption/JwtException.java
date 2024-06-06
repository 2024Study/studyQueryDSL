package com.jijisuaring.studyQueryDSL.error.exeption;

import com.gamza.ItEat.error.ErrorCode;
import lombok.Getter;

@Getter
public class JwtException extends BusinessException{
    public JwtException(String message, ErrorCode errorCode){
        super(message,errorCode);
    }
}
