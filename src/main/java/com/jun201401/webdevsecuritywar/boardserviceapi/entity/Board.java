package com.jun201401.webdevsecuritywar.boardserviceapi.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "boards")
public class Board {
    @Id
    private Long id;

    @ManyToOne
    @JoinColumn(name="board_types_id", nullable=false)
    private BoardType boardType;

    @OneToMany(mappedBy = "board", fetch = FetchType.LAZY)
    private List<Post> posts;
}
