package com.example.mapper;

import com.example.entity.vo.ArticleInfoVO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

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

    @Test
    void getlistbyuid() {
        Integer uid = 1;
        List<ArticleInfoVO> list = articleMapper.getlistbyuid(uid);
        //正常打印
        list.stream().forEach(System.out::println);
        //parallel()方法是并发打印，打印出来的结果是无序的
        list.stream().parallel().forEach(System.out::println);
    }
}