package p131k5;

import U4.C0804l;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.measurement.C1906t1;
import com.google.android.gms.internal.measurement.C1920v1;
import com.google.android.gms.measurement.internal.i;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class G3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C1906t1 f41807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Long f41808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f41809c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C3 f41810d;

    public G3(C3 c10) {
        this.f41810d = c10;
    }

    /* JADX WARN: Code duplicated, block: B:72:0x01a7  */
    public final C1906t1 a(C1906t1 c1906t1, String str) {
        Cursor cursorRawQuery;
        Pair pairCreate;
        Object obj;
        String strK = c1906t1.K();
        List listL = c1906t1.L();
        C3 c10 = this.f41810d;
        c10.q();
        Long l10 = (Long) i.b0(c1906t1, "_eid");
        boolean z10 = l10 != null;
        if (z10 && strK.equals("_ep")) {
            C0804l.h(l10);
            c10.q();
            String str2 = (String) i.b0(c1906t1, "_en");
            Cursor cursor = null;
            if (TextUtils.isEmpty(str2)) {
                c10.d().f41713g.b(l10, "Extra parameter without an event name. eventId");
                return null;
            }
            if (this.f41807a == null || this.f41808b == null || l10.longValue() != this.f41808b.longValue()) {
                C2529k c2529kR = c10.r();
                c2529kR.p();
                c2529kR.t();
                try {
                    try {
                        cursorRawQuery = c2529kR.w().rawQuery("select main_event, children_to_process from main_event_params where app_id=? and event_id=?", new String[]{str, String.valueOf(l10)});
                        try {
                            if (cursorRawQuery.moveToFirst()) {
                                try {
                                    pairCreate = Pair.create((C1906t1) ((C1906t1.a) i.D(C1906t1.I(), cursorRawQuery.getBlob(0))).f(), Long.valueOf(cursorRawQuery.getLong(1)));
                                    cursorRawQuery.close();
                                } catch (IOException e10) {
                                    c2529kR.d().f41712f.d("Failed to merge main event. appId, eventId", B0.v(str), l10, e10);
                                    cursorRawQuery.close();
                                    pairCreate = null;
                                }
                                if (pairCreate != null || (obj = pairCreate.first) == null) {
                                    c10.d().f41713g.a(str2, l10, "Extra parameter without existing main event. eventName, eventId");
                                    return null;
                                }
                                this.f41807a = (C1906t1) obj;
                                this.f41809c = ((Long) pairCreate.second).longValue();
                                c10.q();
                                this.f41808b = (Long) i.b0(this.f41807a, "_eid");
                            } else {
                                c2529kR.d().f41719n.c("Main event not found");
                                cursorRawQuery.close();
                            }
                        } catch (SQLiteException e11) {
                            e = e11;
                            c2529kR.d().f41712f.b(e, "Error selecting main event");
                            if (cursorRawQuery != null) {
                                cursorRawQuery.close();
                            }
                        }
                    } catch (Throwable th) {
                        th = th;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                } catch (SQLiteException e12) {
                    e = e12;
                    cursorRawQuery = null;
                } catch (Throwable th2) {
                    th = th2;
                    cursor = null;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
                pairCreate = null;
                if (pairCreate != null) {
                }
                c10.d().f41713g.a(str2, l10, "Extra parameter without existing main event. eventName, eventId");
                return null;
            }
            long j = this.f41809c - 1;
            this.f41809c = j;
            if (j <= 0) {
                C2529k c2529kR2 = c10.r();
                c2529kR2.p();
                c2529kR2.d().f41719n.b(str, "Clearing complex main event info. appId");
                try {
                    c2529kR2.w().execSQL("delete from main_event_params where app_id=?", new String[]{str});
                } catch (SQLiteException e13) {
                    c2529kR2.d().f41712f.b(e13, "Error clearing complex main event");
                }
            } else {
                c10.r().N(str, l10, this.f41809c, this.f41807a);
            }
            ArrayList arrayList = new ArrayList();
            for (C1920v1 c1920v1 : this.f41807a.L()) {
                c10.q();
                if (i.C(c1906t1, c1920v1.L()) == null) {
                    arrayList.add(c1920v1);
                }
            }
            if (arrayList.isEmpty()) {
                c10.d().f41713g.b(str2, "No unique parameters in main event. eventName");
            } else {
                arrayList.addAll(listL);
                listL = arrayList;
            }
            strK = str2;
        } else if (z10) {
            this.f41808b = l10;
            this.f41807a = c1906t1;
            c10.q();
            Serializable serializableB0 = i.b0(c1906t1, "_epc");
            long jLongValue = ((Long) (serializableB0 != null ? serializableB0 : 0L)).longValue();
            this.f41809c = jLongValue;
            if (jLongValue <= 0) {
                c10.d().f41713g.b(strK, "Complex event with zero extra param count. eventName");
            } else {
                C2529k c2529kR3 = c10.r();
                C0804l.h(l10);
                c2529kR3.N(str, l10, this.f41809c, c1906t1);
            }
        }
        C1906t1.a aVarR = c1906t1.r();
        aVarR.h();
        C1906t1.D((C1906t1) aVarR.f25531c, strK);
        aVarR.h();
        C1906t1.z((C1906t1) aVarR.f25531c);
        aVarR.h();
        C1906t1.C((C1906t1) aVarR.f25531c, listL);
        return (C1906t1) aVarR.f();
    }
}
