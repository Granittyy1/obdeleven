package androidx.compose.foundation.text;

import androidx.compose.ui.layout.InterfaceC1170p;
import androidx.compose.ui.text.input.TextFieldValue;

/* JADX INFO: compiled from: TextFieldDelegate.kt */
/* JADX INFO: loaded from: classes.dex */
public final class v {
    public static void a(TextFieldValue textFieldValue, r rVar, androidx.compose.ui.text.B b10, InterfaceC1170p interfaceC1170p, androidx.compose.ui.text.input.C c10, boolean z10, androidx.compose.ui.text.input.r rVar2) {
        I.f fVar;
        if (z10) {
            int iB = rVar2.b(androidx.compose.ui.text.E.d(textFieldValue.f15492b));
            if (iB < b10.f15300a.f15276a.f15408c.length()) {
                fVar = b10.b(iB);
            } else if (iB != 0) {
                fVar = b10.b(iB - 1);
            } else {
                fVar = new I.f(0.0f, 0.0f, 1.0f, (int) (w.a(rVar.f11521b, rVar.f11526g, rVar.f11527h, w.f11633a, 1) & 4294967295L));
            }
            float f10 = fVar.f3757a;
            long jFloatToRawIntBits = Float.floatToRawIntBits(f10);
            float f11 = fVar.f3758b;
            long jG0 = interfaceC1170p.g0((jFloatToRawIntBits << 32) | (((long) Float.floatToRawIntBits(f11)) & 4294967295L));
            float fIntBitsToFloat = Float.intBitsToFloat((int) (jG0 >> 32));
            I.f fVarA = p111ia.c.a((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jG0 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32), (((long) Float.floatToRawIntBits(fVar.f3759c - f10)) << 32) | (((long) Float.floatToRawIntBits(fVar.f3760d - f11)) & 4294967295L));
            if (kotlin.jvm.internal.i.a(c10.f15480a.f15580b.get(), c10)) {
                c10.f15481b.e(fVarA);
            }
        }
    }
}
