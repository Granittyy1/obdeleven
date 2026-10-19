package com.voltasit.obdeleven.presentation.components.dialog;

import Ia.a;
import Ia.p;
import Ia.q;
import L4.b;
import androidx.compose.foundation.layout.N;
import androidx.compose.foundation.layout.U;
import androidx.compose.material.ButtonKt;
import androidx.compose.material.C1030f;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.ui.text.font.l;
import com.voltasit.obdeleven.presentation.e;
import java.util.Locale;
import kotlin.jvm.internal.i;
import me.zhanghai.android.materialprogressbar.R;
import p293xa.r;

/* JADX INFO: compiled from: DialogButton.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class DialogButtonKt {
    public static final void a(final String text, final a<r> onClick, InterfaceC1084f interfaceC1084f, final int i10) {
        int i11;
        i.e(text, "text");
        i.e(onClick, "onClick");
        C1086g c1086gP = interfaceC1084f.p(2101789488);
        if ((i10 & 14) == 0) {
            i11 = (c1086gP.K(text) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i11 |= c1086gP.k(onClick) ? 32 : 16;
        }
        if ((i11 & 91) == 18 && c1086gP.s()) {
            c1086gP.w();
        } else {
            N n10 = C1030f.f11882a;
            ButtonKt.b(onClick, null, C1030f.b(e.a.f32286i, c1086gP, 5), androidx.compose.runtime.internal.a.b(1027234925, new q<U, InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.components.dialog.DialogButtonKt$DialogButton$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // Ia.q
                public final r invoke(U u10, InterfaceC1084f interfaceC1084f2, Integer num) {
                    U TextButton = u10;
                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                    int iIntValue = num.intValue();
                    i.e(TextButton, "$this$TextButton");
                    if ((iIntValue & 81) == 16 && interfaceC1084f3.s()) {
                        interfaceC1084f3.w();
                    } else {
                        String upperCase = text.toUpperCase(Locale.ROOT);
                        i.d(upperCase, "toUpperCase(...)");
                        TextKt.b(upperCase, null, 0L, G0.a.g(14), null, l.f15443h, null, G0.a.g(1), null, null, 0L, 0, false, 0, 0, null, null, interfaceC1084f3, 12782592, 0, 130902);
                    }
                    return r.f47939a;
                }
            }, c1086gP), c1086gP, ((i11 >> 3) & 14) | 805306368, 382);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.components.dialog.DialogButtonKt$DialogButton$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    DialogButtonKt.a(text, onClick, interfaceC1084f2, b.l(i10 | 1));
                    return r.f47939a;
                }
            };
        }
    }
}
