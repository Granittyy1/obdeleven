package com.voltasit.obdeleven.presentation.dialogs;

import Ia.p;
import S4.o;
import androidx.compose.foundation.layout.C0945e;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.S;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.W;
import androidx.compose.material.C1034j;
import androidx.compose.material.ColorsKt;
import androidx.compose.material.I;
import androidx.compose.material.N;
import androidx.compose.material.ShapesKt;
import androidx.compose.material.SurfaceKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.R0;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.font.l;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.presentation.models.PreloaderState;
import p293xa.r;

/* JADX INFO: compiled from: LoaderDialog.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class LoaderDialogKt {
    public static final void a(final PreloaderState loaderState, InterfaceC1084f interfaceC1084f, final int i10) {
        int i11;
        final String strP;
        kotlin.jvm.internal.i.e(loaderState, "loaderState");
        C1086g c1086gP = interfaceC1084f.p(-192343967);
        if ((i10 & 14) == 0) {
            i11 = (c1086gP.K(loaderState) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 11) == 2 && c1086gP.s()) {
            c1086gP.w();
        } else {
            if (loaderState.equals(PreloaderState.d.f32643a)) {
                C1105p0 c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.dialogs.LoaderDialogKt$LoaderDialog$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            LoaderDialogKt.a(loaderState, interfaceC1084f2, L4.b.l(i10 | 1));
                            return r.f47939a;
                        }
                    };
                    return;
                }
                return;
            }
            if (loaderState instanceof PreloaderState.b) {
                c1086gP.L(-94541313);
                c1086gP.T(false);
                strP = null;
            } else if (loaderState instanceof PreloaderState.a) {
                c1086gP.L(-94541269);
                strP = o.p(c1086gP, ((PreloaderState.a) loaderState).f32641a);
                c1086gP.T(false);
            } else {
                c1086gP.L(-94541212);
                strP = o.p(c1086gP, R.string.common_loading);
                c1086gP.T(false);
            }
            AndroidDialog_androidKt.a(new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.dialogs.LoaderDialogKt$LoaderDialog$2
                @Override // Ia.a
                public final /* bridge */ /* synthetic */ r invoke() {
                    return r.f47939a;
                }
            }, null, androidx.compose.runtime.internal.a.b(1616025720, new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.dialogs.LoaderDialogKt$LoaderDialog$3
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
                        p270w.a aVar = ((N) interfaceC1084f3.x(ShapesKt.f11807a)).f11776b;
                        long jC = ((C1034j) interfaceC1084f3.x(ColorsKt.f11693a)).c();
                        final String str = strP;
                        SurfaceKt.a(null, aVar, jC, 0L, null, 0.0f, androidx.compose.runtime.internal.a.b(864355508, new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.dialogs.LoaderDialogKt$LoaderDialog$3.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final r invoke(InterfaceC1084f interfaceC1084f4, Integer num2) {
                                InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                if ((num2.intValue() & 11) == 2 && interfaceC1084f5.s()) {
                                    interfaceC1084f5.w();
                                } else {
                                    androidx.compose.ui.h.a aVar2 = androidx.compose.ui.h.a.f13984b;
                                    androidx.compose.ui.h hVarD = W.d(aVar2, 1.0f);
                                    androidx.compose.ui.f.b bVar = androidx.compose.ui.d.a.f13344k;
                                    String str2 = str;
                                    T tA = S.a(C0945e.f10284a, bVar, interfaceC1084f5, 48);
                                    int iF = interfaceC1084f5.F();
                                    InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f5.z();
                                    androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f5, hVarD);
                                    ComposeUiNode.f14331c0.getClass();
                                    Ia.a<ComposeUiNode> aVar3 = ComposeUiNode.Companion.f14333b;
                                    if (interfaceC1084f5.u() == null) {
                                        I.b.k();
                                        throw null;
                                    }
                                    interfaceC1084f5.r();
                                    if (interfaceC1084f5.m()) {
                                        interfaceC1084f5.v(aVar3);
                                    } else {
                                        interfaceC1084f5.A();
                                    }
                                    R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f5, tA);
                                    R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f5, interfaceC1089h0Z);
                                    p<ComposeUiNode, Integer, r> pVar = ComposeUiNode.Companion.f14338g;
                                    if (interfaceC1084f5.m() || !kotlin.jvm.internal.i.a(interfaceC1084f5.f(), Integer.valueOf(iF))) {
                                        androidx.compose.animation.k.b(iF, interfaceC1084f5, iF, pVar);
                                    }
                                    R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f5, hVarC);
                                    I.a(PaddingKt.f(aVar2, 22), com.voltasit.obdeleven.presentation.e.a.f32288l, 0.0f, 0L, 0, 54, interfaceC1084f5, 28);
                                    TextKt.b(str2, null, 0L, G0.a.g(18), null, l.f15441f, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1084f5, 199680, 0, 131030);
                                    interfaceC1084f5.J();
                                }
                                return r.f47939a;
                            }
                        }, interfaceC1084f3), interfaceC1084f3, 1572864, 57);
                    }
                    return r.f47939a;
                }
            }, c1086gP), c1086gP, 390, 2);
        }
        C1105p0 c1105p0V2 = c1086gP.V();
        if (c1105p0V2 != null) {
            c1105p0V2.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.dialogs.LoaderDialogKt$LoaderDialog$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    LoaderDialogKt.a(loaderState, interfaceC1084f2, L4.b.l(i10 | 1));
                    return r.f47939a;
                }
            };
        }
    }
}
