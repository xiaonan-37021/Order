package com.jk.controller;

import com.jk.entity.Order;
import com.jk.service.Orderservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Ordercontroller {

    @Autowired
    private Orderservice orderservice;

    @RequestMapping("Hello1")
    public String hello(){
        return "hello lala";
    }
    /*查询*/
    @RequestMapping("selectAll1")
    public List<Order> selectAll(){
        return orderservice.selectAll();
    }
    /*删除*/
    @RequestMapping("deletebyid1")
    public void deletebyid(@RequestParam Integer id){
        orderservice.deletebyid(id);
    }
    /*回显*/
    @RequestMapping("selectbyuserid1")
    public Order selectbyuserid(@RequestParam Integer userid){
        return orderservice.selectbyuserid(userid);
    }
    /*新增和那个修改*/
    @RequestMapping("saveuser1")
    public void saveuser(@RequestBody Order user){
        orderservice.saveuser(user);
    }

    @RequestMapping("seshi1")
    public String seshi(){
        return orderservice.seshi();
    }
}
