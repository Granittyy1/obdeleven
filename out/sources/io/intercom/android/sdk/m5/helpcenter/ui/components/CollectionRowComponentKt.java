package io.intercom.android.sdk.m5.helpcenter.ui.components;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.C0945e;
import androidx.compose.foundation.layout.C0952l;
import androidx.compose.foundation.layout.C0953m;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.S;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.W;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.R0;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.layout.E;
import androidx.compose.ui.node.ComposeUiNode;
import io.intercom.android.sdk.m5.components.C2270b;
import io.intercom.android.sdk.m5.components.C2272c;
import io.intercom.android.sdk.m5.components.IntercomChevronKt;
import io.intercom.android.sdk.m5.helpcenter.states.CollectionRowData;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.component.IntercomDividerKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: CollectionRowComponent.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class CollectionRowComponentKt {
    /* JADX WARN: Code duplicated, block: B:40:0x0078  */
    /* JADX WARN: Code duplicated, block: B:42:0x007c  */
    /* JADX WARN: Code duplicated, block: B:43:0x007e  */
    /* JADX WARN: Code duplicated, block: B:46:0x0090  */
    /* JADX WARN: Code duplicated, block: B:47:0x0092  */
    /* JADX WARN: Code duplicated, block: B:50:0x0097  */
    /* JADX WARN: Code duplicated, block: B:51:0x0099  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:59:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:60:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:63:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:65:0x010c  */
    /* JADX WARN: Code duplicated, block: B:68:0x012f  */
    /* JADX WARN: Code duplicated, block: B:69:0x0133  */
    /* JADX WARN: Code duplicated, block: B:72:0x0140  */
    /* JADX WARN: Code duplicated, block: B:74:0x014e  */
    /* JADX WARN: Code duplicated, block: B:78:0x015e  */
    /* JADX WARN: Code duplicated, block: B:81:0x0186  */
    /* JADX WARN: Code duplicated, block: B:82:0x018a  */
    /* JADX WARN: Code duplicated, block: B:85:0x0197  */
    /* JADX WARN: Code duplicated, block: B:87:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:90:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:93:0x0254  */
    /* JADX WARN: Code duplicated, block: B:97:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:99:? A[RETURN, SYNTHETIC] */
    public static final void CollectionRowComponent(final CollectionRowData rowData, final Ia.l<? super String, p293xa.r> onClick, androidx.compose.ui.h hVar, InterfaceC1084f interfaceC1084f, int i10, int i11) {
        int i12;
        androidx.compose.ui.h hVar2;
        androidx.compose.ui.h.a aVar;
        androidx.compose.ui.h hVar3;
        boolean z10;
        boolean z11;
        boolean z12;
        Object objF;
        int i13;
        Ia.a<ComposeUiNode> aVar2;
        Ia.p<ComposeUiNode, Integer, p293xa.r> pVar;
        int i14;
        int i15;
        int i16;
        androidx.compose.ui.h hVar4;
        C1105p0 c1105p0V;
        kotlin.jvm.internal.i.e(rowData, "rowData");
        kotlin.jvm.internal.i.e(onClick, "onClick");
        C1086g c1086gP = interfaceC1084f.p(-471072842);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (c1086gP.K(rowData) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i12 |= c1086gP.k(onClick) ? 32 : 16;
        }
        int i17 = i11 & 4;
        if (i17 == 0) {
            if ((i10 & 896) == 0) {
                hVar2 = hVar;
                i12 |= c1086gP.K(hVar2) ? 256 : 128;
            }
            if ((i12 & 731) == 146 || !c1086gP.s()) {
                aVar = androidx.compose.ui.h.a.f13984b;
                if (i17 != 0) {
                    hVar3 = aVar;
                } else {
                    hVar3 = hVar2;
                }
                androidx.compose.ui.h hVarD = W.d(hVar3, 1.0f);
                c1086gP.L(1498669980);
                if ((i12 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if ((i12 & 14) == 4) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                z12 = z11 | z10;
                objF = c1086gP.f();
                if (z12 || objF == InterfaceC1084f.a.f12980a) {
                    objF = new Ia.a() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.e
                        @Override // Ia.a
                        public final Object invoke() {
                            return CollectionRowComponentKt.CollectionRowComponent$lambda$1$lambda$0(onClick, rowData);
                        }
                    };
                    c1086gP.E(objF);
                }
                c1086gP.T(false);
                float f10 = 16;
                androidx.compose.ui.h hVarJ = PaddingKt.j(ClickableKt.c(hVarD, false, null, (Ia.a) objF, 7), f10, f10, 0.0f, 0.0f, 12);
                C0945e.k kVar = C0945e.f10286c;
                androidx.compose.ui.f.a aVar3 = androidx.compose.ui.d.a.f13346m;
                C0953m c0953mA = C0952l.a(kVar, aVar3, c1086gP, 0);
                i13 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
                androidx.compose.ui.h hVarC = ComposedModifierKt.c(c1086gP, hVarJ);
                ComposeUiNode.f14331c0.getClass();
                aVar2 = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar2);
                } else {
                    c1086gP.A();
                }
                Ia.p<ComposeUiNode, E, p293xa.r> pVar2 = ComposeUiNode.Companion.f14337f;
                R0.a(pVar2, c1086gP, c0953mA);
                Ia.p<ComposeUiNode, androidx.compose.runtime.r, p293xa.r> pVar3 = ComposeUiNode.Companion.f14336e;
                R0.a(pVar3, c1086gP, interfaceC1089h0P);
                pVar = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i13))) {
                    J4.i.d(i13, c1086gP, i13, pVar);
                }
                Ia.p<ComposeUiNode, androidx.compose.ui.h, p293xa.r> pVar4 = ComposeUiNode.Companion.f14335d;
                R0.a(pVar4, c1086gP, hVarC);
                T tA = S.a(C0945e.f10284a, androidx.compose.ui.d.a.f13344k, c1086gP, 48);
                i14 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P2 = c1086gP.P();
                androidx.compose.ui.h hVarC2 = ComposedModifierKt.c(c1086gP, aVar);
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar2);
                } else {
                    c1086gP.A();
                }
                R0.a(pVar2, c1086gP, tA);
                R0.a(pVar3, c1086gP, interfaceC1089h0P2);
                if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i14))) {
                    J4.i.d(i14, c1086gP, i14, pVar);
                }
                R0.a(pVar4, c1086gP, hVarC2);
                if (1.0f <= 0.0d) {
                    p258v.a.a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement = new LayoutWeightElement(true, Na.l.z(1.0f, Float.MAX_VALUE));
                C0953m c0953mA2 = C0952l.a(kVar, aVar3, c1086gP, 0);
                i15 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P3 = c1086gP.P();
                androidx.compose.ui.h hVarC3 = ComposedModifierKt.c(c1086gP, layoutWeightElement);
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar2);
                } else {
                    c1086gP.A();
                }
                R0.a(pVar2, c1086gP, c0953mA2);
                R0.a(pVar3, c1086gP, interfaceC1089h0P3);
                if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i15))) {
                    J4.i.d(i15, c1086gP, i15, pVar);
                }
                R0.a(pVar4, c1086gP, hVarC3);
                String titleText = rowData.getTitleText();
                IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                int i18 = IntercomTheme.$stable;
                androidx.compose.ui.h hVar5 = hVar3;
                TextKt.b(titleText, null, 0L, 0L, null, androidx.compose.ui.text.font.l.f15444i, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c1086gP, i18).getType04Point5(), c1086gP, 196608, 0, 65502);
                if (rowData.getDescriptionVisibility() == 0 || kotlin.text.n.S(rowData.getDescriptionText())) {
                    c1086gP.L(-515673200);
                    Lb.a.a(c1086gP, W.e(aVar, 4));
                    i16 = 0;
                    c1086gP.T(false);
                } else {
                    c1086gP.L(-516077564);
                    Lb.a.a(c1086gP, W.e(aVar, 4));
                    TextKt.b(rowData.getDescriptionText(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 3, 0, null, intercomTheme.getTypography(c1086gP, i18).getType04Point5(), c1086gP, 0, 3120, 55294);
                    Lb.a.a(c1086gP, W.e(aVar, 8));
                    c1086gP.T(false);
                    i16 = 0;
                }
                ArticleCountComponentKt.ArticleCountComponent(null, rowData.getArticlesCount(), c1086gP, i16, 1);
                c1086gP.T(true);
                IntercomChevronKt.IntercomChevron(PaddingKt.h(aVar, 22, 0.0f, 2), c1086gP, 6, i16);
                c1086gP.T(true);
                IntercomDividerKt.IntercomDivider(PaddingKt.j(aVar, 0.0f, f10, f10, 0.0f, 9), c1086gP, 6, 0);
                c1086gP.T(true);
                hVar4 = hVar5;
            } else {
                c1086gP.w();
                hVar4 = hVar2;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new io.intercom.android.sdk.m5.conversation.ui.components.row.E(rowData, onClick, hVar4, i10, i11);
            }
        }
        i12 |= 384;
        hVar2 = hVar;
        if ((i12 & 731) == 146) {
            aVar = androidx.compose.ui.h.a.f13984b;
            if (i17 != 0) {
                hVar3 = aVar;
            } else {
                hVar3 = hVar2;
            }
            androidx.compose.ui.h hVarD2 = W.d(hVar3, 1.0f);
            c1086gP.L(1498669980);
            if ((i12 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32) {
                z10 = true;
            } else {
                z10 = false;
            }
            if ((i12 & 14) == 4) {
                z11 = true;
            } else {
                z11 = false;
            }
            z12 = z11 | z10;
            objF = c1086gP.f();
            if (z12) {
                objF = new Ia.a() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.e
                    @Override // Ia.a
                    public final Object invoke() {
                        return CollectionRowComponentKt.CollectionRowComponent$lambda$1$lambda$0(onClick, rowData);
                    }
                };
                c1086gP.E(objF);
            } else {
                objF = new Ia.a() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.e
                    @Override // Ia.a
                    public final Object invoke() {
                        return CollectionRowComponentKt.CollectionRowComponent$lambda$1$lambda$0(onClick, rowData);
                    }
                };
                c1086gP.E(objF);
            }
            c1086gP.T(false);
            float f11 = 16;
            androidx.compose.ui.h hVarJ2 = PaddingKt.j(ClickableKt.c(hVarD2, false, null, (Ia.a) objF, 7), f11, f11, 0.0f, 0.0f, 12);
            C0945e.k kVar2 = C0945e.f10286c;
            androidx.compose.ui.f.a aVar4 = androidx.compose.ui.d.a.f13346m;
            C0953m c0953mA3 = C0952l.a(kVar2, aVar4, c1086gP, 0);
            i13 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P4 = c1086gP.P();
            androidx.compose.ui.h hVarC4 = ComposedModifierKt.c(c1086gP, hVarJ2);
            ComposeUiNode.f14331c0.getClass();
            aVar2 = ComposeUiNode.Companion.f14333b;
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar2);
            } else {
                c1086gP.A();
            }
            Ia.p<ComposeUiNode, E, p293xa.r> pVar5 = ComposeUiNode.Companion.f14337f;
            R0.a(pVar5, c1086gP, c0953mA3);
            Ia.p<ComposeUiNode, androidx.compose.runtime.r, p293xa.r> pVar6 = ComposeUiNode.Companion.f14336e;
            R0.a(pVar6, c1086gP, interfaceC1089h0P4);
            pVar = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O) {
                J4.i.d(i13, c1086gP, i13, pVar);
            } else {
                J4.i.d(i13, c1086gP, i13, pVar);
            }
            Ia.p<ComposeUiNode, androidx.compose.ui.h, p293xa.r> pVar7 = ComposeUiNode.Companion.f14335d;
            R0.a(pVar7, c1086gP, hVarC4);
            T tA2 = S.a(C0945e.f10284a, androidx.compose.ui.d.a.f13344k, c1086gP, 48);
            i14 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P5 = c1086gP.P();
            androidx.compose.ui.h hVarC5 = ComposedModifierKt.c(c1086gP, aVar);
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar2);
            } else {
                c1086gP.A();
            }
            R0.a(pVar5, c1086gP, tA2);
            R0.a(pVar6, c1086gP, interfaceC1089h0P5);
            if (c1086gP.f12995O) {
                J4.i.d(i14, c1086gP, i14, pVar);
            } else {
                J4.i.d(i14, c1086gP, i14, pVar);
            }
            R0.a(pVar7, c1086gP, hVarC5);
            if (1.0f <= 0.0d) {
                p258v.a.a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement2 = new LayoutWeightElement(true, Na.l.z(1.0f, Float.MAX_VALUE));
            C0953m c0953mA4 = C0952l.a(kVar2, aVar4, c1086gP, 0);
            i15 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P6 = c1086gP.P();
            androidx.compose.ui.h hVarC6 = ComposedModifierKt.c(c1086gP, layoutWeightElement2);
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar2);
            } else {
                c1086gP.A();
            }
            R0.a(pVar5, c1086gP, c0953mA4);
            R0.a(pVar6, c1086gP, interfaceC1089h0P6);
            if (c1086gP.f12995O) {
                J4.i.d(i15, c1086gP, i15, pVar);
            } else {
                J4.i.d(i15, c1086gP, i15, pVar);
            }
            R0.a(pVar7, c1086gP, hVarC6);
            String titleText2 = rowData.getTitleText();
            IntercomTheme intercomTheme2 = IntercomTheme.INSTANCE;
            int i19 = IntercomTheme.$stable;
            androidx.compose.ui.h hVar6 = hVar3;
            TextKt.b(titleText2, null, 0L, 0L, null, androidx.compose.ui.text.font.l.f15444i, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme2.getTypography(c1086gP, i19).getType04Point5(), c1086gP, 196608, 0, 65502);
            if (rowData.getDescriptionVisibility() == 0) {
                c1086gP.L(-515673200);
                Lb.a.a(c1086gP, W.e(aVar, 4));
                i16 = 0;
                c1086gP.T(false);
            } else {
                c1086gP.L(-515673200);
                Lb.a.a(c1086gP, W.e(aVar, 4));
                i16 = 0;
                c1086gP.T(false);
            }
            ArticleCountComponentKt.ArticleCountComponent(null, rowData.getArticlesCount(), c1086gP, i16, 1);
            c1086gP.T(true);
            IntercomChevronKt.IntercomChevron(PaddingKt.h(aVar, 22, 0.0f, 2), c1086gP, 6, i16);
            c1086gP.T(true);
            IntercomDividerKt.IntercomDivider(PaddingKt.j(aVar, 0.0f, f11, f11, 0.0f, 9), c1086gP, 6, 0);
            c1086gP.T(true);
            hVar4 = hVar6;
        } else {
            aVar = androidx.compose.ui.h.a.f13984b;
            if (i17 != 0) {
                hVar3 = aVar;
            } else {
                hVar3 = hVar2;
            }
            androidx.compose.ui.h hVarD3 = W.d(hVar3, 1.0f);
            c1086gP.L(1498669980);
            if ((i12 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32) {
                z10 = true;
            } else {
                z10 = false;
            }
            if ((i12 & 14) == 4) {
                z11 = true;
            } else {
                z11 = false;
            }
            z12 = z11 | z10;
            objF = c1086gP.f();
            if (z12) {
                objF = new Ia.a() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.e
                    @Override // Ia.a
                    public final Object invoke() {
                        return CollectionRowComponentKt.CollectionRowComponent$lambda$1$lambda$0(onClick, rowData);
                    }
                };
                c1086gP.E(objF);
            } else {
                objF = new Ia.a() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.e
                    @Override // Ia.a
                    public final Object invoke() {
                        return CollectionRowComponentKt.CollectionRowComponent$lambda$1$lambda$0(onClick, rowData);
                    }
                };
                c1086gP.E(objF);
            }
            c1086gP.T(false);
            float f12 = 16;
            androidx.compose.ui.h hVarJ3 = PaddingKt.j(ClickableKt.c(hVarD3, false, null, (Ia.a) objF, 7), f12, f12, 0.0f, 0.0f, 12);
            C0945e.k kVar3 = C0945e.f10286c;
            androidx.compose.ui.f.a aVar5 = androidx.compose.ui.d.a.f13346m;
            C0953m c0953mA5 = C0952l.a(kVar3, aVar5, c1086gP, 0);
            i13 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P7 = c1086gP.P();
            androidx.compose.ui.h hVarC7 = ComposedModifierKt.c(c1086gP, hVarJ3);
            ComposeUiNode.f14331c0.getClass();
            aVar2 = ComposeUiNode.Companion.f14333b;
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar2);
            } else {
                c1086gP.A();
            }
            Ia.p<ComposeUiNode, E, p293xa.r> pVar8 = ComposeUiNode.Companion.f14337f;
            R0.a(pVar8, c1086gP, c0953mA5);
            Ia.p<ComposeUiNode, androidx.compose.runtime.r, p293xa.r> pVar9 = ComposeUiNode.Companion.f14336e;
            R0.a(pVar9, c1086gP, interfaceC1089h0P7);
            pVar = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O) {
                J4.i.d(i13, c1086gP, i13, pVar);
            } else {
                J4.i.d(i13, c1086gP, i13, pVar);
            }
            Ia.p<ComposeUiNode, androidx.compose.ui.h, p293xa.r> pVar10 = ComposeUiNode.Companion.f14335d;
            R0.a(pVar10, c1086gP, hVarC7);
            T tA3 = S.a(C0945e.f10284a, androidx.compose.ui.d.a.f13344k, c1086gP, 48);
            i14 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P8 = c1086gP.P();
            androidx.compose.ui.h hVarC8 = ComposedModifierKt.c(c1086gP, aVar);
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar2);
            } else {
                c1086gP.A();
            }
            R0.a(pVar8, c1086gP, tA3);
            R0.a(pVar9, c1086gP, interfaceC1089h0P8);
            if (c1086gP.f12995O) {
                J4.i.d(i14, c1086gP, i14, pVar);
            } else {
                J4.i.d(i14, c1086gP, i14, pVar);
            }
            R0.a(pVar10, c1086gP, hVarC8);
            if (1.0f <= 0.0d) {
                p258v.a.a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement3 = new LayoutWeightElement(true, Na.l.z(1.0f, Float.MAX_VALUE));
            C0953m c0953mA6 = C0952l.a(kVar3, aVar5, c1086gP, 0);
            i15 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P9 = c1086gP.P();
            androidx.compose.ui.h hVarC9 = ComposedModifierKt.c(c1086gP, layoutWeightElement3);
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar2);
            } else {
                c1086gP.A();
            }
            R0.a(pVar8, c1086gP, c0953mA6);
            R0.a(pVar9, c1086gP, interfaceC1089h0P9);
            if (c1086gP.f12995O) {
                J4.i.d(i15, c1086gP, i15, pVar);
            } else {
                J4.i.d(i15, c1086gP, i15, pVar);
            }
            R0.a(pVar10, c1086gP, hVarC9);
            String titleText3 = rowData.getTitleText();
            IntercomTheme intercomTheme3 = IntercomTheme.INSTANCE;
            int i110 = IntercomTheme.$stable;
            androidx.compose.ui.h hVar7 = hVar3;
            TextKt.b(titleText3, null, 0L, 0L, null, androidx.compose.ui.text.font.l.f15444i, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme3.getTypography(c1086gP, i110).getType04Point5(), c1086gP, 196608, 0, 65502);
            if (rowData.getDescriptionVisibility() == 0) {
                c1086gP.L(-515673200);
                Lb.a.a(c1086gP, W.e(aVar, 4));
                i16 = 0;
                c1086gP.T(false);
            } else {
                c1086gP.L(-515673200);
                Lb.a.a(c1086gP, W.e(aVar, 4));
                i16 = 0;
                c1086gP.T(false);
            }
            ArticleCountComponentKt.ArticleCountComponent(null, rowData.getArticlesCount(), c1086gP, i16, 1);
            c1086gP.T(true);
            IntercomChevronKt.IntercomChevron(PaddingKt.h(aVar, 22, 0.0f, 2), c1086gP, 6, i16);
            c1086gP.T(true);
            IntercomDividerKt.IntercomDivider(PaddingKt.j(aVar, 0.0f, f12, f12, 0.0f, 9), c1086gP, 6, 0);
            c1086gP.T(true);
            hVar4 = hVar7;
        }
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new io.intercom.android.sdk.m5.conversation.ui.components.row.E(rowData, onClick, hVar4, i10, i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r CollectionRowComponent$lambda$1$lambda$0(Ia.l onClick, CollectionRowData rowData) {
        kotlin.jvm.internal.i.e(onClick, "$onClick");
        kotlin.jvm.internal.i.e(rowData, "$rowData");
        onClick.invoke(rowData.getId());
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r CollectionRowComponent$lambda$5(CollectionRowData rowData, Ia.l onClick, androidx.compose.ui.h hVar, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        kotlin.jvm.internal.i.e(rowData, "$rowData");
        kotlin.jvm.internal.i.e(onClick, "$onClick");
        CollectionRowComponent(rowData, onClick, hVar, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return p293xa.r.f47939a;
    }

    @IntercomPreviews
    public static final void RowPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(2042373209);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$CollectionRowComponentKt.INSTANCE.m281getLambda2$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new C2272c(i10, 5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r RowPreview$lambda$6(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        RowPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    @IntercomPreviews
    public static final void RowWithNoDescriptionPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(-613238090);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$CollectionRowComponentKt.INSTANCE.m283getLambda4$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new C2270b(i10, 5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r RowWithNoDescriptionPreview$lambda$7(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        RowWithNoDescriptionPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }
}
