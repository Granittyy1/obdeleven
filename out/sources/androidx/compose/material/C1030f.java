package androidx.compose.material;

import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.O0;

/* JADX INFO: renamed from: androidx.compose.material.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: Button.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C1030f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final androidx.compose.foundation.layout.N f11882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f11883b = 64;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f11884c = 36;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final androidx.compose.foundation.layout.N f11885d;

    static {
        float f10 = 16;
        float f11 = 8;
        f11882a = new androidx.compose.foundation.layout.N(f10, f11, f10, f11);
        f11885d = new androidx.compose.foundation.layout.N(f11, f11, f11, f11);
    }

    public static C1035k a(long j, long j10, long j11, InterfaceC1084f interfaceC1084f, int i10, int i11) {
        long jI;
        long jB;
        long jF = (i11 & 1) != 0 ? ((C1034j) interfaceC1084f.x(ColorsKt.f11693a)).f() : j;
        long jB2 = ColorsKt.b(jF, interfaceC1084f);
        if ((i11 & 4) != 0) {
            O0 o10 = ColorsKt.f11693a;
            jI = Q3.d.i(androidx.compose.ui.graphics.H.b(0.12f, ((C1034j) interfaceC1084f.x(o10)).e()), ((C1034j) interfaceC1084f.x(o10)).h());
        } else {
            jI = j10;
        }
        if ((i11 & 8) != 0) {
            O0 o11 = ColorsKt.f11693a;
            long jE = ((C1034j) interfaceC1084f.x(o11)).e();
            long j12 = ((androidx.compose.ui.graphics.H) interfaceC1084f.x(ContentColorKt.f11715a)).f13506a;
            if (((C1034j) interfaceC1084f.x(o11)).i()) {
                Q3.d.D(j12);
            } else {
                Q3.d.D(j12);
            }
            jB = androidx.compose.ui.graphics.H.b(0.38f, jE);
        } else {
            jB = j11;
        }
        return new C1035k(jF, jB2, jI, jB);
    }

    public static C1035k b(long j, InterfaceC1084f interfaceC1084f, int i10) {
        long j10 = androidx.compose.ui.graphics.H.f13503k;
        if ((i10 & 2) != 0) {
            j = ((C1034j) interfaceC1084f.x(ColorsKt.f11693a)).f();
        }
        long j11 = j;
        O0 o10 = ColorsKt.f11693a;
        long jE = ((C1034j) interfaceC1084f.x(o10)).e();
        long j12 = ((androidx.compose.ui.graphics.H) interfaceC1084f.x(ContentColorKt.f11715a)).f13506a;
        if (((C1034j) interfaceC1084f.x(o10)).i()) {
            Q3.d.D(j12);
        } else {
            Q3.d.D(j12);
        }
        return new C1035k(j10, j11, j10, androidx.compose.ui.graphics.H.b(0.38f, jE));
    }
}
