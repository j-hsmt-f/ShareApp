package com.example.connect2017withb.shareapp;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class MyOpenHelperK extends SQLiteOpenHelper {
    public MyOpenHelperK(Context context) {
        super(context, "KuchikomiDB", null, 2);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table kuchikomi(" + " name text," + "kuchikomi text," + " pic blob " + ");");
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        //db.execSQL("drop table Kuchikomi");
    }
}
