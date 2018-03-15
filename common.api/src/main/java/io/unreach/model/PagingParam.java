package io.unreach.model;

import io.swagger.annotations.ApiModelProperty;

/**
 * 分页请求模型
 *
 * @author joe
 * @date 2018.1.18
 */
public class PagingParam {

  @ApiModelProperty(value = "一页大小")
  protected Integer pageSize = 10;

  @ApiModelProperty(value = "当前页数")
  protected Integer currentPage = 1;

  /**
   * 一页大小
   *
   * @return pageSize
   **/

  public Integer getPageSize() {
    return pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  /**
   * 当前页数
   *
   * @return currentPage
   **/
  public Integer getCurrentPage() {
    return currentPage;
  }

  public void setCurrentPage(Integer currentPage) {
    this.currentPage = currentPage;
  }

}
