package io.unreach;

import io.unreach.util.JWTUtils;
import io.unreach.util.SessionUtil;
import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;

/**
 * 处理用户解析逻辑
 *
 * @author joe
 * @date 2018/2/23
 */
public class SessionFilter implements Filter {

  private static final Logger logger = LoggerFactory.getLogger(SessionFilter.class);

  // cookie 的 名称
  @Value("${session_cookie_name:JSESSIONID}")
  private String cookieName;

  @Override
  public void init(FilterConfig filterConfig) throws ServletException {
  }

  @Override
  public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
      throws IOException, ServletException {
    HttpServletRequest req = (HttpServletRequest) request;
    HttpServletResponse res = (HttpServletResponse) response;
    String token = null;
    if (req.getCookies() != null) {
      for (Cookie cookie : req.getCookies()) {
        if (cookie.getName().equals(cookieName)) {
          token = cookie.getValue();
        }
      }
    }
    if (token != null) {
      // TODO  需要加一个 cache
      String accountId = JWTUtils.parseJWT(token);
      try {
        SessionUtil.setAccountId(accountId);
        chain.doFilter(request, response);
      } catch (Exception e) {
        logger.error("", e);
      } finally {
        SessionUtil.clear();
      }
    } else {
      chain.doFilter(request, response);
    }
  }

  @Override
  public void destroy() {

  }

}
