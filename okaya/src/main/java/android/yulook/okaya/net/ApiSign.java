package android.yulook.okaya.net;

import android.util.Log;
import android.yulook.okaya.SignUtil;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/**
 * 接口字段签名
 * @author android
 */
public class ApiSign {

  private volatile static ApiSign signUtil=null;
  private final StringBuffer stringBuffer;

  /**
   * 获取ApiSign的单例
   * @return ApiSign
   */
  public static ApiSign getInstance(){
    if(signUtil==null){
      synchronized (ApiSign.class){
        if(signUtil==null){
          signUtil=new ApiSign();
        }
      }
    }
    return signUtil;
  }

  private ApiSign() {
    stringBuffer=new StringBuffer();
  }

  /**
   * 对map里的key进行字典排序后拼接value加密 获得的字段添加进map里并返回
   * @param map map
   * @param s 小白接口名字
   * @return map
   */
  public HashMap<String, String> getSignOfMap(HashMap<String,String> map,String s){
    map.put("app_key",KeyUtils.OKAYAAPI_KEY);
    map.put("s", s);

    //对map的key进行字典排序
    Collection<String> keySet= map.keySet();
    List<String> list=new ArrayList<>(keySet);
    Collections.sort(list);
    //清空buffer
    stringBuffer.setLength(0);
    //拼接value
    for(int i=0;i<list.size();i++){
      stringBuffer.append(map.get(list.get(i)));
    }
    //进行md5加密
    String sign= SignUtil.signMd5(stringBuffer.toString()+KeyUtils.OKAYAAPI_SECRECT,true);
    Log.d("====getSignOfMap",sign);
    map.put("sign",sign);
    return map;
  }

  /**
   * 返回加密后的字符串
   * @param map map
   * @param s 小白接口名字
   * @return string
   */
  public String getSignStr(HashMap<String,String> map,String s){
    map.put("app_key",KeyUtils.OKAYAAPI_KEY);
    map.put("s", s);

    Collection<String> keySet= map.keySet();
    List<String> list=new ArrayList<>(keySet);
    Collections.sort(list);
    stringBuffer.setLength(0);
    for(int i=0;i<list.size();i++){
      stringBuffer.append(map.get(list.get(i)));
    }
    String sign=SignUtil.signMd5(stringBuffer.toString()+KeyUtils.OKAYAAPI_SECRECT,true);
    Log.d("====getSignOfMap",sign);
    return sign;
  }

}
