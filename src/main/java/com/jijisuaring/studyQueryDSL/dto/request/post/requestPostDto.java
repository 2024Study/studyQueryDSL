package com.jijisuaring.studyQueryDSL.dto.request.post;

import com.jijisuaring.studyQueryDSL.entity.categoryName;
import com.jijisuaring.studyQueryDSL.entity.tagName;
import lombok.Getter;

import java.util.List;
@Getter
public class requestPostDto {
    private String title;
    private String content;
    private categoryName name;
    private List<tagName> tag;
}
