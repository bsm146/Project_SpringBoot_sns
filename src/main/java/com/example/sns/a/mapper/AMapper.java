package com.example.sns.a.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface AMapper {

    @Select(
            ""
    )
    void base();
}
