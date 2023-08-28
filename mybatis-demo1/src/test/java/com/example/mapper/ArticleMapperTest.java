package com.example.mapper;

import com.example.entity.vo.ArticleInfoVO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ArticleMapperTest {

    @Autowired
    private ArticleMapper articleMapper;
    @Test
    void getDetail() {
        ArticleInfoVO articleInfoVO = articleMapper.getDetail(1);
        System.out.println(articleInfoVO);
    }
}