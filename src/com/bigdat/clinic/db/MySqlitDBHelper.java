package com.bigdat.clinic.db;

import com.bigdat.clinic.config.AppConfig;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class MySqlitDBHelper extends SQLiteOpenHelper {
	private Context context;
	public final static String DB_NAME="click.db";
	public final static int VERSON=1;
	public MySqlitDBHelper(Context context,int version) {
		super(context, DB_NAME, null, VERSON);
		this.context=context;
	}

	


	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub
		//更新系统配置，第一次进入该系统
		if(newVersion>oldVersion){
			AppConfig.setFristEntry(context, true);
		}
	}

}
