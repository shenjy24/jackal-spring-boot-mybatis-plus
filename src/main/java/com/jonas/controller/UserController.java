package com.jonas.controller;

import com.jonas.entity.User;
import com.jonas.service.UserService;
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
    private UserService userService;

    @RequestMapping("/save")
    public User save(String name, Integer age) {
        User user = new User();
        user.setUserName(name);
        user.setUserAge(age);

        return userService.saveUser(user);
    }
}
