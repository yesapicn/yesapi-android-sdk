package android.yulook.okaya.net;

import android.yulook.okaya.BuildConfig;
import com.google.gson.GsonBuilder;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * @author android
 */
public class OkayaHelper {

  private final Retrofit mRetrofit;
  private volatile static OkayaHelper retrofitHelper=null;

  public static OkayaHelper getInstance(){
    if(retrofitHelper==null){
      synchronized (OkayaHelper.class){
        if(retrofitHelper==null){
          retrofitHelper=new OkayaHelper();
        }
      }
    }
    return retrofitHelper;
  }

  private OkayaHelper() {
    OkHttpClient.Builder builder = new OkHttpClient().newBuilder();
    if(BuildConfig.DEBUG){
      builder.addInterceptor(new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY));
    }
    mRetrofit = new Retrofit.Builder()
        .baseUrl("http://hn1.api.okayapi.com/")
        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
        .addConverterFactory(GsonConverterFactory.create(new GsonBuilder().create()))
        .client(builder.build())
        .build();

  }

  public RetrofitService getService(){
    return mRetrofit.create(RetrofitService.class);
  }

}
