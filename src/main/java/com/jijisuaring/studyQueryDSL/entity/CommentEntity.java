package com.jijisuaring.studyQueryDSL.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CommentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name="user_id")
    private userEntity userEntity;

    @ManyToOne
    @JoinColumn(name="post_id")
    private PostEntity postEntity;

    @Column(nullable = false)
    private String content;

    @Column(nullable = false)
    private int likes;

    @Column(nullable = false, columnDefinition= "TINYINT(1) DEFAULT '0'")
    private boolean isDel;

    @Column(nullable = false)
    private LocalDateTime createAt;

    @Column(nullable = false)
    private LocalDateTime deleteAt;

    public CommentEntity updateComment(String content) {
        this.content = content;
        return this;
    }

    public int increaseLikesNums() {
        return this.likes += 1;
    }

    public int decreaseLikesNums() {
        return this.likes -= 1;
    }
}
