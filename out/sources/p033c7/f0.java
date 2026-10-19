package p033c7;

import T6.b;
import p058e7.G;
import p268va.a;

/* JADX INFO: compiled from: RateLimiterClient_Factory.java */
/* JADX INFO: loaded from: classes3.dex */
public final class f0 implements b<e0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a<T> f22445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final G f22446b;

    public f0(a aVar, G g10) {
        this.f22445a = aVar;
        this.f22446b = g10;
    }

    @Override // p268va.a
    public final Object get() {
        return new e0(this.f22445a.get(), (p071f7.a) this.f22446b.get());
    }
}
