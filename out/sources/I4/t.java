package I4;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: WorkInitializer_Factory.java */
/* JADX INFO: loaded from: classes.dex */
public final class t implements E4.b<s> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p268va.a<Executor> f3894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p268va.a<J4.d> f3895b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final H4.g f3896c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p268va.a<K4.a> f3897d;

    public t(p268va.a aVar, p268va.a aVar2, H4.g gVar, p268va.a aVar3) {
        this.f3894a = aVar;
        this.f3895b = aVar2;
        this.f3896c = gVar;
        this.f3897d = aVar3;
    }

    @Override // p268va.a
    public final Object get() {
        return new s(this.f3894a.get(), this.f3895b.get(), (u) this.f3896c.get(), this.f3897d.get());
    }
}
