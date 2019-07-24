package com.semenindonesia.insp.inspection;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by agungxfz on 26/03/2017.
 */

public class SQLite_dbase extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "inspection.db";
    public static final String DATABASE_PATH = "/data/data/com.semenindonesia.insp.inspection/databases/";
    public Context mContex;
    public SQLiteDatabase mDatabase;


    public SQLite_dbase(Context context) {
        super(context, DATABASE_NAME, null, 1);
        this.mContex = context;
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){

    }

    public void openDatabase(){
        String dbPath = mContex.getDatabasePath(DATABASE_PATH).getPath();
        if (mDatabase != null && mDatabase.isOpen()){
            return;
        }
        mDatabase = SQLiteDatabase.openDatabase(dbPath, null,SQLiteDatabase.OPEN_READWRITE);
    }

    public void closeDatabase(){
        if (mDatabase != null){
            mDatabase.close();
        }
    }
}
