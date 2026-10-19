package p203q4;

import D2.V;
import Na.h;
import Na.l;
import V.u;
import Z3.r;
import Z3.x;
import com.facebook.internal.instrument.InstrumentData;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.q;
import kotlin.jvm.internal.i;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p165n4.s;
import p190p4.c;

/* JADX INFO: compiled from: ANRHandler.kt */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicBoolean f46096a = new AtomicBoolean(false);

    public static final void a() {
        File[] fileArrListFiles;
        if (s.w()) {
            return;
        }
        File fileL = V.l();
        if (fileL == null) {
            fileArrListFiles = new File[0];
        } else {
            fileArrListFiles = fileL.listFiles(new c());
            if (fileArrListFiles == null) {
                fileArrListFiles = new File[0];
            }
        }
        ArrayList arrayList = new ArrayList(fileArrListFiles.length);
        for (File file : fileArrListFiles) {
            arrayList.add(InstrumentData.a.a(file));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((InstrumentData) obj).a()) {
                arrayList2.add(obj);
            }
        }
        final List listH0 = q.h0(arrayList2, new u(2));
        JSONArray jSONArray = new JSONArray();
        h it = l.J(0, Math.min(listH0.size(), 5)).iterator();
        while (it.f4692d) {
            jSONArray.put(listH0.get(it.a()));
        }
        V.p("anr_reports", jSONArray, new r.b() { // from class: q4.c
            @Override // Z3.r.b
            public final void b(x xVar) {
                List list = listH0;
                try {
                    if (xVar.f7905c == null) {
                        JSONObject jSONObject = xVar.f7906d;
                        if (i.a(jSONObject == null ? null : Boolean.valueOf(jSONObject.getBoolean("success")), Boolean.TRUE)) {
                            Iterator it2 = list.iterator();
                            while (it2.hasNext()) {
                                V.i(((InstrumentData) it2.next()).f25024a);
                            }
                        }
                    }
                } catch (JSONException unused) {
                }
            }
        });
    }
}
