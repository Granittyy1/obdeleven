package androidx.compose.animation.core;

import androidx.compose.animation.core.AbstractC0913m;
import androidx.compose.runtime.C1085f0;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.N0;

/* JADX INFO: renamed from: androidx.compose.animation.core.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: AnimationState.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C0908h<T, V extends AbstractC0913m> implements N0<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d0<T, V> f9543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1085f0 f9544c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public V f9545d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f9546e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f9547f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f9548g;

    public /* synthetic */ C0908h(d0 d0Var, Object obj, AbstractC0913m abstractC0913m, int i10) {
        this(d0Var, obj, (i10 & 4) != 0 ? null : abstractC0913m, Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    public final T e() {
        return this.f9543b.b().invoke(this.f9545d);
    }

    @Override // androidx.compose.runtime.N0
    public final T getValue() {
        return this.f9544c.getValue();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AnimationState(value=");
        sb2.append(this.f9544c.getValue());
        sb2.append(", velocity=");
        sb2.append(e());
        sb2.append(", isRunning=");
        sb2.append(this.f9548g);
        sb2.append(", lastFrameTimeNanos=");
        sb2.append(this.f9546e);
        sb2.append(", finishedTimeNanos=");
        return C4.a.h(sb2, this.f9547f, ')');
    }

    public C0908h(d0<T, V> d0Var, T t8, V v10, long j, long j10, boolean z10) {
        V vInvoke;
        this.f9543b = d0Var;
        this.f9544c = J0.f(t8);
        if (v10 != null) {
            vInvoke = (V) Q3.d.k(v10);
        } else {
            vInvoke = d0Var.a().invoke(t8);
            vInvoke.d();
        }
        this.f9545d = vInvoke;
        this.f9546e = j;
        this.f9547f = j10;
        this.f9548g = z10;
    }
}
