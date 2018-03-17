package io.unreach.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.context.request.ServletWebRequest;

/**
 * Servlet 相关工具
 *
 * @author joe
 * @date 2018/3/18
 */
public class ServletUtil {

  /**
   * 获取spring的request
   * @return
   */
  public static HttpServletRequest getRequest() {
    return ((ServletRequestAttributes)
        RequestContextHolder.getRequestAttributes()).getRequest();
  }

  /**
   * 获取spring的response
   * @return
   */
  public static HttpServletResponse getResponse() {
    return new ServletWebRequest(((ServletRequestAttributes)
        RequestContextHolder.getRequestAttributes()).getRequest()).getResponse();
  }


}
