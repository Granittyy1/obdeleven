package androidx.compose.material;

import androidx.compose.runtime.C1085f0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.O0;

/* JADX INFO: compiled from: Colors.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ColorsKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final O0 f11693a = new O0(new Ia.a<C1034j>() { // from class: androidx.compose.material.ColorsKt$LocalColors$1
        @Override // Ia.a
        public final C1034j invoke() {
            O0 o10 = ColorsKt.f11693a;
            long jE = Q3.d.e(4284612846L);
            long jE2 = Q3.d.e(4281794739L);
            long jE3 = Q3.d.e(4278442694L);
            long jE4 = Q3.d.e(4278290310L);
            long j = androidx.compose.ui.graphics.H.f13499f;
            long jE5 = Q3.d.e(4289724448L);
            long j10 = androidx.compose.ui.graphics.H.f13495b;
            return new C1034j(jE, jE2, jE3, jE4, j, j, jE5, j, j10, j10, j10, j, true);
        }
    });

    /* JADX WARN: Multi-variable type inference failed */
    public static final long a(C1034j c1034j, long j) {
        if (androidx.compose.ui.graphics.H.c(j, c1034j.f())) {
            return c1034j.d();
        }
        if (androidx.compose.ui.graphics.H.c(j, ((androidx.compose.ui.graphics.H) c1034j.f11890b.getValue()).f13506a)) {
            return c1034j.d();
        }
        boolean zC = androidx.compose.ui.graphics.H.c(j, c1034j.g());
        C1085f0 c1085f0 = c1034j.f11897i;
        if (zC) {
            return ((androidx.compose.ui.graphics.H) c1085f0.getValue()).f13506a;
        }
        if (androidx.compose.ui.graphics.H.c(j, ((androidx.compose.ui.graphics.H) c1034j.f11892d.getValue()).f13506a)) {
            return ((androidx.compose.ui.graphics.H) c1085f0.getValue()).f13506a;
        }
        if (androidx.compose.ui.graphics.H.c(j, c1034j.a())) {
            return c1034j.c();
        }
        if (androidx.compose.ui.graphics.H.c(j, c1034j.h())) {
            return c1034j.e();
        }
        return androidx.compose.ui.graphics.H.c(j, c1034j.b()) ? ((androidx.compose.ui.graphics.H) c1034j.f11899l.getValue()).f13506a : androidx.compose.ui.graphics.H.f13504l;
    }

    public static final long b(long j, InterfaceC1084f interfaceC1084f) {
        interfaceC1084f.L(-702388415);
        long jA = a((C1034j) interfaceC1084f.x(f11693a), j);
        if (jA == 16) {
            jA = ((androidx.compose.ui.graphics.H) interfaceC1084f.x(ContentColorKt.f11715a)).f13506a;
        }
        interfaceC1084f.D();
        return jA;
    }
}
