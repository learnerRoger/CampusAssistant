package com.example.domain;


import com.example.dao.View;

import java.util.List;

public class TbViewPics {

  private String viewId;
  private String picUrl;
  private List<View> viewList;

  public List<View> getViewList() {
    return viewList;
  }

  public void setViewList(List<View> viewList) {
    this.viewList = viewList;
  }

  public String getViewId() {
    return viewId;
  }

  public void setViewId(String viewId) {
    this.viewId = viewId;
  }


  public String getPicUrl() {
    return picUrl;
  }

  public void setPicUrl(String picUrl) {
    this.picUrl = picUrl;
  }

  @Override
  public String toString() {
    return "TbViewPics{" +
            "viewId='" + viewId + '\'' +
            ", picUrl='" + picUrl + '\'' +
            ", viewList=" + viewList +
            '}';
  }
}
