package com.example.domain;


import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.List;

public class TbQuestions {

  private String q_id;
  private String id_card;
  private String title;
  @JsonFormat(pattern = "yy-MM-dd HH:mm:ss",timezone = "GMT+8")
  private java.sql.Timestamp post_time;
  private String content;
  private TbUsers tb_users;
  private TbQuesPics tb_ques_pics;
  private List<TbViews> tbViewsList;

  public TbUsers getTb_users() {
    return tb_users;
  }

  public void setTb_users(TbUsers tb_users) {
    this.tb_users = tb_users;
  }

  public TbQuesPics getTb_ques_pics() {
    return tb_ques_pics;
  }

  public void setTb_ques_pics(TbQuesPics tb_ques_pics) {
    this.tb_ques_pics = tb_ques_pics;
  }



  public String getQ_id() {
    return q_id;
  }

  public void setQ_id(String q_id) {
    this.q_id = q_id;
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

  public void setTitle(String title) {
    this.title = title;
  }


  public java.sql.Timestamp getPost_time() {
    return post_time;
  }

  public void setPost_time(java.sql.Timestamp post_time) {
    this.post_time = post_time;
  }


  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public List<TbViews> getTbViewsList() {
    return tbViewsList;
  }

  public void setTbViewsList(List<TbViews> tbViewsList) {
    this.tbViewsList = tbViewsList;
  }

  @Override
  public String toString() {
    return "TbQuestions{" +
            "q_id='" + q_id + '\'' +
            ", id_card='" + id_card + '\'' +
            ", title='" + title + '\'' +
            ", post_time=" + post_time +
            ", content='" + content + '\'' +
            ", tb_users=" + tb_users +
            ", tb_ques_pics=" + tb_ques_pics +
            ", tbViewsList=" + tbViewsList +
            '}';
  }
}
