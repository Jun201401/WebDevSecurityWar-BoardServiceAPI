package com.jun201401.webdevsecuritywar.boardserviceapi.repository.board;

import com.jun201401.webdevsecuritywar.boardserviceapi.dto.board.GetBoardDto;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.List;

@NoRepositoryBean
public interface BoardRepositoryCustom {
    List<GetBoardDto> getAllBoards();
}
