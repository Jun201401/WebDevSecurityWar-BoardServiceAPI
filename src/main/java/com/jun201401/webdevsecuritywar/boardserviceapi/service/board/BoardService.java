package com.jun201401.webdevsecuritywar.boardserviceapi.service.board;

import com.jun201401.webdevsecuritywar.boardserviceapi.dto.board.GetBoardDto;

import java.util.List;

public interface BoardService {
    List<GetBoardDto> getAllBoards();
}
