package com.voltasit.obdeleven.presentation.dialogs.checkNetwork;

import I.b;
import Ia.a;
import Ia.p;
import androidx.compose.animation.k;
import androidx.compose.foundation.interaction.l;
import androidx.compose.foundation.layout.C0945e;
import androidx.compose.foundation.layout.C0952l;
import androidx.compose.foundation.layout.C0953m;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material.AndroidAlertDialog_androidKt;
import androidx.compose.material.C1034j;
import androidx.compose.material.ColorsKt;
import androidx.compose.material.RippleKt;
import androidx.compose.material.SurfaceKt;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.R0;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.d;
import androidx.compose.ui.h;
import androidx.compose.ui.node.ComposeUiNode;
import kotlin.jvm.internal.i;
import me.zhanghai.android.materialprogressbar.R;
import p293xa.r;

/* JADX INFO: compiled from: CheckNetworkDialog.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class CheckNetworkDialogKt {
    public static final void a(final a<r> onTryAgain, final a<r> onCancel, InterfaceC1084f interfaceC1084f, final int i10) {
        int i11;
        i.e(onTryAgain, "onTryAgain");
        i.e(onCancel, "onCancel");
        C1086g c1086gP = interfaceC1084f.p(347236120);
        if ((i10 & 14) == 0) {
            i11 = (c1086gP.k(onTryAgain) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i11 |= c1086gP.k(onCancel) ? 32 : 16;
        }
        if ((i11 & 91) == 18 && c1086gP.s()) {
            c1086gP.w();
        } else {
            AndroidAlertDialog_androidKt.a(new a<r>() { // from class: com.voltasit.obdeleven.presentation.dialogs.checkNetwork.CheckNetworkDialogKt$CheckNetworkConnection$1
                @Override // Ia.a
                public final /* bridge */ /* synthetic */ r invoke() {
                    return r.f47939a;
                }
            }, androidx.compose.runtime.internal.a.b(1997061584, new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.dialogs.checkNetwork.CheckNetworkDialogKt$CheckNetworkConnection$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                    if ((num.intValue() & 11) == 2 && interfaceC1084f3.s()) {
                        interfaceC1084f3.w();
                    } else {
                        h hVarJ = PaddingKt.j(h.a.f13984b, 0.0f, 0.0f, 0.0f, 6, 7);
                        final a<r> aVar = onTryAgain;
                        C0953m c0953mA = C0952l.a(C0945e.f10286c, d.a.f13346m, interfaceC1084f3, 0);
                        int iF = interfaceC1084f3.F();
                        InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                        h hVarC = ComposedModifierKt.c(interfaceC1084f3, hVarJ);
                        ComposeUiNode.f14331c0.getClass();
                        a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f14333b;
                        if (interfaceC1084f3.u() == null) {
                            b.k();
                            throw null;
                        }
                        interfaceC1084f3.r();
                        if (interfaceC1084f3.m()) {
                            interfaceC1084f3.v(aVar2);
                        } else {
                            interfaceC1084f3.A();
                        }
                        R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, c0953mA);
                        R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                        p<ComposeUiNode, Integer, r> pVar = ComposeUiNode.Companion.f14338g;
                        if (interfaceC1084f3.m() || !i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                            k.b(iF, interfaceC1084f3, iF, pVar);
                        }
                        R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                        RippleKt.a(0.0f, 3, U.a.a(interfaceC1084f3, com.voltasit.obdeleven.R.color.grey_l));
                        interfaceC1084f3.L(-1234924211);
                        boolean zK = interfaceC1084f3.K(aVar);
                        Object objF = interfaceC1084f3.f();
                        InterfaceC1084f.a.C0153a c0153a = InterfaceC1084f.a.f12980a;
                        if (zK || objF == c0153a) {
                            objF = new a<r>() { // from class: com.voltasit.obdeleven.presentation.dialogs.checkNetwork.CheckNetworkDialogKt$CheckNetworkConnection$2$1$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // Ia.a
                                public final r invoke() {
                                    aVar.invoke();
                                    return r.f47939a;
                                }
                            };
                            interfaceC1084f3.E(objF);
                        }
                        a aVar3 = (a) objF;
                        interfaceC1084f3.D();
                        long jE = ((C1034j) interfaceC1084f3.x(ColorsKt.f11693a)).e();
                        interfaceC1084f3.L(-1234924093);
                        Object objF2 = interfaceC1084f3.f();
                        if (objF2 == c0153a) {
                            objF2 = new l();
                            interfaceC1084f3.E(objF2);
                        }
                        interfaceC1084f3.D();
                        SurfaceKt.b(aVar3, null, false, null, jE, 0L, null, 0.0f, (androidx.compose.foundation.interaction.k) objF2, ComposableSingletons$CheckNetworkDialogKt.f32231a, interfaceC1084f3, 905969664, 238);
                        interfaceC1084f3.J();
                    }
                    return r.f47939a;
                }
            }, c1086gP), null, androidx.compose.runtime.internal.a.b(-198167282, new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.dialogs.checkNetwork.CheckNetworkDialogKt$CheckNetworkConnection$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                    if ((num.intValue() & 11) == 2 && interfaceC1084f3.s()) {
                        interfaceC1084f3.w();
                    } else {
                        h hVarJ = PaddingKt.j(h.a.f13984b, 0.0f, 0.0f, 0.0f, 6, 7);
                        final a<r> aVar = onCancel;
                        C0953m c0953mA = C0952l.a(C0945e.f10286c, d.a.f13346m, interfaceC1084f3, 0);
                        int iF = interfaceC1084f3.F();
                        InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                        h hVarC = ComposedModifierKt.c(interfaceC1084f3, hVarJ);
                        ComposeUiNode.f14331c0.getClass();
                        a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f14333b;
                        if (interfaceC1084f3.u() == null) {
                            b.k();
                            throw null;
                        }
                        interfaceC1084f3.r();
                        if (interfaceC1084f3.m()) {
                            interfaceC1084f3.v(aVar2);
                        } else {
                            interfaceC1084f3.A();
                        }
                        R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, c0953mA);
                        R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                        p<ComposeUiNode, Integer, r> pVar = ComposeUiNode.Companion.f14338g;
                        if (interfaceC1084f3.m() || !i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                            k.b(iF, interfaceC1084f3, iF, pVar);
                        }
                        R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                        RippleKt.a(0.0f, 3, U.a.a(interfaceC1084f3, com.voltasit.obdeleven.R.color.grey_l));
                        interfaceC1084f3.L(-1234923432);
                        boolean zK = interfaceC1084f3.K(aVar);
                        Object objF = interfaceC1084f3.f();
                        InterfaceC1084f.a.C0153a c0153a = InterfaceC1084f.a.f12980a;
                        if (zK || objF == c0153a) {
                            objF = new a<r>() { // from class: com.voltasit.obdeleven.presentation.dialogs.checkNetwork.CheckNetworkDialogKt$CheckNetworkConnection$3$1$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // Ia.a
                                public final r invoke() {
                                    aVar.invoke();
                                    return r.f47939a;
                                }
                            };
                            interfaceC1084f3.E(objF);
                        }
                        a aVar3 = (a) objF;
                        interfaceC1084f3.D();
                        long jE = ((C1034j) interfaceC1084f3.x(ColorsKt.f11693a)).e();
                        interfaceC1084f3.L(-1234923316);
                        Object objF2 = interfaceC1084f3.f();
                        if (objF2 == c0153a) {
                            objF2 = new l();
                            interfaceC1084f3.E(objF2);
                        }
                        interfaceC1084f3.D();
                        SurfaceKt.b(aVar3, null, false, null, jE, 0L, null, 0.0f, (androidx.compose.foundation.interaction.k) objF2, ComposableSingletons$CheckNetworkDialogKt.f32232b, interfaceC1084f3, 905969664, 238);
                        interfaceC1084f3.J();
                    }
                    return r.f47939a;
                }
            }, c1086gP), ComposableSingletons$CheckNetworkDialogKt.f32233c, ComposableSingletons$CheckNetworkDialogKt.f32234d, null, ((C1034j) c1086gP.x(ColorsKt.f11693a)).e(), 0L, null, c1086gP, 224310, 836);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.dialogs.checkNetwork.CheckNetworkDialogKt$CheckNetworkConnection$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    CheckNetworkDialogKt.a(onTryAgain, onCancel, interfaceC1084f2, L4.b.l(i10 | 1));
                    return r.f47939a;
                }
            };
        }
    }
}
