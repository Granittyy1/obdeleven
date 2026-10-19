package androidx.compose.foundation.layout;

import androidx.compose.ui.unit.LayoutDirection;

/* JADX INFO: compiled from: WindowInsets.kt */
/* JADX INFO: loaded from: classes.dex */
public final class J implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f10161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10162b;

    public J(a0 a0Var, int i10) {
        this.f10161a = a0Var;
        this.f10162b = i10;
    }

    @Override // androidx.compose.foundation.layout.a0
    public final int a(p013b0.c cVar, LayoutDirection layoutDirection) {
        if (((layoutDirection == LayoutDirection.f15717b ? 8 : 2) & this.f10162b) != 0) {
            return this.f10161a.a(cVar, layoutDirection);
        }
        return 0;
    }

    @Override // androidx.compose.foundation.layout.a0
    public final int b(p013b0.c cVar) {
        if ((this.f10162b & 32) != 0) {
            return this.f10161a.b(cVar);
        }
        return 0;
    }

    @Override // androidx.compose.foundation.layout.a0
    public final int c(p013b0.c cVar, LayoutDirection layoutDirection) {
        if (((layoutDirection == LayoutDirection.f15717b ? 4 : 1) & this.f10162b) != 0) {
            return this.f10161a.c(cVar, layoutDirection);
        }
        return 0;
    }

    @Override // androidx.compose.foundation.layout.a0
    public final int d(p013b0.c cVar) {
        if ((this.f10162b & 16) != 0) {
            return this.f10161a.d(cVar);
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof J)) {
            return false;
        }
        J j = (J) obj;
        if (kotlin.jvm.internal.i.a(this.f10161a, j.f10161a)) {
            if (this.f10162b == j.f10162b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f10162b) + (this.f10161a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("(");
        sb2.append(this.f10161a);
        sb2.append(" only ");
        StringBuilder sb3 = new StringBuilder("WindowInsetsSides(");
        StringBuilder sb4 = new StringBuilder();
        int i10 = this.f10162b;
        int i11 = d0.f10279a;
        if ((i10 & i11) == i11) {
            d0.a(sb4, "Start");
        }
        int i12 = d0.f10281c;
        if ((i10 & i12) == i12) {
            d0.a(sb4, "Left");
        }
        if ((i10 & 16) == 16) {
            d0.a(sb4, "Top");
        }
        int i13 = d0.f10280b;
        if ((i10 & i13) == i13) {
            d0.a(sb4, "End");
        }
        int i14 = d0.f10282d;
        if ((i10 & i14) == i14) {
            d0.a(sb4, "Right");
        }
        if ((i10 & 32) == 32) {
            d0.a(sb4, "Bottom");
        }
        String string = sb4.toString();
        kotlin.jvm.internal.i.d(string, "toString(...)");
        sb3.append(string);
        sb3.append(')');
        sb2.append((Object) sb3.toString());
        sb2.append(')');
        return sb2.toString();
    }
}
