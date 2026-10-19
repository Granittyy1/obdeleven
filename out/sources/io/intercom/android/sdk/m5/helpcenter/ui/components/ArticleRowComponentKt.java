package io.intercom.android.sdk.m5.helpcenter.ui.components;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.C0945e;
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
import androidx.compose.ui.node.ComposeUiNode;
import androidx.navigation.compose.F;
import io.intercom.android.sdk.m5.components.C2287j0;
import io.intercom.android.sdk.m5.components.IntercomChevronKt;
import io.intercom.android.sdk.m5.conversation.ui.components.C2361j;
import io.intercom.android.sdk.m5.conversation.ui.components.row.z;
import io.intercom.android.sdk.m5.helpcenter.states.CollectionDetailsRow;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: ArticleRowComponent.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ArticleRowComponentKt {
    /* JADX WARN: Code duplicated, block: B:40:0x007a  */
    /* JADX WARN: Code duplicated, block: B:42:0x007e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0080  */
    /* JADX WARN: Code duplicated, block: B:45:0x0083  */
    /* JADX WARN: Code duplicated, block: B:46:0x008b  */
    /* JADX WARN: Code duplicated, block: B:49:0x009e  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:57:0x00af  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:63:0x0103  */
    /* JADX WARN: Code duplicated, block: B:66:0x0116  */
    /* JADX WARN: Code duplicated, block: B:68:0x0124  */
    /* JADX WARN: Code duplicated, block: B:72:0x014c  */
    /* JADX WARN: Code duplicated, block: B:76:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:78:? A[RETURN, SYNTHETIC] */
    public static final void ArticleRowComponent(androidx.compose.ui.h hVar, CollectionDetailsRow.ArticleRow articleRow, Ia.l<? super String, p293xa.r> lVar, InterfaceC1084f interfaceC1084f, int i10, int i11) {
        androidx.compose.ui.h hVar2;
        int i12;
        Ia.l<? super String, p293xa.r> lVar2;
        androidx.compose.ui.h.a aVar;
        androidx.compose.ui.h hVar3;
        Ia.l<? super String, p293xa.r> f10;
        boolean z10;
        boolean z11;
        boolean z12;
        Object objF;
        int i13;
        Ia.a<ComposeUiNode> aVar2;
        Ia.p<ComposeUiNode, Integer, p293xa.r> pVar;
        Ia.l<? super String, p293xa.r> lVar3;
        C1105p0 c1105p0V;
        kotlin.jvm.internal.i.e(articleRow, "articleRow");
        C1086g c1086gP = interfaceC1084f.p(1326302174);
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
            i12 |= c1086gP.K(articleRow) ? 32 : 16;
        }
        int i15 = i11 & 4;
        if (i15 == 0) {
            if ((i10 & 896) == 0) {
                lVar2 = lVar;
                i12 |= c1086gP.k(lVar2) ? 256 : 128;
            }
            if ((i12 & 731) == 146 || !c1086gP.s()) {
                aVar = androidx.compose.ui.h.a.f13984b;
                if (i14 != 0) {
                    hVar3 = aVar;
                } else {
                    hVar3 = hVar2;
                }
                if (i15 != 0) {
                    f10 = new F(1);
                } else {
                    f10 = lVar2;
                }
                androidx.compose.ui.h hVarD = W.d(hVar3, 1.0f);
                c1086gP.L(1587298991);
                if ((i12 & 896) == 256) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if ((i12 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                z12 = z11 | z10;
                objF = c1086gP.f();
                if (z12 || objF == InterfaceC1084f.a.f12980a) {
                    objF = new C2361j(f10, articleRow);
                    c1086gP.E(objF);
                }
                c1086gP.T(false);
                androidx.compose.ui.h hVarH = PaddingKt.h(PaddingKt.j(ClickableKt.c(hVarD, false, null, (Ia.a) objF, 7), 16, 0.0f, 0.0f, 0.0f, 14), 0.0f, 12, 1);
                T tA = S.a(C0945e.f10290g, androidx.compose.ui.d.a.f13344k, c1086gP, 54);
                i13 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
                androidx.compose.ui.h hVarC = ComposedModifierKt.c(c1086gP, hVarH);
                ComposeUiNode.f14331c0.getClass();
                aVar2 = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar2);
                } else {
                    c1086gP.A();
                }
                R0.a(ComposeUiNode.Companion.f14337f, c1086gP, tA);
                R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P);
                pVar = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i13))) {
                    J4.i.d(i13, c1086gP, i13, pVar);
                }
                R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC);
                String title = articleRow.getTitle();
                IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                int i16 = IntercomTheme.$stable;
                androidx.compose.ui.text.F type04Point5 = intercomTheme.getTypography(c1086gP, i16).getType04Point5();
                long jM645getPrimaryText0d7_KjU = intercomTheme.getColors(c1086gP, i16).m645getPrimaryText0d7_KjU();
                if (1.0f <= 0.0d) {
                    p258v.a.a("invalid weight; must be greater than zero");
                }
                TextKt.b(title, new LayoutWeightElement(true, Na.l.z(1.0f, Float.MAX_VALUE)), jM645getPrimaryText0d7_KjU, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, type04Point5, c1086gP, 0, 0, 65528);
                IntercomChevronKt.IntercomChevron(PaddingKt.h(aVar, 22, 0.0f, 2), c1086gP, 6, 0);
                c1086gP.T(true);
                lVar3 = f10;
            } else {
                c1086gP.w();
                hVar3 = hVar2;
                lVar3 = lVar2;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new io.intercom.android.sdk.m5.conversation.ui.components.W(hVar3, articleRow, lVar3, i10, i11, 1);
            }
        }
        i12 |= 384;
        lVar2 = lVar;
        if ((i12 & 731) == 146) {
            aVar = androidx.compose.ui.h.a.f13984b;
            if (i14 != 0) {
                hVar3 = aVar;
            } else {
                hVar3 = hVar2;
            }
            if (i15 != 0) {
                f10 = new F(1);
            } else {
                f10 = lVar2;
            }
            androidx.compose.ui.h hVarD2 = W.d(hVar3, 1.0f);
            c1086gP.L(1587298991);
            if ((i12 & 896) == 256) {
                z10 = true;
            } else {
                z10 = false;
            }
            if ((i12 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32) {
                z11 = true;
            } else {
                z11 = false;
            }
            z12 = z11 | z10;
            objF = c1086gP.f();
            if (z12) {
                objF = new C2361j(f10, articleRow);
                c1086gP.E(objF);
            } else {
                objF = new C2361j(f10, articleRow);
                c1086gP.E(objF);
            }
            c1086gP.T(false);
            androidx.compose.ui.h hVarH2 = PaddingKt.h(PaddingKt.j(ClickableKt.c(hVarD2, false, null, (Ia.a) objF, 7), 16, 0.0f, 0.0f, 0.0f, 14), 0.0f, 12, 1);
            T tA2 = S.a(C0945e.f10290g, androidx.compose.ui.d.a.f13344k, c1086gP, 54);
            i13 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P2 = c1086gP.P();
            androidx.compose.ui.h hVarC2 = ComposedModifierKt.c(c1086gP, hVarH2);
            ComposeUiNode.f14331c0.getClass();
            aVar2 = ComposeUiNode.Companion.f14333b;
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar2);
            } else {
                c1086gP.A();
            }
            R0.a(ComposeUiNode.Companion.f14337f, c1086gP, tA2);
            R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P2);
            pVar = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O) {
                J4.i.d(i13, c1086gP, i13, pVar);
            } else {
                J4.i.d(i13, c1086gP, i13, pVar);
            }
            R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC2);
            String title2 = articleRow.getTitle();
            IntercomTheme intercomTheme2 = IntercomTheme.INSTANCE;
            int i17 = IntercomTheme.$stable;
            androidx.compose.ui.text.F type04Point6 = intercomTheme2.getTypography(c1086gP, i17).getType04Point5();
            long jM645getPrimaryText0d7_KjU2 = intercomTheme2.getColors(c1086gP, i17).m645getPrimaryText0d7_KjU();
            if (1.0f <= 0.0d) {
                p258v.a.a("invalid weight; must be greater than zero");
            }
            TextKt.b(title2, new LayoutWeightElement(true, Na.l.z(1.0f, Float.MAX_VALUE)), jM645getPrimaryText0d7_KjU2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, type04Point6, c1086gP, 0, 0, 65528);
            IntercomChevronKt.IntercomChevron(PaddingKt.h(aVar, 22, 0.0f, 2), c1086gP, 6, 0);
            c1086gP.T(true);
            lVar3 = f10;
        } else {
            aVar = androidx.compose.ui.h.a.f13984b;
            if (i14 != 0) {
                hVar3 = aVar;
            } else {
                hVar3 = hVar2;
            }
            if (i15 != 0) {
                f10 = new F(1);
            } else {
                f10 = lVar2;
            }
            androidx.compose.ui.h hVarD3 = W.d(hVar3, 1.0f);
            c1086gP.L(1587298991);
            if ((i12 & 896) == 256) {
                z10 = true;
            } else {
                z10 = false;
            }
            if ((i12 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32) {
                z11 = true;
            } else {
                z11 = false;
            }
            z12 = z11 | z10;
            objF = c1086gP.f();
            if (z12) {
                objF = new C2361j(f10, articleRow);
                c1086gP.E(objF);
            } else {
                objF = new C2361j(f10, articleRow);
                c1086gP.E(objF);
            }
            c1086gP.T(false);
            androidx.compose.ui.h hVarH3 = PaddingKt.h(PaddingKt.j(ClickableKt.c(hVarD3, false, null, (Ia.a) objF, 7), 16, 0.0f, 0.0f, 0.0f, 14), 0.0f, 12, 1);
            T tA3 = S.a(C0945e.f10290g, androidx.compose.ui.d.a.f13344k, c1086gP, 54);
            i13 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P3 = c1086gP.P();
            androidx.compose.ui.h hVarC3 = ComposedModifierKt.c(c1086gP, hVarH3);
            ComposeUiNode.f14331c0.getClass();
            aVar2 = ComposeUiNode.Companion.f14333b;
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar2);
            } else {
                c1086gP.A();
            }
            R0.a(ComposeUiNode.Companion.f14337f, c1086gP, tA3);
            R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P3);
            pVar = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O) {
                J4.i.d(i13, c1086gP, i13, pVar);
            } else {
                J4.i.d(i13, c1086gP, i13, pVar);
            }
            R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC3);
            String title3 = articleRow.getTitle();
            IntercomTheme intercomTheme3 = IntercomTheme.INSTANCE;
            int i18 = IntercomTheme.$stable;
            androidx.compose.ui.text.F type04Point7 = intercomTheme3.getTypography(c1086gP, i18).getType04Point5();
            long jM645getPrimaryText0d7_KjU3 = intercomTheme3.getColors(c1086gP, i18).m645getPrimaryText0d7_KjU();
            if (1.0f <= 0.0d) {
                p258v.a.a("invalid weight; must be greater than zero");
            }
            TextKt.b(title3, new LayoutWeightElement(true, Na.l.z(1.0f, Float.MAX_VALUE)), jM645getPrimaryText0d7_KjU3, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, type04Point7, c1086gP, 0, 0, 65528);
            IntercomChevronKt.IntercomChevron(PaddingKt.h(aVar, 22, 0.0f, 2), c1086gP, 6, 0);
            c1086gP.T(true);
            lVar3 = f10;
        }
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new io.intercom.android.sdk.m5.conversation.ui.components.W(hVar3, articleRow, lVar3, i10, i11, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r ArticleRowComponent$lambda$0(String it) {
        kotlin.jvm.internal.i.e(it, "it");
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r ArticleRowComponent$lambda$2$lambda$1(Ia.l lVar, CollectionDetailsRow.ArticleRow articleRow) {
        kotlin.jvm.internal.i.e(articleRow, "$articleRow");
        lVar.invoke(articleRow.getId());
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r ArticleRowComponent$lambda$4(androidx.compose.ui.h hVar, CollectionDetailsRow.ArticleRow articleRow, Ia.l lVar, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        kotlin.jvm.internal.i.e(articleRow, "$articleRow");
        ArticleRowComponent(hVar, articleRow, lVar, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return p293xa.r.f47939a;
    }

    @IntercomPreviews
    private static final void ArticleRowComponentLongTextPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(2014154163);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ArticleRowComponentKt.INSTANCE.m276getLambda2$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new C2287j0(i10, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r ArticleRowComponentLongTextPreview$lambda$6(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        ArticleRowComponentLongTextPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    @IntercomPreviews
    private static final void ArticleRowComponentPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(761606012);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ArticleRowComponentKt.INSTANCE.m275getLambda1$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new z(i10, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r ArticleRowComponentPreview$lambda$5(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        ArticleRowComponentPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }
}
