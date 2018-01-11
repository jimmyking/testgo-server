package com.jimmyking.util;

import org.apache.commons.logging.LogFactory;

import com.alibaba.fastjson.JSON;

public class ConvertTool{

    public static <T,R> T convertToBean(R r,Class<T> clazz){
        String srcJsonStr = JSON.toJSONString(r);
        LogFactory.getLog("ConvertTool").debug("srcJsonStr=="+srcJsonStr);
        T targetObject = JSON.parseObject(srcJsonStr, clazz);
        LogFactory.getLog("ConvertTool").debug("targetObj=="+targetObject);
        return targetObject;
    }

}