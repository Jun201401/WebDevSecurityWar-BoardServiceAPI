package com.jun201401.webdevsecuritywar.boardserviceapi.repository.board;

import com.jun201401.webdevsecuritywar.boardserviceapi.dto.board.GetBoardDto;
import com.jun201401.webdevsecuritywar.boardserviceapi.dto.post.PostPreviewDto;
import com.jun201401.webdevsecuritywar.boardserviceapi.entity.*;
import com.jun201401.webdevsecuritywar.boardserviceapi.repository.like.LikeRepository;
import com.querydsl.core.types.Projections;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;

import java.util.List;

public class BoardRepositoryImpl extends QuerydslRepositorySupport implements BoardRepositoryCustom {
    private final LikeRepository likeRepository;

    @Autowired
    public BoardRepositoryImpl(LikeRepository likeRepository) {
        super(Board.class);
        this.likeRepository = likeRepository;
    }

    @Override
    public List<GetBoardDto> getAllBoards() {
        QBoard board = QBoard.board;
        QBoardType boardType = QBoardType.boardType;

        List<GetBoardDto> boardDtoList = from(board)
                .innerJoin(board.boardType, boardType)
                .select(Projections.constructor(GetBoardDto.class,
                        board.id,
                        boardType.name
                ))
                .fetch();

        for (GetBoardDto boardDto : boardDtoList) {
            List<PostPreviewDto> posts = getPostsForBoard(boardDto.getId());
            boardDto.setPosts(posts);
        }

        return boardDtoList;
    }

    private List<PostPreviewDto> getPostsForBoard(Long boardId) {
        QPost post = QPost.post;

        List<PostPreviewDto> posts = from(post)
                .where(post.board.id.eq(boardId))
                .select(Projections.constructor(PostPreviewDto.class,
                        post.id,
                        post.title,
                        post.userId,
                        post.viewCount,
                        post.createdAt
                ))
                .fetch();

        for (PostPreviewDto postPreviewDto : posts) {
            long likeCount = likeRepository.getLikeCountByPostId(postPreviewDto.getPostId());
            postPreviewDto.setLikeCount(likeCount);
        }

        return posts;
    }
}