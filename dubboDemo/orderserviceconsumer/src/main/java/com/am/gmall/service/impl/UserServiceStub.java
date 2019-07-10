package com.am.gmall.service.impl;

import com.am.gmall.bean.UserAddress;
import com.am.gmall.service.UserService;
import org.springframework.util.StringUtils;

import java.util.List;

public class UserServiceStub implements UserService {

    private final UserService userService;

    /*传入的是userService的远程代理对象*/
    public UserServiceStub(UserService userService) {
        this.userService = userService;
    }

    @Override
    public List<UserAddress> getUserAddressList(String userId) {

        System.out.println("UserServiceStub被调用了。。。。");
        if(!StringUtils.isEmpty(userId)){
           return userService.getUserAddressList(userId);
        }
        return null;
    }
}
