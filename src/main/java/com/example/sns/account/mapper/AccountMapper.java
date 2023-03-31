package com.example.sns.account.mapper;

import com.example.sns.home.dto.Board;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface AccountMapper {

    @Select(
            "SELECT *\n" +
            "FROM   board\n" +
            "ORDER  BY write_date DESC; "
    )
    List<Board> boardList();
}
