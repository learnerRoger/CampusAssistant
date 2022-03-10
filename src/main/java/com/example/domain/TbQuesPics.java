package com.example.domain;


import com.example.dao.Question;

import java.util.List;

public class TbQuesPics {

  private String qId;
  private String picUrl;
  private List<Question> questionList;

  public List<Question> getQuestionList() {
    return questionList;
  }

  public void setQuestionList(List<Question> questionList) {
    this.questionList = questionList;
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
            ", questionList=" + questionList +
            '}';
  }
}
