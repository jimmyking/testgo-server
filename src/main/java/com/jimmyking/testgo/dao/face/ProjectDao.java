package com.jimmyking.testgo.dao.face;

import java.util.List;

import com.jimmyking.testgo.dao.pojo.ProjectDo;

public interface ProjectDao {

  int insertProject(ProjectDo projectDo);

  int updateProject(ProjectDo projectDo);

  int deleteProject(Long id);

  List<ProjectDo> queryProjectByUserId(Long userId);

  ProjectDo findById(Long id);
}