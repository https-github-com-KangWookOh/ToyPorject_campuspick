package com.example.demo.entity;

import com.sun.istack.NotNull;
import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Board_number;

    @NotNull
    private String User_id;

    @NotNull
    private String Board_Title;

}
