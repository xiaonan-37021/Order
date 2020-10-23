package com.jk.service;

import com.jk.service.hystrix.UserServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import com.jk.entity.User;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value = "provider" , fallback = UserServiceHystrix.class)
public interface Userservice {
    /*查询*/
    @RequestMapping("selectAll")
    public List<User> selectAll();
    /*删除*/
    @RequestMapping("deletebyid")
    public void deletebyid(@RequestParam Integer id);
    /*回显*/
    @RequestMapping("selectbyuserid")
    public User selectbyuserid(@RequestParam Integer userid);
    /*新增和那个修改*/
    @RequestMapping("saveuser")
    public void saveuser(@RequestBody User user);

    @RequestMapping("seshi")
    public String seshi();

    @RequestMapping("lls")
    String lala();
}
