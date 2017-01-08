package com.example.xlx.coolweather.model;

/**
 * Created by xlx on 2017/1/7.
 */
public class County {
   private int id;
    private String countryName;
    private String countryCode;
    private int cityId;

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getCountryName(){
        return countryName;
    }

    public void setCountryName(String countryName){
        this.countryName = countryName;
    }

    public String getGetCountryCode(){
        return countryCode;
    }

    public void setGetCountryCode(String countryCode){
        this.countryCode = countryCode;
    }

    public int getCityId(){
        return cityId;
    }

    public void setCityId(int cityId){
        this.cityId = cityId;
    }
}
