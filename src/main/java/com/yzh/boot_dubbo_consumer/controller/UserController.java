package com.yzh.boot_dubbo_consumer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yzh.boot_dubbo_api.api.IUserService;
import com.yzh.boot_dubbo_api.entity.User;

@RestController
@RequestMapping(value = "/users") // 通过这里配置使下面的映射都在/users下，可去除
public class UserController {

	@Autowired
	private IUserService userService;
	
	@RequestMapping(value = "/list/{userName}", method = RequestMethod.GET)
	public List<User> getUserList(@PathVariable String userName) {
		List<User> list = userService.findByName(userName);
		return list;
	}

}