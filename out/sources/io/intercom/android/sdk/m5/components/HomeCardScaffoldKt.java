package io.intercom.android.sdk.m5.components;

import androidx.compose.foundation.layout.C0945e;
import androidx.compose.foundation.layout.C0952l;
import androidx.compose.foundation.layout.C0953m;
import androidx.compose.foundation.layout.InterfaceC0954n;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.R0;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.component.IntercomCardKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: HomeCardScaffold.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class HomeCardScaffoldKt {
    public static final void HomeCardScaffold(androidx.compose.ui.h hVar, final String cardTitle, final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> content, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        int i12;
        final androidx.compose.ui.h hVar2;
        kotlin.jvm.internal.i.e(cardTitle, "cardTitle");
        kotlin.jvm.internal.i.e(content, "content");
        C1086g c1086gP = interfaceC1084f.p(-1721620037);
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
            i12 |= c1086gP.K(cardTitle) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 896) == 0) {
            i12 |= c1086gP.k(content) ? 256 : 128;
        }
        if ((i12 & 731) == 146 && c1086gP.s()) {
            c1086gP.w();
            hVar2 = hVar;
        } else {
            hVar2 = i13 != 0 ? androidx.compose.ui.h.a.f13984b : hVar;
            IntercomCardKt.IntercomCard(hVar2, null, androidx.compose.runtime.internal.a.b(1218435015, new Ia.q<InterfaceC0954n, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.components.HomeCardScaffoldKt.HomeCardScaffold.1
                @Override // Ia.q
                public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC0954n interfaceC0954n, InterfaceC1084f interfaceC1084f2, Integer num) {
                    invoke(interfaceC0954n, interfaceC1084f2, num.intValue());
                    return p293xa.r.f47939a;
                }

                public final void invoke(InterfaceC0954n IntercomCard, InterfaceC1084f interfaceC1084f2, int i14) {
                    kotlin.jvm.internal.i.e(IntercomCard, "$this$IntercomCard");
                    if ((i14 & 81) == 16 && interfaceC1084f2.s()) {
                        interfaceC1084f2.w();
                        return;
                    }
                    androidx.compose.ui.h.a aVar = androidx.compose.ui.h.a.f13984b;
                    androidx.compose.ui.h hVarJ = PaddingKt.j(aVar, 0.0f, 0.0f, 0.0f, 4, 7);
                    String str = cardTitle;
                    Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar = content;
                    C0953m c0953mA = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, interfaceC1084f2, 0);
                    int iF = interfaceC1084f2.F();
                    InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f2.z();
                    androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f2, hVarJ);
                    ComposeUiNode.f14331c0.getClass();
                    Ia.a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f14333b;
                    if (interfaceC1084f2.u() == null) {
                        I.b.k();
                        throw null;
                    }
                    interfaceC1084f2.r();
                    if (interfaceC1084f2.m()) {
                        interfaceC1084f2.v(aVar2);
                    } else {
                        interfaceC1084f2.A();
                    }
                    R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f2, c0953mA);
                    R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f2, interfaceC1089h0Z);
                    Ia.p<ComposeUiNode, Integer, p293xa.r> pVar2 = ComposeUiNode.Companion.f14338g;
                    if (interfaceC1084f2.m() || !kotlin.jvm.internal.i.a(interfaceC1084f2.f(), Integer.valueOf(iF))) {
                        androidx.compose.animation.k.b(iF, interfaceC1084f2, iF, pVar2);
                    }
                    R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f2, hVarC);
                    TextKt.b(str, PaddingKt.h(PaddingKt.j(aVar, 0.0f, 16, 0.0f, 6, 5), 20, 0.0f, 2), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(interfaceC1084f2, IntercomTheme.$stable).getType04SemiBold(), interfaceC1084f2, 48, 0, 65532);
                    androidx.compose.foundation.gestures.d.c(pVar, interfaceC1084f2, 0);
                }
            }, c1086gP), c1086gP, (i12 & 14) | 384, 2);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.components.l0
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return HomeCardScaffoldKt.HomeCardScaffold$lambda$0(hVar2, cardTitle, content, i10, i11, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r HomeCardScaffold$lambda$0(androidx.compose.ui.h hVar, String cardTitle, Ia.p content, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        kotlin.jvm.internal.i.e(cardTitle, "$cardTitle");
        kotlin.jvm.internal.i.e(content, "$content");
        HomeCardScaffold(hVar, cardTitle, content, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return p293xa.r.f47939a;
    }

    @IntercomPreviews
    private static final void HomeCardScaffoldPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(-1294989986);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$HomeCardScaffoldKt.INSTANCE.m91getLambda2$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new C2289k0(i10, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r HomeCardScaffoldPreview$lambda$1(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        HomeCardScaffoldPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }
}
