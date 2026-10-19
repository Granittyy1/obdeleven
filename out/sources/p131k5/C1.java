package p131k5;

import U4.C0804l;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.C1834i5;
import com.google.android.gms.measurement.internal.h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1 implements Callable<List<j3>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o3 f41728b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Bundle f41729c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ BinderC2535l1 f41730d;

    public C1(BinderC2535l1 binderC2535l1, o3 o3Var, Bundle bundle) {
        this.f41728b = o3Var;
        this.f41729c = bundle;
        this.f41730d = binderC2535l1;
    }

    @Override // java.util.concurrent.Callable
    public final List<j3> call() throws Exception {
        String str;
        List<j3> list;
        BinderC2535l1 binderC2535l1 = this.f41730d;
        binderC2535l1.f42293c.Y();
        h hVar = binderC2535l1.f42293c;
        hVar.i().p();
        C1834i5.a();
        C2501e c2501eS = hVar.S();
        o3 o3Var = this.f41728b;
        if (!c2501eS.B(o3Var.f42332b, B.f41614E0) || (str = o3Var.f42332b) == null) {
            return new ArrayList();
        }
        Bundle bundle = this.f41729c;
        if (bundle != null) {
            int[] intArray = bundle.getIntArray("uriSources");
            long[] longArray = bundle.getLongArray("uriTimestamps");
            if (intArray != null) {
                if (longArray == null || longArray.length != intArray.length) {
                    hVar.d().f41712f.c("Uri sources and timestamps do not match");
                } else {
                    for (int i10 = 0; i10 < intArray.length; i10++) {
                        C2529k c2529k = hVar.f26601c;
                        h.y(c2529k);
                        int i11 = intArray[i10];
                        long j = longArray[i10];
                        C0804l.e(str);
                        c2529k.p();
                        c2529k.t();
                        try {
                            int iDelete = c2529k.w().delete("trigger_uris", "app_id=? and source=? and timestamp_millis<=?", new String[]{str, String.valueOf(i11), String.valueOf(j)});
                            c2529k.d().f41719n.d("Pruned " + iDelete + " trigger URIs. appId, source, timestamp", str, Integer.valueOf(i11), Long.valueOf(j));
                        } catch (SQLiteException e10) {
                            c2529k.d().f41712f.a(B0.v(str), e10, "Error pruning trigger URIs. appId");
                        }
                    }
                }
            }
        }
        C2529k c2529k2 = hVar.f26601c;
        h.y(c2529k2);
        C0804l.e(str);
        c2529k2.p();
        c2529k2.t();
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = c2529k2.w().query("trigger_uris", new String[]{"trigger_uri", "timestamp_millis", "source"}, "app_id=?", new String[]{str}, null, null, "rowid", null);
                if (cursorQuery.moveToFirst()) {
                    do {
                        String string = cursorQuery.getString(0);
                        if (string == null) {
                            string = "";
                        }
                        arrayList.add(new j3(cursorQuery.getInt(2), cursorQuery.getLong(1), string));
                    } while (cursorQuery.moveToNext());
                    cursorQuery.close();
                    list = arrayList;
                } else {
                    cursorQuery.close();
                    list = arrayList;
                }
            } catch (SQLiteException e11) {
                c2529k2.d().f41712f.a(B0.v(str), e11, "Error querying trigger uris. appId");
                List<j3> listEmptyList = Collections.emptyList();
                list = listEmptyList;
                if (cursorQuery != null) {
                    cursorQuery.close();
                    list = listEmptyList;
                }
            }
            return list;
        } catch (Throwable th) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
    }
}
