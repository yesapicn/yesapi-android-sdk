package android.yulook.okaya.entity;

import android.yulook.okaya.base.BaseBean;
import java.util.List;

public class CardInfoBean extends BaseBean{

  /**
   * ret : 200
   * data : {"err_code":0,"err_msg":"","total":1,"list":[{"id":"1","uuid":"A336C59B4831D6E0FAA6B451FAECC9C5","add_time":"2018-09-18 16:42:30","update_time":"2018-09-18 16:44:15","ext_data":null,"card_id":"78","card_element":"风","card_number":"","card_constellation":"天王星","card_direction":"","card_describe":"这张牌的图案，是一个身着滑稽衣服的人手持白玫瑰，带着随身的行囊快活地站在悬崖边。这是张有点争议的牌，一切都不是很明确，好坏相间，非常容易解错。有人说愚者有颗天真且纯真的心就如同那白色的玫瑰花一样\u2014\u2014那么的自然那么的纯净；也有人说他十分愚蠢，缺乏理性判断的能力，做任何事都凭直觉，没有拒绝和抵抗的能力，就是愚蠢、冲动和虚无的代表","card_positive":"与众不同、幸运、不拘一格、追求新奇的梦想、眼界狭小、勇于冒险、向往自由、有艺术家气质、直攻要害、情感起伏不定、自由恋爱","card_negative":"自负、固执、不安定、墨守成规、缺乏责任心、生活在梦幻中、不现实、不会应变、停滞不前、行为古怪、方向错误、感情不稳定","card_handstand":"牌面倒立时，意味着你在事业上过于自负、固执己见，即使有旁人的劝告都无法让你产生任何的警觉，失去了最关键的机遇，结果只能是事倍功半。感情上近乎执着地编织太多虚幻的梦，与伴侣无法顺利沟通，恋情不安定，感情忽冷忽热","card_meaning":"牌面正立时，意味着你在事业上有一种洒脱、无拘无束的态度，保持着轻松自然的心情迎接未来的挑战。从感情上来说，你即将开始或已经步入一段轻松简单的感情生活，不会如胶似漆，也不会平淡无味。它也可以形容你的伴侣，他（她）是一个难以琢磨的天真的人，喜欢自由生活，不愿被死板的计划和安排所左右","card_keyword":"流浪"}]}
   * msg : 当前请求接口：App.Table.FreeQuery
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
     * total : 1
     * list : [{"id":"1","uuid":"A336C59B4831D6E0FAA6B451FAECC9C5","add_time":"2018-09-18 16:42:30","update_time":"2018-09-18 16:44:15","ext_data":null,"card_id":"78","card_element":"风","card_number":"","card_constellation":"天王星","card_direction":"","card_describe":"这张牌的图案，是一个身着滑稽衣服的人手持白玫瑰，带着随身的行囊快活地站在悬崖边。这是张有点争议的牌，一切都不是很明确，好坏相间，非常容易解错。有人说愚者有颗天真且纯真的心就如同那白色的玫瑰花一样\u2014\u2014那么的自然那么的纯净；也有人说他十分愚蠢，缺乏理性判断的能力，做任何事都凭直觉，没有拒绝和抵抗的能力，就是愚蠢、冲动和虚无的代表","card_positive":"与众不同、幸运、不拘一格、追求新奇的梦想、眼界狭小、勇于冒险、向往自由、有艺术家气质、直攻要害、情感起伏不定、自由恋爱","card_negative":"自负、固执、不安定、墨守成规、缺乏责任心、生活在梦幻中、不现实、不会应变、停滞不前、行为古怪、方向错误、感情不稳定","card_handstand":"牌面倒立时，意味着你在事业上过于自负、固执己见，即使有旁人的劝告都无法让你产生任何的警觉，失去了最关键的机遇，结果只能是事倍功半。感情上近乎执着地编织太多虚幻的梦，与伴侣无法顺利沟通，恋情不安定，感情忽冷忽热","card_meaning":"牌面正立时，意味着你在事业上有一种洒脱、无拘无束的态度，保持着轻松自然的心情迎接未来的挑战。从感情上来说，你即将开始或已经步入一段轻松简单的感情生活，不会如胶似漆，也不会平淡无味。它也可以形容你的伴侣，他（她）是一个难以琢磨的天真的人，喜欢自由生活，不愿被死板的计划和安排所左右","card_keyword":"流浪"}]
     */

    private int err_code;
    private String err_msg;
    private int total;
    private List<ListBean> list;

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

    public int getTotal() {
      return total;
    }

    public void setTotal(int total) {
      this.total = total;
    }

