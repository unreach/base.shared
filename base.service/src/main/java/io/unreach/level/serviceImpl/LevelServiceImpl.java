package io.unreach.level.serviceImpl;

import io.unreach.base.model.Level;
import io.unreach.base.service.LevelService;
import io.unreach.level.helper.LevelDefineFactory;
import io.unreach.model.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service public class LevelServiceImpl implements LevelService {
	@Autowired private LevelDefineFactory levelDefineFactory;

	@Override public Result<Level> getLevelById(String levelId) {
		Result<Level> result = new Result<>();
		result.setIsSuccess(true);
		Level level = levelDefineFactory.getLevel(levelId);
		result.setData(level);
		return result;
	}
}
