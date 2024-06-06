package com.jijisuaring.studyQueryDSL.dto.request;

import com.jijisuaring.studyQueryDSL.entity.UserEntity;
import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Data
@Builder
public class RequestUserSignUpDto {

    private String userName;
    private String userEmail;
    private String userPw;

    public UserEntity toEntity() {
        return UserEntity.builder()
                .id(UUID.randomUUID())
                .email(userEmail)
                .password(userPw)
                .name(userName)
                .deleted(false)
                .build();

    }


}
