package io.intercom.android.sdk.m5.conversation.ui.components.row;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.C0945e;
import androidx.compose.foundation.layout.C0952l;
import androidx.compose.foundation.layout.C0953m;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.W;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.R0;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import io.intercom.android.sdk.m5.components.E0;
import io.intercom.android.sdk.m5.conversation.ui.M;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: MergedConversationRow.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class MergedConversationRowKt {
    /* JADX WARN: Code duplicated, block: B:51:0x009a  */
    /* JADX WARN: Code duplicated, block: B:53:0x009e  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:59:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:60:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:63:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:65:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:68:0x017d  */
    /* JADX WARN: Code duplicated, block: B:69:0x017f  */
    /* JADX WARN: Code duplicated, block: B:72:0x0186  */
    /* JADX WARN: Code duplicated, block: B:73:0x0188  */
    /* JADX WARN: Code duplicated, block: B:76:0x0190  */
    /* JADX WARN: Code duplicated, block: B:80:0x019a  */
    /* JADX WARN: Code duplicated, block: B:84:0x0226  */
    /* JADX WARN: Code duplicated, block: B:86:? A[RETURN, SYNTHETIC] */
    public static final void MergedConversationRow(androidx.compose.ui.h hVar, final String description, final String conversationId, Ia.l<? super String, p293xa.r> lVar, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        androidx.compose.ui.h hVar2;
        int i12;
        Ia.l<? super String, p293xa.r> m7;
        int i13;
        androidx.compose.ui.h.a aVar;
        androidx.compose.ui.h hVar3;
        int i14;
        Ia.a<ComposeUiNode> aVar2;
        Ia.p<ComposeUiNode, Integer, p293xa.r> pVar;
        Ia.l<? super String, p293xa.r> lVar2;
        boolean z10;
        boolean z11;
        boolean z12;
        Object objF;
        Ia.l<? super String, p293xa.r> lVar3;
        final Ia.l<? super String, p293xa.r> lVar4;
        final androidx.compose.ui.h hVar4;
        C1105p0 c1105p0V;
        kotlin.jvm.internal.i.e(description, "description");
        kotlin.jvm.internal.i.e(conversationId, "conversationId");
        C1086g c1086gP = interfaceC1084f.p(-635122177);
        int i15 = i11 & 1;
        if (i15 != 0) {
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
            i12 |= c1086gP.K(description) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 896) == 0) {
            i12 |= c1086gP.K(conversationId) ? 256 : 128;
        }
        int i16 = i11 & 8;
        if (i16 == 0) {
            if ((i10 & 7168) == 0) {
                m7 = lVar;
                i12 |= c1086gP.k(m7) ? 2048 : 1024;
            }
            i13 = i12;
            if ((i13 & 5851) == 1170 || !c1086gP.s()) {
                aVar = androidx.compose.ui.h.a.f13984b;
                if (i15 != 0) {
                    hVar3 = aVar;
                } else {
                    hVar3 = hVar2;
                }
                if (i16 != 0) {
                    m7 = new M(1);
                }
                androidx.compose.ui.h hVarH = PaddingKt.h(hVar3, 16, 0.0f, 2);
                C0953m c0953mA = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13347n, c1086gP, 48);
                i14 = c1086gP.f12996P;
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
                R0.a(ComposeUiNode.Companion.f14337f, c1086gP, c0953mA);
                R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P);
                pVar = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i14))) {
                    J4.i.d(i14, c1086gP, i14, pVar);
                }
                R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC);
                IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                int i17 = IntercomTheme.$stable;
                androidx.compose.ui.h hVar5 = hVar3;
                lVar2 = m7;
                TextKt.b(description, null, intercomTheme.getColors(c1086gP, i17).m630getDescriptionText0d7_KjU(), 0L, null, null, null, 0L, null, new androidx.compose.ui.text.style.g(3), 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c1086gP, i17).getType04Point5(), c1086gP, (i13 >> 3) & 14, 0, 65018);
                Lb.a.a(c1086gP, W.e(aVar, 4));
                c1086gP.L(-1680452062);
                if ((i13 & 7168) == 2048) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if ((i13 & 896) == 256) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                z12 = z10 | z11;
                objF = c1086gP.f();
                if (!z12 || objF == InterfaceC1084f.a.f12980a) {
                    lVar3 = lVar2;
                    objF = new v(lVar3, 0, conversationId);
                    c1086gP.E(objF);
                } else {
                    lVar3 = lVar2;
                }
                c1086gP.T(false);
                TextKt.b(S4.o.p(c1086gP, io.intercom.android.sdk.R.string.intercom_view_conversation), ClickableKt.c(aVar, false, null, (Ia.a) objF, 7), intercomTheme.getColors(c1086gP, i17).m616getActionContrastWhite0d7_KjU(), 0L, null, null, null, 0L, null, new androidx.compose.ui.text.style.g(3), 0L, 0, false, 0, 0, null, androidx.compose.ui.text.F.a(intercomTheme.getTypography(c1086gP, i17).getType04Point5(), 0L, 0L, androidx.compose.ui.text.font.l.j, null, 0L, null, 0, 0L, null, null, 16777211), c1086gP, 0, 0, 65016);
                c1086gP = c1086gP;
                c1086gP.T(true);
                lVar4 = lVar3;
                hVar4 = hVar5;
            } else {
                c1086gP.w();
                hVar4 = hVar2;
                lVar4 = m7;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.w
                    @Override // Ia.p
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return MergedConversationRowKt.MergedConversationRow$lambda$4(hVar4, description, conversationId, lVar4, i10, i11, (InterfaceC1084f) obj, iIntValue);
                    }
                };
            }
        }
        i12 |= 3072;
        m7 = lVar;
        i13 = i12;
        if ((i13 & 5851) == 1170) {
            aVar = androidx.compose.ui.h.a.f13984b;
            if (i15 != 0) {
                hVar3 = aVar;
            } else {
                hVar3 = hVar2;
            }
            if (i16 != 0) {
                m7 = new M(1);
            }
            androidx.compose.ui.h hVarH2 = PaddingKt.h(hVar3, 16, 0.0f, 2);
            C0953m c0953mA2 = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13347n, c1086gP, 48);
            i14 = c1086gP.f12996P;
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
            R0.a(ComposeUiNode.Companion.f14337f, c1086gP, c0953mA2);
            R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P2);
            pVar = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O) {
                J4.i.d(i14, c1086gP, i14, pVar);
            } else {
                J4.i.d(i14, c1086gP, i14, pVar);
            }
            R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC2);
            IntercomTheme intercomTheme2 = IntercomTheme.INSTANCE;
            int i18 = IntercomTheme.$stable;
            androidx.compose.ui.h hVar6 = hVar3;
            lVar2 = m7;
            TextKt.b(description, null, intercomTheme2.getColors(c1086gP, i18).m630getDescriptionText0d7_KjU(), 0L, null, null, null, 0L, null, new androidx.compose.ui.text.style.g(3), 0L, 0, false, 0, 0, null, intercomTheme2.getTypography(c1086gP, i18).getType04Point5(), c1086gP, (i13 >> 3) & 14, 0, 65018);
            Lb.a.a(c1086gP, W.e(aVar, 4));
            c1086gP.L(-1680452062);
            if ((i13 & 7168) == 2048) {
                z10 = true;
            } else {
                z10 = false;
            }
            if ((i13 & 896) == 256) {
                z11 = true;
            } else {
                z11 = false;
            }
            z12 = z10 | z11;
            objF = c1086gP.f();
            if (z12) {
                lVar3 = lVar2;
                objF = new v(lVar3, 0, conversationId);
                c1086gP.E(objF);
            } else {
                lVar3 = lVar2;
                objF = new v(lVar3, 0, conversationId);
                c1086gP.E(objF);
            }
            c1086gP.T(false);
            TextKt.b(S4.o.p(c1086gP, io.intercom.android.sdk.R.string.intercom_view_conversation), ClickableKt.c(aVar, false, null, (Ia.a) objF, 7), intercomTheme2.getColors(c1086gP, i18).m616getActionContrastWhite0d7_KjU(), 0L, null, null, null, 0L, null, new androidx.compose.ui.text.style.g(3), 0L, 0, false, 0, 0, null, androidx.compose.ui.text.F.a(intercomTheme2.getTypography(c1086gP, i18).getType04Point5(), 0L, 0L, androidx.compose.ui.text.font.l.j, null, 0L, null, 0, 0L, null, null, 16777211), c1086gP, 0, 0, 65016);
            c1086gP = c1086gP;
            c1086gP.T(true);
            lVar4 = lVar3;
            hVar4 = hVar6;
        } else {
            aVar = androidx.compose.ui.h.a.f13984b;
            if (i15 != 0) {
                hVar3 = aVar;
            } else {
                hVar3 = hVar2;
            }
            if (i16 != 0) {
                m7 = new M(1);
            }
            androidx.compose.ui.h hVarH3 = PaddingKt.h(hVar3, 16, 0.0f, 2);
            C0953m c0953mA3 = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13347n, c1086gP, 48);
            i14 = c1086gP.f12996P;
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
            R0.a(ComposeUiNode.Companion.f14337f, c1086gP, c0953mA3);
            R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P3);
            pVar = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O) {
                J4.i.d(i14, c1086gP, i14, pVar);
            } else {
                J4.i.d(i14, c1086gP, i14, pVar);
            }
            R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC3);
            IntercomTheme intercomTheme3 = IntercomTheme.INSTANCE;
            int i19 = IntercomTheme.$stable;
            androidx.compose.ui.h hVar7 = hVar3;
            lVar2 = m7;
            TextKt.b(description, null, intercomTheme3.getColors(c1086gP, i19).m630getDescriptionText0d7_KjU(), 0L, null, null, null, 0L, null, new androidx.compose.ui.text.style.g(3), 0L, 0, false, 0, 0, null, intercomTheme3.getTypography(c1086gP, i19).getType04Point5(), c1086gP, (i13 >> 3) & 14, 0, 65018);
            Lb.a.a(c1086gP, W.e(aVar, 4));
            c1086gP.L(-1680452062);
            if ((i13 & 7168) == 2048) {
                z10 = true;
            } else {
                z10 = false;
            }
            if ((i13 & 896) == 256) {
                z11 = true;
            } else {
                z11 = false;
            }
            z12 = z10 | z11;
            objF = c1086gP.f();
            if (z12) {
                lVar3 = lVar2;
                objF = new v(lVar3, 0, conversationId);
                c1086gP.E(objF);
            } else {
                lVar3 = lVar2;
                objF = new v(lVar3, 0, conversationId);
                c1086gP.E(objF);
            }
            c1086gP.T(false);
            TextKt.b(S4.o.p(c1086gP, io.intercom.android.sdk.R.string.intercom_view_conversation), ClickableKt.c(aVar, false, null, (Ia.a) objF, 7), intercomTheme3.getColors(c1086gP, i19).m616getActionContrastWhite0d7_KjU(), 0L, null, null, null, 0L, null, new androidx.compose.ui.text.style.g(3), 0L, 0, false, 0, 0, null, androidx.compose.ui.text.F.a(intercomTheme3.getTypography(c1086gP, i19).getType04Point5(), 0L, 0L, androidx.compose.ui.text.font.l.j, null, 0L, null, 0, 0L, null, null, 16777211), c1086gP, 0, 0, 65016);
            c1086gP = c1086gP;
            c1086gP.T(true);
            lVar4 = lVar3;
            hVar4 = hVar7;
        }
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.w
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return MergedConversationRowKt.MergedConversationRow$lambda$4(hVar4, description, conversationId, lVar4, i10, i11, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r MergedConversationRow$lambda$0(String it) {
        kotlin.jvm.internal.i.e(it, "it");
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r MergedConversationRow$lambda$3$lambda$2$lambda$1(Ia.l lVar, String conversationId) {
        kotlin.jvm.internal.i.e(conversationId, "$conversationId");
        lVar.invoke(conversationId);
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r MergedConversationRow$lambda$4(androidx.compose.ui.h hVar, String description, String conversationId, Ia.l lVar, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        kotlin.jvm.internal.i.e(description, "$description");
        kotlin.jvm.internal.i.e(conversationId, "$conversationId");
        MergedConversationRow(hVar, description, conversationId, lVar, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return p293xa.r.f47939a;
    }

    @IntercomPreviews
    private static final void MergedConversationRowPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(-243500111);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$MergedConversationRowKt.INSTANCE.m230getLambda1$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new E0(i10, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r MergedConversationRowPreview$lambda$5(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        MergedConversationRowPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }
}
