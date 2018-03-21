package io.unreach.interview;

import io.unreach.base.model.Level;
import io.unreach.level.helper.LevelDefineFactory;
import java.util.List;
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
@RunWith(SpringRunner.class)
@SpringBootTest(classes = TestApplication.class)
@WebAppConfiguration
public class LevelDefineTest {
  @Autowired LevelDefineFactory factory;

  @Test
  public void testDefines(){
    List<Level> result = factory.getLevelDefineModelList();
    System.out.println("123123");
  }

}
