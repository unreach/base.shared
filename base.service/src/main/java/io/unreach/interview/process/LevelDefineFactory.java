package io.unreach.interview.process;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.unreach.base.model.Level;
import io.unreach.interview.model.InterviewProcess;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author zhoufan
 * @date 2018/3/19 进度定义工厂
 */
@Component
@ConfigurationProperties(prefix = "process")
public class LevelDefineFactory {

  private static final Logger logger = LoggerFactory
      .getLogger(LevelDefineFactory.class);

  @Autowired
  ObjectMapper mapper;

  private List<Map<String, String>> levelList = new ArrayList<>();

  private List<Level> interviewLevelList;

  public List<Map<String, String>> getProcessList() {
    return levelList;
  }

  public void setProcessList(List<Map<String, String>> processList) {
    this.levelList = processList;
  }

  /**
   * 获取所有InterviewProcess定义模型
   *
   * @return InterviewProcess定义数组
   */
  public List<Level> getLevelDefineModelList() {
    if (null == this.interviewLevelList) {
      this.interviewLevelList = new ArrayList<>();
      for (Map<String, String> process : this.levelList) {
        Level level = mapper.convertValue(process, Level.class);
        this.interviewLevelList.add(level);
      }
    }
    return this.interviewLevelList;
  }

  /**
   * 根据id获取进度的Level模型
   *
   * @param id 进度类型
   * @return 进度Id
   */
  public Level getLevel(String id) {
    List<Level> processList = this.interviewLevelList;
    for (Level level : processList) {
      if (level.getId().equals(id)) {
        return level;
      }
    }
    logger.error("cannot find process id with action: " + processList);
    return null;
  }
}
