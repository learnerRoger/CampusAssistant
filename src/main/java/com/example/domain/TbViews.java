package com.example.domain;


import com.fasterxml.jackson.annotation.JsonFormat;

import java.sql.Timestamp;
import java.util.List;

public class TbViews {

  private String view_id;
  private String id_card;
  private String q_id;
  private String content;
  @JsonFormat(pattern = "yy-MM-dd HH:mm:ss",timezone = "GMT+8")
  private java.sql.Timestamp post_time;
  private String comment;
  private long approvals;
  private TbUsers tb_users;
  private TbViewPics tb_view_pics;

  @Override
  public String toString() {
    return "TbViews{" +
            "view_id='" + view_id + '\'' +
            ", id_card='" + id_card + '\'' +
            ", q_id='" + q_id + '\'' +
            ", content='" + content + '\'' +
            ", post_time=" + post_time +
            ", comment='" + comment + '\'' +
            ", approvals=" + approvals +
            ", tb_users=" + tb_users +
            ", tb_view_pics=" + tb_view_pics +
            '}';
  }

  public String getView_id() {
    return view_id;
  }

  public void setView_id(String view_id) {
    this.view_id = view_id;
  }

  public String getId_card() {
    return id_card;
  }

  public void setId_card(String id_card) {
    this.id_card = id_card;
  }

  public String getQ_id() {
    return q_id;
  }

  public void setQ_id(String q_id) {
    this.q_id = q_id;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public Timestamp getPost_time() {
    return post_time;
  }

  public void setPost_time(Timestamp post_time) {
    this.post_time = post_time;
  }

  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public long getApprovals() {
    return approvals;
  }

  public void setApprovals(long approvals) {
    this.approvals = approvals;
  }

  public TbUsers getTb_users() {
    return tb_users;
  }

  public void setTb_users(TbUsers tb_users) {
    this.tb_users = tb_users;
  }

  public TbViewPics getTb_view_pics() {
    return tb_view_pics;
  }

  public void setTb_view_pics(TbViewPics tb_view_pics) {
    this.tb_view_pics = tb_view_pics;
  }
}
