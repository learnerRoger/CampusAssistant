package com.example.domain;


import com.fasterxml.jackson.annotation.JsonFormat;

import java.sql.Timestamp;
import java.util.Date;

public class TbFoundNotice {

  private String found_id;
  private String id_card;
  private String title;
  private String content;
  private String goods_desc;
  private TbUsers tb_users;
  private TbFnPics tb_fn_pics;
  @JsonFormat(pattern = "yy-MM-dd HH:mm:ss",timezone = "GMT+8")
  private Timestamp found_time;
  private String lost_place;
  private String contact;
  @JsonFormat(pattern = "yy-MM-dd HH:mm:ss",timezone = "GMT+8")
  private Timestamp post_time;


  public String getFound_id() {
    return found_id;
  }

  public void setFound_id(String found_id) {
    this.found_id = found_id;
  }


  public String getId_card() {
    return id_card;
  }

  public void setId_card(String id_card) {
    this.id_card = id_card;
  }


  public String getTitle() {
    return title;
  }

  public TbUsers getTb_users() {
    return tb_users;
  }

  public void setTb_users(TbUsers tb_users) {
    this.tb_users = tb_users;
  }

  public TbFnPics getTb_fn_pics() {
    return tb_fn_pics;
  }

  public void setTb_fn_pics(TbFnPics tb_fn_pics) {
    this.tb_fn_pics = tb_fn_pics;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }


  public String getGoods_desc() {
    return goods_desc;
  }

  public void setGoods_desc(String goods_desc) {
    this.goods_desc = goods_desc;
  }


  public Date getFound_time() {
    return found_time;
  }

  public void setFound_time(Timestamp found_time) {
    this.found_time = found_time;
  }


  public String getLost_place() {
    return lost_place;
  }

  public void setLost_place(String lost_place) {
    this.lost_place = lost_place;
  }


  public String getContact() {
    return contact;
  }

  public void setContact(String contact) {
    this.contact = contact;
  }


  public Date getPost_time() {
    return post_time;
  }

  public void setPost_time(Timestamp post_time) {
    this.post_time = post_time;
  }

  @Override
  public String toString() {
    return "TbFoundNotice{" +
            "found_id='" + found_id + '\'' +
            ", id_card='" + id_card + '\'' +
            ", title='" + title + '\'' +
            ", content='" + content + '\'' +
            ", goods_desc='" + goods_desc + '\'' +
            ", tb_users=" + tb_users +
            ", tb_fn_pics=" + tb_fn_pics +
            ", found_time=" + found_time +
            ", lost_place='" + lost_place + '\'' +
            ", contact='" + contact + '\'' +
            ", post_time=" + post_time +
            '}';
  }
}
