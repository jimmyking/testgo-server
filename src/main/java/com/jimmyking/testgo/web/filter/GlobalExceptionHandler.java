package com.jimmyking.testgo.web.filter;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jimmyking.testgo.web.vo.ResponseInfo;

@ControllerAdvice
public class GlobalExceptionHandler{

  @ExceptionHandler(Exception.class)
  @ResponseBody
  public ResponseInfo<String> handle(Exception ex){
    return ResponseInfo.error(ex.getMessage());
  }
}