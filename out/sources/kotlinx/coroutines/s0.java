package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: NonCancellable.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class s0 extends kotlin.coroutines.a implements InterfaceC2694i0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final s0 f43532b = new s0(InterfaceC2694i0.b.f43449b);

    @Override // kotlinx.coroutines.InterfaceC2694i0
    @p293xa.d
    public final P B(Ia.l<? super Throwable, p293xa.r> lVar) {
        return t0.f43613b;
    }

    @Override // kotlinx.coroutines.InterfaceC2694i0
    @p293xa.d
    public final Object C(ContinuationImpl continuationImpl) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // kotlinx.coroutines.InterfaceC2694i0
    public final boolean I0() {
        return false;
    }

    @Override // kotlinx.coroutines.InterfaceC2694i0
    @p293xa.d
    public final CancellationException M() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // kotlinx.coroutines.InterfaceC2694i0
    @p293xa.d
    public final InterfaceC2703m S(JobSupport jobSupport) {
        return t0.f43613b;
    }

    @Override // kotlinx.coroutines.InterfaceC2694i0
    public final boolean c() {
        return true;
    }

    @Override // kotlinx.coroutines.InterfaceC2694i0
    @p293xa.d
    public final P f0(boolean z10, boolean z11, Ia.l<? super Throwable, p293xa.r> lVar) {
        return t0.f43613b;
    }

    @Override // kotlinx.coroutines.InterfaceC2694i0
    public final InterfaceC2694i0 getParent() {
        return null;
    }

    @Override // kotlinx.coroutines.InterfaceC2694i0
    public final boolean isCancelled() {
        return false;
    }

    @Override // kotlinx.coroutines.InterfaceC2694i0
    @p293xa.d
    public final boolean start() {
        return false;
    }

    public final String toString() {
        return "NonCancellable";
    }

    @Override // kotlinx.coroutines.InterfaceC2694i0
    public final kotlin.sequences.g<InterfaceC2694i0> x() {
        return kotlin.sequences.d.f43085a;
    }

    @Override // kotlinx.coroutines.InterfaceC2694i0
    @p293xa.d
    public final void i(CancellationException cancellationException) {
    }
}
