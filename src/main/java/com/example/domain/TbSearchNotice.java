package com.example.domain;


import java.util.List;

public class TbSearchNotice {

  private String search_id;
  private String id_card;
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

  public String getSearch_id() {
    return search_id;
  }

  public void setSearch_id(String search_id) {
    this.search_id = search_id;
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
            "search_id='" + search_id + '\'' +
            ", id_card='" + id_card + '\'' +
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
