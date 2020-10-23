package com.jk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Controller
public class Usercontroller {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("Hello")
    public String hello(){
       String result = restTemplate.getForObject("http://provider/Hello", String.class);
        return result;
    }

    @RequestMapping("selectAll")
    public String selectAll(Model model){
        model.addAttribute("userList", restTemplate.getForObject("http://provider/selectAll", List.class));
        return "list";
    }
}
