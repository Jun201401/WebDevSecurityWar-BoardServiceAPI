package com.jun201401.webdevsecuritywar.boardserviceapi.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "boards")
public class Board {
    @Id
    private long id;

    @ManyToOne
    @JoinColumn(name="board_types_id", nullable=false)
    private BoardType boardType;
}
