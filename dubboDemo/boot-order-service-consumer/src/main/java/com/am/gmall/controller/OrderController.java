package com.am.gmall.controller;

import com.am.gmall.bean.UserAddress;
import com.am.gmall.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {

    @Autowired
    OrderService orderService;

    @RequestMapping("/initOrder/{uid}")
    public List<UserAddress> initOrder(@PathVariable("uid") String userId){
        return orderService.initOrder(userId);
    }
}
