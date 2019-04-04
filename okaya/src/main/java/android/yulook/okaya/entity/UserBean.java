package android.yulook.okaya.entity;


public class UserBean {

  /**
   * ret : 200
   * data : {"err_code":0,"err_msg":"","info":{"uuid":"A336C59B4831D6E0FAA6B451FAECC9C5","username":"admin","role":"user","rolename":"普通用户","register_time":"2018-09-05 14:56:13","register_ip":"124.65.159.158","ext_info":{"nickname":"yu","location":"北京","age":15}}}
   * msg : 当前请求接口：App.User.Profile
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
     * info : {"uuid":"A336C59B4831D6E0FAA6B451FAECC9C5","username":"admin","role":"user","rolename":"普通用户","register_time":"2018-09-05 14:56:13","register_ip":"124.65.159.158","ext_info":{"nickname":"yu","location":"北京","age":15}}
     */

    private int err_code;
    private String err_msg;
    private InfoBean info;

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

    public InfoBean getInfo() {
      return info;
    }

    public void setInfo(InfoBean info) {
      this.info = info;
    }

    public static class InfoBean {
      /**
       * uuid : A336C59B4831D6E0FAA6B451FAECC9C5
       * username : admin
       * role : user
       * rolename : 普通用户
       * register_time : 2018-09-05 14:56:13
       * register_ip : 124.65.159.158
       * ext_info : {"nickname":"yu","location":"北京","age":15}
       */

      private String uuid;
      private String username;
      private String role;
      private String rolename;
      private String register_time;
      private String register_ip;
      private MineBean.DataBean.ExtInfoBean ext_info;

      public String getUuid() {
        return uuid;
      }

      public void setUuid(String uuid) {
        this.uuid = uuid;
      }

      public String getUsername() {
        return username;
      }

      public void setUsername(String username) {
        this.username = username;
      }

      public String getRole() {
        return role;
      }

      public void setRole(String role) {
        this.role = role;
      }

      public String getRolename() {
        return rolename;
      }

      public void setRolename(String rolename) {
        this.rolename = rolename;
      }

      public String getRegister_time() {
        return register_time;
      }

      public void setRegister_time(String register_time) {
        this.register_time = register_time;
      }

      public String getRegister_ip() {
        return register_ip;
      }

      public void setRegister_ip(String register_ip) {
        this.register_ip = register_ip;
      }

      public MineBean.DataBean.ExtInfoBean getExt_info() {
        return ext_info;
      }

      public void setExt_info(MineBean.DataBean.ExtInfoBean ext_info) {
        this.ext_info = ext_info;
      }

    }
  }
}
