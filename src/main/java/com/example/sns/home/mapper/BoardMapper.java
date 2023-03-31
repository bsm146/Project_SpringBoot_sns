package com.example.sns.home.mapper;

import com.example.sns.home.dto.Board;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface BoardMapper {

    @Result(property = "writeDate", column = "write_date")
    @Result(property = "likeCount", column = "like_count")
    @Result(property = "accountPassword", column = "password")
    @Select(
            "SELECT board.id,\n" +
            "       writer,\n" +
            "       content,\n" +
            "       write_date,\n" +
            "       like_count,\n" +
            "       photo,\n" +
            "       password\n" +
            "FROM   board,\n" +
            "       account\n" +
            "WHERE  board.writer = account.id\n" +
            "ORDER  BY write_date DESC; "
    )
    List<Board> boardList();
}
