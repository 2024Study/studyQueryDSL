package com.jijisuaring.studyQueryDSL.dto.response.post;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class paginationDto {
    private Long totalPage;
    private Boolean lastPage;
    private Long totalElement;
    private List<responsePostDto> categoryList = new ArrayList<>();
}
