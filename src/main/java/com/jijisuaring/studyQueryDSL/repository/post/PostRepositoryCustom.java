package com.jijisuaring.studyQueryDSL.repository.post;

import com.jijisuaring.studyQueryDSL.entity.PostEntity;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface PostRepositoryCustom {
    List<PostEntity> findAllByCreatedAtBetween(LocalDateTime startDate, LocalDateTime endDate);
}
