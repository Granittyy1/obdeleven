package C4;

import java.util.HashMap;

/* JADX INFO: compiled from: TransportImpl.java */
/* JADX INFO: loaded from: classes.dex */
public final class w<T> implements p311z4.g<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f2401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f2402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p311z4.c f2403c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p311z4.f<T, byte[]> f2404d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final x f2405e;

    public w(l lVar, String str, p311z4.c cVar, p311z4.f fVar, x xVar) {
        this.f2401a = lVar;
        this.f2402b = str;
        this.f2403c = cVar;
        this.f2404d = fVar;
        this.f2405e = xVar;
    }

    public final void a(p311z4.a aVar, p311z4.i iVar) {
        l lVar = this.f2401a;
        String str = this.f2402b;
        if (str == null) {
            throw new NullPointerException("Null transportName");
        }
        p311z4.f<T, byte[]> fVar = this.f2404d;
        if (fVar == null) {
            throw new NullPointerException("Null transformer");
        }
        k kVar = new k(lVar, str, aVar, fVar, this.f2403c);
        x xVar = this.f2405e;
        p311z4.a aVar2 = kVar.f2377c;
        l lVarD = kVar.f2375a.d(aVar2.f48828b);
        j.a aVar3 = new j.a();
        aVar3.f2374f = new HashMap();
        aVar3.f2372d = Long.valueOf(xVar.f2407a.b());
        aVar3.f2373e = Long.valueOf(xVar.f2408b.b());
        String str2 = kVar.f2376b;
        if (str2 == null) {
            throw new NullPointerException("Null transportName");
        }
        aVar3.f2369a = str2;
        aVar3.f2371c = new n(kVar.f2379e, kVar.f2378d.apply(aVar2.f48827a));
        aVar2.getClass();
        aVar3.f2370b = null;
        xVar.f2409c.a(lVarD, aVar3.b(), iVar);
    }
}
