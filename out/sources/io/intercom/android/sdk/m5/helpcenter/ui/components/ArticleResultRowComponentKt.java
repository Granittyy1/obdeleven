package io.intercom.android.sdk.m5.helpcenter.ui.components;

import android.content.Context;
import android.text.Spanned;
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
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.C1260a;
import androidx.compose.ui.text.v;
import io.intercom.android.sdk.helpcenter.search.ArticleSearchResultRow;
import io.intercom.android.sdk.helpcenter.search.HighlightTagHandler;
import io.intercom.android.sdk.m5.components.C2277e0;
import io.intercom.android.sdk.m5.components.IntercomChevronKt;
import io.intercom.android.sdk.survey.block.BlockExtensionsKt;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: ArticleResultRowComponent.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ArticleResultRowComponentKt {
    /* JADX WARN: Code duplicated, block: B:40:0x0078  */
    /* JADX WARN: Code duplicated, block: B:42:0x007c  */
    /* JADX WARN: Code duplicated, block: B:43:0x007e  */
    /* JADX WARN: Code duplicated, block: B:46:0x0091  */
    /* JADX WARN: Code duplicated, block: B:47:0x0093  */
    /* JADX WARN: Code duplicated, block: B:50:0x0098  */
    /* JADX WARN: Code duplicated, block: B:51:0x009a  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:59:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:63:0x0107  */
    /* JADX WARN: Code duplicated, block: B:65:0x0115  */
    /* JADX WARN: Code duplicated, block: B:69:0x0125  */
    /* JADX WARN: Code duplicated, block: B:72:0x0151  */
    /* JADX WARN: Code duplicated, block: B:73:0x0155  */
    /* JADX WARN: Code duplicated, block: B:76:0x0162  */
    /* JADX WARN: Code duplicated, block: B:78:0x0170  */
    /* JADX WARN: Code duplicated, block: B:81:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:85:0x0249  */
    /* JADX WARN: Code duplicated, block: B:89:0x026d  */
    /* JADX WARN: Code duplicated, block: B:91:? A[RETURN, SYNTHETIC] */
    public static final void ArticleResultRowComponent(final ArticleSearchResultRow.ArticleResultRow item, final Ia.l<? super String, p293xa.r> onClick, androidx.compose.ui.h hVar, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
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
        androidx.compose.ui.h hVar4;
        androidx.compose.ui.h hVar5;
        int i15;
        final androidx.compose.ui.h hVar6;
        C1105p0 c1105p0V;
        kotlin.jvm.internal.i.e(item, "item");
        kotlin.jvm.internal.i.e(onClick, "onClick");
        C1086g c1086gP = interfaceC1084f.p(-506618245);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (c1086gP.K(item) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i12 |= c1086gP.k(onClick) ? 32 : 16;
        }
        int i16 = i11 & 4;
        if (i16 == 0) {
            if ((i10 & 896) == 0) {
                hVar2 = hVar;
                i12 |= c1086gP.K(hVar2) ? 256 : 128;
            }
            if ((i12 & 731) == 146 || !c1086gP.s()) {
                aVar = androidx.compose.ui.h.a.f13984b;
                if (i16 != 0) {
                    hVar3 = aVar;
                } else {
                    hVar3 = hVar2;
                }
                androidx.compose.ui.h hVarD = W.d(hVar3, 1.0f);
                c1086gP.L(-866808730);
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
                    objF = new b(0, onClick, item);
                    c1086gP.E(objF);
                }
                c1086gP.T(false);
                float f10 = 16;
                androidx.compose.ui.h hVarJ = PaddingKt.j(PaddingKt.h(ClickableKt.c(hVarD, false, null, (Ia.a) objF, 7), 0.0f, f10, 1), f10, 0.0f, 0.0f, 0.0f, 14);
                T tA = S.a(C0945e.f10284a, androidx.compose.ui.d.a.f13344k, c1086gP, 48);
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
                R0.a(pVar2, c1086gP, tA);
                Ia.p<ComposeUiNode, androidx.compose.runtime.r, p293xa.r> pVar3 = ComposeUiNode.Companion.f14336e;
                R0.a(pVar3, c1086gP, interfaceC1089h0P);
                pVar = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i13))) {
                    J4.i.d(i13, c1086gP, i13, pVar);
                }
                Ia.p<ComposeUiNode, androidx.compose.ui.h, p293xa.r> pVar4 = ComposeUiNode.Companion.f14335d;
                R0.a(pVar4, c1086gP, hVarC);
                if (1.0f <= 0.0d) {
                    p258v.a.a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement = new LayoutWeightElement(true, Na.l.z(1.0f, Float.MAX_VALUE));
                C0953m c0953mA = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, c1086gP, 0);
                i14 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P2 = c1086gP.P();
                androidx.compose.ui.h hVarC2 = ComposedModifierKt.c(c1086gP, layoutWeightElement);
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar2);
                } else {
                    c1086gP.A();
                }
                R0.a(pVar2, c1086gP, c0953mA);
                R0.a(pVar3, c1086gP, interfaceC1089h0P2);
                if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i14))) {
                    J4.i.d(i14, c1086gP, i14, pVar);
                }
                R0.a(pVar4, c1086gP, hVarC2);
                Context context = (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b);
                C1260a annotatedString = BlockExtensionsKt.toAnnotatedString(highlightedText(item.getTitleText()), context, (2 & 2) != 0 ? new v(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, androidx.compose.ui.text.style.h.f15671c, null, 61439) : null);
                IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                int i17 = IntercomTheme.$stable;
                hVar4 = hVar3;
                TextKt.c(annotatedString, null, intercomTheme.getColors(c1086gP, i17).m645getPrimaryText0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 2, false, 0, 0, null, null, intercomTheme.getTypography(c1086gP, i17).getType04(), c1086gP, 0, 48, 129018);
                c1086gP.L(1612603933);
                if (item.getSummaryVisibility() == 0 || kotlin.text.n.S(item.getSummaryText())) {
                    hVar5 = hVar4;
                    i15 = 2;
                } else {
                    Lb.a.a(c1086gP, W.e(hVar4, 4));
                    hVar5 = hVar4;
                    i15 = 2;
                    TextKt.c(BlockExtensionsKt.toAnnotatedString(highlightedText(item.getSummaryText()), context, (2 & 2) != 0 ? new v(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, androidx.compose.ui.text.style.h.f15671c, null, 61439) : null), null, Q3.d.e(4286611584L), 0L, null, null, null, 0L, null, null, 0L, 2, false, 0, 0, null, null, intercomTheme.getTypography(c1086gP, i17).getType04Point5(), c1086gP, 384, 48, 129018);
                }
                c1086gP.T(false);
                c1086gP.T(true);
                IntercomChevronKt.IntercomChevron(PaddingKt.h(aVar, 22, 0.0f, i15), c1086gP, 6, 0);
                c1086gP.T(true);
                hVar6 = hVar5;
            } else {
                c1086gP.w();
                hVar6 = hVar2;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.c
                    @Override // Ia.p
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return ArticleResultRowComponentKt.ArticleResultRowComponent$lambda$4(item, onClick, hVar6, i10, i11, (InterfaceC1084f) obj, iIntValue);
                    }
                };
            }
        }
        i12 |= 384;
        hVar2 = hVar;
        if ((i12 & 731) == 146) {
            aVar = androidx.compose.ui.h.a.f13984b;
            if (i16 != 0) {
                hVar3 = aVar;
            } else {
                hVar3 = hVar2;
            }
            androidx.compose.ui.h hVarD2 = W.d(hVar3, 1.0f);
            c1086gP.L(-866808730);
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
                objF = new b(0, onClick, item);
                c1086gP.E(objF);
            } else {
                objF = new b(0, onClick, item);
                c1086gP.E(objF);
            }
            c1086gP.T(false);
            float f11 = 16;
            androidx.compose.ui.h hVarJ2 = PaddingKt.j(PaddingKt.h(ClickableKt.c(hVarD2, false, null, (Ia.a) objF, 7), 0.0f, f11, 1), f11, 0.0f, 0.0f, 0.0f, 14);
            T tA2 = S.a(C0945e.f10284a, androidx.compose.ui.d.a.f13344k, c1086gP, 48);
            i13 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P3 = c1086gP.P();
            androidx.compose.ui.h hVarC3 = ComposedModifierKt.c(c1086gP, hVarJ2);
            ComposeUiNode.f14331c0.getClass();
            aVar2 = ComposeUiNode.Companion.f14333b;
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar2);
            } else {
                c1086gP.A();
            }
            Ia.p<ComposeUiNode, E, p293xa.r> pVar5 = ComposeUiNode.Companion.f14337f;
            R0.a(pVar5, c1086gP, tA2);
            Ia.p<ComposeUiNode, androidx.compose.runtime.r, p293xa.r> pVar6 = ComposeUiNode.Companion.f14336e;
            R0.a(pVar6, c1086gP, interfaceC1089h0P3);
            pVar = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O) {
                J4.i.d(i13, c1086gP, i13, pVar);
            } else {
                J4.i.d(i13, c1086gP, i13, pVar);
            }
            Ia.p<ComposeUiNode, androidx.compose.ui.h, p293xa.r> pVar7 = ComposeUiNode.Companion.f14335d;
            R0.a(pVar7, c1086gP, hVarC3);
            if (1.0f <= 0.0d) {
                p258v.a.a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement2 = new LayoutWeightElement(true, Na.l.z(1.0f, Float.MAX_VALUE));
            C0953m c0953mA2 = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, c1086gP, 0);
            i14 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P4 = c1086gP.P();
            androidx.compose.ui.h hVarC4 = ComposedModifierKt.c(c1086gP, layoutWeightElement2);
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar2);
            } else {
                c1086gP.A();
            }
            R0.a(pVar5, c1086gP, c0953mA2);
            R0.a(pVar6, c1086gP, interfaceC1089h0P4);
            if (c1086gP.f12995O) {
                J4.i.d(i14, c1086gP, i14, pVar);
            } else {
                J4.i.d(i14, c1086gP, i14, pVar);
            }
            R0.a(pVar7, c1086gP, hVarC4);
            Context context2 = (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b);
            C1260a annotatedString2 = BlockExtensionsKt.toAnnotatedString(highlightedText(item.getTitleText()), context2, (2 & 2) != 0 ? new v(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, androidx.compose.ui.text.style.h.f15671c, null, 61439) : null);
            IntercomTheme intercomTheme2 = IntercomTheme.INSTANCE;
            int i18 = IntercomTheme.$stable;
            hVar4 = hVar3;
            TextKt.c(annotatedString2, null, intercomTheme2.getColors(c1086gP, i18).m645getPrimaryText0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 2, false, 0, 0, null, null, intercomTheme2.getTypography(c1086gP, i18).getType04(), c1086gP, 0, 48, 129018);
            c1086gP.L(1612603933);
            if (item.getSummaryVisibility() == 0) {
                hVar5 = hVar4;
                i15 = 2;
            } else {
                hVar5 = hVar4;
                i15 = 2;
            }
            c1086gP.T(false);
            c1086gP.T(true);
            IntercomChevronKt.IntercomChevron(PaddingKt.h(aVar, 22, 0.0f, i15), c1086gP, 6, 0);
            c1086gP.T(true);
            hVar6 = hVar5;
        } else {
            aVar = androidx.compose.ui.h.a.f13984b;
            if (i16 != 0) {
                hVar3 = aVar;
            } else {
                hVar3 = hVar2;
            }
            androidx.compose.ui.h hVarD3 = W.d(hVar3, 1.0f);
            c1086gP.L(-866808730);
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
                objF = new b(0, onClick, item);
                c1086gP.E(objF);
            } else {
                objF = new b(0, onClick, item);
                c1086gP.E(objF);
            }
            c1086gP.T(false);
            float f12 = 16;
            androidx.compose.ui.h hVarJ3 = PaddingKt.j(PaddingKt.h(ClickableKt.c(hVarD3, false, null, (Ia.a) objF, 7), 0.0f, f12, 1), f12, 0.0f, 0.0f, 0.0f, 14);
            T tA3 = S.a(C0945e.f10284a, androidx.compose.ui.d.a.f13344k, c1086gP, 48);
            i13 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P5 = c1086gP.P();
            androidx.compose.ui.h hVarC5 = ComposedModifierKt.c(c1086gP, hVarJ3);
            ComposeUiNode.f14331c0.getClass();
            aVar2 = ComposeUiNode.Companion.f14333b;
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar2);
            } else {
                c1086gP.A();
            }
            Ia.p<ComposeUiNode, E, p293xa.r> pVar8 = ComposeUiNode.Companion.f14337f;
            R0.a(pVar8, c1086gP, tA3);
            Ia.p<ComposeUiNode, androidx.compose.runtime.r, p293xa.r> pVar9 = ComposeUiNode.Companion.f14336e;
            R0.a(pVar9, c1086gP, interfaceC1089h0P5);
            pVar = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O) {
                J4.i.d(i13, c1086gP, i13, pVar);
            } else {
                J4.i.d(i13, c1086gP, i13, pVar);
            }
            Ia.p<ComposeUiNode, androidx.compose.ui.h, p293xa.r> pVar10 = ComposeUiNode.Companion.f14335d;
            R0.a(pVar10, c1086gP, hVarC5);
            if (1.0f <= 0.0d) {
                p258v.a.a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement3 = new LayoutWeightElement(true, Na.l.z(1.0f, Float.MAX_VALUE));
            C0953m c0953mA3 = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, c1086gP, 0);
            i14 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P6 = c1086gP.P();
            androidx.compose.ui.h hVarC6 = ComposedModifierKt.c(c1086gP, layoutWeightElement3);
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar2);
            } else {
                c1086gP.A();
            }
            R0.a(pVar8, c1086gP, c0953mA3);
            R0.a(pVar9, c1086gP, interfaceC1089h0P6);
            if (c1086gP.f12995O) {
                J4.i.d(i14, c1086gP, i14, pVar);
            } else {
                J4.i.d(i14, c1086gP, i14, pVar);
            }
            R0.a(pVar10, c1086gP, hVarC6);
            Context context3 = (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b);
            C1260a annotatedString3 = BlockExtensionsKt.toAnnotatedString(highlightedText(item.getTitleText()), context3, (2 & 2) != 0 ? new v(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, androidx.compose.ui.text.style.h.f15671c, null, 61439) : null);
            IntercomTheme intercomTheme3 = IntercomTheme.INSTANCE;
            int i19 = IntercomTheme.$stable;
            hVar4 = hVar3;
            TextKt.c(annotatedString3, null, intercomTheme3.getColors(c1086gP, i19).m645getPrimaryText0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 2, false, 0, 0, null, null, intercomTheme3.getTypography(c1086gP, i19).getType04(), c1086gP, 0, 48, 129018);
            c1086gP.L(1612603933);
            if (item.getSummaryVisibility() == 0) {
                hVar5 = hVar4;
                i15 = 2;
            } else {
                hVar5 = hVar4;
                i15 = 2;
            }
            c1086gP.T(false);
            c1086gP.T(true);
            IntercomChevronKt.IntercomChevron(PaddingKt.h(aVar, 22, 0.0f, i15), c1086gP, 6, 0);
            c1086gP.T(true);
            hVar6 = hVar5;
        }
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.c
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return ArticleResultRowComponentKt.ArticleResultRowComponent$lambda$4(item, onClick, hVar6, i10, i11, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r ArticleResultRowComponent$lambda$1$lambda$0(Ia.l onClick, ArticleSearchResultRow.ArticleResultRow item) {
        kotlin.jvm.internal.i.e(onClick, "$onClick");
        kotlin.jvm.internal.i.e(item, "$item");
        onClick.invoke(item.getId());
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r ArticleResultRowComponent$lambda$4(ArticleSearchResultRow.ArticleResultRow item, Ia.l onClick, androidx.compose.ui.h hVar, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        kotlin.jvm.internal.i.e(item, "$item");
        kotlin.jvm.internal.i.e(onClick, "$onClick");
        ArticleResultRowComponent(item, onClick, hVar, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return p293xa.r.f47939a;
    }

    @IntercomPreviews
    private static final void ArticleRowComponentPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(387759007);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ArticleResultRowComponentKt.INSTANCE.m274getLambda1$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new C2277e0(i10, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r ArticleRowComponentPreview$lambda$5(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        ArticleRowComponentPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    private static final Spanned highlightedText(String str) {
        Spanned spannedB = p307z0.b.b("&zwj;" + str, 0, null, new HighlightTagHandler());
        kotlin.jvm.internal.i.d(spannedB, "fromHtml(...)");
        return spannedB;
    }
}
