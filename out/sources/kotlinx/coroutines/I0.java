package kotlinx.coroutines;

import kotlin.Pair;
import kotlinx.coroutines.internal.ThreadContextKt;

/* JADX INFO: compiled from: CoroutineContext.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class I0<T> extends kotlinx.coroutines.internal.u<T> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ThreadLocal<Pair<kotlin.coroutines.e, Object>> f43181f;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    public I0(kotlin.coroutines.c cVar, kotlin.coroutines.e eVar) {
        J0 j10 = J0.f43182b;
        super(cVar, eVar.get(j10) == null ? eVar.plus(j10) : eVar);
        this.f43181f = new ThreadLocal<>();
        if (cVar.getContext().get(kotlin.coroutines.d.a.f43035b) instanceof AbstractC2712w) {
            return;
        }
        Object objC = ThreadContextKt.c(eVar, null);
        ThreadContextKt.a(eVar, objC);
        x0(eVar, objC);
    }

    @Override // kotlinx.coroutines.internal.u, kotlinx.coroutines.JobSupport
    public final void A(Object obj) {
        if (this.threadLocalIsSet) {
            Pair<kotlin.coroutines.e, Object> pair = this.f43181f.get();
            if (pair != null) {
                ThreadContextKt.a(pair.a(), pair.b());
            }
            this.f43181f.remove();
        }
        Object objF = p006a5.a.f(obj);
        kotlin.coroutines.c<T> cVar = this.f43502e;
        kotlin.coroutines.e context = cVar.getContext();
        Object objC = ThreadContextKt.c(context, null);
        I0<?> i0D = objC != ThreadContextKt.f43460a ? CoroutineContextKt.d(cVar, context, objC) : null;
        try {
            this.f43502e.resumeWith(objF);
            p293xa.r rVar = p293xa.r.f47939a;
        } finally {
            if (i0D == null || i0D.w0()) {
                ThreadContextKt.a(context, objC);
            }
        }
    }

    public final boolean w0() {
        boolean z10 = this.threadLocalIsSet && this.f43181f.get() == null;
        this.f43181f.remove();
        return !z10;
    }

    public final void x0(kotlin.coroutines.e eVar, Object obj) {
        this.threadLocalIsSet = true;
        this.f43181f.set(new Pair<>(eVar, obj));
    }
}
