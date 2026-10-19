package com.voltasit.obdeleven.presentation.components.dialog;

import G0.a;
import Ia.p;
import L4.b;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.ui.text.font.l;
import kotlin.jvm.internal.i;
import p293xa.r;

/* JADX INFO: compiled from: DialogTitle.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class DialogTitleKt {
    public static final void a(final String text, InterfaceC1084f interfaceC1084f, final int i10) {
        int i11;
        C1086g c1086g;
        i.e(text, "text");
        C1086g c1086gP = interfaceC1084f.p(-1595250086);
        if ((i10 & 14) == 0) {
            i11 = (c1086gP.K(text) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 11) == 2 && c1086gP.s()) {
            c1086gP.w();
            c1086g = c1086gP;
        } else {
            c1086g = c1086gP;
            TextKt.b(text, null, 0L, a.g(20), null, l.f15443h, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086g, (i11 & 14) | 199680, 0, 131030);
        }
        C1105p0 c1105p0V = c1086g.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.components.dialog.DialogTitleKt$DialogTitle$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    DialogTitleKt.a(text, interfaceC1084f2, b.l(i10 | 1));
                    return r.f47939a;
                }
            };
        }
    }
}
