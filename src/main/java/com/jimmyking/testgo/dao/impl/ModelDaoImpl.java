package com.jimmyking.testgo.dao.impl;

import com.jimmyking.testgo.dao.face.ModelDao;
import com.jimmyking.testgo.dao.mapper.ModelMapper;
import com.jimmyking.testgo.dao.pojo.ModelDo;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ModelDaoImpl implements ModelDao{

  @Autowired
  private ModelMapper modelMapper;

	@Override
	public int insertModel(ModelDo modelDo) {
    modelDo.setCreateDate(new Date());
    modelMapper.insertModel(modelDo);
		return modelDo.getId().intValue();
	}

	@Override
	public int deleteModel(Long mId) {
		return modelMapper.deleteModel(mId);
	}

	@Override
	public int updateModel(ModelDo modelDo) {
		return modelMapper.updateModel(modelDo);
	}

	@Override
	public List<ModelDo> queryModelByProjectId(Long pId) {
		return modelMapper.queryModelByProjectId(pId);
	}

	@Override
	public ModelDo findById(Long mId) {
		return modelMapper.findById(mId);
	}

}