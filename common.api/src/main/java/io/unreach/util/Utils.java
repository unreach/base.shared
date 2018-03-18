package io.unreach.util;

/**
 * 工具类
 * @author joe
 * @date 2018/3/18
 */
public class Utils {

  /**
   * 判断host是否是一个ip
   */
  public static boolean isIp(String IP) {
    boolean b = false;
    if (IP.matches("\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}")) {
      String s[] = IP.split("\\.");
      try {
        if (Integer.parseInt(s[0]) < 255) {
          if (Integer.parseInt(s[1]) < 255) {
            if (Integer.parseInt(s[2]) < 255) {
              if (Integer.parseInt(s[3]) < 255) {
                b = true;
              }
            }
          }
        }
      } catch (Exception e) {
        return false;
      }
    }
    return b;
  }


}
