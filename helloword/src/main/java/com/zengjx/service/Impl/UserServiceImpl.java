package com.zengjx.service.Impl;

import com.zengjx.mapper.UserMapper;
import com.zengjx.pojo.User;
import com.zengjx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @ClassName HelloController
 * @Description TODO
 * @Author zengjx
 * @Company zengjx
 * @Date 2019/10/31  16:08
 * @Version V1.0
 */
public class UserServiceImpl  implements UserService {
 @SuppressWarnings("SpringJavaIntjectionPointsAutowiringInsepction")
 @Autowired
 private UserMapper    userMapper;


    @Override
    public List<User> findAll() {
        return userMapper.queryUserList();
    }
}
