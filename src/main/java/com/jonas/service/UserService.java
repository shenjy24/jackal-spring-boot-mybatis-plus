package com.jonas.service;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jonas.entity.User;
import com.jonas.mapper.UserMapper;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 【 enter the class description 】
 *
 * @author shenjy 2018/08/10
 */
@Service
public class UserService extends ServiceImpl<UserMapper, User> {

    public User saveUser(User user) {
        user.setCtime((int) (System.currentTimeMillis() / 1000));
        user.setUtime((int) (System.currentTimeMillis() / 1000));
        return saveOrUpdate(user) ? user : null;
    }

    public User updateUser(User user) {
        user.setUtime((int) (System.currentTimeMillis() / 1000));
        return updateById(user) ? user : null;
    }

    @DS("slave")
    public List<User> listUser(Integer startTime) {
        return baseMapper.listUser(startTime);
    }
}
