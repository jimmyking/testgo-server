package com.jimmyking.testgo.service.api;

import java.util.List;

import com.jimmyking.testgo.service.model.UserModel;

public interface UserApi{

  int insertUser(UserModel userModel);

  UserModel login(String name,String pw);

  List<UserModel> queryUserByName(String name);

  UserModel findById(Long id);
  
}