package com.jimmyking.testgo.dao.pojo;

import java.util.Date;

public class FeatureDo {

  private Long id;

  private Long userId;

  private Long projectId;

  private Long modelId;

  private String name;

  private Date createDate;

  /**
   * @return the createDate
   */
  public Date getCreateDate() {
    return createDate;
  }
  
  /**
   * @return the id
   */
  public Long getId() {
    return id;
  }

  /**
   * @return the modelId
   */
  public Long getModelId() {
    return modelId;
  }

  /**
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * @return the projectId
   */
  public Long getProjectId() {
    return projectId;
  }

  /**
   * @return the userId
   */
  public Long getUserId() {
    return userId;
  }

  /**
   * @param createDate the createDate to set
   */
  public void setCreateDate(Date createDate) {
    this.createDate = createDate;
  }

  /**
   * @param id the id to set
   */
  public void setId(Long id) {
    this.id = id;
  }

  /**
   * @param modelId the modelId to set
   */
  public void setModelId(Long modelId) {
    this.modelId = modelId;
  }

  /**
   * @param name the name to set
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * @param projectId the projectId to set
   */
  public void setProjectId(Long projectId) {
    this.projectId = projectId;
  }

  /**
   * @param userId the userId to set
   */
  public void setUserId(Long userId) {
    this.userId = userId;
  }
  
}