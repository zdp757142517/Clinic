package com.bigdat.clinic.config;

import android.content.Context;
import android.content.SharedPreferences;

public class AppConfig {
	//�����ļ�������
	public static final String CONFIG_FILE_NAME="clinic_config";
	public static SharedPreferences getSharedPreferences(Context context){
		return context.getSharedPreferences(CONFIG_FILE_NAME, Context.MODE_PRIVATE);
	}
	//����
	//�Ƿ��ǵ�һ��װ��
	public static final String NAME_ISFIRST="NAME_ISFIRST";
	
	//�Ƿ��ǵ�һ�ν���ϵͳ
	public static boolean isFristEntry(Context context){
		SharedPreferences sp=getSharedPreferences(context);
		return sp.getBoolean(NAME_ISFIRST, true);
	}
	public static void setFristEntry(Context context,boolean isFirst){
		SharedPreferences sp=getSharedPreferences(context);
		sp.edit().putBoolean(NAME_ISFIRST, isFirst).commit();
	}
	
}
