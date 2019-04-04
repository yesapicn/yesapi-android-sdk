package android.yulook.okaya.entity;

import com.google.gson.JsonObject;
import java.util.List;
import java.util.Map;

public class CardListBean {

  /**
   * ret : 200
   * data : {"err_code":"0","err_msg":"","total":"78","list":{"0":{"id":"1","uuid":"A336C59B4831D6E0FAA6B451FAECC9C5","add_time":"2018-09-14 11:11:03","update_time":{},"ext_data":{},"card_url":"http://www.tarot5.cn/photo/tarotphoto/72/king-pentacles.jpg","card_name_china":"星币国王","card_name_us":"King Of Pentacles","card_meaning":"","card_meaning_unscramble":"","card_meaning_unscramble_1":""},"1":{"id":"2","uuid":"A336C59B4831D6E0FAA6B451FAECC9C5","add_time":"2018-09-14 11:12:56","update_time":{},"ext_data":{},"card_url":"http://www.tarot5.cn/photo/tarotphoto/72/queen-pentacles.jpg","card_name_china":"星币王后","card_name_us":"Queen Of Pentacles","card_meaning":"","card_meaning_unscramble":"","card_meaning_unscramble_1":""},"2":{"id":"3","uuid":"A336C59B4831D6E0FAA6B451FAECC9C5","add_time":"2018-09-14 11:14:02","update_time":{},"ext_data":{},"card_url":"http://www.tarot5.cn/photo/tarotphoto/72/knight-pentacles.jpg","card_name_china":"星币骑士","card_name_us":"Knight Of Pentacles","card_meaning":"","card_meaning_unscramble":"","card_meaning_unscramble_1":""},"3":{"id":"4","uuid":"A336C59B4831D6E0FAA6B451FAECC9C5","add_time":"2018-09-14 11:14:38","update_time":"2018-09-14 11:18:35","ext_data":{},"card_url":"http://www.tarot5.cn/photo/tarotphoto/72/page-pentacles.jpg","card_name_china":"星币侍从","card_name_us":"Page Of Pentacles","card_meaning":"","card_meaning_unscramble":"","card_meaning_unscramble_1":""},"4":{"id":"5","uuid":"A336C59B4831D6E0FAA6B451FAECC9C5","add_time":"2018-09-14 11:15:19","update_time":"2018-09-14 11:19:18","ext_data":{},"card_url":"http://www.tarot5.cn/photo/tarotphoto/72/ten-pentacles.jpg","card_name_china":"星币十","card_name_us":"Ten Of Pentacles","card_meaning":"","card_meaning_unscramble":"","card_meaning_unscramble_1":""}}}
   * msg : 当前请求接口：App.Table.FreeQuery
   */

  private String ret;
  private DataBean data;
  private String msg;

  public String getRet() {
    return ret;
  }

  public void setRet(String ret) {
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

  public static class DataBean{
    private String error_code;
    private String err_msg;
    private List<CardItem> list;

    public String getError_code() {
      return error_code;
    }

    public void setError_code(String error_code) {
      this.error_code = error_code;
    }

    public String getErr_msg() {
      return err_msg;
    }

    public void setErr_msg(String err_msg) {
      this.err_msg = err_msg;
    }

    public List<CardItem> getList() {
      return list;
    }

    public void setList(List<CardItem> list) {
      this.list = list;
    }
  }


  public static class CardItem{

    private String id,uuid,card_url,card_name_china,card_name_us;

    public String getId() {
      return id;
    }

    public void setId(String id) {
      this.id = id;
    }

    public String getUuid() {
      return uuid;
    }

    public void setUuid(String uuid) {
      this.uuid = uuid;
    }

    public String getCard_url() {
      return card_url;
    }

    public void setCard_url(String card_url) {
      this.card_url = card_url;
    }

    public String getCard_name_china() {
      return card_name_china;
    }

    public void setCard_name_china(String card_name_china) {
      this.card_name_china = card_name_china;
    }

    public String getCard_name_us() {
      return card_name_us;
    }

    public void setCard_name_us(String card_name_us) {
      this.card_name_us = card_name_us;
    }
  }

}
