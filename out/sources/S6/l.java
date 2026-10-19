package S6;

import Z6.q;
import java.util.concurrent.Executor;
import p033c7.C1501n;
import p033c7.C1502o;
import p033c7.C1503p;
import p033c7.H;
import p058e7.C2191e;
import p058e7.C2193g;

/* JADX INFO: compiled from: FirebaseInAppMessaging_Factory.java */
/* JADX INFO: loaded from: classes3.dex */
public final class l implements T6.b<j> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p268va.a<H> f5683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p046d7.k f5684b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C2191e f5685c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C2193g f5686d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C1503p f5687e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p046d7.h f5688f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final q f5689g;

    public l(p268va.a aVar, p046d7.k kVar, C2191e c2191e, C2193g c2193g, C1503p c1503p, p046d7.h hVar, q qVar) {
        this.f5683a = aVar;
        this.f5684b = kVar;
        this.f5685c = c2191e;
        this.f5686d = c2193g;
        this.f5687e = c1503p;
        this.f5688f = hVar;
        this.f5689g = qVar;
    }

    @Override // p268va.a
    public final Object get() {
        H h8 = this.f5683a.get();
        this.f5684b.get();
        this.f5685c.get();
        return new j(h8, (p108i7.c) this.f5686d.get(), (C1502o) this.f5687e.get(), (C1501n) this.f5688f.get(), (Executor) this.f5689g.get());
    }
}
