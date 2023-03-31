package com.example.sns.home.controller;

import com.example.sns.directory.Directory;
import com.example.sns.home.dto.Board;
import com.example.sns.home.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class BoardController {

    public static final String HOME = Directory.HOME;

    @Autowired
    private BoardService boardService;

    @GetMapping("/")
    public String boardList(Model model) {

        List<Board> boardList = boardService.boardList();
        model.addAttribute("boardList", boardList);
        model.addAttribute("view", HOME + "home");

        return "view";
    }
}
