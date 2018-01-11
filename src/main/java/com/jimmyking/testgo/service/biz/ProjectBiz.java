package com.jimmyking.testgo.service.biz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jimmyking.testgo.dao.face.ProjectDao;
import com.jimmyking.testgo.dao.pojo.ProjectDo;
import com.jimmyking.testgo.service.api.ProjectApi;
import com.jimmyking.testgo.service.model.ProjectModel;
import com.jimmyking.util.ConvertTool;

import java.util.List;

@Service
public class ProjectBiz implements ProjectApi{

  @Autowired
  private ProjectDao projectDao;
  
	@Override
	public int insertProject(ProjectModel projectModel) {
		return projectDao.insertProject(ConvertTool.convertToBean(projectModel, ProjectDo.class));
	}

	@Override
	public int updateProject(ProjectModel projectModel) {
		return projectDao.updateProject(ConvertTool.convertToBean(projectModel, ProjectDo.class));
	}

  @Override
	public int deleteProject(Long id) {
		return projectDao.deleteProject(id);
  }
  
	@Override
	public List<ProjectModel> queryProjectByUserId(Long userId) {
    List<ProjectDo> doList = projectDao.queryProjectByUserId(userId);
    return ConvertTool.convertToList(doList, ProjectModel.class);
	}

	@Override
	public ProjectModel findById(Long id) {
		ProjectDo projectDo = projectDao.findById(id);
		return ConvertTool.convertToBean(projectDo, ProjectModel.class);
	}

}