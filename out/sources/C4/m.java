package C4;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: DaggerTransportRuntimeComponent.java */
/* JADX INFO: loaded from: classes.dex */
public final class m extends y {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p268va.a<Executor> f2383b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public E4.c f2384c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public p268va.a f2385d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public J4.y f2386e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public p268va.a<String> f2387f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p268va.a<J4.q> f2388g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p268va.a<x> f2389h;

    /* JADX INFO: compiled from: DaggerTransportRuntimeComponent.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Context f2390a;

        public final m a() {
            Context context = this.f2390a;
            if (context == null) {
                throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
            }
            m mVar = new m();
            mVar.f2383b = E4.a.a(p.a.f2393a);
            E4.c cVar = new E4.c(context);
            mVar.f2384c = cVar;
            mVar.f2385d = E4.a.a(new D4.j(cVar, new D4.h(cVar)));
            E4.c cVar2 = mVar.f2384c;
            mVar.f2386e = new J4.y(cVar2);
            p268va.a<String> aVarA = E4.a.a(new J4.f(cVar2));
            mVar.f2387f = aVarA;
            p268va.a<J4.q> aVarA2 = E4.a.a(new J4.r(mVar.f2386e, aVarA));
            mVar.f2388g = aVarA2;
            H4.f fVar = new H4.f();
            E4.c cVar3 = mVar.f2384c;
            H4.g gVar = new H4.g(cVar3, aVarA2, fVar);
            p268va.a<Executor> aVar = mVar.f2383b;
            p268va.a aVar2 = mVar.f2385d;
            mVar.f2389h = E4.a.a(new z(new H4.d(aVar, aVar2, gVar, aVarA2, aVarA2), new I4.p(cVar3, aVar2, aVarA2, gVar, aVar, aVarA2, aVarA2), new I4.t(aVar, aVarA2, gVar, aVarA2)));
            return mVar;
        }
    }
}
