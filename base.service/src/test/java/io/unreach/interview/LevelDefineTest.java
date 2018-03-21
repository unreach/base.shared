package io.unreach.interview;

import static org.assertj.core.api.Assertions.assertThat;

import com.google.gson.Gson;
import io.unreach.interview.process.LevelDefineFactory;
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
    Gson gson = new Gson();
  @Autowired LevelDefineFactory factory;

  @Test
  public void testDefines(){
    System.out.println(gson.toJson(factory.getProcessList()));
  }

}
