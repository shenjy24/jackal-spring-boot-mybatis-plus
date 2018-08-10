package com.jonas;

import com.baomidou.mybatisplus.mapper.Condition;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.jonas.entity.User;
import com.jonas.mapper.UserMapper;
import com.jonas.service.UserService;
import com.jonas.utils.SnowFlake;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Unit test for simple App.
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class AppTest {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserService userService;

    @Autowired
    private SnowFlake snowFlake;

    @Test
    public void insert() {
        User user = new User();
        user.setUserName("mybatis");
        user.setUserAge(10);
        user = userService.saveUser(user);
        System.out.println(user);
    }

    @Test
    public void testQuery() {
        Page<User> page = userService.queryUser();
        System.out.println(page.getRecords());
    }

    @Test
    public void testSumAge() {
        Integer sum = userService.sumAge();
        System.out.println(sum);
    }

    @Test
    public void nextId() {
        for (int i = 0; i < 10; i++) {
            System.out.println(snowFlake.nextId());
        }
    }
}