    public List<ListBean> getList() {
      return list;
    }

    public void setList(List<ListBean> list) {
      this.list = list;
    }

    public static class ListBean {
      /**
       * id : 1
       * uuid : A336C59B4831D6E0FAA6B451FAECC9C5
       * add_time : 2018-09-18 16:42:30
       * update_time : 2018-09-18 16:44:15
       * ext_data : null
       * card_id : 78
       * card_element : 风
       * card_number :
       * card_constellation : 天王星
       * card_direction :
       * card_describe : 这张牌的图案，是一个身着滑稽衣服的人手持白玫瑰，带着随身的行囊快活地站在悬崖边。这是张有点争议的牌，一切都不是很明确，好坏相间，非常容易解错。有人说愚者有颗天真且纯真的心就如同那白色的玫瑰花一样——那么的自然那么的纯净；也有人说他十分愚蠢，缺乏理性判断的能力，做任何事都凭直觉，没有拒绝和抵抗的能力，就是愚蠢、冲动和虚无的代表
       * card_positive : 与众不同、幸运、不拘一格、追求新奇的梦想、眼界狭小、勇于冒险、向往自由、有艺术家气质、直攻要害、情感起伏不定、自由恋爱
       * card_negative : 自负、固执、不安定、墨守成规、缺乏责任心、生活在梦幻中、不现实、不会应变、停滞不前、行为古怪、方向错误、感情不稳定
       * card_handstand : 牌面倒立时，意味着你在事业上过于自负、固执己见，即使有旁人的劝告都无法让你产生任何的警觉，失去了最关键的机遇，结果只能是事倍功半。感情上近乎执着地编织太多虚幻的梦，与伴侣无法顺利沟通，恋情不安定，感情忽冷忽热
       * card_meaning : 牌面正立时，意味着你在事业上有一种洒脱、无拘无束的态度，保持着轻松自然的心情迎接未来的挑战。从感情上来说，你即将开始或已经步入一段轻松简单的感情生活，不会如胶似漆，也不会平淡无味。它也可以形容你的伴侣，他（她）是一个难以琢磨的天真的人，喜欢自由生活，不愿被死板的计划和安排所左右
       * card_keyword : 流浪
       */

      private String id;
      private String uuid;
      private String add_time;
      private String update_time;
      private Object ext_data;
      private String card_id;
      private String card_element;
      private String card_number;
      private String card_constellation;
      private String card_direction;
      private String card_describe;
      private String card_positive;
      private String card_negative;
      private String card_handstand;
      private String card_meaning;
      private String card_keyword;

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

      public String getAdd_time() {
        return add_time;
      }

      public void setAdd_time(String add_time) {
        this.add_time = add_time;
      }

      public String getUpdate_time() {
        return update_time;
      }

      public void setUpdate_time(String update_time) {
        this.update_time = update_time;
      }

      public Object getExt_data() {
        return ext_data;
      }

      public void setExt_data(Object ext_data) {
        this.ext_data = ext_data;
      }

      public String getCard_id() {
        return card_id;
      }

      public void setCard_id(String card_id) {
        this.card_id = card_id;
      }

      public String getCard_element() {
        return card_element;
      }

      public void setCard_element(String card_element) {
        this.card_element = card_element;
      }

      public String getCard_number() {
        return card_number;
      }

      public void setCard_number(String card_number) {
        this.card_number = card_number;
      }

      public String getCard_constellation() {
        return card_constellation;
      }

      public void setCard_constellation(String card_constellation) {
        this.card_constellation = card_constellation;
      }

      public String getCard_direction() {
        return card_direction;
      }

      public void setCard_direction(String card_direction) {
        this.card_direction = card_direction;
      }

      public String getCard_describe() {
        return card_describe;
      }

      public void setCard_describe(String card_describe) {
        this.card_describe = card_describe;
      }

      public String getCard_positive() {
        return card_positive;
      }

      public void setCard_positive(String card_positive) {
        this.card_positive = card_positive;
      }

      public String getCard_negative() {
        return card_negative;
      }

      public void setCard_negative(String card_negative) {
        this.card_negative = card_negative;
      }

      public String getCard_handstand() {
        return card_handstand;
      }

      public void setCard_handstand(String card_handstand) {
        this.card_handstand = card_handstand;
      }

      public String getCard_meaning() {
        return card_meaning;
      }

      public void setCard_meaning(String card_meaning) {
        this.card_meaning = card_meaning;
      }

      public String getCard_keyword() {
        return card_keyword;
      }

      public void setCard_keyword(String card_keyword) {
        this.card_keyword = card_keyword;
      }
    }
  }
}
