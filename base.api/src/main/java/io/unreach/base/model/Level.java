package io.unreach.base.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 等级模型
 *
 * @author joe
 * @date 2018.1.17
 */
@ApiModel(description = "等级模型")
public class Level {

  @ApiModelProperty(value = "主键")
  private String id = null;

  @ApiModelProperty(value = "等级显示名称")
  private String name = null;

  @ApiModelProperty(value = "等级描述")
  private String desc = null;

  @ApiModelProperty(value = "等级程度")
  private String degree;

  @ApiModelProperty(value = "等级所属领域")
  private Career career = null;


  /**
   * 主键
   **/
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * 等级显示名称
   **/
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * 等级描述
   **/
  public String getDesc() {
    return desc;
  }

  public void setDesc(String desc) {
    this.desc = desc;
  }

  /**
   * 等级所属领域
   **/
  public Career getCareer() {
    return career;
  }

  public void setCareer(Career career) {
    this.career = career;
  }

  public String getDegree() {
    return degree;
  }

  public void setDegree(String degree) {
    this.degree = degree;
  }
}
