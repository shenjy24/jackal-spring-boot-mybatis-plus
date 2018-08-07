package com.jonas;

import com.jonas.mapper.UserMapper;
import com.jonas.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Unit test for simple App.
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class AppTest {

    @Autowired
    @Qualifier("userMapper")
    private UserMapper userMapper;

    @Test
    public void insert() {
        User user = new User();
        user.setUserName("mybatis");
        user.setUserAge(10);
        user.setCtime(System.currentTimeMillis()/1000);
        user.setUtime(System.currentTimeMillis()/1000);
        Integer row = userMapper.insert(user);
        Long id = user.getUserId();
        System.err.println("影响行数==>" + row);
        System.err.println("id==>" + id);
    }
}
