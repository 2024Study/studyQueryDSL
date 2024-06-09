package com.jijisuaring.studyQueryDSL.repository.post;

import com.jijisuaring.studyQueryDSL.entity.PostEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<PostEntity, Long>, PostRepositoryCustom{

    List<PostEntity> findTop5ByOrderByCreatedAtDesc();
    Page<PostEntity> findByIdIn(List<Long> ids, Pageable pageable);

}
