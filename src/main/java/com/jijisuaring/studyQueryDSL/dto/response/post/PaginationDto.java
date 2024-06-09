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
public class PaginationDto {
    private Long totalPage;
    private Boolean lastPage;
    private Long totalElement;
    private List<ResponsePostDto> categoryList = new ArrayList<>();
}
