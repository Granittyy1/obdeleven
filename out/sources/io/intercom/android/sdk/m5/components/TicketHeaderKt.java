package io.intercom.android.sdk.m5.components;

import androidx.compose.foundation.layout.C0945e;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.R0;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.node.ComposeUiNode;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: TicketHeader.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class TicketHeaderKt {
    /* JADX WARN: Code duplicated, block: B:41:0x007a  */
    /* JADX WARN: Code duplicated, block: B:43:0x007e  */
    /* JADX WARN: Code duplicated, block: B:44:0x0080  */
    /* JADX WARN: Code duplicated, block: B:46:0x0083  */
    /* JADX WARN: Code duplicated, block: B:47:0x0088  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:60:0x017b  */
    /* JADX WARN: Code duplicated, block: B:62:? A[RETURN, SYNTHETIC] */
    public static final void SimpleTicketHeader(androidx.compose.ui.h hVar, String text, androidx.compose.ui.text.font.l lVar, InterfaceC1084f interfaceC1084f, int i10, int i11) {
        androidx.compose.ui.h hVar2;
        int i12;
        androidx.compose.ui.text.font.l lVar2;
        int i13;
        androidx.compose.ui.h.a aVar;
        androidx.compose.ui.h hVar3;
        androidx.compose.ui.text.font.l lVar3;
        int i14;
        Ia.a<ComposeUiNode> aVar2;
        Ia.p<ComposeUiNode, Integer, p293xa.r> pVar;
        C1086g c1086g;
        androidx.compose.ui.text.font.l lVar4;
        C1105p0 c1105p0V;
        kotlin.jvm.internal.i.e(text, "text");
        C1086g c1086gP = interfaceC1084f.p(-921635597);
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
            i12 |= c1086gP.K(text) ? 32 : 16;
        }
        int i16 = i11 & 4;
        if (i16 == 0) {
            if ((i10 & 896) == 0) {
                lVar2 = lVar;
                i12 |= c1086gP.K(lVar2) ? 256 : 128;
            }
            i13 = i12;
            if ((i13 & 731) == 146 || !c1086gP.s()) {
                aVar = androidx.compose.ui.h.a.f13984b;
                if (i15 != 0) {
                    hVar3 = aVar;
                } else {
                    hVar3 = hVar2;
                }
                if (i16 != 0) {
                    lVar3 = androidx.compose.ui.text.font.l.f15442g;
                } else {
                    lVar3 = lVar2;
                }
                androidx.compose.ui.f.b bVar = androidx.compose.ui.d.a.f13344k;
                androidx.compose.ui.h hVarT = androidx.compose.foundation.layout.W.t(hVar3, null, 3);
                androidx.compose.foundation.layout.T tA = androidx.compose.foundation.layout.S.a(C0945e.f10284a, bVar, c1086gP, 48);
                i14 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
                androidx.compose.ui.h hVarC = ComposedModifierKt.c(c1086gP, hVarT);
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
                if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i14))) {
                    J4.i.d(i14, c1086gP, i14, pVar);
                }
                R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC);
                androidx.compose.ui.h hVarM = androidx.compose.foundation.layout.W.m(aVar, 16);
                Painter painterA = U.c.a(io.intercom.android.sdk.R.drawable.intercom_ticket_detail_icon, c1086gP, 0);
                IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                int i17 = IntercomTheme.$stable;
                IconKt.a(painterA, null, hVarM, intercomTheme.getColors(c1086gP, i17).m630getDescriptionText0d7_KjU(), c1086gP, 440, 0);
                Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.q(aVar, 4));
                TextKt.b(text, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, androidx.compose.ui.text.F.a(intercomTheme.getTypography(c1086gP, i17).getType04(), intercomTheme.getColors(c1086gP, i17).m630getDescriptionText0d7_KjU(), 0L, lVar3, null, 0L, null, 0, 0L, null, null, 16777210), c1086gP, (i13 >> 3) & 14, 3120, 55294);
                c1086g = c1086gP;
                c1086g.T(true);
                hVar2 = hVar3;
                lVar4 = lVar3;
            } else {
                c1086gP.w();
                lVar4 = lVar2;
                c1086g = c1086gP;
            }
            c1105p0V = c1086g.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new L0(hVar2, text, lVar4, i10, i11);
            }
        }
        i12 |= 384;
        lVar2 = lVar;
        i13 = i12;
        if ((i13 & 731) == 146) {
            aVar = androidx.compose.ui.h.a.f13984b;
            if (i15 != 0) {
                hVar3 = aVar;
            } else {
                hVar3 = hVar2;
            }
            if (i16 != 0) {
                lVar3 = androidx.compose.ui.text.font.l.f15442g;
            } else {
                lVar3 = lVar2;
            }
            androidx.compose.ui.f.b bVar2 = androidx.compose.ui.d.a.f13344k;
            androidx.compose.ui.h hVarT2 = androidx.compose.foundation.layout.W.t(hVar3, null, 3);
            androidx.compose.foundation.layout.T tA2 = androidx.compose.foundation.layout.S.a(C0945e.f10284a, bVar2, c1086gP, 48);
            i14 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P2 = c1086gP.P();
            androidx.compose.ui.h hVarC2 = ComposedModifierKt.c(c1086gP, hVarT2);
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
                J4.i.d(i14, c1086gP, i14, pVar);
            } else {
                J4.i.d(i14, c1086gP, i14, pVar);
            }
            R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC2);
            androidx.compose.ui.h hVarM2 = androidx.compose.foundation.layout.W.m(aVar, 16);
            Painter painterA2 = U.c.a(io.intercom.android.sdk.R.drawable.intercom_ticket_detail_icon, c1086gP, 0);
            IntercomTheme intercomTheme2 = IntercomTheme.INSTANCE;
            int i18 = IntercomTheme.$stable;
            IconKt.a(painterA2, null, hVarM2, intercomTheme2.getColors(c1086gP, i18).m630getDescriptionText0d7_KjU(), c1086gP, 440, 0);
            Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.q(aVar, 4));
            TextKt.b(text, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, androidx.compose.ui.text.F.a(intercomTheme2.getTypography(c1086gP, i18).getType04(), intercomTheme2.getColors(c1086gP, i18).m630getDescriptionText0d7_KjU(), 0L, lVar3, null, 0L, null, 0, 0L, null, null, 16777210), c1086gP, (i13 >> 3) & 14, 3120, 55294);
            c1086g = c1086gP;
            c1086g.T(true);
            hVar2 = hVar3;
            lVar4 = lVar3;
        } else {
            aVar = androidx.compose.ui.h.a.f13984b;
            if (i15 != 0) {
                hVar3 = aVar;
            } else {
                hVar3 = hVar2;
            }
            if (i16 != 0) {
                lVar3 = androidx.compose.ui.text.font.l.f15442g;
            } else {
                lVar3 = lVar2;
            }
            androidx.compose.ui.f.b bVar3 = androidx.compose.ui.d.a.f13344k;
            androidx.compose.ui.h hVarT3 = androidx.compose.foundation.layout.W.t(hVar3, null, 3);
            androidx.compose.foundation.layout.T tA3 = androidx.compose.foundation.layout.S.a(C0945e.f10284a, bVar3, c1086gP, 48);
            i14 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P3 = c1086gP.P();
            androidx.compose.ui.h hVarC3 = ComposedModifierKt.c(c1086gP, hVarT3);
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
                J4.i.d(i14, c1086gP, i14, pVar);
            } else {
                J4.i.d(i14, c1086gP, i14, pVar);
            }
            R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC3);
            androidx.compose.ui.h hVarM3 = androidx.compose.foundation.layout.W.m(aVar, 16);
            Painter painterA3 = U.c.a(io.intercom.android.sdk.R.drawable.intercom_ticket_detail_icon, c1086gP, 0);
            IntercomTheme intercomTheme3 = IntercomTheme.INSTANCE;
            int i19 = IntercomTheme.$stable;
            IconKt.a(painterA3, null, hVarM3, intercomTheme3.getColors(c1086gP, i19).m630getDescriptionText0d7_KjU(), c1086gP, 440, 0);
            Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.q(aVar, 4));
            TextKt.b(text, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, androidx.compose.ui.text.F.a(intercomTheme3.getTypography(c1086gP, i19).getType04(), intercomTheme3.getColors(c1086gP, i19).m630getDescriptionText0d7_KjU(), 0L, lVar3, null, 0L, null, 0, 0L, null, null, 16777210), c1086gP, (i13 >> 3) & 14, 3120, 55294);
            c1086g = c1086gP;
            c1086g.T(true);
            hVar2 = hVar3;
            lVar4 = lVar3;
        }
        c1105p0V = c1086g.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new L0(hVar2, text, lVar4, i10, i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r SimpleTicketHeader$lambda$2(androidx.compose.ui.h hVar, String text, androidx.compose.ui.text.font.l lVar, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        kotlin.jvm.internal.i.e(text, "$text");
        SimpleTicketHeader(hVar, text, lVar, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return p293xa.r.f47939a;
    }

    public static final void TicketHeader(final androidx.compose.ui.h hVar, final TicketStatusHeaderArgs args, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        int i12;
        kotlin.jvm.internal.i.e(args, "args");
        C1086g c1086gP = interfaceC1084f.p(-254158349);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (c1086gP.K(hVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i12 |= c1086gP.K(args) ? 32 : 16;
        }
        if ((i12 & 91) == 18 && c1086gP.s()) {
            c1086gP.w();
        } else {
            if (i13 != 0) {
                hVar = androidx.compose.ui.h.a.f13984b;
            }
            SimpleTicketHeader(hVar, args.getTitle(), args.getFontWeight(), c1086gP, i12 & 14, 0);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.components.M0
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return TicketHeaderKt.TicketHeader$lambda$0(hVar, args, i10, i11, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r TicketHeader$lambda$0(androidx.compose.ui.h hVar, TicketStatusHeaderArgs args, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        kotlin.jvm.internal.i.e(args, "$args");
        TicketHeader(hVar, args, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return p293xa.r.f47939a;
    }

    private static final void TicketHeaderLongTextPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(-1234985657);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            final TicketStatusHeaderArgs ticketStatusHeaderArgs = new TicketStatusHeaderArgs("Very long long long long title", null, 2, null);
            IntercomThemeKt.IntercomTheme(null, null, null, androidx.compose.runtime.internal.a.b(337942641, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.components.TicketHeaderKt.TicketHeaderLongTextPreview.1
                @Override // Ia.p
                public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    invoke(interfaceC1084f2, num.intValue());
                    return p293xa.r.f47939a;
                }

                public final void invoke(InterfaceC1084f interfaceC1084f2, int i11) {
                    if ((i11 & 11) == 2 && interfaceC1084f2.s()) {
                        interfaceC1084f2.w();
                        return;
                    }
                    androidx.compose.ui.h hVarT = androidx.compose.foundation.layout.W.t(androidx.compose.ui.h.a.f13984b, null, 3);
                    final TicketStatusHeaderArgs ticketStatusHeaderArgs2 = ticketStatusHeaderArgs;
                    SurfaceKt.a(hVarT, null, 0L, 0L, 0.0f, 0.0f, null, androidx.compose.runtime.internal.a.b(-177489460, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.components.TicketHeaderKt.TicketHeaderLongTextPreview.1.1
                        @Override // Ia.p
                        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f3, Integer num) {
                            invoke(interfaceC1084f3, num.intValue());
                            return p293xa.r.f47939a;
                        }

                        public final void invoke(InterfaceC1084f interfaceC1084f3, int i12) {
                            if ((i12 & 11) == 2 && interfaceC1084f3.s()) {
                                interfaceC1084f3.w();
                            } else {
                                TicketHeaderKt.TicketHeader(null, ticketStatusHeaderArgs2, interfaceC1084f3, 0, 1);
                            }
                        }
                    }, interfaceC1084f2), interfaceC1084f2, 12582918, R.styleable.AppCompatTheme_windowNoTitle);
                }
            }, c1086gP), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new C2270b(i10, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r TicketHeaderLongTextPreview$lambda$4(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        TicketHeaderLongTextPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    private static final void TicketHeaderPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(1418431454);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            final TicketStatusHeaderArgs ticketStatusHeaderArgs = new TicketStatusHeaderArgs("Bug", null, 2, null);
            IntercomThemeKt.IntercomTheme(null, null, null, androidx.compose.runtime.internal.a.b(10965256, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.components.TicketHeaderKt.TicketHeaderPreview.1
                @Override // Ia.p
                public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    invoke(interfaceC1084f2, num.intValue());
                    return p293xa.r.f47939a;
                }

                public final void invoke(InterfaceC1084f interfaceC1084f2, int i11) {
                    if ((i11 & 11) == 2 && interfaceC1084f2.s()) {
                        interfaceC1084f2.w();
                        return;
                    }
                    androidx.compose.ui.h hVarT = androidx.compose.foundation.layout.W.t(androidx.compose.ui.h.a.f13984b, null, 3);
                    final TicketStatusHeaderArgs ticketStatusHeaderArgs2 = ticketStatusHeaderArgs;
                    SurfaceKt.a(hVarT, null, 0L, 0L, 0.0f, 0.0f, null, androidx.compose.runtime.internal.a.b(34012515, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.components.TicketHeaderKt.TicketHeaderPreview.1.1
                        @Override // Ia.p
                        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f3, Integer num) {
                            invoke(interfaceC1084f3, num.intValue());
                            return p293xa.r.f47939a;
                        }

                        public final void invoke(InterfaceC1084f interfaceC1084f3, int i12) {
                            if ((i12 & 11) == 2 && interfaceC1084f3.s()) {
                                interfaceC1084f3.w();
                            } else {
                                TicketHeaderKt.TicketHeader(null, ticketStatusHeaderArgs2, interfaceC1084f3, 0, 1);
                            }
                        }
                    }, interfaceC1084f2), interfaceC1084f2, 12582918, R.styleable.AppCompatTheme_windowNoTitle);
                }
            }, c1086gP), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new C2272c(i10, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r TicketHeaderPreview$lambda$3(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        TicketHeaderPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }
}
