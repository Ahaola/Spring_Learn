package com.example.entity;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ArticleInfo {
    private int id;
    private String title;
    private String content;
    private LocalDateTime createtime;
    private LocalDateTime updatetime;
    private int uid;
    private int rcount;
    private int state;
}