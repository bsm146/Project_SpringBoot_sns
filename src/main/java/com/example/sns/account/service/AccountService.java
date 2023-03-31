package com.example.sns.account.service;

import com.example.sns.a.mapper.AMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    @Autowired
    AMapper aMapper;

    public void base() {

        aMapper.base();
    }
}
