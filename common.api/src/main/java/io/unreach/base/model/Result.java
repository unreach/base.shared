package io.unreach.base.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 结果模型
 */
@ApiModel(description = "结果模型")
public class Result<T> {

  @JsonProperty("isSuccess")
  private Boolean isSuccess = false;

  @JsonProperty("code")
  private String code = null;

  @JsonProperty("message")
  private String message = null;

  private T data = null;

  public Result isSuccess(Boolean isSuccess) {
    this.isSuccess = isSuccess;
    return this;
  }

  /**
   * 是否成功
   *
   * @return isSuccess
   **/
  @ApiModelProperty(value = "是否成功")

  public Boolean isIsSuccess() {
    return isSuccess;
  }

  public void setIsSuccess(Boolean isSuccess) {
    this.isSuccess = isSuccess;
  }

  public Result code(String code) {
    this.code = code;
    return this;
  }

  /**
   * 返回code，isSuccess为true时，该值为空
   *
   * @return code
   **/
  @ApiModelProperty(value = "返回code，isSuccess为true时，该值为空")

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public Result message(String message) {
    this.message = message;
    return this;
  }

  /**
   * 消息内容，isSuccess为true时，该值为空
   *
   * @return message
   **/
  @ApiModelProperty(value = "消息内容，isSuccess为true时，该值为空")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }


  /**
   * 返回内容，由业务自行传递对象
   *
   * @return message
   **/
  @ApiModelProperty(value = "返回内容，由业务自行传递对象")
  public T getData() {
    return data;
  }

  public void setData(T data) {
    this.data = data;
  }

  /**
   * 设置data数据
   * @param data
   * @return
   */
  public Result<T> data(T data) {
    this.setData(data);
    return this;
  }
}

