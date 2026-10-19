package p033c7;

import X8.m;
import X8.n;
import io.reactivex.internal.operators.maybe.b;
import io.reactivex.internal.operators.maybe.e;
import io.reactivex.internal.operators.maybe.k;
import p071f7.a;
import p123ja.h;

/* JADX INFO: compiled from: RateLimiterClient.java */
/* JADX INFO: loaded from: classes3.dex */
public final class e0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Z f22439d = Z.I();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f22440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f22441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public h<Z> f22442c = b.f40795b;

    public e0(T t8, a aVar) {
        this.f22440a = t8;
        this.f22441b = aVar;
    }

    public final h<Z> a() {
        h<Z> hVar = this.f22442c;
        e eVarA = this.f22440a.a(Z.L());
        m mVar = new m(3, this);
        qa.a.c cVar = qa.a.f46191d;
        return new k(hVar.e(new k(eVarA, mVar, cVar)), cVar, new n(this));
    }

    public final Y b() {
        Y.a aVarN = Y.N();
        aVarN.r();
        Y.H((Y) aVarN.f29047c, 0L);
        long jA = this.f22441b.a();
        aVarN.r();
        Y.J((Y) aVarN.f29047c, jA);
        return aVarN.p();
    }
}
