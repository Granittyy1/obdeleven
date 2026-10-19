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
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.S;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.W;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.foundation.layout.c0;
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
import androidx.compose.ui.f;
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

/* JADX INFO: compiled from: UltimateUpsellDialog.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class UltimateUpsellDialogKt {
    public static final void a(final List<C0706h> creditProducts, final l<? super C0706h, r> onBuyClick, final Ia.a<r> onDismiss, InterfaceC1084f interfaceC1084f, final int i10) {
        i.e(creditProducts, "creditProducts");
        i.e(onBuyClick, "onBuyClick");
        i.e(onDismiss, "onDismiss");
        C1086g c1086gP = interfaceC1084f.p(227798568);
        c1086gP.L(84491620);
        Object objF = c1086gP.f();
        if (objF == InterfaceC1084f.a.f12980a) {
            Iterator<C0706h> it = creditProducts.iterator();
            int i11 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i11 = -1;
                    break;
                } else if (n.J(it.next().f3498a, "5000", true)) {
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
        SurfaceKt.a(W.f10226c, null, d.e(4278190080L), 0L, 0.0f, 0.0f, null, androidx.compose.runtime.internal.a.b(250845827, new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.ui.dialogs.fakeadapty.UltimateUpsellDialogKt$UltimateUpsellDialogContent$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // Ia.p
            public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                Ia.a<ComposeUiNode> aVar;
                p<ComposeUiNode, Integer, r> pVar;
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
                    final List<C0706h> list = creditProducts;
                    Ia.a<r> aVar3 = onDismiss;
                    V v12 = v10;
                    final l<C0706h, r> lVar = onBuyClick;
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
                    p<ComposeUiNode, E, r> pVar2 = ComposeUiNode.Companion.f14337f;
                    R0.a(pVar2, interfaceC1084f3, c0953mA);
                    p<ComposeUiNode, androidx.compose.runtime.r, r> pVar3 = ComposeUiNode.Companion.f14336e;
                    R0.a(pVar3, interfaceC1084f3, interfaceC1089h0Z);
                    p<ComposeUiNode, Integer, r> pVar4 = ComposeUiNode.Companion.f14338g;
                    if (interfaceC1084f3.m() || !i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                        k.b(iF, interfaceC1084f3, iF, pVar4);
                    }
                    p<ComposeUiNode, h, r> pVar5 = ComposeUiNode.Companion.f14335d;
                    R0.a(pVar5, interfaceC1084f3, hVarC);
                    float f11 = 24;
                    float f12 = 16;
                    h hVarJ = PaddingKt.j(W.d(aVar2, 1.0f), f12, f11, 0.0f, 0.0f, 12);
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
                    R0.a(pVar2, interfaceC1084f3, tA);
                    R0.a(pVar3, interfaceC1084f3, interfaceC1089h0Z2);
                    if (interfaceC1084f3.m() || !i.a(interfaceC1084f3.f(), Integer.valueOf(iF2))) {
                        k.b(iF2, interfaceC1084f3, iF2, pVar4);
                    }
                    R0.a(pVar5, interfaceC1084f3, hVarC2);
                    IconButtonKt.b(aVar3, W.m(aVar2, 32), false, null, null, ComposableSingletons$UltimateUpsellDialogKt.f33944a, interfaceC1084f3, 196656, 28);
                    interfaceC1084f3.J();
                    h hVarJ2 = PaddingKt.j(W.d(aVar2, 1.0f), 0.0f, f11, 0.0f, 0.0f, 13);
                    T tA2 = S.a(C0945e.f10288e, androidx.compose.ui.d.a.j, interfaceC1084f3, 6);
                    int iF3 = interfaceC1084f3.F();
                    InterfaceC1089h0 interfaceC1089h0Z3 = interfaceC1084f3.z();
                    h hVarC3 = ComposedModifierKt.c(interfaceC1084f3, hVarJ2);
                    if (interfaceC1084f3.u() == null) {
                        b.k();
                        throw null;
                    }
                    interfaceC1084f3.r();
                    if (interfaceC1084f3.m()) {
                        aVar = aVar4;
                        interfaceC1084f3.v(aVar);
                    } else {
                        aVar = aVar4;
                        interfaceC1084f3.A();
                    }
                    R0.a(pVar2, interfaceC1084f3, tA2);
                    R0.a(pVar3, interfaceC1084f3, interfaceC1089h0Z3);
                    if (interfaceC1084f3.m() || !i.a(interfaceC1084f3.f(), Integer.valueOf(iF3))) {
                        pVar = pVar4;
                        k.b(iF3, interfaceC1084f3, iF3, pVar);
                    } else {
                        pVar = pVar4;
                    }
                    R0.a(pVar5, interfaceC1084f3, hVarC3);
                    h hVarR = A8.p.r(W.m(aVar2, 64), g.f47680a);
                    E eD = BoxKt.d(androidx.compose.ui.d.a.f13339e, false);
                    int iF4 = interfaceC1084f3.F();
                    InterfaceC1089h0 interfaceC1089h0Z4 = interfaceC1084f3.z();
                    h hVarC4 = ComposedModifierKt.c(interfaceC1084f3, hVarR);
                    if (interfaceC1084f3.u() == null) {
                        b.k();
                        throw null;
                    }
                    interfaceC1084f3.r();
                    if (interfaceC1084f3.m()) {
                        interfaceC1084f3.v(aVar);
                    } else {
                        interfaceC1084f3.A();
                    }
                    R0.a(pVar2, interfaceC1084f3, eD);
                    R0.a(pVar3, interfaceC1084f3, interfaceC1089h0Z4);
                    if (interfaceC1084f3.m() || !i.a(interfaceC1084f3.f(), Integer.valueOf(iF4))) {
                        k.b(iF4, interfaceC1084f3, iF4, pVar);
                    }
                    R0.a(pVar5, interfaceC1084f3, hVarC4);
                    Painter painterA = c.a(R.drawable.ic_credit, interfaceC1084f3, 6);
                    long j = H.f13499f;
                    IconKt.a(painterA, "Logo", W.m(aVar2, 60), j, interfaceC1084f3, 3512, 0);
                    interfaceC1084f3.J();
                    interfaceC1084f3.J();
                    TextKt.b("You reached the limit for One-Click Apps", PaddingKt.g(f11, f12, aVar2), j, G0.a.g(34), null, androidx.compose.ui.text.font.l.j, null, 0L, null, new androidx.compose.ui.text.style.g(3), G0.a.g(36), 0, false, 0, 0, null, null, interfaceC1084f3, 200118, 6, 129488);
                    Lb.a.a(interfaceC1084f3, W.e(aVar2, f12));
                    TextKt.b("Your ULTIMATE plan lets you use One-Click Apps free of charge within fair-use limits, set to ensure fair access for all users. You’ve gone beyond what’s considered standard for individual use, so access is paused.", PaddingKt.h(aVar2, f11, 0.0f, 2), d.e(4289769648L), G0.a.g(18), null, null, null, 0L, null, new androidx.compose.ui.text.style.g(5), G0.a.g(18), 0, false, 0, 0, null, null, interfaceC1084f3, 3510, 6, 129520);
                    UltimateUpsellDialogKt.b("To keep using One-Click Apps:", kotlin.collections.l.s("Wait until the plan ends and renew to reset the limit", "Buy extra Credits to continue right away"), null, interfaceC1084f3, 54, 4);
                    int iO = v12.o();
                    interfaceC1084f3.L(1640620543);
                    Object objF2 = interfaceC1084f3.f();
                    if (objF2 == InterfaceC1084f.a.f12980a) {
                        v11 = v12;
                        objF2 = new l<Integer, r>() { // from class: com.voltasit.obdeleven.ui.dialogs.fakeadapty.UltimateUpsellDialogKt$UltimateUpsellDialogContent$1$1$3$1
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
                    ProductsSectionKt.a(list, iO, (l) objF2, null, null, new l<C0706h, Boolean>() { // from class: com.voltasit.obdeleven.ui.dialogs.fakeadapty.UltimateUpsellDialogKt$UltimateUpsellDialogContent$1$1$4
                        @Override // Ia.l
                        public final Boolean invoke(C0706h c0706h) {
                            C0706h it2 = c0706h;
                            i.e(it2, "it");
                            return Boolean.valueOf(n.J(it2.f3498a, "5000", true));
                        }
                    }, new l<C0706h, String>() { // from class: com.voltasit.obdeleven.ui.dialogs.fakeadapty.UltimateUpsellDialogKt$UltimateUpsellDialogContent$1$1$5
                        @Override // Ia.l
                        public final String invoke(C0706h c0706h) {
                            C0706h it2 = c0706h;
                            i.e(it2, "it");
                            int i12 = it2.f3500c;
                            if (i12 == 1000) {
                                return "Top value pack";
                            }
                            if (i12 != 5000) {
                                return i12 != 10000 ? "" : "Perfect starter pack";
                            }
                            return "Get more for less";
                        }
                    }, interfaceC1084f3, 1769864, 24);
                    DockedButtonKt.a("Top up Credits", v11.o() >= 0 && v11.o() < list.size(), new Ia.a<r>() { // from class: com.voltasit.obdeleven.ui.dialogs.fakeadapty.UltimateUpsellDialogKt$UltimateUpsellDialogContent$1$1$6
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(0);
                        }

                        @Override // Ia.a
                        public final r invoke() {
                            lVar.invoke(list.get(v11.o()));
                            return r.f47939a;
                        }
                    }, aVar3, interfaceC1084f3, 6);
                    interfaceC1084f3.J();
                }
                return r.f47939a;
            }
        }, c1086gP), c1086gP, 12583302, me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_windowFixedWidthMajor);
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.ui.dialogs.fakeadapty.UltimateUpsellDialogKt$UltimateUpsellDialogContent$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    UltimateUpsellDialogKt.a(creditProducts, onBuyClick, onDismiss, interfaceC1084f2, L4.b.l(i10 | 1));
                    return r.f47939a;
                }
            };
        }
    }

    public static final void b(final String str, final List list, h hVar, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        C1086g c1086gP = interfaceC1084f.p(2113567325);
        int i12 = i11 & 4;
        h.a aVar = h.a.f13984b;
        h hVar2 = i12 != 0 ? aVar : hVar;
        h hVarG = PaddingKt.g(24, 16, W.d(hVar2, 1.0f));
        C0953m c0953mA = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, c1086gP, 0);
        int i13 = c1086gP.f12996P;
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
        R0.a(ComposeUiNode.Companion.f14337f, c1086gP, c0953mA);
        R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P);
        p<ComposeUiNode, Integer, r> pVar = ComposeUiNode.Companion.f14338g;
        if (c1086gP.f12995O || !i.a(c1086gP.f(), Integer.valueOf(i13))) {
            J4.i.d(i13, c1086gP, i13, pVar);
        }
        R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC);
        final h hVar3 = hVar2;
        TextKt.b(str, null, H.f13499f, G0.a.g(20), null, androidx.compose.ui.text.font.l.j, null, 0L, null, new androidx.compose.ui.text.style.g(5), 0L, 0, false, 0, 0, null, null, c1086gP, (i10 & 14) | 200064, 0, 130514);
        h.a aVar3 = aVar;
        Lb.a.a(c1086gP, W.e(aVar3, 14));
        c1086gP.L(706257236);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            f.b bVar = androidx.compose.ui.d.a.j;
            h hVarH = PaddingKt.h(aVar3, 0.0f, 4, 1);
            T tA = S.a(C0945e.f10284a, bVar, c1086gP, 48);
            int i14 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P2 = c1086gP.P();
            h hVarC2 = ComposedModifierKt.c(c1086gP, hVarH);
            ComposeUiNode.f14331c0.getClass();
            Ia.a<ComposeUiNode> aVar4 = ComposeUiNode.Companion.f14333b;
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar4);
            } else {
                c1086gP.A();
            }
            R0.a(ComposeUiNode.Companion.f14337f, c1086gP, tA);
            R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P2);
            p<ComposeUiNode, Integer, r> pVar2 = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O || !i.a(c1086gP.f(), Integer.valueOf(i14))) {
                J4.i.d(i14, c1086gP, i14, pVar2);
            }
            R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC2);
            float f10 = 8;
            BoxKt.a(C0932d.b(A8.p.r(W.m(PaddingKt.j(aVar3, 0.0f, 6, 0.0f, 0.0f, 13), f10), g.f47680a), d.e(4278219007L), h0.f13629a), c1086gP, 0);
            Lb.a.a(c1086gP, W.q(aVar3, f10));
            TextKt.b(str2, null, H.f13499f, G0.a.g(18), null, null, null, 0L, null, null, G0.a.g(18), 0, false, 0, 0, null, null, c1086gP, 3456, 6, 130034);
            c1086gP.T(true);
            aVar3 = aVar3;
        }
        C1105p0 c1105p0A = C4.a.a(c1086gP, false, true);
        if (c1105p0A != null) {
            c1105p0A.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.ui.dialogs.fakeadapty.UltimateUpsellDialogKt$BulletPointTextRow$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    UltimateUpsellDialogKt.b(str, list, hVar3, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                    return r.f47939a;
                }
            };
        }
    }
}
