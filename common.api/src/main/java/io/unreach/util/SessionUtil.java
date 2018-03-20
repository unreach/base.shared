package io.unreach.util;

/**
 * Session工具类
 *
 * @author joe
 * @date 2018/3/20
 */
public class SessionUtil {

  private static final ThreadLocal<String> account = new ThreadLocal<>();

  /**
   * 获取账户id
   */
  public static String getAccountId() {
    return account.get();
  }


  /**
   * 设定AccountID
   */
  public static void setAccountId(String accountId) {
    account.set(accountId);
  }

  /**
   * 清楚AccountId
   */
  public static void clear() {
    account.remove();
  }

}
