package com.example.domain;


public class TbUsers {

  private String id_card;
  private String name;
  private String acadmey;
  private String nick_name;
  private String city;
  private String province;
  private String avatar_url;
  private long gender;


  public String getId_card() {
    return id_card;
  }

  public void setId_card(String id_card) {
    this.id_card = id_card;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAcadmey() {
    return acadmey;
  }

  public void setAcadmey(String acadmey) {
    this.acadmey = acadmey;
  }

  public String getNick_name() {
    return nick_name;
  }

  public void setNick_name(String nick_name) {
    this.nick_name = nick_name;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getProvince() {
    return province;
  }

  public void setProvince(String province) {
    this.province = province;
  }

  public String getAvatar_url() {
    return avatar_url;
  }

  public void setAvatar_url(String avatar_url) {
    this.avatar_url = avatar_url;
  }

  public long getGender() {
    return gender;
  }

  public void setGender(long gender) {
    this.gender = gender;
  }

  @Override
  public String toString() {
    return "TbUsers{" +
            "id_card='" + id_card + '\'' +
            ", name='" + name + '\'' +
            ", acadmey='" + acadmey + '\'' +
            ", nick_name='" + nick_name + '\'' +
            ", city='" + city + '\'' +
            ", province='" + province + '\'' +
            ", avatar_url='" + avatar_url + '\'' +
            ", gender=" + gender +
            '}';
  }
}
