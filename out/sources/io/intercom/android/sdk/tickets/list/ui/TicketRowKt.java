package io.intercom.android.sdk.tickets.list.ui;

import Ia.p;
import androidx.compose.foundation.layout.C0945e;
import androidx.compose.foundation.layout.C0952l;
import androidx.compose.foundation.layout.C0953m;
import androidx.compose.foundation.layout.L;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.N;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.S;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.W;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.R0;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.graphics.H;
import androidx.compose.ui.h;
import androidx.compose.ui.layout.E;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.F;
import androidx.compose.ui.text.font.l;
import io.intercom.android.sdk.m5.components.ConversationItemKt;
import io.intercom.android.sdk.m5.components.IntercomChevronKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import kotlin.jvm.internal.i;
import me.zhanghai.android.materialprogressbar.R;
import p270w.g;
import p293xa.r;

/* JADX INFO: compiled from: TicketRow.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class TicketRowKt {
    /* JADX WARN: Code duplicated, block: B:100:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:68:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:69:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:74:0x0116  */
    /* JADX WARN: Code duplicated, block: B:78:0x017f  */
    /* JADX WARN: Code duplicated, block: B:81:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:83:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:88:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:93:0x0215  */
    /* JADX WARN: Code duplicated, block: B:95:0x021a  */
    /* JADX WARN: Code duplicated, block: B:98:0x02a7  */
    public static final void TicketRow(h hVar, final TicketRowData data, L l10, boolean z10, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        h hVar2;
        int i12;
        L n10;
        boolean z11;
        boolean z12;
        L l11;
        int i13;
        Ia.a<ComposeUiNode> aVar;
        p<ComposeUiNode, Integer, r> pVar;
        int i14;
        l lVar;
        final L l12;
        final h hVar3;
        final boolean z13;
        i.e(data, "data");
        C1086g c1086gP = interfaceC1084f.p(-1789130333);
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
            i12 |= c1086gP.K(data) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            if ((i11 & 4) == 0) {
                n10 = l10;
                int i16 = c1086gP.K(n10) ? 256 : 128;
                i12 |= i16;
            } else {
                n10 = l10;
            }
            i12 |= i16;
        } else {
            n10 = l10;
        }
        if ((i10 & 7168) == 0) {
            if ((i11 & 8) == 0) {
                z11 = z10;
                int i17 = c1086gP.c(z11) ? 2048 : 1024;
                i12 |= i17;
            } else {
                z11 = z10;
            }
            i12 |= i17;
        } else {
            z11 = z10;
        }
        if ((i12 & 5851) == 1170 && c1086gP.s()) {
            c1086gP.w();
            hVar3 = hVar2;
            l12 = n10;
            z13 = z11;
        } else {
            c1086gP.r0();
            int i18 = i10 & 1;
            h.a aVar2 = h.a.f13984b;
            if (i18 == 0 || c1086gP.a0()) {
                if (i15 != 0) {
                    hVar2 = aVar2;
                }
                if ((i11 & 4) != 0) {
                    float f10 = 16;
                    float f11 = 20;
                    n10 = new N(f11, f10, f11, f10);
                }
                if ((i11 & 8) != 0) {
                    z12 = !data.isRead();
                    l11 = n10;
                }
                c1086gP.U();
                h hVarE = PaddingKt.e(hVar2, l11);
                T tA = S.a(C0945e.f10284a, androidx.compose.ui.d.a.f13344k, c1086gP, 48);
                i13 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
                h hVarC = ComposedModifierKt.c(c1086gP, hVarE);
                ComposeUiNode.f14331c0.getClass();
                aVar = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar);
                } else {
                    c1086gP.A();
                }
                p<ComposeUiNode, E, r> pVar2 = ComposeUiNode.Companion.f14337f;
                R0.a(pVar2, c1086gP, tA);
                p<ComposeUiNode, androidx.compose.runtime.r, r> pVar3 = ComposeUiNode.Companion.f14336e;
                R0.a(pVar3, c1086gP, interfaceC1089h0P);
                pVar = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O || !i.a(c1086gP.f(), Integer.valueOf(i13))) {
                    J4.i.d(i13, c1086gP, i13, pVar);
                }
                p<ComposeUiNode, h, r> pVar4 = ComposeUiNode.Companion.f14335d;
                R0.a(pVar4, c1086gP, hVarC);
                L l13 = l11;
                SurfaceKt.a(W.m(aVar2, 32), g.f47680a, H.b(0.1f, data.getStatus().m477getColor0d7_KjU()), 0L, 0.0f, 0.0f, null, androidx.compose.runtime.internal.a.b(1329606754, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.tickets.list.ui.TicketRowKt$TicketRow$1$1
                    @Override // Ia.p
                    public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        invoke(interfaceC1084f2, num.intValue());
                        return r.f47939a;
                    }

                    public final void invoke(InterfaceC1084f interfaceC1084f2, int i19) {
                        if ((i19 & 11) == 2 && interfaceC1084f2.s()) {
                            interfaceC1084f2.w();
                        } else {
                            IconKt.a(U.c.a(data.getStatus().getIconRes(), interfaceC1084f2, 0), null, PaddingKt.f(h.a.f13984b, 8), data.getStatus().m477getColor0d7_KjU(), interfaceC1084f2, 440, 0);
                        }
                    }
                }, c1086gP), c1086gP, 12582918, R.styleable.AppCompatTheme_windowFixedHeightMajor);
                Lb.a.a(c1086gP, W.q(aVar2, 10));
                if (1.0f <= 0.0d) {
                    p258v.a.a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement = new LayoutWeightElement(true, Na.l.z(1.0f, Float.MAX_VALUE));
                C0953m c0953mA = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, c1086gP, 0);
                i14 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P2 = c1086gP.P();
                h hVarC2 = ComposedModifierKt.c(c1086gP, layoutWeightElement);
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar);
                } else {
                    c1086gP.A();
                }
                R0.a(pVar2, c1086gP, c0953mA);
                R0.a(pVar3, c1086gP, interfaceC1089h0P2);
                if (c1086gP.f12995O || !i.a(c1086gP.f(), Integer.valueOf(i14))) {
                    J4.i.d(i14, c1086gP, i14, pVar);
                }
                R0.a(pVar4, c1086gP, hVarC2);
                String title = data.getTitle();
                IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                int i19 = IntercomTheme.$stable;
                F fA = F.a(intercomTheme.getTypography(c1086gP, i19).getType04(), intercomTheme.getColors(c1086gP, i19).m645getPrimaryText0d7_KjU(), 0L, null, null, 0L, null, 0, 0L, null, null, 16777214);
                if (data.isRead()) {
                    lVar = l.f15442g;
                } else {
                    lVar = l.f15444i;
                }
                TextKt.b(title, null, 0L, 0L, null, lVar, null, 0L, null, null, 0L, 2, false, 1, 0, null, fA, c1086gP, 0, 3120, 55262);
                Lb.a.a(c1086gP, W.e(aVar2, 4));
                TextKt.b(data.getSubTitle(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, F.a(intercomTheme.getTypography(c1086gP, i19).getType04(), intercomTheme.getColors(c1086gP, i19).m630getDescriptionText0d7_KjU(), 0L, null, null, 0L, null, 0, 0L, null, null, 16777214), c1086gP, 0, 3120, 55294);
                c1086gP.T(true);
                if (z12) {
                    c1086gP.L(-318867215);
                    ConversationItemKt.UnreadIndicator(null, c1086gP, 0, 1);
                    c1086gP.T(false);
                } else {
                    c1086gP.L(-318819320);
                    IntercomChevronKt.IntercomChevron(PaddingKt.j(aVar2, 6, 0.0f, 0.0f, 0.0f, 14), c1086gP, 6, 0);
                    c1086gP.T(false);
                }
                c1086gP.T(true);
                l12 = l13;
                hVar3 = hVar2;
                z13 = z12;
            } else {
                c1086gP.w();
            }
            l11 = n10;
            z12 = z11;
            c1086gP.U();
            h hVarE2 = PaddingKt.e(hVar2, l11);
            T tA2 = S.a(C0945e.f10284a, androidx.compose.ui.d.a.f13344k, c1086gP, 48);
            i13 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P3 = c1086gP.P();
            h hVarC3 = ComposedModifierKt.c(c1086gP, hVarE2);
            ComposeUiNode.f14331c0.getClass();
            aVar = ComposeUiNode.Companion.f14333b;
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar);
            } else {
                c1086gP.A();
            }
            p<ComposeUiNode, E, r> pVar5 = ComposeUiNode.Companion.f14337f;
            R0.a(pVar5, c1086gP, tA2);
            p<ComposeUiNode, androidx.compose.runtime.r, r> pVar6 = ComposeUiNode.Companion.f14336e;
            R0.a(pVar6, c1086gP, interfaceC1089h0P3);
            pVar = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O) {
                J4.i.d(i13, c1086gP, i13, pVar);
            } else {
                J4.i.d(i13, c1086gP, i13, pVar);
            }
            p<ComposeUiNode, h, r> pVar7 = ComposeUiNode.Companion.f14335d;
            R0.a(pVar7, c1086gP, hVarC3);
            L l14 = l11;
            SurfaceKt.a(W.m(aVar2, 32), g.f47680a, H.b(0.1f, data.getStatus().m477getColor0d7_KjU()), 0L, 0.0f, 0.0f, null, androidx.compose.runtime.internal.a.b(1329606754, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.tickets.list.ui.TicketRowKt$TicketRow$1$1
                @Override // Ia.p
                public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    invoke(interfaceC1084f2, num.intValue());
                    return r.f47939a;
                }

                public final void invoke(InterfaceC1084f interfaceC1084f2, int i110) {
                    if ((i110 & 11) == 2 && interfaceC1084f2.s()) {
                        interfaceC1084f2.w();
                    } else {
                        IconKt.a(U.c.a(data.getStatus().getIconRes(), interfaceC1084f2, 0), null, PaddingKt.f(h.a.f13984b, 8), data.getStatus().m477getColor0d7_KjU(), interfaceC1084f2, 440, 0);
                    }
                }
            }, c1086gP), c1086gP, 12582918, R.styleable.AppCompatTheme_windowFixedHeightMajor);
            Lb.a.a(c1086gP, W.q(aVar2, 10));
            if (1.0f <= 0.0d) {
                p258v.a.a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement2 = new LayoutWeightElement(true, Na.l.z(1.0f, Float.MAX_VALUE));
            C0953m c0953mA2 = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, c1086gP, 0);
            i14 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P4 = c1086gP.P();
            h hVarC4 = ComposedModifierKt.c(c1086gP, layoutWeightElement2);
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar);
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
            String title2 = data.getTitle();
            IntercomTheme intercomTheme2 = IntercomTheme.INSTANCE;
            int i110 = IntercomTheme.$stable;
            F fA2 = F.a(intercomTheme2.getTypography(c1086gP, i110).getType04(), intercomTheme2.getColors(c1086gP, i110).m645getPrimaryText0d7_KjU(), 0L, null, null, 0L, null, 0, 0L, null, null, 16777214);
            if (data.isRead()) {
                lVar = l.f15442g;
            } else {
                lVar = l.f15444i;
            }
            TextKt.b(title2, null, 0L, 0L, null, lVar, null, 0L, null, null, 0L, 2, false, 1, 0, null, fA2, c1086gP, 0, 3120, 55262);
            Lb.a.a(c1086gP, W.e(aVar2, 4));
            TextKt.b(data.getSubTitle(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, F.a(intercomTheme2.getTypography(c1086gP, i110).getType04(), intercomTheme2.getColors(c1086gP, i110).m630getDescriptionText0d7_KjU(), 0L, null, null, 0L, null, 0, 0L, null, null, 16777214), c1086gP, 0, 3120, 55294);
            c1086gP.T(true);
            if (z12) {
                c1086gP.L(-318867215);
                ConversationItemKt.UnreadIndicator(null, c1086gP, 0, 1);
                c1086gP.T(false);
            } else {
                c1086gP.L(-318819320);
                IntercomChevronKt.IntercomChevron(PaddingKt.j(aVar2, 6, 0.0f, 0.0f, 0.0f, 14), c1086gP, 6, 0);
                c1086gP.T(false);
            }
            c1086gP.T(true);
            l12 = l14;
            hVar3 = hVar2;
            z13 = z12;
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new p() { // from class: io.intercom.android.sdk.tickets.list.ui.b
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return TicketRowKt.TicketRow$lambda$2(hVar3, data, l12, z13, i10, i11, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r TicketRow$lambda$2(h hVar, TicketRowData data, L l10, boolean z10, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        i.e(data, "$data");
        TicketRow(hVar, data, l10, z10, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return r.f47939a;
    }

    public static final void TicketRowPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(-1396185263);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TicketRowKt.INSTANCE.m490getLambda2$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new io.intercom.android.sdk.m5.components.avatar.a(i10, 6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r TicketRowPreview$lambda$3(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        TicketRowPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return r.f47939a;
    }
}
