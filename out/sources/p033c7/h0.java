package p033c7;

import T6.b;
import p123ja.o;
import p268va.a;

/* JADX INFO: compiled from: Schedulers_Factory.java */
/* JADX INFO: loaded from: classes3.dex */
public final class h0 implements b<g0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a<o> f22456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a<o> f22457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a<o> f22458c;

    public h0(a<o> aVar, a<o> aVar2, a<o> aVar3) {
        this.f22456a = aVar;
        this.f22457b = aVar2;
        this.f22458c = aVar3;
    }

    @Override // p268va.a
    public final Object get() {
        o oVar = this.f22456a.get();
        this.f22457b.get();
        return new g0(oVar, this.f22458c.get());
    }
}
