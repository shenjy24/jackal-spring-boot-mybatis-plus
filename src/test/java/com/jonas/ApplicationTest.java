package com.jonas;

import com.jonas.common.StatusEnum;
import com.jonas.entity.Node;
import com.jonas.entity.User;
import com.jonas.mapper.UserMapper;
import com.jonas.service.NodeService;
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
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private NodeService nodeService;

    @Test
    public void insert() {
        User user = new User();
        user.setUserName("mybatis");
        user.setUserAge(10);
        user.setUserStatus(StatusEnum.NORMAL.getCode());
        userService.saveUser(user);
        System.out.println(user);
    }

    @Test
    public void testUpdate() {
        User user = new User();
        user.setUserId("");
        user.setUserStatus(StatusEnum.NORMAL.getCode());
        user.setUserAge(40);
        System.out.println(userService.updateUser(user));
    }

    @Test
    public void testGetUser() {
        List<User> user = userMapper.getUser();
        System.out.println(user);
    }

    @Test
    public void testGetNode() {
        Node node = nodeService.getNode(1L);
        System.out.println(node);
    }
}
