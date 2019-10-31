package com.zengjx.jpa;

import com.zengjx.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @ClassName HelloController
 * @Description TODO
 * @Author zengjx
 * @Company zengjx
 * @Date 2019/10/31  18:04
 * @Version V1.0
 */
@Repository
public interface UserRepository   extends JpaRepository<User,Long> {

  public List<User>   findAll();



}
