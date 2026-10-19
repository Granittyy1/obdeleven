package H4;

import I4.u;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: DefaultScheduler_Factory.java */
/* JADX INFO: loaded from: classes.dex */
public final class d implements E4.b<c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p268va.a<Executor> f3722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p268va.a<D4.d> f3723b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f3724c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p268va.a<J4.d> f3725d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p268va.a<K4.a> f3726e;

    public d(p268va.a aVar, p268va.a aVar2, g gVar, p268va.a aVar3, p268va.a aVar4) {
        this.f3722a = aVar;
        this.f3723b = aVar2;
        this.f3724c = gVar;
        this.f3725d = aVar3;
        this.f3726e = aVar4;
    }

    @Override // p268va.a
    public final Object get() {
        return new c(this.f3722a.get(), this.f3723b.get(), (u) this.f3724c.get(), this.f3725d.get(), this.f3726e.get());
    }
}
