package com.enjoy.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.enjoy.EnjoySpringBootApplication;
import com.enjoy.mq.Sender;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = EnjoySpringBootApplication.class)
public class RabbitmqTest {
    @Resource
    private Sender sender;
     @Test
     public void testRabbitmq() throws Exception {
         sender.send();
     }
}
