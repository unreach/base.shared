package io.unreach.base.model;

import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * 分页数据模型
 *
 * @author joe
 * @date 2018.1.16
 */
public class PagingData<T> {

  private Integer totalItems = null;

  private Integer totalPages = null;

  private Integer pageSize = 10;

  private Integer currentPage = 1;

  private List<T> data = null;

  /**
   * 总记录数
   * @return totalItems
   **/
  @ApiModelProperty(value = "总记录数")
  public Integer getTotalItems() {
    return totalItems;
  }

  public void setTotalItems(Integer totalItems) {
    this.totalItems = totalItems;
  }

  /**
   * 总页面数
   * @return totalPages
   **/
  @ApiModelProperty(value = "总页面数")
  public Integer getTotalPages() {
    return totalPages;
  }

  public void setTotalPages(Integer totalPages) {
    this.totalPages = totalPages;
  }

  /**
   * 一页大小
   * @return pageSize
   **/
  @ApiModelProperty(value = "一页大小")
  public Integer getPageSize() {
    return pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  /**
   * 当前页数
   * @return currentPage
   **/
  @ApiModelProperty(value = "当前页数")
  public Integer getCurrentPage() {
    return currentPage;
  }

  public void setCurrentPage(Integer currentPage) {
    this.currentPage = currentPage;
  }

  /**
   * 获取数据
   * @return data
   **/
  @ApiModelProperty(value = "获取集合数据")
  public List<T> getData() {
    return data;
  }

  public void setData(List<T> data) {
    this.data = data;
  }

  /**
   * 添加记录
   * @param t
   * @return
   */
  public PagingData addData(T t){
      if(this.data==null){
        this.data = new ArrayList<>();
      }
      this.data.add(t);
      return this;
  }
}
