package com.jonas.service;

import com.baomidou.mybatisplus.mapper.Condition;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.jonas.entity.User;
import com.jonas.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;
import java.util.List;

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

    public User updateUser(User user) {
        user.setUtime(System.currentTimeMillis()/1000);
        userMapper.updateById(user);
        return user;
    }

    /**
     * 分页查询
     * @return
     */
    public Page<User> queryUser() {
        EntityWrapper<User> entityWrapper = new EntityWrapper<>();
        entityWrapper.orderBy("ctime", false);

        Page<User> page = new Page<>();
        page.setRecords(userMapper.selectPage(page, entityWrapper));
        return page;
    }

    public BigDecimal sumAge() {
        Wrapper wrapper = Condition.create()
                .setSqlSelect("sum(user_age)")
                .eq("user_id", 1027800640532697089L);
        List<BigDecimal> result  = userMapper.selectObjs(wrapper);
        return result.get(0);
    }

    public Page<User> selectMyPage() {
        Wrapper wrapper = Condition.create()
                .eq("user_id", 1027800640532697089L);

        Page<User> page = new Page<>();
        page.setRecords(userMapper.selectMyPage(page, wrapper));
        return page;
    }

    public List<User> listUser(Integer startTime) {
        return userMapper.listUser(startTime);
    }
}
