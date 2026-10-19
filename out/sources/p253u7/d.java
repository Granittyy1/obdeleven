package p253u7;

import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.v1.h;
import com.google.firebase.perf.v1.i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p290x7.a;

/* JADX INFO: compiled from: TraceMetricBuilder.java */
/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Trace f47450a;

    public d(Trace trace) {
        this.f47450a = trace;
    }

    public final i a() {
        List listUnmodifiableList;
        i.a aVarA0 = i.a0();
        aVarA0.y(this.f47450a.f28464e);
        aVarA0.w(this.f47450a.f28470l.f28507b);
        Trace trace = this.f47450a;
        aVarA0.x(trace.f28470l.b(trace.f28471m));
        for (a aVar : this.f47450a.f28465f.values()) {
            aVarA0.v(aVar.f47438c.get(), aVar.f47437b);
        }
        ArrayList arrayList = this.f47450a.f28468i;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                aVarA0.u(new d((Trace) it.next()).a());
            }
        }
        Map<String, String> attributes = this.f47450a.getAttributes();
        aVarA0.r();
        i.L((i) aVarA0.f29047c).putAll(attributes);
        Trace trace2 = this.f47450a;
        synchronized (trace2.f28467h) {
            try {
                ArrayList arrayList2 = new ArrayList();
                for (a aVar2 : trace2.f28467h) {
                    if (aVar2 != null) {
                        arrayList2.add(aVar2);
                    }
                }
                listUnmodifiableList = Collections.unmodifiableList(arrayList2);
            } catch (Throwable th) {
                throw th;
            }
        }
        h[] hVarArrB = a.b(listUnmodifiableList);
        if (hVarArrB != null) {
            List listAsList = Arrays.asList(hVarArrB);
            aVarA0.r();
            i.N((i) aVarA0.f29047c, listAsList);
        }
        return aVarA0.p();
    }
}
