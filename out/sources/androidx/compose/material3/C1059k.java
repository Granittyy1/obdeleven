package androidx.compose.material3;

import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.runtime.InterfaceC1084f;

/* JADX INFO: renamed from: androidx.compose.material3.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: Card.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C1059k {
    public static C1058j a(long j, long j10, InterfaceC1084f interfaceC1084f, int i10, int i11) {
        long j11 = j;
        long jB = (i11 & 2) != 0 ? ColorSchemeKt.b(j11, interfaceC1084f) : j10;
        long j12 = androidx.compose.ui.graphics.H.f13504l;
        long jB2 = androidx.compose.ui.graphics.H.b(0.38f, jB);
        C1058j c1058jC = c((C1061m) interfaceC1084f.x(ColorSchemeKt.f12087a));
        if (j11 == 16) {
            j11 = c1058jC.f12587a;
        }
        long j13 = j11;
        if (jB == 16) {
            jB = c1058jC.f12588b;
        }
        long j14 = jB;
        if (j12 == 16) {
            j12 = c1058jC.f12589c;
        }
        long j15 = j12;
        if (jB2 == 16) {
            jB2 = c1058jC.f12590d;
        }
        return new C1058j(j13, j14, j15, jB2);
    }

    public static C1060l b(float f10, int i10) {
        if ((i10 & 1) != 0) {
            f10 = B.l.f1288a;
        }
        return new C1060l(f10, B.l.f1296i, B.l.f1294g, B.l.f1295h, B.l.f1293f, B.l.f1291d);
    }

    public static C1058j c(C1061m c1061m) {
        C1058j c1058j = c1061m.f12611N;
        if (c1058j != null) {
            return c1058j;
        }
        float f10 = B.l.f1288a;
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.f12729v;
        C1058j c1058j2 = new C1058j(ColorSchemeKt.c(c1061m, colorSchemeKeyTokens), ColorSchemeKt.a(c1061m, ColorSchemeKt.c(c1061m, colorSchemeKeyTokens)), Q3.d.i(androidx.compose.ui.graphics.H.b(B.l.f1292e, ColorSchemeKt.c(c1061m, B.l.f1290c)), ColorSchemeKt.c(c1061m, colorSchemeKeyTokens)), androidx.compose.ui.graphics.H.b(0.38f, ColorSchemeKt.a(c1061m, ColorSchemeKt.c(c1061m, colorSchemeKeyTokens))));
        c1061m.f12611N = c1058j2;
        return c1058j2;
    }
}
