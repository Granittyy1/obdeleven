package io.intercom.android.sdk.survey.ui.questiontype.files;

import androidx.compose.foundation.C0932d;
import androidx.compose.foundation.layout.C0945e;
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
import androidx.compose.ui.graphics.m0;
import androidx.compose.ui.node.ComposeUiNode;
import io.intercom.android.sdk.m5.components.C2279f0;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import kotlin.collections.EmptyList;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: AddFileButton.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class AddFileButtonKt {
    public static final void AddFileButton(androidx.compose.ui.h hVar, final int i10, InterfaceC1084f interfaceC1084f, final int i11, final int i12) {
        final androidx.compose.ui.h hVar2;
        int i13;
        C1086g c1086gP = interfaceC1084f.p(533336753);
        int i14 = i12 & 1;
        if (i14 != 0) {
            i13 = i11 | 6;
            hVar2 = hVar;
        } else if ((i11 & 14) == 0) {
            hVar2 = hVar;
            i13 = (c1086gP.K(hVar2) ? 4 : 2) | i11;
        } else {
            hVar2 = hVar;
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i13 |= c1086gP.h(i10) ? 32 : 16;
        }
        if ((i13 & 91) == 18 && c1086gP.s()) {
            c1086gP.w();
        } else {
            androidx.compose.ui.h.a aVar = androidx.compose.ui.h.a.f13984b;
            androidx.compose.ui.h hVar3 = i14 != 0 ? aVar : hVar2;
            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
            int i15 = IntercomTheme.$stable;
            androidx.compose.ui.h hVarF = PaddingKt.f(A8.p.r(C0932d.b(hVar3, H.b(0.06f, intercomTheme.getColors(c1086gP, i15).m645getPrimaryText0d7_KjU()), intercomTheme.getShapes(c1086gP, i15).f12430b), p270w.g.a(2)), 8);
            T tA = S.a(C0945e.g(3), androidx.compose.ui.d.a.f13344k, c1086gP, 54);
            int i16 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
            androidx.compose.ui.h hVarC = ComposedModifierKt.c(c1086gP, hVarF);
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
            Ia.p<ComposeUiNode, Integer, p293xa.r> pVar = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i16))) {
                J4.i.d(i16, c1086gP, i16, pVar);
            }
            R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC);
            androidx.compose.ui.h hVar4 = hVar3;
            TextKt.b(S4.o.p(c1086gP, i10), aVar, intercomTheme.getColors(c1086gP, i15).m645getPrimaryText0d7_KjU(), 0L, null, androidx.compose.ui.text.font.l.f15444i, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c1086gP, i15).getType04Point5(), c1086gP, 196656, 0, 65496);
            androidx.compose.ui.h hVarM = W.m(aVar, 16);
            androidx.compose.ui.graphics.vector.c cVarB = p306z.a.f48672a;
            if (cVarB == null) {
                androidx.compose.ui.graphics.vector.c.a aVar3 = new androidx.compose.ui.graphics.vector.c.a("Filled.Add", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                EmptyList emptyList = androidx.compose.ui.graphics.vector.i.f13970a;
                m0 m0Var = new m0(H.f13495b);
                androidx.compose.ui.graphics.vector.d dVar = new androidx.compose.ui.graphics.vector.d();
                dVar.h(19.0f, 13.0f);
                dVar.e(-6.0f);
                dVar.l(6.0f);
                dVar.e(-2.0f);
                dVar.l(-6.0f);
                dVar.d(5.0f);
                dVar.l(-2.0f);
                dVar.e(6.0f);
                dVar.k(5.0f);
                dVar.e(2.0f);
                dVar.l(6.0f);
                dVar.e(6.0f);
                dVar.l(2.0f);
                dVar.a();
                androidx.compose.ui.graphics.vector.c.a.a(aVar3, dVar.f13897a, m0Var);
                cVarB = aVar3.b();
                p306z.a.f48672a = cVarB;
            }
            IconKt.b(cVarB, "Add", hVarM, intercomTheme.getColors(c1086gP, i15).m645getPrimaryText0d7_KjU(), c1086gP, 432, 0);
            c1086gP.T(true);
            hVar2 = hVar4;
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.survey.ui.questiontype.files.a
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AddFileButtonKt.AddFileButton$lambda$1(hVar2, i10, i11, i12, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r AddFileButton$lambda$1(androidx.compose.ui.h hVar, int i10, int i11, int i12, InterfaceC1084f interfaceC1084f, int i13) {
        AddFileButton(hVar, i10, interfaceC1084f, L4.b.l(i11 | 1), i12);
        return p293xa.r.f47939a;
    }

    @IntercomPreviews
    private static final void AddFileButtonPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(-126735215);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            SurfaceKt.a(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$AddFileButtonKt.INSTANCE.m428getLambda1$intercom_sdk_base_release(), c1086gP, 12582912, 127);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new C2279f0(i10, 5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r AddFileButtonPreview$lambda$2(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        AddFileButtonPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }
}
