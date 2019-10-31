package com.zengjx.test;

import com.zengjx.MySpringBootApplication;
import com.zengjx.mapper.UserMapper;
import com.zengjx.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @ClassName HelloController
 * @Description TODO
 * @Author zengjx
 * @Company zengjx
 * @Date 2019/10/31  17:13
 * @Version V1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = MySpringBootApplication.class)
public class MapperTest {
   @Autowired
   private UserMapper  userMapper ;

@Test
   public    void   test(){

      List<User> queryUserList = userMapper.queryUserList();
      System.out.println(queryUserList);
   }
}
