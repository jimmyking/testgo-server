package com.jimmyking.testgo.dao.face;

import java.util.List;

import com.jimmyking.testgo.dao.pojo.UserDo;

public interface UserDao{

  int insertUser(UserDo userDo);

  UserDo findUserByNameAndPw(String name,String pw);

  List<UserDo> queryUserByName(String name);
}