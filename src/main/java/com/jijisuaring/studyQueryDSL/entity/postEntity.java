package com.jijisuaring.studyQueryDSL.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class postEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private userEntity userEntity;


    //카테고리 enum
    @Enumerated(EnumType.STRING)
    @Column(nullable = false,columnDefinition = "VARCHAR(10) DEFAULT 'FREE'")
    private categoryName category;

    //댓글 매핑
    @OneToMany(mappedBy = "postEntity")
    private List<commentEntity> comments;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String content;

    @Column(nullable = false)
    private int views;

    @Column(nullable = false)
    private int likes;

    @Column(nullable = false)
    private int tag;

    @Column(nullable = false)
    private LocalDateTime createdAt;

    @Column(nullable = false)
    private LocalDateTime updatedAt;






}
