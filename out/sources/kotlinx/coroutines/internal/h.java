package kotlinx.coroutines.internal;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.AbstractC2712w;
import kotlinx.coroutines.C;
import kotlinx.coroutines.C2708s;
import kotlinx.coroutines.C2709t;
import kotlinx.coroutines.D0;
import kotlinx.coroutines.L;
import kotlinx.coroutines.U;

/* JADX INFO: compiled from: DispatchedContinuation.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class h<T> extends L<T> implements Aa.b, kotlin.coroutines.c<T> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f43475i = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AbstractC2712w f43476e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ContinuationImpl f43477f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f43478g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f43479h;

    public h(AbstractC2712w abstractC2712w, ContinuationImpl continuationImpl) {
        super(-1);
        this.f43476e = abstractC2712w;
        this.f43477f = continuationImpl;
        this.f43478g = i.f43480a;
        this.f43479h = ThreadContextKt.b(continuationImpl.getContext());
    }

    @Override // kotlinx.coroutines.L
    public final void a(Object obj, CancellationException cancellationException) {
        if (obj instanceof C2709t) {
            ((C2709t) obj).f43612b.invoke(cancellationException);
        }
    }

    @Override // Aa.b
    public final Aa.b getCallerFrame() {
        ContinuationImpl continuationImpl = this.f43477f;
        if (continuationImpl != null) {
            return continuationImpl;
        }
        return null;
    }

    @Override // kotlin.coroutines.c
    public final kotlin.coroutines.e getContext() {
        return this.f43477f.getContext();
    }

    @Override // kotlinx.coroutines.L
    public final Object h() {
        Object obj = this.f43478g;
        this.f43478g = i.f43480a;
        return obj;
    }

    @Override // kotlin.coroutines.c
    public final void resumeWith(Object obj) {
        ContinuationImpl continuationImpl = this.f43477f;
        kotlin.coroutines.e context = continuationImpl.getContext();
        Throwable thA = Result.a(obj);
        Object c2708s = thA == null ? obj : new C2708s(thA, false);
        AbstractC2712w abstractC2712w = this.f43476e;
        if (abstractC2712w.b1(context)) {
            this.f43478g = c2708s;
            this.f43195d = 0;
            abstractC2712w.Z0(context, this);
            return;
        }
        U uA = D0.a();
        if (uA.g1()) {
            this.f43478g = c2708s;
            this.f43195d = 0;
            uA.e1(this);
            return;
        }
        uA.f1(true);
        try {
            kotlin.coroutines.e context2 = continuationImpl.getContext();
            Object objC = ThreadContextKt.c(context2, this.f43479h);
            try {
                continuationImpl.resumeWith(obj);
                p293xa.r rVar = p293xa.r.f47939a;
                ThreadContextKt.a(context2, objC);
                while (uA.i1()) {
                }
            } catch (Throwable th) {
                ThreadContextKt.a(context2, objC);
                throw th;
            }
        } catch (Throwable th2) {
            try {
                g(th2, null);
            } finally {
                uA.d1(true);
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f43476e + ", " + C.v(this.f43477f) + ']';
    }

    @Override // kotlinx.coroutines.L
    public final kotlin.coroutines.c<T> b() {
        return this;
    }
}
