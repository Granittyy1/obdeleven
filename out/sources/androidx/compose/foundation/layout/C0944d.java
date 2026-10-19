package androidx.compose.foundation.layout;

import A1.C0575j;
import androidx.compose.runtime.C1085f0;
import androidx.compose.runtime.J0;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.view.n0;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: WindowInsets.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C0944d implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10276b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1085f0 f10277c = J0.f(p222s0.b.f46850e);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C1085f0 f10278d = J0.f(Boolean.TRUE);

    public C0944d(int i10, String str) {
        this.f10275a = i10;
        this.f10276b = str;
    }

    @Override // androidx.compose.foundation.layout.a0
    public final int a(p013b0.c cVar, LayoutDirection layoutDirection) {
        return e().f46851a;
    }

    @Override // androidx.compose.foundation.layout.a0
    public final int b(p013b0.c cVar) {
        return e().f46854d;
    }

    @Override // androidx.compose.foundation.layout.a0
    public final int c(p013b0.c cVar, LayoutDirection layoutDirection) {
        return e().f46853c;
    }

    @Override // androidx.compose.foundation.layout.a0
    public final int d(p013b0.c cVar) {
        return e().f46852b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final p222s0.b e() {
        return (p222s0.b) this.f10277c.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0944d) {
            return this.f10275a == ((C0944d) obj).f10275a;
        }
        return false;
    }

    public final void f(n0 n0Var, int i10) {
        int i11 = this.f10275a;
        if (i10 == 0 || (i10 & i11) != 0) {
            this.f10277c.setValue(n0Var.f16948a.g(i11));
            this.f10278d.setValue(Boolean.valueOf(n0Var.f16948a.q(i11)));
        }
    }

    public final int hashCode() {
        return this.f10275a;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f10276b);
        sb2.append('(');
        sb2.append(e().f46851a);
        sb2.append(", ");
        sb2.append(e().f46852b);
        sb2.append(", ");
        sb2.append(e().f46853c);
        sb2.append(", ");
        return C0575j.b(sb2, e().f46854d, ')');
    }
}
