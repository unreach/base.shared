package io.unreach.base.control;

import io.unreach.base.api.LevelSearchApi;
import io.unreach.base.model.Level;
import java.util.List;
import org.springframework.stereotype.Controller;

/**
 * 等级查询服务的实现
 *
 * @author joe
 * @date 2018/3/15
 */
@Controller
public class LevelSearchApiControl implements LevelSearchApi {

  @Override
  public List<Level> search() {
    return null;
  }
}
