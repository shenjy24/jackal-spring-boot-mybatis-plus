package com.jonas.service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jonas.entity.User;
import com.jonas.mapper.UserMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 【 enter the class description 】
 *
 * @author shenjy 2018/08/10
 */
@Service
public class UserService extends ServiceImpl<UserMapper, User> {

    @Transactional
    public User saveUser(User user) {
        insertUser(user);

        //int i = 10 / 0;
        return user;
    }

    public void insertUser(User user) {
        user.setCtime((int) (System.currentTimeMillis() / 1000));
        user.setUtime((int) (System.currentTimeMillis() / 1000));
        save(user);

        //int i = 10 / 0;
    }

    public User updateUser(User user) {
        //user.setUtime((int) (System.currentTimeMillis() / 1000));
        return updateById(user) ? user : null;
    }

    public User getUser(String userName) {
        Wrapper<User> wrapper = new QueryWrapper<User>().lambda().eq(User::getUserName, userName);
        return baseMapper.selectOne(wrapper);
    }

    public List<User> listUser(Integer startTime) {
        return baseMapper.listUser(startTime);
    }
}
