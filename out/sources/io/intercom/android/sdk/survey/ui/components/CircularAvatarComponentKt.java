package io.intercom.android.sdk.survey.ui.components;

import Ia.l;
import Ia.p;
import S4.o;
import android.content.Context;
import androidx.compose.foundation.C0932d;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.C0949i;
import androidx.compose.foundation.layout.W;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.O0;
import androidx.compose.runtime.R0;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.graphics.A;
import androidx.compose.ui.graphics.H;
import androidx.compose.ui.graphics.h0;
import androidx.compose.ui.layout.E;
import androidx.compose.ui.layout.InterfaceC1161g;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.semantics.t;
import androidx.compose.ui.semantics.w;
import coil.compose.AsyncImagePainter;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.components.C2295n0;
import io.intercom.android.sdk.m5.components.C2297o0;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.ui.coil.IntercomImageLoaderKt;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import kotlin.collections.k;
import p293xa.r;

/* JADX INFO: compiled from: CircularAvatarComponent.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class CircularAvatarComponentKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: CircularAvatar-aM-cp0Q, reason: not valid java name */
    public static final void m401CircularAvataraMcp0Q(final Avatar avatar, final long j, float f10, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        androidx.compose.ui.h.a aVar;
        String str;
        float f11;
        boolean z10;
        kotlin.jvm.internal.i.e(avatar, "avatar");
        C1086g c1086gP = interfaceC1084f.p(-276383091);
        float f12 = (i11 & 4) != 0 ? 40 : f10;
        androidx.compose.ui.h.a aVar2 = androidx.compose.ui.h.a.f13984b;
        androidx.compose.ui.f fVar = androidx.compose.ui.d.a.f13335a;
        E eD = BoxKt.d(fVar, false);
        int i12 = c1086gP.f12996P;
        InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
        androidx.compose.ui.h hVarC = ComposedModifierKt.c(c1086gP, aVar2);
        ComposeUiNode.f14331c0.getClass();
        Ia.a<ComposeUiNode> aVar3 = ComposeUiNode.Companion.f14333b;
        c1086gP.r();
        if (c1086gP.f12995O) {
            c1086gP.v(aVar3);
        } else {
            c1086gP.A();
        }
        p<ComposeUiNode, E, r> pVar = ComposeUiNode.Companion.f14337f;
        R0.a(pVar, c1086gP, eD);
        p<ComposeUiNode, androidx.compose.runtime.r, r> pVar2 = ComposeUiNode.Companion.f14336e;
        R0.a(pVar2, c1086gP, interfaceC1089h0P);
        p<ComposeUiNode, Integer, r> pVar3 = ComposeUiNode.Companion.f14338g;
        if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i12))) {
            J4.i.d(i12, c1086gP, i12, pVar3);
        }
        p<ComposeUiNode, androidx.compose.ui.h, r> pVar4 = ComposeUiNode.Companion.f14335d;
        R0.a(pVar4, c1086gP, hVarC);
        String strP = o.p(c1086gP, R.string.intercom_surveys_sender_image);
        String initials = avatar.getInitials();
        kotlin.jvm.internal.i.d(initials, "getInitials(...)");
        int length = initials.length();
        androidx.compose.ui.f fVar2 = androidx.compose.ui.d.a.f13339e;
        C0949i c0949i = C0949i.f10304a;
        h0.a aVar4 = h0.f13629a;
        if (length > 0) {
            c1086gP.L(-2071598305);
            float f13 = f12;
            androidx.compose.ui.h hVarB = C0932d.b(A8.p.r(W.m(aVar2, f12), p270w.g.f47680a), j, aVar4);
            E eD2 = BoxKt.d(fVar, false);
            int i13 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P2 = c1086gP.P();
            androidx.compose.ui.h hVarC2 = ComposedModifierKt.c(c1086gP, hVarB);
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar3);
            } else {
                c1086gP.A();
            }
            R0.a(pVar, c1086gP, eD2);
            R0.a(pVar2, c1086gP, interfaceC1089h0P2);
            if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i13))) {
                J4.i.d(i13, c1086gP, i13, pVar3);
            }
            R0.a(pVar4, c1086gP, hVarC2);
            String initials2 = avatar.getInitials();
            kotlin.jvm.internal.i.d(initials2, "getInitials(...)");
            androidx.compose.ui.h hVarF = c0949i.f(aVar2, fVar2);
            c1086gP.L(592336280);
            boolean zK = c1086gP.K(strP);
            Object objF = c1086gP.f();
            if (zK || objF == InterfaceC1084f.a.f12980a) {
                z10 = false;
                objF = new a(0 == true ? 1 : 0, strP);
                c1086gP.E(objF);
            } else {
                z10 = false;
            }
            c1086gP.T(z10);
            aVar = aVar2;
            TextKt.b(initials2, androidx.compose.ui.semantics.p.b(hVarF, z10, (l) objF), ColorExtensionsKt.m658generateTextColor8_81llA(j), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 0, 0, 131064);
            c1086gP.T(true);
            c1086gP.T(false);
            f11 = f13;
            str = strP;
        } else {
            aVar = aVar2;
            float f14 = f12;
            c1086gP.L(-2071004283);
            str = strP;
            androidx.compose.ui.h hVarB2 = C0932d.b(A8.p.r(W.m(aVar, f14), p270w.g.f47680a), j, aVar4);
            E eD3 = BoxKt.d(fVar, false);
            int i14 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P3 = c1086gP.P();
            androidx.compose.ui.h hVarC3 = ComposedModifierKt.c(c1086gP, hVarB2);
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar3);
            } else {
                c1086gP.A();
            }
            R0.a(pVar, c1086gP, eD3);
            R0.a(pVar2, c1086gP, interfaceC1089h0P3);
            if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i14))) {
                J4.i.d(i14, c1086gP, i14, pVar3);
            }
            R0.a(pVar4, c1086gP, hVarC3);
            f11 = f14;
            ImageKt.a(U.c.a(R.drawable.intercom_default_avatar_icon, c1086gP, 0), str, c0949i.f(aVar, fVar2), null, InterfaceC1161g.a.f14243a, 0.0f, new A(5, ColorExtensionsKt.m658generateTextColor8_81llA(j)), c1086gP, 24584, 40);
            c1086gP.T(true);
            c1086gP.T(false);
        }
        c1086gP.L(-1313708522);
        String imageUrl = avatar.getImageUrl();
        kotlin.jvm.internal.i.d(imageUrl, "getImageUrl(...)");
        if (imageUrl.length() > 0) {
            String imageUrl2 = avatar.getImageUrl();
            O0 o10 = AndroidCompositionLocals_androidKt.f14793b;
            coil.f imageLoader = IntercomImageLoaderKt.getImageLoader((Context) c1086gP.x(o10));
            c1086gP.e(1750824323);
            coil.request.g.a aVar5 = new coil.request.g.a((Context) c1086gP.x(o10));
            aVar5.f23074c = imageUrl2;
            aVar5.b();
            aVar5.f23080i = coil.util.b.a(k.d0(new p016b3.d[]{new p016b3.b()}));
            AsyncImagePainter asyncImagePainterA = coil.compose.f.a(aVar5.a(), imageLoader, null, null, null, 0, c1086gP, me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_windowMinWidthMajor);
            c1086gP.T(false);
            ImageKt.a(asyncImagePainterA, str, W.m(aVar, f11), null, null, 0.0f, null, c1086gP, 0, me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_windowFixedHeightMajor);
        }
        C1105p0 c1105p0A = C4.a.a(c1086gP, false, true);
        if (c1105p0A != null) {
            final float f15 = f11;
            c1105p0A.f13109d = new p() { // from class: io.intercom.android.sdk.survey.ui.components.b
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return CircularAvatarComponentKt.CircularAvatar_aM_cp0Q$lambda$6(avatar, j, f15, i10, i11, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r CircularAvatar_aM_cp0Q$lambda$5$lambda$2$lambda$1$lambda$0(String contentDescription, w semantics) {
        kotlin.jvm.internal.i.e(contentDescription, "$contentDescription");
        kotlin.jvm.internal.i.e(semantics, "$this$semantics");
        t.g(contentDescription, semantics);
        return r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r CircularAvatar_aM_cp0Q$lambda$6(Avatar avatar, long j, float f10, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        kotlin.jvm.internal.i.e(avatar, "$avatar");
        m401CircularAvataraMcp0Q(avatar, j, f10, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return r.f47939a;
    }

    public static final void PreviewDefaultAvatar(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(-1706634993);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            Avatar avatarCreate = Avatar.create("", "");
            kotlin.jvm.internal.i.d(avatarCreate, "create(...)");
            m401CircularAvataraMcp0Q(avatarCreate, H.j, 0.0f, c1086gP, 56, 4);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new C2295n0(i10, 6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r PreviewDefaultAvatar$lambda$7(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        PreviewDefaultAvatar(interfaceC1084f, L4.b.l(i10 | 1));
        return r.f47939a;
    }

    public static final void PreviewInitialAvatar(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(1788709612);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            Avatar avatarCreate = Avatar.create("", "PS");
            kotlin.jvm.internal.i.d(avatarCreate, "create(...)");
            m401CircularAvataraMcp0Q(avatarCreate, H.f13502i, 0.0f, c1086gP, 56, 4);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new C2297o0(i10, 5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r PreviewInitialAvatar$lambda$8(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        PreviewInitialAvatar(interfaceC1084f, L4.b.l(i10 | 1));
        return r.f47939a;
    }
}
