package com.jimmyking.testgo.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jimmyking.testgo.service.api.UserApi;
import com.jimmyking.testgo.service.model.UserModel;
import com.jimmyking.testgo.web.vo.ResponseInfo;

@Controller
@RequestMapping("user")
public class UserController{

    @Autowired
    private UserApi userApi;

    @RequestMapping("signup")
    @ResponseBody
    public ResponseInfo<Integer> signup(UserModel userModel){
        int id =userApi.insertUser(userModel);
        return ResponseInfo.success(id);
    }

    @RequestMapping("signin")
    @ResponseBody
    public ResponseInfo<UserModel> signin(String name,String password){
        UserModel userModel = userApi.login(name, password);
        return ResponseInfo.success(userModel);
    }
}