package com.example.sns.home.dto;

import lombok.Data;

@Data
public class Board {

    // table_board
    private int id;
    private String writer;
    private String content;
    private String writeDate;
    private int likeCount;
    private String photo;

    // table_account
    private String accountPassword;
}
