package io.unreach.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

/**
 * Servlet 相关工具
 *
 * @author joe
 * @date 2018/3/18
 */
public class ServletUtil {

  /**
   * 获取spring的request
   */
  public static HttpServletRequest getRequest() {
    return ((ServletRequestAttributes)
        RequestContextHolder.getRequestAttributes()).getRequest();
  }

  /**
   * 获取spring的response
   */
  public static HttpServletResponse getResponse() {
    return ((ServletRequestAttributes)
        RequestContextHolder.getRequestAttributes()).getResponse();
  }


}
