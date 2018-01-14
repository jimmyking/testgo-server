package com.jimmyking.testgo.dao.face;

import java.util.List;

import com.jimmyking.testgo.dao.pojo.ModuleDo;

public interface ModuleDao{

  int insertModel(ModuleDo modelDo);

  int deleteModel(Long mId);

  int updateModel(ModuleDo modelDo);

  List<ModuleDo> queryModelByProjectId(Long pId);

  ModuleDo findById(Long mId);

}