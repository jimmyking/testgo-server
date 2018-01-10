package com.jimmyking.testgo.web.controller;

import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jimmyking.testgo.service.api.UserApi;
import com.jimmyking.testgo.service.model.UserModel;

@Controller
@RequestMapping("user")
public class UserController{

    @Autowired
    private UserApi userApi;

    @RequestMapping("register")
    @ResponseBody
    public String register(UserModel userModel){
        Assert.isNull(userModel.getName(), "name is blank");
        Assert.isNull(userModel.getPassword(),"password is blank");
        int id =userApi.insertUser(userModel);
        LogFactory.getLog(this.getClass()).debug("id:"+id);
        return Integer.toString(id);
    }
}