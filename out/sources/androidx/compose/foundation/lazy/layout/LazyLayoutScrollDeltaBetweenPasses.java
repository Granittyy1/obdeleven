package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.AbstractC0913m;
import androidx.compose.animation.core.C0908h;
import androidx.compose.animation.core.C0909i;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.animation.core.e0;
import kotlinx.coroutines.C2680e;

/* JADX INFO: compiled from: LazyLayoutScrollDeltaBetweenPasses.kt */
/* JADX INFO: loaded from: classes.dex */
public final class LazyLayoutScrollDeltaBetweenPasses {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C0908h<Float, C0909i> f10646a;

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public LazyLayoutScrollDeltaBetweenPasses() {
        e0 e0Var = VectorConvertersKt.f9477a;
        Object objValueOf = Float.valueOf(0.0f);
        this.f10646a = new C0908h<>(e0Var, objValueOf, (AbstractC0913m) e0Var.f9540a.invoke((T) objValueOf), Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(float f10, p013b0.c cVar, kotlinx.coroutines.A a10) {
        if (f10 <= cVar.T0(J.f10592a)) {
            return;
        }
        androidx.compose.runtime.snapshots.g gVarA = androidx.compose.runtime.snapshots.g.a.a();
        Ia.l<Object, p293xa.r> lVarE = gVarA != null ? gVarA.e() : null;
        androidx.compose.runtime.snapshots.g gVarB = androidx.compose.runtime.snapshots.g.a.b(gVarA);
        try {
            float fFloatValue = ((Number) this.f10646a.f9544c.getValue()).floatValue();
            C0908h<Float, C0909i> c0908h = this.f10646a;
            if (c0908h.f9548g) {
                this.f10646a = D2.V.h(c0908h, fFloatValue - f10, 0.0f, 30);
                C2680e.c(a10, null, null, new LazyLayoutScrollDeltaBetweenPasses$updateScrollDeltaForApproach$2$1(this, null), 3);
            } else {
                this.f10646a = new C0908h<>(VectorConvertersKt.f9477a, Float.valueOf(-f10), null, 60);
                C2680e.c(a10, null, null, new LazyLayoutScrollDeltaBetweenPasses$updateScrollDeltaForApproach$2$2(this, null), 3);
            }
        } finally {
            androidx.compose.runtime.snapshots.g.a.d(gVarA, gVarB, lVarE);
        }
    }
}
