package com.jimmyking.testgo.dao.face;

import java.util.List;

import com.jimmyking.testgo.dao.pojo.ModelDo;

public interface ModelDao{

  int insertModel(ModelDo modelDo);

  int deleteModel(Long mId);

  int updateModel(ModelDo modelDo);

  List<ModelDo> queryModelByProjectId(Long pId);

  ModelDo findById(Long mId);

}