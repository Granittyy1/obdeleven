package io.intercom.android.sdk.post;

import Ia.p;
import Ia.q;
import S4.o;
import androidx.compose.foundation.C0932d;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.C0945e;
import androidx.compose.foundation.layout.C0952l;
import androidx.compose.foundation.layout.C0953m;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.S;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.U;
import androidx.compose.foundation.layout.V;
import androidx.compose.foundation.layout.W;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.R0;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.graphics.H;
import androidx.compose.ui.graphics.h0;
import androidx.compose.ui.h;
import androidx.compose.ui.layout.E;
import androidx.compose.ui.node.ComposeUiNode;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.survey.ui.components.CircularAvatarComponentKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import kotlin.jvm.internal.i;
import kotlin.text.n;
import me.zhanghai.android.materialprogressbar.R;
import p293xa.r;

/* JADX INFO: compiled from: PostActivityV2.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class PostActivityV2Kt {
    public static final void BottomBarContent(h modifier, q<? super U, ? super InterfaceC1084f, ? super Integer, r> content, InterfaceC1084f interfaceC1084f, int i10) {
        int i11;
        i.e(modifier, "modifier");
        i.e(content, "content");
        C1086g c1086gP = interfaceC1084f.p(2049700691);
        if ((i10 & 14) == 0) {
            i11 = (c1086gP.K(modifier) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i11 |= c1086gP.k(content) ? 32 : 16;
        }
        if ((i11 & 91) == 18 && c1086gP.s()) {
            c1086gP.w();
        } else {
            androidx.compose.ui.f.b bVar = androidx.compose.ui.d.a.f13344k;
            h hVarH = PaddingKt.h(C0932d.b(W.e(W.d(modifier, 1.0f), 56), H.f13495b, h0.f13629a), 16, 0.0f, 2);
            T tA = S.a(C0945e.f10290g, bVar, c1086gP, 54);
            int i12 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
            h hVarC = ComposedModifierKt.c(c1086gP, hVarH);
            ComposeUiNode.f14331c0.getClass();
            Ia.a<ComposeUiNode> aVar = ComposeUiNode.Companion.f14333b;
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar);
            } else {
                c1086gP.A();
            }
            R0.a(ComposeUiNode.Companion.f14337f, c1086gP, tA);
            R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P);
            p<ComposeUiNode, Integer, r> pVar = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O || !i.a(c1086gP.f(), Integer.valueOf(i12))) {
                J4.i.d(i12, c1086gP, i12, pVar);
            }
            R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC);
            content.invoke(V.f10222a, c1086gP, Integer.valueOf((i11 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6));
            c1086gP.T(true);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new f(modifier, content, i10, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r BottomBarContent$lambda$5(h modifier, q content, int i10, InterfaceC1084f interfaceC1084f, int i11) {
        i.e(modifier, "$modifier");
        i.e(content, "$content");
        BottomBarContent(modifier, content, interfaceC1084f, L4.b.l(i10 | 1));
        return r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TopBar(final h hVar, final Avatar avatar, final String str, final String str2, final Ia.a<r> aVar, InterfaceC1084f interfaceC1084f, final int i10) {
        C1086g c1086gP = interfaceC1084f.p(131412917);
        androidx.compose.ui.f.b bVar = androidx.compose.ui.d.a.f13344k;
        h hVarH = PaddingKt.h(C0932d.b(W.e(W.d(hVar, 1.0f), 56), H.f13495b, h0.f13629a), 16, 0.0f, 2);
        T tA = S.a(C0945e.f10290g, bVar, c1086gP, 54);
        int i11 = c1086gP.f12996P;
        InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
        h hVarC = ComposedModifierKt.c(c1086gP, hVarH);
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
        h.a aVar3 = h.a.f13984b;
        T tA2 = S.a(C0945e.f10284a, bVar, c1086gP, 48);
        int i12 = c1086gP.f12996P;
        InterfaceC1089h0 interfaceC1089h0P2 = c1086gP.P();
        h hVarC2 = ComposedModifierKt.c(c1086gP, aVar3);
        c1086gP.r();
        if (c1086gP.f12995O) {
            c1086gP.v(aVar2);
        } else {
            c1086gP.A();
        }
        R0.a(pVar, c1086gP, tA2);
        R0.a(pVar2, c1086gP, interfaceC1089h0P2);
        if (c1086gP.f12995O || !i.a(c1086gP.f(), Integer.valueOf(i12))) {
            J4.i.d(i12, c1086gP, i12, pVar3);
        }
        R0.a(pVar4, c1086gP, hVarC2);
        long j = H.f13499f;
        CircularAvatarComponentKt.m401CircularAvataraMcp0Q(avatar, j, 32, c1086gP, 440, 0);
        h hVarH2 = PaddingKt.h(aVar3, 8, 0.0f, 2);
        C0953m c0953mA = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, c1086gP, 0);
        int i13 = c1086gP.f12996P;
        InterfaceC1089h0 interfaceC1089h0P3 = c1086gP.P();
        h hVarC3 = ComposedModifierKt.c(c1086gP, hVarH2);
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
        IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
        int i14 = IntercomTheme.$stable;
        TextKt.b(str, null, j, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c1086gP, i14).getType04Point5(), c1086gP, ((i10 >> 6) & 14) | 384, 0, 65530);
        c1086gP.L(-2145848981);
        if (!n.S(str2)) {
            TextKt.b(str2, null, j, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c1086gP, i14).getType05(), c1086gP, ((i10 >> 9) & 14) | 384, 0, 65530);
        }
        c1086gP.T(false);
        c1086gP.T(true);
        c1086gP.T(true);
        IconKt.b(p306z.d.a(), o.p(c1086gP, io.intercom.android.sdk.R.string.intercom_dismiss), ClickableKt.c(aVar3, false, null, aVar, 7), j, c1086gP, 3072, 0);
        c1086gP.T(true);
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new p() { // from class: io.intercom.android.sdk.post.e
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return PostActivityV2Kt.TopBar$lambda$3(hVar, avatar, str, str2, aVar, i10, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r TopBar$lambda$3(h modifier, Avatar avatar, String title, String subTitle, Ia.a onCloseClick, int i10, InterfaceC1084f interfaceC1084f, int i11) {
        i.e(modifier, "$modifier");
        i.e(avatar, "$avatar");
        i.e(title, "$title");
        i.e(subTitle, "$subTitle");
        i.e(onCloseClick, "$onCloseClick");
        TopBar(modifier, avatar, title, subTitle, onCloseClick, interfaceC1084f, L4.b.l(i10 | 1));
        return r.f47939a;
    }
}
