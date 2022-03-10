package com.example.domain;


import java.util.List;

public class TbQuestions {

  private String qId;
  private String idCard;
  private String title;
  private java.sql.Timestamp postTime;
  private String content;
  private List<TbUsers> tbUsersList;


  public List<TbUsers> getTbUsersList() {
    return tbUsersList;
  }

  public void setTbUsersList(List<TbUsers> tbUsersList) {
    this.tbUsersList = tbUsersList;
  }

  public String getQId() {
    return qId;
  }

  public void setQId(String qId) {
    this.qId = qId;
  }


  public String getIdCard() {
    return idCard;
  }

  public void setIdCard(String idCard) {
    this.idCard = idCard;
  }


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  public java.sql.Timestamp getPostTime() {
    return postTime;
  }

  public void setPostTime(java.sql.Timestamp postTime) {
    this.postTime = postTime;
  }


  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  @Override
  public String toString() {
    return "TbQuestions{" +
            "qId='" + qId + '\'' +
            ", idCard='" + idCard + '\'' +
            ", title='" + title + '\'' +
            ", postTime=" + postTime +
            ", content='" + content + '\'' +
            ", tbUsersList=" + tbUsersList +
            '}';
  }
}
