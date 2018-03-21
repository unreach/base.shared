package io.unreach.level.helper;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.unreach.base.model.Level;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Service;

/**
 * @author zhoufan
 * @date 2018/3/19 进度定义工厂
 */
@Service @ConfigurationProperties(prefix = "level") public class LevelDefineFactory {

	private static final Logger logger = LoggerFactory.getLogger(LevelDefineFactory.class);

	@Autowired ObjectMapper mapper;

	private List<Map<String, String>> levelList = new ArrayList<>();

	private List<Level> interviewLevelList;

	public List<Map<String, String>> getLevelList() {
		return levelList;
	}

	public void setLevelList(List<Map<String, String>> levelList) {
		this.levelList = levelList;
	}

	/**
	 * 获取所有Level定义模型
	 *
	 * @return level定义数组
	 */
	public List<Level> getLevelDefineModelList() {
		if (null == this.interviewLevelList) {
			this.interviewLevelList = new ArrayList<>();
			for (Map<String, String> levelmap : this.levelList) {
				Level level = mapper.convertValue(levelmap, Level.class);
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
		List<Level> levelList = this.getLevelDefineModelList();
		for (Level level : levelList) {
			if (level.getId().equals(id)) {
				return level;
			}
		}
		logger.error("cannot find level with level id: " + id);
		return null;
	}
}
