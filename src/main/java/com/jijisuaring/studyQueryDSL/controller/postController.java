package com.jijisuaring.studyQueryDSL.controller;


import com.jijisuaring.studyQueryDSL.dto.request.post.RequestPostDto;
import com.jijisuaring.studyQueryDSL.service.impl.PostServiceImpl;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/post")
@RequiredArgsConstructor
public class postController {

    private final PostServiceImpl postService;

    @PostMapping("/createPost")
    public ResponseEntity<String> createPost(@RequestBody RequestPostDto dto, HttpServletRequest request) {
        postService.createPost(dto, request);
        return ResponseEntity.ok().body("게시물이 생성되었습니다.");
    }
}


