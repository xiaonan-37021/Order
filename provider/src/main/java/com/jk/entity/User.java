package com.jk.entity;

import lombok.Data;
import org.checkerframework.checker.units.qual.C;

import javax.persistence.*;

@Data
@Entity
@Table(name = "t_userss")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Integer userid;

    @Column(name = "user_name")
    private String username;

    @Column(name = "user_bum")
    private String userbum;

    @Column(name = "userdate")
    private String userdate;

    @Column(name = "usergangw")
    private String usergangw;

    @Column(name = "userzhiz")
    private String userzhiz;
}
