package com.jk.controller;

import com.jk.config.RedisConstant;
import com.jk.entity.User;
import com.jk.service.Userservice;
import com.jk.utils.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class Usercontroller {

    @Autowired
    private Userservice userservice;

    @Autowired
    private RedisUtil redisUtil;

    /*查询*/
    @RequestMapping("selectAll")
    public String selectAll(Model model){
        List<User> select = (List) redisUtil.get(RedisConstant.USER_LIST_KEY);
        if(select == null || select.isEmpty()){
            List<User> list = userservice.selectAll();
            redisUtil.set(RedisConstant.USER_LIST_KEY,list);
            redisUtil.expire(RedisConstant.USER_LIST_KEY,60);
        }
        List<User> select1 = (List) redisUtil.get(RedisConstant.USER_LIST_KEY);
        model.addAttribute("userList",select1);

        return "list";
    }


    @RequestMapping("selcc")
    @ResponseBody
    public List<User> selcc(){
        List<User> list = userservice.selectAll();

        return list;
    }
    /*删除*/
    @RequestMapping("deleteUser")
    public String deleteUser(Integer id){
        userservice.deletebyid(id);
        redisUtil.delAllKeys(RedisConstant.USER_LIST_KEY);
        return "redirect:selectAll";
    }
    /*跳转*/
    @RequestMapping("/toAdd")
    public String toAdd(Model model){
        model.addAttribute("order", new User());
        return "add";
    }

    /*回显*/
    @RequestMapping("selectUserById")
    public String selectUserById(Model model,Integer userid){
        model.addAttribute("order",userservice.selectbyuserid(userid));
        return "add";
    }

    /*新增修改啊*/
    @RequestMapping("saveOrder")
    public String saveOrder(User user){
        userservice.saveuser(user);
        redisUtil.delAllKeys(RedisConstant.USER_LIST_KEY);
        return "redirect:selectAll";
    }

    @RequestMapping("lala")
    @ResponseBody
    public String lala(){
       String na = userservice.lala();
        return na;
    }
}
