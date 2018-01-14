package com.jimmyking.testgo.service.api;

import java.util.List;

import com.jimmyking.testgo.service.model.ModuleModel;

public interface ModuleApi{

  int insertModel(ModuleModel model);

  int deleteModel(Long mId);

  int updateModel(ModuleModel model);

  List<ModuleModel> queryModelByProjectId(Long pId);

  ModuleModel findById(Long mId);

}