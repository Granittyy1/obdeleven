package kotlinx.serialization.json.internal;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import p050db.AbstractC2184a;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class l implements Ia.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p011ab.e f43992b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC2184a f43993c;

    public /* synthetic */ l(p011ab.e eVar, AbstractC2184a abstractC2184a) {
        this.f43992b = eVar;
        this.f43993c = abstractC2184a;
    }

    @Override // Ia.a
    public final Object invoke() {
        String[] strArrNames;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        AbstractC2184a abstractC2184a = this.f43993c;
        boolean z10 = abstractC2184a.f34642a.f34678m;
        p011ab.e eVar = this.f43992b;
        boolean z11 = z10 && kotlin.jvm.internal.i.a(eVar.e(), ab.m.b.f8123a);
        m.d(eVar, abstractC2184a);
        int iF = eVar.f();
        for (int i10 = 0; i10 < iF; i10++) {
            List<Annotation> listH = eVar.h(i10);
            ArrayList arrayList = new ArrayList();
            for (Object obj : listH) {
                if (obj instanceof p050db.v) {
                    arrayList.add(obj);
                }
            }
            String lowerCase = null;
            p050db.v vVar = (p050db.v) (arrayList.size() == 1 ? arrayList.get(0) : null);
            if (vVar != null && (strArrNames = vVar.names()) != null) {
                for (String lowerCase2 : strArrNames) {
                    if (z11) {
                        lowerCase2 = lowerCase2.toLowerCase(Locale.ROOT);
                        kotlin.jvm.internal.i.d(lowerCase2, "toLowerCase(...)");
                    }
                    m.a(linkedHashMap, eVar, lowerCase2, i10);
                }
            }
            if (z11) {
                lowerCase = eVar.g(i10).toLowerCase(Locale.ROOT);
                kotlin.jvm.internal.i.d(lowerCase, "toLowerCase(...)");
            }
            if (lowerCase != null) {
                m.a(linkedHashMap, eVar, lowerCase, i10);
            }
        }
        return linkedHashMap.isEmpty() ? kotlin.collections.y.p() : linkedHashMap;
    }
}
