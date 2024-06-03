package com.jijisuaring.studyQueryDSL.dto.request.post;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class requestUpdatePostDto {
    private String title;
    private String content;
}
