package com.jimmyking.testgo.service.biz;

import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jimmyking.testgo.dao.face.UserDao;
import com.jimmyking.testgo.dao.pojo.UserDo;
import com.jimmyking.testgo.service.api.UserApi;
import com.jimmyking.testgo.service.model.UserModel;
import com.jimmyking.util.ConvertTool;

@Service
public class UserBiz implements UserApi{

  @Autowired
  private UserDao userDao;

  @Override
  public int insertUser(UserModel userModel){
    UserDo userDo = ConvertTool.convertToBean(userModel, UserDo.class);
    LogFactory.getLog(getClass()).debug("userdo.name="+userDo.getName());
    return userDao.insertUser(userDo);
  }

}