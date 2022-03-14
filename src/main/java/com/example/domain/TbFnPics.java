package com.example.domain;


import java.util.List;

public class TbFnPics {

  private String found_id;
  private String pic_url;


  public String getFound_id() {
    return found_id;
  }

  public void setFound_id(String found_id) {
    this.found_id = found_id;
  }

  public String getPic_url() {
    return pic_url;
  }

  public void setPic_url(String pic_url) {
    this.pic_url = pic_url;
  }

  @Override
  public String toString() {
    return "TbFnPics{" +
            "found_id='" + found_id + '\'' +
            ", pic_url='" + pic_url + '\'' +
            '}';
  }
}
