package com.daisy.mapper;

import com.daisy.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author 18080
 * @version V1.0.0
 * @Package com.daisy.mapper
 * @Description:
 * @date 2019/6/20 21:14
 */
@Mapper
public interface UserMapper {

    /**
     *  查询所有用户
     * @return
     */
    @Select("select * from user")
    List<User> findUserAll();

    /**
     * 通过id查找用户
     * @param id
     * @return
     */
    @Select("select * from user where id=#{id}")
    User findUserById(int id);

}
