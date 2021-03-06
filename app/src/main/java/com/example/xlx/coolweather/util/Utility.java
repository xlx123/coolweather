package com.example.xlx.coolweather.util;

import android.text.TextUtils;

import com.example.xlx.coolweather.model.City;
import com.example.xlx.coolweather.model.CoolWeatherDB;
import com.example.xlx.coolweather.model.County;
import com.example.xlx.coolweather.model.Province;

/**
 * Created by xlx on 2017/1/8.
 */
public class Utility {
    //解析和处理服务器返回的省级数据
    public synchronized static boolean handleProvincesResponse(CoolWeatherDB coolWeatherDB, String response){
        if (!TextUtils.isEmpty(response)){
            String[] allProvinces = response.split(",");
            if (allProvinces != null && allProvinces.length >0 ){
                for (String p : allProvinces){
                    String[] array = p.split("\\|");
                    Province province = new Province();
                    province.setProvinceCode(array[0]);
                    province.setProvinceName(array[1]);
                    //将解析出来的数据存储到Province表
                    coolWeatherDB.saveProvince(province);
                }
                return true;
            }
        }
        return false;
    }

    //解析和处理服务器返回的市级数据
    public static boolean handleCitiesResponse(CoolWeatherDB coolWeatherDB, String response, int provinceId){
        if (!TextUtils.isEmpty(response)){
            String[] allCities = response.split(",");
            if (allCities != null && allCities.length>0){
                for (String c: allCities){
                    String[] array = c.split("\\|");
                    City city = new City();
                    city.setCityCode(array[0]);
                    city.setCityName(array[1]);
                    city.setProvinceId(provinceId);
                    //将解析出来的数据存储到city表
                    coolWeatherDB.saveCity(city);
                }
                return true;
            }

        }
        return false;
    }

    //解析和处理服务器返回的县级数据
    public static boolean handleCountiesResponse(CoolWeatherDB coolWeatherDB, String response, int cityId){
        if (!TextUtils.isEmpty(response)){
            String[] allCounties = response.split(",");
            if (allCounties != null && allCounties.length>0 ){
                for (String c:allCounties){
                    String[] array = c.split("\\|");
                    County county = new County();
                    county.setGetCountryCode(array[0]);
                    county.setCountryName(array[1]);
                    county.setCityId(cityId);
                    //将解析出来的数据存储到County表
                    coolWeatherDB.savaCountry(county);
                }
                return true;
            }
        }
        return false;
    }
}
