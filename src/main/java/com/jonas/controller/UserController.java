package com.jonas.controller;

import com.jonas.entity.User;
import com.jonas.service.UserService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 【 enter the class description 】
 *
 * @author shenjy 2018/08/06
 */
@Log4j2
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/save")
    public User save(String name, Integer age) {
        log.info("name:" + name);
        log.error("age:" + age);

        User user = new User();
        user.setUserName(name);
        user.setUserAge(age);
        return userService.saveUser(user);
    }

    @RequestMapping("/list")
    public List<User> list(Integer startTime) {
        return userService.listUser(startTime);
    }

}
