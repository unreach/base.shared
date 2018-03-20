package io.unreach;

import org.springframework.beans.factory.annotation.Autowired;
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

  @Autowired
  private SessionFilter sessionFilter;
  @Autowired
  private ApiOriginFilter apiOriginFilter;

  @Bean
  public FilterRegistrationBean apiOriginFilter() {
    FilterRegistrationBean registration = new FilterRegistrationBean();
    registration.setFilter(apiOriginFilter);
    registration.addUrlPatterns("/*");
    registration.setName("ApiOriginFilter");

    registration.setOrder(1);
    return registration;
  }

  @Bean
  public FilterRegistrationBean sessionFilter() {
    FilterRegistrationBean registration = new FilterRegistrationBean();
    registration.setFilter(sessionFilter);
    registration.addUrlPatterns("/*");
    registration.setName("SessionFilter");
    registration.setOrder(2);
    return registration;
  }

  @Bean
  public ApiOriginFilter initApi() {
    return new ApiOriginFilter();
  }

  @Bean
  public SessionFilter initSession() {
    return new SessionFilter();
  }

}
