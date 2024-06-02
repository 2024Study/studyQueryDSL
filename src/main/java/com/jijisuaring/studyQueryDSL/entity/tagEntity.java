package com.jijisuaring.studyQueryDSL.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Collate;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
public class tagEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    //게시글이랑 매핑

    //태그명?.. 태그명들은 다 enum들로?
    @Column(nullable = false)
    private String tagName;

}
