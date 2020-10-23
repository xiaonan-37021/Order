package com.jk.service;

import com.jk.entity.Order;

import java.util.List;

public interface Orderservice {
    List<Order> selectAll();

    void deletebyid(Integer id);

    Order selectbyuserid(Integer userid);

    void saveuser(Order user);

    String seshi();
}
