package com.enjoy.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestBody;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.enjoy.model.UserDto;
import com.enjoy.model.Users;
import com.enjoy.service.IUserService;

@RestController
public class UserController {
	
	//private final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Resource
    private IUserService iUserService;


    @RequestMapping("/hello")
    public Object sayHello() {
    	//logger.debug("这是Hello的日志");
        return "hello1";
    }
    
    @RequestMapping(value = "/notify")
    public String receiveNotify(@RequestBody String params) {
    	UserDto userDto = JSON.parseObject(params,UserDto.class);
    	System.out.println(userDto);
		return "success";
	}

    @RequestMapping("/login")
    public String login(String username,String passwd) {
        boolean login = iUserService.login(username, passwd);
        if(login) {
            return "登陆成功";
        }else {
            return  "登陆失败";
        }
    }

    @RequestMapping("/register")
    public String register(String username,String passwd) {
        boolean login = iUserService.register(username, passwd);
        if(login) {
            return "注册成功";
        }else {
            return  "注册失败";
        }
    }
    
    @RequestMapping("/batchAdd")
    public String batchAdd(String username,String passwd) {
        iUserService.batchAdd(username, passwd);
      return "成功";
    }

}

