package io.intercom.android.sdk.ui.component;

import android.os.Build;
import androidx.compose.foundation.layout.InterfaceC0954n;
import androidx.compose.material3.C1059k;
import androidx.compose.material3.CardKt;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.ui.graphics.H;
import androidx.compose.ui.graphics.l0;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: IntercomCard.kt */
/* JADX INFO: loaded from: classes.dex */
public final class IntercomCardKt {
    /* JADX WARN: Code duplicated, block: B:59:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:61:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:64:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:66:0x00e1  */
    public static final void IntercomCard(androidx.compose.ui.h hVar, IntercomCardStyle.Style style, final Ia.q<? super InterfaceC0954n, ? super InterfaceC1084f, ? super Integer, p293xa.r> content, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        androidx.compose.ui.h hVar2;
        int i12;
        IntercomCardStyle.Style style2;
        androidx.compose.ui.h hVar3;
        IntercomCardStyle.Style styleM531defaultStyleqUnfpCA;
        int i13;
        float fM540getElevationD9Ej5fM;
        H hM541getShadowColorQN2ZGVo;
        long j;
        final androidx.compose.ui.h hVar4;
        final IntercomCardStyle.Style style3;
        kotlin.jvm.internal.i.e(content, "content");
        C1086g c1086gP = interfaceC1084f.p(1083788517);
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
        if ((i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            if ((i11 & 2) == 0) {
                style2 = style;
                int i15 = c1086gP.K(style2) ? 32 : 16;
                i12 |= i15;
            } else {
                style2 = style;
            }
            i12 |= i15;
        } else {
            style2 = style;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 896) == 0) {
            i12 |= c1086gP.k(content) ? 256 : 128;
        }
        if ((i12 & 731) == 146 && c1086gP.s()) {
            c1086gP.w();
            hVar4 = hVar2;
            style3 = style2;
        } else {
            c1086gP.r0();
            if ((i10 & 1) == 0 || c1086gP.a0()) {
                androidx.compose.ui.h hVar5 = i14 != 0 ? androidx.compose.ui.h.a.f13984b : hVar2;
                if ((i11 & 2) != 0) {
                    hVar3 = hVar5;
                    styleM531defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m531defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, c1086gP, 1572864, 63);
                    i13 = i12 & (-113);
                } else {
                    hVar3 = hVar5;
                }
                c1086gP.U();
                if (Build.VERSION.SDK_INT >= 28) {
                    fM540getElevationD9Ej5fM = styleM531defaultStyleqUnfpCA.m540getElevationD9Ej5fM();
                } else {
                    fM540getElevationD9Ej5fM = 2;
                }
                float f10 = fM540getElevationD9Ej5fM;
                l0 shape = styleM531defaultStyleqUnfpCA.getShape();
                hM541getShadowColorQN2ZGVo = styleM531defaultStyleqUnfpCA.m541getShadowColorQN2ZGVo();
                if (hM541getShadowColorQN2ZGVo != null) {
                    j = hM541getShadowColorQN2ZGVo.f13506a;
                } else {
                    j = H.f13495b;
                }
                CardKt.b(P3.d.v(hVar3, f10, shape, 0L, j, 12), styleM531defaultStyleqUnfpCA.getShape(), C1059k.a(styleM531defaultStyleqUnfpCA.m538getBackgroundColor0d7_KjU(), styleM531defaultStyleqUnfpCA.m539getContentColor0d7_KjU(), c1086gP, 0, 12), C1059k.b(0, 62), styleM531defaultStyleqUnfpCA.getBorder(), content, c1086gP, (i13 << 9) & 458752, 0);
                hVar4 = hVar3;
                style3 = styleM531defaultStyleqUnfpCA;
            } else {
                c1086gP.w();
                if ((i11 & 2) != 0) {
                    i12 &= -113;
                }
                hVar3 = hVar2;
            }
            i13 = i12;
            styleM531defaultStyleqUnfpCA = style2;
            c1086gP.U();
            if (Build.VERSION.SDK_INT >= 28) {
                fM540getElevationD9Ej5fM = styleM531defaultStyleqUnfpCA.m540getElevationD9Ej5fM();
            } else {
                fM540getElevationD9Ej5fM = 2;
            }
            float f11 = fM540getElevationD9Ej5fM;
            l0 shape2 = styleM531defaultStyleqUnfpCA.getShape();
            hM541getShadowColorQN2ZGVo = styleM531defaultStyleqUnfpCA.m541getShadowColorQN2ZGVo();
            if (hM541getShadowColorQN2ZGVo != null) {
                j = hM541getShadowColorQN2ZGVo.f13506a;
            } else {
                j = H.f13495b;
            }
            CardKt.b(P3.d.v(hVar3, f11, shape2, 0L, j, 12), styleM531defaultStyleqUnfpCA.getShape(), C1059k.a(styleM531defaultStyleqUnfpCA.m538getBackgroundColor0d7_KjU(), styleM531defaultStyleqUnfpCA.m539getContentColor0d7_KjU(), c1086gP, 0, 12), C1059k.b(0, 62), styleM531defaultStyleqUnfpCA.getBorder(), content, c1086gP, (i13 << 9) & 458752, 0);
            hVar4 = hVar3;
            style3 = styleM531defaultStyleqUnfpCA;
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.ui.component.k
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return IntercomCardKt.IntercomCard$lambda$0(hVar4, style3, content, i10, i11, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r IntercomCard$lambda$0(androidx.compose.ui.h hVar, IntercomCardStyle.Style style, Ia.q content, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        kotlin.jvm.internal.i.e(content, "$content");
        IntercomCard(hVar, style, content, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r IntercomCard$lambda$2(Ia.a onClick, androidx.compose.ui.h hVar, boolean z10, IntercomCardStyle.Style style, androidx.compose.foundation.interaction.k kVar, Ia.q content, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        kotlin.jvm.internal.i.e(onClick, "$onClick");
        kotlin.jvm.internal.i.e(content, "$content");
        IntercomCard(onClick, hVar, z10, style, kVar, content, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return p293xa.r.f47939a;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x019a  */
    /* JADX WARN: Code duplicated, block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004f  */
    /* JADX WARN: Code duplicated, block: B:28:0x0054  */
    /* JADX WARN: Code duplicated, block: B:30:0x0058  */
    /* JADX WARN: Code duplicated, block: B:32:0x0060  */
    /* JADX WARN: Code duplicated, block: B:33:0x0063  */
    /* JADX WARN: Code duplicated, block: B:37:0x006a  */
    /* JADX WARN: Code duplicated, block: B:39:0x006e  */
    /* JADX WARN: Code duplicated, block: B:41:0x0076  */
    /* JADX WARN: Code duplicated, block: B:42:0x0079  */
    /* JADX WARN: Code duplicated, block: B:45:0x007f  */
    /* JADX WARN: Code duplicated, block: B:48:0x0085  */
    /* JADX WARN: Code duplicated, block: B:50:0x008a  */
    /* JADX WARN: Code duplicated, block: B:52:0x0090  */
    /* JADX WARN: Code duplicated, block: B:54:0x0098  */
    /* JADX WARN: Code duplicated, block: B:55:0x009b  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:88:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:91:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:92:0x011a  */
    /* JADX WARN: Code duplicated, block: B:94:0x011d  */
    /* JADX WARN: Code duplicated, block: B:96:0x012b  */
    /* JADX WARN: Code duplicated, block: B:98:0x0141  */
    public static final void IntercomCard(final Ia.a<p293xa.r> onClick, androidx.compose.ui.h hVar, boolean z10, IntercomCardStyle.Style style, androidx.compose.foundation.interaction.k kVar, final Ia.q<? super InterfaceC0954n, ? super InterfaceC1084f, ? super Integer, p293xa.r> content, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        int i12;
        final androidx.compose.ui.h hVar2;
        int i13;
        boolean z11;
        int i14;
        IntercomCardStyle.Style style2;
        int i15;
        androidx.compose.foundation.interaction.k kVar2;
        int i16;
        int i17;
        androidx.compose.ui.h hVar3;
        boolean z12;
        IntercomCardStyle.Style styleM531defaultStyleqUnfpCA;
        androidx.compose.ui.h hVar4;
        boolean z13;
        IntercomCardStyle.Style style3;
        Object objF;
        androidx.compose.foundation.interaction.k kVar3;
        final boolean z14;
        final IntercomCardStyle.Style style4;
        final androidx.compose.foundation.interaction.k kVar4;
        C1105p0 c1105p0V;
        kotlin.jvm.internal.i.e(onClick, "onClick");
        kotlin.jvm.internal.i.e(content, "content");
        C1086g c1086gP = interfaceC1084f.p(254499300);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (c1086gP.k(onClick) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i18 = i11 & 2;
        if (i18 == 0) {
            if ((i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
                hVar2 = hVar;
                i12 |= c1086gP.K(hVar2) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & 896) == 0) {
                    z11 = z10;
                    if (c1086gP.c(z11)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                if ((i10 & 7168) == 0) {
                    if ((i11 & 8) == 0) {
                        style2 = style;
                        int i19 = c1086gP.K(style2) ? 2048 : 1024;
                        i12 |= i19;
                    } else {
                        style2 = style;
                    }
                    i12 |= i19;
                } else {
                    style2 = style;
                }
                i15 = i11 & 16;
                if (i15 != 0) {
                    if ((57344 & i10) == 0) {
                        kVar2 = kVar;
                        if (c1086gP.K(kVar2)) {
                            i16 = 16384;
                        } else {
                            i16 = 8192;
                        }
                        i12 |= i16;
                    }
                    if ((i11 & 32) != 0) {
                        if ((458752 & i10) == 0) {
                            if (c1086gP.k(content)) {
                                i17 = 131072;
                            } else {
                                i17 = 65536;
                            }
                        }
                        if ((374491 & i12) != 74898 && c1086gP.s()) {
                            c1086gP.w();
                            z14 = z11;
                            style4 = style2;
                            kVar4 = kVar2;
                        } else {
                            c1086gP.r0();
                            if ((i10 & 1) == 0 && !c1086gP.a0()) {
                                c1086gP.w();
                                if ((i11 & 8) != 0) {
                                    i12 &= -7169;
                                }
                                hVar4 = hVar2;
                                z13 = z11;
                                style3 = style2;
                            } else {
                                if (i18 != 0) {
                                    hVar3 = androidx.compose.ui.h.a.f13984b;
                                } else {
                                    hVar3 = hVar2;
                                }
                                if (i13 != 0) {
                                    z12 = true;
                                } else {
                                    z12 = z11;
                                }
                                if ((i11 & 8) != 0) {
                                    styleM531defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m531defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, c1086gP, 1572864, 63);
                                    i12 &= -7169;
                                } else {
                                    styleM531defaultStyleqUnfpCA = style2;
                                }
                                if (i15 != 0) {
                                    c1086gP.L(-2091443309);
                                    objF = c1086gP.f();
                                    if (objF == InterfaceC1084f.a.f12980a) {
                                        objF = new androidx.compose.foundation.interaction.l();
                                        c1086gP.E(objF);
                                    }
                                    c1086gP.T(false);
                                    hVar4 = hVar3;
                                    z13 = z12;
                                    style3 = styleM531defaultStyleqUnfpCA;
                                    kVar3 = (androidx.compose.foundation.interaction.k) objF;
                                } else {
                                    hVar4 = hVar3;
                                    z13 = z12;
                                    style3 = styleM531defaultStyleqUnfpCA;
                                }
                                c1086gP.U();
                                int i20 = i12 & 1022;
                                int i21 = i12 << 9;
                                CardKt.a(onClick, hVar4, z13, style3.getShape(), C1059k.a(style3.m538getBackgroundColor0d7_KjU(), style3.m539getContentColor0d7_KjU(), c1086gP, 0, 12), C1059k.b(style3.m540getElevationD9Ej5fM(), 62), style3.getBorder(), kVar3, content, c1086gP, i20 | (29360128 & i21) | (i21 & 234881024), 0);
                                hVar2 = hVar4;
                                z14 = z13;
                                style4 = style3;
                                kVar4 = kVar3;
                            }
                            kVar3 = kVar2;
                            c1086gP.U();
                            int i22 = i12 & 1022;
                            int i23 = i12 << 9;
                            CardKt.a(onClick, hVar4, z13, style3.getShape(), C1059k.a(style3.m538getBackgroundColor0d7_KjU(), style3.m539getContentColor0d7_KjU(), c1086gP, 0, 12), C1059k.b(style3.m540getElevationD9Ej5fM(), 62), style3.getBorder(), kVar3, content, c1086gP, i22 | (29360128 & i23) | (i23 & 234881024), 0);
                            hVar2 = hVar4;
                            z14 = z13;
                            style4 = style3;
                            kVar4 = kVar3;
                        }
                        c1105p0V = c1086gP.V();
                        if (c1105p0V != null) {
                            c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.ui.component.l
                                @Override // Ia.p
                                public final Object invoke(Object obj, Object obj2) {
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return IntercomCardKt.IntercomCard$lambda$2(onClick, hVar2, z14, style4, kVar4, content, i10, i11, (InterfaceC1084f) obj, iIntValue);
                                }
                            };
                        }
                    }
                    i17 = 196608;
                    i12 |= i17;
                    if ((374491 & i12) != 74898) {
                        c1086gP.r0();
                        if ((i10 & 1) == 0) {
                            if (i18 != 0) {
                                hVar3 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar3 = hVar2;
                            }
                            if (i13 != 0) {
                                z12 = true;
                            } else {
                                z12 = z11;
                            }
                            if ((i11 & 8) != 0) {
                                styleM531defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m531defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, c1086gP, 1572864, 63);
                                i12 &= -7169;
                            } else {
                                styleM531defaultStyleqUnfpCA = style2;
                            }
                            if (i15 != 0) {
                                c1086gP.L(-2091443309);
                                objF = c1086gP.f();
                                if (objF == InterfaceC1084f.a.f12980a) {
                                    objF = new androidx.compose.foundation.interaction.l();
                                    c1086gP.E(objF);
                                }
                                c1086gP.T(false);
                                hVar4 = hVar3;
                                z13 = z12;
                                style3 = styleM531defaultStyleqUnfpCA;
                                kVar3 = (androidx.compose.foundation.interaction.k) objF;
                            } else {
                                hVar4 = hVar3;
                                z13 = z12;
                                style3 = styleM531defaultStyleqUnfpCA;
                                kVar3 = kVar2;
                            }
                        } else {
                            if (i18 != 0) {
                                hVar3 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar3 = hVar2;
                            }
                            if (i13 != 0) {
                                z12 = true;
                            } else {
                                z12 = z11;
                            }
                            if ((i11 & 8) != 0) {
                                styleM531defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m531defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, c1086gP, 1572864, 63);
                                i12 &= -7169;
                            } else {
                                styleM531defaultStyleqUnfpCA = style2;
                            }
                            if (i15 != 0) {
                                c1086gP.L(-2091443309);
                                objF = c1086gP.f();
                                if (objF == InterfaceC1084f.a.f12980a) {
                                    objF = new androidx.compose.foundation.interaction.l();
                                    c1086gP.E(objF);
                                }
                                c1086gP.T(false);
                                hVar4 = hVar3;
                                z13 = z12;
                                style3 = styleM531defaultStyleqUnfpCA;
                                kVar3 = (androidx.compose.foundation.interaction.k) objF;
                            } else {
                                hVar4 = hVar3;
                                z13 = z12;
                                style3 = styleM531defaultStyleqUnfpCA;
                                kVar3 = kVar2;
                            }
                        }
                        c1086gP.U();
                        int i24 = i12 & 1022;
                        int i25 = i12 << 9;
                        CardKt.a(onClick, hVar4, z13, style3.getShape(), C1059k.a(style3.m538getBackgroundColor0d7_KjU(), style3.m539getContentColor0d7_KjU(), c1086gP, 0, 12), C1059k.b(style3.m540getElevationD9Ej5fM(), 62), style3.getBorder(), kVar3, content, c1086gP, i24 | (29360128 & i25) | (i25 & 234881024), 0);
                        hVar2 = hVar4;
                        z14 = z13;
                        style4 = style3;
                        kVar4 = kVar3;
                    } else {
                        c1086gP.r0();
                        if ((i10 & 1) == 0) {
                            if (i18 != 0) {
                                hVar3 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar3 = hVar2;
                            }
                            if (i13 != 0) {
                                z12 = true;
                            } else {
                                z12 = z11;
                            }
                            if ((i11 & 8) != 0) {
                                styleM531defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m531defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, c1086gP, 1572864, 63);
                                i12 &= -7169;
                            } else {
                                styleM531defaultStyleqUnfpCA = style2;
                            }
                            if (i15 != 0) {
                                c1086gP.L(-2091443309);
                                objF = c1086gP.f();
                                if (objF == InterfaceC1084f.a.f12980a) {
                                    objF = new androidx.compose.foundation.interaction.l();
                                    c1086gP.E(objF);
                                }
                                c1086gP.T(false);
                                hVar4 = hVar3;
                                z13 = z12;
                                style3 = styleM531defaultStyleqUnfpCA;
                                kVar3 = (androidx.compose.foundation.interaction.k) objF;
                            } else {
                                hVar4 = hVar3;
                                z13 = z12;
                                style3 = styleM531defaultStyleqUnfpCA;
                                kVar3 = kVar2;
                            }
                        } else {
                            if (i18 != 0) {
                                hVar3 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar3 = hVar2;
                            }
                            if (i13 != 0) {
                                z12 = true;
                            } else {
                                z12 = z11;
                            }
                            if ((i11 & 8) != 0) {
                                styleM531defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m531defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, c1086gP, 1572864, 63);
                                i12 &= -7169;
                            } else {
                                styleM531defaultStyleqUnfpCA = style2;
                            }
                            if (i15 != 0) {
                                c1086gP.L(-2091443309);
                                objF = c1086gP.f();
                                if (objF == InterfaceC1084f.a.f12980a) {
                                    objF = new androidx.compose.foundation.interaction.l();
                                    c1086gP.E(objF);
                                }
                                c1086gP.T(false);
                                hVar4 = hVar3;
                                z13 = z12;
                                style3 = styleM531defaultStyleqUnfpCA;
                                kVar3 = (androidx.compose.foundation.interaction.k) objF;
                            } else {
                                hVar4 = hVar3;
                                z13 = z12;
                                style3 = styleM531defaultStyleqUnfpCA;
                                kVar3 = kVar2;
                            }
                        }
                        c1086gP.U();
                        int i26 = i12 & 1022;
                        int i27 = i12 << 9;
                        CardKt.a(onClick, hVar4, z13, style3.getShape(), C1059k.a(style3.m538getBackgroundColor0d7_KjU(), style3.m539getContentColor0d7_KjU(), c1086gP, 0, 12), C1059k.b(style3.m540getElevationD9Ej5fM(), 62), style3.getBorder(), kVar3, content, c1086gP, i26 | (29360128 & i27) | (i27 & 234881024), 0);
                        hVar2 = hVar4;
                        z14 = z13;
                        style4 = style3;
                        kVar4 = kVar3;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.ui.component.l
                            @Override // Ia.p
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return IntercomCardKt.IntercomCard$lambda$2(onClick, hVar2, z14, style4, kVar4, content, i10, i11, (InterfaceC1084f) obj, iIntValue);
                            }
                        };
                    }
                }
                i12 |= 24576;
                kVar2 = kVar;
                if ((i11 & 32) != 0) {
                    if ((458752 & i10) == 0) {
                        if (c1086gP.k(content)) {
                            i17 = 131072;
                        } else {
                            i17 = 65536;
                        }
                    }
                    if ((374491 & i12) != 74898) {
                        c1086gP.r0();
                        if ((i10 & 1) == 0) {
                            if (i18 != 0) {
                                hVar3 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar3 = hVar2;
                            }
                            if (i13 != 0) {
                                z12 = true;
                            } else {
                                z12 = z11;
                            }
                            if ((i11 & 8) != 0) {
                                styleM531defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m531defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, c1086gP, 1572864, 63);
                                i12 &= -7169;
                            } else {
                                styleM531defaultStyleqUnfpCA = style2;
                            }
                            if (i15 != 0) {
                                c1086gP.L(-2091443309);
                                objF = c1086gP.f();
                                if (objF == InterfaceC1084f.a.f12980a) {
                                    objF = new androidx.compose.foundation.interaction.l();
                                    c1086gP.E(objF);
                                }
                                c1086gP.T(false);
                                hVar4 = hVar3;
                                z13 = z12;
                                style3 = styleM531defaultStyleqUnfpCA;
                                kVar3 = (androidx.compose.foundation.interaction.k) objF;
                            } else {
                                hVar4 = hVar3;
                                z13 = z12;
                                style3 = styleM531defaultStyleqUnfpCA;
                                kVar3 = kVar2;
                            }
                        } else {
                            if (i18 != 0) {
                                hVar3 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar3 = hVar2;
                            }
                            if (i13 != 0) {
                                z12 = true;
                            } else {
                                z12 = z11;
                            }
                            if ((i11 & 8) != 0) {
                                styleM531defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m531defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, c1086gP, 1572864, 63);
                                i12 &= -7169;
                            } else {
                                styleM531defaultStyleqUnfpCA = style2;
                            }
                            if (i15 != 0) {
                                c1086gP.L(-2091443309);
                                objF = c1086gP.f();
                                if (objF == InterfaceC1084f.a.f12980a) {
                                    objF = new androidx.compose.foundation.interaction.l();
                                    c1086gP.E(objF);
                                }
                                c1086gP.T(false);
                                hVar4 = hVar3;
                                z13 = z12;
                                style3 = styleM531defaultStyleqUnfpCA;
                                kVar3 = (androidx.compose.foundation.interaction.k) objF;
                            } else {
                                hVar4 = hVar3;
                                z13 = z12;
                                style3 = styleM531defaultStyleqUnfpCA;
                                kVar3 = kVar2;
                            }
                        }
                        c1086gP.U();
                        int i28 = i12 & 1022;
                        int i29 = i12 << 9;
                        CardKt.a(onClick, hVar4, z13, style3.getShape(), C1059k.a(style3.m538getBackgroundColor0d7_KjU(), style3.m539getContentColor0d7_KjU(), c1086gP, 0, 12), C1059k.b(style3.m540getElevationD9Ej5fM(), 62), style3.getBorder(), kVar3, content, c1086gP, i28 | (29360128 & i29) | (i29 & 234881024), 0);
                        hVar2 = hVar4;
                        z14 = z13;
                        style4 = style3;
                        kVar4 = kVar3;
                    } else {
                        c1086gP.r0();
                        if ((i10 & 1) == 0) {
                            if (i18 != 0) {
                                hVar3 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar3 = hVar2;
                            }
                            if (i13 != 0) {
                                z12 = true;
                            } else {
                                z12 = z11;
                            }
                            if ((i11 & 8) != 0) {
                                styleM531defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m531defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, c1086gP, 1572864, 63);
                                i12 &= -7169;
                            } else {
                                styleM531defaultStyleqUnfpCA = style2;
                            }
                            if (i15 != 0) {
                                c1086gP.L(-2091443309);
                                objF = c1086gP.f();
                                if (objF == InterfaceC1084f.a.f12980a) {
                                    objF = new androidx.compose.foundation.interaction.l();
                                    c1086gP.E(objF);
                                }
                                c1086gP.T(false);
                                hVar4 = hVar3;
                                z13 = z12;
                                style3 = styleM531defaultStyleqUnfpCA;
                                kVar3 = (androidx.compose.foundation.interaction.k) objF;
                            } else {
                                hVar4 = hVar3;
                                z13 = z12;
                                style3 = styleM531defaultStyleqUnfpCA;
                                kVar3 = kVar2;
                            }
                        } else {
                            if (i18 != 0) {
                                hVar3 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar3 = hVar2;
                            }
                            if (i13 != 0) {
                                z12 = true;
                            } else {
                                z12 = z11;
                            }
                            if ((i11 & 8) != 0) {
                                styleM531defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m531defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, c1086gP, 1572864, 63);
                                i12 &= -7169;
                            } else {
                                styleM531defaultStyleqUnfpCA = style2;
                            }
                            if (i15 != 0) {
                                c1086gP.L(-2091443309);
                                objF = c1086gP.f();
                                if (objF == InterfaceC1084f.a.f12980a) {
                                    objF = new androidx.compose.foundation.interaction.l();
                                    c1086gP.E(objF);
                                }
                                c1086gP.T(false);
                                hVar4 = hVar3;
                                z13 = z12;
                                style3 = styleM531defaultStyleqUnfpCA;
                                kVar3 = (androidx.compose.foundation.interaction.k) objF;
                            } else {
                                hVar4 = hVar3;
                                z13 = z12;
                                style3 = styleM531defaultStyleqUnfpCA;
                                kVar3 = kVar2;
                            }
                        }
                        c1086gP.U();
                        int i210 = i12 & 1022;
                        int i211 = i12 << 9;
                        CardKt.a(onClick, hVar4, z13, style3.getShape(), C1059k.a(style3.m538getBackgroundColor0d7_KjU(), style3.m539getContentColor0d7_KjU(), c1086gP, 0, 12), C1059k.b(style3.m540getElevationD9Ej5fM(), 62), style3.getBorder(), kVar3, content, c1086gP, i210 | (29360128 & i211) | (i211 & 234881024), 0);
                        hVar2 = hVar4;
                        z14 = z13;
                        style4 = style3;
                        kVar4 = kVar3;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.ui.component.l
                            @Override // Ia.p
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return IntercomCardKt.IntercomCard$lambda$2(onClick, hVar2, z14, style4, kVar4, content, i10, i11, (InterfaceC1084f) obj, iIntValue);
                            }
                        };
                    }
                }
                i17 = 196608;
                i12 |= i17;
                if ((374491 & i12) != 74898) {
                    c1086gP.r0();
                    if ((i10 & 1) == 0) {
                        if (i18 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if ((i11 & 8) != 0) {
                            styleM531defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m531defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, c1086gP, 1572864, 63);
                            i12 &= -7169;
                        } else {
                            styleM531defaultStyleqUnfpCA = style2;
                        }
                        if (i15 != 0) {
                            c1086gP.L(-2091443309);
                            objF = c1086gP.f();
                            if (objF == InterfaceC1084f.a.f12980a) {
                                objF = new androidx.compose.foundation.interaction.l();
                                c1086gP.E(objF);
                            }
                            c1086gP.T(false);
                            hVar4 = hVar3;
                            z13 = z12;
                            style3 = styleM531defaultStyleqUnfpCA;
                            kVar3 = (androidx.compose.foundation.interaction.k) objF;
                        } else {
                            hVar4 = hVar3;
                            z13 = z12;
                            style3 = styleM531defaultStyleqUnfpCA;
                            kVar3 = kVar2;
                        }
                    } else {
                        if (i18 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if ((i11 & 8) != 0) {
                            styleM531defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m531defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, c1086gP, 1572864, 63);
                            i12 &= -7169;
                        } else {
                            styleM531defaultStyleqUnfpCA = style2;
                        }
                        if (i15 != 0) {
                            c1086gP.L(-2091443309);
                            objF = c1086gP.f();
                            if (objF == InterfaceC1084f.a.f12980a) {
                                objF = new androidx.compose.foundation.interaction.l();
                                c1086gP.E(objF);
                            }
                            c1086gP.T(false);
                            hVar4 = hVar3;
                            z13 = z12;
                            style3 = styleM531defaultStyleqUnfpCA;
                            kVar3 = (androidx.compose.foundation.interaction.k) objF;
                        } else {
                            hVar4 = hVar3;
                            z13 = z12;
                            style3 = styleM531defaultStyleqUnfpCA;
                            kVar3 = kVar2;
                        }
                    }
                    c1086gP.U();
                    int i212 = i12 & 1022;
                    int i213 = i12 << 9;
                    CardKt.a(onClick, hVar4, z13, style3.getShape(), C1059k.a(style3.m538getBackgroundColor0d7_KjU(), style3.m539getContentColor0d7_KjU(), c1086gP, 0, 12), C1059k.b(style3.m540getElevationD9Ej5fM(), 62), style3.getBorder(), kVar3, content, c1086gP, i212 | (29360128 & i213) | (i213 & 234881024), 0);
                    hVar2 = hVar4;
                    z14 = z13;
                    style4 = style3;
                    kVar4 = kVar3;
                } else {
                    c1086gP.r0();
                    if ((i10 & 1) == 0) {
                        if (i18 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if ((i11 & 8) != 0) {
                            styleM531defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m531defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, c1086gP, 1572864, 63);
                            i12 &= -7169;
                        } else {
                            styleM531defaultStyleqUnfpCA = style2;
                        }
                        if (i15 != 0) {
                            c1086gP.L(-2091443309);
                            objF = c1086gP.f();
                            if (objF == InterfaceC1084f.a.f12980a) {
                                objF = new androidx.compose.foundation.interaction.l();
                                c1086gP.E(objF);
                            }
                            c1086gP.T(false);
                            hVar4 = hVar3;
                            z13 = z12;
                            style3 = styleM531defaultStyleqUnfpCA;
                            kVar3 = (androidx.compose.foundation.interaction.k) objF;
                        } else {
                            hVar4 = hVar3;
                            z13 = z12;
                            style3 = styleM531defaultStyleqUnfpCA;
                            kVar3 = kVar2;
                        }
                    } else {
                        if (i18 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if ((i11 & 8) != 0) {
                            styleM531defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m531defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, c1086gP, 1572864, 63);
                            i12 &= -7169;
                        } else {
                            styleM531defaultStyleqUnfpCA = style2;
                        }
                        if (i15 != 0) {
                            c1086gP.L(-2091443309);
                            objF = c1086gP.f();
                            if (objF == InterfaceC1084f.a.f12980a) {
                                objF = new androidx.compose.foundation.interaction.l();
                                c1086gP.E(objF);
                            }
                            c1086gP.T(false);
                            hVar4 = hVar3;
                            z13 = z12;
                            style3 = styleM531defaultStyleqUnfpCA;
                            kVar3 = (androidx.compose.foundation.interaction.k) objF;
                        } else {
                            hVar4 = hVar3;
                            z13 = z12;
                            style3 = styleM531defaultStyleqUnfpCA;
                            kVar3 = kVar2;
                        }
                    }
                    c1086gP.U();
                    int i214 = i12 & 1022;
                    int i215 = i12 << 9;
                    CardKt.a(onClick, hVar4, z13, style3.getShape(), C1059k.a(style3.m538getBackgroundColor0d7_KjU(), style3.m539getContentColor0d7_KjU(), c1086gP, 0, 12), C1059k.b(style3.m540getElevationD9Ej5fM(), 62), style3.getBorder(), kVar3, content, c1086gP, i214 | (29360128 & i215) | (i215 & 234881024), 0);
                    hVar2 = hVar4;
                    z14 = z13;
                    style4 = style3;
                    kVar4 = kVar3;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.ui.component.l
                        @Override // Ia.p
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return IntercomCardKt.IntercomCard$lambda$2(onClick, hVar2, z14, style4, kVar4, content, i10, i11, (InterfaceC1084f) obj, iIntValue);
                        }
                    };
                }
            }
            i12 |= 384;
            z11 = z10;
            if ((i10 & 7168) == 0) {
                if ((i11 & 8) == 0) {
                    style2 = style;
                    if (c1086gP.K(style2)) {
                    }
                    i12 |= i19;
                } else {
                    style2 = style;
                }
                i12 |= i19;
            } else {
                style2 = style;
            }
            i15 = i11 & 16;
            if (i15 != 0) {
                if ((57344 & i10) == 0) {
                    kVar2 = kVar;
                    if (c1086gP.K(kVar2)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i12 |= i16;
                }
                if ((i11 & 32) != 0) {
                    if ((458752 & i10) == 0) {
                        if (c1086gP.k(content)) {
                            i17 = 131072;
                        } else {
                            i17 = 65536;
                        }
                    }
                    if ((374491 & i12) != 74898) {
                        c1086gP.r0();
                        if ((i10 & 1) == 0) {
                            if (i18 != 0) {
                                hVar3 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar3 = hVar2;
                            }
                            if (i13 != 0) {
                                z12 = true;
                            } else {
                                z12 = z11;
                            }
                            if ((i11 & 8) != 0) {
                                styleM531defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m531defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, c1086gP, 1572864, 63);
                                i12 &= -7169;
                            } else {
                                styleM531defaultStyleqUnfpCA = style2;
                            }
                            if (i15 != 0) {
                                c1086gP.L(-2091443309);
                                objF = c1086gP.f();
                                if (objF == InterfaceC1084f.a.f12980a) {
                                    objF = new androidx.compose.foundation.interaction.l();
                                    c1086gP.E(objF);
                                }
                                c1086gP.T(false);
                                hVar4 = hVar3;
                                z13 = z12;
                                style3 = styleM531defaultStyleqUnfpCA;
                                kVar3 = (androidx.compose.foundation.interaction.k) objF;
                            } else {
                                hVar4 = hVar3;
                                z13 = z12;
                                style3 = styleM531defaultStyleqUnfpCA;
                                kVar3 = kVar2;
                            }
                        } else {
                            if (i18 != 0) {
                                hVar3 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar3 = hVar2;
                            }
                            if (i13 != 0) {
                                z12 = true;
                            } else {
                                z12 = z11;
                            }
                            if ((i11 & 8) != 0) {
                                styleM531defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m531defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, c1086gP, 1572864, 63);
                                i12 &= -7169;
                            } else {
                                styleM531defaultStyleqUnfpCA = style2;
                            }
                            if (i15 != 0) {
                                c1086gP.L(-2091443309);
                                objF = c1086gP.f();
                                if (objF == InterfaceC1084f.a.f12980a) {
                                    objF = new androidx.compose.foundation.interaction.l();
                                    c1086gP.E(objF);
                                }
                                c1086gP.T(false);
                                hVar4 = hVar3;
                                z13 = z12;
                                style3 = styleM531defaultStyleqUnfpCA;
                                kVar3 = (androidx.compose.foundation.interaction.k) objF;
                            } else {
                                hVar4 = hVar3;
                                z13 = z12;
                                style3 = styleM531defaultStyleqUnfpCA;
                                kVar3 = kVar2;
                            }
                        }
                        c1086gP.U();
                        int i216 = i12 & 1022;
                        int i217 = i12 << 9;
                        CardKt.a(onClick, hVar4, z13, style3.getShape(), C1059k.a(style3.m538getBackgroundColor0d7_KjU(), style3.m539getContentColor0d7_KjU(), c1086gP, 0, 12), C1059k.b(style3.m540getElevationD9Ej5fM(), 62), style3.getBorder(), kVar3, content, c1086gP, i216 | (29360128 & i217) | (i217 & 234881024), 0);
                        hVar2 = hVar4;
                        z14 = z13;
                        style4 = style3;
                        kVar4 = kVar3;
                    } else {
                        c1086gP.r0();
                        if ((i10 & 1) == 0) {
                            if (i18 != 0) {
                                hVar3 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar3 = hVar2;
                            }
                            if (i13 != 0) {
                                z12 = true;
                            } else {
                                z12 = z11;
                            }
                            if ((i11 & 8) != 0) {
                                styleM531defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m531defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, c1086gP, 1572864, 63);
                                i12 &= -7169;
                            } else {
                                styleM531defaultStyleqUnfpCA = style2;
                            }
                            if (i15 != 0) {
                                c1086gP.L(-2091443309);
                                objF = c1086gP.f();
                                if (objF == InterfaceC1084f.a.f12980a) {
                                    objF = new androidx.compose.foundation.interaction.l();
                                    c1086gP.E(objF);
                                }
                                c1086gP.T(false);
                                hVar4 = hVar3;
                                z13 = z12;
                                style3 = styleM531defaultStyleqUnfpCA;
                                kVar3 = (androidx.compose.foundation.interaction.k) objF;
                            } else {
                                hVar4 = hVar3;
                                z13 = z12;
                                style3 = styleM531defaultStyleqUnfpCA;
                                kVar3 = kVar2;
                            }
                        } else {
                            if (i18 != 0) {
                                hVar3 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar3 = hVar2;
                            }
                            if (i13 != 0) {
                                z12 = true;
                            } else {
                                z12 = z11;
                            }
                            if ((i11 & 8) != 0) {
                                styleM531defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m531defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, c1086gP, 1572864, 63);
                                i12 &= -7169;
                            } else {
                                styleM531defaultStyleqUnfpCA = style2;
                            }
                            if (i15 != 0) {
                                c1086gP.L(-2091443309);
                                objF = c1086gP.f();
                                if (objF == InterfaceC1084f.a.f12980a) {
                                    objF = new androidx.compose.foundation.interaction.l();
                                    c1086gP.E(objF);
                                }
                                c1086gP.T(false);
                                hVar4 = hVar3;
                                z13 = z12;
                                style3 = styleM531defaultStyleqUnfpCA;
                                kVar3 = (androidx.compose.foundation.interaction.k) objF;
                            } else {
                                hVar4 = hVar3;
                                z13 = z12;
                                style3 = styleM531defaultStyleqUnfpCA;
                                kVar3 = kVar2;
                            }
                        }
                        c1086gP.U();
                        int i218 = i12 & 1022;
                        int i219 = i12 << 9;
                        CardKt.a(onClick, hVar4, z13, style3.getShape(), C1059k.a(style3.m538getBackgroundColor0d7_KjU(), style3.m539getContentColor0d7_KjU(), c1086gP, 0, 12), C1059k.b(style3.m540getElevationD9Ej5fM(), 62), style3.getBorder(), kVar3, content, c1086gP, i218 | (29360128 & i219) | (i219 & 234881024), 0);
                        hVar2 = hVar4;
                        z14 = z13;
                        style4 = style3;
                        kVar4 = kVar3;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.ui.component.l
                            @Override // Ia.p
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return IntercomCardKt.IntercomCard$lambda$2(onClick, hVar2, z14, style4, kVar4, content, i10, i11, (InterfaceC1084f) obj, iIntValue);
                            }
                        };
                    }
                }
                i17 = 196608;
                i12 |= i17;
                if ((374491 & i12) != 74898) {
                    c1086gP.r0();
                    if ((i10 & 1) == 0) {
                        if (i18 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if ((i11 & 8) != 0) {
                            styleM531defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m531defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, c1086gP, 1572864, 63);
                            i12 &= -7169;
                        } else {
                            styleM531defaultStyleqUnfpCA = style2;
                        }
                        if (i15 != 0) {
                            c1086gP.L(-2091443309);
                            objF = c1086gP.f();
                            if (objF == InterfaceC1084f.a.f12980a) {
                                objF = new androidx.compose.foundation.interaction.l();
                                c1086gP.E(objF);
                            }
                            c1086gP.T(false);
                            hVar4 = hVar3;
                            z13 = z12;
                            style3 = styleM531defaultStyleqUnfpCA;
                            kVar3 = (androidx.compose.foundation.interaction.k) objF;
                        } else {
                            hVar4 = hVar3;
                            z13 = z12;
                            style3 = styleM531defaultStyleqUnfpCA;
                            kVar3 = kVar2;
                        }
                    } else {
                        if (i18 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if ((i11 & 8) != 0) {
                            styleM531defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m531defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, c1086gP, 1572864, 63);
                            i12 &= -7169;
                        } else {
                            styleM531defaultStyleqUnfpCA = style2;
                        }
                        if (i15 != 0) {
                            c1086gP.L(-2091443309);
                            objF = c1086gP.f();
                            if (objF == InterfaceC1084f.a.f12980a) {
                                objF = new androidx.compose.foundation.interaction.l();
                                c1086gP.E(objF);
                            }
                            c1086gP.T(false);
                            hVar4 = hVar3;
                            z13 = z12;
                            style3 = styleM531defaultStyleqUnfpCA;
                            kVar3 = (androidx.compose.foundation.interaction.k) objF;
                        } else {
                            hVar4 = hVar3;
                            z13 = z12;
                            style3 = styleM531defaultStyleqUnfpCA;
                            kVar3 = kVar2;
                        }
                    }
                    c1086gP.U();
                    int i2110 = i12 & 1022;
                    int i2111 = i12 << 9;
                    CardKt.a(onClick, hVar4, z13, style3.getShape(), C1059k.a(style3.m538getBackgroundColor0d7_KjU(), style3.m539getContentColor0d7_KjU(), c1086gP, 0, 12), C1059k.b(style3.m540getElevationD9Ej5fM(), 62), style3.getBorder(), kVar3, content, c1086gP, i2110 | (29360128 & i2111) | (i2111 & 234881024), 0);
                    hVar2 = hVar4;
                    z14 = z13;
                    style4 = style3;
                    kVar4 = kVar3;
                } else {
                    c1086gP.r0();
                    if ((i10 & 1) == 0) {
                        if (i18 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if ((i11 & 8) != 0) {
                            styleM531defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m531defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, c1086gP, 1572864, 63);
                            i12 &= -7169;
                        } else {
                            styleM531defaultStyleqUnfpCA = style2;
                        }
                        if (i15 != 0) {
                            c1086gP.L(-2091443309);
                            objF = c1086gP.f();
                            if (objF == InterfaceC1084f.a.f12980a) {
                                objF = new androidx.compose.foundation.interaction.l();
                                c1086gP.E(objF);
                            }
                            c1086gP.T(false);
                            hVar4 = hVar3;
                            z13 = z12;
                            style3 = styleM531defaultStyleqUnfpCA;
                            kVar3 = (androidx.compose.foundation.interaction.k) objF;
                        } else {
                            hVar4 = hVar3;
                            z13 = z12;
                            style3 = styleM531defaultStyleqUnfpCA;
                            kVar3 = kVar2;
                        }
                    } else {
                        if (i18 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if ((i11 & 8) != 0) {
                            styleM531defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m531defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, c1086gP, 1572864, 63);
                            i12 &= -7169;
                        } else {
                            styleM531defaultStyleqUnfpCA = style2;
                        }
                        if (i15 != 0) {
                            c1086gP.L(-2091443309);
                            objF = c1086gP.f();
                            if (objF == InterfaceC1084f.a.f12980a) {
                                objF = new androidx.compose.foundation.interaction.l();
                                c1086gP.E(objF);
                            }
                            c1086gP.T(false);
                            hVar4 = hVar3;
                            z13 = z12;
                            style3 = styleM531defaultStyleqUnfpCA;
                            kVar3 = (androidx.compose.foundation.interaction.k) objF;
                        } else {
                            hVar4 = hVar3;
                            z13 = z12;
                            style3 = styleM531defaultStyleqUnfpCA;
                            kVar3 = kVar2;
                        }
                    }
                    c1086gP.U();
                    int i2112 = i12 & 1022;
                    int i2113 = i12 << 9;
                    CardKt.a(onClick, hVar4, z13, style3.getShape(), C1059k.a(style3.m538getBackgroundColor0d7_KjU(), style3.m539getContentColor0d7_KjU(), c1086gP, 0, 12), C1059k.b(style3.m540getElevationD9Ej5fM(), 62), style3.getBorder(), kVar3, content, c1086gP, i2112 | (29360128 & i2113) | (i2113 & 234881024), 0);
                    hVar2 = hVar4;
                    z14 = z13;
                    style4 = style3;
                    kVar4 = kVar3;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.ui.component.l
                        @Override // Ia.p
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return IntercomCardKt.IntercomCard$lambda$2(onClick, hVar2, z14, style4, kVar4, content, i10, i11, (InterfaceC1084f) obj, iIntValue);
                        }
                    };
                }
            }
            i12 |= 24576;
            kVar2 = kVar;
            if ((i11 & 32) != 0) {
                if ((458752 & i10) == 0) {
                    if (c1086gP.k(content)) {
                        i17 = 131072;
                    } else {
                        i17 = 65536;
                    }
                }
                if ((374491 & i12) != 74898) {
                    c1086gP.r0();
                    if ((i10 & 1) == 0) {
                        if (i18 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if ((i11 & 8) != 0) {
                            styleM531defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m531defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, c1086gP, 1572864, 63);
                            i12 &= -7169;
                        } else {
                            styleM531defaultStyleqUnfpCA = style2;
                        }
                        if (i15 != 0) {
                            c1086gP.L(-2091443309);
                            objF = c1086gP.f();
                            if (objF == InterfaceC1084f.a.f12980a) {
                                objF = new androidx.compose.foundation.interaction.l();
                                c1086gP.E(objF);
                            }
                            c1086gP.T(false);
                            hVar4 = hVar3;
                            z13 = z12;
                            style3 = styleM531defaultStyleqUnfpCA;
                            kVar3 = (androidx.compose.foundation.interaction.k) objF;
                        } else {
                            hVar4 = hVar3;
                            z13 = z12;
                            style3 = styleM531defaultStyleqUnfpCA;
                            kVar3 = kVar2;
                        }
                    } else {
                        if (i18 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if ((i11 & 8) != 0) {
                            styleM531defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m531defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, c1086gP, 1572864, 63);
                            i12 &= -7169;
                        } else {
                            styleM531defaultStyleqUnfpCA = style2;
                        }
                        if (i15 != 0) {
                            c1086gP.L(-2091443309);
                            objF = c1086gP.f();
                            if (objF == InterfaceC1084f.a.f12980a) {
                                objF = new androidx.compose.foundation.interaction.l();
                                c1086gP.E(objF);
                            }
                            c1086gP.T(false);
                            hVar4 = hVar3;
                            z13 = z12;
                            style3 = styleM531defaultStyleqUnfpCA;
                            kVar3 = (androidx.compose.foundation.interaction.k) objF;
                        } else {
                            hVar4 = hVar3;
                            z13 = z12;
                            style3 = styleM531defaultStyleqUnfpCA;
                            kVar3 = kVar2;
                        }
                    }
                    c1086gP.U();
                    int i2114 = i12 & 1022;
                    int i2115 = i12 << 9;
                    CardKt.a(onClick, hVar4, z13, style3.getShape(), C1059k.a(style3.m538getBackgroundColor0d7_KjU(), style3.m539getContentColor0d7_KjU(), c1086gP, 0, 12), C1059k.b(style3.m540getElevationD9Ej5fM(), 62), style3.getBorder(), kVar3, content, c1086gP, i2114 | (29360128 & i2115) | (i2115 & 234881024), 0);
                    hVar2 = hVar4;
                    z14 = z13;
                    style4 = style3;
                    kVar4 = kVar3;
                } else {
                    c1086gP.r0();
                    if ((i10 & 1) == 0) {
                        if (i18 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if ((i11 & 8) != 0) {
                            styleM531defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m531defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, c1086gP, 1572864, 63);
                            i12 &= -7169;
                        } else {
                            styleM531defaultStyleqUnfpCA = style2;
                        }
                        if (i15 != 0) {
                            c1086gP.L(-2091443309);
                            objF = c1086gP.f();
                            if (objF == InterfaceC1084f.a.f12980a) {
                                objF = new androidx.compose.foundation.interaction.l();
                                c1086gP.E(objF);
                            }
                            c1086gP.T(false);
                            hVar4 = hVar3;
                            z13 = z12;
                            style3 = styleM531defaultStyleqUnfpCA;
                            kVar3 = (androidx.compose.foundation.interaction.k) objF;
                        } else {
                            hVar4 = hVar3;
                            z13 = z12;
                            style3 = styleM531defaultStyleqUnfpCA;
                            kVar3 = kVar2;
                        }
                    } else {
                        if (i18 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if ((i11 & 8) != 0) {
                            styleM531defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m531defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, c1086gP, 1572864, 63);
                            i12 &= -7169;
                        } else {
                            styleM531defaultStyleqUnfpCA = style2;
                        }
                        if (i15 != 0) {
                            c1086gP.L(-2091443309);
                            objF = c1086gP.f();
                            if (objF == InterfaceC1084f.a.f12980a) {
                                objF = new androidx.compose.foundation.interaction.l();
                                c1086gP.E(objF);
                            }
                            c1086gP.T(false);
                            hVar4 = hVar3;
                            z13 = z12;
                            style3 = styleM531defaultStyleqUnfpCA;
                            kVar3 = (androidx.compose.foundation.interaction.k) objF;
                        } else {
                            hVar4 = hVar3;
                            z13 = z12;
                            style3 = styleM531defaultStyleqUnfpCA;
                            kVar3 = kVar2;
                        }
                    }
                    c1086gP.U();
                    int i2116 = i12 & 1022;
                    int i2117 = i12 << 9;
                    CardKt.a(onClick, hVar4, z13, style3.getShape(), C1059k.a(style3.m538getBackgroundColor0d7_KjU(), style3.m539getContentColor0d7_KjU(), c1086gP, 0, 12), C1059k.b(style3.m540getElevationD9Ej5fM(), 62), style3.getBorder(), kVar3, content, c1086gP, i2116 | (29360128 & i2117) | (i2117 & 234881024), 0);
                    hVar2 = hVar4;
                    z14 = z13;
                    style4 = style3;
                    kVar4 = kVar3;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.ui.component.l
                        @Override // Ia.p
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return IntercomCardKt.IntercomCard$lambda$2(onClick, hVar2, z14, style4, kVar4, content, i10, i11, (InterfaceC1084f) obj, iIntValue);
                        }
                    };
                }
            }
            i17 = 196608;
            i12 |= i17;
            if ((374491 & i12) != 74898) {
                c1086gP.r0();
                if ((i10 & 1) == 0) {
                    if (i18 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if ((i11 & 8) != 0) {
                        styleM531defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m531defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, c1086gP, 1572864, 63);
                        i12 &= -7169;
                    } else {
                        styleM531defaultStyleqUnfpCA = style2;
                    }
                    if (i15 != 0) {
                        c1086gP.L(-2091443309);
                        objF = c1086gP.f();
                        if (objF == InterfaceC1084f.a.f12980a) {
                            objF = new androidx.compose.foundation.interaction.l();
                            c1086gP.E(objF);
                        }
                        c1086gP.T(false);
                        hVar4 = hVar3;
                        z13 = z12;
                        style3 = styleM531defaultStyleqUnfpCA;
                        kVar3 = (androidx.compose.foundation.interaction.k) objF;
                    } else {
                        hVar4 = hVar3;
                        z13 = z12;
                        style3 = styleM531defaultStyleqUnfpCA;
                        kVar3 = kVar2;
                    }
                } else {
                    if (i18 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if ((i11 & 8) != 0) {
                        styleM531defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m531defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, c1086gP, 1572864, 63);
                        i12 &= -7169;
                    } else {
                        styleM531defaultStyleqUnfpCA = style2;
                    }
                    if (i15 != 0) {
                        c1086gP.L(-2091443309);
                        objF = c1086gP.f();
                        if (objF == InterfaceC1084f.a.f12980a) {
                            objF = new androidx.compose.foundation.interaction.l();
                            c1086gP.E(objF);
                        }
                        c1086gP.T(false);
                        hVar4 = hVar3;
                        z13 = z12;
                        style3 = styleM531defaultStyleqUnfpCA;
                        kVar3 = (androidx.compose.foundation.interaction.k) objF;
                    } else {
                        hVar4 = hVar3;
                        z13 = z12;
                        style3 = styleM531defaultStyleqUnfpCA;
                        kVar3 = kVar2;
                    }
                }
                c1086gP.U();
                int i2118 = i12 & 1022;
                int i2119 = i12 << 9;
                CardKt.a(onClick, hVar4, z13, style3.getShape(), C1059k.a(style3.m538getBackgroundColor0d7_KjU(), style3.m539getContentColor0d7_KjU(), c1086gP, 0, 12), C1059k.b(style3.m540getElevationD9Ej5fM(), 62), style3.getBorder(), kVar3, content, c1086gP, i2118 | (29360128 & i2119) | (i2119 & 234881024), 0);
                hVar2 = hVar4;
                z14 = z13;
                style4 = style3;
                kVar4 = kVar3;
            } else {
                c1086gP.r0();
                if ((i10 & 1) == 0) {
                    if (i18 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if ((i11 & 8) != 0) {
                        styleM531defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m531defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, c1086gP, 1572864, 63);
                        i12 &= -7169;
                    } else {
                        styleM531defaultStyleqUnfpCA = style2;
                    }
                    if (i15 != 0) {
                        c1086gP.L(-2091443309);
                        objF = c1086gP.f();
                        if (objF == InterfaceC1084f.a.f12980a) {
                            objF = new androidx.compose.foundation.interaction.l();
                            c1086gP.E(objF);
                        }
                        c1086gP.T(false);
                        hVar4 = hVar3;
                        z13 = z12;
                        style3 = styleM531defaultStyleqUnfpCA;
                        kVar3 = (androidx.compose.foundation.interaction.k) objF;
                    } else {
                        hVar4 = hVar3;
                        z13 = z12;
                        style3 = styleM531defaultStyleqUnfpCA;
                        kVar3 = kVar2;
                    }
                } else {
                    if (i18 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if ((i11 & 8) != 0) {
                        styleM531defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m531defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, c1086gP, 1572864, 63);
                        i12 &= -7169;
                    } else {
                        styleM531defaultStyleqUnfpCA = style2;
                    }
                    if (i15 != 0) {
                        c1086gP.L(-2091443309);
                        objF = c1086gP.f();
                        if (objF == InterfaceC1084f.a.f12980a) {
                            objF = new androidx.compose.foundation.interaction.l();
                            c1086gP.E(objF);
                        }
                        c1086gP.T(false);
                        hVar4 = hVar3;
                        z13 = z12;
                        style3 = styleM531defaultStyleqUnfpCA;
                        kVar3 = (androidx.compose.foundation.interaction.k) objF;
                    } else {
                        hVar4 = hVar3;
                        z13 = z12;
                        style3 = styleM531defaultStyleqUnfpCA;
                        kVar3 = kVar2;
                    }
                }
                c1086gP.U();
                int i21110 = i12 & 1022;
                int i21111 = i12 << 9;
                CardKt.a(onClick, hVar4, z13, style3.getShape(), C1059k.a(style3.m538getBackgroundColor0d7_KjU(), style3.m539getContentColor0d7_KjU(), c1086gP, 0, 12), C1059k.b(style3.m540getElevationD9Ej5fM(), 62), style3.getBorder(), kVar3, content, c1086gP, i21110 | (29360128 & i21111) | (i21111 & 234881024), 0);
                hVar2 = hVar4;
                z14 = z13;
                style4 = style3;
                kVar4 = kVar3;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.ui.component.l
                    @Override // Ia.p
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return IntercomCardKt.IntercomCard$lambda$2(onClick, hVar2, z14, style4, kVar4, content, i10, i11, (InterfaceC1084f) obj, iIntValue);
                    }
                };
            }
        }
        i12 |= 48;
        hVar2 = hVar;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & 896) == 0) {
                z11 = z10;
                if (c1086gP.c(z11)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            if ((i10 & 7168) == 0) {
                if ((i11 & 8) == 0) {
                    style2 = style;
                    if (c1086gP.K(style2)) {
                    }
                    i12 |= i19;
                } else {
                    style2 = style;
                }
                i12 |= i19;
            } else {
                style2 = style;
            }
            i15 = i11 & 16;
            if (i15 != 0) {
                if ((57344 & i10) == 0) {
                    kVar2 = kVar;
                    if (c1086gP.K(kVar2)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i12 |= i16;
                }
                if ((i11 & 32) != 0) {
                    if ((458752 & i10) == 0) {
                        if (c1086gP.k(content)) {
                            i17 = 131072;
                        } else {
                            i17 = 65536;
                        }
                    }
                    if ((374491 & i12) != 74898) {
                        c1086gP.r0();
                        if ((i10 & 1) == 0) {
                            if (i18 != 0) {
                                hVar3 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar3 = hVar2;
                            }
                            if (i13 != 0) {
                                z12 = true;
                            } else {
                                z12 = z11;
                            }
                            if ((i11 & 8) != 0) {
                                styleM531defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m531defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, c1086gP, 1572864, 63);
                                i12 &= -7169;
                            } else {
                                styleM531defaultStyleqUnfpCA = style2;
                            }
                            if (i15 != 0) {
                                c1086gP.L(-2091443309);
                                objF = c1086gP.f();
                                if (objF == InterfaceC1084f.a.f12980a) {
                                    objF = new androidx.compose.foundation.interaction.l();
                                    c1086gP.E(objF);
                                }
                                c1086gP.T(false);
                                hVar4 = hVar3;
                                z13 = z12;
                                style3 = styleM531defaultStyleqUnfpCA;
                                kVar3 = (androidx.compose.foundation.interaction.k) objF;
                            } else {
                                hVar4 = hVar3;
                                z13 = z12;
                                style3 = styleM531defaultStyleqUnfpCA;
                                kVar3 = kVar2;
                            }
                        } else {
                            if (i18 != 0) {
                                hVar3 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar3 = hVar2;
                            }
                            if (i13 != 0) {
                                z12 = true;
                            } else {
                                z12 = z11;
                            }
                            if ((i11 & 8) != 0) {
                                styleM531defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m531defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, c1086gP, 1572864, 63);
                                i12 &= -7169;
                            } else {
                                styleM531defaultStyleqUnfpCA = style2;
                            }
                            if (i15 != 0) {
                                c1086gP.L(-2091443309);
                                objF = c1086gP.f();
                                if (objF == InterfaceC1084f.a.f12980a) {
                                    objF = new androidx.compose.foundation.interaction.l();
                                    c1086gP.E(objF);
                                }
                                c1086gP.T(false);
                                hVar4 = hVar3;
                                z13 = z12;
                                style3 = styleM531defaultStyleqUnfpCA;
                                kVar3 = (androidx.compose.foundation.interaction.k) objF;
                            } else {
                                hVar4 = hVar3;
                                z13 = z12;
                                style3 = styleM531defaultStyleqUnfpCA;
                                kVar3 = kVar2;
                            }
                        }
                        c1086gP.U();
                        int i21112 = i12 & 1022;
                        int i21113 = i12 << 9;
                        CardKt.a(onClick, hVar4, z13, style3.getShape(), C1059k.a(style3.m538getBackgroundColor0d7_KjU(), style3.m539getContentColor0d7_KjU(), c1086gP, 0, 12), C1059k.b(style3.m540getElevationD9Ej5fM(), 62), style3.getBorder(), kVar3, content, c1086gP, i21112 | (29360128 & i21113) | (i21113 & 234881024), 0);
                        hVar2 = hVar4;
                        z14 = z13;
                        style4 = style3;
                        kVar4 = kVar3;
                    } else {
                        c1086gP.r0();
                        if ((i10 & 1) == 0) {
                            if (i18 != 0) {
                                hVar3 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar3 = hVar2;
                            }
                            if (i13 != 0) {
                                z12 = true;
                            } else {
                                z12 = z11;
                            }
                            if ((i11 & 8) != 0) {
                                styleM531defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m531defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, c1086gP, 1572864, 63);
                                i12 &= -7169;
                            } else {
                                styleM531defaultStyleqUnfpCA = style2;
                            }
                            if (i15 != 0) {
                                c1086gP.L(-2091443309);
                                objF = c1086gP.f();
                                if (objF == InterfaceC1084f.a.f12980a) {
                                    objF = new androidx.compose.foundation.interaction.l();
                                    c1086gP.E(objF);
                                }
                                c1086gP.T(false);
                                hVar4 = hVar3;
                                z13 = z12;
                                style3 = styleM531defaultStyleqUnfpCA;
                                kVar3 = (androidx.compose.foundation.interaction.k) objF;
                            } else {
                                hVar4 = hVar3;
                                z13 = z12;
                                style3 = styleM531defaultStyleqUnfpCA;
                                kVar3 = kVar2;
                            }
                        } else {
                            if (i18 != 0) {
                                hVar3 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar3 = hVar2;
                            }
                            if (i13 != 0) {
                                z12 = true;
                            } else {
                                z12 = z11;
                            }
                            if ((i11 & 8) != 0) {
                                styleM531defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m531defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, c1086gP, 1572864, 63);
                                i12 &= -7169;
                            } else {
                                styleM531defaultStyleqUnfpCA = style2;
                            }
                            if (i15 != 0) {
                                c1086gP.L(-2091443309);
                                objF = c1086gP.f();
                                if (objF == InterfaceC1084f.a.f12980a) {
                                    objF = new androidx.compose.foundation.interaction.l();
                                    c1086gP.E(objF);
                                }
                                c1086gP.T(false);
                                hVar4 = hVar3;
                                z13 = z12;
                                style3 = styleM531defaultStyleqUnfpCA;
                                kVar3 = (androidx.compose.foundation.interaction.k) objF;
                            } else {
                                hVar4 = hVar3;
                                z13 = z12;
                                style3 = styleM531defaultStyleqUnfpCA;
                                kVar3 = kVar2;
                            }
                        }
                        c1086gP.U();
                        int i21114 = i12 & 1022;
                        int i21115 = i12 << 9;
                        CardKt.a(onClick, hVar4, z13, style3.getShape(), C1059k.a(style3.m538getBackgroundColor0d7_KjU(), style3.m539getContentColor0d7_KjU(), c1086gP, 0, 12), C1059k.b(style3.m540getElevationD9Ej5fM(), 62), style3.getBorder(), kVar3, content, c1086gP, i21114 | (29360128 & i21115) | (i21115 & 234881024), 0);
                        hVar2 = hVar4;
                        z14 = z13;
                        style4 = style3;
                        kVar4 = kVar3;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.ui.component.l
                            @Override // Ia.p
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return IntercomCardKt.IntercomCard$lambda$2(onClick, hVar2, z14, style4, kVar4, content, i10, i11, (InterfaceC1084f) obj, iIntValue);
                            }
                        };
                    }
                }
                i17 = 196608;
                i12 |= i17;
                if ((374491 & i12) != 74898) {
                    c1086gP.r0();
                    if ((i10 & 1) == 0) {
                        if (i18 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if ((i11 & 8) != 0) {
                            styleM531defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m531defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, c1086gP, 1572864, 63);
                            i12 &= -7169;
                        } else {
                            styleM531defaultStyleqUnfpCA = style2;
                        }
                        if (i15 != 0) {
                            c1086gP.L(-2091443309);
                            objF = c1086gP.f();
                            if (objF == InterfaceC1084f.a.f12980a) {
                                objF = new androidx.compose.foundation.interaction.l();
                                c1086gP.E(objF);
                            }
                            c1086gP.T(false);
                            hVar4 = hVar3;
                            z13 = z12;
                            style3 = styleM531defaultStyleqUnfpCA;
                            kVar3 = (androidx.compose.foundation.interaction.k) objF;
                        } else {
                            hVar4 = hVar3;
                            z13 = z12;
                            style3 = styleM531defaultStyleqUnfpCA;
                            kVar3 = kVar2;
                        }
                    } else {
                        if (i18 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if ((i11 & 8) != 0) {
                            styleM531defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m531defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, c1086gP, 1572864, 63);
                            i12 &= -7169;
                        } else {
                            styleM531defaultStyleqUnfpCA = style2;
                        }
                        if (i15 != 0) {
                            c1086gP.L(-2091443309);
                            objF = c1086gP.f();
                            if (objF == InterfaceC1084f.a.f12980a) {
                                objF = new androidx.compose.foundation.interaction.l();
                                c1086gP.E(objF);
                            }
                            c1086gP.T(false);
                            hVar4 = hVar3;
                            z13 = z12;
                            style3 = styleM531defaultStyleqUnfpCA;
                            kVar3 = (androidx.compose.foundation.interaction.k) objF;
                        } else {
                            hVar4 = hVar3;
                            z13 = z12;
                            style3 = styleM531defaultStyleqUnfpCA;
                            kVar3 = kVar2;
                        }
                    }
                    c1086gP.U();
                    int i21116 = i12 & 1022;
                    int i21117 = i12 << 9;
                    CardKt.a(onClick, hVar4, z13, style3.getShape(), C1059k.a(style3.m538getBackgroundColor0d7_KjU(), style3.m539getContentColor0d7_KjU(), c1086gP, 0, 12), C1059k.b(style3.m540getElevationD9Ej5fM(), 62), style3.getBorder(), kVar3, content, c1086gP, i21116 | (29360128 & i21117) | (i21117 & 234881024), 0);
                    hVar2 = hVar4;
                    z14 = z13;
                    style4 = style3;
                    kVar4 = kVar3;
                } else {
                    c1086gP.r0();
                    if ((i10 & 1) == 0) {
                        if (i18 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if ((i11 & 8) != 0) {
                            styleM531defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m531defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, c1086gP, 1572864, 63);
                            i12 &= -7169;
                        } else {
                            styleM531defaultStyleqUnfpCA = style2;
                        }
                        if (i15 != 0) {
                            c1086gP.L(-2091443309);
                            objF = c1086gP.f();
                            if (objF == InterfaceC1084f.a.f12980a) {
                                objF = new androidx.compose.foundation.interaction.l();
                                c1086gP.E(objF);
                            }
                            c1086gP.T(false);
                            hVar4 = hVar3;
                            z13 = z12;
                            style3 = styleM531defaultStyleqUnfpCA;
                            kVar3 = (androidx.compose.foundation.interaction.k) objF;
                        } else {
                            hVar4 = hVar3;
                            z13 = z12;
                            style3 = styleM531defaultStyleqUnfpCA;
                            kVar3 = kVar2;
                        }
                    } else {
                        if (i18 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if ((i11 & 8) != 0) {
                            styleM531defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m531defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, c1086gP, 1572864, 63);
                            i12 &= -7169;
                        } else {
                            styleM531defaultStyleqUnfpCA = style2;
                        }
                        if (i15 != 0) {
                            c1086gP.L(-2091443309);
                            objF = c1086gP.f();
                            if (objF == InterfaceC1084f.a.f12980a) {
                                objF = new androidx.compose.foundation.interaction.l();
                                c1086gP.E(objF);
                            }
                            c1086gP.T(false);
                            hVar4 = hVar3;
                            z13 = z12;
                            style3 = styleM531defaultStyleqUnfpCA;
                            kVar3 = (androidx.compose.foundation.interaction.k) objF;
                        } else {
                            hVar4 = hVar3;
                            z13 = z12;
                            style3 = styleM531defaultStyleqUnfpCA;
                            kVar3 = kVar2;
                        }
                    }
                    c1086gP.U();
                    int i21118 = i12 & 1022;
                    int i21119 = i12 << 9;
                    CardKt.a(onClick, hVar4, z13, style3.getShape(), C1059k.a(style3.m538getBackgroundColor0d7_KjU(), style3.m539getContentColor0d7_KjU(), c1086gP, 0, 12), C1059k.b(style3.m540getElevationD9Ej5fM(), 62), style3.getBorder(), kVar3, content, c1086gP, i21118 | (29360128 & i21119) | (i21119 & 234881024), 0);
                    hVar2 = hVar4;
                    z14 = z13;
                    style4 = style3;
                    kVar4 = kVar3;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.ui.component.l
                        @Override // Ia.p
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return IntercomCardKt.IntercomCard$lambda$2(onClick, hVar2, z14, style4, kVar4, content, i10, i11, (InterfaceC1084f) obj, iIntValue);
                        }
                    };
                }
            }
            i12 |= 24576;
            kVar2 = kVar;
            if ((i11 & 32) != 0) {
                if ((458752 & i10) == 0) {
                    if (c1086gP.k(content)) {
                        i17 = 131072;
                    } else {
                        i17 = 65536;
                    }
                }
                if ((374491 & i12) != 74898) {
                    c1086gP.r0();
                    if ((i10 & 1) == 0) {
                        if (i18 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if ((i11 & 8) != 0) {
                            styleM531defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m531defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, c1086gP, 1572864, 63);
                            i12 &= -7169;
                        } else {
                            styleM531defaultStyleqUnfpCA = style2;
                        }
                        if (i15 != 0) {
                            c1086gP.L(-2091443309);
                            objF = c1086gP.f();
                            if (objF == InterfaceC1084f.a.f12980a) {
                                objF = new androidx.compose.foundation.interaction.l();
                                c1086gP.E(objF);
                            }
                            c1086gP.T(false);
                            hVar4 = hVar3;
                            z13 = z12;
                            style3 = styleM531defaultStyleqUnfpCA;
                            kVar3 = (androidx.compose.foundation.interaction.k) objF;
                        } else {
                            hVar4 = hVar3;
                            z13 = z12;
                            style3 = styleM531defaultStyleqUnfpCA;
                            kVar3 = kVar2;
                        }
                    } else {
                        if (i18 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if ((i11 & 8) != 0) {
                            styleM531defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m531defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, c1086gP, 1572864, 63);
                            i12 &= -7169;
                        } else {
                            styleM531defaultStyleqUnfpCA = style2;
                        }
                        if (i15 != 0) {
                            c1086gP.L(-2091443309);
                            objF = c1086gP.f();
                            if (objF == InterfaceC1084f.a.f12980a) {
                                objF = new androidx.compose.foundation.interaction.l();
                                c1086gP.E(objF);
                            }
                            c1086gP.T(false);
                            hVar4 = hVar3;
                            z13 = z12;
                            style3 = styleM531defaultStyleqUnfpCA;
                            kVar3 = (androidx.compose.foundation.interaction.k) objF;
                        } else {
                            hVar4 = hVar3;
                            z13 = z12;
                            style3 = styleM531defaultStyleqUnfpCA;
                            kVar3 = kVar2;
                        }
                    }
                    c1086gP.U();
                    int i211110 = i12 & 1022;
                    int i211111 = i12 << 9;
                    CardKt.a(onClick, hVar4, z13, style3.getShape(), C1059k.a(style3.m538getBackgroundColor0d7_KjU(), style3.m539getContentColor0d7_KjU(), c1086gP, 0, 12), C1059k.b(style3.m540getElevationD9Ej5fM(), 62), style3.getBorder(), kVar3, content, c1086gP, i211110 | (29360128 & i211111) | (i211111 & 234881024), 0);
                    hVar2 = hVar4;
                    z14 = z13;
                    style4 = style3;
                    kVar4 = kVar3;
                } else {
                    c1086gP.r0();
                    if ((i10 & 1) == 0) {
                        if (i18 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if ((i11 & 8) != 0) {
                            styleM531defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m531defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, c1086gP, 1572864, 63);
                            i12 &= -7169;
                        } else {
                            styleM531defaultStyleqUnfpCA = style2;
                        }
                        if (i15 != 0) {
                            c1086gP.L(-2091443309);
                            objF = c1086gP.f();
                            if (objF == InterfaceC1084f.a.f12980a) {
                                objF = new androidx.compose.foundation.interaction.l();
                                c1086gP.E(objF);
                            }
                            c1086gP.T(false);
                            hVar4 = hVar3;
                            z13 = z12;
                            style3 = styleM531defaultStyleqUnfpCA;
                            kVar3 = (androidx.compose.foundation.interaction.k) objF;
                        } else {
                            hVar4 = hVar3;
                            z13 = z12;
                            style3 = styleM531defaultStyleqUnfpCA;
                            kVar3 = kVar2;
                        }
                    } else {
                        if (i18 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if ((i11 & 8) != 0) {
                            styleM531defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m531defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, c1086gP, 1572864, 63);
                            i12 &= -7169;
                        } else {
                            styleM531defaultStyleqUnfpCA = style2;
                        }
                        if (i15 != 0) {
                            c1086gP.L(-2091443309);
                            objF = c1086gP.f();
                            if (objF == InterfaceC1084f.a.f12980a) {
                                objF = new androidx.compose.foundation.interaction.l();
                                c1086gP.E(objF);
                            }
                            c1086gP.T(false);
                            hVar4 = hVar3;
                            z13 = z12;
                            style3 = styleM531defaultStyleqUnfpCA;
                            kVar3 = (androidx.compose.foundation.interaction.k) objF;
                        } else {
                            hVar4 = hVar3;
                            z13 = z12;
                            style3 = styleM531defaultStyleqUnfpCA;
                            kVar3 = kVar2;
                        }
                    }
                    c1086gP.U();
                    int i211112 = i12 & 1022;
                    int i211113 = i12 << 9;
                    CardKt.a(onClick, hVar4, z13, style3.getShape(), C1059k.a(style3.m538getBackgroundColor0d7_KjU(), style3.m539getContentColor0d7_KjU(), c1086gP, 0, 12), C1059k.b(style3.m540getElevationD9Ej5fM(), 62), style3.getBorder(), kVar3, content, c1086gP, i211112 | (29360128 & i211113) | (i211113 & 234881024), 0);
                    hVar2 = hVar4;
                    z14 = z13;
                    style4 = style3;
                    kVar4 = kVar3;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.ui.component.l
                        @Override // Ia.p
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return IntercomCardKt.IntercomCard$lambda$2(onClick, hVar2, z14, style4, kVar4, content, i10, i11, (InterfaceC1084f) obj, iIntValue);
                        }
                    };
                }
            }
            i17 = 196608;
            i12 |= i17;
            if ((374491 & i12) != 74898) {
                c1086gP.r0();
                if ((i10 & 1) == 0) {
                    if (i18 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if ((i11 & 8) != 0) {
                        styleM531defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m531defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, c1086gP, 1572864, 63);
                        i12 &= -7169;
                    } else {
                        styleM531defaultStyleqUnfpCA = style2;
                    }
                    if (i15 != 0) {
                        c1086gP.L(-2091443309);
                        objF = c1086gP.f();
                        if (objF == InterfaceC1084f.a.f12980a) {
                            objF = new androidx.compose.foundation.interaction.l();
                            c1086gP.E(objF);
                        }
                        c1086gP.T(false);
                        hVar4 = hVar3;
                        z13 = z12;
                        style3 = styleM531defaultStyleqUnfpCA;
                        kVar3 = (androidx.compose.foundation.interaction.k) objF;
                    } else {
                        hVar4 = hVar3;
                        z13 = z12;
                        style3 = styleM531defaultStyleqUnfpCA;
                        kVar3 = kVar2;
                    }
                } else {
                    if (i18 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if ((i11 & 8) != 0) {
                        styleM531defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m531defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, c1086gP, 1572864, 63);
                        i12 &= -7169;
                    } else {
                        styleM531defaultStyleqUnfpCA = style2;
                    }
                    if (i15 != 0) {
                        c1086gP.L(-2091443309);
                        objF = c1086gP.f();
                        if (objF == InterfaceC1084f.a.f12980a) {
                            objF = new androidx.compose.foundation.interaction.l();
                            c1086gP.E(objF);
                        }
                        c1086gP.T(false);
                        hVar4 = hVar3;
                        z13 = z12;
                        style3 = styleM531defaultStyleqUnfpCA;
                        kVar3 = (androidx.compose.foundation.interaction.k) objF;
                    } else {
                        hVar4 = hVar3;
                        z13 = z12;
                        style3 = styleM531defaultStyleqUnfpCA;
                        kVar3 = kVar2;
                    }
                }
                c1086gP.U();
                int i211114 = i12 & 1022;
                int i211115 = i12 << 9;
                CardKt.a(onClick, hVar4, z13, style3.getShape(), C1059k.a(style3.m538getBackgroundColor0d7_KjU(), style3.m539getContentColor0d7_KjU(), c1086gP, 0, 12), C1059k.b(style3.m540getElevationD9Ej5fM(), 62), style3.getBorder(), kVar3, content, c1086gP, i211114 | (29360128 & i211115) | (i211115 & 234881024), 0);
                hVar2 = hVar4;
                z14 = z13;
                style4 = style3;
                kVar4 = kVar3;
            } else {
                c1086gP.r0();
                if ((i10 & 1) == 0) {
                    if (i18 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if ((i11 & 8) != 0) {
                        styleM531defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m531defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, c1086gP, 1572864, 63);
                        i12 &= -7169;
                    } else {
                        styleM531defaultStyleqUnfpCA = style2;
                    }
                    if (i15 != 0) {
                        c1086gP.L(-2091443309);
                        objF = c1086gP.f();
                        if (objF == InterfaceC1084f.a.f12980a) {
                            objF = new androidx.compose.foundation.interaction.l();
                            c1086gP.E(objF);
                        }
                        c1086gP.T(false);
                        hVar4 = hVar3;
                        z13 = z12;
                        style3 = styleM531defaultStyleqUnfpCA;
                        kVar3 = (androidx.compose.foundation.interaction.k) objF;
                    } else {
                        hVar4 = hVar3;
                        z13 = z12;
                        style3 = styleM531defaultStyleqUnfpCA;
                        kVar3 = kVar2;
                    }
                } else {
                    if (i18 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if ((i11 & 8) != 0) {
                        styleM531defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m531defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, c1086gP, 1572864, 63);
                        i12 &= -7169;
                    } else {
                        styleM531defaultStyleqUnfpCA = style2;
                    }
                    if (i15 != 0) {
                        c1086gP.L(-2091443309);
                        objF = c1086gP.f();
                        if (objF == InterfaceC1084f.a.f12980a) {
                            objF = new androidx.compose.foundation.interaction.l();
                            c1086gP.E(objF);
                        }
                        c1086gP.T(false);
                        hVar4 = hVar3;
                        z13 = z12;
                        style3 = styleM531defaultStyleqUnfpCA;
                        kVar3 = (androidx.compose.foundation.interaction.k) objF;
                    } else {
                        hVar4 = hVar3;
                        z13 = z12;
                        style3 = styleM531defaultStyleqUnfpCA;
                        kVar3 = kVar2;
                    }
                }
                c1086gP.U();
                int i211116 = i12 & 1022;
                int i211117 = i12 << 9;
                CardKt.a(onClick, hVar4, z13, style3.getShape(), C1059k.a(style3.m538getBackgroundColor0d7_KjU(), style3.m539getContentColor0d7_KjU(), c1086gP, 0, 12), C1059k.b(style3.m540getElevationD9Ej5fM(), 62), style3.getBorder(), kVar3, content, c1086gP, i211116 | (29360128 & i211117) | (i211117 & 234881024), 0);
                hVar2 = hVar4;
                z14 = z13;
                style4 = style3;
                kVar4 = kVar3;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.ui.component.l
                    @Override // Ia.p
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return IntercomCardKt.IntercomCard$lambda$2(onClick, hVar2, z14, style4, kVar4, content, i10, i11, (InterfaceC1084f) obj, iIntValue);
                    }
                };
            }
        }
        i12 |= 384;
        z11 = z10;
        if ((i10 & 7168) == 0) {
            if ((i11 & 8) == 0) {
                style2 = style;
                if (c1086gP.K(style2)) {
                }
                i12 |= i19;
            } else {
                style2 = style;
            }
            i12 |= i19;
        } else {
            style2 = style;
        }
        i15 = i11 & 16;
        if (i15 != 0) {
            if ((57344 & i10) == 0) {
                kVar2 = kVar;
                if (c1086gP.K(kVar2)) {
                    i16 = 16384;
                } else {
                    i16 = 8192;
                }
                i12 |= i16;
            }
            if ((i11 & 32) != 0) {
                if ((458752 & i10) == 0) {
                    if (c1086gP.k(content)) {
                        i17 = 131072;
                    } else {
                        i17 = 65536;
                    }
                }
                if ((374491 & i12) != 74898) {
                    c1086gP.r0();
                    if ((i10 & 1) == 0) {
                        if (i18 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if ((i11 & 8) != 0) {
                            styleM531defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m531defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, c1086gP, 1572864, 63);
                            i12 &= -7169;
                        } else {
                            styleM531defaultStyleqUnfpCA = style2;
                        }
                        if (i15 != 0) {
                            c1086gP.L(-2091443309);
                            objF = c1086gP.f();
                            if (objF == InterfaceC1084f.a.f12980a) {
                                objF = new androidx.compose.foundation.interaction.l();
                                c1086gP.E(objF);
                            }
                            c1086gP.T(false);
                            hVar4 = hVar3;
                            z13 = z12;
                            style3 = styleM531defaultStyleqUnfpCA;
                            kVar3 = (androidx.compose.foundation.interaction.k) objF;
                        } else {
                            hVar4 = hVar3;
                            z13 = z12;
                            style3 = styleM531defaultStyleqUnfpCA;
                            kVar3 = kVar2;
                        }
                    } else {
                        if (i18 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if ((i11 & 8) != 0) {
                            styleM531defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m531defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, c1086gP, 1572864, 63);
                            i12 &= -7169;
                        } else {
                            styleM531defaultStyleqUnfpCA = style2;
                        }
                        if (i15 != 0) {
                            c1086gP.L(-2091443309);
                            objF = c1086gP.f();
                            if (objF == InterfaceC1084f.a.f12980a) {
                                objF = new androidx.compose.foundation.interaction.l();
                                c1086gP.E(objF);
                            }
                            c1086gP.T(false);
                            hVar4 = hVar3;
                            z13 = z12;
                            style3 = styleM531defaultStyleqUnfpCA;
                            kVar3 = (androidx.compose.foundation.interaction.k) objF;
                        } else {
                            hVar4 = hVar3;
                            z13 = z12;
                            style3 = styleM531defaultStyleqUnfpCA;
                            kVar3 = kVar2;
                        }
                    }
                    c1086gP.U();
                    int i211118 = i12 & 1022;
                    int i211119 = i12 << 9;
                    CardKt.a(onClick, hVar4, z13, style3.getShape(), C1059k.a(style3.m538getBackgroundColor0d7_KjU(), style3.m539getContentColor0d7_KjU(), c1086gP, 0, 12), C1059k.b(style3.m540getElevationD9Ej5fM(), 62), style3.getBorder(), kVar3, content, c1086gP, i211118 | (29360128 & i211119) | (i211119 & 234881024), 0);
                    hVar2 = hVar4;
                    z14 = z13;
                    style4 = style3;
                    kVar4 = kVar3;
                } else {
                    c1086gP.r0();
                    if ((i10 & 1) == 0) {
                        if (i18 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if ((i11 & 8) != 0) {
                            styleM531defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m531defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, c1086gP, 1572864, 63);
                            i12 &= -7169;
                        } else {
                            styleM531defaultStyleqUnfpCA = style2;
                        }
                        if (i15 != 0) {
                            c1086gP.L(-2091443309);
                            objF = c1086gP.f();
                            if (objF == InterfaceC1084f.a.f12980a) {
                                objF = new androidx.compose.foundation.interaction.l();
                                c1086gP.E(objF);
                            }
                            c1086gP.T(false);
                            hVar4 = hVar3;
                            z13 = z12;
                            style3 = styleM531defaultStyleqUnfpCA;
                            kVar3 = (androidx.compose.foundation.interaction.k) objF;
                        } else {
                            hVar4 = hVar3;
                            z13 = z12;
                            style3 = styleM531defaultStyleqUnfpCA;
                            kVar3 = kVar2;
                        }
                    } else {
                        if (i18 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if ((i11 & 8) != 0) {
                            styleM531defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m531defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, c1086gP, 1572864, 63);
                            i12 &= -7169;
                        } else {
                            styleM531defaultStyleqUnfpCA = style2;
                        }
                        if (i15 != 0) {
                            c1086gP.L(-2091443309);
                            objF = c1086gP.f();
                            if (objF == InterfaceC1084f.a.f12980a) {
                                objF = new androidx.compose.foundation.interaction.l();
                                c1086gP.E(objF);
                            }
                            c1086gP.T(false);
                            hVar4 = hVar3;
                            z13 = z12;
                            style3 = styleM531defaultStyleqUnfpCA;
                            kVar3 = (androidx.compose.foundation.interaction.k) objF;
                        } else {
                            hVar4 = hVar3;
                            z13 = z12;
                            style3 = styleM531defaultStyleqUnfpCA;
                            kVar3 = kVar2;
                        }
                    }
                    c1086gP.U();
                    int i2111110 = i12 & 1022;
                    int i2111111 = i12 << 9;
                    CardKt.a(onClick, hVar4, z13, style3.getShape(), C1059k.a(style3.m538getBackgroundColor0d7_KjU(), style3.m539getContentColor0d7_KjU(), c1086gP, 0, 12), C1059k.b(style3.m540getElevationD9Ej5fM(), 62), style3.getBorder(), kVar3, content, c1086gP, i2111110 | (29360128 & i2111111) | (i2111111 & 234881024), 0);
                    hVar2 = hVar4;
                    z14 = z13;
                    style4 = style3;
                    kVar4 = kVar3;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.ui.component.l
                        @Override // Ia.p
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return IntercomCardKt.IntercomCard$lambda$2(onClick, hVar2, z14, style4, kVar4, content, i10, i11, (InterfaceC1084f) obj, iIntValue);
                        }
                    };
                }
            }
            i17 = 196608;
            i12 |= i17;
            if ((374491 & i12) != 74898) {
                c1086gP.r0();
                if ((i10 & 1) == 0) {
                    if (i18 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if ((i11 & 8) != 0) {
                        styleM531defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m531defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, c1086gP, 1572864, 63);
                        i12 &= -7169;
                    } else {
                        styleM531defaultStyleqUnfpCA = style2;
                    }
                    if (i15 != 0) {
                        c1086gP.L(-2091443309);
                        objF = c1086gP.f();
                        if (objF == InterfaceC1084f.a.f12980a) {
                            objF = new androidx.compose.foundation.interaction.l();
                            c1086gP.E(objF);
                        }
                        c1086gP.T(false);
                        hVar4 = hVar3;
                        z13 = z12;
                        style3 = styleM531defaultStyleqUnfpCA;
                        kVar3 = (androidx.compose.foundation.interaction.k) objF;
                    } else {
                        hVar4 = hVar3;
                        z13 = z12;
                        style3 = styleM531defaultStyleqUnfpCA;
                        kVar3 = kVar2;
                    }
                } else {
                    if (i18 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if ((i11 & 8) != 0) {
                        styleM531defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m531defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, c1086gP, 1572864, 63);
                        i12 &= -7169;
                    } else {
                        styleM531defaultStyleqUnfpCA = style2;
                    }
                    if (i15 != 0) {
                        c1086gP.L(-2091443309);
                        objF = c1086gP.f();
                        if (objF == InterfaceC1084f.a.f12980a) {
                            objF = new androidx.compose.foundation.interaction.l();
                            c1086gP.E(objF);
                        }
                        c1086gP.T(false);
                        hVar4 = hVar3;
                        z13 = z12;
                        style3 = styleM531defaultStyleqUnfpCA;
                        kVar3 = (androidx.compose.foundation.interaction.k) objF;
                    } else {
                        hVar4 = hVar3;
                        z13 = z12;
                        style3 = styleM531defaultStyleqUnfpCA;
                        kVar3 = kVar2;
                    }
                }
                c1086gP.U();
                int i2111112 = i12 & 1022;
                int i2111113 = i12 << 9;
                CardKt.a(onClick, hVar4, z13, style3.getShape(), C1059k.a(style3.m538getBackgroundColor0d7_KjU(), style3.m539getContentColor0d7_KjU(), c1086gP, 0, 12), C1059k.b(style3.m540getElevationD9Ej5fM(), 62), style3.getBorder(), kVar3, content, c1086gP, i2111112 | (29360128 & i2111113) | (i2111113 & 234881024), 0);
                hVar2 = hVar4;
                z14 = z13;
                style4 = style3;
                kVar4 = kVar3;
            } else {
                c1086gP.r0();
                if ((i10 & 1) == 0) {
                    if (i18 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if ((i11 & 8) != 0) {
                        styleM531defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m531defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, c1086gP, 1572864, 63);
                        i12 &= -7169;
                    } else {
                        styleM531defaultStyleqUnfpCA = style2;
                    }
                    if (i15 != 0) {
                        c1086gP.L(-2091443309);
                        objF = c1086gP.f();
                        if (objF == InterfaceC1084f.a.f12980a) {
                            objF = new androidx.compose.foundation.interaction.l();
                            c1086gP.E(objF);
                        }
                        c1086gP.T(false);
                        hVar4 = hVar3;
                        z13 = z12;
                        style3 = styleM531defaultStyleqUnfpCA;
                        kVar3 = (androidx.compose.foundation.interaction.k) objF;
                    } else {
                        hVar4 = hVar3;
                        z13 = z12;
                        style3 = styleM531defaultStyleqUnfpCA;
                        kVar3 = kVar2;
                    }
                } else {
                    if (i18 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if ((i11 & 8) != 0) {
                        styleM531defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m531defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, c1086gP, 1572864, 63);
                        i12 &= -7169;
                    } else {
                        styleM531defaultStyleqUnfpCA = style2;
                    }
                    if (i15 != 0) {
                        c1086gP.L(-2091443309);
                        objF = c1086gP.f();
                        if (objF == InterfaceC1084f.a.f12980a) {
                            objF = new androidx.compose.foundation.interaction.l();
                            c1086gP.E(objF);
                        }
                        c1086gP.T(false);
                        hVar4 = hVar3;
                        z13 = z12;
                        style3 = styleM531defaultStyleqUnfpCA;
                        kVar3 = (androidx.compose.foundation.interaction.k) objF;
                    } else {
                        hVar4 = hVar3;
                        z13 = z12;
                        style3 = styleM531defaultStyleqUnfpCA;
                        kVar3 = kVar2;
                    }
                }
                c1086gP.U();
                int i2111114 = i12 & 1022;
                int i2111115 = i12 << 9;
                CardKt.a(onClick, hVar4, z13, style3.getShape(), C1059k.a(style3.m538getBackgroundColor0d7_KjU(), style3.m539getContentColor0d7_KjU(), c1086gP, 0, 12), C1059k.b(style3.m540getElevationD9Ej5fM(), 62), style3.getBorder(), kVar3, content, c1086gP, i2111114 | (29360128 & i2111115) | (i2111115 & 234881024), 0);
                hVar2 = hVar4;
                z14 = z13;
                style4 = style3;
                kVar4 = kVar3;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.ui.component.l
                    @Override // Ia.p
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return IntercomCardKt.IntercomCard$lambda$2(onClick, hVar2, z14, style4, kVar4, content, i10, i11, (InterfaceC1084f) obj, iIntValue);
                    }
                };
            }
        }
        i12 |= 24576;
        kVar2 = kVar;
        if ((i11 & 32) != 0) {
            if ((458752 & i10) == 0) {
                if (c1086gP.k(content)) {
                    i17 = 131072;
                } else {
                    i17 = 65536;
                }
            }
            if ((374491 & i12) != 74898) {
                c1086gP.r0();
                if ((i10 & 1) == 0) {
                    if (i18 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if ((i11 & 8) != 0) {
                        styleM531defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m531defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, c1086gP, 1572864, 63);
                        i12 &= -7169;
                    } else {
                        styleM531defaultStyleqUnfpCA = style2;
                    }
                    if (i15 != 0) {
                        c1086gP.L(-2091443309);
                        objF = c1086gP.f();
                        if (objF == InterfaceC1084f.a.f12980a) {
                            objF = new androidx.compose.foundation.interaction.l();
                            c1086gP.E(objF);
                        }
                        c1086gP.T(false);
                        hVar4 = hVar3;
                        z13 = z12;
                        style3 = styleM531defaultStyleqUnfpCA;
                        kVar3 = (androidx.compose.foundation.interaction.k) objF;
                    } else {
                        hVar4 = hVar3;
                        z13 = z12;
                        style3 = styleM531defaultStyleqUnfpCA;
                        kVar3 = kVar2;
                    }
                } else {
                    if (i18 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if ((i11 & 8) != 0) {
                        styleM531defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m531defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, c1086gP, 1572864, 63);
                        i12 &= -7169;
                    } else {
                        styleM531defaultStyleqUnfpCA = style2;
                    }
                    if (i15 != 0) {
                        c1086gP.L(-2091443309);
                        objF = c1086gP.f();
                        if (objF == InterfaceC1084f.a.f12980a) {
                            objF = new androidx.compose.foundation.interaction.l();
                            c1086gP.E(objF);
                        }
                        c1086gP.T(false);
                        hVar4 = hVar3;
                        z13 = z12;
                        style3 = styleM531defaultStyleqUnfpCA;
                        kVar3 = (androidx.compose.foundation.interaction.k) objF;
                    } else {
                        hVar4 = hVar3;
                        z13 = z12;
                        style3 = styleM531defaultStyleqUnfpCA;
                        kVar3 = kVar2;
                    }
                }
                c1086gP.U();
                int i2111116 = i12 & 1022;
                int i2111117 = i12 << 9;
                CardKt.a(onClick, hVar4, z13, style3.getShape(), C1059k.a(style3.m538getBackgroundColor0d7_KjU(), style3.m539getContentColor0d7_KjU(), c1086gP, 0, 12), C1059k.b(style3.m540getElevationD9Ej5fM(), 62), style3.getBorder(), kVar3, content, c1086gP, i2111116 | (29360128 & i2111117) | (i2111117 & 234881024), 0);
                hVar2 = hVar4;
                z14 = z13;
                style4 = style3;
                kVar4 = kVar3;
            } else {
                c1086gP.r0();
                if ((i10 & 1) == 0) {
                    if (i18 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if ((i11 & 8) != 0) {
                        styleM531defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m531defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, c1086gP, 1572864, 63);
                        i12 &= -7169;
                    } else {
                        styleM531defaultStyleqUnfpCA = style2;
                    }
                    if (i15 != 0) {
                        c1086gP.L(-2091443309);
                        objF = c1086gP.f();
                        if (objF == InterfaceC1084f.a.f12980a) {
                            objF = new androidx.compose.foundation.interaction.l();
                            c1086gP.E(objF);
                        }
                        c1086gP.T(false);
                        hVar4 = hVar3;
                        z13 = z12;
                        style3 = styleM531defaultStyleqUnfpCA;
                        kVar3 = (androidx.compose.foundation.interaction.k) objF;
                    } else {
                        hVar4 = hVar3;
                        z13 = z12;
                        style3 = styleM531defaultStyleqUnfpCA;
                        kVar3 = kVar2;
                    }
                } else {
                    if (i18 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if ((i11 & 8) != 0) {
                        styleM531defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m531defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, c1086gP, 1572864, 63);
                        i12 &= -7169;
                    } else {
                        styleM531defaultStyleqUnfpCA = style2;
                    }
                    if (i15 != 0) {
                        c1086gP.L(-2091443309);
                        objF = c1086gP.f();
                        if (objF == InterfaceC1084f.a.f12980a) {
                            objF = new androidx.compose.foundation.interaction.l();
                            c1086gP.E(objF);
                        }
                        c1086gP.T(false);
                        hVar4 = hVar3;
                        z13 = z12;
                        style3 = styleM531defaultStyleqUnfpCA;
                        kVar3 = (androidx.compose.foundation.interaction.k) objF;
                    } else {
                        hVar4 = hVar3;
                        z13 = z12;
                        style3 = styleM531defaultStyleqUnfpCA;
                        kVar3 = kVar2;
                    }
                }
                c1086gP.U();
                int i2111118 = i12 & 1022;
                int i2111119 = i12 << 9;
                CardKt.a(onClick, hVar4, z13, style3.getShape(), C1059k.a(style3.m538getBackgroundColor0d7_KjU(), style3.m539getContentColor0d7_KjU(), c1086gP, 0, 12), C1059k.b(style3.m540getElevationD9Ej5fM(), 62), style3.getBorder(), kVar3, content, c1086gP, i2111118 | (29360128 & i2111119) | (i2111119 & 234881024), 0);
                hVar2 = hVar4;
                z14 = z13;
                style4 = style3;
                kVar4 = kVar3;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.ui.component.l
                    @Override // Ia.p
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return IntercomCardKt.IntercomCard$lambda$2(onClick, hVar2, z14, style4, kVar4, content, i10, i11, (InterfaceC1084f) obj, iIntValue);
                    }
                };
            }
        }
        i17 = 196608;
        i12 |= i17;
        if ((374491 & i12) != 74898) {
            c1086gP.r0();
            if ((i10 & 1) == 0) {
                if (i18 != 0) {
                    hVar3 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar3 = hVar2;
                }
                if (i13 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if ((i11 & 8) != 0) {
                    styleM531defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m531defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, c1086gP, 1572864, 63);
                    i12 &= -7169;
                } else {
                    styleM531defaultStyleqUnfpCA = style2;
                }
                if (i15 != 0) {
                    c1086gP.L(-2091443309);
                    objF = c1086gP.f();
                    if (objF == InterfaceC1084f.a.f12980a) {
                        objF = new androidx.compose.foundation.interaction.l();
                        c1086gP.E(objF);
                    }
                    c1086gP.T(false);
                    hVar4 = hVar3;
                    z13 = z12;
                    style3 = styleM531defaultStyleqUnfpCA;
                    kVar3 = (androidx.compose.foundation.interaction.k) objF;
                } else {
                    hVar4 = hVar3;
                    z13 = z12;
                    style3 = styleM531defaultStyleqUnfpCA;
                    kVar3 = kVar2;
                }
            } else {
                if (i18 != 0) {
                    hVar3 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar3 = hVar2;
                }
                if (i13 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if ((i11 & 8) != 0) {
                    styleM531defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m531defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, c1086gP, 1572864, 63);
                    i12 &= -7169;
                } else {
                    styleM531defaultStyleqUnfpCA = style2;
                }
                if (i15 != 0) {
                    c1086gP.L(-2091443309);
                    objF = c1086gP.f();
                    if (objF == InterfaceC1084f.a.f12980a) {
                        objF = new androidx.compose.foundation.interaction.l();
                        c1086gP.E(objF);
                    }
                    c1086gP.T(false);
                    hVar4 = hVar3;
                    z13 = z12;
                    style3 = styleM531defaultStyleqUnfpCA;
                    kVar3 = (androidx.compose.foundation.interaction.k) objF;
                } else {
                    hVar4 = hVar3;
                    z13 = z12;
                    style3 = styleM531defaultStyleqUnfpCA;
                    kVar3 = kVar2;
                }
            }
            c1086gP.U();
            int i21111110 = i12 & 1022;
            int i21111111 = i12 << 9;
            CardKt.a(onClick, hVar4, z13, style3.getShape(), C1059k.a(style3.m538getBackgroundColor0d7_KjU(), style3.m539getContentColor0d7_KjU(), c1086gP, 0, 12), C1059k.b(style3.m540getElevationD9Ej5fM(), 62), style3.getBorder(), kVar3, content, c1086gP, i21111110 | (29360128 & i21111111) | (i21111111 & 234881024), 0);
            hVar2 = hVar4;
            z14 = z13;
            style4 = style3;
            kVar4 = kVar3;
        } else {
            c1086gP.r0();
            if ((i10 & 1) == 0) {
                if (i18 != 0) {
                    hVar3 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar3 = hVar2;
                }
                if (i13 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if ((i11 & 8) != 0) {
                    styleM531defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m531defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, c1086gP, 1572864, 63);
                    i12 &= -7169;
                } else {
                    styleM531defaultStyleqUnfpCA = style2;
                }
                if (i15 != 0) {
                    c1086gP.L(-2091443309);
                    objF = c1086gP.f();
                    if (objF == InterfaceC1084f.a.f12980a) {
                        objF = new androidx.compose.foundation.interaction.l();
                        c1086gP.E(objF);
                    }
                    c1086gP.T(false);
                    hVar4 = hVar3;
                    z13 = z12;
                    style3 = styleM531defaultStyleqUnfpCA;
                    kVar3 = (androidx.compose.foundation.interaction.k) objF;
                } else {
                    hVar4 = hVar3;
                    z13 = z12;
                    style3 = styleM531defaultStyleqUnfpCA;
                    kVar3 = kVar2;
                }
            } else {
                if (i18 != 0) {
                    hVar3 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar3 = hVar2;
                }
                if (i13 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if ((i11 & 8) != 0) {
                    styleM531defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m531defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, c1086gP, 1572864, 63);
                    i12 &= -7169;
                } else {
                    styleM531defaultStyleqUnfpCA = style2;
                }
                if (i15 != 0) {
                    c1086gP.L(-2091443309);
                    objF = c1086gP.f();
                    if (objF == InterfaceC1084f.a.f12980a) {
                        objF = new androidx.compose.foundation.interaction.l();
                        c1086gP.E(objF);
                    }
                    c1086gP.T(false);
                    hVar4 = hVar3;
                    z13 = z12;
                    style3 = styleM531defaultStyleqUnfpCA;
                    kVar3 = (androidx.compose.foundation.interaction.k) objF;
                } else {
                    hVar4 = hVar3;
                    z13 = z12;
                    style3 = styleM531defaultStyleqUnfpCA;
                    kVar3 = kVar2;
                }
            }
            c1086gP.U();
            int i21111112 = i12 & 1022;
            int i21111113 = i12 << 9;
            CardKt.a(onClick, hVar4, z13, style3.getShape(), C1059k.a(style3.m538getBackgroundColor0d7_KjU(), style3.m539getContentColor0d7_KjU(), c1086gP, 0, 12), C1059k.b(style3.m540getElevationD9Ej5fM(), 62), style3.getBorder(), kVar3, content, c1086gP, i21111112 | (29360128 & i21111113) | (i21111113 & 234881024), 0);
            hVar2 = hVar4;
            z14 = z13;
            style4 = style3;
            kVar4 = kVar3;
        }
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.ui.component.l
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return IntercomCardKt.IntercomCard$lambda$2(onClick, hVar2, z14, style4, kVar4, content, i10, i11, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }
}
