package com.jimmyking.testgo.service.api;

import java.util.List;

import com.jimmyking.testgo.service.model.ProjectModel;

public interface ProjectApi{

  int insertProject(ProjectModel projectModel);

  int updateProject(ProjectModel projectModel);

  int deleteProject(Long id);

  List<ProjectModel> queryProjectByUserId(Long userId);

  ProjectModel findById(Long id);

}