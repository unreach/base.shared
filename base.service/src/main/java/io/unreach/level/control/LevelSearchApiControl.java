package io.unreach.level.control;

import io.unreach.base.api.LevelSearchApi;
import io.unreach.base.model.Level;
import io.unreach.level.helper.LevelDefineFactory;
import io.unreach.model.Result;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author zhoufan
 * @date 2018/3/21
 */
@Controller
public class LevelSearchApiControl implements LevelSearchApi{

  @Autowired
  LevelDefineFactory levelDefineFactory;

  @Override
  public Result<List<Level>> search() {
    Result<List<Level>> listResult = new Result<>();
    listResult.setIsSuccess(true);
    listResult.setData(levelDefineFactory.getLevelDefineModelList());
    return listResult;
  }

}
