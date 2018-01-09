package com.jimmyking.testgo.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class HelloController{

  @RequestMapping("index")
  @ResponseBody
  public String index() {
    return "Hello World!";
  }

}