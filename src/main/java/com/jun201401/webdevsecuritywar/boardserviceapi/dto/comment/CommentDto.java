package com.jun201401.webdevsecuritywar.boardserviceapi.dto.comment;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CommentDto {
    private Long id;
    private String content;
    private Long authorId;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
