package com.jimmyking.testgo.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Lang;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.jimmyking.testgo.dao.pojo.ModuleDo;
import com.jimmyking.util.InsertParamsDoDriver;

public interface ModuleMapper{

  @Lang(InsertParamsDoDriver.class)
  @Insert("insert into module ")
  @Options(useGeneratedKeys = true,keyProperty = "id", keyColumn = "id")
  int insertModel(ModuleDo modelDo);

  @Delete("delete from module where id = #{mId} ")
  int deleteModel(@Param("mId") Long mId);

  @Update("update module set name = #{name},prefix = #{prefix} where id = #{id}")
  int updateModel(ModuleDo modelDo);

  @Select("select * from module where project_id = #{pId} ")
  List<ModuleDo> queryModelByProjectId(@Param("pId") Long pId);

  @Select("select * from module where id = #{mId} ")
  ModuleDo findById(@Param("mId") Long mId);

}