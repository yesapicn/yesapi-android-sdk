package android.yulook.okaya.entity;

public class LoginBean {

  /**
   * ret : 200
   * data : {"err_code":"0","err_msg":"","uuid":"B36C19064647318AD8A622B5FFFBC900","token":"9FBAEFB6AF0A21F0094F0939848317011A20594FD9F2A514A9383286836FF821"}
   * msg : 当前请求接口：App.User.Login
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
     * uuid : B36C19064647318AD8A622B5FFFBC900
     * token : 9FBAEFB6AF0A21F0094F0939848317011A20594FD9F2A514A9383286836FF821
     */

    private int err_code;
    private String err_msg;
    private String uuid;
    private String token;

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

    public String getUuid() {
      return uuid;
    }

    public void setUuid(String uuid) {
      this.uuid = uuid;
    }

    public String getToken() {
      return token;
    }

    public void setToken(String token) {
      this.token = token;
    }
  }
}
