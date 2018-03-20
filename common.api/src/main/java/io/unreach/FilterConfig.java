package io.unreach;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 配置filter
 *
 * @author joe
 * @date 2018/3/20
 */
@Configuration
public class FilterConfig {

  @Bean
  public FilterRegistrationBean apiOriginFilter() {
    FilterRegistrationBean registration = new FilterRegistrationBean();
    registration.setFilter(new ApiOriginFilter());
    registration.addUrlPatterns("/*");
    registration.setName("ApiOriginFilter");
    registration.setOrder(1);
    return registration;
  }

  @Bean
  public FilterRegistrationBean sessionFilter() {
    FilterRegistrationBean registration = new FilterRegistrationBean();
    registration.setFilter(new SessionFilter());
    registration.addUrlPatterns("/*");
    registration.setName("SessionFilter");
    registration.setOrder(2);
    return registration;
  }

}
