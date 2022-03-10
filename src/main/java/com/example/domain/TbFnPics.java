package com.example.domain;


import java.util.List;

public class TbFnPics {

  private String foundId;
  private String picUrl;
  private List<TbFoundNotice> tbFoundNoticeList;

  public List<TbFoundNotice> getTbFoundNoticeList() {
    return tbFoundNoticeList;
  }

  public void setTbFoundNoticeList(List<TbFoundNotice> tbFoundNoticeList) {
    this.tbFoundNoticeList = tbFoundNoticeList;
  }

  public String getFoundId() {
    return foundId;
  }

  public void setFoundId(String foundId) {
    this.foundId = foundId;
  }


  public String getPicUrl() {
    return picUrl;
  }

  public void setPicUrl(String picUrl) {
    this.picUrl = picUrl;
  }

  @Override
  public String toString() {
    return "TbFnPics{" +
            "foundId='" + foundId + '\'' +
            ", picUrl='" + picUrl + '\'' +
            ", tbFoundNoticeList=" + tbFoundNoticeList +
            '}';
  }
}
