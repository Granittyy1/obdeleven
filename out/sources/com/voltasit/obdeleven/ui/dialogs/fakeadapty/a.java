package com.voltasit.obdeleven.ui.dialogs.fakeadapty;

import G8.C0706h;
import I.b;
import Ia.l;
import Ia.p;
import Q3.d;
import U.c;
import android.view.View;
import androidx.compose.animation.k;
import androidx.compose.foundation.C0932d;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.C0945e;
import androidx.compose.foundation.layout.C0952l;
import androidx.compose.foundation.layout.C0953m;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.S;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.W;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.foundation.layout.c0;
import androidx.compose.material3.DividerKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.C1081d0;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.R0;
import androidx.compose.runtime.V;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.graphics.H;
import androidx.compose.ui.graphics.h0;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.h;
import androidx.compose.ui.layout.E;
import androidx.compose.ui.node.ComposeUiNode;
import com.voltasit.obdeleven.R;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.jvm.internal.i;
import kotlin.text.n;
import p270w.g;
import p293xa.r;

/* JADX INFO: compiled from: BuyCreditsDialog.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class a {
    public static final void a(final List list, final l lVar, final Ia.a aVar, InterfaceC1084f interfaceC1084f, final int i10) {
        C1086g c1086gP = interfaceC1084f.p(-1389318404);
        c1086gP.L(896394276);
        Object objF = c1086gP.f();
        if (objF == InterfaceC1084f.a.f12980a) {
            Iterator it = list.iterator();
            int i11 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i11 = -1;
                    break;
                } else if (n.J(((C0706h) it.next()).f3498a, "100", true)) {
                    break;
                } else {
                    i11++;
                }
            }
            Integer numValueOf = Integer.valueOf(i11);
            if (i11 < 0) {
                numValueOf = null;
            }
            C1081d0 c1081d0 = new C1081d0(numValueOf != null ? numValueOf.intValue() : 0);
            c1086gP.E(c1081d0);
            objF = c1081d0;
        }
        final V v10 = (V) objF;
        c1086gP.T(false);
        SurfaceKt.a(W.f10226c, null, d.e(4278190080L), 0L, 0.0f, 0.0f, null, androidx.compose.runtime.internal.a.b(694412887, new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.ui.dialogs.fakeadapty.BuyCreditsDialogKt$BuyCreditsDialogContent$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // Ia.p
            public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                final V v11;
                InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                if ((num.intValue() & 11) == 2 && interfaceC1084f3.s()) {
                    interfaceC1084f3.w();
                } else {
                    h.a aVar2 = h.a.f13984b;
                    h hVarB = ScrollKt.b(W.f10226c, ScrollKt.a(0, interfaceC1084f3, 0, 1), false, 14);
                    WeakHashMap<View, c0> weakHashMap = c0.f10254v;
                    float f10 = 0;
                    h hVarG = PaddingKt.g(f10, f10, WindowInsetsPaddingKt.c(hVarB, c0.a.c(interfaceC1084f3).f10264k));
                    final List<C0706h> list2 = list;
                    Ia.a<r> aVar3 = aVar;
                    V v12 = v10;
                    final l<C0706h, r> lVar2 = lVar;
                    C0953m c0953mA = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, interfaceC1084f3, 0);
                    int iF = interfaceC1084f3.F();
                    InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                    h hVarC = ComposedModifierKt.c(interfaceC1084f3, hVarG);
                    ComposeUiNode.f14331c0.getClass();
                    Ia.a<ComposeUiNode> aVar4 = ComposeUiNode.Companion.f14333b;
                    if (interfaceC1084f3.u() == null) {
                        b.k();
                        throw null;
                    }
                    interfaceC1084f3.r();
                    if (interfaceC1084f3.m()) {
                        interfaceC1084f3.v(aVar4);
                    } else {
                        interfaceC1084f3.A();
                    }
                    p<ComposeUiNode, E, r> pVar = ComposeUiNode.Companion.f14337f;
                    R0.a(pVar, interfaceC1084f3, c0953mA);
                    p<ComposeUiNode, androidx.compose.runtime.r, r> pVar2 = ComposeUiNode.Companion.f14336e;
                    R0.a(pVar2, interfaceC1084f3, interfaceC1089h0Z);
                    p<ComposeUiNode, Integer, r> pVar3 = ComposeUiNode.Companion.f14338g;
                    if (interfaceC1084f3.m() || !i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                        k.b(iF, interfaceC1084f3, iF, pVar3);
                    }
                    p<ComposeUiNode, h, r> pVar4 = ComposeUiNode.Companion.f14335d;
                    R0.a(pVar4, interfaceC1084f3, hVarC);
                    float f11 = 24;
                    float f12 = 16;
                    h hVarJ = PaddingKt.j(W.d(aVar2, 1.0f), f12, f11, f12, 0.0f, 8);
                    T tA = S.a(C0945e.f10284a, androidx.compose.ui.d.a.f13344k, interfaceC1084f3, 48);
                    int iF2 = interfaceC1084f3.F();
                    InterfaceC1089h0 interfaceC1089h0Z2 = interfaceC1084f3.z();
                    h hVarC2 = ComposedModifierKt.c(interfaceC1084f3, hVarJ);
                    if (interfaceC1084f3.u() == null) {
                        b.k();
                        throw null;
                    }
                    interfaceC1084f3.r();
                    if (interfaceC1084f3.m()) {
                        interfaceC1084f3.v(aVar4);
                    } else {
                        interfaceC1084f3.A();
                    }
                    R0.a(pVar, interfaceC1084f3, tA);
                    R0.a(pVar2, interfaceC1084f3, interfaceC1089h0Z2);
                    if (interfaceC1084f3.m() || !i.a(interfaceC1084f3.f(), Integer.valueOf(iF2))) {
                        k.b(iF2, interfaceC1084f3, iF2, pVar3);
                    }
                    R0.a(pVar4, interfaceC1084f3, hVarC2);
                    androidx.compose.foundation.layout.V v13 = androidx.compose.foundation.layout.V.f10222a;
                    float f13 = 32;
                    IconButtonKt.b(aVar3, W.m(aVar2, f13), false, null, null, ComposableSingletons$BuyCreditsDialogKt.f33942a, interfaceC1084f3, 196656, 28);
                    Lb.a.a(interfaceC1084f3, v13.b(aVar2, true));
                    h hVarB2 = C0932d.b(A8.p.r(W.m(aVar2, 40), g.f47680a), d.e(4280427042L), h0.f13629a);
                    E eD = BoxKt.d(androidx.compose.ui.d.a.f13339e, false);
                    int iF3 = interfaceC1084f3.F();
                    InterfaceC1089h0 interfaceC1089h0Z3 = interfaceC1084f3.z();
                    h hVarC3 = ComposedModifierKt.c(interfaceC1084f3, hVarB2);
                    if (interfaceC1084f3.u() == null) {
                        b.k();
                        throw null;
                    }
                    interfaceC1084f3.r();
                    if (interfaceC1084f3.m()) {
                        interfaceC1084f3.v(aVar4);
                    } else {
                        interfaceC1084f3.A();
                    }
                    R0.a(pVar, interfaceC1084f3, eD);
                    R0.a(pVar2, interfaceC1084f3, interfaceC1089h0Z3);
                    if (interfaceC1084f3.m() || !i.a(interfaceC1084f3.f(), Integer.valueOf(iF3))) {
                        k.b(iF3, interfaceC1084f3, iF3, pVar3);
                    }
                    R0.a(pVar4, interfaceC1084f3, hVarC3);
                    Painter painterA = c.a(R.drawable.ic_credit, interfaceC1084f3, 6);
                    long j = H.f13499f;
                    IconKt.a(painterA, "Logo", W.m(aVar2, 28), j, interfaceC1084f3, 3512, 0);
                    interfaceC1084f3.J();
                    Lb.a.a(interfaceC1084f3, v13.b(aVar2, true));
                    Lb.a.a(interfaceC1084f3, W.m(aVar2, f13));
                    interfaceC1084f3.J();
                    Lb.a.a(interfaceC1084f3, W.e(aVar2, f11));
                    TextKt.b("Top up Credits & unlock hidden features in seconds", PaddingKt.h(aVar2, f11, 0.0f, 2), j, G0.a.g(24), null, androidx.compose.ui.text.font.l.j, null, 0L, null, new androidx.compose.ui.text.style.g(5), 0L, 0, false, 0, 0, null, null, interfaceC1084f3, 200118, 0, 130512);
                    Lb.a.a(interfaceC1084f3, W.e(aVar2, f12));
                    TextKt.b("Want your car to greet you with ambient lights? Or close windows with your key fob? Say no more – just a few taps and it's done.", PaddingKt.h(aVar2, f11, 0.0f, 2), d.e(4289769648L), G0.a.g(16), null, null, null, 0L, null, new androidx.compose.ui.text.style.g(5), G0.a.g(16), 0, false, 0, 0, null, null, interfaceC1084f3, 3510, 6, 129520);
                    Lb.a.a(interfaceC1084f3, W.e(aVar2, f11));
                    a.b(c.a(R.drawable.ic_credits, interfaceC1084f3, 6), d.e(4280908287L), "Get Credits", "It's your in-app currency for activating pre-made coding options – One-Click Apps", interfaceC1084f3, 3512);
                    a.b(c.a(R.drawable.ic_oca, interfaceC1084f3, 6), d.e(4280908287L), "Activate One-Click Apps", "Pick a feature and use your Credits to activate it instantly", interfaceC1084f3, 3512);
                    a.b(c.a(R.drawable.ic_car_check, interfaceC1084f3, 6), d.e(4280908287L), "Enjoy your upgraded car", "More convenience, more control – no special tools or mechanic needed", interfaceC1084f3, 3512);
                    Lb.a.a(interfaceC1084f3, W.e(aVar2, f11));
                    DividerKt.a(PaddingKt.h(aVar2, f11, 0.0f, 2), 1, d.e(4280427042L), interfaceC1084f3, 438, 0);
                    Lb.a.a(interfaceC1084f3, W.e(aVar2, f11));
                    int iO = v12.o();
                    interfaceC1084f3.L(1818864239);
                    Object objF2 = interfaceC1084f3.f();
                    if (objF2 == InterfaceC1084f.a.f12980a) {
                        v11 = v12;
                        objF2 = new l<Integer, r>() { // from class: com.voltasit.obdeleven.ui.dialogs.fakeadapty.BuyCreditsDialogKt$BuyCreditsDialogContent$1$1$2$1
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final r invoke(Integer num2) {
                                v11.m(num2.intValue());
                                return r.f47939a;
                            }
                        };
                        interfaceC1084f3.E(objF2);
                    } else {
                        v11 = v12;
                    }
                    interfaceC1084f3.D();
                    ProductsSectionKt.a(list2, iO, (l) objF2, "Choose your Credit bundle", "Pay only for the features you need, whenever you need them", new l<C0706h, Boolean>() { // from class: com.voltasit.obdeleven.ui.dialogs.fakeadapty.BuyCreditsDialogKt$BuyCreditsDialogContent$1$1$3
                        @Override // Ia.l
                        public final Boolean invoke(C0706h c0706h) {
                            C0706h it2 = c0706h;
                            i.e(it2, "it");
                            return Boolean.valueOf(n.J(it2.f3498a, "100", true));
                        }
                    }, new l<C0706h, String>() { // from class: com.voltasit.obdeleven.ui.dialogs.fakeadapty.BuyCreditsDialogKt$BuyCreditsDialogContent$1$1$4
                        @Override // Ia.l
                        public final String invoke(C0706h c0706h) {
                            C0706h it2 = c0706h;
                            i.e(it2, "it");
                            int i12 = it2.f3500c;
                            return i12 == 10 ? "One small upgrade" : J4.i.c(i12 / 10, "Up to ", " features");
                        }
                    }, interfaceC1084f3, 1797512, 0);
                    DockedButtonKt.a("Top up Credits", v11.o() >= 0 && v11.o() < list2.size(), new Ia.a<r>() { // from class: com.voltasit.obdeleven.ui.dialogs.fakeadapty.BuyCreditsDialogKt$BuyCreditsDialogContent$1$1$5
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(0);
                        }

                        @Override // Ia.a
                        public final r invoke() {
                            lVar2.invoke(list2.get(v11.o()));
                            return r.f47939a;
                        }
                    }, aVar3, interfaceC1084f3, 6);
                    Lb.a.a(interfaceC1084f3, W.e(aVar2, f13));
                    interfaceC1084f3.J();
                }
                return r.f47939a;
            }
        }, c1086gP), c1086gP, 12583302, me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_windowFixedWidthMajor);
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.ui.dialogs.fakeadapty.BuyCreditsDialogKt$BuyCreditsDialogContent$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    a.a(list, lVar, aVar, interfaceC1084f2, L4.b.l(i10 | 1));
                    return r.f47939a;
                }
            };
        }
    }

    public static final void b(final Painter painter, final long j, final String str, final String str2, InterfaceC1084f interfaceC1084f, final int i10) {
        C1086g c1086gP = interfaceC1084f.p(-359332192);
        h.a aVar = h.a.f13984b;
        h hVarG = PaddingKt.g(24, 8, W.d(aVar, 1.0f));
        T tA = S.a(C0945e.f10284a, androidx.compose.ui.d.a.j, c1086gP, 48);
        int i11 = c1086gP.f12996P;
        InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
        h hVarC = ComposedModifierKt.c(c1086gP, hVarG);
        ComposeUiNode.f14331c0.getClass();
        Ia.a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f14333b;
        c1086gP.r();
        if (c1086gP.f12995O) {
            c1086gP.v(aVar2);
        } else {
            c1086gP.A();
        }
        p<ComposeUiNode, E, r> pVar = ComposeUiNode.Companion.f14337f;
        R0.a(pVar, c1086gP, tA);
        p<ComposeUiNode, androidx.compose.runtime.r, r> pVar2 = ComposeUiNode.Companion.f14336e;
        R0.a(pVar2, c1086gP, interfaceC1089h0P);
        p<ComposeUiNode, Integer, r> pVar3 = ComposeUiNode.Companion.f14338g;
        if (c1086gP.f12995O || !i.a(c1086gP.f(), Integer.valueOf(i11))) {
            J4.i.d(i11, c1086gP, i11, pVar3);
        }
        p<ComposeUiNode, h, r> pVar4 = ComposeUiNode.Companion.f14335d;
        R0.a(pVar4, c1086gP, hVarC);
        h hVarB = C0932d.b(A8.p.r(W.m(aVar, 36), g.f47680a), H.b(0.1f, j), h0.f13629a);
        E eD = BoxKt.d(androidx.compose.ui.d.a.f13339e, false);
        int i12 = c1086gP.f12996P;
        InterfaceC1089h0 interfaceC1089h0P2 = c1086gP.P();
        h hVarC2 = ComposedModifierKt.c(c1086gP, hVarB);
        c1086gP.r();
        if (c1086gP.f12995O) {
            c1086gP.v(aVar2);
        } else {
            c1086gP.A();
        }
        R0.a(pVar, c1086gP, eD);
        R0.a(pVar2, c1086gP, interfaceC1089h0P2);
        if (c1086gP.f12995O || !i.a(c1086gP.f(), Integer.valueOf(i12))) {
            J4.i.d(i12, c1086gP, i12, pVar3);
        }
        R0.a(pVar4, c1086gP, hVarC2);
        IconKt.a(painter, null, W.m(aVar, 22), j, c1086gP, ((i10 << 6) & 7168) | 440, 0);
        c1086gP.T(true);
        Lb.a.a(c1086gP, W.q(aVar, 16));
        if (1.0f <= 0.0d) {
            p258v.a.a("invalid weight; must be greater than zero");
        }
        LayoutWeightElement layoutWeightElement = new LayoutWeightElement(true, Na.l.z(1.0f, Float.MAX_VALUE));
        C0953m c0953mA = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, c1086gP, 0);
        int i13 = c1086gP.f12996P;
        InterfaceC1089h0 interfaceC1089h0P3 = c1086gP.P();
        h hVarC3 = ComposedModifierKt.c(c1086gP, layoutWeightElement);
        c1086gP.r();
        if (c1086gP.f12995O) {
            c1086gP.v(aVar2);
        } else {
            c1086gP.A();
        }
        R0.a(pVar, c1086gP, c0953mA);
        R0.a(pVar2, c1086gP, interfaceC1089h0P3);
        if (c1086gP.f12995O || !i.a(c1086gP.f(), Integer.valueOf(i13))) {
            J4.i.d(i13, c1086gP, i13, pVar3);
        }
        R0.a(pVar4, c1086gP, hVarC3);
        TextKt.b(str, null, H.f13499f, G0.a.g(16), null, androidx.compose.ui.text.font.l.f15444i, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, ((i10 >> 6) & 14) | 200064, 0, 131026);
        TextKt.b(str2, null, d.e(4289769648L), G0.a.g(13), null, null, null, 0L, null, null, G0.a.g(13), 0, false, 0, 0, null, null, c1086gP, ((i10 >> 9) & 14) | 3456, 6, 130034);
        C1105p0 c1105p0A = C4.a.a(c1086gP, true, true);
        if (c1105p0A != null) {
            c1105p0A.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.ui.dialogs.fakeadapty.BuyCreditsDialogKt$FeatureRow$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    a.b(painter, j, str, str2, interfaceC1084f2, L4.b.l(i10 | 1));
                    return r.f47939a;
                }
            };
        }
    }
}
