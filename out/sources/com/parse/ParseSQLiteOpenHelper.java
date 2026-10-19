package com.parse;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.parse.boltsinternal.Task;

/* JADX INFO: loaded from: classes3.dex */
abstract class ParseSQLiteOpenHelper {
    private final SQLiteOpenHelper helper;

    public ParseSQLiteOpenHelper(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i10) {
        this.helper = new SQLiteOpenHelper(context, str, cursorFactory, i10) { // from class: com.parse.ParseSQLiteOpenHelper.1
            @Override // android.database.sqlite.SQLiteOpenHelper
            public void onCreate(SQLiteDatabase sQLiteDatabase) {
                ParseSQLiteOpenHelper.this.onCreate(sQLiteDatabase);
            }

            @Override // android.database.sqlite.SQLiteOpenHelper
            public void onOpen(SQLiteDatabase sQLiteDatabase) {
                super.onOpen(sQLiteDatabase);
                ParseSQLiteOpenHelper.this.onOpen(sQLiteDatabase);
            }

            @Override // android.database.sqlite.SQLiteOpenHelper
            public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i11, int i12) {
                ParseSQLiteOpenHelper.this.onUpgrade(sQLiteDatabase, i11, i12);
            }
        };
    }

    private Task<ParseSQLiteDatabase> getDatabaseAsync(boolean z10) {
        return ParseSQLiteDatabase.openDatabaseAsync(this.helper, !z10 ? 1 : 0);
    }

    public Task<ParseSQLiteDatabase> getWritableDatabaseAsync() {
        return getDatabaseAsync(true);
    }

    public abstract void onCreate(SQLiteDatabase sQLiteDatabase);

    public abstract void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11);

    public void onOpen(SQLiteDatabase sQLiteDatabase) {
    }
}
