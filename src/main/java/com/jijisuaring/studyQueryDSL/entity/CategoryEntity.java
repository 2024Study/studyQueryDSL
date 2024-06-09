//package com.jijisuaring.studyQueryDSL.entity;
//
//import com.jijisuaring.studyQueryDSL.enums.CategoryName;
//import jakarta.persistence.*;
//import lombok.AllArgsConstructor;
//import lombok.Builder;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import org.hibernate.annotations.OnDelete;
//import org.hibernate.annotations.OnDeleteAction;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Entity
//@Builder
//@Getter
//@AllArgsConstructor
//@NoArgsConstructor
//public class CategoryEntity {
//
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @OnDelete(action = OnDeleteAction.CASCADE)
//    @Column(name = "category_id")
//    private Long id;
//
//    @Enumerated(EnumType.STRING)
//    private CategoryName name;
//
//    @OneToMany(mappedBy = "category",cascade = CascadeType.ALL, orphanRemoval = true)
//    private List<PostEntity> posts = new ArrayList<>();
//
//
//
//}