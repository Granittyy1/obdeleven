package com.voltasit.obdeleven.presentation.components.dialog;

import Ia.a;
import Ia.p;
import L4.b;
import S4.o;
import androidx.compose.material.AndroidAlertDialog_androidKt;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import com.voltasit.obdeleven.presentation.e;
import kotlin.jvm.internal.i;
import me.zhanghai.android.materialprogressbar.R;
import p293xa.r;

/* JADX INFO: compiled from: AreYouSureDialog.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class AreYouSureDialogKt {
    public static final void a(final a<r> onDismissRequest, final a<r> onCancelClick, final a<r> onProceedClick, InterfaceC1084f interfaceC1084f, final int i10) {
        int i11;
        C1086g c1086g;
        i.e(onDismissRequest, "onDismissRequest");
        i.e(onCancelClick, "onCancelClick");
        i.e(onProceedClick, "onProceedClick");
        C1086g c1086gP = interfaceC1084f.p(-1779144573);
        if ((i10 & 14) == 0) {
            i11 = (c1086gP.k(onDismissRequest) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i11 |= c1086gP.k(onCancelClick) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= c1086gP.k(onProceedClick) ? 256 : 128;
        }
        if ((i11 & 731) == 146 && c1086gP.s()) {
            c1086gP.w();
            c1086g = c1086gP;
        } else {
            c1086g = c1086gP;
            AndroidAlertDialog_androidKt.a(onDismissRequest, androidx.compose.runtime.internal.a.b(-2003019061, new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.components.dialog.AreYouSureDialogKt$AreYouSureDialog$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                    if ((num.intValue() & 11) == 2 && interfaceC1084f3.s()) {
                        interfaceC1084f3.w();
                    } else {
                        DialogButtonKt.a(o.p(interfaceC1084f3, com.voltasit.obdeleven.R.string.common_cancel), onCancelClick, interfaceC1084f3, 0);
                    }
                    return r.f47939a;
                }
            }, c1086gP), null, androidx.compose.runtime.internal.a.b(-1658190899, new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.components.dialog.AreYouSureDialogKt$AreYouSureDialog$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                    if ((num.intValue() & 11) == 2 && interfaceC1084f3.s()) {
                        interfaceC1084f3.w();
                    } else {
                        DialogButtonKt.a(o.p(interfaceC1084f3, com.voltasit.obdeleven.R.string.common_proceed), onProceedClick, interfaceC1084f3, 0);
                    }
                    return r.f47939a;
                }
            }, c1086gP), ComposableSingletons$AreYouSureDialogKt.f31384a, ComposableSingletons$AreYouSureDialogKt.f31385b, null, e.a.f32296t, 0L, null, c1086g, (i11 & 14) | 12807216, 836);
        }
        C1105p0 c1105p0V = c1086g.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.components.dialog.AreYouSureDialogKt$AreYouSureDialog$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    AreYouSureDialogKt.a(onDismissRequest, onCancelClick, onProceedClick, interfaceC1084f2, b.l(i10 | 1));
                    return r.f47939a;
                }
            };
        }
    }
}
