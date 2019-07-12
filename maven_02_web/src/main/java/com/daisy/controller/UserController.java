package com.daisy.controller;

import com.daisy.entity.User;
import com.daisy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 18080
 * @version V1.0.0
 * @Package com.daisy.controller
 * @Description:
 * @date 2019/6/20 17:54
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/list")
    public List<User> getList(){
        return userService.findUserAll();
    }

    @RequestMapping("/get/{id}")
    public User getUserById(@PathVariable int id){
        return userService.findUserById(id);
    }

}
