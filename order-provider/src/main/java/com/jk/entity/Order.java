package com.jk.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "t_order")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private Integer userid;

    @Column(name = "order_number")
    private String usernumber;

    @Column(name = "order_name")
    private String username;

    @Column(name = "order_age")
    private Integer userage;

    @Column(name = "order_date")
    private String userdate;

    @Column(name = "order_fanshi")
    private String userfanshi;
}
