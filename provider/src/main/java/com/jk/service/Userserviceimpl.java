package com.jk.service;

import com.jk.dao.UserMapper;
import com.jk.entity.User;
import com.jk.service.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Userserviceimpl implements Userservice {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> selectAll() {
        return userMapper.findAll();
    }

    @Override
    public void deletebyid(Integer id) {
        userMapper.deleteById(id);
    }

    @Override
    public User selectbyuserid(Integer userid) {
        return userMapper.findById(userid).get();
    }

    @Override
    public void saveuser(User user) {
        userMapper.save(user);
    }

    @Override
    public String seshi() {
        return "kajakajj";
    }
}
