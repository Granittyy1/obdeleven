package androidx.compose.material3;

import androidx.compose.runtime.C1081d0;
import androidx.compose.runtime.C1085f0;
import androidx.compose.runtime.J0;

/* JADX INFO: compiled from: TimePicker.kt */
/* JADX INFO: loaded from: classes.dex */
public final class m0 implements l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f12645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1085f0 f12646b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1085f0 f12647c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C1081d0 f12648d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C1081d0 f12649e;

    public m0(int i10, int i11, boolean z10) {
        if (i10 < 0 || i10 >= 24) {
            throw new IllegalArgumentException("initialHour should in [0..23] range");
        }
        if (i11 < 0 || i11 >= 60) {
            throw new IllegalArgumentException("initialMinute should be in [0..59] range");
        }
        this.f12645a = z10;
        this.f12646b = J0.f(new k0(0));
        this.f12647c = J0.f(Boolean.valueOf(i10 >= 12));
        this.f12648d = new C1081d0(i10 % 12);
        this.f12649e = new C1081d0(i11);
    }

    @Override // androidx.compose.material3.l0
    public final int a() {
        return this.f12649e.o();
    }

    @Override // androidx.compose.material3.l0
    public final int b() {
        return this.f12648d.o() + (i() ? 12 : 0);
    }

    @Override // androidx.compose.material3.l0
    public final void c(boolean z10) {
        this.f12647c.setValue(Boolean.valueOf(z10));
    }

    @Override // androidx.compose.material3.l0
    public final void d(int i10) {
        c(i10 >= 12);
        this.f12648d.m(i10 % 12);
    }

    @Override // androidx.compose.material3.l0
    public final void e(int i10) {
        this.f12649e.m(i10);
    }

    @Override // androidx.compose.material3.l0
    public final void f(int i10) {
        this.f12646b.setValue(new k0(i10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.material3.l0
    public final int g() {
        return ((k0) this.f12646b.getValue()).f12591a;
    }

    @Override // androidx.compose.material3.l0
    public final boolean h() {
        return this.f12645a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.material3.l0
    public final boolean i() {
        return ((Boolean) this.f12647c.getValue()).booleanValue();
    }
}
