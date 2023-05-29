package com.codingrecipe.board.repository;

import com.codingrecipe.board.entity.BoardEntity;
import com.codingrecipe.board.entity.CommentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<CommentEntity, Long> {
    // select * from comment_table where board_id=? order by id desc; 내림차순 오름차순 :desc
    List<CommentEntity> findAllByBoardEntityOrderByIdAsc(BoardEntity boardEntity); //메소드 정리
}
