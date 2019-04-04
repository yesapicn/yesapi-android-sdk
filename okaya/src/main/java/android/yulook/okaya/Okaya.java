package android.yulook.okaya;

import android.yulook.okaya.net.KeyUtils;

/**
 * 初始化
 * @author yuLook
 */
public class Okaya {

  /**
   * 小白接口初始化 application里
   * 设置key与recrect
   * @param key key
   * @param secrect secrect
   * @param adminUuid 管理员的uuid 上传公共数据时标识为此人 查询时使用
   */
  public static void init(String key,String secrect,String adminUuid){
    KeyUtils.OKAYAAPI_KEY=key;
    KeyUtils.OKAYAAPI_SECRECT=secrect;
    KeyUtils.OKAYAPI_BASE_UUID=adminUuid;

  }

}
