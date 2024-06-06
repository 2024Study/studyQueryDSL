package com.jijisuaring.studyQueryDSL.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
public class LikeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name="user_id")
    private userEntity userEntity;

    @ManyToOne
    @JoinColumn(name="post_id")
    private PostEntity postEntity;

    @ManyToOne
    @JoinColumn(name="comment_id")
    private CommentEntity commentEntity;

//    default는 false여야함
    @Column(nullable = false, columnDefinition = "TINYINT(1) DEAFAULT '0'")
    private boolean unlike;


}
