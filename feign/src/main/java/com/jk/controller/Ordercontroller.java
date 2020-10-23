package com.jk.controller;

import com.jk.entity.Order;
import com.jk.services.Orderservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Ordercontroller {

    @Autowired
    private Orderservice orderservice;

    /*查询*/
    @RequestMapping("selectAll1")
    public String selectAll1(Model model){
        model.addAttribute("userList",orderservice.selectAll());
        return "list1";
    }

    /*删除*/
    @RequestMapping("deleteUser1")
    public String deleteUser1(Integer id){
        orderservice.deletebyid(id);
        return "redirect:selectAll1";
    }

    /*跳转*/
    @RequestMapping("/toAdd1")
    public String toAdd1(Model model){
        model.addAttribute("order", new Order());
        return "add1";
    }

    /*回显*/
    @RequestMapping("selectUserById1")
    public String selectUserById1(Model model,Integer userid){
        model.addAttribute("order",orderservice.selectbyuserid(userid));
        return "add1";
    }

    /*新增修改啊*/
    @RequestMapping("saveOrder1")
    public String saveOrder1(Order user){
        orderservice.saveuser(user);
        return "redirect:selectAll1";
    }
}
