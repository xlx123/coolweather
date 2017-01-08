package com.example.xlx.coolweather.model;

/**
 * Created by xlx on 2017/1/5.
 */
public class Province {
    private int id;
    private String provinceName;
    private String provinceCode;

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getProvinceName(){
        return provinceName;
    }

    public void setProvinceName(String provinceName){
        this.provinceName = provinceName;
    }

    public String getProvinceCode(){
        return getProvinceCode();
    }

    public void setProvinceCode(String provinceCode){
        this.provinceCode = provinceCode;
    }


}
