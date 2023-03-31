package com.example.sns.a.service;

import com.example.sns.a.mapper.AMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AService {

    @Autowired
    AMapper aMapper;

    public void base() {

        aMapper.base();
    }
}
