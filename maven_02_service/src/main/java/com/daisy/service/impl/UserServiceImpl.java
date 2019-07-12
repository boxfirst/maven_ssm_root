package com.daisy.service.impl;

import com.daisy.entity.User;
import com.daisy.mapper.UserMapper;
import com.daisy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 18080
 * @version V1.0.0
 * @Package com.daisy.service.impl
 * @Description:
 * @date 2019/6/20 17:52
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper mapper;

    @Override
    public List<User> findUserAll() {
        return mapper.findUserAll();
    }

    @Override
    public User findUserById(int id) {
        return mapper.findUserById(id);
    }
}
