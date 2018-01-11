package com.jimmyking.testgo.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Lang;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.jimmyking.testgo.dao.pojo.ProjectDo;
import com.jimmyking.util.InsertParamsDoDriver;

public interface ProjectMapper{

  @Lang(InsertParamsDoDriver.class)
  @Insert("insert into project ")
  @Options(useGeneratedKeys = true,keyProperty = "id", keyColumn = "id")
  int insertProject(ProjectDo projectDo);

  @Update("update project set name = #{name} where id = #{id}")
  int updateProject(ProjectDo projectDo);

  @Delete("delete from project where id = #{id}")
  int deleteProject(@Param("id") Long id);

  @Select("select * from project where user_id = #{userId}")
  List<ProjectDo> queryProjectByUserId(@Param("userId") Long userId);


}