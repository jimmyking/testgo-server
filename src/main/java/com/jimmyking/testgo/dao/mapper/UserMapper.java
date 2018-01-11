package com.jimmyking.testgo.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Lang;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.jimmyking.testgo.dao.pojo.UserDo;
import com.jimmyking.util.InsertParamsDoDriver;

public interface UserMapper{

  @Lang(InsertParamsDoDriver.class)
  @Insert("insert into user")
  @Options(useGeneratedKeys = true,keyProperty = "id", keyColumn = "id")
  int insertUser(UserDo userDo);

  @Select("select * from user where name = #{name} and password = #{pw}")
  UserDo findUserByNameAndPw(@Param("name") String name,@Param("pw") String pw);

  @Select("select * from user where name = #{name}")
  List<UserDo> queryUserByName(@Param("name") String name);
}