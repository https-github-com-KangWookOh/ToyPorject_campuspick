package com.example.demo.entity;

import com.sun.istack.NotNull;

import javax.persistence.*;
public class Reply {

    // 댓글번호
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Reply_number;

    // 회원 번호
    @NotNull
    @JoinColumn(name = "User_id")
    private String id;

    // 댓글 작성자
    @NotNull
    private String Reply_writer;

    // 작성자 ID
    @NotNull
    private String Write_name;
}
