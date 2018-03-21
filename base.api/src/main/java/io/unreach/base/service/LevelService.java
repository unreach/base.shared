package io.unreach.base.service;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.unreach.Constants;
import io.unreach.base.model.Level;
import io.unreach.model.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author chuanming.song
 */
@Api(tags = Constants.SERVICE, description = "查询级别信息") public interface LevelService {
	/**
	 * 查询level
	 */
	@ApiOperation(value = "通过id查询级别信息")
	@RequestMapping(value = "/service/getLevelById", method = RequestMethod.GET) @ResponseBody
	Result<Level> getLevelById(String levelId);
}
