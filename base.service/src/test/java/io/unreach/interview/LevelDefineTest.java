package io.unreach.interview;

import static org.assertj.core.api.Assertions.assertThat;

import io.unreach.base.model.Level;
import io.unreach.base.service.LevelService;
import io.unreach.level.helper.LevelDefineFactory;

import java.util.List;

import io.unreach.model.Result;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * @author zhoufan
 * @date 2018/3/19
 */
@RunWith(SpringRunner.class) @SpringBootTest(classes = TestApplication.class) @WebAppConfiguration
public class LevelDefineTest {
	@Autowired LevelDefineFactory factory;
	@Autowired LevelService levelService;

	@Test public void testDefines() {
		List<Level> result = factory.getLevelDefineModelList();
		assertThat(result.size() > 0);
	}

	@Test public void testLevel() {
		Result<Level> result = levelService.getLevelById("2");
		assertThat(result.getData() != null);
	}
}
