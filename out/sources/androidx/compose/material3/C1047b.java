package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.C0901a;
import androidx.compose.animation.core.C0909i;

/* JADX INFO: renamed from: androidx.compose.material3.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: TimePicker.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C1047b implements l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l0 f12419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f12420b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f12421c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Animatable<Float, C0909i> f12422d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final androidx.compose.foundation.B f12423e = new androidx.compose.foundation.B();

    public C1047b(l0 l0Var) {
        this.f12419a = l0Var;
        this.f12420b = ((l0Var.b() % 12) * 0.5235988f) - 1.5707964f;
        this.f12421c = (l0Var.a() * 0.10471976f) - 1.5707964f;
        this.f12422d = C0901a.a(this.f12420b);
    }

    public static float k(float f10) {
        double d10 = ((double) f10) % 6.283185307179586d;
        if (d10 < 0.0d) {
            d10 += 6.283185307179586d;
        }
        return (float) d10;
    }

    @Override // androidx.compose.material3.l0
    public final int a() {
        return this.f12419a.a();
    }

    @Override // androidx.compose.material3.l0
    public final int b() {
        return this.f12419a.b();
    }

    @Override // androidx.compose.material3.l0
    public final void c(boolean z10) {
        this.f12419a.c(z10);
    }

    @Override // androidx.compose.material3.l0
    public final void d(int i10) {
        this.f12420b = ((i10 % 12) * 0.5235988f) - 1.5707964f;
        l0 l0Var = this.f12419a;
        l0Var.d(i10);
        if (k0.a(l0Var.g(), 0)) {
            this.f12422d = C0901a.a(this.f12420b);
        }
    }

    @Override // androidx.compose.material3.l0
    public final void e(int i10) {
        this.f12421c = (i10 * 0.10471976f) - 1.5707964f;
        l0 l0Var = this.f12419a;
        l0Var.e(i10);
        if (k0.a(l0Var.g(), 1)) {
            this.f12422d = C0901a.a(this.f12421c);
        }
        androidx.compose.runtime.snapshots.g gVarA = androidx.compose.runtime.snapshots.g.a.a();
        Ia.l<Object, p293xa.r> lVarE = gVarA != null ? gVarA.e() : null;
        androidx.compose.runtime.snapshots.g gVarB = androidx.compose.runtime.snapshots.g.a.b(gVarA);
        try {
            l0Var.e(l0Var.a());
            p293xa.r rVar = p293xa.r.f47939a;
        } finally {
            androidx.compose.runtime.snapshots.g.a.d(gVarA, gVarB, lVarE);
        }
    }

    @Override // androidx.compose.material3.l0
    public final void f(int i10) {
        this.f12419a.f(i10);
    }

    @Override // androidx.compose.material3.l0
    public final int g() {
        return this.f12419a.g();
    }

    @Override // androidx.compose.material3.l0
    public final boolean h() {
        return this.f12419a.h();
    }

    @Override // androidx.compose.material3.l0
    public final boolean i() {
        return this.f12419a.i();
    }

    public final float j(float f10) {
        float fFloatValue = this.f12422d.d().floatValue() - f10;
        while (fFloatValue > 3.1415927f) {
            fFloatValue -= 6.2831855f;
        }
        while (fFloatValue <= -3.1415927f) {
            fFloatValue += 6.2831855f;
        }
        return this.f12422d.d().floatValue() - fFloatValue;
    }
}
