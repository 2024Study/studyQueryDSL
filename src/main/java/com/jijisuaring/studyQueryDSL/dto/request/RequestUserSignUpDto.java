package com.jijisuaring.studyQueryDSL.dto.request;

import com.jijisuaring.studyQueryDSL.entity.UserEntity;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RequestUserSignUpDto {

    private String userName;
    private String userEmail;
    private String userPw;

    public UserEntity toEntity() {
        return UserEntity.builder()
                .id(toEntity().getId())
                .email(userEmail)
                .password(userPw)
                .name(userName)
                .deleted(false)
                .build();

    }


}
