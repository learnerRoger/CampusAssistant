package com.example.domain;


import java.util.List;

public class TbViewPics {

  private String view_id;
  private String pic_url;

  public String getView_id() {
    return view_id;
  }

  public void setView_id(String view_id) {
    this.view_id = view_id;
  }

  public String getPic_url() {
    return pic_url;
  }

  public void setPic_url(String pic_url) {
    this.pic_url = pic_url;
  }

  @Override
  public String toString() {
    return "TbViewPics{" +
            "view_id='" + view_id + '\'' +
            ", pic_url='" + pic_url + '\'' +
            '}';
  }
}
