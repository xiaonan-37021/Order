package com.jk.service;

import com.jk.entity.User;

import java.util.List;

public interface Userservice {
    List<User> selectAll();

    void deletebyid(Integer id);

    User selectbyuserid(Integer userid);

    void saveuser(User user);

    String seshi();
}
