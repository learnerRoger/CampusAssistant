package com.example.domain;


import java.util.List;

public class TbViews {

  private String viewId;
  private String idCard;
  private String qId;
  private String content;
  private java.sql.Timestamp postTime;
  private String comment;
  private long approvals;
  private List<TbUsers> tbUsersList;
  private List<TbQuestions> tbQuestionsList;

  public List<TbUsers> getTbUsersList() {
    return tbUsersList;
  }

  public void setTbUsersList(List<TbUsers> tbUsersList) {
    this.tbUsersList = tbUsersList;
  }

  public List<TbQuestions> getTbQuestionsList() {
    return tbQuestionsList;
  }

  public void setTbQuestionsList(List<TbQuestions> tbQuestionsList) {
    this.tbQuestionsList = tbQuestionsList;
  }

  public String getViewId() {
    return viewId;
  }

  public void setViewId(String viewId) {
    this.viewId = viewId;
  }


  public String getIdCard() {
    return idCard;
  }

  public void setIdCard(String idCard) {
    this.idCard = idCard;
  }


  public String getQId() {
    return qId;
  }

  public void setQId(String qId) {
    this.qId = qId;
  }


  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }


  public java.sql.Timestamp getPostTime() {
    return postTime;
  }

  public void setPostTime(java.sql.Timestamp postTime) {
    this.postTime = postTime;
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

  @Override
  public String toString() {
    return "TbViews{" +
            "viewId='" + viewId + '\'' +
            ", idCard='" + idCard + '\'' +
            ", qId='" + qId + '\'' +
            ", content='" + content + '\'' +
            ", postTime=" + postTime +
            ", comment='" + comment + '\'' +
            ", approvals=" + approvals +
            ", tbUsersList=" + tbUsersList +
            ", tbQuestionsList=" + tbQuestionsList +
            '}';
  }
}
