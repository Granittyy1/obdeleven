package io.intercom.android.sdk.ui.component;

import androidx.compose.foundation.layout.N;
import androidx.compose.foundation.layout.U;
import androidx.compose.foundation.layout.W;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.C1051f;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import io.intercom.android.sdk.m5.components.Q;
import io.intercom.android.sdk.m5.conversation.ui.components.O;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: IntercomButton.kt */
/* JADX INFO: loaded from: classes.dex */
public final class IntercomButtonKt {
    /* JADX WARN: Code duplicated, block: B:46:0x0091  */
    /* JADX WARN: Code duplicated, block: B:47:0x0094  */
    /* JADX WARN: Code duplicated, block: B:49:0x009a  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:60:0x00bd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:62:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:65:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:69:0x012d  */
    /* JADX WARN: Code duplicated, block: B:71:? A[RETURN, SYNTHETIC] */
    public static final void IntercomButton(androidx.compose.ui.h hVar, final IntercomButton.Style style, final String text, Integer num, final Ia.a<p293xa.r> onClick, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        androidx.compose.ui.h hVar2;
        int i12;
        Integer num2;
        int i13;
        androidx.compose.ui.h hVar3;
        final Integer num3;
        final Integer num4;
        C1105p0 c1105p0V;
        kotlin.jvm.internal.i.e(style, "style");
        kotlin.jvm.internal.i.e(text, "text");
        kotlin.jvm.internal.i.e(onClick, "onClick");
        C1086g c1086gP = interfaceC1084f.p(1819808567);
        int i14 = i11 & 1;
        if (i14 != 0) {
            i12 = i10 | 6;
            hVar2 = hVar;
        } else if ((i10 & 14) == 0) {
            hVar2 = hVar;
            i12 = (c1086gP.K(hVar2) ? 4 : 2) | i10;
        } else {
            hVar2 = hVar;
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i12 |= c1086gP.K(style) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 896) == 0) {
            i12 |= c1086gP.K(text) ? 256 : 128;
        }
        int i15 = i11 & 8;
        if (i15 == 0) {
            if ((i10 & 7168) == 0) {
                num2 = num;
                i12 |= c1086gP.K(num2) ? 2048 : 1024;
            }
            if ((i11 & 16) != 0) {
                i12 |= 24576;
            } else if ((57344 & i10) == 0) {
                if (c1086gP.k(onClick)) {
                    i13 = 16384;
                } else {
                    i13 = 8192;
                }
                i12 |= i13;
            }
            if ((46811 & i12) == 9362 || !c1086gP.s()) {
                if (i14 != 0) {
                    hVar3 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar3 = hVar2;
                }
                if (i15 != 0) {
                    num3 = null;
                } else {
                    num3 = num2;
                }
                N n10 = C1051f.f12444a;
                float f10 = 12;
                float f11 = 10;
                ButtonKt.b(onClick, hVar3, false, IntercomTheme.INSTANCE.getShapes(c1086gP, 6).f12430b, C1051f.f(style.m528getBackgroundColor0d7_KjU(), style.m529getContentColor0d7_KjU(), c1086gP), null, style.getBorder(), new N(f10, f11, f10, f11), null, androidx.compose.runtime.internal.a.b(905924137, new Ia.q<U, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.IntercomButtonKt.IntercomButton.1
                    @Override // Ia.q
                    public /* bridge */ /* synthetic */ p293xa.r invoke(U u10, InterfaceC1084f interfaceC1084f2, Integer num5) {
                        invoke(u10, interfaceC1084f2, num5.intValue());
                        return p293xa.r.f47939a;
                    }

                    public final void invoke(U OutlinedButton, InterfaceC1084f interfaceC1084f2, int i16) {
                        kotlin.jvm.internal.i.e(OutlinedButton, "$this$OutlinedButton");
                        if ((i16 & 81) == 16 && interfaceC1084f2.s()) {
                            interfaceC1084f2.w();
                            return;
                        }
                        TextKt.b(text, null, style.m529getContentColor0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(interfaceC1084f2, 6).getType04(), interfaceC1084f2, 0, 0, 65530);
                        Integer num5 = num3;
                        if (num5 == null) {
                            return;
                        }
                        IntercomButton.Style style2 = style;
                        int iIntValue = num5.intValue();
                        androidx.compose.ui.h.a aVar = androidx.compose.ui.h.a.f13984b;
                        Lb.a.a(interfaceC1084f2, W.q(aVar, 6));
                        IconKt.a(U.c.a(iIntValue, interfaceC1084f2, 0), null, W.m(aVar, 16), style2.m529getContentColor0d7_KjU(), interfaceC1084f2, 440, 0);
                    }
                }, c1086gP), c1086gP, ((i12 >> 12) & 14) | 817889280 | ((i12 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle), 292);
                hVar2 = hVar3;
                num4 = num3;
            } else {
                c1086gP.w();
                num4 = num2;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                final androidx.compose.ui.h hVar4 = hVar2;
                c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.ui.component.j
                    @Override // Ia.p
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return IntercomButtonKt.IntercomButton$lambda$0(hVar4, style, text, num4, onClick, i10, i11, (InterfaceC1084f) obj, iIntValue);
                    }
                };
            }
        }
        i12 |= 3072;
        num2 = num;
        if ((i11 & 16) != 0) {
            i12 |= 24576;
        } else if ((57344 & i10) == 0) {
            if (c1086gP.k(onClick)) {
                i13 = 16384;
            } else {
                i13 = 8192;
            }
            i12 |= i13;
        }
        if ((46811 & i12) == 9362) {
            if (i14 != 0) {
                hVar3 = androidx.compose.ui.h.a.f13984b;
            } else {
                hVar3 = hVar2;
            }
            if (i15 != 0) {
                num3 = null;
            } else {
                num3 = num2;
            }
            N n11 = C1051f.f12444a;
            float f12 = 12;
            float f13 = 10;
            ButtonKt.b(onClick, hVar3, false, IntercomTheme.INSTANCE.getShapes(c1086gP, 6).f12430b, C1051f.f(style.m528getBackgroundColor0d7_KjU(), style.m529getContentColor0d7_KjU(), c1086gP), null, style.getBorder(), new N(f12, f13, f12, f13), null, androidx.compose.runtime.internal.a.b(905924137, new Ia.q<U, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.IntercomButtonKt.IntercomButton.1
                @Override // Ia.q
                public /* bridge */ /* synthetic */ p293xa.r invoke(U u10, InterfaceC1084f interfaceC1084f2, Integer num5) {
                    invoke(u10, interfaceC1084f2, num5.intValue());
                    return p293xa.r.f47939a;
                }

                public final void invoke(U OutlinedButton, InterfaceC1084f interfaceC1084f2, int i16) {
                    kotlin.jvm.internal.i.e(OutlinedButton, "$this$OutlinedButton");
                    if ((i16 & 81) == 16 && interfaceC1084f2.s()) {
                        interfaceC1084f2.w();
                        return;
                    }
                    TextKt.b(text, null, style.m529getContentColor0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(interfaceC1084f2, 6).getType04(), interfaceC1084f2, 0, 0, 65530);
                    Integer num5 = num3;
                    if (num5 == null) {
                        return;
                    }
                    IntercomButton.Style style2 = style;
                    int iIntValue = num5.intValue();
                    androidx.compose.ui.h.a aVar = androidx.compose.ui.h.a.f13984b;
                    Lb.a.a(interfaceC1084f2, W.q(aVar, 6));
                    IconKt.a(U.c.a(iIntValue, interfaceC1084f2, 0), null, W.m(aVar, 16), style2.m529getContentColor0d7_KjU(), interfaceC1084f2, 440, 0);
                }
            }, c1086gP), c1086gP, ((i12 >> 12) & 14) | 817889280 | ((i12 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle), 292);
            hVar2 = hVar3;
            num4 = num3;
        } else {
            if (i14 != 0) {
                hVar3 = androidx.compose.ui.h.a.f13984b;
            } else {
                hVar3 = hVar2;
            }
            if (i15 != 0) {
                num3 = null;
            } else {
                num3 = num2;
            }
            N n12 = C1051f.f12444a;
            float f14 = 12;
            float f15 = 10;
            ButtonKt.b(onClick, hVar3, false, IntercomTheme.INSTANCE.getShapes(c1086gP, 6).f12430b, C1051f.f(style.m528getBackgroundColor0d7_KjU(), style.m529getContentColor0d7_KjU(), c1086gP), null, style.getBorder(), new N(f14, f15, f14, f15), null, androidx.compose.runtime.internal.a.b(905924137, new Ia.q<U, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.IntercomButtonKt.IntercomButton.1
                @Override // Ia.q
                public /* bridge */ /* synthetic */ p293xa.r invoke(U u10, InterfaceC1084f interfaceC1084f2, Integer num5) {
                    invoke(u10, interfaceC1084f2, num5.intValue());
                    return p293xa.r.f47939a;
                }

                public final void invoke(U OutlinedButton, InterfaceC1084f interfaceC1084f2, int i16) {
                    kotlin.jvm.internal.i.e(OutlinedButton, "$this$OutlinedButton");
                    if ((i16 & 81) == 16 && interfaceC1084f2.s()) {
                        interfaceC1084f2.w();
                        return;
                    }
                    TextKt.b(text, null, style.m529getContentColor0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(interfaceC1084f2, 6).getType04(), interfaceC1084f2, 0, 0, 65530);
                    Integer num5 = num3;
                    if (num5 == null) {
                        return;
                    }
                    IntercomButton.Style style2 = style;
                    int iIntValue = num5.intValue();
                    androidx.compose.ui.h.a aVar = androidx.compose.ui.h.a.f13984b;
                    Lb.a.a(interfaceC1084f2, W.q(aVar, 6));
                    IconKt.a(U.c.a(iIntValue, interfaceC1084f2, 0), null, W.m(aVar, 16), style2.m529getContentColor0d7_KjU(), interfaceC1084f2, 440, 0);
                }
            }, c1086gP), c1086gP, ((i12 >> 12) & 14) | 817889280 | ((i12 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle), 292);
            hVar2 = hVar3;
            num4 = num3;
        }
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            final androidx.compose.ui.h hVar5 = hVar2;
            c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.ui.component.j
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return IntercomButtonKt.IntercomButton$lambda$0(hVar5, style, text, num4, onClick, i10, i11, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r IntercomButton$lambda$0(androidx.compose.ui.h hVar, IntercomButton.Style style, String text, Integer num, Ia.a onClick, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        kotlin.jvm.internal.i.e(style, "$style");
        kotlin.jvm.internal.i.e(text, "$text");
        kotlin.jvm.internal.i.e(onClick, "$onClick");
        IntercomButton(hVar, style, text, num, onClick, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return p293xa.r.f47939a;
    }

    @IntercomPreviews
    private static final void OutlinedButtonPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(-2065130974);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$IntercomButtonKt.INSTANCE.m509getLambda3$intercom_sdk_ui_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new O(i10, 7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r OutlinedButtonPreview$lambda$3(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        OutlinedButtonPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    @IntercomPreviews
    private static final void PrimaryButtonPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(1818981662);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$IntercomButtonKt.INSTANCE.m507getLambda1$intercom_sdk_ui_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new io.intercom.android.sdk.helpcenter.articles.t(i10, 6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r PrimaryButtonPreview$lambda$1(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        PrimaryButtonPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    @IntercomPreviews
    private static final void PrimaryButtonWithTrailingIconPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(-340414909);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$IntercomButtonKt.INSTANCE.m508getLambda2$intercom_sdk_ui_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Q(i10, 9);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r PrimaryButtonWithTrailingIconPreview$lambda$2(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        PrimaryButtonWithTrailingIconPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }
}
