package kotlinx.coroutines.internal;

import kotlinx.coroutines.AbstractC2672a;

/* JADX INFO: compiled from: Scopes.kt */
/* JADX INFO: loaded from: classes2.dex */
public class u<T> extends AbstractC2672a<T> implements Aa.b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final kotlin.coroutines.c<T> f43502e;

    public u(kotlin.coroutines.c cVar, kotlin.coroutines.e eVar) {
        super(eVar, true, true);
        this.f43502e = cVar;
    }

    @Override // kotlinx.coroutines.JobSupport
    public void A(Object obj) {
        this.f43502e.resumeWith(p006a5.a.f(obj));
    }

    @Override // kotlinx.coroutines.JobSupport
    public final boolean b0() {
        return true;
    }

    @Override // Aa.b
    public final Aa.b getCallerFrame() {
        kotlin.coroutines.c<T> cVar = this.f43502e;
        if (cVar instanceof Aa.b) {
            return (Aa.b) cVar;
        }
        return null;
    }

    @Override // kotlinx.coroutines.JobSupport
    public void z(Object obj) {
        i.a(A8.p.y(this.f43502e), p006a5.a.f(obj), null);
    }
}
