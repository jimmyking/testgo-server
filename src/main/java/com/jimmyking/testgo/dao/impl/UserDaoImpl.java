package com.jimmyking.testgo.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jimmyking.testgo.dao.face.UserDao;
import com.jimmyking.testgo.dao.mapper.UserMapper;
import com.jimmyking.testgo.dao.pojo.UserDo;

@Component
public class UserDaoImpl implements UserDao{

  @Autowired
  private UserMapper userMapper;

  @Override
  public int insertUser(UserDo userDo){
    return userMapper.insertUser(userDo);
  }
}