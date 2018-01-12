package com.jimmyking.testgo.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Lang;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.jimmyking.testgo.dao.pojo.ModelDo;
import com.jimmyking.util.InsertParamsDoDriver;

public interface ModelMapper{

  @Lang(InsertParamsDoDriver.class)
  @Insert("insert into model ")
  @Options(useGeneratedKeys = true,keyProperty = "id", keyColumn = "id")
  int insertModel(ModelDo modelDo);

  @Delete("delete from model where id = #{mId} ")
  int deleteModel(@Param("mId") Long mId);

  @Update("update model set name = #{name},prefix = #{prefix} where id = #{id}")
  int updateModel(ModelDo modelDo);

  @Select("select * from model where project_id = #{pId} ")
  List<ModelDo> queryModelByProjectId(@Param("pId") Long pId);

  @Select("select * from model where id = #{mId} ")
  ModelDo findById(@Param("mId") Long mId);

}