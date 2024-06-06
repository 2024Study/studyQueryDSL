package com.jijisuaring.studyQueryDSL.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.bind.DefaultValue;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
public class likeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

//    default는 false여야함
    @Column(nullable = false)
    private boolean unlike;

    //게시글 엔티티 매핑
    //글쓴이 엔티티 매핑

}
