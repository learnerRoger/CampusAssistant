package com.example.domain;


import java.util.List;

public class TbFoundNotice {

  private String foundId;
  private String idCard;
  private String title;
  private String content;
  private String goodsDesc;
  private java.sql.Timestamp foundTime;
  private String lostPlace;
  private String contact;
  private java.sql.Timestamp postTime;
  private List<TbUsers> tbUsersList;


  public String getFoundId() {
    return foundId;
  }

  public void setFoundId(String foundId) {
    this.foundId = foundId;
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

  @Override
  public String toString() {
    return "TbFoundNotice{" +
            "foundId='" + foundId + '\'' +
            ", idCard='" + idCard + '\'' +
            ", title='" + title + '\'' +
            ", content='" + content + '\'' +
            ", goodsDesc='" + goodsDesc + '\'' +
            ", foundTime=" + foundTime +
            ", lostPlace='" + lostPlace + '\'' +
            ", contact='" + contact + '\'' +
            ", postTime=" + postTime +
            ", tbUsersList=" + tbUsersList +
            '}';
  }

  public List<TbUsers> getTbUsersList() {
    return tbUsersList;
  }

  public void setTbUsersList(List<TbUsers> tbUsersList) {
    this.tbUsersList = tbUsersList;
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


  public java.sql.Timestamp getFoundTime() {
    return foundTime;
  }

  public void setFoundTime(java.sql.Timestamp foundTime) {
    this.foundTime = foundTime;
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

}
