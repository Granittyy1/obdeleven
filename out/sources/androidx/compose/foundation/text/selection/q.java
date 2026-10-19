package androidx.compose.foundation.text.selection;

import androidx.compose.ui.layout.InterfaceC1170p;

/* JADX INFO: compiled from: SelectionManager.kt */
/* JADX INFO: loaded from: classes.dex */
public final class q {
    public static final I.f a(InterfaceC1170p interfaceC1170p) {
        I.f fVarC = kotlin.jvm.internal.n.c(interfaceC1170p);
        long jT = interfaceC1170p.T((((long) Float.floatToRawIntBits(fVarC.f3757a)) << 32) | (((long) Float.floatToRawIntBits(fVarC.f3758b)) & 4294967295L));
        long jT2 = interfaceC1170p.T((((long) Float.floatToRawIntBits(fVarC.f3759c)) << 32) | (((long) Float.floatToRawIntBits(fVarC.f3760d)) & 4294967295L));
        return new I.f(Float.intBitsToFloat((int) (jT >> 32)), Float.intBitsToFloat((int) (jT & 4294967295L)), Float.intBitsToFloat((int) (jT2 >> 32)), Float.intBitsToFloat((int) (jT2 & 4294967295L)));
    }
}
