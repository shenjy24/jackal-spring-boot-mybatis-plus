package com.jonas;

import com.jonas.common.StatusEnum;
import com.jonas.entity.User;
import com.jonas.service.UserService;
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
public class ApplicationTest {

    @Autowired
    private UserService userService;

    @Test
    public void insert() {
        User user = new User();
        user.setUserName("mybatis");
        user.setUserAge(10);
        user.setUserStatus(StatusEnum.NORMAL.getCode());
        user = userService.saveUser(user);
        System.out.println(user);
    }

    @Test
    public void testUpdate() {
        User user = new User();
        user.setUserId("");
        user.setUserStatus(StatusEnum.NORMAL.getCode());
        user.setUserAge(20);
        System.out.println(userService.updateUser(user));
    }

    @Test
    public void testListUser() {
        List<User> users = userService.listUser(1533886497);
        System.out.println(users);
    }
}
