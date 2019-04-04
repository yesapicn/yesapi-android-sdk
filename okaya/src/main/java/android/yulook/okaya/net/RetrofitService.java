package android.yulook.okaya.net;

import android.yulook.okaya.entity.CardInfoBean;
import android.yulook.okaya.entity.CardListBean;
import android.yulook.okaya.entity.LoginBean;
import android.yulook.okaya.entity.MineBean;
import android.yulook.okaya.entity.RegisterBean;
import android.yulook.okaya.entity.UpdateImageBean;
import android.yulook.okaya.entity.UserBean;
import io.reactivex.Observable;
import java.util.List;
import java.util.Map;
import okhttp3.MultipartBody;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.QueryMap;

/**
 * @author android
 */
public interface RetrofitService {

  /**
   * 1小白接口-登陆
   * @param map 接口字段
   * @return Observable
   */
  @POST("/")
  Observable<LoginBean> okayapiLogin(@QueryMap Map<String, String> map);

  /**
   * 2小白接口-注册
   * @param map 接口字段
   * @return Observable
   */
  @POST("/")
  Observable<RegisterBean> okayapiRegister(@QueryMap Map<String, String> map);

  /**
   * 3小白接口-上传图片
   * @param partLis 表单
   * @return Observable
   */
  @Multipart
  @POST("/")
  Observable<UpdateImageBean> okayapiUpdateImage(@Part List<MultipartBody.Part> partLis);

  /**
   * 4小白接口-获取个人资料
   * @param map 接口字段
   * @return Observable
   */
  @FormUrlEncoded
  @POST("/")
  Observable<UserBean> okayapiGetUserInfo(@FieldMap Map<String, String> map);

  /**
   * 5小白接口-上传个人资料
   * @param map 接口字段
   * @return Observable
   */
  @FormUrlEncoded
  @POST("/")
  Observable<MineBean> okayapiUpdateUserInfo(@FieldMap Map<String, String> map);



  //自定义数据模型

  /**
   * 查询所有牌的基础数据
   * @param map
   * @return
   */
  @POST("/")
  Observable<CardListBean> okayapiQueryCardList(@QueryMap Map<String, String> map);

  /**
   * 查询卡牌详情
   * @param map
   * @return
   */
  @POST("/")
  Observable<CardInfoBean> okayapiQueryCardInfo(@QueryMap Map<String, String> map);

}
