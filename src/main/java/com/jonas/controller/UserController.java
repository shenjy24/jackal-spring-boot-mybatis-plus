package com.jonas.controller;

import com.jonas.mapper.UserMapper;
import com.jonas.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 【 enter the class description 】
 *
 * @author shenjy 2018/08/06
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/insert")
    public User insert() {
        User user = new User();
        user.setUserName("mybatis");
        user.setUserAge(10);
        user.setCtime(System.currentTimeMillis()/1000);
        user.setUtime(System.currentTimeMillis()/1000);
        Integer row = userMapper.insert(user);
        Long id = user.getUserId();
        System.err.println("影响行数==>" + row);
        System.err.println("id==>" + id);
        return user;
    }
}
