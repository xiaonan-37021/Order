package com.jk.services;

import com.jk.entity.Order;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value = "orderprovider")
public interface Orderservice {
    /*查询*/
    @RequestMapping("selectAll1")
    public List<Order> selectAll();
    /*删除*/
    @RequestMapping("deletebyid1")
    public void deletebyid(@RequestParam Integer id);
    /*回显*/
    @RequestMapping("selectbyuserid1")
    public Order selectbyuserid(@RequestParam Integer userid);
    /*新增和那个修改*/
    @RequestMapping("saveuser1")
    public void saveuser(@RequestBody Order user);
}
