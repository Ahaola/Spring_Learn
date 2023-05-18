package com.example.demo.entity;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class UserBlog {
    private int id;
    private int sn;
    private String name;
    private String qq_mail;
}
