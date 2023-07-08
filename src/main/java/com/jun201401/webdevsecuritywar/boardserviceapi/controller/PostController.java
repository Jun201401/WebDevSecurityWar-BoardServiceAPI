package com.jun201401.webdevsecuritywar.boardserviceapi.controller;

import com.jun201401.webdevsecuritywar.boardserviceapi.dto.post.PostDto;
import com.jun201401.webdevsecuritywar.boardserviceapi.service.post.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/boards/{boardTypeId}/posts")
@RequiredArgsConstructor
public class PostController {
    private final PostService postService;
}
