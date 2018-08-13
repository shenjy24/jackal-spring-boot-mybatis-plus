package com.jonas;

import com.baomidou.mybatisplus.plugins.Page;
import com.jonas.entity.User;
import com.jonas.enums.StatusEnum;
import com.jonas.service.UserService;
import com.jonas.utils.SnowFlake;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

/**
 * Unit test for simple App.
 */
@SpringBootTest(classes = App.class)
@RunWith(SpringRunner.class)
public class AppTest {

    @Autowired
    private UserService userService;

    @Autowired
    private SnowFlake snowFlake;

    @Test
    public void insert() {
        User user = new User();
        user.setUserName("mybatis");
        user.setUserAge(10);
        user.setUserStatus(StatusEnum.NORMAL);
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
        BigDecimal sum = userService.sumAge();
        System.out.println(sum);
    }

    @Test
    public void testSelectMyPage() {
        Page<User> page = userService.selectMyPage();
        System.out.println(page);
        System.out.println(page.getRecords());
    }

    @Test
    public void testListUser() {
        List<User> users = userService.listUser(1533886497);
        System.out.println(users);
    }

    @Test
    public void nextId() {
        for (int i = 0; i < 10; i++) {
            System.out.println(snowFlake.nextId());
        }
    }
}
