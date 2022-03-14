package com.example.domain;


public class TbQuesPics {

  private String q_id;
  private String pic_url;

  public String getQ_id() {
    return q_id;
  }

  public void setQ_id(String q_id) {
    this.q_id = q_id;
  }

  public String getPic_url() {
    return pic_url;
  }

  public void setPic_url(String pic_url) {
    this.pic_url = pic_url;
  }

  @Override
  public String toString() {
    return "TbQuesPics{" +
            "q_id='" + q_id + '\'' +
            ", pic_url='" + pic_url + '\'' +
            '}';
  }
}
