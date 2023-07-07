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
@Table(name = "views")
public class View {
    @Id
    private long id;

    @ManyToOne
    @JoinColumn(name="posts_id", nullable=false)
    private Post post;

    @Column(name="users_Id", nullable = false)
    private String userId;

    @Column(name="viewed_at", nullable = false)
    private LocalDateTime viewedAt;
}
