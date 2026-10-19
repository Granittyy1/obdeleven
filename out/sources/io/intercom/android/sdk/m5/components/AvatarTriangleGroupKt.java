package io.intercom.android.sdk.m5.components;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.C0949i;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.R0;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import com.google.android.gms.internal.measurement.M1;
import io.intercom.android.sdk.m5.components.avatar.AvatarIconKt;
import io.intercom.android.sdk.m5.components.avatar.AvatarShape;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.shapes.CutAvatarBoxShape;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: compiled from: AvatarTriangleGroup.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class AvatarTriangleGroupKt {
    /* JADX INFO: renamed from: AvatarTriangleGroup--jt2gSs, reason: not valid java name */
    public static final void m60AvatarTriangleGroupjt2gSs(final List<AvatarWrapper> avatars, androidx.compose.ui.h hVar, androidx.compose.ui.graphics.l0 l0Var, float f10, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        androidx.compose.ui.graphics.l0 composeShape;
        int i12;
        androidx.compose.ui.h hVar2;
        float f11;
        kotlin.jvm.internal.i.e(avatars, "avatars");
        C1086g c1086gP = interfaceC1084f.p(-534156342);
        int i13 = i11 & 2;
        androidx.compose.ui.h.a aVar = androidx.compose.ui.h.a.f13984b;
        androidx.compose.ui.h hVar3 = i13 != 0 ? aVar : hVar;
        if ((i11 & 4) != 0) {
            composeShape = AvatarIconKt.getComposeShape(AvatarShape.CIRCLE);
            i12 = i10 & (-897);
        } else {
            composeShape = l0Var;
            i12 = i10;
        }
        float f12 = (i11 & 8) != 0 ? 32 : f10;
        long jG = G0.a.g(12);
        if (avatars.size() > 1) {
            c1086gP.L(643591148);
            float f13 = 2;
            float f14 = (1 * f13) + (f12 / f13);
            androidx.compose.ui.h hVarM = androidx.compose.foundation.layout.W.m(hVar3, f12);
            androidx.compose.ui.layout.E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
            int i14 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
            androidx.compose.ui.h hVarC = ComposedModifierKt.c(c1086gP, hVarM);
            ComposeUiNode.f14331c0.getClass();
            Ia.a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f14333b;
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar2);
            } else {
                c1086gP.A();
            }
            R0.a(ComposeUiNode.Companion.f14337f, c1086gP, eD);
            R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P);
            Ia.p<ComposeUiNode, Integer, p293xa.r> pVar = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i14))) {
                J4.i.d(i14, c1086gP, i14, pVar);
            }
            R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC);
            C0949i c0949i = C0949i.f10304a;
            float f15 = f12 - f14;
            float f16 = f15 / f13;
            float f17 = f12;
            int i15 = i12;
            AvatarIconKt.m131AvatarIconRd90Nhg(c0949i.f(androidx.compose.foundation.layout.W.m(aVar, f14), androidx.compose.ui.d.a.f13336b), avatars.size() > 0 ? avatars.get(0) : AvatarWrapper.Companion.getNULL(), new CutAvatarBoxShape(composeShape, f13, kotlin.collections.l.s(new Pair(new p013b0.f(f16), new p013b0.f(f15)), new Pair(new p013b0.f(-f16), new p013b0.f(f15))), null), false, jG, null, c1086gP, 24640, 40);
            androidx.compose.ui.h hVar4 = hVar3;
            AvatarIconKt.m131AvatarIconRd90Nhg(c0949i.f(androidx.compose.foundation.layout.W.m(aVar, f14), androidx.compose.ui.d.a.f13341g), 1 < avatars.size() ? avatars.get(1) : AvatarWrapper.Companion.getNULL(), new CutAvatarBoxShape(composeShape, f13, M1.k(new Pair(new p013b0.f(f15), new p013b0.f(0))), null), false, jG, null, c1086gP, 24640, 40);
            AvatarIconKt.m131AvatarIconRd90Nhg(c0949i.f(androidx.compose.foundation.layout.W.m(aVar, f14), androidx.compose.ui.d.a.f13343i), 2 < avatars.size() ? avatars.get(2) : AvatarWrapper.Companion.getNULL(), composeShape, false, jG, null, c1086gP, (i15 & 896) | 24640, 40);
            c1086gP.T(true);
            c1086gP.T(false);
            hVar2 = hVar4;
            f11 = f17;
        } else {
            float f18 = f12;
            androidx.compose.ui.h hVar5 = hVar3;
            c1086gP.L(645459394);
            AvatarWrapper avatarWrapper = avatars.size() > 0 ? avatars.get(0) : AvatarWrapper.Companion.getNULL();
            hVar2 = hVar5;
            f11 = f18;
            androidx.compose.ui.h hVarM2 = androidx.compose.foundation.layout.W.m(hVar2, f11);
            AvatarShape shape = avatarWrapper.getAvatar().getShape();
            kotlin.jvm.internal.i.d(shape, "getShape(...)");
            AvatarIconKt.m131AvatarIconRd90Nhg(hVarM2, avatarWrapper, AvatarIconKt.getComposeShape(shape), false, 0L, null, c1086gP, 64, 56);
            c1086gP.T(false);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            final androidx.compose.ui.h hVar6 = hVar2;
            final androidx.compose.ui.graphics.l0 l0Var2 = composeShape;
            final float f19 = f11;
            c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.components.e
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AvatarTriangleGroupKt.AvatarTriangleGroup__jt2gSs$lambda$5(avatars, hVar6, l0Var2, f19, i10, i11, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r AvatarTriangleGroup__jt2gSs$lambda$5(List avatars, androidx.compose.ui.h hVar, androidx.compose.ui.graphics.l0 l0Var, float f10, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        kotlin.jvm.internal.i.e(avatars, "$avatars");
        m60AvatarTriangleGroupjt2gSs(avatars, hVar, l0Var, f10, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return p293xa.r.f47939a;
    }

    @IntercomPreviews
    private static final void DoubleAvatarsPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(-2121947035);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$AvatarTriangleGroupKt.INSTANCE.m65getLambda2$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new C2274d(i10, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r DoubleAvatarsPreview$lambda$7(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        DoubleAvatarsPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    @IntercomPreviews
    private static final void SingleAvatarPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(-932654159);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$AvatarTriangleGroupKt.INSTANCE.m64getLambda1$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new C2280g(i10, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r SingleAvatarPreview$lambda$6(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        SingleAvatarPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    @IntercomPreviews
    private static final void TripleAvatarsPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(-724464974);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$AvatarTriangleGroupKt.INSTANCE.m66getLambda3$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new C2278f(i10, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r TripleAvatarsPreview$lambda$8(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        TripleAvatarsPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }
}
