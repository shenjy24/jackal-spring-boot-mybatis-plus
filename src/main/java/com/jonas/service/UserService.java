package com.jonas.service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
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

    //@Transactional
    public User saveUser(User user) {
        return save(user) ? user : null;
    }

    public User updateUser(User user) {
        return updateById(user) ? user : null;
    }

    public User getUser(String userName) {
        Wrapper<User> wrapper = new QueryWrapper<User>().lambda().eq(User::getUserName, userName);
        return baseMapper.selectOne(wrapper);
    }

//    @DS("slave")
    public List<User> listUser(Integer startTime) {
        return baseMapper.listUser(startTime);
    }
}
