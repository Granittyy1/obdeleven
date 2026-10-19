package androidx.compose.foundation.text.input.internal;

import android.graphics.PointF;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.ui.layout.InterfaceC1170p;
import androidx.compose.ui.platform.Y0;
import androidx.compose.ui.text.C1268i;

/* JADX INFO: compiled from: HandwritingGesture.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class Q {
    public static final int a(LegacyTextFieldState legacyTextFieldState, long j, Y0 y10) {
        androidx.compose.ui.text.B b10;
        long jC0;
        int iE;
        androidx.compose.foundation.text.A aD = legacyTextFieldState.d();
        if (aD == null || (b10 = aD.f11055a) == null) {
            return -1;
        }
        C1268i c1268i = b10.f15301b;
        InterfaceC1170p interfaceC1170pC = legacyTextFieldState.c();
        if (interfaceC1170pC == null || (iE = e(c1268i, (jC0 = interfaceC1170pC.c0(j)), y10)) == -1) {
            return -1;
        }
        return c1268i.g(I.d.a((c1268i.b(iE) + c1268i.f(iE)) / 2.0f, 1, jC0));
    }

    public static final long b(LegacyTextFieldState legacyTextFieldState, I.f fVar, I.f fVar2, int i10) {
        long jF = f(legacyTextFieldState, fVar, i10);
        if (androidx.compose.ui.text.E.b(jF)) {
            return androidx.compose.ui.text.E.f15314b;
        }
        long jF2 = f(legacyTextFieldState, fVar2, i10);
        if (androidx.compose.ui.text.E.b(jF2)) {
            return androidx.compose.ui.text.E.f15314b;
        }
        int i11 = (int) (jF >> 32);
        int i12 = (int) (jF2 & 4294967295L);
        return O.h.b(Math.min(i11, i11), Math.max(i12, i12));
    }

    public static final boolean c(androidx.compose.ui.text.B b10, int i10) {
        int iD = b10.f15301b.d(i10);
        if (i10 == b10.g(iD) || i10 == b10.f15301b.c(iD, false)) {
            if (b10.h(i10) == b10.a(i10)) {
                return false;
            }
        } else if (b10.a(i10) == b10.a(i10 - 1)) {
            return false;
        }
        return true;
    }

    public static final long d(PointF pointF) {
        float f10 = pointF.x;
        float f11 = pointF.y;
        return (((long) Float.floatToRawIntBits(f10)) << 32) | (((long) Float.floatToRawIntBits(f11)) & 4294967295L);
    }

    public static final int e(C1268i c1268i, long j, Y0 y10) {
        float fG = y10 != null ? y10.g() : 0.0f;
        int i10 = (int) (4294967295L & j);
        int iE = c1268i.e(Float.intBitsToFloat(i10));
        if (Float.intBitsToFloat(i10) >= c1268i.f(iE) - fG && Float.intBitsToFloat(i10) <= c1268i.b(iE) + fG) {
            int i11 = (int) (j >> 32);
            if (Float.intBitsToFloat(i11) >= (-fG) && Float.intBitsToFloat(i11) <= c1268i.f15473d + fG) {
                return iE;
            }
        }
        return -1;
    }

    public static final long f(LegacyTextFieldState legacyTextFieldState, I.f fVar, int i10) {
        androidx.compose.ui.text.B b10;
        O.a aVar = androidx.compose.ui.text.y.a.f15711b;
        androidx.compose.foundation.text.A aD = legacyTextFieldState.d();
        C1268i c1268i = (aD == null || (b10 = aD.f11055a) == null) ? null : b10.f15301b;
        InterfaceC1170p interfaceC1170pC = legacyTextFieldState.c();
        return (c1268i == null || interfaceC1170pC == null) ? androidx.compose.ui.text.E.f15314b : c1268i.h(fVar.h(interfaceC1170pC.c0(0L)), i10, aVar);
    }

    public static final boolean g(int i10) {
        int type = Character.getType(i10);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    public static final boolean h(int i10) {
        return Character.isWhitespace(i10) || i10 == 160;
    }

    public static final boolean i(int i10) {
        int type;
        return (!h(i10) || (type = Character.getType(i10)) == 14 || type == 13 || i10 == 10) ? false : true;
    }
}
