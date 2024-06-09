package com.jijisuaring.studyQueryDSL.dto.request;


import com.jijisuaring.studyQueryDSL.entity.UserEntity;
import com.jijisuaring.studyQueryDSL.enums.UserRank;
import com.jijisuaring.studyQueryDSL.enums.UserRole;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RequestUserSignUpDto {

    private String userName;
    private UserRank userRank;
    private String userEmail;
    private String userPw;

    public UserEntity toEntity() {
        return UserEntity.builder()
                .email(userEmail)
                .userRank(userRank)
                .password(userPw)
                .name(userName)
                .userRole(UserRole.user)
                .deleted(false)
                .build();
    }

}