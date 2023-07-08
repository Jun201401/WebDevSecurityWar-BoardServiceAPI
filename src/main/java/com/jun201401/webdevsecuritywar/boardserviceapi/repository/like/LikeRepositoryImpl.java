package com.jun201401.webdevsecuritywar.boardserviceapi.repository.like;

import com.jun201401.webdevsecuritywar.boardserviceapi.entity.Like;
import com.jun201401.webdevsecuritywar.boardserviceapi.entity.QLike;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;

public class LikeRepositoryImpl extends QuerydslRepositorySupport implements LikeRepositoryCustom {
    public LikeRepositoryImpl() {
        super(Like.class);
    }

    @Override
    public Long getLikeCountByPostId(Long postId) {
        QLike like = QLike.like;
        return from(like)
                .where(like.post.id.eq(postId))
                .fetchCount();
    }
}
