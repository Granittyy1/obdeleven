package io.intercom.android.sdk.m5.conversation.ui.components.composer;

import android.content.Context;
import android.text.Spanned;
import androidx.compose.foundation.C0932d;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.C0945e;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.VerticalAlignElement;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.R0;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.C1260a;
import io.intercom.android.sdk.m5.components.C2293m0;
import io.intercom.android.sdk.survey.block.BlockExtensionsKt;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: PrivacyPolicy.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class PrivacyPolicyKt {
    /* JADX WARN: Code duplicated, block: B:26:0x004a  */
    /* JADX WARN: Code duplicated, block: B:28:0x004f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:32:0x005b  */
    /* JADX WARN: Code duplicated, block: B:33:0x005e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    /* JADX WARN: Code duplicated, block: B:41:0x0075  */
    /* JADX WARN: Code duplicated, block: B:43:0x0079  */
    /* JADX WARN: Code duplicated, block: B:44:0x007b  */
    /* JADX WARN: Code duplicated, block: B:46:0x007e  */
    /* JADX WARN: Code duplicated, block: B:47:0x0086  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:56:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:60:0x0121  */
    /* JADX WARN: Code duplicated, block: B:64:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:66:? A[RETURN, SYNTHETIC] */
    public static final void PrivacyPolicy(String text, androidx.compose.ui.h hVar, Ia.a<p293xa.r> aVar, InterfaceC1084f interfaceC1084f, int i10, int i11) {
        int i12;
        androidx.compose.ui.h hVar2;
        int i13;
        Ia.a<p293xa.r> aVar2;
        int i14;
        androidx.compose.ui.h.a aVar3;
        androidx.compose.ui.h hVar3;
        Ia.a<p293xa.r> aVar4;
        int i15;
        Ia.a<ComposeUiNode> aVar5;
        Ia.p<ComposeUiNode, Integer, p293xa.r> pVar;
        Ia.a<p293xa.r> aVar6;
        androidx.compose.ui.h hVar4;
        C1105p0 c1105p0V;
        kotlin.jvm.internal.i.e(text, "text");
        C1086g c1086gP = interfaceC1084f.p(-2047732965);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (c1086gP.K(text) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i16 = i11 & 2;
        if (i16 == 0) {
            if ((i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
                hVar2 = hVar;
                i12 |= c1086gP.K(hVar2) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & 896) == 0) {
                    aVar2 = aVar;
                    if (c1086gP.k(aVar2)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                if ((i12 & 731) == 146 || !c1086gP.s()) {
                    aVar3 = androidx.compose.ui.h.a.f13984b;
                    if (i16 != 0) {
                        hVar3 = aVar3;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (i13 != 0) {
                        aVar4 = new Z0.a(2);
                    } else {
                        aVar4 = aVar2;
                    }
                    IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                    int i17 = IntercomTheme.$stable;
                    p270w.a aVar7 = intercomTheme.getShapes(c1086gP, i17).f12430b;
                    C0945e.g gVar = C0945e.f10290g;
                    androidx.compose.ui.h hVarG = androidx.compose.foundation.layout.W.g(PaddingKt.g(16, 12, C0932d.b(androidx.compose.foundation.layout.W.d(hVar3, 1.0f), intercomTheme.getColors(c1086gP, i17).m624getBubbleBackground0d7_KjU(), aVar7)), 0.0f, 70, 1);
                    androidx.compose.foundation.layout.T tA = androidx.compose.foundation.layout.S.a(gVar, androidx.compose.ui.d.a.j, c1086gP, 6);
                    i15 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
                    androidx.compose.ui.h hVarC = ComposedModifierKt.c(c1086gP, hVarG);
                    ComposeUiNode.f14331c0.getClass();
                    aVar5 = ComposeUiNode.Companion.f14333b;
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar5);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(ComposeUiNode.Companion.f14337f, c1086gP, tA);
                    R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P);
                    pVar = ComposeUiNode.Companion.f14338g;
                    if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i15))) {
                        J4.i.d(i15, c1086gP, i15, pVar);
                    }
                    R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC);
                    Spanned spannedA = p307z0.b.a(text, 0);
                    kotlin.jvm.internal.i.d(spannedA, "fromHtml(...)");
                    C1260a annotatedString = BlockExtensionsKt.toAnnotatedString(spannedA, (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b), (2 & 2) != 0 ? new androidx.compose.ui.text.v(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, androidx.compose.ui.text.style.h.f15671c, null, 61439) : null);
                    if (1.0f <= 0.0d) {
                        p258v.a.a("invalid weight; must be greater than zero");
                    }
                    Ia.a<p293xa.r> aVar8 = aVar4;
                    TextKt.c(annotatedString, ScrollKt.b(new LayoutWeightElement(true, Na.l.z(1.0f, Float.MAX_VALUE)), ScrollKt.a(0, c1086gP, 0, 1), false, 14), intercomTheme.getColors(c1086gP, i17).m630getDescriptionText0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, intercomTheme.getTypography(c1086gP, i17).getType05(), c1086gP, 0, 0, 131064);
                    Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.q(aVar3, 8));
                    IconKt.a(U.c.a(io.intercom.android.sdk.R.drawable.intercom_close, c1086gP, 0), S4.o.p(c1086gP, io.intercom.android.sdk.R.string.intercom_close), ClickableKt.c(androidx.compose.foundation.layout.W.m(aVar3, 10).i(new VerticalAlignElement(androidx.compose.ui.d.a.f13344k)), false, null, aVar8, 7), intercomTheme.getColors(c1086gP, i17).m630getDescriptionText0d7_KjU(), c1086gP, 8, 0);
                    c1086gP.T(true);
                    aVar6 = aVar8;
                    hVar4 = hVar3;
                } else {
                    c1086gP.w();
                    hVar4 = hVar2;
                    aVar6 = aVar2;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Z(text, hVar4, aVar6, i10, i11);
                }
            }
            i12 |= 384;
            aVar2 = aVar;
            if ((i12 & 731) == 146) {
                aVar3 = androidx.compose.ui.h.a.f13984b;
                if (i16 != 0) {
                    hVar3 = aVar3;
                } else {
                    hVar3 = hVar2;
                }
                if (i13 != 0) {
                    aVar4 = new Z0.a(2);
                } else {
                    aVar4 = aVar2;
                }
                IntercomTheme intercomTheme2 = IntercomTheme.INSTANCE;
                int i18 = IntercomTheme.$stable;
                p270w.a aVar9 = intercomTheme2.getShapes(c1086gP, i18).f12430b;
                C0945e.g gVar2 = C0945e.f10290g;
                androidx.compose.ui.h hVarG2 = androidx.compose.foundation.layout.W.g(PaddingKt.g(16, 12, C0932d.b(androidx.compose.foundation.layout.W.d(hVar3, 1.0f), intercomTheme2.getColors(c1086gP, i18).m624getBubbleBackground0d7_KjU(), aVar9)), 0.0f, 70, 1);
                androidx.compose.foundation.layout.T tA2 = androidx.compose.foundation.layout.S.a(gVar2, androidx.compose.ui.d.a.j, c1086gP, 6);
                i15 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P2 = c1086gP.P();
                androidx.compose.ui.h hVarC2 = ComposedModifierKt.c(c1086gP, hVarG2);
                ComposeUiNode.f14331c0.getClass();
                aVar5 = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar5);
                } else {
                    c1086gP.A();
                }
                R0.a(ComposeUiNode.Companion.f14337f, c1086gP, tA2);
                R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P2);
                pVar = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O) {
                    J4.i.d(i15, c1086gP, i15, pVar);
                } else {
                    J4.i.d(i15, c1086gP, i15, pVar);
                }
                R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC2);
                Spanned spannedA2 = p307z0.b.a(text, 0);
                kotlin.jvm.internal.i.d(spannedA2, "fromHtml(...)");
                C1260a annotatedString2 = BlockExtensionsKt.toAnnotatedString(spannedA2, (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b), (2 & 2) != 0 ? new androidx.compose.ui.text.v(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, androidx.compose.ui.text.style.h.f15671c, null, 61439) : null);
                if (1.0f <= 0.0d) {
                    p258v.a.a("invalid weight; must be greater than zero");
                }
                Ia.a<p293xa.r> aVar10 = aVar4;
                TextKt.c(annotatedString2, ScrollKt.b(new LayoutWeightElement(true, Na.l.z(1.0f, Float.MAX_VALUE)), ScrollKt.a(0, c1086gP, 0, 1), false, 14), intercomTheme2.getColors(c1086gP, i18).m630getDescriptionText0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, intercomTheme2.getTypography(c1086gP, i18).getType05(), c1086gP, 0, 0, 131064);
                Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.q(aVar3, 8));
                IconKt.a(U.c.a(io.intercom.android.sdk.R.drawable.intercom_close, c1086gP, 0), S4.o.p(c1086gP, io.intercom.android.sdk.R.string.intercom_close), ClickableKt.c(androidx.compose.foundation.layout.W.m(aVar3, 10).i(new VerticalAlignElement(androidx.compose.ui.d.a.f13344k)), false, null, aVar10, 7), intercomTheme2.getColors(c1086gP, i18).m630getDescriptionText0d7_KjU(), c1086gP, 8, 0);
                c1086gP.T(true);
                aVar6 = aVar10;
                hVar4 = hVar3;
            } else {
                aVar3 = androidx.compose.ui.h.a.f13984b;
                if (i16 != 0) {
                    hVar3 = aVar3;
                } else {
                    hVar3 = hVar2;
                }
                if (i13 != 0) {
                    aVar4 = new Z0.a(2);
                } else {
                    aVar4 = aVar2;
                }
                IntercomTheme intercomTheme3 = IntercomTheme.INSTANCE;
                int i19 = IntercomTheme.$stable;
                p270w.a aVar11 = intercomTheme3.getShapes(c1086gP, i19).f12430b;
                C0945e.g gVar3 = C0945e.f10290g;
                androidx.compose.ui.h hVarG3 = androidx.compose.foundation.layout.W.g(PaddingKt.g(16, 12, C0932d.b(androidx.compose.foundation.layout.W.d(hVar3, 1.0f), intercomTheme3.getColors(c1086gP, i19).m624getBubbleBackground0d7_KjU(), aVar11)), 0.0f, 70, 1);
                androidx.compose.foundation.layout.T tA3 = androidx.compose.foundation.layout.S.a(gVar3, androidx.compose.ui.d.a.j, c1086gP, 6);
                i15 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P3 = c1086gP.P();
                androidx.compose.ui.h hVarC3 = ComposedModifierKt.c(c1086gP, hVarG3);
                ComposeUiNode.f14331c0.getClass();
                aVar5 = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar5);
                } else {
                    c1086gP.A();
                }
                R0.a(ComposeUiNode.Companion.f14337f, c1086gP, tA3);
                R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P3);
                pVar = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O) {
                    J4.i.d(i15, c1086gP, i15, pVar);
                } else {
                    J4.i.d(i15, c1086gP, i15, pVar);
                }
                R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC3);
                Spanned spannedA3 = p307z0.b.a(text, 0);
                kotlin.jvm.internal.i.d(spannedA3, "fromHtml(...)");
                C1260a annotatedString3 = BlockExtensionsKt.toAnnotatedString(spannedA3, (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b), (2 & 2) != 0 ? new androidx.compose.ui.text.v(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, androidx.compose.ui.text.style.h.f15671c, null, 61439) : null);
                if (1.0f <= 0.0d) {
                    p258v.a.a("invalid weight; must be greater than zero");
                }
                Ia.a<p293xa.r> aVar12 = aVar4;
                TextKt.c(annotatedString3, ScrollKt.b(new LayoutWeightElement(true, Na.l.z(1.0f, Float.MAX_VALUE)), ScrollKt.a(0, c1086gP, 0, 1), false, 14), intercomTheme3.getColors(c1086gP, i19).m630getDescriptionText0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, intercomTheme3.getTypography(c1086gP, i19).getType05(), c1086gP, 0, 0, 131064);
                Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.q(aVar3, 8));
                IconKt.a(U.c.a(io.intercom.android.sdk.R.drawable.intercom_close, c1086gP, 0), S4.o.p(c1086gP, io.intercom.android.sdk.R.string.intercom_close), ClickableKt.c(androidx.compose.foundation.layout.W.m(aVar3, 10).i(new VerticalAlignElement(androidx.compose.ui.d.a.f13344k)), false, null, aVar12, 7), intercomTheme3.getColors(c1086gP, i19).m630getDescriptionText0d7_KjU(), c1086gP, 8, 0);
                c1086gP.T(true);
                aVar6 = aVar12;
                hVar4 = hVar3;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Z(text, hVar4, aVar6, i10, i11);
            }
        }
        i12 |= 48;
        hVar2 = hVar;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & 896) == 0) {
                aVar2 = aVar;
                if (c1086gP.k(aVar2)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            if ((i12 & 731) == 146) {
                aVar3 = androidx.compose.ui.h.a.f13984b;
                if (i16 != 0) {
                    hVar3 = aVar3;
                } else {
                    hVar3 = hVar2;
                }
                if (i13 != 0) {
                    aVar4 = new Z0.a(2);
                } else {
                    aVar4 = aVar2;
                }
                IntercomTheme intercomTheme4 = IntercomTheme.INSTANCE;
                int i110 = IntercomTheme.$stable;
                p270w.a aVar13 = intercomTheme4.getShapes(c1086gP, i110).f12430b;
                C0945e.g gVar4 = C0945e.f10290g;
                androidx.compose.ui.h hVarG4 = androidx.compose.foundation.layout.W.g(PaddingKt.g(16, 12, C0932d.b(androidx.compose.foundation.layout.W.d(hVar3, 1.0f), intercomTheme4.getColors(c1086gP, i110).m624getBubbleBackground0d7_KjU(), aVar13)), 0.0f, 70, 1);
                androidx.compose.foundation.layout.T tA4 = androidx.compose.foundation.layout.S.a(gVar4, androidx.compose.ui.d.a.j, c1086gP, 6);
                i15 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P4 = c1086gP.P();
                androidx.compose.ui.h hVarC4 = ComposedModifierKt.c(c1086gP, hVarG4);
                ComposeUiNode.f14331c0.getClass();
                aVar5 = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar5);
                } else {
                    c1086gP.A();
                }
                R0.a(ComposeUiNode.Companion.f14337f, c1086gP, tA4);
                R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P4);
                pVar = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O) {
                    J4.i.d(i15, c1086gP, i15, pVar);
                } else {
                    J4.i.d(i15, c1086gP, i15, pVar);
                }
                R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC4);
                Spanned spannedA4 = p307z0.b.a(text, 0);
                kotlin.jvm.internal.i.d(spannedA4, "fromHtml(...)");
                C1260a annotatedString4 = BlockExtensionsKt.toAnnotatedString(spannedA4, (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b), (2 & 2) != 0 ? new androidx.compose.ui.text.v(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, androidx.compose.ui.text.style.h.f15671c, null, 61439) : null);
                if (1.0f <= 0.0d) {
                    p258v.a.a("invalid weight; must be greater than zero");
                }
                Ia.a<p293xa.r> aVar14 = aVar4;
                TextKt.c(annotatedString4, ScrollKt.b(new LayoutWeightElement(true, Na.l.z(1.0f, Float.MAX_VALUE)), ScrollKt.a(0, c1086gP, 0, 1), false, 14), intercomTheme4.getColors(c1086gP, i110).m630getDescriptionText0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, intercomTheme4.getTypography(c1086gP, i110).getType05(), c1086gP, 0, 0, 131064);
                Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.q(aVar3, 8));
                IconKt.a(U.c.a(io.intercom.android.sdk.R.drawable.intercom_close, c1086gP, 0), S4.o.p(c1086gP, io.intercom.android.sdk.R.string.intercom_close), ClickableKt.c(androidx.compose.foundation.layout.W.m(aVar3, 10).i(new VerticalAlignElement(androidx.compose.ui.d.a.f13344k)), false, null, aVar14, 7), intercomTheme4.getColors(c1086gP, i110).m630getDescriptionText0d7_KjU(), c1086gP, 8, 0);
                c1086gP.T(true);
                aVar6 = aVar14;
                hVar4 = hVar3;
            } else {
                aVar3 = androidx.compose.ui.h.a.f13984b;
                if (i16 != 0) {
                    hVar3 = aVar3;
                } else {
                    hVar3 = hVar2;
                }
                if (i13 != 0) {
                    aVar4 = new Z0.a(2);
                } else {
                    aVar4 = aVar2;
                }
                IntercomTheme intercomTheme5 = IntercomTheme.INSTANCE;
                int i111 = IntercomTheme.$stable;
                p270w.a aVar15 = intercomTheme5.getShapes(c1086gP, i111).f12430b;
                C0945e.g gVar5 = C0945e.f10290g;
                androidx.compose.ui.h hVarG5 = androidx.compose.foundation.layout.W.g(PaddingKt.g(16, 12, C0932d.b(androidx.compose.foundation.layout.W.d(hVar3, 1.0f), intercomTheme5.getColors(c1086gP, i111).m624getBubbleBackground0d7_KjU(), aVar15)), 0.0f, 70, 1);
                androidx.compose.foundation.layout.T tA5 = androidx.compose.foundation.layout.S.a(gVar5, androidx.compose.ui.d.a.j, c1086gP, 6);
                i15 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P5 = c1086gP.P();
                androidx.compose.ui.h hVarC5 = ComposedModifierKt.c(c1086gP, hVarG5);
                ComposeUiNode.f14331c0.getClass();
                aVar5 = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar5);
                } else {
                    c1086gP.A();
                }
                R0.a(ComposeUiNode.Companion.f14337f, c1086gP, tA5);
                R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P5);
                pVar = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O) {
                    J4.i.d(i15, c1086gP, i15, pVar);
                } else {
                    J4.i.d(i15, c1086gP, i15, pVar);
                }
                R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC5);
                Spanned spannedA5 = p307z0.b.a(text, 0);
                kotlin.jvm.internal.i.d(spannedA5, "fromHtml(...)");
                C1260a annotatedString5 = BlockExtensionsKt.toAnnotatedString(spannedA5, (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b), (2 & 2) != 0 ? new androidx.compose.ui.text.v(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, androidx.compose.ui.text.style.h.f15671c, null, 61439) : null);
                if (1.0f <= 0.0d) {
                    p258v.a.a("invalid weight; must be greater than zero");
                }
                Ia.a<p293xa.r> aVar16 = aVar4;
                TextKt.c(annotatedString5, ScrollKt.b(new LayoutWeightElement(true, Na.l.z(1.0f, Float.MAX_VALUE)), ScrollKt.a(0, c1086gP, 0, 1), false, 14), intercomTheme5.getColors(c1086gP, i111).m630getDescriptionText0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, intercomTheme5.getTypography(c1086gP, i111).getType05(), c1086gP, 0, 0, 131064);
                Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.q(aVar3, 8));
                IconKt.a(U.c.a(io.intercom.android.sdk.R.drawable.intercom_close, c1086gP, 0), S4.o.p(c1086gP, io.intercom.android.sdk.R.string.intercom_close), ClickableKt.c(androidx.compose.foundation.layout.W.m(aVar3, 10).i(new VerticalAlignElement(androidx.compose.ui.d.a.f13344k)), false, null, aVar16, 7), intercomTheme5.getColors(c1086gP, i111).m630getDescriptionText0d7_KjU(), c1086gP, 8, 0);
                c1086gP.T(true);
                aVar6 = aVar16;
                hVar4 = hVar3;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Z(text, hVar4, aVar6, i10, i11);
            }
        }
        i12 |= 384;
        aVar2 = aVar;
        if ((i12 & 731) == 146) {
            aVar3 = androidx.compose.ui.h.a.f13984b;
            if (i16 != 0) {
                hVar3 = aVar3;
            } else {
                hVar3 = hVar2;
            }
            if (i13 != 0) {
                aVar4 = new Z0.a(2);
            } else {
                aVar4 = aVar2;
            }
            IntercomTheme intercomTheme6 = IntercomTheme.INSTANCE;
            int i112 = IntercomTheme.$stable;
            p270w.a aVar17 = intercomTheme6.getShapes(c1086gP, i112).f12430b;
            C0945e.g gVar6 = C0945e.f10290g;
            androidx.compose.ui.h hVarG6 = androidx.compose.foundation.layout.W.g(PaddingKt.g(16, 12, C0932d.b(androidx.compose.foundation.layout.W.d(hVar3, 1.0f), intercomTheme6.getColors(c1086gP, i112).m624getBubbleBackground0d7_KjU(), aVar17)), 0.0f, 70, 1);
            androidx.compose.foundation.layout.T tA6 = androidx.compose.foundation.layout.S.a(gVar6, androidx.compose.ui.d.a.j, c1086gP, 6);
            i15 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P6 = c1086gP.P();
            androidx.compose.ui.h hVarC6 = ComposedModifierKt.c(c1086gP, hVarG6);
            ComposeUiNode.f14331c0.getClass();
            aVar5 = ComposeUiNode.Companion.f14333b;
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar5);
            } else {
                c1086gP.A();
            }
            R0.a(ComposeUiNode.Companion.f14337f, c1086gP, tA6);
            R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P6);
            pVar = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O) {
                J4.i.d(i15, c1086gP, i15, pVar);
            } else {
                J4.i.d(i15, c1086gP, i15, pVar);
            }
            R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC6);
            Spanned spannedA6 = p307z0.b.a(text, 0);
            kotlin.jvm.internal.i.d(spannedA6, "fromHtml(...)");
            C1260a annotatedString6 = BlockExtensionsKt.toAnnotatedString(spannedA6, (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b), (2 & 2) != 0 ? new androidx.compose.ui.text.v(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, androidx.compose.ui.text.style.h.f15671c, null, 61439) : null);
            if (1.0f <= 0.0d) {
                p258v.a.a("invalid weight; must be greater than zero");
            }
            Ia.a<p293xa.r> aVar18 = aVar4;
            TextKt.c(annotatedString6, ScrollKt.b(new LayoutWeightElement(true, Na.l.z(1.0f, Float.MAX_VALUE)), ScrollKt.a(0, c1086gP, 0, 1), false, 14), intercomTheme6.getColors(c1086gP, i112).m630getDescriptionText0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, intercomTheme6.getTypography(c1086gP, i112).getType05(), c1086gP, 0, 0, 131064);
            Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.q(aVar3, 8));
            IconKt.a(U.c.a(io.intercom.android.sdk.R.drawable.intercom_close, c1086gP, 0), S4.o.p(c1086gP, io.intercom.android.sdk.R.string.intercom_close), ClickableKt.c(androidx.compose.foundation.layout.W.m(aVar3, 10).i(new VerticalAlignElement(androidx.compose.ui.d.a.f13344k)), false, null, aVar18, 7), intercomTheme6.getColors(c1086gP, i112).m630getDescriptionText0d7_KjU(), c1086gP, 8, 0);
            c1086gP.T(true);
            aVar6 = aVar18;
            hVar4 = hVar3;
        } else {
            aVar3 = androidx.compose.ui.h.a.f13984b;
            if (i16 != 0) {
                hVar3 = aVar3;
            } else {
                hVar3 = hVar2;
            }
            if (i13 != 0) {
                aVar4 = new Z0.a(2);
            } else {
                aVar4 = aVar2;
            }
            IntercomTheme intercomTheme7 = IntercomTheme.INSTANCE;
            int i113 = IntercomTheme.$stable;
            p270w.a aVar19 = intercomTheme7.getShapes(c1086gP, i113).f12430b;
            C0945e.g gVar7 = C0945e.f10290g;
            androidx.compose.ui.h hVarG7 = androidx.compose.foundation.layout.W.g(PaddingKt.g(16, 12, C0932d.b(androidx.compose.foundation.layout.W.d(hVar3, 1.0f), intercomTheme7.getColors(c1086gP, i113).m624getBubbleBackground0d7_KjU(), aVar19)), 0.0f, 70, 1);
            androidx.compose.foundation.layout.T tA7 = androidx.compose.foundation.layout.S.a(gVar7, androidx.compose.ui.d.a.j, c1086gP, 6);
            i15 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P7 = c1086gP.P();
            androidx.compose.ui.h hVarC7 = ComposedModifierKt.c(c1086gP, hVarG7);
            ComposeUiNode.f14331c0.getClass();
            aVar5 = ComposeUiNode.Companion.f14333b;
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar5);
            } else {
                c1086gP.A();
            }
            R0.a(ComposeUiNode.Companion.f14337f, c1086gP, tA7);
            R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P7);
            pVar = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O) {
                J4.i.d(i15, c1086gP, i15, pVar);
            } else {
                J4.i.d(i15, c1086gP, i15, pVar);
            }
            R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC7);
            Spanned spannedA7 = p307z0.b.a(text, 0);
            kotlin.jvm.internal.i.d(spannedA7, "fromHtml(...)");
            C1260a annotatedString7 = BlockExtensionsKt.toAnnotatedString(spannedA7, (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b), (2 & 2) != 0 ? new androidx.compose.ui.text.v(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, androidx.compose.ui.text.style.h.f15671c, null, 61439) : null);
            if (1.0f <= 0.0d) {
                p258v.a.a("invalid weight; must be greater than zero");
            }
            Ia.a<p293xa.r> aVar110 = aVar4;
            TextKt.c(annotatedString7, ScrollKt.b(new LayoutWeightElement(true, Na.l.z(1.0f, Float.MAX_VALUE)), ScrollKt.a(0, c1086gP, 0, 1), false, 14), intercomTheme7.getColors(c1086gP, i113).m630getDescriptionText0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, intercomTheme7.getTypography(c1086gP, i113).getType05(), c1086gP, 0, 0, 131064);
            Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.q(aVar3, 8));
            IconKt.a(U.c.a(io.intercom.android.sdk.R.drawable.intercom_close, c1086gP, 0), S4.o.p(c1086gP, io.intercom.android.sdk.R.string.intercom_close), ClickableKt.c(androidx.compose.foundation.layout.W.m(aVar3, 10).i(new VerticalAlignElement(androidx.compose.ui.d.a.f13344k)), false, null, aVar110, 7), intercomTheme7.getColors(c1086gP, i113).m630getDescriptionText0d7_KjU(), c1086gP, 8, 0);
            c1086gP.T(true);
            aVar6 = aVar110;
            hVar4 = hVar3;
        }
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Z(text, hVar4, aVar6, i10, i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r PrivacyPolicy$lambda$2(String text, androidx.compose.ui.h hVar, Ia.a aVar, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        kotlin.jvm.internal.i.e(text, "$text");
        PrivacyPolicy(text, hVar, aVar, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return p293xa.r.f47939a;
    }

    @IntercomPreviews
    public static final void PrivacyPolicyPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(-520891099);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$PrivacyPolicyKt.INSTANCE.m203getLambda2$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new C2293m0(i10, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r PrivacyPolicyPreview$lambda$3(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        PrivacyPolicyPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }
}
