package com.jun201401.webdevsecuritywar.boardserviceapi.service.board;

import com.jun201401.webdevsecuritywar.boardserviceapi.dto.board.GetBoardDto;
import com.jun201401.webdevsecuritywar.boardserviceapi.repository.board.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService {
    private final BoardRepository boardRepository;

    @Override
    @Transactional(readOnly = true)
    public List<GetBoardDto> getAllBoards() {
        return boardRepository.getAllBoards();
    }
}
