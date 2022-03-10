package com.example.domain;


import com.example.dao.ViewDao;

import java.util.List;

public class TbViewPics {

  private String viewId;
  private String picUrl;
  private List<TbViews> tbViewsList;

  public List<TbViews> getTbViewsList() {
    return tbViewsList;
  }

  public void setTbViewsList(List<TbViews> tbViewsList) {
    this.tbViewsList = tbViewsList;
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
            ", tbViewsList=" + tbViewsList +
            '}';
  }
}
