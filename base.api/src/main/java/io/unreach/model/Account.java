package io.unreach.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 账户模型
 *
 * @author joe
 * @date 2018/1/17
 */
@ApiModel(description = "账户模型")
public class Account {

  private String id = null;

  private String name = null;

  private String mobile = null;

  /**
   * 主键
   **/
  @ApiModelProperty(value = "主键")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * 名称
   **/
  @ApiModelProperty(value = "名称")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * 手机号码
   **/
  @ApiModelProperty(value = "手机号码")
  public String getMobile() {
    return mobile;
  }

  public void setMobile(String mobile) {
    this.mobile = mobile;
  }
}
