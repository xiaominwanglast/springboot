package com.example.ems;

import com.example.ems.dao.UserDao;
import com.example.ems.entity.User;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.security.RunAs;
import java.util.UUID;

@SpringBootTest(classes = EmsApplication.class)
@RunWith(SpringRunner.class)
class EmsApplicationTests {

    @Autowired
    private UserDao userDao;

    @Test
    public void testSave() {
        userDao.save(new User(UUID.randomUUID().toString(),"wxm","123456","小明","20"));
    }

}
