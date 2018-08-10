package com.jonas.service;

import com.jonas.entity.User;
import com.jonas.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 【 enter the class description 】
 *
 * @author shenjy 2018/08/10
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User saveUser(User user) {
        user.setCtime(System.currentTimeMillis()/1000);
        user.setUtime(System.currentTimeMillis()/1000);
        userMapper.insert(user);
        return user;
    }
}
