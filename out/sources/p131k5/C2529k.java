package p131k5;

import U4.C0804l;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import androidx.collection.C0873a;
import androidx.compose.foundation.gestures.d;
import com.braze.Constants;
import com.google.android.gms.internal.measurement.A1;
import com.google.android.gms.internal.measurement.A4;
import com.google.android.gms.internal.measurement.C1781b1;
import com.google.android.gms.internal.measurement.C1812f4;
import com.google.android.gms.internal.measurement.C1834i5;
import com.google.android.gms.internal.measurement.C1889q4;
import com.google.android.gms.internal.measurement.C1906t1;
import com.google.android.gms.internal.measurement.C1920v1;
import com.google.android.gms.internal.measurement.C1924v5;
import com.google.android.gms.internal.measurement.C1930w4;
import com.google.android.gms.internal.measurement.C1934x1;
import com.google.android.gms.internal.measurement.C1937x4;
import com.google.android.gms.internal.measurement.G5;
import com.google.android.gms.internal.measurement.Z0;
import com.google.android.gms.measurement.internal.b;
import com.google.android.gms.measurement.internal.h;
import com.google.android.gms.measurement.internal.i;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: renamed from: k5.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2529k extends m3 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String[] f42259f = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String[] f42260g = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String[] f42261h = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;", "sgtm_upload_enabled", "ALTER TABLE apps ADD COLUMN sgtm_upload_enabled INTEGER;", "target_os_version", "ALTER TABLE apps ADD COLUMN target_os_version INTEGER;", "session_stitching_token_hash", "ALTER TABLE apps ADD COLUMN session_stitching_token_hash INTEGER;", "ad_services_version", "ALTER TABLE apps ADD COLUMN ad_services_version INTEGER;", "unmatched_first_open_without_ad_id", "ALTER TABLE apps ADD COLUMN unmatched_first_open_without_ad_id INTEGER;", "npa_metadata_value", "ALTER TABLE apps ADD COLUMN npa_metadata_value INTEGER;", "attribution_eligibility_status", "ALTER TABLE apps ADD COLUMN attribution_eligibility_status INTEGER;", "sgtm_preview_key", "ALTER TABLE apps ADD COLUMN sgtm_preview_key TEXT;", "dma_consent_state", "ALTER TABLE apps ADD COLUMN dma_consent_state INTEGER;", "daily_realtime_dcu_count", "ALTER TABLE apps ADD COLUMN daily_realtime_dcu_count INTEGER;", "bundle_delivery_index", "ALTER TABLE apps ADD COLUMN bundle_delivery_index INTEGER;", "serialized_npa_metadata", "ALTER TABLE apps ADD COLUMN serialized_npa_metadata TEXT;"};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String[] f42262i = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};
    public static final String[] j = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String[] f42263k = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String[] f42264l = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String[] f42265m = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String[] f42266n = {"consent_source", "ALTER TABLE consent_settings ADD COLUMN consent_source INTEGER;", "dma_consent_settings", "ALTER TABLE consent_settings ADD COLUMN dma_consent_settings TEXT;"};

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String[] f42267o = {"idempotent", "CREATE INDEX IF NOT EXISTS trigger_uris_index ON trigger_uris (app_id);"};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C2541n f42268d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C2520h3 f42269e;

    public C2529k(h hVar) {
        super(hVar);
        this.f42269e = new C2520h3(((C2523i1) this.f3968a).f42224n);
        this.f42268d = new C2541n(this, ((C2523i1) this.f3968a).f42212a);
    }

    public static void K(ContentValues contentValues, Object obj) {
        C0804l.e("value");
        C0804l.h(obj);
        if (obj instanceof String) {
            contentValues.put("value", (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put("value", (Long) obj);
        } else {
            if (!(obj instanceof Double)) {
                throw new IllegalArgumentException("Invalid value type");
            }
            contentValues.put("value", (Double) obj);
        }
    }

    public final long A(String str) {
        C0804l.e(str);
        p();
        t();
        try {
            return w().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str, String.valueOf(Math.max(0, Math.min(1000000, ((C2523i1) this.f3968a).f42218g.u(str, B.f41692r))))});
        } catch (SQLiteException e10) {
            d().f41712f.a(B0.v(str), e10, "Error deleting over the limit events. appId");
            return 0L;
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x002e  */
    public final long B(String str, String[] strArr, long j10) {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = w().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    cursorRawQuery.close();
                    return j10;
                }
                long j11 = cursorRawQuery.getLong(0);
                cursorRawQuery.close();
                return j11;
            } catch (SQLiteException e10) {
                d().f41712f.a(str, e10, "Database error");
                throw e10;
            }
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
        if (cursorRawQuery != null) {
            cursorRawQuery.close();
        }
        throw th;
    }

    public final Object C(Cursor cursor, int i10) {
        int type = cursor.getType(i10);
        if (type == 0) {
            d().f41712f.c("Loaded invalid null value from database");
            return null;
        }
        if (type == 1) {
            return Long.valueOf(cursor.getLong(i10));
        }
        if (type == 2) {
            return Double.valueOf(cursor.getDouble(i10));
        }
        if (type == 3) {
            return cursor.getString(i10);
        }
        if (type == 4) {
            d().f41712f.c("Loaded invalid blob type value, ignoring it");
            return null;
        }
        B0 b0D = d();
        b0D.f41712f.b(Integer.valueOf(type), "Loaded invalid unknown value type, ignoring it");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0053  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r4v0, types: [long] */
    public final String D(long j10) throws Throwable {
        Cursor cursorRawQuery;
        p();
        t();
        ?? r10 = 0;
        try {
            try {
                cursorRawQuery = w().rawQuery("select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;", new String[]{String.valueOf((long) j10)});
                try {
                    if (cursorRawQuery.moveToFirst()) {
                        String string = cursorRawQuery.getString(0);
                        cursorRawQuery.close();
                        return string;
                    }
                    d().f41719n.c("No expired configs for apps with pending events");
                    cursorRawQuery.close();
                    return null;
                } catch (SQLiteException e10) {
                    e = e10;
                    d().f41712f.b(e, "Error selecting expired configs");
                    if (cursorRawQuery != null) {
                        cursorRawQuery.close();
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                r10 = j10;
                if (r10 != 0) {
                    r10.close();
                }
                throw th;
            }
        } catch (SQLiteException e11) {
            e = e11;
            cursorRawQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (r10 != 0) {
                r10.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x002e  */
    public final String E(String str, String str2, String[] strArr) {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = w().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    cursorRawQuery.close();
                    return str2;
                }
                String string = cursorRawQuery.getString(0);
                cursorRawQuery.close();
                return string;
            } catch (SQLiteException e10) {
                d().f41712f.a(str, e10, "Database error");
                throw e10;
            }
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
        if (cursorRawQuery != null) {
            cursorRawQuery.close();
        }
        throw th;
    }

    /* JADX WARN: Code duplicated, block: B:94:0x01be  */
    public final List<Pair<C1934x1, Long>> F(String str, int i10, int i11) throws Throwable {
        long jE;
        long jE2;
        p();
        t();
        int i12 = 1;
        C0804l.b(i10 > 0);
        C0804l.b(i11 > 0);
        C0804l.e(str);
        Cursor cursor = null;
        try {
            Cursor cursorQuery = w().query("queue", new String[]{"rowid", "data", "retry_count"}, "app_id=?", new String[]{str}, null, null, "rowid", String.valueOf(i10));
            try {
                if (!cursorQuery.moveToFirst()) {
                    List<Pair<C1934x1, Long>> listEmptyList = Collections.emptyList();
                    cursorQuery.close();
                    return listEmptyList;
                }
                ArrayList arrayList = new ArrayList();
                int length = 0;
                while (true) {
                    long j10 = cursorQuery.getLong(0);
                    try {
                        byte[] bArrG0 = q().g0(cursorQuery.getBlob(i12));
                        if (!arrayList.isEmpty() && bArrG0.length + length > i11) {
                            break;
                        }
                        try {
                            C1934x1.a aVar = (C1934x1.a) i.D(C1934x1.Z1(), bArrG0);
                            C1930w4.a();
                            try {
                                if (((C2523i1) this.f3968a).f42218g.B(null, B.f41636P0) && !arrayList.isEmpty()) {
                                    C1934x1 c1934x1 = (C1934x1) ((Pair) arrayList.get(0)).first;
                                    C1934x1 c1934x2 = (C1934x1) aVar.f();
                                    if (!c1934x1.K().equals(c1934x2.K()) || !c1934x1.J().equals(c1934x2.J()) || c1934x1.Z() != c1934x2.Z() || !c1934x1.L().equals(c1934x2.L())) {
                                        break;
                                    }
                                    Iterator<E> it = c1934x1.X().iterator();
                                    while (true) {
                                        jE = -1;
                                        if (!it.hasNext()) {
                                            jE2 = -1;
                                            break;
                                        }
                                        A1 a10 = (A1) it.next();
                                        if ("_npa".equals(a10.J())) {
                                            jE2 = a10.E();
                                            break;
                                        }
                                    }
                                    for (A1 a11 : c1934x2.X()) {
                                        if ("_npa".equals(a11.J())) {
                                            jE = a11.E();
                                            break;
                                        }
                                    }
                                    if (jE2 != jE) {
                                        break;
                                    }
                                }
                                if (!cursorQuery.isNull(2)) {
                                    int i13 = cursorQuery.getInt(2);
                                    aVar.h();
                                    C1934x1.y((C1934x1) aVar.f25531c, i13);
                                }
                                length += bArrG0.length;
                                arrayList.add(Pair.create((C1934x1) aVar.f(), Long.valueOf(j10)));
                                if (!cursorQuery.moveToNext() || length > i11) {
                                    break;
                                }
                                i12 = 1;
                            } catch (SQLiteException e10) {
                                e = e10;
                                cursor = cursorQuery;
                                try {
                                    d().f41712f.a(B0.v(str), e, "Error querying bundles. appId");
                                    List<Pair<C1934x1, Long>> listEmptyList2 = Collections.emptyList();
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    return listEmptyList2;
                                } catch (Throwable th) {
                                    th = th;
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                cursor = cursorQuery;
                                if (cursor != null) {
                                    cursor.close();
                                }
                                throw th;
                            }
                        } catch (IOException e11) {
                            d().f41712f.a(B0.v(str), e11, "Failed to merge queued bundle. appId");
                        }
                    } catch (IOException e12) {
                        d().f41712f.a(B0.v(str), e12, "Failed to unzip queued bundle. appId");
                    }
                }
                cursorQuery.close();
                return arrayList;
            } catch (SQLiteException e13) {
                e = e13;
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (SQLiteException e14) {
            e = e14;
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public final List<C2496d> G(String str, String str2, String str3) {
        C0804l.e(str);
        p();
        t();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb2 = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb2.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(str3 + "*");
            sb2.append(" and name glob ?");
        }
        return H(sb2.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    public final List<C2496d> H(String str, String[] strArr) {
        p();
        t();
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = w().query("conditional_properties", new String[]{"app_id", "origin", "name", "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"}, str, strArr, null, null, "rowid", "1001");
                if (!cursorQuery.moveToFirst()) {
                    cursorQuery.close();
                    return arrayList;
                }
                while (arrayList.size() < 1000) {
                    String string = cursorQuery.getString(0);
                    String string2 = cursorQuery.getString(1);
                    String string3 = cursorQuery.getString(2);
                    Object objC = C(cursorQuery, 3);
                    boolean z10 = cursorQuery.getInt(4) != 0;
                    String string4 = cursorQuery.getString(5);
                    long j10 = cursorQuery.getLong(6);
                    i iVarQ = q();
                    byte[] blob = cursorQuery.getBlob(7);
                    Parcelable.Creator<C2588z> creator = C2588z.CREATOR;
                    C2588z c2588z = (C2588z) iVarQ.B(blob, creator);
                    arrayList.add(new C2496d(string, string2, new v3(cursorQuery.getLong(10), objC, string3, string2), cursorQuery.getLong(8), z10, string4, c2588z, j10, (C2588z) q().B(cursorQuery.getBlob(9), creator), cursorQuery.getLong(11), (C2588z) q().B(cursorQuery.getBlob(12), creator)));
                    if (!cursorQuery.moveToNext()) {
                        cursorQuery.close();
                        return arrayList;
                    }
                }
                d().f41712f.b(Integer.valueOf(Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS), "Read more than the max allowed conditional properties, ignoring extra");
                cursorQuery.close();
                return arrayList;
            } catch (SQLiteException e10) {
                d().f41712f.b(e10, "Error querying conditional user property value");
                List<C2496d> listEmptyList = Collections.emptyList();
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return listEmptyList;
            }
        } catch (Throwable th) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:57:0x016b  */
    public final C2533l I(long j10, String str, long j11, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) throws Throwable {
        C0804l.e(str);
        p();
        t();
        String[] strArr = {str};
        C2533l c2533l = new C2533l();
        Cursor cursor = null;
        try {
            SQLiteDatabase sQLiteDatabaseW = w();
            Cursor cursorQuery = sQLiteDatabaseW.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count", "daily_realtime_dcu_count"}, "app_id=?", new String[]{str}, null, null, null);
            try {
                if (!cursorQuery.moveToFirst()) {
                    d().f41715i.b(B0.v(str), "Not updating daily counts, app is not known. appId");
                    cursorQuery.close();
                    return c2533l;
                }
                long j12 = cursorQuery.getLong(0);
                C2523i1 c2523i1 = (C2523i1) this.f3968a;
                if (j12 == j10) {
                    try {
                        c2533l.f42284b = cursorQuery.getLong(1);
                        c2533l.f42283a = cursorQuery.getLong(2);
                        c2533l.f42285c = cursorQuery.getLong(3);
                        c2533l.f42286d = cursorQuery.getLong(4);
                        c2533l.f42287e = cursorQuery.getLong(5);
                        C1930w4.a();
                        if (c2523i1.f42218g.B(null, B.f41638Q0)) {
                            c2533l.f42288f = cursorQuery.getLong(6);
                        }
                    } catch (SQLiteException e10) {
                        e = e10;
                        cursor = cursorQuery;
                        try {
                            d().f41712f.a(B0.v(str), e, "Error updating daily counts. appId");
                            if (cursor != null) {
                                cursor.close();
                            }
                            return c2533l;
                        } catch (Throwable th) {
                            th = th;
                            if (cursor != null) {
                                cursor.close();
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        cursor = cursorQuery;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                }
                if (z10) {
                    c2533l.f42284b += j11;
                }
                if (z11) {
                    c2533l.f42283a += j11;
                }
                if (z12) {
                    c2533l.f42285c += j11;
                }
                if (z13) {
                    c2533l.f42286d += j11;
                }
                if (z14) {
                    c2533l.f42287e += j11;
                }
                C1930w4.a();
                C2501e c2501e = c2523i1.f42218g;
                C2557r0<Boolean> c2557r0 = B.f41638Q0;
                if (c2501e.B(null, c2557r0) && z15) {
                    c2533l.f42288f += j11;
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("day", Long.valueOf(j10));
                contentValues.put("daily_public_events_count", Long.valueOf(c2533l.f42283a));
                contentValues.put("daily_events_count", Long.valueOf(c2533l.f42284b));
                contentValues.put("daily_conversions_count", Long.valueOf(c2533l.f42285c));
                contentValues.put("daily_error_events_count", Long.valueOf(c2533l.f42286d));
                contentValues.put("daily_realtime_events_count", Long.valueOf(c2533l.f42287e));
                C1930w4.a();
                if (c2523i1.f42218g.B(null, c2557r0)) {
                    contentValues.put("daily_realtime_dcu_count", Long.valueOf(c2533l.f42288f));
                }
                sQLiteDatabaseW.update("apps", contentValues, "app_id=?", strArr);
                cursorQuery.close();
                return c2533l;
            } catch (SQLiteException e11) {
                e = e11;
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (SQLiteException e12) {
            e = e12;
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public final void J(ContentValues contentValues) {
        try {
            SQLiteDatabase sQLiteDatabaseW = w();
            String asString = contentValues.getAsString("app_id");
            if (asString == null) {
                d().f41714h.b(B0.v("app_id"), "Value of the primary key is not set.");
            } else if (sQLiteDatabaseW.update("consent_settings", contentValues, "app_id = ?", new String[]{asString}) == 0 && sQLiteDatabaseW.insertWithOnConflict("consent_settings", null, contentValues, 5) == -1) {
                d().f41712f.a(B0.v("consent_settings"), B0.v("app_id"), "Failed to insert/update table (got -1). key");
            }
        } catch (SQLiteException e10) {
            d().f41712f.d("Error storing into table. key", B0.v("consent_settings"), B0.v("app_id"), e10);
        }
    }

    public final void L(C1934x1 c1934x1, boolean z10) {
        p();
        t();
        C0804l.e(c1934x1.c2());
        if (!c1934x1.t0()) {
            throw new IllegalStateException();
        }
        o0();
        ((C2523i1) this.f3968a).f42224n.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (c1934x1.F1() < jCurrentTimeMillis - C2501e.D() || c1934x1.F1() > C2501e.D() + jCurrentTimeMillis) {
            B0 b0D = d();
            b0D.f41715i.d("Storing bundle outside of the max uploading time span. appId, now, timestamp", B0.v(c1934x1.c2()), Long.valueOf(jCurrentTimeMillis), Long.valueOf(c1934x1.F1()));
        }
        try {
            byte[] bArrD0 = q().d0(c1934x1.i());
            B0 b0D2 = d();
            b0D2.f41719n.b(Integer.valueOf(bArrD0.length), "Saving bundle, size");
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", c1934x1.c2());
            contentValues.put("bundle_end_timestamp", Long.valueOf(c1934x1.F1()));
            contentValues.put("data", bArrD0);
            contentValues.put("has_realtime", Integer.valueOf(z10 ? 1 : 0));
            if (c1934x1.A0()) {
                contentValues.put("retry_count", Integer.valueOf(c1934x1.d1()));
            }
            try {
                if (w().insert("queue", null, contentValues) == -1) {
                    d().f41712f.b(B0.v(c1934x1.c2()), "Failed to insert bundle (got -1). appId");
                }
            } catch (SQLiteException e10) {
                B0 b0D3 = d();
                b0D3.f41712f.a(B0.v(c1934x1.c2()), e10, "Error storing bundle. appId");
            }
        } catch (IOException e11) {
            B0 b0D4 = d();
            b0D4.f41712f.a(B0.v(c1934x1.c2()), e11, "Data loss. Failed to serialize bundle. appId");
        }
    }

    public final void M(String str, b bVar) {
        C1930w4.a();
        if (((C2523i1) this.f3968a).f42218g.B(null, B.f41630M0)) {
            C0804l.h(str);
            C0804l.h(bVar);
            p();
            t();
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", str);
            contentValues.put("dma_consent_settings", bVar.f26544b);
            J(contentValues);
        }
    }

    public final void N(String str, Long l10, long j10, C1906t1 c1906t1) {
        p();
        t();
        C0804l.h(c1906t1);
        C0804l.e(str);
        byte[] bArrI = c1906t1.i();
        B0 b0D = d();
        b0D.f41719n.a(((C2523i1) this.f3968a).f42223m.b(str), Integer.valueOf(bArrI.length), "Saving complex main event, appId, data size");
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l10);
        contentValues.put("children_to_process", Long.valueOf(j10));
        contentValues.put("main_event", bArrI);
        try {
            if (w().insertWithOnConflict("main_event_params", null, contentValues, 5) == -1) {
                d().f41712f.b(B0.v(str), "Failed to insert complex main event (got -1). appId");
            }
        } catch (SQLiteException e10) {
            B0 b0D2 = d();
            b0D2.f41712f.a(B0.v(str), e10, "Error storing complex main event. appId");
        }
    }

    public final void O(String str, String str2) {
        C0804l.e(str);
        C0804l.e(str2);
        p();
        t();
        try {
            w().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e10) {
            B0 b0D = d();
            b0D.f41712f.d("Error deleting conditional property", B0.v(str), ((C2523i1) this.f3968a).f42223m.g(str2), e10);
        }
    }

    public final void P(String str, j3 j3Var) {
        p();
        t();
        C0804l.e(str);
        ((C2523i1) this.f3968a).f42224n.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jD = jCurrentTimeMillis - C2501e.D();
        long j10 = j3Var.f42257c;
        if (j10 < jD || j10 > C2501e.D() + jCurrentTimeMillis) {
            B0 b0D = d();
            b0D.f41715i.d("Storing trigger URI outside of the max retention time span. appId, now, timestamp", B0.v(str), Long.valueOf(jCurrentTimeMillis), Long.valueOf(j10));
        }
        d().f41719n.c("Saving trigger URI");
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("trigger_uri", j3Var.f42256b);
        contentValues.put("source", Integer.valueOf(j3Var.f42258d));
        contentValues.put("timestamp_millis", Long.valueOf(j10));
        try {
            if (w().insert("trigger_uris", null, contentValues) == -1) {
                d().f41712f.b(B0.v(str), "Failed to insert trigger URI (got -1). appId");
            }
        } catch (SQLiteException e10) {
            B0 b0D2 = d();
            b0D2.f41712f.a(B0.v(str), e10, "Error storing trigger URI. appId");
        }
    }

    public final void Q(List<Long> list) {
        p();
        t();
        C0804l.h(list);
        if (((ArrayList) list).size() == 0) {
            throw new IllegalArgumentException("Given Integer is zero");
        }
        if (((C2523i1) this.f3968a).f42212a.getDatabasePath("google_app_measurement.db").exists()) {
            String strB = d.b("(", TextUtils.join(",", list), ")");
            if (Z("SELECT COUNT(1) FROM queue WHERE rowid IN " + strB + " AND retry_count =  2147483647 LIMIT 1", null) > 0) {
                d().f41715i.c("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                w().execSQL("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN " + strB + " AND (retry_count IS NULL OR retry_count < 2147483647)");
            } catch (SQLiteException e10) {
                d().f41712f.b(e10, "Error incrementing retry count. error");
            }
        }
    }

    public final void R(C2572v c2572v) {
        C0804l.h(c2572v);
        p();
        t();
        ContentValues contentValues = new ContentValues();
        String str = c2572v.f42483a;
        contentValues.put("app_id", str);
        contentValues.put("name", c2572v.f42484b);
        contentValues.put("lifetime_count", Long.valueOf(c2572v.f42485c));
        contentValues.put("current_bundle_count", Long.valueOf(c2572v.f42486d));
        contentValues.put("last_fire_timestamp", Long.valueOf(c2572v.f42488f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(c2572v.f42489g));
        contentValues.put("last_bundled_day", c2572v.f42490h);
        contentValues.put("last_sampled_complex_event_id", c2572v.f42491i);
        contentValues.put("last_sampling_rate", c2572v.j);
        contentValues.put("current_session_count", Long.valueOf(c2572v.f42487e));
        Boolean bool = c2572v.f42492k;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (w().insertWithOnConflict("events", null, contentValues, 5) == -1) {
                d().f41712f.b(B0.v(str), "Failed to insert/update event aggregates (got -1). appId");
            }
        } catch (SQLiteException e10) {
            d().f41712f.a(B0.v(str), e10, "Error storing event aggregates. appId");
        }
    }

    public final void S(C2550p0 c2550p0) {
        p();
        t();
        String strD = c2550p0.d();
        C0804l.h(strD);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", strD);
        contentValues.put("app_instance_id", c2550p0.e());
        contentValues.put("gmp_app_id", c2550p0.h());
        C2523i1 c2523i1 = c2550p0.f42376a;
        C2493c1 c2493c1 = c2523i1.j;
        C2523i1.g(c2493c1);
        c2493c1.p();
        contentValues.put("resettable_device_id_hash", c2550p0.f42380e);
        C2493c1 c2493c2 = c2523i1.j;
        C2523i1.g(c2493c2);
        c2493c2.p();
        contentValues.put("last_bundle_index", Long.valueOf(c2550p0.f42382g));
        C2493c1 c2493c3 = c2523i1.j;
        C2523i1.g(c2493c3);
        c2493c3.p();
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(c2550p0.f42383h));
        C2493c1 c2493c4 = c2523i1.j;
        C2523i1.g(c2493c4);
        c2493c4.p();
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(c2550p0.f42384i));
        contentValues.put("app_version", c2550p0.f());
        C2493c1 c2493c5 = c2523i1.j;
        C2523i1.g(c2493c5);
        c2493c5.p();
        contentValues.put("app_store", c2550p0.f42386l);
        C2493c1 c2493c6 = c2523i1.j;
        C2523i1.g(c2493c6);
        c2493c6.p();
        contentValues.put("gmp_version", Long.valueOf(c2550p0.f42387m));
        C2493c1 c2493c7 = c2523i1.j;
        C2523i1.g(c2493c7);
        c2493c7.p();
        contentValues.put("dev_cert_hash", Long.valueOf(c2550p0.f42388n));
        C2493c1 c2493c8 = c2523i1.j;
        C2523i1.g(c2493c8);
        c2493c8.p();
        contentValues.put("measurement_enabled", Boolean.valueOf(c2550p0.f42389o));
        C2493c1 c2493c9 = c2523i1.j;
        C2523i1.g(c2493c9);
        c2493c9.p();
        contentValues.put("day", Long.valueOf(c2550p0.f42366G));
        C2493c1 c2493c10 = c2523i1.j;
        C2523i1.g(c2493c10);
        c2493c10.p();
        contentValues.put("daily_public_events_count", Long.valueOf(c2550p0.f42367H));
        C2523i1.g(c2493c10);
        c2493c10.p();
        contentValues.put("daily_events_count", Long.valueOf(c2550p0.f42368I));
        C2523i1.g(c2493c10);
        c2493c10.p();
        contentValues.put("daily_conversions_count", Long.valueOf(c2550p0.f42369J));
        C2493c1 c2493c11 = c2523i1.j;
        C2523i1.g(c2493c11);
        c2493c11.p();
        contentValues.put("config_fetched_time", Long.valueOf(c2550p0.f42374O));
        C2493c1 c2493c12 = c2523i1.j;
        C2523i1.g(c2493c12);
        c2493c12.p();
        contentValues.put("failed_config_fetch_time", Long.valueOf(c2550p0.f42375P));
        contentValues.put("app_version_int", Long.valueOf(c2550p0.w()));
        contentValues.put("firebase_instance_id", c2550p0.g());
        C2523i1.g(c2493c10);
        c2493c10.p();
        contentValues.put("daily_error_events_count", Long.valueOf(c2550p0.f42370K));
        C2523i1.g(c2493c10);
        c2493c10.p();
        contentValues.put("daily_realtime_events_count", Long.valueOf(c2550p0.f42371L));
        C2523i1.g(c2493c10);
        c2493c10.p();
        contentValues.put("health_monitor_sample", c2550p0.f42372M);
        C2493c1 c2493c13 = c2523i1.j;
        C2523i1.g(c2493c13);
        c2493c13.p();
        contentValues.put("android_id", (Long) 0L);
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(c2550p0.l()));
        contentValues.put("admob_app_id", c2550p0.T());
        contentValues.put("dynamite_version", Long.valueOf(c2550p0.L()));
        C2493c1 c2493c14 = c2523i1.j;
        C2523i1.g(c2493c14);
        c2493c14.p();
        contentValues.put("session_stitching_token", c2550p0.f42395u);
        contentValues.put("sgtm_upload_enabled", Boolean.valueOf(c2550p0.m()));
        C2493c1 c2493c15 = c2523i1.j;
        C2523i1.g(c2493c15);
        c2493c15.p();
        contentValues.put("target_os_version", Long.valueOf(c2550p0.f42397w));
        C2493c1 c2493c16 = c2523i1.j;
        C2523i1.g(c2493c16);
        c2493c16.p();
        contentValues.put("session_stitching_token_hash", Long.valueOf(c2550p0.f42398x));
        C1834i5.a();
        C2523i1 c2523i2 = (C2523i1) this.f3968a;
        if (c2523i2.f42218g.B(strD, B.f41614E0)) {
            C2493c1 c2493c17 = c2523i1.j;
            C2523i1.g(c2493c17);
            c2493c17.p();
            contentValues.put("ad_services_version", Integer.valueOf(c2550p0.f42399y));
            C2493c1 c2493c18 = c2523i1.j;
            C2523i1.g(c2493c18);
            c2493c18.p();
            contentValues.put("attribution_eligibility_status", Long.valueOf(c2550p0.f42360A));
        }
        C1889q4.a();
        if (c2523i2.f42218g.B(strD, B.f41640R0)) {
            C2493c1 c2493c19 = c2523i1.j;
            C2523i1.g(c2493c19);
            c2493c19.p();
            contentValues.put("unmatched_first_open_without_ad_id", Boolean.valueOf(c2550p0.f42400z));
        }
        C1930w4.a();
        if (c2523i2.f42218g.B(strD, B.f41630M0)) {
            contentValues.put("npa_metadata_value", c2550p0.S());
        }
        G5.a();
        if (c2523i2.f42218g.B(strD, B.f41697t0)) {
            o();
            if (z3.t0(strD)) {
                C2493c1 c2493c20 = c2523i1.j;
                C2523i1.g(c2493c20);
                c2493c20.p();
                contentValues.put("bundle_delivery_index", Long.valueOf(c2550p0.f42364E));
            }
        }
        G5.a();
        if (c2523i2.f42218g.B(strD, B.f41699u0)) {
            contentValues.put("sgtm_preview_key", c2550p0.j());
        }
        C1930w4.a();
        if (c2523i2.f42218g.B(strD, B.f41638Q0)) {
            C2523i1.g(c2493c10);
            c2493c10.p();
            contentValues.put("dma_consent_state", Integer.valueOf(c2550p0.f42362C));
            C2523i1.g(c2493c10);
            c2493c10.p();
            contentValues.put("daily_realtime_dcu_count", Integer.valueOf(c2550p0.f42363D));
        }
        C1812f4.a();
        if (c2523i2.f42218g.B(strD, B.f41652X0)) {
            contentValues.put("serialized_npa_metadata", c2550p0.i());
        }
        C2493c1 c2493c21 = c2523i1.j;
        C2523i1.g(c2493c21);
        c2493c21.p();
        ArrayList arrayList = c2550p0.f42394t;
        if (arrayList != null) {
            if (arrayList.isEmpty()) {
                d().f41715i.b(strD, "Safelisted events should not be an empty list. appId");
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", arrayList));
            }
        }
        ((A4) C1937x4.f25914c.get()).getClass();
        if (c2523i2.f42218g.B(null, B.f41687o0) && !contentValues.containsKey("safelisted_events")) {
            contentValues.put("safelisted_events", (String) null);
        }
        try {
            SQLiteDatabase sQLiteDatabaseW = w();
            if (sQLiteDatabaseW.update("apps", contentValues, "app_id = ?", new String[]{strD}) == 0 && sQLiteDatabaseW.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                d().f41712f.b(B0.v(strD), "Failed to insert/update app (got -1). appId");
            }
        } catch (SQLiteException e10) {
            d().f41712f.a(B0.v(strD), e10, "Error storing app. appId");
        }
    }

    public final boolean T(String str, int i10, Z0 z10) {
        t();
        p();
        C0804l.e(str);
        C0804l.h(z10);
        if (z10.D().isEmpty()) {
            d().f41715i.d("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", B0.v(str), Integer.valueOf(i10), String.valueOf(z10.J() ? Integer.valueOf(z10.z()) : null));
            return false;
        }
        byte[] bArrI = z10.i();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("audience_id", Integer.valueOf(i10));
        contentValues.put("filter_id", z10.J() ? Integer.valueOf(z10.z()) : null);
        contentValues.put("event_name", z10.D());
        contentValues.put("session_scoped", z10.K() ? Boolean.valueOf(z10.H()) : null);
        contentValues.put("data", bArrI);
        try {
            if (w().insertWithOnConflict("event_filters", null, contentValues, 5) != -1) {
                return true;
            }
            d().f41712f.b(B0.v(str), "Failed to insert event filter (got -1). appId");
            return true;
        } catch (SQLiteException e10) {
            d().f41712f.a(B0.v(str), e10, "Error storing event filter. appId");
            return false;
        }
    }

    public final boolean U(String str, int i10, C1781b1 c1781b1) {
        t();
        p();
        C0804l.e(str);
        C0804l.h(c1781b1);
        if (c1781b1.A().isEmpty()) {
            d().f41715i.d("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", B0.v(str), Integer.valueOf(i10), String.valueOf(c1781b1.E() ? Integer.valueOf(c1781b1.v()) : null));
            return false;
        }
        byte[] bArrI = c1781b1.i();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("audience_id", Integer.valueOf(i10));
        contentValues.put("filter_id", c1781b1.E() ? Integer.valueOf(c1781b1.v()) : null);
        contentValues.put("property_name", c1781b1.A());
        contentValues.put("session_scoped", c1781b1.F() ? Boolean.valueOf(c1781b1.D()) : null);
        contentValues.put("data", bArrI);
        try {
            if (w().insertWithOnConflict("property_filters", null, contentValues, 5) != -1) {
                return true;
            }
            d().f41712f.b(B0.v(str), "Failed to insert property filter (got -1). appId");
            return false;
        } catch (SQLiteException e10) {
            d().f41712f.a(B0.v(str), e10, "Error storing property filter. appId");
            return false;
        }
    }

    public final boolean V(C2496d c2496d) {
        p();
        t();
        String str = c2496d.f42123b;
        C0804l.h(str);
        if (h0(str, c2496d.f42125d.f42503c) == null && Z("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str}) >= 1000) {
            return false;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", c2496d.f42124c);
        contentValues.put("name", c2496d.f42125d.f42503c);
        Object objA = c2496d.f42125d.a();
        C0804l.h(objA);
        K(contentValues, objA);
        contentValues.put("active", Boolean.valueOf(c2496d.f42127f));
        contentValues.put("trigger_event_name", c2496d.f42128g);
        contentValues.put("trigger_timeout", Long.valueOf(c2496d.f42130i));
        o();
        contentValues.put("timed_out_event", z3.g0(c2496d.f42129h));
        contentValues.put("creation_timestamp", Long.valueOf(c2496d.f42126e));
        o();
        contentValues.put("triggered_event", z3.g0(c2496d.j));
        contentValues.put("triggered_timestamp", Long.valueOf(c2496d.f42125d.f42504d));
        contentValues.put("time_to_live", Long.valueOf(c2496d.f42131k));
        o();
        contentValues.put("expired_event", z3.g0(c2496d.f42132l));
        try {
            if (w().insertWithOnConflict("conditional_properties", null, contentValues, 5) != -1) {
                return true;
            }
            d().f41712f.b(B0.v(str), "Failed to insert/update conditional user property (got -1)");
            return true;
        } catch (SQLiteException e10) {
            B0 b0D = d();
            b0D.f41712f.a(B0.v(str), e10, "Error storing conditional user property");
            return true;
        }
    }

    public final boolean W(r rVar, long j10, boolean z10) {
        p();
        t();
        String str = rVar.f42417a;
        C0804l.e(str);
        i iVarQ = q();
        C1906t1.a aVarI = C1906t1.I();
        aVarI.h();
        C1906t1.F(rVar.f42421e, (C1906t1) aVarI.f25531c);
        C2568u c2568u = rVar.f42422f;
        c2568u.getClass();
        Bundle bundle = c2568u.f42473b;
        for (String str2 : bundle.keySet()) {
            C1920v1.a aVarJ = C1920v1.J();
            aVarJ.l(str2);
            Object obj = bundle.get(str2);
            C0804l.h(obj);
            iVarQ.Q(aVarJ, obj);
            aVarI.j(aVarJ);
        }
        byte[] bArrI = ((C1906t1) aVarI.f()).i();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("name", rVar.f42418b);
        contentValues.put("timestamp", Long.valueOf(rVar.f42420d));
        contentValues.put("metadata_fingerprint", Long.valueOf(j10));
        contentValues.put("data", bArrI);
        contentValues.put("realtime", Integer.valueOf(z10 ? 1 : 0));
        try {
            if (w().insert("raw_events", null, contentValues) != -1) {
                return true;
            }
            d().f41712f.b(B0.v(str), "Failed to insert raw event (got -1). appId");
            return false;
        } catch (SQLiteException e10) {
            B0 b0D = d();
            b0D.f41712f.a(B0.v(str), e10, "Error storing raw event. appId");
            return false;
        }
    }

    public final boolean X(w3 w3Var) {
        p();
        t();
        String str = w3Var.f42519a;
        String str2 = w3Var.f42521c;
        w3 w3VarH0 = h0(str, str2);
        String str3 = w3Var.f42520b;
        if (w3VarH0 == null) {
            if (z3.x0(str2)) {
                if (Z("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{str}) >= Math.max(Math.min(((C2523i1) this.f3968a).f42218g.u(str, B.f41619H), 100), 25)) {
                    return false;
                }
            } else if (!"_npa".equals(str2) && Z("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{str, str3}) >= 25) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", str3);
        contentValues.put("name", str2);
        contentValues.put("set_timestamp", Long.valueOf(w3Var.f42522d));
        K(contentValues, w3Var.f42523e);
        try {
            if (w().insertWithOnConflict("user_attributes", null, contentValues, 5) != -1) {
                return true;
            }
            d().f41712f.b(B0.v(str), "Failed to insert/update user property (got -1). appId");
            return true;
        } catch (SQLiteException e10) {
            d().f41712f.a(B0.v(str), e10, "Error storing user property. appId");
            return true;
        }
    }

    public final long Y(String str) {
        C0804l.e(str);
        C0804l.e("first_open_count");
        p();
        t();
        SQLiteDatabase sQLiteDatabaseW = w();
        sQLiteDatabaseW.beginTransaction();
        long j10 = 0;
        try {
            try {
                long jB = B("select first_open_count from app2 where app_id=?", new String[]{str}, -1L);
                if (jB == -1) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("app_id", str);
                    contentValues.put("first_open_count", (Integer) 0);
                    contentValues.put("previous_install_count", (Integer) 0);
                    if (sQLiteDatabaseW.insertWithOnConflict("app2", null, contentValues, 5) == -1) {
                        d().f41712f.a(B0.v(str), "first_open_count", "Failed to insert column (got -1). appId");
                        return -1L;
                    }
                    jB = 0;
                    d().f41712f.d("Error inserting column. appId", B0.v(str), "first_open_count", e);
                    return j10;
                }
                try {
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put("app_id", str);
                    contentValues2.put("first_open_count", Long.valueOf(1 + jB));
                    if (sQLiteDatabaseW.update("app2", contentValues2, "app_id = ?", new String[]{str}) == 0) {
                        d().f41712f.a(B0.v(str), "first_open_count", "Failed to update column (got 0). appId");
                        return -1L;
                    }
                    sQLiteDatabaseW.setTransactionSuccessful();
                    return jB;
                } catch (SQLiteException e10) {
                    long j11 = jB;
                    e = e10;
                    j10 = j11;
                }
            } finally {
                sQLiteDatabaseW.endTransaction();
            }
        } catch (SQLiteException e11) {
            e = e11;
        }
    }

    public final long Z(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor cursorRawQuery = w().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    throw new SQLiteException("Database returned empty set");
                }
                long j10 = cursorRawQuery.getLong(0);
                cursorRawQuery.close();
                return j10;
            } catch (SQLiteException e10) {
                d().f41712f.a(str, e10, "Database error");
                throw e10;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x011a  */
    /* JADX WARN: Code duplicated, block: B:51:0x0120  */
    public final List<w3> a0(String str, String str2, String str3) throws Throwable {
        String str4;
        C0804l.e(str);
        p();
        t();
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                ArrayList arrayList2 = new ArrayList(3);
                try {
                    arrayList2.add(str);
                    StringBuilder sb2 = new StringBuilder("app_id=?");
                    if (TextUtils.isEmpty(str2)) {
                        str4 = str2;
                    } else {
                        str4 = str2;
                        try {
                            arrayList2.add(str4);
                            sb2.append(" and origin=?");
                        } catch (SQLiteException e10) {
                            e = e10;
                            d().f41712f.d("(2)Error querying user properties", B0.v(str), str4, e);
                            List<w3> listEmptyList = Collections.emptyList();
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            return listEmptyList;
                        }
                    }
                    if (!TextUtils.isEmpty(str3)) {
                        arrayList2.add(str3 + "*");
                        sb2.append(" and name glob ?");
                    }
                    cursorQuery = w().query("user_attributes", new String[]{"name", "set_timestamp", "value", "origin"}, sb2.toString(), (String[]) arrayList2.toArray(new String[arrayList2.size()]), null, null, "rowid", "1001");
                    if (!cursorQuery.moveToFirst()) {
                        cursorQuery.close();
                        return arrayList;
                    }
                    while (arrayList.size() < 1000) {
                        String string = cursorQuery.getString(0);
                        long j10 = cursorQuery.getLong(1);
                        try {
                            try {
                                Object objC = C(cursorQuery, 2);
                                String string2 = cursorQuery.getString(3);
                                if (objC == null) {
                                    try {
                                        d().f41712f.d("(2)Read invalid user property value, ignoring it", B0.v(str), string2, str3);
                                    } catch (SQLiteException e11) {
                                        e = e11;
                                        str4 = string2;
                                        d().f41712f.d("(2)Error querying user properties", B0.v(str), str4, e);
                                        List<w3> listEmptyList2 = Collections.emptyList();
                                        if (cursorQuery != null) {
                                            cursorQuery.close();
                                        }
                                        return listEmptyList2;
                                    }
                                } else {
                                    arrayList.add(new w3(str, string2, string, j10, objC));
                                }
                                if (!cursorQuery.moveToNext()) {
                                    cursorQuery.close();
                                    return arrayList;
                                }
                                str4 = string2;
                            } catch (SQLiteException e12) {
                                e = e12;
                            }
                        } catch (Throwable th) {
                            th = th;
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            throw th;
                        }
                    }
                    d().f41712f.b(Integer.valueOf(Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS), "Read more than the max allowed user properties, ignoring excess");
                    cursorQuery.close();
                    return arrayList;
                } catch (SQLiteException e13) {
                    e = e13;
                    str4 = str2;
                    d().f41712f.d("(2)Error querying user properties", B0.v(str), str4, e);
                    List<w3> listEmptyList3 = Collections.emptyList();
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return listEmptyList3;
                }
            } catch (Throwable th2) {
                th = th2;
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                throw th;
            }
        } catch (SQLiteException e14) {
            e = e14;
        }
    }

    public final void b0(String str, ArrayList arrayList) {
        C0804l.e(str);
        t();
        p();
        SQLiteDatabase sQLiteDatabaseW = w();
        try {
            long jZ = Z("select count(1) from audience_filter_values where app_id=?", new String[]{str});
            int iMax = Math.max(0, Math.min(2000, ((C2523i1) this.f3968a).f42218g.u(str, B.f41617G)));
            if (jZ <= iMax) {
                return;
            }
            ArrayList arrayList2 = new ArrayList();
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                Integer num = (Integer) arrayList.get(i10);
                if (num == null) {
                    return;
                }
                arrayList2.add(Integer.toString(num.intValue()));
            }
            sQLiteDatabaseW.delete("audience_filter_values", d.b("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ", d.b("(", TextUtils.join(",", arrayList2), ")"), " order by rowid desc limit -1 offset ?)"), new String[]{str, Integer.toString(iMax)});
        } catch (SQLiteException e10) {
            d().f41712f.a(B0.v(str), e10, "Database error querying filters. appId");
        }
    }

    public final long c0(String str) {
        C0804l.e(str);
        p();
        t();
        return B("select first_open_count from app2 where app_id=?", new String[]{str}, -1L);
    }

    public final long d0(String str) {
        C0804l.e(str);
        return B("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    public final C2496d e0(String str, String str2) throws Throwable {
        Cursor cursorQuery;
        C2523i1 c2523i1 = (C2523i1) this.f3968a;
        C0804l.e(str);
        C0804l.e(str2);
        p();
        t();
        Cursor cursor = null;
        try {
            cursorQuery = w().query("conditional_properties", new String[]{"origin", "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
            try {
                try {
                    if (!cursorQuery.moveToFirst()) {
                        cursorQuery.close();
                        return null;
                    }
                    String string = cursorQuery.getString(0);
                    if (string == null) {
                        string = "";
                    }
                    String str3 = string;
                    Object objC = C(cursorQuery, 1);
                    boolean z10 = cursorQuery.getInt(2) != 0;
                    String string2 = cursorQuery.getString(3);
                    long j10 = cursorQuery.getLong(4);
                    i iVarQ = q();
                    byte[] blob = cursorQuery.getBlob(5);
                    Parcelable.Creator<C2588z> creator = C2588z.CREATOR;
                    C2496d c2496d = new C2496d(str, str3, new v3(cursorQuery.getLong(8), objC, str2, str3), cursorQuery.getLong(6), z10, string2, (C2588z) iVarQ.B(blob, creator), j10, (C2588z) q().B(cursorQuery.getBlob(7), creator), cursorQuery.getLong(9), (C2588z) q().B(cursorQuery.getBlob(10), creator));
                    if (cursorQuery.moveToNext()) {
                        d().f41712f.a(B0.v(str), c2523i1.f42223m.g(str2), "Got multiple records for conditional property, expected one");
                    }
                    cursorQuery.close();
                    return c2496d;
                } catch (SQLiteException e10) {
                    e = e10;
                    d().f41712f.d("Error querying conditional property", B0.v(str), c2523i1.f42223m.g(str2), e);
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                cursor = cursorQuery;
            }
        } catch (SQLiteException e11) {
            e = e11;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
        }
        th = th;
        cursor = cursorQuery;
        if (cursor != null) {
            cursor.close();
        }
        throw th;
    }

    /* JADX WARN: Code duplicated, block: B:62:0x0135  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r2v7 */
    public final C2572v f0(String str, String str2) {
        Boolean boolValueOf;
        C0804l.e(str);
        C0804l.e(str2);
        p();
        t();
        ?? r10 = "current_bundle_count";
        ?? r11 = 0;
        try {
            try {
                Cursor cursorQuery = w().query("events", (String[]) new ArrayList(Arrays.asList("lifetime_count", "current_bundle_count", "last_fire_timestamp", "last_bundled_timestamp", "last_bundled_day", "last_sampled_complex_event_id", "last_sampling_rate", "last_exempt_from_sampling", "current_session_count")).toArray(new String[0]), "app_id=? and name=?", new String[]{str, str2}, null, null, null);
                try {
                    if (!cursorQuery.moveToFirst()) {
                        cursorQuery.close();
                        return null;
                    }
                    long j10 = cursorQuery.getLong(0);
                    long j11 = cursorQuery.getLong(1);
                    long j12 = cursorQuery.getLong(2);
                    long j13 = cursorQuery.isNull(3) ? 0L : cursorQuery.getLong(3);
                    Long lValueOf = cursorQuery.isNull(4) ? null : Long.valueOf(cursorQuery.getLong(4));
                    Long lValueOf2 = cursorQuery.isNull(5) ? null : Long.valueOf(cursorQuery.getLong(5));
                    Long lValueOf3 = cursorQuery.isNull(6) ? null : Long.valueOf(cursorQuery.getLong(6));
                    if (cursorQuery.isNull(7)) {
                        boolValueOf = null;
                    } else {
                        boolValueOf = Boolean.valueOf(cursorQuery.getLong(7) == 1);
                    }
                    C2572v c2572v = new C2572v(str, str2, j10, j11, cursorQuery.isNull(8) ? 0L : cursorQuery.getLong(8), j12, j13, lValueOf, lValueOf2, lValueOf3, boolValueOf);
                    if (cursorQuery.moveToNext()) {
                        d().f41712f.b(B0.v(str), "Got multiple records for event aggregates, expected one. appId");
                    }
                    cursorQuery.close();
                    return c2572v;
                } catch (SQLiteException e10) {
                    e = e10;
                    r10 = cursorQuery;
                    try {
                        try {
                            d().f41712f.d("Error querying events. appId", B0.v(str), ((C2523i1) this.f3968a).f42223m.b(str2), e);
                            if (r10 != 0) {
                                r10.close();
                            }
                            return null;
                        } catch (Throwable th) {
                            th = th;
                            r11 = r10;
                            if (r11 != 0) {
                                r11.close();
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        r11 = r10;
                        if (r11 != 0) {
                            r11.close();
                        }
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                r11 = r10;
                if (r11 != 0) {
                    r11.close();
                }
                throw th;
            }
        } catch (SQLiteException e11) {
            e = e11;
            r10 = 0;
        } catch (Throwable th4) {
            th = th4;
            if (r11 != 0) {
                r11.close();
            }
            throw th;
        }
    }

    public final C2550p0 g0(String str) {
        Cursor cursorQuery;
        Boolean boolValueOf;
        C0804l.e(str);
        p();
        t();
        Cursor cursor = null;
        try {
            cursorQuery = w().query("apps", new String[]{"app_instance_id", "gmp_app_id", "resettable_device_id_hash", "last_bundle_index", "last_bundle_start_timestamp", "last_bundle_end_timestamp", "app_version", "app_store", "gmp_version", "dev_cert_hash", "measurement_enabled", "day", "daily_public_events_count", "daily_events_count", "daily_conversions_count", "config_fetched_time", "failed_config_fetch_time", "app_version_int", "firebase_instance_id", "daily_error_events_count", "daily_realtime_events_count", "health_monitor_sample", "android_id", "adid_reporting_enabled", "admob_app_id", "dynamite_version", "safelisted_events", "ga_app_id", "session_stitching_token", "sgtm_upload_enabled", "target_os_version", "session_stitching_token_hash", "ad_services_version", "unmatched_first_open_without_ad_id", "npa_metadata_value", "attribution_eligibility_status", "sgtm_preview_key", "dma_consent_state", "daily_realtime_dcu_count", "bundle_delivery_index", "serialized_npa_metadata"}, "app_id=?", new String[]{str}, null, null, null);
            try {
                try {
                    if (!cursorQuery.moveToFirst()) {
                        cursorQuery.close();
                        return null;
                    }
                    C2550p0 c2550p0 = new C2550p0(this.f42311b.f26609l, str);
                    C2523i1 c2523i1 = c2550p0.f42376a;
                    c2550p0.p(cursorQuery.getString(0));
                    boolean z10 = true;
                    c2550p0.A(cursorQuery.getString(1));
                    c2550p0.E(cursorQuery.getString(2));
                    c2550p0.O(cursorQuery.getLong(3));
                    c2550p0.P(cursorQuery.getLong(4));
                    c2550p0.N(cursorQuery.getLong(5));
                    c2550p0.v(cursorQuery.getString(6));
                    c2550p0.t(cursorQuery.getString(7));
                    c2550p0.K(cursorQuery.getLong(8));
                    c2550p0.H(cursorQuery.getLong(9));
                    c2550p0.q(cursorQuery.isNull(10) || cursorQuery.getInt(10) != 0);
                    c2550p0.G(cursorQuery.getLong(11));
                    c2550p0.D(cursorQuery.getLong(12));
                    c2550p0.B(cursorQuery.getLong(13));
                    c2550p0.x(cursorQuery.getLong(14));
                    c2550p0.u(cursorQuery.getLong(15));
                    c2550p0.J(cursorQuery.getLong(16));
                    c2550p0.o(cursorQuery.isNull(17) ? -2147483648L : cursorQuery.getInt(17));
                    c2550p0.y(cursorQuery.getString(18));
                    c2550p0.z(cursorQuery.getLong(19));
                    c2550p0.F(cursorQuery.getLong(20));
                    c2550p0.C(cursorQuery.getString(21));
                    boolean z11 = cursorQuery.isNull(23) || cursorQuery.getInt(23) != 0;
                    C2493c1 c2493c1 = c2523i1.j;
                    C2523i1.g(c2493c1);
                    c2493c1.p();
                    c2550p0.f42373N |= c2550p0.f42390p != z11;
                    c2550p0.f42390p = z11;
                    c2550p0.b(cursorQuery.getString(24));
                    c2550p0.I(cursorQuery.isNull(25) ? 0L : cursorQuery.getLong(25));
                    if (!cursorQuery.isNull(26)) {
                        c2550p0.c(Arrays.asList(cursorQuery.getString(26).split(",", -1)));
                    }
                    C1924v5.a();
                    C2523i1 c2523i2 = (C2523i1) this.f3968a;
                    if (c2523i2.f42218g.B(str, B.f41695s0) || c2523i2.f42218g.B(null, B.f41691q0)) {
                        String string = cursorQuery.getString(28);
                        C2493c1 c2493c2 = c2523i1.j;
                        C2523i1.g(c2493c2);
                        c2493c2.p();
                        c2550p0.f42373N |= !Objects.equals(c2550p0.f42395u, string);
                        c2550p0.f42395u = string;
                    }
                    G5.a();
                    if (c2523i2.f42218g.B(null, B.f41697t0)) {
                        o();
                        if (z3.t0(str)) {
                            boolean z12 = (cursorQuery.isNull(29) || cursorQuery.getInt(29) == 0) ? false : true;
                            C2493c1 c2493c3 = c2523i1.j;
                            C2523i1.g(c2493c3);
                            c2493c3.p();
                            c2550p0.f42373N |= c2550p0.f42396v != z12;
                            c2550p0.f42396v = z12;
                            c2550p0.M(cursorQuery.getLong(39));
                            if (c2523i2.f42218g.B(null, B.f41699u0)) {
                                String string2 = cursorQuery.getString(36);
                                C2493c1 c2493c4 = c2523i1.j;
                                C2523i1.g(c2493c4);
                                c2493c4.p();
                                c2550p0.f42373N |= c2550p0.f42361B != string2;
                                c2550p0.f42361B = string2;
                            }
                        }
                    }
                    c2550p0.R(cursorQuery.getLong(30));
                    c2550p0.Q(cursorQuery.getLong(31));
                    C1834i5.a();
                    if (c2523i2.f42218g.B(str, B.f41614E0)) {
                        int i10 = cursorQuery.getInt(32);
                        C2493c1 c2493c5 = c2523i1.j;
                        C2523i1.g(c2493c5);
                        c2493c5.p();
                        c2550p0.f42373N |= c2550p0.f42399y != i10;
                        c2550p0.f42399y = i10;
                        c2550p0.s(cursorQuery.getLong(35));
                    }
                    C1889q4.a();
                    if (c2523i2.f42218g.B(str, B.f41640R0)) {
                        boolean z13 = (cursorQuery.isNull(33) || cursorQuery.getInt(33) == 0) ? false : true;
                        C2493c1 c2493c6 = c2523i1.j;
                        C2523i1.g(c2493c6);
                        c2493c6.p();
                        c2550p0.f42373N |= c2550p0.f42400z != z13;
                        c2550p0.f42400z = z13;
                    }
                    C1930w4.a();
                    if (c2523i2.f42218g.B(str, B.f41630M0)) {
                        if (cursorQuery.isNull(34)) {
                            boolValueOf = null;
                        } else {
                            boolValueOf = Boolean.valueOf(cursorQuery.getInt(34) != 0);
                        }
                        C2493c1 c2493c7 = c2523i1.j;
                        C2523i1.g(c2493c7);
                        c2493c7.p();
                        c2550p0.f42373N |= !Objects.equals(c2550p0.f42392r, boolValueOf);
                        c2550p0.f42392r = boolValueOf;
                    }
                    C1930w4.a();
                    if (c2523i2.f42218g.B(str, B.f41638Q0)) {
                        c2550p0.r(cursorQuery.getInt(37));
                        c2550p0.n(cursorQuery.getInt(38));
                    }
                    C1812f4.a();
                    if (c2523i2.f42218g.B(str, B.f41652X0)) {
                        String string3 = cursorQuery.getString(40);
                        if (string3 == null) {
                            string3 = "";
                        }
                        C2493c1 c2493c8 = c2523i1.j;
                        C2523i1.g(c2493c8);
                        c2493c8.p();
                        boolean z14 = c2550p0.f42373N;
                        if (c2550p0.f42365F == string3) {
                            z10 = false;
                        }
                        c2550p0.f42373N = z10 | z14;
                        c2550p0.f42365F = string3;
                    }
                    C2493c1 c2493c9 = c2523i1.j;
                    C2523i1.g(c2493c9);
                    c2493c9.p();
                    c2550p0.f42373N = false;
                    if (cursorQuery.moveToNext()) {
                        d().f41712f.b(B0.v(str), "Got multiple records for app, expected one. appId");
                    }
                    cursorQuery.close();
                    return c2550p0;
                } catch (SQLiteException e10) {
                    e = e10;
                    d().f41712f.a(B0.v(str), e, "Error querying app. appId");
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                cursor = cursorQuery;
            }
        } catch (SQLiteException e11) {
            e = e11;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
        }
        th = th;
        cursor = cursorQuery;
        if (cursor != null) {
            cursor.close();
        }
        throw th;
    }

    public final w3 h0(String str, String str2) {
        Cursor cursorQuery;
        C0804l.e(str);
        C0804l.e(str2);
        p();
        t();
        Cursor cursor = null;
        try {
            cursorQuery = w().query("user_attributes", new String[]{"set_timestamp", "value", "origin"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
            try {
                try {
                    if (!cursorQuery.moveToFirst()) {
                        cursorQuery.close();
                        return null;
                    }
                    long j10 = cursorQuery.getLong(0);
                    Object objC = C(cursorQuery, 1);
                    if (objC == null) {
                        cursorQuery.close();
                        return null;
                    }
                    w3 w3Var = new w3(str, cursorQuery.getString(2), str2, j10, objC);
                    if (cursorQuery.moveToNext()) {
                        d().f41712f.b(B0.v(str), "Got multiple records for user property, expected one. appId");
                    }
                    cursorQuery.close();
                    return w3Var;
                } catch (SQLiteException e10) {
                    e = e10;
                    d().f41712f.d("Error querying user property. appId", B0.v(str), ((C2523i1) this.f3968a).f42223m.g(str2), e);
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                cursor = cursorQuery;
            }
        } catch (SQLiteException e11) {
            e = e11;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
        }
        th = th;
        cursor = cursorQuery;
        if (cursor != null) {
            cursor.close();
        }
        throw th;
    }

    public final Map<Integer, List<Z0>> i0(String str, String str2) {
        t();
        p();
        C0804l.e(str);
        C0804l.e(str2);
        C0873a c0873a = new C0873a();
        Cursor cursor = null;
        try {
            try {
                Cursor cursorQuery = w().query("event_filters", new String[]{"audience_id", "data"}, "app_id=? AND event_name=?", new String[]{str, str2}, null, null, null);
                if (!cursorQuery.moveToFirst()) {
                    Map<Integer, List<Z0>> mapEmptyMap = Collections.emptyMap();
                    cursorQuery.close();
                    return mapEmptyMap;
                }
                do {
                    try {
                        Z0 z10 = (Z0) ((Z0.a) i.D(Z0.A(), cursorQuery.getBlob(1))).f();
                        int i10 = cursorQuery.getInt(0);
                        List arrayList = (List) c0873a.get(Integer.valueOf(i10));
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            c0873a.put(Integer.valueOf(i10), arrayList);
                        }
                        arrayList.add(z10);
                    } catch (IOException e10) {
                        d().f41712f.a(B0.v(str), e10, "Failed to merge filter. appId");
                    }
                } while (cursorQuery.moveToNext());
                cursorQuery.close();
                return c0873a;
            } catch (SQLiteException e11) {
                d().f41712f.a(B0.v(str), e11, "Database error querying filters. appId");
                Map<Integer, List<Z0>> mapEmptyMap2 = Collections.emptyMap();
                if (0 != 0) {
                    cursor.close();
                }
                return mapEmptyMap2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    public final Map<Integer, List<C1781b1>> j0(String str, String str2) {
        t();
        p();
        C0804l.e(str);
        C0804l.e(str2);
        C0873a c0873a = new C0873a();
        Cursor cursor = null;
        try {
            try {
                Cursor cursorQuery = w().query("property_filters", new String[]{"audience_id", "data"}, "app_id=? AND property_name=?", new String[]{str, str2}, null, null, null);
                if (!cursorQuery.moveToFirst()) {
                    Map<Integer, List<C1781b1>> mapEmptyMap = Collections.emptyMap();
                    cursorQuery.close();
                    return mapEmptyMap;
                }
                do {
                    try {
                        C1781b1 c1781b1 = (C1781b1) ((C1781b1.a) i.D(C1781b1.y(), cursorQuery.getBlob(1))).f();
                        int i10 = cursorQuery.getInt(0);
                        List arrayList = (List) c0873a.get(Integer.valueOf(i10));
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            c0873a.put(Integer.valueOf(i10), arrayList);
                        }
                        arrayList.add(c1781b1);
                    } catch (IOException e10) {
                        d().f41712f.a(B0.v(str), e10, "Failed to merge filter");
                    }
                } while (cursorQuery.moveToNext());
                cursorQuery.close();
                return c0873a;
            } catch (SQLiteException e11) {
                d().f41712f.a(B0.v(str), e11, "Database error querying filters. appId");
                Map<Integer, List<C1781b1>> mapEmptyMap2 = Collections.emptyMap();
                if (0 != 0) {
                    cursor.close();
                }
                return mapEmptyMap2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    public final void k0(String str, String str2) {
        C0804l.e(str);
        C0804l.e(str2);
        p();
        t();
        try {
            w().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e10) {
            B0 b0D = d();
            b0D.f41712f.d("Error deleting user property. appId", B0.v(str), ((C2523i1) this.f3968a).f42223m.g(str2), e10);
        }
    }

    public final List<w3> l0(String str) {
        C0804l.e(str);
        p();
        t();
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = w().query("user_attributes", new String[]{"name", "origin", "set_timestamp", "value"}, "app_id=?", new String[]{str}, null, null, "rowid", "1000");
                if (!cursorQuery.moveToFirst()) {
                    cursorQuery.close();
                    return arrayList;
                }
                do {
                    String string = cursorQuery.getString(0);
                    String string2 = cursorQuery.getString(1);
                    if (string2 == null) {
                        string2 = "";
                    }
                    String str2 = string2;
                    long j10 = cursorQuery.getLong(2);
                    Object objC = C(cursorQuery, 3);
                    if (objC == null) {
                        d().f41712f.b(B0.v(str), "Read invalid user property value, ignoring it. appId");
                    } else {
                        arrayList.add(new w3(str, str2, string, j10, objC));
                    }
                } while (cursorQuery.moveToNext());
                cursorQuery.close();
                return arrayList;
            } catch (SQLiteException e10) {
                d().f41712f.a(B0.v(str), e10, "Error querying user properties. appId");
                List<w3> listEmptyList = Collections.emptyList();
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return listEmptyList;
            }
        } catch (Throwable th) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
    }

    public final void m0() {
        t();
        w().beginTransaction();
    }

    public final void n0() {
        t();
        w().endTransaction();
    }

    public final void o0() {
        p();
        t();
        C2523i1 c2523i1 = (C2523i1) this.f3968a;
        if (c2523i1.f42212a.getDatabasePath("google_app_measurement.db").exists()) {
            h hVar = this.f42311b;
            long jA = hVar.f26607i.f41996e.a();
            c2523i1.f42224n.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (Math.abs(jElapsedRealtime - jA) > B.f41707z.a(null).longValue()) {
                hVar.f26607i.f41996e.b(jElapsedRealtime);
                p();
                t();
                if (c2523i1.f42212a.getDatabasePath("google_app_measurement.db").exists()) {
                    SQLiteDatabase sQLiteDatabaseW = w();
                    c2523i1.f42224n.getClass();
                    int iDelete = sQLiteDatabaseW.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(System.currentTimeMillis()), String.valueOf(C2501e.D())});
                    if (iDelete > 0) {
                        B0 b0D = d();
                        b0D.f41719n.b(Integer.valueOf(iDelete), "Deleted stale rows. rowsDeleted");
                    }
                }
            }
        }
    }

    public final void p0() {
        t();
        w().setTransactionSuccessful();
    }

    @Override // p131k5.m3
    public final boolean v() {
        return false;
    }

    public final SQLiteDatabase w() {
        p();
        try {
            return this.f42268d.getWritableDatabase();
        } catch (SQLiteException e10) {
            d().f41715i.b(e10, "Error opening database");
            throw e10;
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x003c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.database.Cursor] */
    public final String y() throws Throwable {
        Throwable th;
        Cursor cursorRawQuery;
        ?? W10 = w();
        try {
            try {
                cursorRawQuery = W10.rawQuery("select app_id from queue order by has_realtime desc, rowid asc limit 1;", null);
                try {
                    if (!cursorRawQuery.moveToFirst()) {
                        cursorRawQuery.close();
                        return null;
                    }
                    String string = cursorRawQuery.getString(0);
                    cursorRawQuery.close();
                    return string;
                } catch (SQLiteException e10) {
                    e = e10;
                    d().f41712f.b(e, "Database error getting next bundle app id");
                    if (cursorRawQuery != null) {
                        cursorRawQuery.close();
                    }
                    return null;
                }
            } catch (Throwable th2) {
                th = th2;
                if (W10 != 0) {
                    W10.close();
                }
                throw th;
            }
        } catch (SQLiteException e11) {
            e = e11;
            cursorRawQuery = null;
        } catch (Throwable th3) {
            th = th3;
            W10 = 0;
            if (W10 != 0) {
                W10.close();
            }
            throw th;
        }
    }

    public final long z(C1934x1 c1934x1) throws IOException {
        p();
        t();
        C0804l.e(c1934x1.c2());
        byte[] bArrI = c1934x1.i();
        long jY = q().y(bArrI);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", c1934x1.c2());
        contentValues.put("metadata_fingerprint", Long.valueOf(jY));
        contentValues.put("metadata", bArrI);
        try {
            w().insertWithOnConflict("raw_events_metadata", null, contentValues, 4);
            return jY;
        } catch (SQLiteException e10) {
            B0 b0D = d();
            b0D.f41712f.a(B0.v(c1934x1.c2()), e10, "Error storing raw event metadata. appId");
            throw e10;
        }
    }
}
