package io.unreach.base.model;


import io.swagger.annotations.ApiModel;

/**
 * 职业
 *
 * @author joe
 * @date 2018/1/18
 */
@ApiModel(description = "职业枚举")
public enum Career {

  be("Java"), fe("前端"), fs("全栈"), dp("DevOps"), ac("架构师"), bd("大数据"), ai("人工智能"), ml("机器学习");

  private String name;

  private Career(String name) {
    this.name = name;
  }

  public static Career getCareer(String name) {
    for (Career career : Career.values()) {
      if (career.name.equals(name)) {
        return career;
      }
    }
    return null;
  }

}
