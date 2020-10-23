package com.jk.controller;

import com.jk.entity.User;
import com.jk.service.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Usercontroller {

    @Autowired
    private Userservice userservice;

    @RequestMapping("Hello")
    public String hello(){
        return "hello lala";
    }
    /*查询*/
    @RequestMapping("selectAll")
    public List<User> selectAll(){
        return userservice.selectAll();
    }
    /*删除*/
    @RequestMapping("deletebyid")
    public void deletebyid(@RequestParam Integer id){
        userservice.deletebyid(id);
    }
    /*回显*/
    @RequestMapping("selectbyuserid")
    public User selectbyuserid(@RequestParam Integer userid){
        return userservice.selectbyuserid(userid);
    }
    /*新增和那个修改*/
    @RequestMapping("saveuser")
    public void saveuser(@RequestBody User user){
        userservice.saveuser(user);
    }

    @RequestMapping("seshi")
    public String seshi(){
        return userservice.seshi();
    }
}
