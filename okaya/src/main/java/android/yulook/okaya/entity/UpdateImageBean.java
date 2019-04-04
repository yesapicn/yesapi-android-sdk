package android.yulook.okaya.entity;

public class UpdateImageBean {
  /**
   * ret : 200
   * data : {"err_code":0,"err_msg":"","url":"http://owl18g37a.bkt.clouddn.com/20180908150929_225b39e318b492f17e3826e1a8145760.png"}
   * msg : 当前请求接口：App.CDN.UploadImg
   */

  private int ret;
  private DataBean data;
  private String msg;

  public int getRet() {
    return ret;
  }

  public void setRet(int ret) {
    this.ret = ret;
  }

  public DataBean getData() {
    return data;
  }

  public void setData(DataBean data) {
    this.data = data;
  }

  public String getMsg() {
    return msg;
  }

  public void setMsg(String msg) {
    this.msg = msg;
  }

  public static class DataBean {
    /**
     * err_code : 0
     * err_msg :
     * url : http://owl18g37a.bkt.clouddn.com/20180908150929_225b39e318b492f17e3826e1a8145760.png
     */

    private int err_code;
    private String err_msg;
    private String url;

    public int getErr_code() {
      return err_code;
    }

    public void setErr_code(int err_code) {
      this.err_code = err_code;
    }

    public String getErr_msg() {
      return err_msg;
    }

    public void setErr_msg(String err_msg) {
      this.err_msg = err_msg;
    }

    public String getUrl() {
      return url;
    }

    public void setUrl(String url) {
      this.url = url;
    }
  }
}
