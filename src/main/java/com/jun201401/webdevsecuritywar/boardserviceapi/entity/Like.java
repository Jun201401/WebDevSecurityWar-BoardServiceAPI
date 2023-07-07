package com.jun201401.webdevsecuritywar.boardserviceapi.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "likes")
public class Like {
    @Id
    private long id;

    @ManyToOne
    @JoinColumn(name="posts_id", nullable=false)
    private Post post;

    @Column(name="users_Id", nullable = false)
    private String userId;
}
