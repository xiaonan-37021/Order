package com.jk.service.hystrix;

import com.jk.entity.User;
import com.jk.service.Userservice;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserServiceHystrix implements Userservice {

    @Override
    public List<User> selectAll() {
        List list = new ArrayList<>();
        list.add("网络错误");
        return list;
    }

    @Override
    public void deletebyid(Integer id) {

    }

    @Override
    public User selectbyuserid(Integer userid) {
        return null;
    }

    @Override
    public void saveuser(User user) {

    }

    @Override
    public String seshi() {
        return "你网有问题";
    }

    @Override
    public String lala() {
        return "死了";
    }

}
