package com.zengjx.test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.zengjx.MySpringBootApplication;
import com.zengjx.jpa.UserRepository;
import com.zengjx.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.boot.autoconfigure.MybatisAutoConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @ClassName HelloController
 * @Description TODO
 * @Author zengjx
 * @Company zengjx
 * @Date 2019/10/31  17:58
 * @Version V1.0
 */


@RunWith(SpringRunner.class)
@SpringBootTest(classes = MySpringBootApplication.class)
public class RedisTest {
@Autowired
private UserRepository   userRepository;
@Autowired
private RedisTemplate<String,String> redisTemplate;
//  查询redis中是否有没有就查询数据库
 @Test
 public   void   test() throws JsonProcessingException {

  // redis  缓存中读取数据
     String userListData = redisTemplate.boundValueOps("user.findAll").get();
    if(userListData==null){
        List<User> userList = userRepository.findAll();
        //存入缓存
        //转为json
        ObjectMapper    om =    new ObjectMapper();
        String userListDataAsJson = om.writeValueAsString(userList);
        redisTemplate.boundValueOps("user.findAll").set(userListDataAsJson);
        System.out.println("读取数库数据......");
    }
    else {
        System.out.println(userListData);
        System.out.println("读取redis 中的数据........");
    }

 }



}
