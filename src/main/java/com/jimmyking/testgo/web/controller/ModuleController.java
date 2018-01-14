package com.jimmyking.testgo.web.controller;

import java.util.List;

import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jimmyking.testgo.service.api.ModuleApi;
import com.jimmyking.testgo.service.model.ModuleModel;
import com.jimmyking.testgo.web.vo.ResponseInfo;

@Controller
@RequestMapping("module")
public class ModuleController{

  @Autowired
  private ModuleApi modelApi;

  @RequestMapping("queryByProjectId")
  @ResponseBody
  public ResponseInfo<List<ModuleModel>> queryByProjectId(Long pId){
    List<ModuleModel> modelList = modelApi.queryModelByProjectId(pId);
    return ResponseInfo.success(modelList);
  }

  @RequestMapping("find")
  @ResponseBody
  public ResponseInfo<ModuleModel> find(Long mId){
    ModuleModel model = modelApi.findById(mId);
    return ResponseInfo.success(model);
  }

  @RequestMapping("add")
  @ResponseBody
  public ResponseInfo<String> add(ModuleModel model){
    LogFactory.getLog(getClass()).debug("name-----------------------------"+model.getName());
    int id = modelApi.insertModel(model);
    return ResponseInfo.success(Integer.toString(id));
  }

  @RequestMapping("delete")
  @ResponseBody
  public ResponseInfo<String> delete(Long mId){
    modelApi.deleteModel(mId);
    return ResponseInfo.success("");
  }
}