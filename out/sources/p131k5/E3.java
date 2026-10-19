package p131k5;

import androidx.collection.C0873a;
import com.google.android.gms.internal.measurement.C1940y1;
import com.google.android.gms.internal.measurement.D4;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class E3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f41764b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1940y1 f41765c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final BitSet f41766d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final BitSet f41767e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C0873a f41768f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C0873a f41769g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C3 f41770h;

    public E3() {
        throw null;
    }

    public E3(C3 c10, String str) {
        this.f41770h = c10;
        this.f41763a = str;
        this.f41764b = true;
        this.f41766d = new BitSet();
        this.f41767e = new BitSet();
        this.f41768f = new C0873a();
        this.f41769g = new C0873a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(AbstractC2491c abstractC2491c) {
        int iA = abstractC2491c.a();
        Boolean bool = abstractC2491c.f42101c;
        if (bool != null) {
            this.f41767e.set(iA, bool.booleanValue());
        }
        Boolean bool2 = abstractC2491c.f42102d;
        if (bool2 != null) {
            this.f41766d.set(iA, bool2.booleanValue());
        }
        if (abstractC2491c.f42103e != null) {
            Integer numValueOf = Integer.valueOf(iA);
            C0873a c0873a = this.f41768f;
            Long l10 = (Long) c0873a.get(numValueOf);
            long jLongValue = abstractC2491c.f42103e.longValue() / 1000;
            if (l10 == null || jLongValue > l10.longValue()) {
                c0873a.put(Integer.valueOf(iA), Long.valueOf(jLongValue));
            }
        }
        if (abstractC2491c.f42104f != null) {
            C0873a c0873a2 = this.f41769g;
            List arrayList = (List) c0873a2.get(Integer.valueOf(iA));
            if (arrayList == null) {
                arrayList = new ArrayList();
                c0873a2.put(Integer.valueOf(iA), arrayList);
            }
            if (abstractC2491c.g()) {
                arrayList.clear();
            }
            D4.a();
            String str = this.f41763a;
            C3 c10 = this.f41770h;
            C2501e c2501e = ((C2523i1) c10.f3968a).f42218g;
            C2557r0<Boolean> c2557r0 = B.f41676i0;
            if (c2501e.B(str, c2557r0) && abstractC2491c.f()) {
                arrayList.clear();
            }
            D4.a();
            if (!((C2523i1) c10.f3968a).f42218g.B(str, c2557r0)) {
                arrayList.add(Long.valueOf(abstractC2491c.f42104f.longValue() / 1000));
                return;
            }
            long jLongValue2 = abstractC2491c.f42104f.longValue() / 1000;
            if (arrayList.contains(Long.valueOf(jLongValue2))) {
                return;
            }
            arrayList.add(Long.valueOf(jLongValue2));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public E3(C3 c10, String str, C1940y1 c1940y1, BitSet bitSet, BitSet bitSet2, C0873a c0873a, C0873a c0873a2) {
        this.f41770h = c10;
        this.f41763a = str;
        this.f41766d = bitSet;
        this.f41767e = bitSet2;
        this.f41768f = c0873a;
        this.f41769g = new C0873a();
        for (Integer num : (C0873a.c) c0873a2.keySet()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) c0873a2.get(num));
            this.f41769g.put(num, arrayList);
        }
        this.f41764b = false;
        this.f41765c = c1940y1;
    }
}
