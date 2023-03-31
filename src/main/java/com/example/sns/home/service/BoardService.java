package com.example.sns.home.service;

import com.example.sns.home.dto.Board;
import com.example.sns.home.mapper.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {

    @Autowired
    BoardMapper boardMapper;

    public List<Board> boardList() {

        return boardMapper.boardList();
    }
}
