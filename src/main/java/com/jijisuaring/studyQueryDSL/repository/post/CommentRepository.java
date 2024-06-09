package com.jijisuaring.studyQueryDSL.repository.post;

import com.jijisuaring.studyQueryDSL.entity.CommentEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends JpaRepository<CommentEntity, Long> {
    Page<CommentEntity> findByIdLessThanOrderByIdDesc(Long lastCommentId, PageRequest pageRequest);
}
