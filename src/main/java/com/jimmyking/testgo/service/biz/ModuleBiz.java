package com.jimmyking.testgo.service.biz;

import com.jimmyking.testgo.dao.face.ModuleDao;
import com.jimmyking.testgo.dao.pojo.ModuleDo;
import com.jimmyking.testgo.service.api.ModuleApi;
import com.jimmyking.testgo.service.model.ModuleModel;
import com.jimmyking.util.ConvertTool;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ModuleBiz implements ModuleApi{

  @Autowired
  private ModuleDao modelDao;

	@Override
	public int insertModel(ModuleModel model) {
		return modelDao.insertModel(ConvertTool.convertToBean(model, ModuleDo.class));
	}

	@Override
	public int deleteModel(Long mId) {
		return modelDao.deleteModel(mId);
	}

	@Override
	public int updateModel(ModuleModel model) {
		return modelDao.updateModel(ConvertTool.convertToBean(model, ModuleDo.class));
	}

	@Override
	public List<ModuleModel> queryModelByProjectId(Long pId) {
    List<ModuleDo> doList = modelDao.queryModelByProjectId(pId);
		return ConvertTool.convertToList(doList, ModuleModel.class);
	}

	@Override
	public ModuleModel findById(Long mId) {
		ModuleDo modelDo = modelDao.findById(mId);
		return ConvertTool.convertToBean(modelDo, ModuleModel.class);
	}

}