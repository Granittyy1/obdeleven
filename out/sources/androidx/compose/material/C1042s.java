package androidx.compose.material;

import androidx.compose.ui.node.C1183d;

/* JADX INFO: renamed from: androidx.compose.material.s, reason: case insensitive filesystem */
/* JADX INFO: compiled from: Ripple.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C1042s implements androidx.compose.ui.graphics.L {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1043t f12021b;

    public C1042s(C1043t c1043t) {
        this.f12021b = c1043t;
    }

    @Override // androidx.compose.ui.graphics.L
    public final long a() {
        C1043t c1043t = this.f12021b;
        long jA = c1043t.f12025u.a();
        if (jA != 16) {
            return jA;
        }
        J j = (J) C1183d.a(c1043t, RippleKt.f11791a);
        if (j != null) {
            long j10 = j.f11765a;
            if (j10 != 16) {
                return j10;
            }
        }
        long j11 = ((androidx.compose.ui.graphics.H) C1183d.a(c1043t, ContentColorKt.f11715a)).f13506a;
        return (((C1034j) C1183d.a(c1043t, ColorsKt.f11693a)).i() || ((double) Q3.d.D(j11)) >= 0.5d) ? j11 : androidx.compose.ui.graphics.H.f13499f;
    }
}
