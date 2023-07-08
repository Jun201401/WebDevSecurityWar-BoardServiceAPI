package com.jun201401.webdevsecuritywar.boardserviceapi.dto.board;

import com.jun201401.webdevsecuritywar.boardserviceapi.dto.post.PostPreviewDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GetBoardDto {
    private Long id;
    private String name;
    private List<PostPreviewDto> posts;

    public GetBoardDto(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}