//package com.jijisuaring.studyQueryDSL.entity;
//
//import jakarta.persistence.*;
//import lombok.AllArgsConstructor;
//import lombok.Builder;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//
//@Entity
//@AllArgsConstructor
//@NoArgsConstructor
//@Getter
//@Builder
//public class LikeEntity {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private long id;
//
//    @ManyToOne
//    @JoinColumn(name="user_id")
//    private UserEntity userEntity;
//
//    @ManyToOne
//    @JoinColumn(name="post_id")
//    private PostEntity postEntity;
//
//    @Column(nullable = false, columnDefinition = "TINYINT(1) DEAFAULT '0'")
//    private boolean unlike;
//
//
//}
