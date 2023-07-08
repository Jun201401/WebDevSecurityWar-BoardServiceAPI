package com.jun201401.webdevsecuritywar.boardserviceapi.repository.like;

import com.jun201401.webdevsecuritywar.boardserviceapi.entity.Like;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LikeRepository extends JpaRepository<Like, Long>, LikeRepositoryCustom {
}
