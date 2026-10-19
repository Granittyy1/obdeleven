package androidx.room;

import J4.n;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import androidx.sqlite.db.framework.FrameworkSQLiteDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.collections.y;
import p293xa.r;

/* JADX INFO: compiled from: InvalidationTracker.kt */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String[] f20109m = {"UPDATE", "DELETE", "INSERT"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WorkDatabase_Impl f20110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f20111b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f20112c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String[] f20113d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f20114e = new AtomicBoolean(false);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile boolean f20115f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile p285x2.f f20116g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b f20117h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p173o.b<c, d> f20118i;
    public final Object j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f20119k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final i f20120l;

    /* JADX INFO: compiled from: InvalidationTracker.kt */
    public static final class a {
        public static String a(String tableName, String triggerType) {
            kotlin.jvm.internal.i.e(tableName, "tableName");
            kotlin.jvm.internal.i.e(triggerType, "triggerType");
            return "`room_table_modification_trigger_" + tableName + '_' + triggerType + '`';
        }
    }

    /* JADX INFO: compiled from: InvalidationTracker.kt */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long[] f20121a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean[] f20122b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int[] f20123c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f20124d;

        public b(int i10) {
            this.f20121a = new long[i10];
            this.f20122b = new boolean[i10];
            this.f20123c = new int[i10];
        }

        public final int[] a() {
            synchronized (this) {
                try {
                    if (!this.f20124d) {
                        return null;
                    }
                    long[] jArr = this.f20121a;
                    int length = jArr.length;
                    int i10 = 0;
                    int i11 = 0;
                    while (i10 < length) {
                        int i12 = i11 + 1;
                        int i13 = 1;
                        boolean z10 = jArr[i10] > 0;
                        boolean[] zArr = this.f20122b;
                        if (z10 != zArr[i11]) {
                            int[] iArr = this.f20123c;
                            if (!z10) {
                                i13 = 2;
                            }
                            iArr[i11] = i13;
                        } else {
                            this.f20123c[i11] = 0;
                        }
                        zArr[i11] = z10;
                        i10++;
                        i11 = i12;
                    }
                    this.f20124d = false;
                    return (int[]) this.f20123c.clone();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: compiled from: InvalidationTracker.kt */
    public static abstract class c {
        public abstract void a(Set<String> set);
    }

    /* JADX INFO: compiled from: InvalidationTracker.kt */
    public static final class d {
    }

    public h(WorkDatabase_Impl workDatabase_Impl, HashMap map, HashMap map2, String... strArr) {
        String lowerCase;
        this.f20110a = workDatabase_Impl;
        this.f20111b = map;
        this.f20117h = new b(strArr.length);
        kotlin.jvm.internal.i.d(Collections.newSetFromMap(new IdentityHashMap()), "newSetFromMap(IdentityHashMap())");
        this.f20118i = new p173o.b<>();
        this.j = new Object();
        this.f20119k = new Object();
        this.f20112c = new LinkedHashMap();
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i10 = 0; i10 < length; i10++) {
            String str = strArr[i10];
            Locale locale = Locale.US;
            String strD = n.d(locale, "US", str, locale, "this as java.lang.String).toLowerCase(locale)");
            this.f20112c.put(strD, Integer.valueOf(i10));
            String str2 = (String) this.f20111b.get(strArr[i10]);
            if (str2 != null) {
                lowerCase = str2.toLowerCase(locale);
                kotlin.jvm.internal.i.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            } else {
                lowerCase = null;
            }
            if (lowerCase != null) {
                strD = lowerCase;
            }
            strArr2[i10] = strD;
        }
        this.f20113d = strArr2;
        for (Map.Entry entry : this.f20111b.entrySet()) {
            String str3 = (String) entry.getValue();
            Locale locale2 = Locale.US;
            String strD2 = n.d(locale2, "US", str3, locale2, "this as java.lang.String).toLowerCase(locale)");
            if (this.f20112c.containsKey(strD2)) {
                String lowerCase2 = ((String) entry.getKey()).toLowerCase(locale2);
                kotlin.jvm.internal.i.d(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
                LinkedHashMap linkedHashMap = this.f20112c;
                linkedHashMap.put(lowerCase2, y.q(strD2, linkedHashMap));
            }
        }
        this.f20120l = new i(this);
    }

    public final boolean a() {
        FrameworkSQLiteDatabase frameworkSQLiteDatabase = this.f20110a.f20062a;
        if (!kotlin.jvm.internal.i.a(frameworkSQLiteDatabase != null ? Boolean.valueOf(frameworkSQLiteDatabase.f20140b.isOpen()) : null, Boolean.TRUE)) {
            return false;
        }
        if (!this.f20115f) {
            this.f20110a.g().b0();
        }
        if (this.f20115f) {
            return true;
        }
        Log.e("ROOM", "database is not initialized even though it is open");
        return false;
    }

    public final void b(p285x2.b bVar, int i10) {
        bVar.q("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i10 + ", 0)");
        String str = this.f20113d[i10];
        String[] strArr = f20109m;
        for (int i11 = 0; i11 < 3; i11++) {
            String str2 = strArr[i11];
            String str3 = "CREATE TEMP TRIGGER IF NOT EXISTS " + a.a(str, str2) + " AFTER " + str2 + " ON `" + str + "` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = " + i10 + " AND invalidated = 0; END";
            kotlin.jvm.internal.i.d(str3, "StringBuilder().apply(builderAction).toString()");
            bVar.q(str3);
        }
    }

    public final void c(p285x2.b database) {
        kotlin.jvm.internal.i.e(database, "database");
        if (database.v0()) {
            return;
        }
        try {
            ReentrantReadWriteLock.ReadLock lock = this.f20110a.f20069h.readLock();
            kotlin.jvm.internal.i.d(lock, "readWriteLock.readLock()");
            lock.lock();
            try {
                synchronized (this.j) {
                    int[] iArrA = this.f20117h.a();
                    if (iArrA == null) {
                        lock.unlock();
                        return;
                    }
                    if (database.E0()) {
                        database.T();
                    } else {
                        database.l();
                    }
                    try {
                        int length = iArrA.length;
                        int i10 = 0;
                        int i11 = 0;
                        while (i10 < length) {
                            int i12 = iArrA[i10];
                            int i13 = i11 + 1;
                            if (i12 == 1) {
                                b(database, i11);
                            } else if (i12 == 2) {
                                String str = this.f20113d[i11];
                                String[] strArr = f20109m;
                                for (int i14 = 0; i14 < 3; i14++) {
                                    String str2 = "DROP TRIGGER IF EXISTS " + a.a(str, strArr[i14]);
                                    kotlin.jvm.internal.i.d(str2, "StringBuilder().apply(builderAction).toString()");
                                    database.q(str2);
                                }
                            }
                            i10++;
                            i11 = i13;
                        }
                        database.P();
                        database.g0();
                        r rVar = r.f47939a;
                        lock.unlock();
                    } catch (Throwable th) {
                        database.g0();
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                lock.unlock();
                throw th2;
            }
        } catch (SQLiteException e10) {
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e10);
        } catch (IllegalStateException e11) {
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e11);
        }
    }
}
