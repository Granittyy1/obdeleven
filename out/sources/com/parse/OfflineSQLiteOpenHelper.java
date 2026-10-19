package com.parse;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes3.dex */
class OfflineSQLiteOpenHelper extends ParseSQLiteOpenHelper {
    public OfflineSQLiteOpenHelper(Context context) {
        super(context, "ParseOfflineStore", null, 4);
    }

    private void createSchema(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE ParseObjects (uuid TEXT PRIMARY KEY, className TEXT NOT NULL, objectId TEXT, json TEXT, isDeletingEventually INTEGER DEFAULT 0, UNIQUE(className, objectId));");
        sQLiteDatabase.execSQL("CREATE TABLE Dependencies (key TEXT NOT NULL, uuid TEXT NOT NULL, PRIMARY KEY(key, uuid));");
    }

    @Override // com.parse.ParseSQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        createSchema(sQLiteDatabase);
    }

    @Override // com.parse.ParseSQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
    }
}
