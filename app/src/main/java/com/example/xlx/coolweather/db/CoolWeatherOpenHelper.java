package com.example.xlx.coolweather.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by xlx on 2017/1/5.
 */
public class CoolWeatherOpenHelper extends SQLiteOpenHelper{

    //province表建表语句
    public static final String CREATE_PROVINCE = "create table Province ("
            + "id integer primary key autoincrement, "
            + "province_name text, "
            + "province_code text )";


    //city表建表语句
    public static  final String CREATE_CITY = "create table City ("
            + "id interger primary key autoincrement, "
            + "city_name text, "
            + "city_code text, "
            +"province+id integer)";

    //country表建表语句
    public static final String CREATE_COUNTY = "create table Country ("
            + "id integer primary key autoincrement, "
            + "country_name text, "
            + "country_code text, "
            + "city_id integer )" ;

    public CoolWeatherOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version){
        super(context, name, factory, version);

    }

    public void onCreate(SQLiteDatabase db){
        db.execSQL(CREATE_PROVINCE); //创建province 表
        db.execSQL(CREATE_CITY);//创建City表
        db.execSQL(CREATE_COUNTY);//创建county表
    }

    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){

    }

}
