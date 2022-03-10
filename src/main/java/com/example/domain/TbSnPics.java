package com.example.domain;


import java.util.List;

public class TbSnPics {

  private String searchId;
  private String picUrl;
  private List<TbSearchNotice> tbSearchNoticeList;

  public List<TbSearchNotice> getTbSearchNoticeList() {
    return tbSearchNoticeList;
  }

  public void setTbSearchNoticeList(List<TbSearchNotice> tbSearchNoticeList) {
    this.tbSearchNoticeList = tbSearchNoticeList;
  }

  public String getSearchId() {
    return searchId;
  }

  public void setSearchId(String searchId) {
    this.searchId = searchId;
  }


  public String getPicUrl() {
    return picUrl;
  }

  public void setPicUrl(String picUrl) {
    this.picUrl = picUrl;
  }

  @Override
  public String toString() {
    return "TbSnPics{" +
            "searchId='" + searchId + '\'' +
            ", picUrl='" + picUrl + '\'' +
            ", tbSearchNoticeList=" + tbSearchNoticeList +
            '}';
  }
}
