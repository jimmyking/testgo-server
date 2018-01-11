package com.jimmyking.testgo.web.vo;

public class ResponseInfo<T>{

  //是否调用成功
  private boolean success;
  //错误信
  private String message = "";
  //数据
  private T data;

  public static <T> ResponseInfo<T> success(T data){
    ResponseInfo<T> info = new ResponseInfo<T>();
    info.setSuccess(true);
    info.setData(data);
    return info;
  }

  public static <T> ResponseInfo<T> error(String message){
    ResponseInfo<T> info = new ResponseInfo<T>();
    info.setSuccess(false);
    info.setMessage(message);
    return info;
  }
  
  /**
   * @return the data
   */
  public T getData() {
    return data;
  }

  /**
   * @param data the data to set
   */
  public void setData(T data) {
    this.data = data;
  }

  /**
   * @return the message
   */
  public String getMessage() {
    return message;
  }

  /**
   * @param message the message to set
   */
  public void setMessage(String message) {
    this.message = message;
  }

  /**
   * @return the success
   */
  public boolean isSuccess() {
    return success;
  }

  /**
   * @param success the success to set
   */
  public void setSuccess(boolean success) {
    this.success = success;
  }
}