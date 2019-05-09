package com.somelogs.bootshardingjdbc;

import com.somelogs.bootshardingjdbc.entity.User;
import com.somelogs.bootshardingjdbc.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BootShardingJdbcApplicationTests {

    @Resource
    private UserService userService;

    @Test
    public void getById() {
        User user = userService.getById(6L);
        System.out.println(user);
    }

    @Rollback(false)
    @Test
    public void save() {
        User user = new User();
        user.setId(13L);
        user.setRealName("1111");
        user.setDelFlag("0");
        userService.save(user);
    }

    @Rollback(false)
    @Test
    public void update() {
        User user = new User();
        user.setId(13L);
        user.setRealName("哈哈哈哈");
        userService.update(user);
    }

}
