package com.jimmyking.testgo.dao.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jimmyking.testgo.dao.face.ModuleDao;
import com.jimmyking.testgo.dao.mapper.ModuleMapper;
import com.jimmyking.testgo.dao.pojo.ModuleDo;

@Component
public class ModuleDaoImpl implements ModuleDao{

  @Autowired
  private ModuleMapper modelMapper;

	@Override
	public int insertModel(ModuleDo modelDo) {
    modelDo.setCreateDate(new Date());
    modelMapper.insertModel(modelDo);
		return modelDo.getId().intValue();
	}

	@Override
	public int deleteModel(Long mId) {
		return modelMapper.deleteModel(mId);
	}

	@Override
	public int updateModel(ModuleDo modelDo) {
		return modelMapper.updateModel(modelDo);
	}

	@Override
	public List<ModuleDo> queryModelByProjectId(Long pId) {
		return modelMapper.queryModelByProjectId(pId);
	}

	@Override
	public ModuleDo findById(Long mId) {
		return modelMapper.findById(mId);
	}

}