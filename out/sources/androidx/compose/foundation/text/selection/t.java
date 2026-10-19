package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.A;
import androidx.compose.ui.layout.InterfaceC1170p;
import androidx.compose.ui.text.B;
import androidx.compose.ui.text.E;
import androidx.compose.ui.text.input.C1269a;
import androidx.compose.ui.text.input.TextFieldValue;
import com.google.android.gms.internal.measurement.M1;
import java.util.List;

/* JADX INFO: compiled from: TextPreparedSelection.kt */
/* JADX INFO: loaded from: classes.dex */
public final class t extends a<t> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextFieldValue f11624h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final A f11625i;

    public t(TextFieldValue textFieldValue, androidx.compose.ui.text.input.r rVar, A a10, x xVar) {
        super(textFieldValue.f15491a, textFieldValue.f15492b, a10 != null ? a10.f11055a : null, rVar, xVar);
        this.f11624h = textFieldValue;
        this.f11625i = a10;
    }

    public final List<androidx.compose.ui.text.input.g> n(Ia.l<? super t, ? extends androidx.compose.ui.text.input.g> lVar) {
        if (!E.b(this.f11590f)) {
            return kotlin.collections.l.s(new C1269a("", 0), new androidx.compose.ui.text.input.x(E.e(this.f11590f), E.e(this.f11590f)));
        }
        androidx.compose.ui.text.input.g gVarInvoke = lVar.invoke(this);
        if (gVarInvoke != null) {
            return M1.k(gVarInvoke);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0011  */
    public final int o(A a10, int i10) {
        I.f fVarH;
        InterfaceC1170p interfaceC1170p = a10.f11056b;
        if (interfaceC1170p == null) {
            fVarH = I.f.f3756e;
        } else {
            InterfaceC1170p interfaceC1170p2 = a10.f11057c;
            fVarH = interfaceC1170p2 != null ? interfaceC1170p2.H(interfaceC1170p, true) : null;
            if (fVarH == null) {
                fVarH = I.f.f3756e;
            }
        }
        long j = this.f11624h.f15492b;
        int i11 = E.f15315c;
        androidx.compose.ui.text.input.r rVar = this.f11588d;
        int iB = rVar.b((int) (j & 4294967295L));
        B b10 = a10.f11055a;
        I.f fVarC = b10.c(iB);
        return rVar.a(b10.f15301b.g((((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (fVarH.c() & 4294967295L)) * i10) + fVarC.f3758b)) & 4294967295L) | (Float.floatToRawIntBits(fVarC.f3757a) << 32)));
    }
}
