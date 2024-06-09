package com.jijisuaring.studyQueryDSL.dto.response.post;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ResponsePostListDto {

    private int size;
    private List<ResponsePostDto> posts = new ArrayList<>();
}
