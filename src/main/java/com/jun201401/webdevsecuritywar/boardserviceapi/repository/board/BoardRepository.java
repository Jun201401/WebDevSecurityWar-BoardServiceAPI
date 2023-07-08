package com.jun201401.webdevsecuritywar.boardserviceapi.repository.board;

import com.jun201401.webdevsecuritywar.boardserviceapi.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long>, BoardRepositoryCustom {
}
