package com.jun201401.webdevsecuritywar.boardserviceapi.repository.like;

import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface LikeRepositoryCustom {
    Long getLikeCountByPostId(Long postId);
}
