package com.jijisuaring.studyQueryDSL.repository.post;

import com.jijisuaring.studyQueryDSL.entity.PostEntity;
import com.jijisuaring.studyQueryDSL.entity.QPostEntity;
import com.querydsl.jpa.impl.JPAQueryFactory;
import jakarta.persistence.EntityManager;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public class PostRepositoryImpl implements PostRepositoryCustom{
    private final JPAQueryFactory queryFactory;

    public PostRepositoryImpl(EntityManager entityManager) {
        this.queryFactory = new JPAQueryFactory(entityManager);
    }

    @Override
    public List<PostEntity> findAllByCreatedAtBetween(LocalDateTime startDate, LocalDateTime endDate) {
        QPostEntity post = QPostEntity.postEntity;

        return queryFactory.selectFrom(post)
                .where(post.createdAt.between(startDate, endDate))
                .fetch();
    }
}
