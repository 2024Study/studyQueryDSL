package com.jijisuaring.studyQueryDSL.repository;

import com.jijisuaring.studyQueryDSL.entity.postEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

@Repository
public interface postRepository extends JpaRepository<postEntity, Long> {

    List<postEntity> findTop5ByOrderByCreatedAtDesc();
    Page<postEntity> findByIdIn(List<Long> ids, Pageable pageable);

}
