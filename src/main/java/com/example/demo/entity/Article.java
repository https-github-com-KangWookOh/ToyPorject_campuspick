package com.example.demo.entity;

import com.sun.istack.NotNull;
import jdk.jfr.Timestamp;
import lombok.Getter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
public class Article {

    // 게시글 번호
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Article_Number;

    // FK 댓글 번호
    @NotNull
    private Long Reply_number;

    // FK 게시판 번호
    @NotNull
    private String Board_number;

    // FK 회원 번호(유저)
    @NotNull
    private Long Article_Userid;

    @NotNull
    private String Article_Title;

    @NotNull
    private int View_Count;

    @NotNull
    private String Article_Writer;

    @Timestamp
    private LocalDateTime create_time;
}
