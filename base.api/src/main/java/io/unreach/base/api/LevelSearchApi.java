package io.unreach.base.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import io.unreach.Constants;
import io.unreach.base.model.Level;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 等级查询服务
 *
 * @author joe
 * @date 2018/3/15
 */
@Api(tags = Constants.API)
public interface LevelSearchApi {

  /**
   * 查询所有的等级数据
   */
  @ApiOperation(value = "查询等级数据")
  @RequestMapping(value = "/api/levelsearch", method = RequestMethod.GET, produces = {
      "application/json"})
  @ResponseBody
  public List<Level> search();

}
