package com.jimmyking.testgo.service.biz;

import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import org.springframework.util.CollectionUtils;

import com.jimmyking.testgo.dao.face.UserDao;
import com.jimmyking.testgo.dao.pojo.UserDo;
import com.jimmyking.testgo.service.api.UserApi;
import com.jimmyking.testgo.service.model.UserModel;
import com.jimmyking.util.ConvertTool;
import java.util.List;

@Service
public class UserBiz implements UserApi{

  @Autowired
  private UserDao userDao;

  @Override
  public int insertUser(UserModel userModel){
    List<UserDo> doList = userDao.queryUserByName(userModel.getName());
    if(!CollectionUtils.isEmpty(doList)){
      throw new RuntimeException("用户已存在");
    }
    UserDo userDo = ConvertTool.convertToBean(userModel, UserDo.class);
    LogFactory.getLog(getClass()).debug("userdo.name="+userDo.getName());
    return userDao.insertUser(userDo);
  }

  @Override
  public UserModel login(String name, String pw) {
    UserDo userDo = userDao.findUserByNameAndPw(name, pw);
    if(userDo == null){
      throw new RuntimeException("用户名或密码错误");
    }
    return ConvertTool.convertToBean(userDo, UserModel.class);
  }

  @Override
  public List<UserModel> queryUserByName(String name) {
    List<UserDo> doList = userDao.queryUserByName(name);
    return ConvertTool.convertToList(doList, UserModel.class);
  }

}