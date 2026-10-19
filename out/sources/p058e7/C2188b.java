package p058e7;

import O.h;
import T6.b;
import p033c7.C1489b;
import p268va.a;

/* JADX INFO: renamed from: e7.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: AnalyticsEventsModule_ProvidesAnalyticsEventsManagerFactory.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C2188b implements b<C1489b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f34790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a<p192p6.a> f34791b;

    public C2188b(h hVar, a<p192p6.a> aVar) {
        this.f34790a = hVar;
        this.f34791b = aVar;
    }

    @Override // p268va.a
    public final Object get() {
        p192p6.a aVar = this.f34791b.get();
        this.f34790a.getClass();
        return new C1489b(aVar);
    }
}
