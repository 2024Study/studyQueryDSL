package com.jijisuaring.studyQueryDSL.repository.post;

import com.jijisuaring.studyQueryDSL.entity.CommentEntity;
import com.jijisuaring.studyQueryDSL.entity.LikeEntity;
import com.jijisuaring.studyQueryDSL.entity.PostEntity;
import com.jijisuaring.studyQueryDSL.entity.userEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LIkeRepository extends JpaRepository<LikeEntity, Long> {
    LikeEntity findByUserEntityAndPostEntity(userEntity user, PostEntity post);
    LikeEntity findByUserEntityAndCommentEntity(userEntity user, CommentEntity comment);
}
