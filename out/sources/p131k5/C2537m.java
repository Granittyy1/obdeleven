package p131k5;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.Y;
import com.google.android.gms.internal.measurement.Z;
import java.io.File;
import java.util.Collections;
import java.util.HashSet;

/* JADX INFO: renamed from: k5.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2537m {
    public static HashSet a(SQLiteDatabase sQLiteDatabase, String str) {
        HashSet hashSet = new HashSet();
        Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT * FROM " + str + " LIMIT 0", null);
        try {
            Collections.addAll(hashSet, cursorRawQuery.getColumnNames());
            return hashSet;
        } finally {
            cursorRawQuery.close();
        }
    }

    public static void b(B0 b10, SQLiteDatabase sQLiteDatabase) {
        synchronized (Y.class) {
        }
        String path = sQLiteDatabase.getPath();
        int i10 = Z.f25648a;
        File file = new File(path);
        boolean readable = file.setReadable(false, false);
        D0 d10 = b10.f41715i;
        if (!readable) {
            d10.c("Failed to turn off database read permission");
        }
        if (!file.setWritable(false, false)) {
            d10.c("Failed to turn off database write permission");
        }
        if (!file.setReadable(true, true)) {
            d10.c("Failed to turn on database read permission for owner");
        }
        if (file.setWritable(true, true)) {
            return;
        }
        d10.c("Failed to turn on database write permission for owner");
    }

    public static void c(B0 b10, SQLiteDatabase sQLiteDatabase, String str, String str2, String str3, String[] strArr) throws SQLiteException {
        boolean zMoveToFirst;
        D0 d10 = b10.f41715i;
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = sQLiteDatabase.query("SQLITE_MASTER", new String[]{"name"}, "name=?", new String[]{str}, null, null, null);
                zMoveToFirst = cursorQuery.moveToFirst();
                cursorQuery.close();
            } catch (SQLiteException e10) {
                d10.a(str, e10, "Error querying for table");
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                zMoveToFirst = false;
            }
            if (!zMoveToFirst) {
                sQLiteDatabase.execSQL(str2);
            }
            try {
                HashSet hashSetA = a(sQLiteDatabase, str);
                for (String str4 : str3.split(",")) {
                    if (!hashSetA.remove(str4)) {
                        throw new SQLiteException("Table " + str + " is missing required column: " + str4);
                    }
                }
                if (strArr != null) {
                    for (int i10 = 0; i10 < strArr.length; i10 += 2) {
                        if (!hashSetA.remove(strArr[i10])) {
                            sQLiteDatabase.execSQL(strArr[i10 + 1]);
                        }
                    }
                }
                if (hashSetA.isEmpty()) {
                    return;
                }
                d10.a(str, TextUtils.join(", ", hashSetA), "Table has extra columns. table, columns");
            } catch (SQLiteException e11) {
                b10.f41712f.b(str, "Failed to verify columns on table that was just created");
                throw e11;
            }
        } catch (Throwable th) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
    }
}
