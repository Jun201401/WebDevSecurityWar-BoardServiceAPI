package com.jun201401.webdevsecuritywar.boardserviceapi.dto.post;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class PostPreviewDto {
    private Long postId;
    private String title;
    private String author;
    private Long viewCount;
    private Long likeCount;
    private LocalDateTime createdAt;

    public PostPreviewDto(Long postId, String title, String author, Long viewCount, LocalDateTime createdAt) {
        this.postId = postId;
        this.title = title;
        this.author = author;
        this.viewCount = viewCount;
        this.createdAt = createdAt;
    }

    public void setLikeCount(Long likeCount) {
        this.likeCount = likeCount;
    }
}