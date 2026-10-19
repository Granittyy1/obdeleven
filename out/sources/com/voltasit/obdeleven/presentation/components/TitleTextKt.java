package com.voltasit.obdeleven.presentation.components;

import Ia.p;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material.C1034j;
import androidx.compose.material.ColorsKt;
import androidx.compose.material.TextKt;
import androidx.compose.material.TypographyKt;
import androidx.compose.material.V;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.ui.h;
import androidx.compose.ui.text.font.l;
import androidx.compose.ui.text.style.g;
import kotlin.jvm.internal.i;
import p293xa.r;

/* JADX INFO: compiled from: TitleText.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class TitleTextKt {
    public static final void a(final String text, InterfaceC1084f interfaceC1084f, final int i10) {
        int i11;
        C1086g c1086g;
        i.e(text, "text");
        C1086g c1086gP = interfaceC1084f.p(-1015424860);
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
            TextKt.b(text, PaddingKt.h(h.a.f13984b, 16, 0.0f, 2), ((C1034j) c1086gP.x(ColorsKt.f11693a)).d(), G0.a.g(26), null, l.f15443h, androidx.compose.ui.text.font.d.f15426c, 0L, null, new g(3), 0L, 0, false, 0, 0, null, ((V) c1086gP.x(TypographyKt.f11864b)).f11870e, c1086g, (i11 & 14) | 199728, 0, 64912);
        }
        C1105p0 c1105p0V = c1086g.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.components.TitleTextKt$TitleText$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    TitleTextKt.a(text, interfaceC1084f2, L4.b.l(i10 | 1));
                    return r.f47939a;
                }
            };
        }
    }
}
