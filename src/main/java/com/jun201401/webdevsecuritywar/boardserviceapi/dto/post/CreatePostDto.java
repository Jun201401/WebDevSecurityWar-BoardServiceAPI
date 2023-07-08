package com.jun201401.webdevsecuritywar.boardserviceapi.dto.post;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CreatePostDto {
    private String title;
    private String content;
    private MultipartFile file;
}
