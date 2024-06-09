package com.jijisuaring.studyQueryDSL.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

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
    private UserEntity userEntity;

    @ManyToOne
    @JoinColumn(name="post_id")
    private PostEntity postEntity;

    @OneToMany(mappedBy = "likeEntity")
    private List<CommentEntity> comments;

    @Column(nullable = false, columnDefinition = "TINYINT(1) DEFAULT '0'")
    private boolean unlike;


}
