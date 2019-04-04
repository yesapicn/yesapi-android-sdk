package android.yulook.okaya;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.yulook.okaya.entity.LoginBean;
import android.yulook.okaya.net.ApiSign;
import android.yulook.okaya.net.KeyUtils;
import android.yulook.okaya.net.OkayaHelper;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import java.util.HashMap;

/**
 * 举例
 * @author yulook
 */
public class MainActivity extends AppCompatActivity {

  @Override protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);


    //网络请求  模拟登陆请求

    //先设置参数
    HashMap<String, String> keyMap = new HashMap<>(5);
    //密码要是32位的这里进行MD5加密 正好返回32位的 目测官方就是这么考虑的
    keyMap.put("password", SignUtil.signMd5("这里是密码（任意长度）",false));
    keyMap.put("username", "这是用户名");

    //网络框架采用的是 RxJava+Retrofit 不了解的可以捎带着看下 目前很流行的网络请求框架
    //我这里也是对他的封装 都是很基本的封装 也是参考别人的 反正不懂就百度
    OkayaHelper.getInstance().getService().okayapiLogin(
        //这里是对数据进行加密重组 可以看下
        //拼接请求的公共字段 app_key, s ,sign
        ApiSign.getInstance().getSignOfMap(keyMap, KeyUtils.OKA_LOGIN)
    )
        .subscribeOn(Schedulers.io())
        .unsubscribeOn(Schedulers.io())
        .observeOn(AndroidSchedulers.mainThread())
        .subscribe(new Observer<LoginBean>() {
          @Override public void onSubscribe(Disposable d) {
            // 请求完成会自动断开 执行  d.dispose(); 无需操作
            // 拿到他可以控制网络请求的断开 比如网络环境不好请求未返回 但是用户又退出界面了 可以执行d.dispose(); 自己来断开请求

          }

          @Override public void onNext(LoginBean bean) {
            //登陆后的逻辑处理 这里是主线程
          }

          @Override public void onError(Throwable e) {
            // 请求出错会自动断开 执行  d.dispose(); 无需操作
            //可以在这里做一些错误提示 比如Toast 这里是主线程
          }

          @Override public void onComplete() {

          }
        });

  }
}
