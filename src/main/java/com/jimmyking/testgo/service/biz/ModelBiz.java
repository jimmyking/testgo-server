package com.jimmyking.testgo.service.biz;

import com.jimmyking.testgo.dao.face.ModelDao;
import com.jimmyking.testgo.dao.pojo.ModelDo;
import com.jimmyking.testgo.service.api.ModelApi;
import com.jimmyking.testgo.service.model.ModelModel;
import com.jimmyking.util.ConvertTool;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ModelBiz implements ModelApi{

  @Autowired
  private ModelDao modelDao;

	@Override
	public int insertModel(ModelModel model) {
		return modelDao.insertModel(ConvertTool.convertToBean(model, ModelDo.class));
	}

	@Override
	public int deleteModel(Long mId) {
		return modelDao.deleteModel(mId);
	}

	@Override
	public int updateModel(ModelModel model) {
		return modelDao.updateModel(ConvertTool.convertToBean(model, ModelDo.class));
	}

	@Override
	public List<ModelModel> queryModelByProjectId(Long pId) {
    List<ModelDo> doList = modelDao.queryModelByProjectId(pId);
		return ConvertTool.convertToList(doList, ModelModel.class);
	}

	@Override
	public ModelModel findById(Long mId) {
    ModelDo modelDo = modelDao.findById(mId);
		return ConvertTool.convertToBean(modelDo, ModelModel.class);
	}

}