package com.jun201401.webdevsecuritywar.boardserviceapi.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "posts")
public class Post {
    @Id
    private long id;

    @ManyToOne
    @JoinColumn(name="boards_id", nullable=false)
    private Board board;

    @Column(name="users_Id", nullable = false)
    private String userId;

    @Column(nullable = false)
    private String title;

    @Column
    private String content;

    @Column(name="view_count", nullable = false)
    private long viewCount;

    @Column(name="is_secret", nullable = false)
    private boolean isSecret;

    @Column(name="created_at", nullable = false)
    private LocalDateTime createdAt;

    @Column(name="updated_at", nullable = false)
    private LocalDateTime updatedAt;
}
