package com.jijisuaring.studyQueryDSL.dto.response.post;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.jijisuaring.studyQueryDSL.entity.categoryName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class responsePostDto {
    private long id;
    private String title;
    private String content;
    private categoryName name;
    private int views;
    private int likes;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy.MM.dd", timezone = "Asia/Seoul")
    private LocalDateTime createdAt;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy.MM.dd", timezone = "Asia/Seoul")
    private LocalDateTime updatedAt;
}
