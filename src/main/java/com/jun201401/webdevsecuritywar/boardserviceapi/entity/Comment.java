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
@Table(name = "comments")
public class Comment {
    @Id
    private long id;

    @ManyToOne
    @JoinColumn(name="posts_id", nullable=false)
    private Post post;

    @Column(name="users_Id", nullable = false)
    private String userId;

    @Column(nullable = false)
    private String content;

    @Column(name="created_at", nullable = false)
    private LocalDateTime createdAt;

    @Column(name="updated_at", nullable = false)
    private LocalDateTime updatedAt;
}
