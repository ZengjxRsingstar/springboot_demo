package com.zengjx.mapper;

import com.zengjx.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @ClassName HelloController
 * @Description TODO
 * @Author zengjx
 * @Company zengjx
 * @Date 2019/10/31  16:01
 * @Version V1.0
 */

@Mapper  //标记 mapper 接口   可以被springboot 自动扫描上下文
public interface UserMapper {
  public List<User> queryUserList();


}
