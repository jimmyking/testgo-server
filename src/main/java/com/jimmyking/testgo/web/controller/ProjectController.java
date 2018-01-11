package com.jimmyking.testgo.web.controller;

import java.util.List;

import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jimmyking.testgo.service.api.ProjectApi;
import com.jimmyking.testgo.service.model.ProjectModel;
import com.jimmyking.testgo.web.vo.ResponseInfo;

@Controller
@RequestMapping("project")
public class ProjectController{

  @Autowired
  private ProjectApi projectApi;

  @RequestMapping("query")
  @ResponseBody
  public ResponseInfo<List<ProjectModel>> query(Long uId){
    List<ProjectModel> list = projectApi.queryProjectByUserId(uId);
    return ResponseInfo.success(list);
  }

  @RequestMapping("add")
  @ResponseBody
  public ResponseInfo<Integer> add(@RequestBody ProjectModel projectModel){
    LogFactory.getLog(getClass()).debug("projectMode=="+projectModel.getName());
    int id = projectApi.insertProject(projectModel);
    return ResponseInfo.success(id);
  }

  @RequestMapping("update")
  @ResponseBody
  public ResponseInfo<Integer> update(@RequestBody ProjectModel projectModel){
    int id = projectApi.updateProject(projectModel);
    return ResponseInfo.success(id);
  }

  @RequestMapping("delete")
  @ResponseBody
  public ResponseInfo<String> delete(Long pId){
    projectApi.deleteProject(pId);
    return ResponseInfo.success("");
  }
}