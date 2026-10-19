package p058e7;

import C4.v;
import T6.b;
import T6.c;
import Z6.d;
import com.google.firebase.messaging.C2051n;
import java.util.concurrent.Executor;
import p033c7.C1501n;
import p033c7.O;
import p046d7.e;
import p046d7.g;
import p046d7.h;
import p192p6.a;

/* JADX INFO: compiled from: TransportClientModule_ProvidesMetricsLoggerClientFactory.java */
/* JADX INFO: loaded from: classes3.dex */
public final class H implements b<O> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2192f f34781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f34782b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f34783c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C2193g f34784d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g f34785e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h f34786f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e f34787g;

    public H(C2192f c2192f, c cVar, d dVar, C2193g c2193g, g gVar, h hVar, e eVar) {
        this.f34781a = c2192f;
        this.f34782b = cVar;
        this.f34783c = dVar;
        this.f34784d = c2193g;
        this.f34785e = gVar;
        this.f34786f = hVar;
        this.f34787g = eVar;
    }

    @Override // p268va.a
    public final Object get() {
        p144l6.e eVar = this.f34781a.f34802a.f34792a;
        p311z4.h hVar = (p311z4.h) this.f34782b.f6038a;
        return new O(new C2051n(hVar.a(new v(7))), (a) this.f34783c.get(), eVar, (p108i7.c) this.f34784d.get(), (p071f7.a) this.f34785e.get(), (C1501n) this.f34786f.get(), (Executor) this.f34787g.get());
    }
}
