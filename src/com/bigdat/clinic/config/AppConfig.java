package com.bigdat.clinic.config;

import android.content.Context;
import android.content.SharedPreferences;

public class AppConfig {
	//配置文件的名字
	public static final String CONFIG_FILE_NAME="clinic_config";
	public static SharedPreferences getSharedPreferences(Context context){
		return context.getSharedPreferences(CONFIG_FILE_NAME, Context.MODE_PRIVATE);
	}
	//名称
	//是否是第一次装载
	public static final String NAME_ISFIRST="NAME_ISFIRST";
	
	//是否是第一次进入系统
	public static boolean isFristEntry(Context context){
		SharedPreferences sp=getSharedPreferences(context);
		return sp.getBoolean(NAME_ISFIRST, true);
	}
	public static void setFristEntry(Context context,boolean isFirst){
		SharedPreferences sp=getSharedPreferences(context);
		sp.edit().putBoolean(NAME_ISFIRST, isFirst).commit();
	}
	
}
