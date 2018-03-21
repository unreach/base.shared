package io.unreach.interview;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author zhoufan
 * @date 2018/3/19
 */
@SpringBootApplication
@ComponentScan({"io.unreach.*.control", "io.unreach.*.helper", "io.unreach.*.serviceImpl"})
public class TestApplication {

}
