package com.jimmyking.testgo.dao.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Lang;

import com.jimmyking.testgo.dao.pojo.UserDo;
import com.jimmyking.util.InsertParamsDoDriver;

public interface UserMapper{

  @Lang(InsertParamsDoDriver.class)
  @Insert("insert into user")
  int insertUser(UserDo userDo);
}