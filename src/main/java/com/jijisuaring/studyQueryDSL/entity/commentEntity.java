package com.jijisuaring.studyQueryDSL.entity;

import com.mysql.cj.protocol.ColumnDefinition;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;

import java.text.DateFormat;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class commentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name="user_id")
    private userEntity userEntity;

    @ManyToOne
    @JoinColumn(name="post_id")
    private postEntity postEntity;

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
}
