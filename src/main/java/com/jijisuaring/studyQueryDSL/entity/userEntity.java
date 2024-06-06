package com.jijisuaring.studyQueryDSL.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.util.Lazy;
import org.springframework.web.bind.annotation.Mapping;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class userEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String userRole;

    @Column(nullable = false)
    private boolean deleted;

    @Column(nullable = false)
    private int createAt;

//    @Enumerated(모르겟다일단두자)
//    private enum userRole;

//    @OneToMany(CascadeType = Lazy)
//    @Mapping()
}
