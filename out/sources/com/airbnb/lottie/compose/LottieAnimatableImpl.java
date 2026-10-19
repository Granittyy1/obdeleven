package com.airbnb.lottie.compose;

import Na.l;
import androidx.compose.foundation.B;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.runtime.C1085f0;
import androidx.compose.runtime.DerivedSnapshotState;
import androidx.compose.runtime.J0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p293xa.r;

/* JADX INFO: compiled from: LottieAnimatable.kt */
/* JADX INFO: loaded from: classes.dex */
public final class LottieAnimatableImpl implements a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1085f0 f23342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1085f0 f23343c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C1085f0 f23344d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C1085f0 f23345e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C1085f0 f23346f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C1085f0 f23347g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C1085f0 f23348h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final DerivedSnapshotState f23349i;
    public final C1085f0 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C1085f0 f23350k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C1085f0 f23351l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final C1085f0 f23352m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final DerivedSnapshotState f23353n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final B f23354o;

    public LottieAnimatableImpl() {
        Boolean bool = Boolean.FALSE;
        this.f23342b = J0.f(bool);
        this.f23343c = J0.f(1);
        this.f23344d = J0.f(1);
        this.f23345e = J0.f(bool);
        this.f23346f = J0.f(null);
        this.f23347g = J0.f(Float.valueOf(1.0f));
        this.f23348h = J0.f(bool);
        this.f23349i = J0.d(new Ia.a<Float>() { // from class: com.airbnb.lottie.compose.LottieAnimatableImpl$frameSpeed$2
            {
                super(0);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // Ia.a
            public final Float invoke() {
                return Float.valueOf((((Boolean) this.this$0.f23345e.getValue()).booleanValue() && this.this$0.i() % 2 == 0) ? -this.this$0.d() : this.this$0.d());
            }
        });
        this.j = J0.f(null);
        Float fValueOf = Float.valueOf(0.0f);
        this.f23350k = J0.f(fValueOf);
        this.f23351l = J0.f(fValueOf);
        this.f23352m = J0.f(Long.MIN_VALUE);
        this.f23353n = J0.d(new Ia.a<Float>() { // from class: com.airbnb.lottie.compose.LottieAnimatableImpl$endProgress$2
            {
                super(0);
            }

            @Override // Ia.a
            public final Float invoke() {
                float fA = 0.0f;
                if (this.this$0.p() != null) {
                    if (this.this$0.d() < 0.0f) {
                        c cVarR = this.this$0.r();
                        if (cVarR != null) {
                            fA = cVarR.b();
                        }
                    } else {
                        c cVarR2 = this.this$0.r();
                        fA = cVarR2 != null ? cVarR2.a() : 1.0f;
                    }
                }
                return Float.valueOf(fA);
            }
        });
        J0.d(new Ia.a<Boolean>() { // from class: com.airbnb.lottie.compose.LottieAnimatableImpl$isAtEnd$2
            {
                super(0);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // Ia.a
            public final Boolean invoke() {
                return Boolean.valueOf(this.this$0.i() == ((Number) this.this$0.f23344d.getValue()).intValue() && this.this$0.h() == this.this$0.k());
            }
        });
        this.f23354o = new B();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean e(LottieAnimatableImpl lottieAnimatableImpl, int i10, long j) {
        p079g3.b bVarP = lottieAnimatableImpl.p();
        if (bVarP == null) {
            return true;
        }
        C1085f0 c1085f0 = lottieAnimatableImpl.f23352m;
        long jLongValue = ((Number) c1085f0.getValue()).longValue() == Long.MIN_VALUE ? 0L : j - ((Number) c1085f0.getValue()).longValue();
        c1085f0.setValue(Long.valueOf(j));
        c cVarR = lottieAnimatableImpl.r();
        float fB = cVarR != null ? cVarR.b() : 0.0f;
        c cVarR2 = lottieAnimatableImpl.r();
        float fA = cVarR2 != null ? cVarR2.a() : 1.0f;
        float fB2 = (jLongValue / ((long) 1000000)) / bVarP.b();
        DerivedSnapshotState derivedSnapshotState = lottieAnimatableImpl.f23349i;
        float fFloatValue = ((Number) derivedSnapshotState.getValue()).floatValue() * fB2;
        float fFloatValue2 = ((Number) derivedSnapshotState.getValue()).floatValue();
        C1085f0 c1085f1 = lottieAnimatableImpl.f23350k;
        float fFloatValue3 = fFloatValue2 < 0.0f ? fB - (((Number) c1085f1.getValue()).floatValue() + fFloatValue) : (((Number) c1085f1.getValue()).floatValue() + fFloatValue) - fA;
        if (fFloatValue3 < 0.0f) {
            lottieAnimatableImpl.s(l.C(((Number) c1085f1.getValue()).floatValue(), fB, fA) + fFloatValue);
            return true;
        }
        float f10 = fA - fB;
        int i11 = (int) (fFloatValue3 / f10);
        int i12 = i11 + 1;
        if (lottieAnimatableImpl.i() + i12 > i10) {
            lottieAnimatableImpl.s(lottieAnimatableImpl.k());
            lottieAnimatableImpl.q(i10);
            return false;
        }
        lottieAnimatableImpl.q(lottieAnimatableImpl.i() + i12);
        float f11 = fFloatValue3 - (i11 * f10);
        lottieAnimatableImpl.s(((Number) derivedSnapshotState.getValue()).floatValue() < 0.0f ? fA - f11 : fB + f11);
        return true;
    }

    public static final void g(LottieAnimatableImpl lottieAnimatableImpl, boolean z10) {
        lottieAnimatableImpl.f23342b.setValue(Boolean.valueOf(z10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.lottie.compose.b
    public final float d() {
        return ((Number) this.f23347g.getValue()).floatValue();
    }

    @Override // androidx.compose.runtime.N0
    public final Float getValue() {
        return Float.valueOf(h());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.lottie.compose.b
    public final float h() {
        return ((Number) this.f23351l.getValue()).floatValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.lottie.compose.b
    public final int i() {
        return ((Number) this.f23343c.getValue()).intValue();
    }

    public final float k() {
        return ((Number) this.f23353n.getValue()).floatValue();
    }

    @Override // com.airbnb.lottie.compose.a
    public final Object l(p079g3.b bVar, int i10, int i11, boolean z10, float f10, c cVar, float f11, boolean z11, LottieCancellationBehavior lottieCancellationBehavior, boolean z12, kotlin.coroutines.c cVar2) {
        Object objB = this.f23354o.b(MutatePriority.f9810b, new LottieAnimatableImpl$animate$2(this, i10, i11, z10, f10, cVar, bVar, f11, z12, z11, lottieCancellationBehavior, null), (ContinuationImpl) cVar2);
        return objB == CoroutineSingletons.f43038b ? objB : r.f47939a;
    }

    @Override // com.airbnb.lottie.compose.a
    public final Object n(p079g3.b bVar, float f10, int i10, boolean z10, kotlin.coroutines.c<? super r> cVar) {
        Object objB = this.f23354o.b(MutatePriority.f9810b, new LottieAnimatableImpl$snapTo$2(this, bVar, f10, i10, z10, null), (ContinuationImpl) cVar);
        return objB == CoroutineSingletons.f43038b ? objB : r.f47939a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.lottie.compose.b
    public final p079g3.b p() {
        return (p079g3.b) this.j.getValue();
    }

    public final void q(int i10) {
        this.f23343c.setValue(Integer.valueOf(i10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.lottie.compose.b
    public final c r() {
        return (c) this.f23346f.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void s(float f10) {
        p079g3.b bVarP;
        this.f23350k.setValue(Float.valueOf(f10));
        if (((Boolean) this.f23348h.getValue()).booleanValue() && (bVarP = p()) != null) {
            f10 -= f10 % (1 / bVarP.f35562l);
        }
        this.f23351l.setValue(Float.valueOf(f10));
    }
}
