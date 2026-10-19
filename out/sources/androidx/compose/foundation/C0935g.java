package androidx.compose.foundation;

import androidx.compose.ui.graphics.l0;
import androidx.compose.ui.graphics.m0;

/* JADX INFO: renamed from: androidx.compose.foundation.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: Border.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C0935g {
    public static final androidx.compose.ui.h a(androidx.compose.ui.h hVar, float f10, long j, p270w.a aVar) {
        return b(hVar, f10, new m0(j), aVar);
    }

    public static final androidx.compose.ui.h b(androidx.compose.ui.h hVar, float f10, androidx.compose.ui.graphics.C c10, l0 l0Var) {
        return hVar.i(new BorderModifierNodeElement(f10, c10, l0Var));
    }

    public static final long c(float f10, long j) {
        float fMax = Math.max(0.0f, Float.intBitsToFloat((int) (j >> 32)) - f10);
        float fMax2 = Math.max(0.0f, Float.intBitsToFloat((int) (j & 4294967295L)) - f10);
        return (((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fMax2)) & 4294967295L);
    }
}
