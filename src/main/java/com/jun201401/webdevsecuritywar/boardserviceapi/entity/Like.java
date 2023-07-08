package com.jun201401.webdevsecuritywar.boardserviceapi.entity;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "likes")
public class Like {
    @EmbeddedId
    private LikeId likeId;
    @ManyToOne
    @JoinColumn(name="posts_id", nullable=false)
    private Post post;
    @Column(name = "liked_at")
    private LocalDateTime likedAt;

    @Embeddable
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    @EqualsAndHashCode
    public class LikeId implements Serializable {
        @Column(name = "id")
        private Long id;
        @Column(name = "users_Id")
        private String userId;
    }
}
