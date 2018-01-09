package com.jimmyking.testgo.service.biz;

import org.springframework.beans.factory.annotation.Autowired;

import com.jimmyking.testgo.dao.face.UserDao;
import com.jimmyking.testgo.service.api.UserApi;
import com.jimmyking.testgo.service.model.UserModel;

public class UserBiz implements UserApi{

  @Autowired
  private UserDao userDao;

  @Override
  public int insertUser(UserModel userModel){
    return 1;
  }

}