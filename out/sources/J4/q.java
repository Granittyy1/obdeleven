package J4;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import android.util.Log;
import com.braze.models.inappmessage.InAppMessageBase;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: SQLiteEventStore.java */
/* JADX INFO: loaded from: classes.dex */
public final class q implements d, K4.a, c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final p311z4.c f3998g = new p311z4.c("proto");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f3999b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final L4.a f4000c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final L4.a f4001d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e f4002e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p268va.a<String> f4003f;

    /* JADX INFO: compiled from: SQLiteEventStore.java */
    public interface a<T, U> {
        U apply(T t8);
    }

    /* JADX INFO: compiled from: SQLiteEventStore.java */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f4004a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f4005b;

        public b(String str, String str2) {
            this.f4004a = str;
            this.f4005b = str2;
        }
    }

    public q(L4.a aVar, L4.a aVar2, e eVar, x xVar, p268va.a<String> aVar3) {
        this.f3999b = xVar;
        this.f4000c = aVar;
        this.f4001d = aVar2;
        this.f4002e = eVar;
        this.f4003f = aVar3;
    }

    public static <T> T B(Cursor cursor, a<Cursor, T> aVar) {
        try {
            return aVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public static Long k(SQLiteDatabase sQLiteDatabase, C4.l lVar) {
        StringBuilder sb2 = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(lVar.f2380a, String.valueOf(M4.a.a(lVar.f2382c))));
        byte[] bArr = lVar.f2381b;
        if (bArr != null) {
            sb2.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(bArr, 0));
        } else {
            sb2.append(" and extras is null");
        }
        Cursor cursorQuery = sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb2.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null);
        try {
            return !cursorQuery.moveToNext() ? null : Long.valueOf(cursorQuery.getLong(0));
        } finally {
            cursorQuery.close();
        }
    }

    public static String x(Iterable<h> iterable) {
        StringBuilder sb2 = new StringBuilder("(");
        Iterator<h> it = iterable.iterator();
        while (it.hasNext()) {
            sb2.append(it.next().b());
            if (it.hasNext()) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        return sb2.toString();
    }

    @Override // J4.d
    public final long G(C4.t tVar) {
        Cursor cursorRawQuery = j().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{tVar.a(), String.valueOf(M4.a.a(tVar.c()))});
        try {
            return (cursorRawQuery.moveToNext() ? Long.valueOf(cursorRawQuery.getLong(0)) : 0L).longValue();
        } finally {
            cursorRawQuery.close();
        }
    }

    @Override // J4.d
    public final Iterable<C4.t> J() {
        return (Iterable) p(new B7.b(1));
    }

    @Override // J4.d
    public final void L0(Iterable<h> iterable) {
        if (iterable.iterator().hasNext()) {
            String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + x(iterable);
            SQLiteDatabase sQLiteDatabaseJ = j();
            sQLiteDatabaseJ.beginTransaction();
            try {
                sQLiteDatabaseJ.compileStatement(str).execute();
                Cursor cursorRawQuery = sQLiteDatabaseJ.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null);
                while (cursorRawQuery.moveToNext()) {
                    try {
                        i(cursorRawQuery.getInt(0), LogEventDropped.Reason.MAX_RETRIES_REACHED, cursorRawQuery.getString(1));
                    } catch (Throwable th) {
                        cursorRawQuery.close();
                        throw th;
                    }
                }
                cursorRawQuery.close();
                sQLiteDatabaseJ.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                sQLiteDatabaseJ.setTransactionSuccessful();
                sQLiteDatabaseJ.endTransaction();
            } catch (Throwable th2) {
                sQLiteDatabaseJ.endTransaction();
                throw th2;
            }
        }
    }

    @Override // J4.d
    public final Iterable R0(C4.l lVar) {
        return (Iterable) p(new D7.h(this, 1, lVar));
    }

    @Override // J4.d
    public final J4.b a0(final C4.l lVar, final C4.o oVar) {
        oVar.g();
        if (Log.isLoggable("TRuntime.".concat("SQLiteEventStore"), 3)) {
            new StringBuilder("Storing event with priority=").append(lVar.f2382c);
        }
        long jLongValue = ((Long) p(new a() { // from class: J4.j
            @Override // J4.q.a
            public final Object apply(Object obj) {
                long jInsert;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                q qVar = this.f3982b;
                long jSimpleQueryForLong = qVar.j().compileStatement("PRAGMA page_size").simpleQueryForLong() * qVar.j().compileStatement("PRAGMA page_count").simpleQueryForLong();
                e eVar = qVar.f4002e;
                long jE = eVar.e();
                C4.o oVar2 = oVar;
                if (jSimpleQueryForLong >= jE) {
                    qVar.i(1L, LogEventDropped.Reason.CACHE_FULL, oVar2.g());
                    return -1L;
                }
                C4.l lVar2 = lVar;
                Long lK = q.k(sQLiteDatabase, lVar2);
                if (lK != null) {
                    jInsert = lK.longValue();
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("backend_name", lVar2.f2380a);
                    contentValues.put("priority", Integer.valueOf(M4.a.a(lVar2.f2382c)));
                    contentValues.put("next_request_ms", (Integer) 0);
                    byte[] bArr = lVar2.f2381b;
                    if (bArr != null) {
                        contentValues.put(InAppMessageBase.EXTRAS, Base64.encodeToString(bArr, 0));
                    }
                    jInsert = sQLiteDatabase.insert("transport_contexts", null, contentValues);
                }
                int iD = eVar.d();
                byte[] bArr2 = oVar2.d().f2392b;
                boolean z10 = bArr2.length <= iD;
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("context_id", Long.valueOf(jInsert));
                contentValues2.put("transport_name", oVar2.g());
                contentValues2.put("timestamp_ms", Long.valueOf(oVar2.e()));
                contentValues2.put("uptime_ms", Long.valueOf(oVar2.h()));
                contentValues2.put("payload_encoding", oVar2.d().f2391a.f48831a);
                contentValues2.put("code", oVar2.c());
                contentValues2.put("num_attempts", (Integer) 0);
                contentValues2.put("inline", Boolean.valueOf(z10));
                contentValues2.put("payload", z10 ? bArr2 : new byte[0]);
                long jInsert2 = sQLiteDatabase.insert("events", null, contentValues2);
                if (!z10) {
                    int iCeil = (int) Math.ceil(((double) bArr2.length) / ((double) iD));
                    for (int i10 = 1; i10 <= iCeil; i10++) {
                        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr2, (i10 - 1) * iD, Math.min(i10 * iD, bArr2.length));
                        ContentValues contentValues3 = new ContentValues();
                        contentValues3.put("event_id", Long.valueOf(jInsert2));
                        contentValues3.put("sequence_num", Integer.valueOf(i10));
                        contentValues3.put("bytes", bArrCopyOfRange);
                        sQLiteDatabase.insert("event_payloads", null, contentValues3);
                    }
                }
                for (Map.Entry entry : Collections.unmodifiableMap(oVar2.b()).entrySet()) {
                    ContentValues contentValues4 = new ContentValues();
                    contentValues4.put("event_id", Long.valueOf(jInsert2));
                    contentValues4.put("name", (String) entry.getKey());
                    contentValues4.put("value", (String) entry.getValue());
                    sQLiteDatabase.insert("event_metadata", null, contentValues4);
                }
                return Long.valueOf(jInsert2);
            }
        })).longValue();
        if (jLongValue < 1) {
            return null;
        }
        return new J4.b(jLongValue, lVar, oVar);
    }

    @Override // K4.a
    public final <T> T b(K4.a.InterfaceC0060a<T> interfaceC0060a) {
        SQLiteDatabase sQLiteDatabaseJ = j();
        L4.a aVar = this.f4001d;
        long jB = aVar.b();
        while (true) {
            try {
                sQLiteDatabaseJ.beginTransaction();
                try {
                    T tK = interfaceC0060a.k();
                    sQLiteDatabaseJ.setTransactionSuccessful();
                    return tK;
                } finally {
                    sQLiteDatabaseJ.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e10) {
                if (aVar.b() >= ((long) this.f4002e.a()) + jB) {
                    throw new SynchronizationException("Timed out while trying to acquire the lock.", e10);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    @Override // J4.c
    public final void c() {
        SQLiteDatabase sQLiteDatabaseJ = j();
        sQLiteDatabaseJ.beginTransaction();
        try {
            sQLiteDatabaseJ.compileStatement("DELETE FROM log_event_dropped").execute();
            sQLiteDatabaseJ.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + this.f4000c.b()).execute();
            sQLiteDatabaseJ.setTransactionSuccessful();
        } finally {
            sQLiteDatabaseJ.endTransaction();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f3999b.close();
    }

    @Override // J4.d
    public final int d() {
        long jB = this.f4000c.b() - this.f4002e.b();
        SQLiteDatabase sQLiteDatabaseJ = j();
        sQLiteDatabaseJ.beginTransaction();
        try {
            String[] strArr = {String.valueOf(jB)};
            Cursor cursorRawQuery = sQLiteDatabaseJ.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr);
            while (cursorRawQuery.moveToNext()) {
                try {
                    i(cursorRawQuery.getInt(0), LogEventDropped.Reason.MESSAGE_TOO_OLD, cursorRawQuery.getString(1));
                } catch (Throwable th) {
                    cursorRawQuery.close();
                    throw th;
                }
            }
            cursorRawQuery.close();
            int iDelete = sQLiteDatabaseJ.delete("events", "timestamp_ms < ?", strArr);
            sQLiteDatabaseJ.setTransactionSuccessful();
            sQLiteDatabaseJ.endTransaction();
            return iDelete;
        } catch (Throwable th2) {
            sQLiteDatabaseJ.endTransaction();
            throw th2;
        }
    }

    @Override // J4.c
    public final F4.a h() {
        int i10 = F4.a.f3235e;
        F4.a.C0035a c0035a = new F4.a.C0035a();
        c0035a.f3240a = null;
        c0035a.f3241b = new ArrayList();
        c0035a.f3242c = null;
        c0035a.f3243d = "";
        HashMap map = new HashMap();
        SQLiteDatabase sQLiteDatabaseJ = j();
        sQLiteDatabaseJ.beginTransaction();
        try {
            F4.a aVar = (F4.a) B(sQLiteDatabaseJ.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new o(this, map, c0035a));
            sQLiteDatabaseJ.setTransactionSuccessful();
            return aVar;
        } finally {
            sQLiteDatabaseJ.endTransaction();
        }
    }

    @Override // J4.d
    public final void h0(final long j, final C4.l lVar) {
        p(new a() { // from class: J4.k
            @Override // J4.q.a
            public final Object apply(Object obj) {
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                ContentValues contentValues = new ContentValues();
                contentValues.put("next_request_ms", Long.valueOf(j));
                C4.l lVar2 = lVar;
                Priority priority = lVar2.f2382c;
                String strValueOf = String.valueOf(M4.a.a(priority));
                String str = lVar2.f2380a;
                if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, strValueOf}) < 1) {
                    contentValues.put("backend_name", str);
                    contentValues.put("priority", Integer.valueOf(M4.a.a(priority)));
                    sQLiteDatabase.insert("transport_contexts", null, contentValues);
                }
                return null;
            }
        });
    }

    @Override // J4.c
    public final void i(final long j, final LogEventDropped.Reason reason, final String str) {
        p(new a() { // from class: J4.l
            @Override // J4.q.a
            public final Object apply(Object obj) {
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                LogEventDropped.Reason reason2 = reason;
                String string = Integer.toString(reason2.a());
                String str2 = str;
                boolean zBooleanValue = ((Boolean) q.B(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str2, string}), new n(0))).booleanValue();
                long j10 = j;
                if (zBooleanValue) {
                    sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j10 + " WHERE log_source = ? AND reason = ?", new String[]{str2, Integer.toString(reason2.a())});
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("log_source", str2);
                    contentValues.put("reason", Integer.valueOf(reason2.a()));
                    contentValues.put("events_dropped_count", Long.valueOf(j10));
                    sQLiteDatabase.insert("log_event_dropped", null, contentValues);
                }
                return null;
            }
        });
    }

    public final SQLiteDatabase j() {
        x xVar = this.f3999b;
        Objects.requireNonNull(xVar);
        L4.a aVar = this.f4001d;
        long jB = aVar.b();
        while (true) {
            try {
                return xVar.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e10) {
                if (aVar.b() >= ((long) this.f4002e.a()) + jB) {
                    throw new SynchronizationException("Timed out while trying to open db.", e10);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    @Override // J4.d
    public final void m(Iterable<h> iterable) {
        if (iterable.iterator().hasNext()) {
            j().compileStatement("DELETE FROM events WHERE _id in " + x(iterable)).execute();
        }
    }

    public final <T> T p(a<SQLiteDatabase, T> aVar) {
        SQLiteDatabase sQLiteDatabaseJ = j();
        sQLiteDatabaseJ.beginTransaction();
        try {
            T tApply = aVar.apply(sQLiteDatabaseJ);
            sQLiteDatabaseJ.setTransactionSuccessful();
            return tApply;
        } finally {
            sQLiteDatabaseJ.endTransaction();
        }
    }

    public final ArrayList s(SQLiteDatabase sQLiteDatabase, final C4.l lVar, int i10) {
        final ArrayList arrayList = new ArrayList();
        Long lK = k(sQLiteDatabase, lVar);
        if (lK == null) {
            return arrayList;
        }
        B(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{lK.toString()}, null, null, null, String.valueOf(i10)), new a() { // from class: J4.m
            @Override // J4.q.a
            public final Object apply(Object obj) {
                Cursor cursor = (Cursor) obj;
                q qVar = this.f3990b;
                qVar.getClass();
                while (cursor.moveToNext()) {
                    long j = cursor.getLong(0);
                    boolean z10 = cursor.getInt(7) != 0;
                    C4.j.a aVar = new C4.j.a();
                    aVar.f2374f = new HashMap();
                    String string = cursor.getString(1);
                    if (string == null) {
                        throw new NullPointerException("Null transportName");
                    }
                    aVar.f2369a = string;
                    aVar.f2372d = Long.valueOf(cursor.getLong(2));
                    aVar.f2373e = Long.valueOf(cursor.getLong(3));
                    if (z10) {
                        String string2 = cursor.getString(4);
                        aVar.f2371c = new C4.n(string2 == null ? q.f3998g : new p311z4.c(string2), cursor.getBlob(5));
                    } else {
                        String string3 = cursor.getString(4);
                        p311z4.c cVar = string3 == null ? q.f3998g : new p311z4.c(string3);
                        Cursor cursorQuery = qVar.j().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j)}, null, null, "sequence_num");
                        try {
                            ArrayList arrayList2 = new ArrayList();
                            int length = 0;
                            while (cursorQuery.moveToNext()) {
                                byte[] blob = cursorQuery.getBlob(0);
                                arrayList2.add(blob);
                                length += blob.length;
                            }
                            byte[] bArr = new byte[length];
                            int length2 = 0;
                            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                                byte[] bArr2 = (byte[]) arrayList2.get(i11);
                                System.arraycopy(bArr2, 0, bArr, length2, bArr2.length);
                                length2 += bArr2.length;
                            }
                            cursorQuery.close();
                            aVar.f2371c = new C4.n(cVar, bArr);
                        } catch (Throwable th) {
                            cursorQuery.close();
                            throw th;
                        }
                    }
                    if (!cursor.isNull(6)) {
                        aVar.f2370b = Integer.valueOf(cursor.getInt(6));
                    }
                    arrayList.add(new b(j, lVar, aVar.b()));
                }
                return null;
            }
        });
        return arrayList;
    }

    @Override // J4.d
    public final boolean u0(C4.l lVar) {
        Boolean bool;
        SQLiteDatabase sQLiteDatabaseJ = j();
        sQLiteDatabaseJ.beginTransaction();
        try {
            Long lK = k(sQLiteDatabaseJ, lVar);
            if (lK == null) {
                bool = Boolean.FALSE;
            } else {
                Cursor cursorRawQuery = j().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lK.toString()});
                try {
                    Boolean boolValueOf = Boolean.valueOf(cursorRawQuery.moveToNext());
                    cursorRawQuery.close();
                    bool = boolValueOf;
                } catch (Throwable th) {
                    cursorRawQuery.close();
                    throw th;
                }
            }
            sQLiteDatabaseJ.setTransactionSuccessful();
            sQLiteDatabaseJ.endTransaction();
            return bool.booleanValue();
        } catch (Throwable th2) {
            sQLiteDatabaseJ.endTransaction();
            throw th2;
        }
    }
}
