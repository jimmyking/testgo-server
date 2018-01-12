package com.jimmyking.testgo.dao.impl;

import java.util.List;

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
    userMapper.insertUser(userDo);
    return userDo.getId().intValue();
  }

  @Override
  public UserDo findUserByNameAndPw(String name, String pw) {
    return userMapper.findUserByNameAndPw(name, pw);
  }

  @Override
  public List<UserDo> queryUserByName(String name) {
    return userMapper.queryUserByName(name);
  }

  @Override
  public UserDo findById(Long id) {
    return userMapper.findById(id);
  }
}