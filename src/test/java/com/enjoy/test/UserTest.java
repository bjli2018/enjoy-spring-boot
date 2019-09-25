package com.enjoy.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.enjoy.EnjoySpringBootApplication;
import com.enjoy.dao.UsersMapper;
import com.enjoy.model.Users;

@SpringBootTest(classes = EnjoySpringBootApplication.class)
@RunWith(SpringRunner.class)
public class UserTest {
	@Autowired
    private UsersMapper usersMapper;
	
	@Test
    public void testAdd() {
        Users user = new Users() ;
        user.setPasswd("123");
        user.setUsername("enjoy");
        usersMapper.insertSelective(user);
    }

    @Test
    public void testSelectByPrimaryKey() {
        Users enjoy = usersMapper.selectByPrimaryKey(4);
        System.out.println(enjoy);
    }
}
