package com.jun201401.webdevsecuritywar.boardserviceapi.controller;

import com.jun201401.webdevsecuritywar.boardserviceapi.dto.board.GetBoardDto;
import com.jun201401.webdevsecuritywar.boardserviceapi.service.board.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/boards")
@RequiredArgsConstructor
public class BoardController {
    private final BoardService boardService;

    @GetMapping
    public ResponseEntity<List<GetBoardDto>> getAllBoards() {
        return ResponseEntity.ok().body(boardService.getAllBoards());
    }
}
