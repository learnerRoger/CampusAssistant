package com.example.domain;


import com.example.dao.QuestionDao;

import java.util.List;

public class TbQuesPics {

  private String qId;
  private String picUrl;
  private List<TbQuestions> tbQuestionsList;

  public List<TbQuestions> getQuestionList() {
    return tbQuestionsList;
  }

  public void setQuestionList(List<QuestionDao> questionList) {
    this.tbQuestionsList = tbQuestionsList;
  }

  public String getQId() {
    return qId;
  }

  public void setQId(String qId) {
    this.qId = qId;
  }


  public String getPicUrl() {
    return picUrl;
  }

  public void setPicUrl(String picUrl) {
    this.picUrl = picUrl;
  }

  @Override
  public String toString() {
    return "TbQuesPics{" +
            "qId='" + qId + '\'' +
            ", picUrl='" + picUrl + '\'' +
            ", tbQuestionsList=" + tbQuestionsList +
            '}';
  }
}
