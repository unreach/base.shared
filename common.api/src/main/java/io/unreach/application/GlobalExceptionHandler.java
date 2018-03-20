package io.unreach.application;

import io.unreach.model.Result;
import javax.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 处理异常
 */
@ControllerAdvice
public class GlobalExceptionHandler {

  private final static Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

  @ExceptionHandler(value = Exception.class)
  @ResponseBody
  public Result jsonErrorHandler(HttpServletRequest req, Exception e) throws Exception {
    Result result = new Result();
    result.setMessage(e.getMessage());
    logger.error("", e);
    return result;
  }

}
