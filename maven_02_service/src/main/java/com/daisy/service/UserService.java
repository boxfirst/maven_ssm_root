package com.daisy.service;

import com.daisy.entity.User;

import java.util.List;

/**
 * @author 18080
 * @version V1.0.0
 * @Package com.daisy.service
 * @Description:
 * @date 2019/6/20 17:51
 */
public interface UserService {

    /**
     *  查询所有用户
     * @return
     */
    List<User> findUserAll();

    /**
     * 通过id查找用户
     * @param id
     * @return
     */
    User findUserById(int id);

}
