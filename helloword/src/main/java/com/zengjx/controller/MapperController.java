package com.zengjx.controller;

import com.zengjx.mapper.UserMapper;
import com.zengjx.pojo.User;
import com.zengjx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @ClassName HelloController
 * @Description TODO
 * @Author zengjx
 * @Company zengjx
 * @Date 2019/10/31  16:18
 * @Version V1.0
 */
@Controller
public class MapperController {

@Autowired
    private UserMapper   userMapper;
@RequestMapping("/queryUser")
@ResponseBody
  public List<User> queryUser(){
   List<User> users  =userMapper.queryUserList();

   return   users;


  }

}
