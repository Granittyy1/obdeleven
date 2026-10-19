package io.intercom.android.sdk.ui.component;

import androidx.compose.foundation.layout.U;
import androidx.compose.material3.AndroidAlertDialog_androidKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.ui.text.F;
import io.intercom.android.sdk.m5.conversation.ui.components.Y;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: PermissionDeniedDialog.kt */
/* JADX INFO: loaded from: classes.dex */
public final class PermissionDeniedDialogKt {
    /* JADX WARN: Code duplicated, block: B:56:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:58:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:60:0x00af  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:71:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:83:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:86:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:87:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:89:0x0100  */
    /* JADX WARN: Code duplicated, block: B:90:0x0107  */
    /* JADX WARN: Code duplicated, block: B:92:0x010a  */
    /* JADX WARN: Code duplicated, block: B:93:0x0112  */
    /* JADX WARN: Code duplicated, block: B:97:0x0186  */
    /* JADX WARN: Code duplicated, block: B:99:? A[RETURN, SYNTHETIC] */
    public static final void PermissionDeniedDialog(androidx.compose.ui.h hVar, final String message, final String confirmText, final String dismissText, Integer num, Ia.a<p293xa.r> aVar, Ia.a<p293xa.r> aVar2, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        androidx.compose.ui.h hVar2;
        int i12;
        Integer num2;
        int i13;
        Ia.a<p293xa.r> aVar3;
        int i14;
        int i15;
        Ia.a<p293xa.r> aVar4;
        int i16;
        final androidx.compose.ui.h hVar3;
        final Integer num3;
        final Ia.a<p293xa.r> nVar;
        final Ia.a<p293xa.r> aVar5;
        final Ia.a<p293xa.r> aVar6;
        final Ia.a<p293xa.r> aVar7;
        C1105p0 c1105p0V;
        kotlin.jvm.internal.i.e(message, "message");
        kotlin.jvm.internal.i.e(confirmText, "confirmText");
        kotlin.jvm.internal.i.e(dismissText, "dismissText");
        C1086g c1086gP = interfaceC1084f.p(-537034576);
        int i17 = i11 & 1;
        if (i17 != 0) {
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
            i12 |= c1086gP.K(message) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 896) == 0) {
            i12 |= c1086gP.K(confirmText) ? 256 : 128;
        }
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 7168) == 0) {
            i12 |= c1086gP.K(dismissText) ? 2048 : 1024;
        }
        int i18 = i11 & 16;
        if (i18 == 0) {
            if ((57344 & i10) == 0) {
                num2 = num;
                i12 |= c1086gP.K(num2) ? 16384 : 8192;
            }
            i13 = i11 & 32;
            if (i13 != 0) {
                if ((458752 & i10) == 0) {
                    aVar3 = aVar;
                    if (c1086gP.k(aVar3)) {
                        i14 = 131072;
                    } else {
                        i14 = 65536;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 64;
                if (i15 != 0) {
                    if ((3670016 & i10) == 0) {
                        aVar4 = aVar2;
                        if (c1086gP.k(aVar4)) {
                            i16 = 1048576;
                        } else {
                            i16 = 524288;
                        }
                        i12 |= i16;
                    }
                    if ((2995931 & i12) == 599186 || !c1086gP.s()) {
                        if (i17 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (i18 != 0) {
                            num3 = null;
                        } else {
                            num3 = num2;
                        }
                        if (i13 != 0) {
                            nVar = new p050db.n(1);
                        } else {
                            nVar = aVar3;
                        }
                        if (i15 != 0) {
                            aVar5 = new Z0.a(3);
                        } else {
                            aVar5 = aVar4;
                        }
                        AndroidAlertDialog_androidKt.a(nVar, androidx.compose.runtime.internal.a.b(-1474258584, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.3
                            @Override // Ia.p
                            public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num4) {
                                invoke(interfaceC1084f2, num4.intValue());
                                return p293xa.r.f47939a;
                            }

                            public final void invoke(InterfaceC1084f interfaceC1084f2, int i19) {
                                if ((i19 & 11) == 2 && interfaceC1084f2.s()) {
                                    interfaceC1084f2.w();
                                    return;
                                }
                                Ia.a<p293xa.r> aVar8 = aVar5;
                                final String str = confirmText;
                                ButtonKt.c(aVar8, null, false, null, null, null, null, null, null, androidx.compose.runtime.internal.a.b(2118877259, new Ia.q<U, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.3.1
                                    @Override // Ia.q
                                    public /* bridge */ /* synthetic */ p293xa.r invoke(U u10, InterfaceC1084f interfaceC1084f3, Integer num4) {
                                        invoke(u10, interfaceC1084f3, num4.intValue());
                                        return p293xa.r.f47939a;
                                    }

                                    public final void invoke(U TextButton, InterfaceC1084f interfaceC1084f3, int i20) {
                                        kotlin.jvm.internal.i.e(TextButton, "$this$TextButton");
                                        if ((i20 & 81) == 16 && interfaceC1084f3.s()) {
                                            interfaceC1084f3.w();
                                            return;
                                        }
                                        IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                                        F type04SemiBold = intercomTheme.getTypography(interfaceC1084f3, 6).getType04SemiBold();
                                        TextKt.b(str, null, intercomTheme.getColors(interfaceC1084f3, 6).m616getActionContrastWhite0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, type04SemiBold, interfaceC1084f3, 0, 0, 65530);
                                    }
                                }, interfaceC1084f2), interfaceC1084f2, 805306368, 510);
                            }
                        }, c1086gP), hVar3, androidx.compose.runtime.internal.a.b(-868483802, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.4
                            @Override // Ia.p
                            public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num4) {
                                invoke(interfaceC1084f2, num4.intValue());
                                return p293xa.r.f47939a;
                            }

                            public final void invoke(InterfaceC1084f interfaceC1084f2, int i19) {
                                if ((i19 & 11) == 2 && interfaceC1084f2.s()) {
                                    interfaceC1084f2.w();
                                    return;
                                }
                                Ia.a<p293xa.r> aVar8 = nVar;
                                final String str = dismissText;
                                ButtonKt.c(aVar8, null, false, null, null, null, null, null, null, androidx.compose.runtime.internal.a.b(-1570315255, new Ia.q<U, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.4.1
                                    @Override // Ia.q
                                    public /* bridge */ /* synthetic */ p293xa.r invoke(U u10, InterfaceC1084f interfaceC1084f3, Integer num4) {
                                        invoke(u10, interfaceC1084f3, num4.intValue());
                                        return p293xa.r.f47939a;
                                    }

                                    public final void invoke(U TextButton, InterfaceC1084f interfaceC1084f3, int i20) {
                                        kotlin.jvm.internal.i.e(TextButton, "$this$TextButton");
                                        if ((i20 & 81) == 16 && interfaceC1084f3.s()) {
                                            interfaceC1084f3.w();
                                            return;
                                        }
                                        IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                                        F type04SemiBold = intercomTheme.getTypography(interfaceC1084f3, 6).getType04SemiBold();
                                        TextKt.b(str, null, intercomTheme.getColors(interfaceC1084f3, 6).m616getActionContrastWhite0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, type04SemiBold, interfaceC1084f3, 0, 0, 65530);
                                    }
                                }, interfaceC1084f2), interfaceC1084f2, 805306368, 510);
                            }
                        }, c1086gP), androidx.compose.runtime.internal.a.b(-565596411, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.5
                            @Override // Ia.p
                            public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num4) {
                                invoke(interfaceC1084f2, num4.intValue());
                                return p293xa.r.f47939a;
                            }

                            public final void invoke(InterfaceC1084f interfaceC1084f2, int i19) {
                                if ((i19 & 11) == 2 && interfaceC1084f2.s()) {
                                    interfaceC1084f2.w();
                                    return;
                                }
                                Integer num4 = num3;
                                if (num4 == null) {
                                    return;
                                }
                                IconKt.a(U.c.a(num4.intValue(), interfaceC1084f2, 0), "", null, IntercomTheme.INSTANCE.getColors(interfaceC1084f2, 6).m644getPrimaryIcon0d7_KjU(), interfaceC1084f2, 56, 4);
                            }
                        }, c1086gP), null, androidx.compose.runtime.internal.a.b(40178371, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.6
                            @Override // Ia.p
                            public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num4) {
                                invoke(interfaceC1084f2, num4.intValue());
                                return p293xa.r.f47939a;
                            }

                            public final void invoke(InterfaceC1084f interfaceC1084f2, int i19) {
                                if ((i19 & 11) == 2 && interfaceC1084f2.s()) {
                                    interfaceC1084f2.w();
                                    return;
                                }
                                IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                                F type04 = intercomTheme.getTypography(interfaceC1084f2, 6).getType04();
                                TextKt.b(message, null, intercomTheme.getColors(interfaceC1084f2, 6).m645getPrimaryText0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, type04, interfaceC1084f2, 0, 0, 65530);
                            }
                        }, c1086gP), null, IntercomTheme.INSTANCE.getColors(c1086gP, 6).m621getBackground0d7_KjU(), 0L, 0L, 0L, 0.0f, new androidx.compose.ui.window.f(5), c1086gP, ((i12 >> 15) & 14) | 1600560 | ((i12 << 6) & 896), 3072, 7840);
                        Ia.a<p293xa.r> aVar8 = nVar;
                        aVar6 = aVar5;
                        aVar7 = aVar8;
                    } else {
                        c1086gP.w();
                        hVar3 = hVar2;
                        num3 = num2;
                        aVar7 = aVar3;
                        aVar6 = aVar4;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.ui.component.u
                            @Override // Ia.p
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return PermissionDeniedDialogKt.PermissionDeniedDialog$lambda$2(hVar3, message, confirmText, dismissText, num3, aVar7, aVar6, i10, i11, (InterfaceC1084f) obj, iIntValue);
                            }
                        };
                    }
                }
                i12 |= 1572864;
                aVar4 = aVar2;
                if ((2995931 & i12) == 599186) {
                    if (i17 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (i18 != 0) {
                        num3 = null;
                    } else {
                        num3 = num2;
                    }
                    if (i13 != 0) {
                        nVar = new p050db.n(1);
                    } else {
                        nVar = aVar3;
                    }
                    if (i15 != 0) {
                        aVar5 = new Z0.a(3);
                    } else {
                        aVar5 = aVar4;
                    }
                    AndroidAlertDialog_androidKt.a(nVar, androidx.compose.runtime.internal.a.b(-1474258584, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.3
                        @Override // Ia.p
                        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num4) {
                            invoke(interfaceC1084f2, num4.intValue());
                            return p293xa.r.f47939a;
                        }

                        public final void invoke(InterfaceC1084f interfaceC1084f2, int i19) {
                            if ((i19 & 11) == 2 && interfaceC1084f2.s()) {
                                interfaceC1084f2.w();
                                return;
                            }
                            Ia.a<p293xa.r> aVar9 = aVar5;
                            final String str = confirmText;
                            ButtonKt.c(aVar9, null, false, null, null, null, null, null, null, androidx.compose.runtime.internal.a.b(2118877259, new Ia.q<U, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.3.1
                                @Override // Ia.q
                                public /* bridge */ /* synthetic */ p293xa.r invoke(U u10, InterfaceC1084f interfaceC1084f3, Integer num4) {
                                    invoke(u10, interfaceC1084f3, num4.intValue());
                                    return p293xa.r.f47939a;
                                }

                                public final void invoke(U TextButton, InterfaceC1084f interfaceC1084f3, int i20) {
                                    kotlin.jvm.internal.i.e(TextButton, "$this$TextButton");
                                    if ((i20 & 81) == 16 && interfaceC1084f3.s()) {
                                        interfaceC1084f3.w();
                                        return;
                                    }
                                    IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                                    F type04SemiBold = intercomTheme.getTypography(interfaceC1084f3, 6).getType04SemiBold();
                                    TextKt.b(str, null, intercomTheme.getColors(interfaceC1084f3, 6).m616getActionContrastWhite0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, type04SemiBold, interfaceC1084f3, 0, 0, 65530);
                                }
                            }, interfaceC1084f2), interfaceC1084f2, 805306368, 510);
                        }
                    }, c1086gP), hVar3, androidx.compose.runtime.internal.a.b(-868483802, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.4
                        @Override // Ia.p
                        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num4) {
                            invoke(interfaceC1084f2, num4.intValue());
                            return p293xa.r.f47939a;
                        }

                        public final void invoke(InterfaceC1084f interfaceC1084f2, int i19) {
                            if ((i19 & 11) == 2 && interfaceC1084f2.s()) {
                                interfaceC1084f2.w();
                                return;
                            }
                            Ia.a<p293xa.r> aVar9 = nVar;
                            final String str = dismissText;
                            ButtonKt.c(aVar9, null, false, null, null, null, null, null, null, androidx.compose.runtime.internal.a.b(-1570315255, new Ia.q<U, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.4.1
                                @Override // Ia.q
                                public /* bridge */ /* synthetic */ p293xa.r invoke(U u10, InterfaceC1084f interfaceC1084f3, Integer num4) {
                                    invoke(u10, interfaceC1084f3, num4.intValue());
                                    return p293xa.r.f47939a;
                                }

                                public final void invoke(U TextButton, InterfaceC1084f interfaceC1084f3, int i20) {
                                    kotlin.jvm.internal.i.e(TextButton, "$this$TextButton");
                                    if ((i20 & 81) == 16 && interfaceC1084f3.s()) {
                                        interfaceC1084f3.w();
                                        return;
                                    }
                                    IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                                    F type04SemiBold = intercomTheme.getTypography(interfaceC1084f3, 6).getType04SemiBold();
                                    TextKt.b(str, null, intercomTheme.getColors(interfaceC1084f3, 6).m616getActionContrastWhite0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, type04SemiBold, interfaceC1084f3, 0, 0, 65530);
                                }
                            }, interfaceC1084f2), interfaceC1084f2, 805306368, 510);
                        }
                    }, c1086gP), androidx.compose.runtime.internal.a.b(-565596411, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.5
                        @Override // Ia.p
                        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num4) {
                            invoke(interfaceC1084f2, num4.intValue());
                            return p293xa.r.f47939a;
                        }

                        public final void invoke(InterfaceC1084f interfaceC1084f2, int i19) {
                            if ((i19 & 11) == 2 && interfaceC1084f2.s()) {
                                interfaceC1084f2.w();
                                return;
                            }
                            Integer num4 = num3;
                            if (num4 == null) {
                                return;
                            }
                            IconKt.a(U.c.a(num4.intValue(), interfaceC1084f2, 0), "", null, IntercomTheme.INSTANCE.getColors(interfaceC1084f2, 6).m644getPrimaryIcon0d7_KjU(), interfaceC1084f2, 56, 4);
                        }
                    }, c1086gP), null, androidx.compose.runtime.internal.a.b(40178371, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.6
                        @Override // Ia.p
                        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num4) {
                            invoke(interfaceC1084f2, num4.intValue());
                            return p293xa.r.f47939a;
                        }

                        public final void invoke(InterfaceC1084f interfaceC1084f2, int i19) {
                            if ((i19 & 11) == 2 && interfaceC1084f2.s()) {
                                interfaceC1084f2.w();
                                return;
                            }
                            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                            F type04 = intercomTheme.getTypography(interfaceC1084f2, 6).getType04();
                            TextKt.b(message, null, intercomTheme.getColors(interfaceC1084f2, 6).m645getPrimaryText0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, type04, interfaceC1084f2, 0, 0, 65530);
                        }
                    }, c1086gP), null, IntercomTheme.INSTANCE.getColors(c1086gP, 6).m621getBackground0d7_KjU(), 0L, 0L, 0L, 0.0f, new androidx.compose.ui.window.f(5), c1086gP, ((i12 >> 15) & 14) | 1600560 | ((i12 << 6) & 896), 3072, 7840);
                    Ia.a<p293xa.r> aVar9 = nVar;
                    aVar6 = aVar5;
                    aVar7 = aVar9;
                } else {
                    if (i17 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (i18 != 0) {
                        num3 = null;
                    } else {
                        num3 = num2;
                    }
                    if (i13 != 0) {
                        nVar = new p050db.n(1);
                    } else {
                        nVar = aVar3;
                    }
                    if (i15 != 0) {
                        aVar5 = new Z0.a(3);
                    } else {
                        aVar5 = aVar4;
                    }
                    AndroidAlertDialog_androidKt.a(nVar, androidx.compose.runtime.internal.a.b(-1474258584, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.3
                        @Override // Ia.p
                        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num4) {
                            invoke(interfaceC1084f2, num4.intValue());
                            return p293xa.r.f47939a;
                        }

                        public final void invoke(InterfaceC1084f interfaceC1084f2, int i19) {
                            if ((i19 & 11) == 2 && interfaceC1084f2.s()) {
                                interfaceC1084f2.w();
                                return;
                            }
                            Ia.a<p293xa.r> aVar10 = aVar5;
                            final String str = confirmText;
                            ButtonKt.c(aVar10, null, false, null, null, null, null, null, null, androidx.compose.runtime.internal.a.b(2118877259, new Ia.q<U, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.3.1
                                @Override // Ia.q
                                public /* bridge */ /* synthetic */ p293xa.r invoke(U u10, InterfaceC1084f interfaceC1084f3, Integer num4) {
                                    invoke(u10, interfaceC1084f3, num4.intValue());
                                    return p293xa.r.f47939a;
                                }

                                public final void invoke(U TextButton, InterfaceC1084f interfaceC1084f3, int i20) {
                                    kotlin.jvm.internal.i.e(TextButton, "$this$TextButton");
                                    if ((i20 & 81) == 16 && interfaceC1084f3.s()) {
                                        interfaceC1084f3.w();
                                        return;
                                    }
                                    IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                                    F type04SemiBold = intercomTheme.getTypography(interfaceC1084f3, 6).getType04SemiBold();
                                    TextKt.b(str, null, intercomTheme.getColors(interfaceC1084f3, 6).m616getActionContrastWhite0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, type04SemiBold, interfaceC1084f3, 0, 0, 65530);
                                }
                            }, interfaceC1084f2), interfaceC1084f2, 805306368, 510);
                        }
                    }, c1086gP), hVar3, androidx.compose.runtime.internal.a.b(-868483802, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.4
                        @Override // Ia.p
                        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num4) {
                            invoke(interfaceC1084f2, num4.intValue());
                            return p293xa.r.f47939a;
                        }

                        public final void invoke(InterfaceC1084f interfaceC1084f2, int i19) {
                            if ((i19 & 11) == 2 && interfaceC1084f2.s()) {
                                interfaceC1084f2.w();
                                return;
                            }
                            Ia.a<p293xa.r> aVar10 = nVar;
                            final String str = dismissText;
                            ButtonKt.c(aVar10, null, false, null, null, null, null, null, null, androidx.compose.runtime.internal.a.b(-1570315255, new Ia.q<U, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.4.1
                                @Override // Ia.q
                                public /* bridge */ /* synthetic */ p293xa.r invoke(U u10, InterfaceC1084f interfaceC1084f3, Integer num4) {
                                    invoke(u10, interfaceC1084f3, num4.intValue());
                                    return p293xa.r.f47939a;
                                }

                                public final void invoke(U TextButton, InterfaceC1084f interfaceC1084f3, int i20) {
                                    kotlin.jvm.internal.i.e(TextButton, "$this$TextButton");
                                    if ((i20 & 81) == 16 && interfaceC1084f3.s()) {
                                        interfaceC1084f3.w();
                                        return;
                                    }
                                    IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                                    F type04SemiBold = intercomTheme.getTypography(interfaceC1084f3, 6).getType04SemiBold();
                                    TextKt.b(str, null, intercomTheme.getColors(interfaceC1084f3, 6).m616getActionContrastWhite0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, type04SemiBold, interfaceC1084f3, 0, 0, 65530);
                                }
                            }, interfaceC1084f2), interfaceC1084f2, 805306368, 510);
                        }
                    }, c1086gP), androidx.compose.runtime.internal.a.b(-565596411, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.5
                        @Override // Ia.p
                        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num4) {
                            invoke(interfaceC1084f2, num4.intValue());
                            return p293xa.r.f47939a;
                        }

                        public final void invoke(InterfaceC1084f interfaceC1084f2, int i19) {
                            if ((i19 & 11) == 2 && interfaceC1084f2.s()) {
                                interfaceC1084f2.w();
                                return;
                            }
                            Integer num4 = num3;
                            if (num4 == null) {
                                return;
                            }
                            IconKt.a(U.c.a(num4.intValue(), interfaceC1084f2, 0), "", null, IntercomTheme.INSTANCE.getColors(interfaceC1084f2, 6).m644getPrimaryIcon0d7_KjU(), interfaceC1084f2, 56, 4);
                        }
                    }, c1086gP), null, androidx.compose.runtime.internal.a.b(40178371, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.6
                        @Override // Ia.p
                        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num4) {
                            invoke(interfaceC1084f2, num4.intValue());
                            return p293xa.r.f47939a;
                        }

                        public final void invoke(InterfaceC1084f interfaceC1084f2, int i19) {
                            if ((i19 & 11) == 2 && interfaceC1084f2.s()) {
                                interfaceC1084f2.w();
                                return;
                            }
                            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                            F type04 = intercomTheme.getTypography(interfaceC1084f2, 6).getType04();
                            TextKt.b(message, null, intercomTheme.getColors(interfaceC1084f2, 6).m645getPrimaryText0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, type04, interfaceC1084f2, 0, 0, 65530);
                        }
                    }, c1086gP), null, IntercomTheme.INSTANCE.getColors(c1086gP, 6).m621getBackground0d7_KjU(), 0L, 0L, 0L, 0.0f, new androidx.compose.ui.window.f(5), c1086gP, ((i12 >> 15) & 14) | 1600560 | ((i12 << 6) & 896), 3072, 7840);
                    Ia.a<p293xa.r> aVar10 = nVar;
                    aVar6 = aVar5;
                    aVar7 = aVar10;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.ui.component.u
                        @Override // Ia.p
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return PermissionDeniedDialogKt.PermissionDeniedDialog$lambda$2(hVar3, message, confirmText, dismissText, num3, aVar7, aVar6, i10, i11, (InterfaceC1084f) obj, iIntValue);
                        }
                    };
                }
            }
            i12 |= 196608;
            aVar3 = aVar;
            i15 = i11 & 64;
            if (i15 != 0) {
                if ((3670016 & i10) == 0) {
                    aVar4 = aVar2;
                    if (c1086gP.k(aVar4)) {
                        i16 = 1048576;
                    } else {
                        i16 = 524288;
                    }
                    i12 |= i16;
                }
                if ((2995931 & i12) == 599186) {
                    if (i17 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (i18 != 0) {
                        num3 = null;
                    } else {
                        num3 = num2;
                    }
                    if (i13 != 0) {
                        nVar = new p050db.n(1);
                    } else {
                        nVar = aVar3;
                    }
                    if (i15 != 0) {
                        aVar5 = new Z0.a(3);
                    } else {
                        aVar5 = aVar4;
                    }
                    AndroidAlertDialog_androidKt.a(nVar, androidx.compose.runtime.internal.a.b(-1474258584, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.3
                        @Override // Ia.p
                        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num4) {
                            invoke(interfaceC1084f2, num4.intValue());
                            return p293xa.r.f47939a;
                        }

                        public final void invoke(InterfaceC1084f interfaceC1084f2, int i19) {
                            if ((i19 & 11) == 2 && interfaceC1084f2.s()) {
                                interfaceC1084f2.w();
                                return;
                            }
                            Ia.a<p293xa.r> aVar11 = aVar5;
                            final String str = confirmText;
                            ButtonKt.c(aVar11, null, false, null, null, null, null, null, null, androidx.compose.runtime.internal.a.b(2118877259, new Ia.q<U, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.3.1
                                @Override // Ia.q
                                public /* bridge */ /* synthetic */ p293xa.r invoke(U u10, InterfaceC1084f interfaceC1084f3, Integer num4) {
                                    invoke(u10, interfaceC1084f3, num4.intValue());
                                    return p293xa.r.f47939a;
                                }

                                public final void invoke(U TextButton, InterfaceC1084f interfaceC1084f3, int i20) {
                                    kotlin.jvm.internal.i.e(TextButton, "$this$TextButton");
                                    if ((i20 & 81) == 16 && interfaceC1084f3.s()) {
                                        interfaceC1084f3.w();
                                        return;
                                    }
                                    IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                                    F type04SemiBold = intercomTheme.getTypography(interfaceC1084f3, 6).getType04SemiBold();
                                    TextKt.b(str, null, intercomTheme.getColors(interfaceC1084f3, 6).m616getActionContrastWhite0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, type04SemiBold, interfaceC1084f3, 0, 0, 65530);
                                }
                            }, interfaceC1084f2), interfaceC1084f2, 805306368, 510);
                        }
                    }, c1086gP), hVar3, androidx.compose.runtime.internal.a.b(-868483802, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.4
                        @Override // Ia.p
                        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num4) {
                            invoke(interfaceC1084f2, num4.intValue());
                            return p293xa.r.f47939a;
                        }

                        public final void invoke(InterfaceC1084f interfaceC1084f2, int i19) {
                            if ((i19 & 11) == 2 && interfaceC1084f2.s()) {
                                interfaceC1084f2.w();
                                return;
                            }
                            Ia.a<p293xa.r> aVar11 = nVar;
                            final String str = dismissText;
                            ButtonKt.c(aVar11, null, false, null, null, null, null, null, null, androidx.compose.runtime.internal.a.b(-1570315255, new Ia.q<U, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.4.1
                                @Override // Ia.q
                                public /* bridge */ /* synthetic */ p293xa.r invoke(U u10, InterfaceC1084f interfaceC1084f3, Integer num4) {
                                    invoke(u10, interfaceC1084f3, num4.intValue());
                                    return p293xa.r.f47939a;
                                }

                                public final void invoke(U TextButton, InterfaceC1084f interfaceC1084f3, int i20) {
                                    kotlin.jvm.internal.i.e(TextButton, "$this$TextButton");
                                    if ((i20 & 81) == 16 && interfaceC1084f3.s()) {
                                        interfaceC1084f3.w();
                                        return;
                                    }
                                    IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                                    F type04SemiBold = intercomTheme.getTypography(interfaceC1084f3, 6).getType04SemiBold();
                                    TextKt.b(str, null, intercomTheme.getColors(interfaceC1084f3, 6).m616getActionContrastWhite0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, type04SemiBold, interfaceC1084f3, 0, 0, 65530);
                                }
                            }, interfaceC1084f2), interfaceC1084f2, 805306368, 510);
                        }
                    }, c1086gP), androidx.compose.runtime.internal.a.b(-565596411, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.5
                        @Override // Ia.p
                        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num4) {
                            invoke(interfaceC1084f2, num4.intValue());
                            return p293xa.r.f47939a;
                        }

                        public final void invoke(InterfaceC1084f interfaceC1084f2, int i19) {
                            if ((i19 & 11) == 2 && interfaceC1084f2.s()) {
                                interfaceC1084f2.w();
                                return;
                            }
                            Integer num4 = num3;
                            if (num4 == null) {
                                return;
                            }
                            IconKt.a(U.c.a(num4.intValue(), interfaceC1084f2, 0), "", null, IntercomTheme.INSTANCE.getColors(interfaceC1084f2, 6).m644getPrimaryIcon0d7_KjU(), interfaceC1084f2, 56, 4);
                        }
                    }, c1086gP), null, androidx.compose.runtime.internal.a.b(40178371, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.6
                        @Override // Ia.p
                        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num4) {
                            invoke(interfaceC1084f2, num4.intValue());
                            return p293xa.r.f47939a;
                        }

                        public final void invoke(InterfaceC1084f interfaceC1084f2, int i19) {
                            if ((i19 & 11) == 2 && interfaceC1084f2.s()) {
                                interfaceC1084f2.w();
                                return;
                            }
                            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                            F type04 = intercomTheme.getTypography(interfaceC1084f2, 6).getType04();
                            TextKt.b(message, null, intercomTheme.getColors(interfaceC1084f2, 6).m645getPrimaryText0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, type04, interfaceC1084f2, 0, 0, 65530);
                        }
                    }, c1086gP), null, IntercomTheme.INSTANCE.getColors(c1086gP, 6).m621getBackground0d7_KjU(), 0L, 0L, 0L, 0.0f, new androidx.compose.ui.window.f(5), c1086gP, ((i12 >> 15) & 14) | 1600560 | ((i12 << 6) & 896), 3072, 7840);
                    Ia.a<p293xa.r> aVar11 = nVar;
                    aVar6 = aVar5;
                    aVar7 = aVar11;
                } else {
                    if (i17 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (i18 != 0) {
                        num3 = null;
                    } else {
                        num3 = num2;
                    }
                    if (i13 != 0) {
                        nVar = new p050db.n(1);
                    } else {
                        nVar = aVar3;
                    }
                    if (i15 != 0) {
                        aVar5 = new Z0.a(3);
                    } else {
                        aVar5 = aVar4;
                    }
                    AndroidAlertDialog_androidKt.a(nVar, androidx.compose.runtime.internal.a.b(-1474258584, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.3
                        @Override // Ia.p
                        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num4) {
                            invoke(interfaceC1084f2, num4.intValue());
                            return p293xa.r.f47939a;
                        }

                        public final void invoke(InterfaceC1084f interfaceC1084f2, int i19) {
                            if ((i19 & 11) == 2 && interfaceC1084f2.s()) {
                                interfaceC1084f2.w();
                                return;
                            }
                            Ia.a<p293xa.r> aVar12 = aVar5;
                            final String str = confirmText;
                            ButtonKt.c(aVar12, null, false, null, null, null, null, null, null, androidx.compose.runtime.internal.a.b(2118877259, new Ia.q<U, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.3.1
                                @Override // Ia.q
                                public /* bridge */ /* synthetic */ p293xa.r invoke(U u10, InterfaceC1084f interfaceC1084f3, Integer num4) {
                                    invoke(u10, interfaceC1084f3, num4.intValue());
                                    return p293xa.r.f47939a;
                                }

                                public final void invoke(U TextButton, InterfaceC1084f interfaceC1084f3, int i20) {
                                    kotlin.jvm.internal.i.e(TextButton, "$this$TextButton");
                                    if ((i20 & 81) == 16 && interfaceC1084f3.s()) {
                                        interfaceC1084f3.w();
                                        return;
                                    }
                                    IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                                    F type04SemiBold = intercomTheme.getTypography(interfaceC1084f3, 6).getType04SemiBold();
                                    TextKt.b(str, null, intercomTheme.getColors(interfaceC1084f3, 6).m616getActionContrastWhite0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, type04SemiBold, interfaceC1084f3, 0, 0, 65530);
                                }
                            }, interfaceC1084f2), interfaceC1084f2, 805306368, 510);
                        }
                    }, c1086gP), hVar3, androidx.compose.runtime.internal.a.b(-868483802, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.4
                        @Override // Ia.p
                        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num4) {
                            invoke(interfaceC1084f2, num4.intValue());
                            return p293xa.r.f47939a;
                        }

                        public final void invoke(InterfaceC1084f interfaceC1084f2, int i19) {
                            if ((i19 & 11) == 2 && interfaceC1084f2.s()) {
                                interfaceC1084f2.w();
                                return;
                            }
                            Ia.a<p293xa.r> aVar12 = nVar;
                            final String str = dismissText;
                            ButtonKt.c(aVar12, null, false, null, null, null, null, null, null, androidx.compose.runtime.internal.a.b(-1570315255, new Ia.q<U, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.4.1
                                @Override // Ia.q
                                public /* bridge */ /* synthetic */ p293xa.r invoke(U u10, InterfaceC1084f interfaceC1084f3, Integer num4) {
                                    invoke(u10, interfaceC1084f3, num4.intValue());
                                    return p293xa.r.f47939a;
                                }

                                public final void invoke(U TextButton, InterfaceC1084f interfaceC1084f3, int i20) {
                                    kotlin.jvm.internal.i.e(TextButton, "$this$TextButton");
                                    if ((i20 & 81) == 16 && interfaceC1084f3.s()) {
                                        interfaceC1084f3.w();
                                        return;
                                    }
                                    IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                                    F type04SemiBold = intercomTheme.getTypography(interfaceC1084f3, 6).getType04SemiBold();
                                    TextKt.b(str, null, intercomTheme.getColors(interfaceC1084f3, 6).m616getActionContrastWhite0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, type04SemiBold, interfaceC1084f3, 0, 0, 65530);
                                }
                            }, interfaceC1084f2), interfaceC1084f2, 805306368, 510);
                        }
                    }, c1086gP), androidx.compose.runtime.internal.a.b(-565596411, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.5
                        @Override // Ia.p
                        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num4) {
                            invoke(interfaceC1084f2, num4.intValue());
                            return p293xa.r.f47939a;
                        }

                        public final void invoke(InterfaceC1084f interfaceC1084f2, int i19) {
                            if ((i19 & 11) == 2 && interfaceC1084f2.s()) {
                                interfaceC1084f2.w();
                                return;
                            }
                            Integer num4 = num3;
                            if (num4 == null) {
                                return;
                            }
                            IconKt.a(U.c.a(num4.intValue(), interfaceC1084f2, 0), "", null, IntercomTheme.INSTANCE.getColors(interfaceC1084f2, 6).m644getPrimaryIcon0d7_KjU(), interfaceC1084f2, 56, 4);
                        }
                    }, c1086gP), null, androidx.compose.runtime.internal.a.b(40178371, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.6
                        @Override // Ia.p
                        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num4) {
                            invoke(interfaceC1084f2, num4.intValue());
                            return p293xa.r.f47939a;
                        }

                        public final void invoke(InterfaceC1084f interfaceC1084f2, int i19) {
                            if ((i19 & 11) == 2 && interfaceC1084f2.s()) {
                                interfaceC1084f2.w();
                                return;
                            }
                            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                            F type04 = intercomTheme.getTypography(interfaceC1084f2, 6).getType04();
                            TextKt.b(message, null, intercomTheme.getColors(interfaceC1084f2, 6).m645getPrimaryText0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, type04, interfaceC1084f2, 0, 0, 65530);
                        }
                    }, c1086gP), null, IntercomTheme.INSTANCE.getColors(c1086gP, 6).m621getBackground0d7_KjU(), 0L, 0L, 0L, 0.0f, new androidx.compose.ui.window.f(5), c1086gP, ((i12 >> 15) & 14) | 1600560 | ((i12 << 6) & 896), 3072, 7840);
                    Ia.a<p293xa.r> aVar12 = nVar;
                    aVar6 = aVar5;
                    aVar7 = aVar12;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.ui.component.u
                        @Override // Ia.p
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return PermissionDeniedDialogKt.PermissionDeniedDialog$lambda$2(hVar3, message, confirmText, dismissText, num3, aVar7, aVar6, i10, i11, (InterfaceC1084f) obj, iIntValue);
                        }
                    };
                }
            }
            i12 |= 1572864;
            aVar4 = aVar2;
            if ((2995931 & i12) == 599186) {
                if (i17 != 0) {
                    hVar3 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar3 = hVar2;
                }
                if (i18 != 0) {
                    num3 = null;
                } else {
                    num3 = num2;
                }
                if (i13 != 0) {
                    nVar = new p050db.n(1);
                } else {
                    nVar = aVar3;
                }
                if (i15 != 0) {
                    aVar5 = new Z0.a(3);
                } else {
                    aVar5 = aVar4;
                }
                AndroidAlertDialog_androidKt.a(nVar, androidx.compose.runtime.internal.a.b(-1474258584, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.3
                    @Override // Ia.p
                    public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num4) {
                        invoke(interfaceC1084f2, num4.intValue());
                        return p293xa.r.f47939a;
                    }

                    public final void invoke(InterfaceC1084f interfaceC1084f2, int i19) {
                        if ((i19 & 11) == 2 && interfaceC1084f2.s()) {
                            interfaceC1084f2.w();
                            return;
                        }
                        Ia.a<p293xa.r> aVar13 = aVar5;
                        final String str = confirmText;
                        ButtonKt.c(aVar13, null, false, null, null, null, null, null, null, androidx.compose.runtime.internal.a.b(2118877259, new Ia.q<U, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.3.1
                            @Override // Ia.q
                            public /* bridge */ /* synthetic */ p293xa.r invoke(U u10, InterfaceC1084f interfaceC1084f3, Integer num4) {
                                invoke(u10, interfaceC1084f3, num4.intValue());
                                return p293xa.r.f47939a;
                            }

                            public final void invoke(U TextButton, InterfaceC1084f interfaceC1084f3, int i20) {
                                kotlin.jvm.internal.i.e(TextButton, "$this$TextButton");
                                if ((i20 & 81) == 16 && interfaceC1084f3.s()) {
                                    interfaceC1084f3.w();
                                    return;
                                }
                                IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                                F type04SemiBold = intercomTheme.getTypography(interfaceC1084f3, 6).getType04SemiBold();
                                TextKt.b(str, null, intercomTheme.getColors(interfaceC1084f3, 6).m616getActionContrastWhite0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, type04SemiBold, interfaceC1084f3, 0, 0, 65530);
                            }
                        }, interfaceC1084f2), interfaceC1084f2, 805306368, 510);
                    }
                }, c1086gP), hVar3, androidx.compose.runtime.internal.a.b(-868483802, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.4
                    @Override // Ia.p
                    public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num4) {
                        invoke(interfaceC1084f2, num4.intValue());
                        return p293xa.r.f47939a;
                    }

                    public final void invoke(InterfaceC1084f interfaceC1084f2, int i19) {
                        if ((i19 & 11) == 2 && interfaceC1084f2.s()) {
                            interfaceC1084f2.w();
                            return;
                        }
                        Ia.a<p293xa.r> aVar13 = nVar;
                        final String str = dismissText;
                        ButtonKt.c(aVar13, null, false, null, null, null, null, null, null, androidx.compose.runtime.internal.a.b(-1570315255, new Ia.q<U, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.4.1
                            @Override // Ia.q
                            public /* bridge */ /* synthetic */ p293xa.r invoke(U u10, InterfaceC1084f interfaceC1084f3, Integer num4) {
                                invoke(u10, interfaceC1084f3, num4.intValue());
                                return p293xa.r.f47939a;
                            }

                            public final void invoke(U TextButton, InterfaceC1084f interfaceC1084f3, int i20) {
                                kotlin.jvm.internal.i.e(TextButton, "$this$TextButton");
                                if ((i20 & 81) == 16 && interfaceC1084f3.s()) {
                                    interfaceC1084f3.w();
                                    return;
                                }
                                IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                                F type04SemiBold = intercomTheme.getTypography(interfaceC1084f3, 6).getType04SemiBold();
                                TextKt.b(str, null, intercomTheme.getColors(interfaceC1084f3, 6).m616getActionContrastWhite0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, type04SemiBold, interfaceC1084f3, 0, 0, 65530);
                            }
                        }, interfaceC1084f2), interfaceC1084f2, 805306368, 510);
                    }
                }, c1086gP), androidx.compose.runtime.internal.a.b(-565596411, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.5
                    @Override // Ia.p
                    public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num4) {
                        invoke(interfaceC1084f2, num4.intValue());
                        return p293xa.r.f47939a;
                    }

                    public final void invoke(InterfaceC1084f interfaceC1084f2, int i19) {
                        if ((i19 & 11) == 2 && interfaceC1084f2.s()) {
                            interfaceC1084f2.w();
                            return;
                        }
                        Integer num4 = num3;
                        if (num4 == null) {
                            return;
                        }
                        IconKt.a(U.c.a(num4.intValue(), interfaceC1084f2, 0), "", null, IntercomTheme.INSTANCE.getColors(interfaceC1084f2, 6).m644getPrimaryIcon0d7_KjU(), interfaceC1084f2, 56, 4);
                    }
                }, c1086gP), null, androidx.compose.runtime.internal.a.b(40178371, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.6
                    @Override // Ia.p
                    public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num4) {
                        invoke(interfaceC1084f2, num4.intValue());
                        return p293xa.r.f47939a;
                    }

                    public final void invoke(InterfaceC1084f interfaceC1084f2, int i19) {
                        if ((i19 & 11) == 2 && interfaceC1084f2.s()) {
                            interfaceC1084f2.w();
                            return;
                        }
                        IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                        F type04 = intercomTheme.getTypography(interfaceC1084f2, 6).getType04();
                        TextKt.b(message, null, intercomTheme.getColors(interfaceC1084f2, 6).m645getPrimaryText0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, type04, interfaceC1084f2, 0, 0, 65530);
                    }
                }, c1086gP), null, IntercomTheme.INSTANCE.getColors(c1086gP, 6).m621getBackground0d7_KjU(), 0L, 0L, 0L, 0.0f, new androidx.compose.ui.window.f(5), c1086gP, ((i12 >> 15) & 14) | 1600560 | ((i12 << 6) & 896), 3072, 7840);
                Ia.a<p293xa.r> aVar13 = nVar;
                aVar6 = aVar5;
                aVar7 = aVar13;
            } else {
                if (i17 != 0) {
                    hVar3 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar3 = hVar2;
                }
                if (i18 != 0) {
                    num3 = null;
                } else {
                    num3 = num2;
                }
                if (i13 != 0) {
                    nVar = new p050db.n(1);
                } else {
                    nVar = aVar3;
                }
                if (i15 != 0) {
                    aVar5 = new Z0.a(3);
                } else {
                    aVar5 = aVar4;
                }
                AndroidAlertDialog_androidKt.a(nVar, androidx.compose.runtime.internal.a.b(-1474258584, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.3
                    @Override // Ia.p
                    public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num4) {
                        invoke(interfaceC1084f2, num4.intValue());
                        return p293xa.r.f47939a;
                    }

                    public final void invoke(InterfaceC1084f interfaceC1084f2, int i19) {
                        if ((i19 & 11) == 2 && interfaceC1084f2.s()) {
                            interfaceC1084f2.w();
                            return;
                        }
                        Ia.a<p293xa.r> aVar14 = aVar5;
                        final String str = confirmText;
                        ButtonKt.c(aVar14, null, false, null, null, null, null, null, null, androidx.compose.runtime.internal.a.b(2118877259, new Ia.q<U, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.3.1
                            @Override // Ia.q
                            public /* bridge */ /* synthetic */ p293xa.r invoke(U u10, InterfaceC1084f interfaceC1084f3, Integer num4) {
                                invoke(u10, interfaceC1084f3, num4.intValue());
                                return p293xa.r.f47939a;
                            }

                            public final void invoke(U TextButton, InterfaceC1084f interfaceC1084f3, int i20) {
                                kotlin.jvm.internal.i.e(TextButton, "$this$TextButton");
                                if ((i20 & 81) == 16 && interfaceC1084f3.s()) {
                                    interfaceC1084f3.w();
                                    return;
                                }
                                IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                                F type04SemiBold = intercomTheme.getTypography(interfaceC1084f3, 6).getType04SemiBold();
                                TextKt.b(str, null, intercomTheme.getColors(interfaceC1084f3, 6).m616getActionContrastWhite0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, type04SemiBold, interfaceC1084f3, 0, 0, 65530);
                            }
                        }, interfaceC1084f2), interfaceC1084f2, 805306368, 510);
                    }
                }, c1086gP), hVar3, androidx.compose.runtime.internal.a.b(-868483802, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.4
                    @Override // Ia.p
                    public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num4) {
                        invoke(interfaceC1084f2, num4.intValue());
                        return p293xa.r.f47939a;
                    }

                    public final void invoke(InterfaceC1084f interfaceC1084f2, int i19) {
                        if ((i19 & 11) == 2 && interfaceC1084f2.s()) {
                            interfaceC1084f2.w();
                            return;
                        }
                        Ia.a<p293xa.r> aVar14 = nVar;
                        final String str = dismissText;
                        ButtonKt.c(aVar14, null, false, null, null, null, null, null, null, androidx.compose.runtime.internal.a.b(-1570315255, new Ia.q<U, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.4.1
                            @Override // Ia.q
                            public /* bridge */ /* synthetic */ p293xa.r invoke(U u10, InterfaceC1084f interfaceC1084f3, Integer num4) {
                                invoke(u10, interfaceC1084f3, num4.intValue());
                                return p293xa.r.f47939a;
                            }

                            public final void invoke(U TextButton, InterfaceC1084f interfaceC1084f3, int i20) {
                                kotlin.jvm.internal.i.e(TextButton, "$this$TextButton");
                                if ((i20 & 81) == 16 && interfaceC1084f3.s()) {
                                    interfaceC1084f3.w();
                                    return;
                                }
                                IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                                F type04SemiBold = intercomTheme.getTypography(interfaceC1084f3, 6).getType04SemiBold();
                                TextKt.b(str, null, intercomTheme.getColors(interfaceC1084f3, 6).m616getActionContrastWhite0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, type04SemiBold, interfaceC1084f3, 0, 0, 65530);
                            }
                        }, interfaceC1084f2), interfaceC1084f2, 805306368, 510);
                    }
                }, c1086gP), androidx.compose.runtime.internal.a.b(-565596411, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.5
                    @Override // Ia.p
                    public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num4) {
                        invoke(interfaceC1084f2, num4.intValue());
                        return p293xa.r.f47939a;
                    }

                    public final void invoke(InterfaceC1084f interfaceC1084f2, int i19) {
                        if ((i19 & 11) == 2 && interfaceC1084f2.s()) {
                            interfaceC1084f2.w();
                            return;
                        }
                        Integer num4 = num3;
                        if (num4 == null) {
                            return;
                        }
                        IconKt.a(U.c.a(num4.intValue(), interfaceC1084f2, 0), "", null, IntercomTheme.INSTANCE.getColors(interfaceC1084f2, 6).m644getPrimaryIcon0d7_KjU(), interfaceC1084f2, 56, 4);
                    }
                }, c1086gP), null, androidx.compose.runtime.internal.a.b(40178371, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.6
                    @Override // Ia.p
                    public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num4) {
                        invoke(interfaceC1084f2, num4.intValue());
                        return p293xa.r.f47939a;
                    }

                    public final void invoke(InterfaceC1084f interfaceC1084f2, int i19) {
                        if ((i19 & 11) == 2 && interfaceC1084f2.s()) {
                            interfaceC1084f2.w();
                            return;
                        }
                        IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                        F type04 = intercomTheme.getTypography(interfaceC1084f2, 6).getType04();
                        TextKt.b(message, null, intercomTheme.getColors(interfaceC1084f2, 6).m645getPrimaryText0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, type04, interfaceC1084f2, 0, 0, 65530);
                    }
                }, c1086gP), null, IntercomTheme.INSTANCE.getColors(c1086gP, 6).m621getBackground0d7_KjU(), 0L, 0L, 0L, 0.0f, new androidx.compose.ui.window.f(5), c1086gP, ((i12 >> 15) & 14) | 1600560 | ((i12 << 6) & 896), 3072, 7840);
                Ia.a<p293xa.r> aVar14 = nVar;
                aVar6 = aVar5;
                aVar7 = aVar14;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.ui.component.u
                    @Override // Ia.p
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return PermissionDeniedDialogKt.PermissionDeniedDialog$lambda$2(hVar3, message, confirmText, dismissText, num3, aVar7, aVar6, i10, i11, (InterfaceC1084f) obj, iIntValue);
                    }
                };
            }
        }
        i12 |= 24576;
        num2 = num;
        i13 = i11 & 32;
        if (i13 != 0) {
            if ((458752 & i10) == 0) {
                aVar3 = aVar;
                if (c1086gP.k(aVar3)) {
                    i14 = 131072;
                } else {
                    i14 = 65536;
                }
                i12 |= i14;
            }
            i15 = i11 & 64;
            if (i15 != 0) {
                if ((3670016 & i10) == 0) {
                    aVar4 = aVar2;
                    if (c1086gP.k(aVar4)) {
                        i16 = 1048576;
                    } else {
                        i16 = 524288;
                    }
                    i12 |= i16;
                }
                if ((2995931 & i12) == 599186) {
                    if (i17 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (i18 != 0) {
                        num3 = null;
                    } else {
                        num3 = num2;
                    }
                    if (i13 != 0) {
                        nVar = new p050db.n(1);
                    } else {
                        nVar = aVar3;
                    }
                    if (i15 != 0) {
                        aVar5 = new Z0.a(3);
                    } else {
                        aVar5 = aVar4;
                    }
                    AndroidAlertDialog_androidKt.a(nVar, androidx.compose.runtime.internal.a.b(-1474258584, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.3
                        @Override // Ia.p
                        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num4) {
                            invoke(interfaceC1084f2, num4.intValue());
                            return p293xa.r.f47939a;
                        }

                        public final void invoke(InterfaceC1084f interfaceC1084f2, int i19) {
                            if ((i19 & 11) == 2 && interfaceC1084f2.s()) {
                                interfaceC1084f2.w();
                                return;
                            }
                            Ia.a<p293xa.r> aVar15 = aVar5;
                            final String str = confirmText;
                            ButtonKt.c(aVar15, null, false, null, null, null, null, null, null, androidx.compose.runtime.internal.a.b(2118877259, new Ia.q<U, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.3.1
                                @Override // Ia.q
                                public /* bridge */ /* synthetic */ p293xa.r invoke(U u10, InterfaceC1084f interfaceC1084f3, Integer num4) {
                                    invoke(u10, interfaceC1084f3, num4.intValue());
                                    return p293xa.r.f47939a;
                                }

                                public final void invoke(U TextButton, InterfaceC1084f interfaceC1084f3, int i20) {
                                    kotlin.jvm.internal.i.e(TextButton, "$this$TextButton");
                                    if ((i20 & 81) == 16 && interfaceC1084f3.s()) {
                                        interfaceC1084f3.w();
                                        return;
                                    }
                                    IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                                    F type04SemiBold = intercomTheme.getTypography(interfaceC1084f3, 6).getType04SemiBold();
                                    TextKt.b(str, null, intercomTheme.getColors(interfaceC1084f3, 6).m616getActionContrastWhite0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, type04SemiBold, interfaceC1084f3, 0, 0, 65530);
                                }
                            }, interfaceC1084f2), interfaceC1084f2, 805306368, 510);
                        }
                    }, c1086gP), hVar3, androidx.compose.runtime.internal.a.b(-868483802, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.4
                        @Override // Ia.p
                        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num4) {
                            invoke(interfaceC1084f2, num4.intValue());
                            return p293xa.r.f47939a;
                        }

                        public final void invoke(InterfaceC1084f interfaceC1084f2, int i19) {
                            if ((i19 & 11) == 2 && interfaceC1084f2.s()) {
                                interfaceC1084f2.w();
                                return;
                            }
                            Ia.a<p293xa.r> aVar15 = nVar;
                            final String str = dismissText;
                            ButtonKt.c(aVar15, null, false, null, null, null, null, null, null, androidx.compose.runtime.internal.a.b(-1570315255, new Ia.q<U, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.4.1
                                @Override // Ia.q
                                public /* bridge */ /* synthetic */ p293xa.r invoke(U u10, InterfaceC1084f interfaceC1084f3, Integer num4) {
                                    invoke(u10, interfaceC1084f3, num4.intValue());
                                    return p293xa.r.f47939a;
                                }

                                public final void invoke(U TextButton, InterfaceC1084f interfaceC1084f3, int i20) {
                                    kotlin.jvm.internal.i.e(TextButton, "$this$TextButton");
                                    if ((i20 & 81) == 16 && interfaceC1084f3.s()) {
                                        interfaceC1084f3.w();
                                        return;
                                    }
                                    IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                                    F type04SemiBold = intercomTheme.getTypography(interfaceC1084f3, 6).getType04SemiBold();
                                    TextKt.b(str, null, intercomTheme.getColors(interfaceC1084f3, 6).m616getActionContrastWhite0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, type04SemiBold, interfaceC1084f3, 0, 0, 65530);
                                }
                            }, interfaceC1084f2), interfaceC1084f2, 805306368, 510);
                        }
                    }, c1086gP), androidx.compose.runtime.internal.a.b(-565596411, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.5
                        @Override // Ia.p
                        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num4) {
                            invoke(interfaceC1084f2, num4.intValue());
                            return p293xa.r.f47939a;
                        }

                        public final void invoke(InterfaceC1084f interfaceC1084f2, int i19) {
                            if ((i19 & 11) == 2 && interfaceC1084f2.s()) {
                                interfaceC1084f2.w();
                                return;
                            }
                            Integer num4 = num3;
                            if (num4 == null) {
                                return;
                            }
                            IconKt.a(U.c.a(num4.intValue(), interfaceC1084f2, 0), "", null, IntercomTheme.INSTANCE.getColors(interfaceC1084f2, 6).m644getPrimaryIcon0d7_KjU(), interfaceC1084f2, 56, 4);
                        }
                    }, c1086gP), null, androidx.compose.runtime.internal.a.b(40178371, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.6
                        @Override // Ia.p
                        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num4) {
                            invoke(interfaceC1084f2, num4.intValue());
                            return p293xa.r.f47939a;
                        }

                        public final void invoke(InterfaceC1084f interfaceC1084f2, int i19) {
                            if ((i19 & 11) == 2 && interfaceC1084f2.s()) {
                                interfaceC1084f2.w();
                                return;
                            }
                            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                            F type04 = intercomTheme.getTypography(interfaceC1084f2, 6).getType04();
                            TextKt.b(message, null, intercomTheme.getColors(interfaceC1084f2, 6).m645getPrimaryText0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, type04, interfaceC1084f2, 0, 0, 65530);
                        }
                    }, c1086gP), null, IntercomTheme.INSTANCE.getColors(c1086gP, 6).m621getBackground0d7_KjU(), 0L, 0L, 0L, 0.0f, new androidx.compose.ui.window.f(5), c1086gP, ((i12 >> 15) & 14) | 1600560 | ((i12 << 6) & 896), 3072, 7840);
                    Ia.a<p293xa.r> aVar15 = nVar;
                    aVar6 = aVar5;
                    aVar7 = aVar15;
                } else {
                    if (i17 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (i18 != 0) {
                        num3 = null;
                    } else {
                        num3 = num2;
                    }
                    if (i13 != 0) {
                        nVar = new p050db.n(1);
                    } else {
                        nVar = aVar3;
                    }
                    if (i15 != 0) {
                        aVar5 = new Z0.a(3);
                    } else {
                        aVar5 = aVar4;
                    }
                    AndroidAlertDialog_androidKt.a(nVar, androidx.compose.runtime.internal.a.b(-1474258584, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.3
                        @Override // Ia.p
                        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num4) {
                            invoke(interfaceC1084f2, num4.intValue());
                            return p293xa.r.f47939a;
                        }

                        public final void invoke(InterfaceC1084f interfaceC1084f2, int i19) {
                            if ((i19 & 11) == 2 && interfaceC1084f2.s()) {
                                interfaceC1084f2.w();
                                return;
                            }
                            Ia.a<p293xa.r> aVar16 = aVar5;
                            final String str = confirmText;
                            ButtonKt.c(aVar16, null, false, null, null, null, null, null, null, androidx.compose.runtime.internal.a.b(2118877259, new Ia.q<U, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.3.1
                                @Override // Ia.q
                                public /* bridge */ /* synthetic */ p293xa.r invoke(U u10, InterfaceC1084f interfaceC1084f3, Integer num4) {
                                    invoke(u10, interfaceC1084f3, num4.intValue());
                                    return p293xa.r.f47939a;
                                }

                                public final void invoke(U TextButton, InterfaceC1084f interfaceC1084f3, int i20) {
                                    kotlin.jvm.internal.i.e(TextButton, "$this$TextButton");
                                    if ((i20 & 81) == 16 && interfaceC1084f3.s()) {
                                        interfaceC1084f3.w();
                                        return;
                                    }
                                    IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                                    F type04SemiBold = intercomTheme.getTypography(interfaceC1084f3, 6).getType04SemiBold();
                                    TextKt.b(str, null, intercomTheme.getColors(interfaceC1084f3, 6).m616getActionContrastWhite0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, type04SemiBold, interfaceC1084f3, 0, 0, 65530);
                                }
                            }, interfaceC1084f2), interfaceC1084f2, 805306368, 510);
                        }
                    }, c1086gP), hVar3, androidx.compose.runtime.internal.a.b(-868483802, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.4
                        @Override // Ia.p
                        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num4) {
                            invoke(interfaceC1084f2, num4.intValue());
                            return p293xa.r.f47939a;
                        }

                        public final void invoke(InterfaceC1084f interfaceC1084f2, int i19) {
                            if ((i19 & 11) == 2 && interfaceC1084f2.s()) {
                                interfaceC1084f2.w();
                                return;
                            }
                            Ia.a<p293xa.r> aVar16 = nVar;
                            final String str = dismissText;
                            ButtonKt.c(aVar16, null, false, null, null, null, null, null, null, androidx.compose.runtime.internal.a.b(-1570315255, new Ia.q<U, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.4.1
                                @Override // Ia.q
                                public /* bridge */ /* synthetic */ p293xa.r invoke(U u10, InterfaceC1084f interfaceC1084f3, Integer num4) {
                                    invoke(u10, interfaceC1084f3, num4.intValue());
                                    return p293xa.r.f47939a;
                                }

                                public final void invoke(U TextButton, InterfaceC1084f interfaceC1084f3, int i20) {
                                    kotlin.jvm.internal.i.e(TextButton, "$this$TextButton");
                                    if ((i20 & 81) == 16 && interfaceC1084f3.s()) {
                                        interfaceC1084f3.w();
                                        return;
                                    }
                                    IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                                    F type04SemiBold = intercomTheme.getTypography(interfaceC1084f3, 6).getType04SemiBold();
                                    TextKt.b(str, null, intercomTheme.getColors(interfaceC1084f3, 6).m616getActionContrastWhite0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, type04SemiBold, interfaceC1084f3, 0, 0, 65530);
                                }
                            }, interfaceC1084f2), interfaceC1084f2, 805306368, 510);
                        }
                    }, c1086gP), androidx.compose.runtime.internal.a.b(-565596411, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.5
                        @Override // Ia.p
                        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num4) {
                            invoke(interfaceC1084f2, num4.intValue());
                            return p293xa.r.f47939a;
                        }

                        public final void invoke(InterfaceC1084f interfaceC1084f2, int i19) {
                            if ((i19 & 11) == 2 && interfaceC1084f2.s()) {
                                interfaceC1084f2.w();
                                return;
                            }
                            Integer num4 = num3;
                            if (num4 == null) {
                                return;
                            }
                            IconKt.a(U.c.a(num4.intValue(), interfaceC1084f2, 0), "", null, IntercomTheme.INSTANCE.getColors(interfaceC1084f2, 6).m644getPrimaryIcon0d7_KjU(), interfaceC1084f2, 56, 4);
                        }
                    }, c1086gP), null, androidx.compose.runtime.internal.a.b(40178371, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.6
                        @Override // Ia.p
                        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num4) {
                            invoke(interfaceC1084f2, num4.intValue());
                            return p293xa.r.f47939a;
                        }

                        public final void invoke(InterfaceC1084f interfaceC1084f2, int i19) {
                            if ((i19 & 11) == 2 && interfaceC1084f2.s()) {
                                interfaceC1084f2.w();
                                return;
                            }
                            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                            F type04 = intercomTheme.getTypography(interfaceC1084f2, 6).getType04();
                            TextKt.b(message, null, intercomTheme.getColors(interfaceC1084f2, 6).m645getPrimaryText0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, type04, interfaceC1084f2, 0, 0, 65530);
                        }
                    }, c1086gP), null, IntercomTheme.INSTANCE.getColors(c1086gP, 6).m621getBackground0d7_KjU(), 0L, 0L, 0L, 0.0f, new androidx.compose.ui.window.f(5), c1086gP, ((i12 >> 15) & 14) | 1600560 | ((i12 << 6) & 896), 3072, 7840);
                    Ia.a<p293xa.r> aVar16 = nVar;
                    aVar6 = aVar5;
                    aVar7 = aVar16;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.ui.component.u
                        @Override // Ia.p
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return PermissionDeniedDialogKt.PermissionDeniedDialog$lambda$2(hVar3, message, confirmText, dismissText, num3, aVar7, aVar6, i10, i11, (InterfaceC1084f) obj, iIntValue);
                        }
                    };
                }
            }
            i12 |= 1572864;
            aVar4 = aVar2;
            if ((2995931 & i12) == 599186) {
                if (i17 != 0) {
                    hVar3 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar3 = hVar2;
                }
                if (i18 != 0) {
                    num3 = null;
                } else {
                    num3 = num2;
                }
                if (i13 != 0) {
                    nVar = new p050db.n(1);
                } else {
                    nVar = aVar3;
                }
                if (i15 != 0) {
                    aVar5 = new Z0.a(3);
                } else {
                    aVar5 = aVar4;
                }
                AndroidAlertDialog_androidKt.a(nVar, androidx.compose.runtime.internal.a.b(-1474258584, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.3
                    @Override // Ia.p
                    public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num4) {
                        invoke(interfaceC1084f2, num4.intValue());
                        return p293xa.r.f47939a;
                    }

                    public final void invoke(InterfaceC1084f interfaceC1084f2, int i19) {
                        if ((i19 & 11) == 2 && interfaceC1084f2.s()) {
                            interfaceC1084f2.w();
                            return;
                        }
                        Ia.a<p293xa.r> aVar17 = aVar5;
                        final String str = confirmText;
                        ButtonKt.c(aVar17, null, false, null, null, null, null, null, null, androidx.compose.runtime.internal.a.b(2118877259, new Ia.q<U, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.3.1
                            @Override // Ia.q
                            public /* bridge */ /* synthetic */ p293xa.r invoke(U u10, InterfaceC1084f interfaceC1084f3, Integer num4) {
                                invoke(u10, interfaceC1084f3, num4.intValue());
                                return p293xa.r.f47939a;
                            }

                            public final void invoke(U TextButton, InterfaceC1084f interfaceC1084f3, int i20) {
                                kotlin.jvm.internal.i.e(TextButton, "$this$TextButton");
                                if ((i20 & 81) == 16 && interfaceC1084f3.s()) {
                                    interfaceC1084f3.w();
                                    return;
                                }
                                IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                                F type04SemiBold = intercomTheme.getTypography(interfaceC1084f3, 6).getType04SemiBold();
                                TextKt.b(str, null, intercomTheme.getColors(interfaceC1084f3, 6).m616getActionContrastWhite0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, type04SemiBold, interfaceC1084f3, 0, 0, 65530);
                            }
                        }, interfaceC1084f2), interfaceC1084f2, 805306368, 510);
                    }
                }, c1086gP), hVar3, androidx.compose.runtime.internal.a.b(-868483802, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.4
                    @Override // Ia.p
                    public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num4) {
                        invoke(interfaceC1084f2, num4.intValue());
                        return p293xa.r.f47939a;
                    }

                    public final void invoke(InterfaceC1084f interfaceC1084f2, int i19) {
                        if ((i19 & 11) == 2 && interfaceC1084f2.s()) {
                            interfaceC1084f2.w();
                            return;
                        }
                        Ia.a<p293xa.r> aVar17 = nVar;
                        final String str = dismissText;
                        ButtonKt.c(aVar17, null, false, null, null, null, null, null, null, androidx.compose.runtime.internal.a.b(-1570315255, new Ia.q<U, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.4.1
                            @Override // Ia.q
                            public /* bridge */ /* synthetic */ p293xa.r invoke(U u10, InterfaceC1084f interfaceC1084f3, Integer num4) {
                                invoke(u10, interfaceC1084f3, num4.intValue());
                                return p293xa.r.f47939a;
                            }

                            public final void invoke(U TextButton, InterfaceC1084f interfaceC1084f3, int i20) {
                                kotlin.jvm.internal.i.e(TextButton, "$this$TextButton");
                                if ((i20 & 81) == 16 && interfaceC1084f3.s()) {
                                    interfaceC1084f3.w();
                                    return;
                                }
                                IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                                F type04SemiBold = intercomTheme.getTypography(interfaceC1084f3, 6).getType04SemiBold();
                                TextKt.b(str, null, intercomTheme.getColors(interfaceC1084f3, 6).m616getActionContrastWhite0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, type04SemiBold, interfaceC1084f3, 0, 0, 65530);
                            }
                        }, interfaceC1084f2), interfaceC1084f2, 805306368, 510);
                    }
                }, c1086gP), androidx.compose.runtime.internal.a.b(-565596411, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.5
                    @Override // Ia.p
                    public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num4) {
                        invoke(interfaceC1084f2, num4.intValue());
                        return p293xa.r.f47939a;
                    }

                    public final void invoke(InterfaceC1084f interfaceC1084f2, int i19) {
                        if ((i19 & 11) == 2 && interfaceC1084f2.s()) {
                            interfaceC1084f2.w();
                            return;
                        }
                        Integer num4 = num3;
                        if (num4 == null) {
                            return;
                        }
                        IconKt.a(U.c.a(num4.intValue(), interfaceC1084f2, 0), "", null, IntercomTheme.INSTANCE.getColors(interfaceC1084f2, 6).m644getPrimaryIcon0d7_KjU(), interfaceC1084f2, 56, 4);
                    }
                }, c1086gP), null, androidx.compose.runtime.internal.a.b(40178371, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.6
                    @Override // Ia.p
                    public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num4) {
                        invoke(interfaceC1084f2, num4.intValue());
                        return p293xa.r.f47939a;
                    }

                    public final void invoke(InterfaceC1084f interfaceC1084f2, int i19) {
                        if ((i19 & 11) == 2 && interfaceC1084f2.s()) {
                            interfaceC1084f2.w();
                            return;
                        }
                        IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                        F type04 = intercomTheme.getTypography(interfaceC1084f2, 6).getType04();
                        TextKt.b(message, null, intercomTheme.getColors(interfaceC1084f2, 6).m645getPrimaryText0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, type04, interfaceC1084f2, 0, 0, 65530);
                    }
                }, c1086gP), null, IntercomTheme.INSTANCE.getColors(c1086gP, 6).m621getBackground0d7_KjU(), 0L, 0L, 0L, 0.0f, new androidx.compose.ui.window.f(5), c1086gP, ((i12 >> 15) & 14) | 1600560 | ((i12 << 6) & 896), 3072, 7840);
                Ia.a<p293xa.r> aVar17 = nVar;
                aVar6 = aVar5;
                aVar7 = aVar17;
            } else {
                if (i17 != 0) {
                    hVar3 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar3 = hVar2;
                }
                if (i18 != 0) {
                    num3 = null;
                } else {
                    num3 = num2;
                }
                if (i13 != 0) {
                    nVar = new p050db.n(1);
                } else {
                    nVar = aVar3;
                }
                if (i15 != 0) {
                    aVar5 = new Z0.a(3);
                } else {
                    aVar5 = aVar4;
                }
                AndroidAlertDialog_androidKt.a(nVar, androidx.compose.runtime.internal.a.b(-1474258584, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.3
                    @Override // Ia.p
                    public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num4) {
                        invoke(interfaceC1084f2, num4.intValue());
                        return p293xa.r.f47939a;
                    }

                    public final void invoke(InterfaceC1084f interfaceC1084f2, int i19) {
                        if ((i19 & 11) == 2 && interfaceC1084f2.s()) {
                            interfaceC1084f2.w();
                            return;
                        }
                        Ia.a<p293xa.r> aVar18 = aVar5;
                        final String str = confirmText;
                        ButtonKt.c(aVar18, null, false, null, null, null, null, null, null, androidx.compose.runtime.internal.a.b(2118877259, new Ia.q<U, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.3.1
                            @Override // Ia.q
                            public /* bridge */ /* synthetic */ p293xa.r invoke(U u10, InterfaceC1084f interfaceC1084f3, Integer num4) {
                                invoke(u10, interfaceC1084f3, num4.intValue());
                                return p293xa.r.f47939a;
                            }

                            public final void invoke(U TextButton, InterfaceC1084f interfaceC1084f3, int i20) {
                                kotlin.jvm.internal.i.e(TextButton, "$this$TextButton");
                                if ((i20 & 81) == 16 && interfaceC1084f3.s()) {
                                    interfaceC1084f3.w();
                                    return;
                                }
                                IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                                F type04SemiBold = intercomTheme.getTypography(interfaceC1084f3, 6).getType04SemiBold();
                                TextKt.b(str, null, intercomTheme.getColors(interfaceC1084f3, 6).m616getActionContrastWhite0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, type04SemiBold, interfaceC1084f3, 0, 0, 65530);
                            }
                        }, interfaceC1084f2), interfaceC1084f2, 805306368, 510);
                    }
                }, c1086gP), hVar3, androidx.compose.runtime.internal.a.b(-868483802, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.4
                    @Override // Ia.p
                    public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num4) {
                        invoke(interfaceC1084f2, num4.intValue());
                        return p293xa.r.f47939a;
                    }

                    public final void invoke(InterfaceC1084f interfaceC1084f2, int i19) {
                        if ((i19 & 11) == 2 && interfaceC1084f2.s()) {
                            interfaceC1084f2.w();
                            return;
                        }
                        Ia.a<p293xa.r> aVar18 = nVar;
                        final String str = dismissText;
                        ButtonKt.c(aVar18, null, false, null, null, null, null, null, null, androidx.compose.runtime.internal.a.b(-1570315255, new Ia.q<U, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.4.1
                            @Override // Ia.q
                            public /* bridge */ /* synthetic */ p293xa.r invoke(U u10, InterfaceC1084f interfaceC1084f3, Integer num4) {
                                invoke(u10, interfaceC1084f3, num4.intValue());
                                return p293xa.r.f47939a;
                            }

                            public final void invoke(U TextButton, InterfaceC1084f interfaceC1084f3, int i20) {
                                kotlin.jvm.internal.i.e(TextButton, "$this$TextButton");
                                if ((i20 & 81) == 16 && interfaceC1084f3.s()) {
                                    interfaceC1084f3.w();
                                    return;
                                }
                                IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                                F type04SemiBold = intercomTheme.getTypography(interfaceC1084f3, 6).getType04SemiBold();
                                TextKt.b(str, null, intercomTheme.getColors(interfaceC1084f3, 6).m616getActionContrastWhite0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, type04SemiBold, interfaceC1084f3, 0, 0, 65530);
                            }
                        }, interfaceC1084f2), interfaceC1084f2, 805306368, 510);
                    }
                }, c1086gP), androidx.compose.runtime.internal.a.b(-565596411, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.5
                    @Override // Ia.p
                    public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num4) {
                        invoke(interfaceC1084f2, num4.intValue());
                        return p293xa.r.f47939a;
                    }

                    public final void invoke(InterfaceC1084f interfaceC1084f2, int i19) {
                        if ((i19 & 11) == 2 && interfaceC1084f2.s()) {
                            interfaceC1084f2.w();
                            return;
                        }
                        Integer num4 = num3;
                        if (num4 == null) {
                            return;
                        }
                        IconKt.a(U.c.a(num4.intValue(), interfaceC1084f2, 0), "", null, IntercomTheme.INSTANCE.getColors(interfaceC1084f2, 6).m644getPrimaryIcon0d7_KjU(), interfaceC1084f2, 56, 4);
                    }
                }, c1086gP), null, androidx.compose.runtime.internal.a.b(40178371, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.6
                    @Override // Ia.p
                    public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num4) {
                        invoke(interfaceC1084f2, num4.intValue());
                        return p293xa.r.f47939a;
                    }

                    public final void invoke(InterfaceC1084f interfaceC1084f2, int i19) {
                        if ((i19 & 11) == 2 && interfaceC1084f2.s()) {
                            interfaceC1084f2.w();
                            return;
                        }
                        IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                        F type04 = intercomTheme.getTypography(interfaceC1084f2, 6).getType04();
                        TextKt.b(message, null, intercomTheme.getColors(interfaceC1084f2, 6).m645getPrimaryText0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, type04, interfaceC1084f2, 0, 0, 65530);
                    }
                }, c1086gP), null, IntercomTheme.INSTANCE.getColors(c1086gP, 6).m621getBackground0d7_KjU(), 0L, 0L, 0L, 0.0f, new androidx.compose.ui.window.f(5), c1086gP, ((i12 >> 15) & 14) | 1600560 | ((i12 << 6) & 896), 3072, 7840);
                Ia.a<p293xa.r> aVar18 = nVar;
                aVar6 = aVar5;
                aVar7 = aVar18;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.ui.component.u
                    @Override // Ia.p
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return PermissionDeniedDialogKt.PermissionDeniedDialog$lambda$2(hVar3, message, confirmText, dismissText, num3, aVar7, aVar6, i10, i11, (InterfaceC1084f) obj, iIntValue);
                    }
                };
            }
        }
        i12 |= 196608;
        aVar3 = aVar;
        i15 = i11 & 64;
        if (i15 != 0) {
            if ((3670016 & i10) == 0) {
                aVar4 = aVar2;
                if (c1086gP.k(aVar4)) {
                    i16 = 1048576;
                } else {
                    i16 = 524288;
                }
                i12 |= i16;
            }
            if ((2995931 & i12) == 599186) {
                if (i17 != 0) {
                    hVar3 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar3 = hVar2;
                }
                if (i18 != 0) {
                    num3 = null;
                } else {
                    num3 = num2;
                }
                if (i13 != 0) {
                    nVar = new p050db.n(1);
                } else {
                    nVar = aVar3;
                }
                if (i15 != 0) {
                    aVar5 = new Z0.a(3);
                } else {
                    aVar5 = aVar4;
                }
                AndroidAlertDialog_androidKt.a(nVar, androidx.compose.runtime.internal.a.b(-1474258584, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.3
                    @Override // Ia.p
                    public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num4) {
                        invoke(interfaceC1084f2, num4.intValue());
                        return p293xa.r.f47939a;
                    }

                    public final void invoke(InterfaceC1084f interfaceC1084f2, int i19) {
                        if ((i19 & 11) == 2 && interfaceC1084f2.s()) {
                            interfaceC1084f2.w();
                            return;
                        }
                        Ia.a<p293xa.r> aVar19 = aVar5;
                        final String str = confirmText;
                        ButtonKt.c(aVar19, null, false, null, null, null, null, null, null, androidx.compose.runtime.internal.a.b(2118877259, new Ia.q<U, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.3.1
                            @Override // Ia.q
                            public /* bridge */ /* synthetic */ p293xa.r invoke(U u10, InterfaceC1084f interfaceC1084f3, Integer num4) {
                                invoke(u10, interfaceC1084f3, num4.intValue());
                                return p293xa.r.f47939a;
                            }

                            public final void invoke(U TextButton, InterfaceC1084f interfaceC1084f3, int i20) {
                                kotlin.jvm.internal.i.e(TextButton, "$this$TextButton");
                                if ((i20 & 81) == 16 && interfaceC1084f3.s()) {
                                    interfaceC1084f3.w();
                                    return;
                                }
                                IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                                F type04SemiBold = intercomTheme.getTypography(interfaceC1084f3, 6).getType04SemiBold();
                                TextKt.b(str, null, intercomTheme.getColors(interfaceC1084f3, 6).m616getActionContrastWhite0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, type04SemiBold, interfaceC1084f3, 0, 0, 65530);
                            }
                        }, interfaceC1084f2), interfaceC1084f2, 805306368, 510);
                    }
                }, c1086gP), hVar3, androidx.compose.runtime.internal.a.b(-868483802, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.4
                    @Override // Ia.p
                    public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num4) {
                        invoke(interfaceC1084f2, num4.intValue());
                        return p293xa.r.f47939a;
                    }

                    public final void invoke(InterfaceC1084f interfaceC1084f2, int i19) {
                        if ((i19 & 11) == 2 && interfaceC1084f2.s()) {
                            interfaceC1084f2.w();
                            return;
                        }
                        Ia.a<p293xa.r> aVar19 = nVar;
                        final String str = dismissText;
                        ButtonKt.c(aVar19, null, false, null, null, null, null, null, null, androidx.compose.runtime.internal.a.b(-1570315255, new Ia.q<U, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.4.1
                            @Override // Ia.q
                            public /* bridge */ /* synthetic */ p293xa.r invoke(U u10, InterfaceC1084f interfaceC1084f3, Integer num4) {
                                invoke(u10, interfaceC1084f3, num4.intValue());
                                return p293xa.r.f47939a;
                            }

                            public final void invoke(U TextButton, InterfaceC1084f interfaceC1084f3, int i20) {
                                kotlin.jvm.internal.i.e(TextButton, "$this$TextButton");
                                if ((i20 & 81) == 16 && interfaceC1084f3.s()) {
                                    interfaceC1084f3.w();
                                    return;
                                }
                                IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                                F type04SemiBold = intercomTheme.getTypography(interfaceC1084f3, 6).getType04SemiBold();
                                TextKt.b(str, null, intercomTheme.getColors(interfaceC1084f3, 6).m616getActionContrastWhite0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, type04SemiBold, interfaceC1084f3, 0, 0, 65530);
                            }
                        }, interfaceC1084f2), interfaceC1084f2, 805306368, 510);
                    }
                }, c1086gP), androidx.compose.runtime.internal.a.b(-565596411, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.5
                    @Override // Ia.p
                    public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num4) {
                        invoke(interfaceC1084f2, num4.intValue());
                        return p293xa.r.f47939a;
                    }

                    public final void invoke(InterfaceC1084f interfaceC1084f2, int i19) {
                        if ((i19 & 11) == 2 && interfaceC1084f2.s()) {
                            interfaceC1084f2.w();
                            return;
                        }
                        Integer num4 = num3;
                        if (num4 == null) {
                            return;
                        }
                        IconKt.a(U.c.a(num4.intValue(), interfaceC1084f2, 0), "", null, IntercomTheme.INSTANCE.getColors(interfaceC1084f2, 6).m644getPrimaryIcon0d7_KjU(), interfaceC1084f2, 56, 4);
                    }
                }, c1086gP), null, androidx.compose.runtime.internal.a.b(40178371, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.6
                    @Override // Ia.p
                    public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num4) {
                        invoke(interfaceC1084f2, num4.intValue());
                        return p293xa.r.f47939a;
                    }

                    public final void invoke(InterfaceC1084f interfaceC1084f2, int i19) {
                        if ((i19 & 11) == 2 && interfaceC1084f2.s()) {
                            interfaceC1084f2.w();
                            return;
                        }
                        IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                        F type04 = intercomTheme.getTypography(interfaceC1084f2, 6).getType04();
                        TextKt.b(message, null, intercomTheme.getColors(interfaceC1084f2, 6).m645getPrimaryText0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, type04, interfaceC1084f2, 0, 0, 65530);
                    }
                }, c1086gP), null, IntercomTheme.INSTANCE.getColors(c1086gP, 6).m621getBackground0d7_KjU(), 0L, 0L, 0L, 0.0f, new androidx.compose.ui.window.f(5), c1086gP, ((i12 >> 15) & 14) | 1600560 | ((i12 << 6) & 896), 3072, 7840);
                Ia.a<p293xa.r> aVar19 = nVar;
                aVar6 = aVar5;
                aVar7 = aVar19;
            } else {
                if (i17 != 0) {
                    hVar3 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar3 = hVar2;
                }
                if (i18 != 0) {
                    num3 = null;
                } else {
                    num3 = num2;
                }
                if (i13 != 0) {
                    nVar = new p050db.n(1);
                } else {
                    nVar = aVar3;
                }
                if (i15 != 0) {
                    aVar5 = new Z0.a(3);
                } else {
                    aVar5 = aVar4;
                }
                AndroidAlertDialog_androidKt.a(nVar, androidx.compose.runtime.internal.a.b(-1474258584, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.3
                    @Override // Ia.p
                    public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num4) {
                        invoke(interfaceC1084f2, num4.intValue());
                        return p293xa.r.f47939a;
                    }

                    public final void invoke(InterfaceC1084f interfaceC1084f2, int i19) {
                        if ((i19 & 11) == 2 && interfaceC1084f2.s()) {
                            interfaceC1084f2.w();
                            return;
                        }
                        Ia.a<p293xa.r> aVar110 = aVar5;
                        final String str = confirmText;
                        ButtonKt.c(aVar110, null, false, null, null, null, null, null, null, androidx.compose.runtime.internal.a.b(2118877259, new Ia.q<U, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.3.1
                            @Override // Ia.q
                            public /* bridge */ /* synthetic */ p293xa.r invoke(U u10, InterfaceC1084f interfaceC1084f3, Integer num4) {
                                invoke(u10, interfaceC1084f3, num4.intValue());
                                return p293xa.r.f47939a;
                            }

                            public final void invoke(U TextButton, InterfaceC1084f interfaceC1084f3, int i20) {
                                kotlin.jvm.internal.i.e(TextButton, "$this$TextButton");
                                if ((i20 & 81) == 16 && interfaceC1084f3.s()) {
                                    interfaceC1084f3.w();
                                    return;
                                }
                                IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                                F type04SemiBold = intercomTheme.getTypography(interfaceC1084f3, 6).getType04SemiBold();
                                TextKt.b(str, null, intercomTheme.getColors(interfaceC1084f3, 6).m616getActionContrastWhite0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, type04SemiBold, interfaceC1084f3, 0, 0, 65530);
                            }
                        }, interfaceC1084f2), interfaceC1084f2, 805306368, 510);
                    }
                }, c1086gP), hVar3, androidx.compose.runtime.internal.a.b(-868483802, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.4
                    @Override // Ia.p
                    public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num4) {
                        invoke(interfaceC1084f2, num4.intValue());
                        return p293xa.r.f47939a;
                    }

                    public final void invoke(InterfaceC1084f interfaceC1084f2, int i19) {
                        if ((i19 & 11) == 2 && interfaceC1084f2.s()) {
                            interfaceC1084f2.w();
                            return;
                        }
                        Ia.a<p293xa.r> aVar110 = nVar;
                        final String str = dismissText;
                        ButtonKt.c(aVar110, null, false, null, null, null, null, null, null, androidx.compose.runtime.internal.a.b(-1570315255, new Ia.q<U, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.4.1
                            @Override // Ia.q
                            public /* bridge */ /* synthetic */ p293xa.r invoke(U u10, InterfaceC1084f interfaceC1084f3, Integer num4) {
                                invoke(u10, interfaceC1084f3, num4.intValue());
                                return p293xa.r.f47939a;
                            }

                            public final void invoke(U TextButton, InterfaceC1084f interfaceC1084f3, int i20) {
                                kotlin.jvm.internal.i.e(TextButton, "$this$TextButton");
                                if ((i20 & 81) == 16 && interfaceC1084f3.s()) {
                                    interfaceC1084f3.w();
                                    return;
                                }
                                IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                                F type04SemiBold = intercomTheme.getTypography(interfaceC1084f3, 6).getType04SemiBold();
                                TextKt.b(str, null, intercomTheme.getColors(interfaceC1084f3, 6).m616getActionContrastWhite0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, type04SemiBold, interfaceC1084f3, 0, 0, 65530);
                            }
                        }, interfaceC1084f2), interfaceC1084f2, 805306368, 510);
                    }
                }, c1086gP), androidx.compose.runtime.internal.a.b(-565596411, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.5
                    @Override // Ia.p
                    public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num4) {
                        invoke(interfaceC1084f2, num4.intValue());
                        return p293xa.r.f47939a;
                    }

                    public final void invoke(InterfaceC1084f interfaceC1084f2, int i19) {
                        if ((i19 & 11) == 2 && interfaceC1084f2.s()) {
                            interfaceC1084f2.w();
                            return;
                        }
                        Integer num4 = num3;
                        if (num4 == null) {
                            return;
                        }
                        IconKt.a(U.c.a(num4.intValue(), interfaceC1084f2, 0), "", null, IntercomTheme.INSTANCE.getColors(interfaceC1084f2, 6).m644getPrimaryIcon0d7_KjU(), interfaceC1084f2, 56, 4);
                    }
                }, c1086gP), null, androidx.compose.runtime.internal.a.b(40178371, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.6
                    @Override // Ia.p
                    public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num4) {
                        invoke(interfaceC1084f2, num4.intValue());
                        return p293xa.r.f47939a;
                    }

                    public final void invoke(InterfaceC1084f interfaceC1084f2, int i19) {
                        if ((i19 & 11) == 2 && interfaceC1084f2.s()) {
                            interfaceC1084f2.w();
                            return;
                        }
                        IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                        F type04 = intercomTheme.getTypography(interfaceC1084f2, 6).getType04();
                        TextKt.b(message, null, intercomTheme.getColors(interfaceC1084f2, 6).m645getPrimaryText0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, type04, interfaceC1084f2, 0, 0, 65530);
                    }
                }, c1086gP), null, IntercomTheme.INSTANCE.getColors(c1086gP, 6).m621getBackground0d7_KjU(), 0L, 0L, 0L, 0.0f, new androidx.compose.ui.window.f(5), c1086gP, ((i12 >> 15) & 14) | 1600560 | ((i12 << 6) & 896), 3072, 7840);
                Ia.a<p293xa.r> aVar110 = nVar;
                aVar6 = aVar5;
                aVar7 = aVar110;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.ui.component.u
                    @Override // Ia.p
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return PermissionDeniedDialogKt.PermissionDeniedDialog$lambda$2(hVar3, message, confirmText, dismissText, num3, aVar7, aVar6, i10, i11, (InterfaceC1084f) obj, iIntValue);
                    }
                };
            }
        }
        i12 |= 1572864;
        aVar4 = aVar2;
        if ((2995931 & i12) == 599186) {
            if (i17 != 0) {
                hVar3 = androidx.compose.ui.h.a.f13984b;
            } else {
                hVar3 = hVar2;
            }
            if (i18 != 0) {
                num3 = null;
            } else {
                num3 = num2;
            }
            if (i13 != 0) {
                nVar = new p050db.n(1);
            } else {
                nVar = aVar3;
            }
            if (i15 != 0) {
                aVar5 = new Z0.a(3);
            } else {
                aVar5 = aVar4;
            }
            AndroidAlertDialog_androidKt.a(nVar, androidx.compose.runtime.internal.a.b(-1474258584, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.3
                @Override // Ia.p
                public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num4) {
                    invoke(interfaceC1084f2, num4.intValue());
                    return p293xa.r.f47939a;
                }

                public final void invoke(InterfaceC1084f interfaceC1084f2, int i19) {
                    if ((i19 & 11) == 2 && interfaceC1084f2.s()) {
                        interfaceC1084f2.w();
                        return;
                    }
                    Ia.a<p293xa.r> aVar111 = aVar5;
                    final String str = confirmText;
                    ButtonKt.c(aVar111, null, false, null, null, null, null, null, null, androidx.compose.runtime.internal.a.b(2118877259, new Ia.q<U, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.3.1
                        @Override // Ia.q
                        public /* bridge */ /* synthetic */ p293xa.r invoke(U u10, InterfaceC1084f interfaceC1084f3, Integer num4) {
                            invoke(u10, interfaceC1084f3, num4.intValue());
                            return p293xa.r.f47939a;
                        }

                        public final void invoke(U TextButton, InterfaceC1084f interfaceC1084f3, int i20) {
                            kotlin.jvm.internal.i.e(TextButton, "$this$TextButton");
                            if ((i20 & 81) == 16 && interfaceC1084f3.s()) {
                                interfaceC1084f3.w();
                                return;
                            }
                            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                            F type04SemiBold = intercomTheme.getTypography(interfaceC1084f3, 6).getType04SemiBold();
                            TextKt.b(str, null, intercomTheme.getColors(interfaceC1084f3, 6).m616getActionContrastWhite0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, type04SemiBold, interfaceC1084f3, 0, 0, 65530);
                        }
                    }, interfaceC1084f2), interfaceC1084f2, 805306368, 510);
                }
            }, c1086gP), hVar3, androidx.compose.runtime.internal.a.b(-868483802, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.4
                @Override // Ia.p
                public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num4) {
                    invoke(interfaceC1084f2, num4.intValue());
                    return p293xa.r.f47939a;
                }

                public final void invoke(InterfaceC1084f interfaceC1084f2, int i19) {
                    if ((i19 & 11) == 2 && interfaceC1084f2.s()) {
                        interfaceC1084f2.w();
                        return;
                    }
                    Ia.a<p293xa.r> aVar111 = nVar;
                    final String str = dismissText;
                    ButtonKt.c(aVar111, null, false, null, null, null, null, null, null, androidx.compose.runtime.internal.a.b(-1570315255, new Ia.q<U, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.4.1
                        @Override // Ia.q
                        public /* bridge */ /* synthetic */ p293xa.r invoke(U u10, InterfaceC1084f interfaceC1084f3, Integer num4) {
                            invoke(u10, interfaceC1084f3, num4.intValue());
                            return p293xa.r.f47939a;
                        }

                        public final void invoke(U TextButton, InterfaceC1084f interfaceC1084f3, int i20) {
                            kotlin.jvm.internal.i.e(TextButton, "$this$TextButton");
                            if ((i20 & 81) == 16 && interfaceC1084f3.s()) {
                                interfaceC1084f3.w();
                                return;
                            }
                            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                            F type04SemiBold = intercomTheme.getTypography(interfaceC1084f3, 6).getType04SemiBold();
                            TextKt.b(str, null, intercomTheme.getColors(interfaceC1084f3, 6).m616getActionContrastWhite0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, type04SemiBold, interfaceC1084f3, 0, 0, 65530);
                        }
                    }, interfaceC1084f2), interfaceC1084f2, 805306368, 510);
                }
            }, c1086gP), androidx.compose.runtime.internal.a.b(-565596411, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.5
                @Override // Ia.p
                public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num4) {
                    invoke(interfaceC1084f2, num4.intValue());
                    return p293xa.r.f47939a;
                }

                public final void invoke(InterfaceC1084f interfaceC1084f2, int i19) {
                    if ((i19 & 11) == 2 && interfaceC1084f2.s()) {
                        interfaceC1084f2.w();
                        return;
                    }
                    Integer num4 = num3;
                    if (num4 == null) {
                        return;
                    }
                    IconKt.a(U.c.a(num4.intValue(), interfaceC1084f2, 0), "", null, IntercomTheme.INSTANCE.getColors(interfaceC1084f2, 6).m644getPrimaryIcon0d7_KjU(), interfaceC1084f2, 56, 4);
                }
            }, c1086gP), null, androidx.compose.runtime.internal.a.b(40178371, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.6
                @Override // Ia.p
                public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num4) {
                    invoke(interfaceC1084f2, num4.intValue());
                    return p293xa.r.f47939a;
                }

                public final void invoke(InterfaceC1084f interfaceC1084f2, int i19) {
                    if ((i19 & 11) == 2 && interfaceC1084f2.s()) {
                        interfaceC1084f2.w();
                        return;
                    }
                    IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                    F type04 = intercomTheme.getTypography(interfaceC1084f2, 6).getType04();
                    TextKt.b(message, null, intercomTheme.getColors(interfaceC1084f2, 6).m645getPrimaryText0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, type04, interfaceC1084f2, 0, 0, 65530);
                }
            }, c1086gP), null, IntercomTheme.INSTANCE.getColors(c1086gP, 6).m621getBackground0d7_KjU(), 0L, 0L, 0L, 0.0f, new androidx.compose.ui.window.f(5), c1086gP, ((i12 >> 15) & 14) | 1600560 | ((i12 << 6) & 896), 3072, 7840);
            Ia.a<p293xa.r> aVar111 = nVar;
            aVar6 = aVar5;
            aVar7 = aVar111;
        } else {
            if (i17 != 0) {
                hVar3 = androidx.compose.ui.h.a.f13984b;
            } else {
                hVar3 = hVar2;
            }
            if (i18 != 0) {
                num3 = null;
            } else {
                num3 = num2;
            }
            if (i13 != 0) {
                nVar = new p050db.n(1);
            } else {
                nVar = aVar3;
            }
            if (i15 != 0) {
                aVar5 = new Z0.a(3);
            } else {
                aVar5 = aVar4;
            }
            AndroidAlertDialog_androidKt.a(nVar, androidx.compose.runtime.internal.a.b(-1474258584, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.3
                @Override // Ia.p
                public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num4) {
                    invoke(interfaceC1084f2, num4.intValue());
                    return p293xa.r.f47939a;
                }

                public final void invoke(InterfaceC1084f interfaceC1084f2, int i19) {
                    if ((i19 & 11) == 2 && interfaceC1084f2.s()) {
                        interfaceC1084f2.w();
                        return;
                    }
                    Ia.a<p293xa.r> aVar112 = aVar5;
                    final String str = confirmText;
                    ButtonKt.c(aVar112, null, false, null, null, null, null, null, null, androidx.compose.runtime.internal.a.b(2118877259, new Ia.q<U, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.3.1
                        @Override // Ia.q
                        public /* bridge */ /* synthetic */ p293xa.r invoke(U u10, InterfaceC1084f interfaceC1084f3, Integer num4) {
                            invoke(u10, interfaceC1084f3, num4.intValue());
                            return p293xa.r.f47939a;
                        }

                        public final void invoke(U TextButton, InterfaceC1084f interfaceC1084f3, int i20) {
                            kotlin.jvm.internal.i.e(TextButton, "$this$TextButton");
                            if ((i20 & 81) == 16 && interfaceC1084f3.s()) {
                                interfaceC1084f3.w();
                                return;
                            }
                            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                            F type04SemiBold = intercomTheme.getTypography(interfaceC1084f3, 6).getType04SemiBold();
                            TextKt.b(str, null, intercomTheme.getColors(interfaceC1084f3, 6).m616getActionContrastWhite0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, type04SemiBold, interfaceC1084f3, 0, 0, 65530);
                        }
                    }, interfaceC1084f2), interfaceC1084f2, 805306368, 510);
                }
            }, c1086gP), hVar3, androidx.compose.runtime.internal.a.b(-868483802, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.4
                @Override // Ia.p
                public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num4) {
                    invoke(interfaceC1084f2, num4.intValue());
                    return p293xa.r.f47939a;
                }

                public final void invoke(InterfaceC1084f interfaceC1084f2, int i19) {
                    if ((i19 & 11) == 2 && interfaceC1084f2.s()) {
                        interfaceC1084f2.w();
                        return;
                    }
                    Ia.a<p293xa.r> aVar112 = nVar;
                    final String str = dismissText;
                    ButtonKt.c(aVar112, null, false, null, null, null, null, null, null, androidx.compose.runtime.internal.a.b(-1570315255, new Ia.q<U, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.4.1
                        @Override // Ia.q
                        public /* bridge */ /* synthetic */ p293xa.r invoke(U u10, InterfaceC1084f interfaceC1084f3, Integer num4) {
                            invoke(u10, interfaceC1084f3, num4.intValue());
                            return p293xa.r.f47939a;
                        }

                        public final void invoke(U TextButton, InterfaceC1084f interfaceC1084f3, int i20) {
                            kotlin.jvm.internal.i.e(TextButton, "$this$TextButton");
                            if ((i20 & 81) == 16 && interfaceC1084f3.s()) {
                                interfaceC1084f3.w();
                                return;
                            }
                            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                            F type04SemiBold = intercomTheme.getTypography(interfaceC1084f3, 6).getType04SemiBold();
                            TextKt.b(str, null, intercomTheme.getColors(interfaceC1084f3, 6).m616getActionContrastWhite0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, type04SemiBold, interfaceC1084f3, 0, 0, 65530);
                        }
                    }, interfaceC1084f2), interfaceC1084f2, 805306368, 510);
                }
            }, c1086gP), androidx.compose.runtime.internal.a.b(-565596411, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.5
                @Override // Ia.p
                public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num4) {
                    invoke(interfaceC1084f2, num4.intValue());
                    return p293xa.r.f47939a;
                }

                public final void invoke(InterfaceC1084f interfaceC1084f2, int i19) {
                    if ((i19 & 11) == 2 && interfaceC1084f2.s()) {
                        interfaceC1084f2.w();
                        return;
                    }
                    Integer num4 = num3;
                    if (num4 == null) {
                        return;
                    }
                    IconKt.a(U.c.a(num4.intValue(), interfaceC1084f2, 0), "", null, IntercomTheme.INSTANCE.getColors(interfaceC1084f2, 6).m644getPrimaryIcon0d7_KjU(), interfaceC1084f2, 56, 4);
                }
            }, c1086gP), null, androidx.compose.runtime.internal.a.b(40178371, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.6
                @Override // Ia.p
                public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num4) {
                    invoke(interfaceC1084f2, num4.intValue());
                    return p293xa.r.f47939a;
                }

                public final void invoke(InterfaceC1084f interfaceC1084f2, int i19) {
                    if ((i19 & 11) == 2 && interfaceC1084f2.s()) {
                        interfaceC1084f2.w();
                        return;
                    }
                    IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                    F type04 = intercomTheme.getTypography(interfaceC1084f2, 6).getType04();
                    TextKt.b(message, null, intercomTheme.getColors(interfaceC1084f2, 6).m645getPrimaryText0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, type04, interfaceC1084f2, 0, 0, 65530);
                }
            }, c1086gP), null, IntercomTheme.INSTANCE.getColors(c1086gP, 6).m621getBackground0d7_KjU(), 0L, 0L, 0L, 0.0f, new androidx.compose.ui.window.f(5), c1086gP, ((i12 >> 15) & 14) | 1600560 | ((i12 << 6) & 896), 3072, 7840);
            Ia.a<p293xa.r> aVar112 = nVar;
            aVar6 = aVar5;
            aVar7 = aVar112;
        }
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.ui.component.u
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return PermissionDeniedDialogKt.PermissionDeniedDialog$lambda$2(hVar3, message, confirmText, dismissText, num3, aVar7, aVar6, i10, i11, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r PermissionDeniedDialog$lambda$2(androidx.compose.ui.h hVar, String message, String confirmText, String dismissText, Integer num, Ia.a aVar, Ia.a aVar2, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        kotlin.jvm.internal.i.e(message, "$message");
        kotlin.jvm.internal.i.e(confirmText, "$confirmText");
        kotlin.jvm.internal.i.e(dismissText, "$dismissText");
        PermissionDeniedDialog(hVar, message, confirmText, dismissText, num, aVar, aVar2, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return p293xa.r.f47939a;
    }

    private static final void PermissionDeniedDialogPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(-501567607);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$PermissionDeniedDialogKt.INSTANCE.m519getLambda1$intercom_sdk_ui_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Y(i10, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r PermissionDeniedDialogPreview$lambda$3(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        PermissionDeniedDialogPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }
}
