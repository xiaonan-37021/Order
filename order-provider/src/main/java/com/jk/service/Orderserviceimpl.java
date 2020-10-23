package com.jk.service;

import com.jk.dao.OrderMapper;
import com.jk.entity.Order;
import com.jk.service.Orderservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class Orderserviceimpl implements Orderservice {

    @Autowired
    private OrderMapper userMapper;

    @Override
    public List<Order> selectAll() {
        return userMapper.findAll();
    }

    @Override
    public void deletebyid(Integer id) {
        userMapper.deleteById(id);
    }

    @Override
    public Order selectbyuserid(Integer userid) {
        return userMapper.findById(userid).get();
    }

    @Override
    public void saveuser(Order user) {
        userMapper.save(user);
    }

    @Override
    public String seshi() {
        return "kajakajj";
    }
}
