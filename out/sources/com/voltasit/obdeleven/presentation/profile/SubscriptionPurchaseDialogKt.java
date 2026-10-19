package com.voltasit.obdeleven.presentation.profile;

import G8.A;
import Ia.p;
import Ia.q;
import S4.o;
import android.content.Context;
import androidx.compose.foundation.C0932d;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.C0945e;
import androidx.compose.foundation.layout.C0949i;
import androidx.compose.foundation.layout.C0952l;
import androidx.compose.foundation.layout.C0953m;
import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.S;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.U;
import androidx.compose.foundation.layout.W;
import androidx.compose.material.ButtonKt;
import androidx.compose.material.I;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.R0;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.graphics.h0;
import androidx.compose.ui.layout.E;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.D;
import com.voltasit.obdeleven.R;
import java.util.Arrays;
import kotlin.text.n;
import p293xa.r;

/* JADX INFO: compiled from: SubscriptionPurchaseDialog.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class SubscriptionPurchaseDialogKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f32887a = Q3.d.e(2566914048L);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f32888b = G0.a.g(16);

    /* JADX INFO: compiled from: SubscriptionPurchaseDialog.kt */
    public static final class a implements D, kotlin.jvm.internal.f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Ia.l f32889b;

        public a(Ia.l lVar) {
            this.f32889b = lVar;
        }

        @Override // kotlin.jvm.internal.f
        public final p293xa.e<?> b() {
            return this.f32889b;
        }

        @Override // androidx.lifecycle.D
        public final /* synthetic */ void d(Object obj) {
            this.f32889b.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof D) || !(obj instanceof kotlin.jvm.internal.f)) {
                return false;
            }
            return this.f32889b.equals(((kotlin.jvm.internal.f) obj).b());
        }

        public final int hashCode() {
            return this.f32889b.hashCode();
        }
    }

    public static final void a(final androidx.compose.ui.h hVar, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        int i12;
        C1086g c1086gP = interfaceC1084f.p(-918040963);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (c1086gP.K(hVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i12 & 11) == 2 && c1086gP.s()) {
            c1086gP.w();
        } else {
            if (i13 != 0) {
                hVar = androidx.compose.ui.h.a.f13984b;
            }
            ImageKt.a(U.c.a(R.drawable.ic_bullet_point, c1086gP, 6), null, W.m(hVar, 13), null, null, 0.0f, null, c1086gP, 56, me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_windowFixedHeightMajor);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.profile.SubscriptionPurchaseDialogKt$BulletPoint$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    SubscriptionPurchaseDialogKt.a(hVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                    return r.f47939a;
                }
            };
        }
    }

    public static final void b(final String str, InterfaceC1084f interfaceC1084f, final int i10) {
        int i11;
        C1086g c1086g;
        C1086g c1086gP = interfaceC1084f.p(1546314557);
        if ((i10 & 14) == 0) {
            i11 = (c1086gP.K(str) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 11) == 2 && c1086gP.s()) {
            c1086gP.w();
            c1086g = c1086gP;
        } else {
            androidx.compose.ui.h.a aVar = androidx.compose.ui.h.a.f13984b;
            T tA = S.a(C0945e.f10284a, androidx.compose.ui.d.a.j, c1086gP, 0);
            int i12 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
            androidx.compose.ui.h hVarC = ComposedModifierKt.c(c1086gP, aVar);
            ComposeUiNode.f14331c0.getClass();
            Ia.a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f14333b;
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar2);
            } else {
                c1086gP.A();
            }
            R0.a(ComposeUiNode.Companion.f14337f, c1086gP, tA);
            R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P);
            p<ComposeUiNode, Integer, r> pVar = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i12))) {
                J4.i.d(i12, c1086gP, i12, pVar);
            }
            R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC);
            a(PaddingKt.j(aVar, 0.0f, 5, 0.0f, 0.0f, 13), c1086gP, 6, 0);
            Lb.a.a(c1086gP, W.q(aVar, 12));
            TextKt.b(str, null, f32887a, f32888b, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, (i11 & 14) | 3456, 0, 131058);
            c1086g = c1086gP;
            c1086g.T(true);
        }
        C1105p0 c1105p0V = c1086g.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.profile.SubscriptionPurchaseDialogKt$BulletPointRow$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    SubscriptionPurchaseDialogKt.b(str, interfaceC1084f2, L4.b.l(i10 | 1));
                    return r.f47939a;
                }
            };
        }
    }

    public static final void c(InterfaceC1084f interfaceC1084f, final int i10) {
        C1086g c1086gP = interfaceC1084f.p(960492207);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            Lb.a.a(c1086gP, C0932d.b(W.d(W.e(androidx.compose.ui.h.a.f13984b, 1), 1.0f), Q3.d.d(687865856), h0.f13629a));
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.profile.SubscriptionPurchaseDialogKt$Separator$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    SubscriptionPurchaseDialogKt.c(interfaceC1084f2, L4.b.l(i10 | 1));
                    return r.f47939a;
                }
            };
        }
    }

    /* JADX WARN: Type inference failed for: r3v16, types: [java.lang.Object, java.util.List] */
    public static final void d(final boolean z10, final A a10, final String str, final Ia.a aVar, InterfaceC1084f interfaceC1084f, final int i10) {
        C1086g c1086gP = interfaceC1084f.p(-1457639820);
        androidx.compose.ui.h.a aVar2 = androidx.compose.ui.h.a.f13984b;
        if (z10) {
            c1086gP.L(1862409686);
            androidx.compose.ui.h hVarM = W.m(aVar2, 68);
            E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
            int i11 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
            androidx.compose.ui.h hVarC = ComposedModifierKt.c(c1086gP, hVarM);
            ComposeUiNode.f14331c0.getClass();
            Ia.a<ComposeUiNode> aVar3 = ComposeUiNode.Companion.f14333b;
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar3);
            } else {
                c1086gP.A();
            }
            R0.a(ComposeUiNode.Companion.f14337f, c1086gP, eD);
            R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P);
            p<ComposeUiNode, Integer, r> pVar = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i11))) {
                J4.i.d(i11, c1086gP, i11, pVar);
            }
            R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC);
            I.a(C0949i.f10304a.f(aVar2, androidx.compose.ui.d.a.f13339e), com.voltasit.obdeleven.presentation.e.a.f32288l, 0.0f, 0L, 0, 48, c1086gP, 28);
            c1086gP.T(true);
            c1086gP.T(false);
        } else {
            c1086gP.L(1862409943);
            androidx.compose.ui.h hVarB = ScrollKt.b(PaddingKt.h(aVar2, 25, 0.0f, 2), ScrollKt.a(0, c1086gP, 0, 1), false, 14);
            C0953m c0953mA = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, c1086gP, 0);
            int i12 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P2 = c1086gP.P();
            androidx.compose.ui.h hVarC2 = ComposedModifierKt.c(c1086gP, hVarB);
            ComposeUiNode.f14331c0.getClass();
            Ia.a<ComposeUiNode> aVar4 = ComposeUiNode.Companion.f14333b;
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar4);
            } else {
                c1086gP.A();
            }
            R0.a(ComposeUiNode.Companion.f14337f, c1086gP, c0953mA);
            R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P2);
            p<ComposeUiNode, Integer, r> pVar2 = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i12))) {
                J4.i.d(i12, c1086gP, i12, pVar2);
            }
            R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC2);
            TextKt.b(a10.f3400a, PaddingKt.j(aVar2, 0.0f, 21, 0.0f, 0.0f, 13), 0L, G0.a.g(18), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 3120, 0, 131060);
            float f10 = 16;
            Lb.a.a(c1086gP, W.e(aVar2, f10));
            c(c1086gP, 0);
            Lb.a.a(c1086gP, W.e(aVar2, f10));
            TextKt.b(a10.f3401b, null, f32887a, f32888b, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 3456, 0, 131058);
            Lb.a.a(c1086gP, W.e(aVar2, f10));
            c1086gP.L(156068337);
            ?? r10 = a10.f3402c;
            int i13 = 0;
            for (Object obj : (Iterable) r10) {
                int i14 = i13 + 1;
                if (i13 < 0) {
                    kotlin.collections.l.x();
                    throw null;
                }
                b((String) obj, c1086gP, 0);
                Lb.a.a(c1086gP, W.e(aVar2, i14 == r10.size() ? f10 : 24));
                i13 = i14;
            }
            c1086gP.T(false);
            c(c1086gP, 0);
            Lb.a.a(c1086gP, W.e(aVar2, f10));
            TextKt.b(a10.f3403d, null, f32887a, f32888b, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 3456, 0, 131058);
            Lb.a.a(c1086gP, W.e(aVar2, f10));
            ButtonKt.b(aVar, PaddingKt.j(new HorizontalAlignElement(androidx.compose.ui.d.a.f13348o), 0.0f, 0.0f, 0.0f, 8, 7), null, androidx.compose.runtime.internal.a.b(1690265533, new q<U, InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.profile.SubscriptionPurchaseDialogKt$Content$2$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // Ia.q
                public final r invoke(U u10, InterfaceC1084f interfaceC1084f2, Integer num) {
                    String string;
                    U TextButton = u10;
                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                    int iIntValue = num.intValue();
                    kotlin.jvm.internal.i.e(TextButton, "$this$TextButton");
                    if ((iIntValue & 81) == 16 && interfaceC1084f3.s()) {
                        interfaceC1084f3.w();
                    } else {
                        if (n.S(str)) {
                            interfaceC1084f3.L(1699990526);
                            string = o.p(interfaceC1084f3, R.string.dialog_subscription_purchase_buy_web);
                            interfaceC1084f3.D();
                        } else {
                            interfaceC1084f3.L(1699990638);
                            Object[] objArr = {str};
                            interfaceC1084f3.x(AndroidCompositionLocals_androidKt.f14792a);
                            string = ((Context) interfaceC1084f3.x(AndroidCompositionLocals_androidKt.f14793b)).getResources().getString(R.string.dialog_subscription_purchase_buy_with_price, Arrays.copyOf(objArr, 1));
                            interfaceC1084f3.D();
                        }
                        TextKt.b(string, null, Q3.d.e(4278221567L), G0.a.g(14), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1084f3, 3456, 0, 131058);
                    }
                    return r.f47939a;
                }
            }, c1086gP), c1086gP, ((i10 >> 9) & 14) | 805306368, 508);
            c1086gP.T(true);
            c1086gP.T(false);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.profile.SubscriptionPurchaseDialogKt$Content$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    SubscriptionPurchaseDialogKt.d(z10, a10, str, aVar, interfaceC1084f2, L4.b.l(i10 | 1));
                    return r.f47939a;
                }
            };
        }
    }
}
