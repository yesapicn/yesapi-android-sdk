package android.yulook.okaya.entity;

public class MineBean {

  /**
   * ret : 200
   * data : {"err_code":0,"err_msg":"","ext_info":{"nickname":"dogstar","age":19,"location":"广州"}}
   * msg :
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
     * ext_info : {"nickname":"dogstar","age":19,"location":"广州"}
     */

    private int err_code;
    private String err_msg;
    private ExtInfoBean ext_info;

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

    public ExtInfoBean getExt_info() {
      return ext_info;
    }

    public void setExt_info(ExtInfoBean ext_info) {
      this.ext_info = ext_info;
    }

    public static class ExtInfoBean {
      /**
       * nickname : dogstar
       * age : 19
       * location : 广州
       */

      private String nickname;
      private int age;
      private String location;
      private String headUrl;
      private String token;

      public String getToken() {
        return token;
      }

      public void setToken(String token) {
        this.token = token;
      }

      public String getHeadUrl() {
        return headUrl;
      }

      public void setHeadUrl(String headUrl) {
        this.headUrl = headUrl;
      }

      public String getNickname() {
        return nickname;
      }

      public void setNickname(String nickname) {
        this.nickname = nickname;
      }

      public int getAge() {
        return age;
      }

      public void setAge(int age) {
        this.age = age;
      }

      public String getLocation() {
        return location;
      }

      public void setLocation(String location) {
        this.location = location;
      }
    }
  }
}
