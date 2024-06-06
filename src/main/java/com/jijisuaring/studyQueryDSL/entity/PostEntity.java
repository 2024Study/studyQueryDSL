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
public class PostEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name="user_id")
    private userEntity userEntity;

    @OneToMany(mappedBy = "postEntity")
    private List<CommentEntity> comments;

    @Column(columnDefinition = "integer default 0", nullable = false)
    private int likes;

    @Column(columnDefinition = "integer default 0", nullable = false) // 기본 조회수는 0
    private int views;


//    @ElementCollection(targetClass = TagName.class)
//    @Enumerated(EnumType.STRING)
//    @CollectionTable(name = "post_tags", joinColumns = @JoinColumn(name = "post_id"))
//    @Column(name = "tag")
//    private List<TagName> tags = new ArrayList<>();

//    @ManyToOne
//    @JoinColumn(name = "category_id", nullable = false)
//    private CategoryEntity category;

    @Column(nullable = false, unique = false)
    private String title;

    @Column(nullable = false, unique = false)
    private String content;

    @Column
    private Boolean isDel;

    @Column
    private LocalDateTime createdAt;


    @Column
    private LocalDateTime updatedAt;

    public int increaseLikesNums() {
        return this.likes += 1;
    }

    public int decreaseLikesNums() {
        return this.likes -= 1;
    }

    public int increaseViews() {
        return this.views += 1;
    }

}
