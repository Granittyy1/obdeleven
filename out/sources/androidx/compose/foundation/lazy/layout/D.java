package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.C1085f0;
import androidx.compose.runtime.N0;
import androidx.compose.runtime.Q0;

/* JADX INFO: compiled from: LazyLayoutNearestRangeState.kt */
/* JADX INFO: loaded from: classes.dex */
public final class D implements N0<Na.i> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f10572c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C1085f0 f10573d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f10574e;

    /* JADX INFO: compiled from: LazyLayoutNearestRangeState.kt */
    public static final class a {
    }

    public D(int i10, int i11, int i12) {
        this.f10571b = i11;
        this.f10572c = i12;
        int i13 = (i10 / i11) * i11;
        this.f10573d = new C1085f0(Na.l.J(Math.max(i13 - i12, 0), i13 + i11 + i12), Q0.f12888a);
        this.f10574e = i10;
    }

    public final void e(int i10) {
        if (i10 != this.f10574e) {
            this.f10574e = i10;
            int i11 = this.f10571b;
            int i12 = (i10 / i11) * i11;
            int i13 = this.f10572c;
            this.f10573d.setValue(Na.l.J(Math.max(i12 - i13, 0), i12 + i11 + i13));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.runtime.N0
    public final Na.i getValue() {
        return (Na.i) this.f10573d.getValue();
    }
}
