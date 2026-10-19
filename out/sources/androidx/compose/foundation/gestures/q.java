package androidx.compose.foundation.gestures;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.sync.MutexImpl;

/* JADX INFO: compiled from: TapGestureDetector.kt */
/* JADX INFO: loaded from: classes.dex */
public final class q implements p, p013b0.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p013b0.c f10033b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f10034c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f10035d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final MutexImpl f10036e = new MutexImpl(false);

    public q(p013b0.c cVar) {
        this.f10033b = cVar;
    }

    @Override // p013b0.c
    public final long A0(float f10) {
        return this.f10033b.A0(f10);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.compose.foundation.gestures.p
    public final Object O(ContinuationImpl continuationImpl) {
        PressGestureScopeImpl$tryAwaitRelease$1 pressGestureScopeImpl$tryAwaitRelease$1;
        q qVar;
        if (continuationImpl instanceof PressGestureScopeImpl$tryAwaitRelease$1) {
            pressGestureScopeImpl$tryAwaitRelease$1 = (PressGestureScopeImpl$tryAwaitRelease$1) continuationImpl;
            int i10 = pressGestureScopeImpl$tryAwaitRelease$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                pressGestureScopeImpl$tryAwaitRelease$1.label = i10 - Integer.MIN_VALUE;
            } else {
                pressGestureScopeImpl$tryAwaitRelease$1 = new PressGestureScopeImpl$tryAwaitRelease$1(this, continuationImpl);
            }
        } else {
            pressGestureScopeImpl$tryAwaitRelease$1 = new PressGestureScopeImpl$tryAwaitRelease$1(this, continuationImpl);
        }
        Object obj = pressGestureScopeImpl$tryAwaitRelease$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = pressGestureScopeImpl$tryAwaitRelease$1.label;
        if (i11 == 0) {
            kotlin.b.b(obj);
            if (this.f10034c || this.f10035d) {
                qVar = this;
            } else {
                pressGestureScopeImpl$tryAwaitRelease$1.L$0 = this;
                pressGestureScopeImpl$tryAwaitRelease$1.label = 1;
                if (this.f10036e.f(null, pressGestureScopeImpl$tryAwaitRelease$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                qVar = this;
            }
            return Boolean.valueOf(qVar.f10034c);
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        qVar = (q) pressGestureScopeImpl$tryAwaitRelease$1.L$0;
        kotlin.b.b(obj);
        qVar.f10036e.g(null);
        return Boolean.valueOf(qVar.f10034c);
    }

    @Override // p013b0.c
    public final float P0() {
        return this.f10033b.P0();
    }

    @Override // p013b0.c
    public final float T0(float f10) {
        return this.f10033b.T0(f10);
    }

    @Override // p013b0.c
    public final long W(float f10) {
        return this.f10033b.W(f10);
    }

    public final void c() {
        this.f10035d = true;
        MutexImpl mutexImpl = this.f10036e;
        if (mutexImpl.e()) {
            mutexImpl.g(null);
        }
    }

    @Override // p013b0.c
    public final float e0(long j) {
        return this.f10033b.e0(j);
    }

    @Override // p013b0.c
    public final int e1(float f10) {
        return this.f10033b.e1(f10);
    }

    @Override // p013b0.c
    public final float getDensity() {
        return this.f10033b.getDensity();
    }

    public final void o() {
        this.f10034c = true;
        MutexImpl mutexImpl = this.f10036e;
        if (mutexImpl.e()) {
            mutexImpl.g(null);
        }
    }

    @Override // p013b0.c
    public final long o1(long j) {
        return this.f10033b.o1(j);
    }

    @Override // p013b0.c
    public final long p(long j) {
        return this.f10033b.p(j);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object q(ContinuationImpl continuationImpl) {
        PressGestureScopeImpl$reset$1 pressGestureScopeImpl$reset$1;
        q qVar;
        if (continuationImpl instanceof PressGestureScopeImpl$reset$1) {
            pressGestureScopeImpl$reset$1 = (PressGestureScopeImpl$reset$1) continuationImpl;
            int i10 = pressGestureScopeImpl$reset$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                pressGestureScopeImpl$reset$1.label = i10 - Integer.MIN_VALUE;
            } else {
                pressGestureScopeImpl$reset$1 = new PressGestureScopeImpl$reset$1(this, continuationImpl);
            }
        } else {
            pressGestureScopeImpl$reset$1 = new PressGestureScopeImpl$reset$1(this, continuationImpl);
        }
        Object obj = pressGestureScopeImpl$reset$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = pressGestureScopeImpl$reset$1.label;
        if (i11 == 0) {
            kotlin.b.b(obj);
            pressGestureScopeImpl$reset$1.L$0 = this;
            pressGestureScopeImpl$reset$1.label = 1;
            if (this.f10036e.f(null, pressGestureScopeImpl$reset$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            qVar = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            qVar = (q) pressGestureScopeImpl$reset$1.L$0;
            kotlin.b.b(obj);
        }
        qVar.f10034c = false;
        qVar.f10035d = false;
        return p293xa.r.f47939a;
    }

    @Override // p013b0.c
    public final float s1(long j) {
        return this.f10033b.s1(j);
    }

    @Override // p013b0.c
    public final float u(int i10) {
        return this.f10033b.u(i10);
    }

    @Override // p013b0.c
    public final float v(float f10) {
        return this.f10033b.v(f10);
    }

    @Override // p013b0.c
    public final long w0(int i10) {
        return this.f10033b.w0(i10);
    }
}
