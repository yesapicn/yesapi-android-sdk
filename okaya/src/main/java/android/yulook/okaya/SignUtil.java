package android.yulook.okaya;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * 签名Utils
 * @author yulook
 */
public class SignUtil {

  /**
   * MD5签名
   * @param str 需要签名的字符串
   * @param isUpper 是否大写
   * @return 签名后字符串（大写）
   */
  public static String signMd5(String str,boolean isUpper){
    MessageDigest md5;

    try {
      md5 = MessageDigest.getInstance("MD5");
      byte[] bytes = md5.digest(str.getBytes());
      StringBuilder result = new StringBuilder();
      for (byte b : bytes) {
        String temp = Integer.toHexString(b & 0xff);
        if (temp.length() == 1) {
          temp = "0" + temp;
        }
        result.append(temp);
      }
      return isUpper?result.toString().toUpperCase():result.toString();
    } catch (NoSuchAlgorithmException e) {
      e.printStackTrace();
    }
    return "";
  }

}
