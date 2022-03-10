package com.example.domain;


import java.util.List;

public class TbSearchNotice {

  private String searchId;
  private String idCard;
  private String title;
  private String content;
  private String goodsDesc;
  private java.sql.Timestamp lostTime;
  private String lostPlace;
  private String contact;
  private java.sql.Timestamp postTime;
  private List<TbUsers> tbUsersList;

  public List<TbUsers> getTbUsersList() {
    return tbUsersList;
  }

  public void setTbUsersList(List<TbUsers> tbUsersList) {
    this.tbUsersList = tbUsersList;
  }

  public String getSearchId() {
    return searchId;
  }

  public void setSearchId(String searchId) {
    this.searchId = searchId;
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


  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }


  public String getGoodsDesc() {
    return goodsDesc;
  }

  public void setGoodsDesc(String goodsDesc) {
    this.goodsDesc = goodsDesc;
  }


  public java.sql.Timestamp getLostTime() {
    return lostTime;
  }

  public void setLostTime(java.sql.Timestamp lostTime) {
    this.lostTime = lostTime;
  }


  public String getLostPlace() {
    return lostPlace;
  }

  public void setLostPlace(String lostPlace) {
    this.lostPlace = lostPlace;
  }


  public String getContact() {
    return contact;
  }

  public void setContact(String contact) {
    this.contact = contact;
  }


  public java.sql.Timestamp getPostTime() {
    return postTime;
  }

  public void setPostTime(java.sql.Timestamp postTime) {
    this.postTime = postTime;
  }

  @Override
  public String toString() {
    return "TbSearchNotice{" +
            "searchId='" + searchId + '\'' +
            ", idCard='" + idCard + '\'' +
            ", title='" + title + '\'' +
            ", content='" + content + '\'' +
            ", goodsDesc='" + goodsDesc + '\'' +
            ", lostTime=" + lostTime +
            ", lostPlace='" + lostPlace + '\'' +
            ", contact='" + contact + '\'' +
            ", postTime=" + postTime +
            ", tbUsersList=" + tbUsersList +
            '}';
  }
}
