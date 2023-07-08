package com.jun201401.webdevsecuritywar.boardserviceapi.dto.post;

import com.jun201401.webdevsecuritywar.boardserviceapi.dto.comment.CommentDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class PostDto {
    private Long id;
    private String title;
    private String content;
    private Long authorId;
    private String fileName;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private List<CommentDto> comments;
    private int reactions;
}
