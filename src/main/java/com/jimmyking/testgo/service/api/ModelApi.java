package com.jimmyking.testgo.service.api;

import java.util.List;

import com.jimmyking.testgo.service.model.ModelModel;

public interface ModelApi{

  int insertModel(ModelModel model);

  int deleteModel(Long mId);

  int updateModel(ModelModel model);

  List<ModelModel> queryModelByProjectId(Long pId);

  ModelModel findById(Long mId);

}