package com.jijisuaring.studyQueryDSL.service.impl;

import com.jijisuaring.studyQueryDSL.dto.request.post.RequestPostDto;
import com.jijisuaring.studyQueryDSL.entity.PostEntity;
import com.jijisuaring.studyQueryDSL.repository.post.PostRepository;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class PostServiceImpl{

    private final PostRepository postRepository;
//    private final CategoryRepository categoryRepository;
    @Transactional
    public Long createPost(RequestPostDto requestDto, HttpServletRequest request) {
//
//        CategoryEntity category = categoryRepository.findByName(requestDto.getName())
//                .orElseThrow(() -> new NoSuchElementException("카테고리가 존재하지 않습니다."));



//        List<TagName> tagNames = requestDto.getTag();

        PostEntity post = PostEntity.builder()
                .title(requestDto.getTitle())
                .content(requestDto.getContent())
//                .category(category)
                .createdAt(LocalDateTime.now()) // createdAt 설정
                .updatedAt(LocalDateTime.now()) // updatedAt 설정
//                .tags(tagNames)
                .build();

        PostEntity savedPost = postRepository.save(post);

        return savedPost.getId();

    }

    @Transactional(readOnly = true)
    public List<PostEntity> getPostsByDateRange(LocalDateTime startDate, LocalDateTime endDate) {
        return postRepository.findAllByCreatedAtBetween(startDate, endDate);
    }


}
