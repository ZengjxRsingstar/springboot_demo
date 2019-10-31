package com.zengjx.service;

import com.zengjx.pojo.User;

import java.util.List;

/**
 * @ClassName HelloController
 * @Description TODO
 * @Author zengjx
 * @Company zengjx
 * @Date 2019/10/31  16:08
 * @Version V1.0
 */
public interface UserService {
  public List<User>   findAll();
}
