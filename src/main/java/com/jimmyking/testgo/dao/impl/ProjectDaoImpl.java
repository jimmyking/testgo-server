package com.jimmyking.testgo.dao.impl;

import com.jimmyking.testgo.dao.face.ProjectDao;
import com.jimmyking.testgo.dao.mapper.ProjectMapper;
import com.jimmyking.testgo.dao.pojo.ProjectDo;

import java.util.Date;
import java.util.List;

import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProjectDaoImpl implements ProjectDao{

  @Autowired
  private ProjectMapper projectMapper;

	@Override
	public int insertProject(ProjectDo projectDo) {
    projectDo.setCreateDate(new Date());
		projectMapper.insertProject(projectDo);
		LogFactory.getLog(getClass()).debug("projectdo==============="+projectDo.getUserId());
		return projectDo.getId().intValue();
	}

	@Override
	public int updateProject(ProjectDo projectDo) {
		return projectMapper.updateProject(projectDo);
	}

	@Override
	public List<ProjectDo> queryProjectByUserId(Long userId) {
		return projectMapper.queryProjectByUserId(userId);
	}

	@Override
	public int deleteProject(Long id) {
		return projectMapper.deleteProject(id);
	}

}