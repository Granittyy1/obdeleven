package p131k5;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.SystemClock;

/* JADX INFO: renamed from: k5.v0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2573v0 extends AbstractC2589z0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C2581x0 f42493c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f42494d;

    public C2573v0(C2523i1 c2523i1) {
        super(c2523i1);
        this.f42493c = new C2581x0(this, ((C2523i1) this.f3968a).f42212a);
    }

    public static long w(SQLiteDatabase sQLiteDatabase) {
        Cursor cursorQuery = null;
        try {
            cursorQuery = sQLiteDatabase.query("messages", new String[]{"rowid"}, "type=?", new String[]{"3"}, null, null, "rowid desc", "1");
            if (!cursorQuery.moveToFirst()) {
                cursorQuery.close();
                return -1L;
            }
            long j = cursorQuery.getLong(0);
            cursorQuery.close();
            return j;
        } catch (Throwable th) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
    }

    public final boolean A() {
        p();
        if (this.f42494d || !((C2523i1) this.f3968a).f42212a.getDatabasePath("google_app_measurement_local.db").exists()) {
            return false;
        }
        int i10 = 5;
        for (int i11 = 0; i11 < 5; i11++) {
            SQLiteDatabase sQLiteDatabase = null;
            try {
                try {
                    try {
                        SQLiteDatabase sQLiteDatabaseB = B();
                        if (sQLiteDatabaseB == null) {
                            this.f42494d = true;
                            if (sQLiteDatabaseB != null) {
                                sQLiteDatabaseB.close();
                            }
                            return false;
                        }
                        sQLiteDatabaseB.beginTransaction();
                        sQLiteDatabaseB.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                        sQLiteDatabaseB.setTransactionSuccessful();
                        sQLiteDatabaseB.endTransaction();
                        sQLiteDatabaseB.close();
                        return true;
                    } catch (SQLiteException e10) {
                        if (0 != 0) {
                            try {
                                if (sQLiteDatabase.inTransaction()) {
                                    sQLiteDatabase.endTransaction();
                                }
                            } catch (Throwable th) {
                                if (0 != 0) {
                                    sQLiteDatabase.close();
                                }
                                throw th;
                            }
                        }
                        d().f41712f.b(e10, "Error deleting app launch break from local database");
                        this.f42494d = true;
                        if (0 != 0) {
                            sQLiteDatabase.close();
                        }
                    }
                } catch (SQLiteDatabaseLockedException unused) {
                    SystemClock.sleep(i10);
                    i10 += 20;
                    if (0 != 0) {
                        sQLiteDatabase.close();
                    }
                }
            } catch (SQLiteFullException e11) {
                d().f41712f.b(e11, "Error deleting app launch break from local database");
                this.f42494d = true;
                if (0 != 0) {
                    sQLiteDatabase.close();
                }
            }
        }
        d().f41715i.c("Error deleting app launch break from local database in reasonable time");
        return false;
    }

    public final SQLiteDatabase B() throws SQLiteException {
        if (this.f42494d) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.f42493c.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.f42494d = true;
        return null;
    }

    @Override // p131k5.AbstractC2589z0
    public final boolean v() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0060  */
    /* JADX WARN: Code duplicated, block: B:77:0x011b  */
    /* JADX WARN: Code duplicated, block: B:79:0x0120  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v3, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r8v4, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r8v5, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    public final boolean y(int i10, byte[] bArr) {
        SQLiteDatabase sQLiteDatabaseB;
        ?? RawQuery;
        long j;
        p();
        ?? r10 = 0;
        if (this.f42494d) {
            return false;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("type", Integer.valueOf(i10));
        contentValues.put("entry", bArr);
        int i11 = 0;
        int i12 = 5;
        for (int i13 = 5; i11 < i13; i13 = 5) {
            ?? r11 = 0;
             = 0;
            r11 = 0;
            ?? r12 = 0;
            r11 = 0;
            SQLiteDatabase sQLiteDatabase = null;
            try {
                sQLiteDatabaseB = B();
                try {
                    if (sQLiteDatabaseB == null) {
                        this.f42494d = true;
                        if (sQLiteDatabaseB != null) {
                            sQLiteDatabaseB.close();
                        }
                        return r10;
                    }
                    sQLiteDatabaseB.beginTransaction();
                    RawQuery = sQLiteDatabaseB.rawQuery("select count(1) from messages", null);
                    if (RawQuery != 0) {
                        try {
                            if (RawQuery.moveToFirst()) {
                                j = RawQuery.getLong(r10);
                            } else {
                                j = 0;
                            }
                        } catch (SQLiteDatabaseLockedException unused) {
                            r12 = RawQuery;
                            SystemClock.sleep(i12);
                            i12 += 20;
                            if (r12 != 0) {
                                r12.close();
                            }
                            if (sQLiteDatabaseB != null) {
                                sQLiteDatabaseB.close();
                            }
                            i11++;
                            r10 = 0;
                        } catch (SQLiteFullException e10) {
                            e = e10;
                            r11 = RawQuery;
                            try {
                                d().f41712f.b(e, "Error writing entry; local database full");
                                this.f42494d = true;
                                if (r11 != 0) {
                                    r11.close();
                                }
                                if (sQLiteDatabaseB != null) {
                                    sQLiteDatabaseB.close();
                                }
                                i11++;
                                r10 = 0;
                            } catch (Throwable th) {
                                th = th;
                                if (r11 != 0) {
                                    r11.close();
                                }
                                if (sQLiteDatabaseB != null) {
                                    sQLiteDatabaseB.close();
                                }
                                throw th;
                            }
                        } catch (SQLiteException e11) {
                            e = e11;
                            sQLiteDatabase = sQLiteDatabaseB;
                            RawQuery = RawQuery;
                            if (sQLiteDatabase != null) {
                                try {
                                    if (sQLiteDatabase.inTransaction()) {
                                        sQLiteDatabase.endTransaction();
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    sQLiteDatabaseB = sQLiteDatabase;
                                    r11 = RawQuery;
                                    if (r11 != 0) {
                                        r11.close();
                                    }
                                    if (sQLiteDatabaseB != null) {
                                        sQLiteDatabaseB.close();
                                    }
                                    throw th;
                                }
                            }
                            d().f41712f.b(e, "Error writing entry to local database");
                            this.f42494d = true;
                            if (RawQuery != 0) {
                                RawQuery.close();
                            }
                            if (sQLiteDatabase != null) {
                                sQLiteDatabase.close();
                            }
                            i11++;
                            r10 = 0;
                        } catch (Throwable th3) {
                            th = th3;
                            r11 = RawQuery;
                            if (r11 != 0) {
                                r11.close();
                            }
                            if (sQLiteDatabaseB != null) {
                                sQLiteDatabaseB.close();
                            }
                            throw th;
                        }
                    } else {
                        j = 0;
                    }
                    if (j >= 100000) {
                        d().f41712f.c("Data loss, local db full");
                        long j10 = 100001 - j;
                        long jDelete = sQLiteDatabaseB.delete("messages", "rowid in (select rowid from messages order by rowid asc limit ?)", new String[]{Long.toString(j10)});
                        if (jDelete != j10) {
                            d().f41712f.d("Different delete count than expected in local db. expected, received, difference", Long.valueOf(j10), Long.valueOf(jDelete), Long.valueOf(j10 - jDelete));
                        }
                    }
                    sQLiteDatabaseB.insertOrThrow("messages", null, contentValues);
                    sQLiteDatabaseB.setTransactionSuccessful();
                    sQLiteDatabaseB.endTransaction();
                    if (RawQuery != 0) {
                        RawQuery.close();
                    }
                    sQLiteDatabaseB.close();
                    return true;
                } catch (SQLiteDatabaseLockedException unused2) {
                } catch (SQLiteFullException e12) {
                    e = e12;
                } catch (SQLiteException e13) {
                    e = e13;
                    RawQuery = 0;
                }
            } catch (SQLiteDatabaseLockedException unused3) {
                sQLiteDatabaseB = null;
            } catch (SQLiteFullException e14) {
                e = e14;
                sQLiteDatabaseB = null;
            } catch (SQLiteException e15) {
                e = e15;
                RawQuery = 0;
            } catch (Throwable th4) {
                th = th4;
                sQLiteDatabaseB = null;
                if (r11 != 0) {
                    r11.close();
                }
                if (sQLiteDatabaseB != null) {
                    sQLiteDatabaseB.close();
                }
                throw th;
            }
        }
        d().f41719n.c("Failed to write entry to local database");
        return false;
    }

    public final void z() {
        int iDelete;
        p();
        try {
            SQLiteDatabase sQLiteDatabaseB = B();
            if (sQLiteDatabaseB == null || (iDelete = sQLiteDatabaseB.delete("messages", null, null)) <= 0) {
                return;
            }
            d().f41719n.b(Integer.valueOf(iDelete), "Reset local analytics data. records");
        } catch (SQLiteException e10) {
            d().f41712f.b(e10, "Error resetting local analytics data. error");
        }
    }
}
