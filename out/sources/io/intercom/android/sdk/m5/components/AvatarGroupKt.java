package io.intercom.android.sdk.m5.components;

import androidx.compose.foundation.layout.C0945e;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.R0;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import io.intercom.android.sdk.m5.components.avatar.AvatarIconKt;
import io.intercom.android.sdk.m5.components.avatar.AvatarShape;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.shapes.OverlappedAvatarShape;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import java.util.List;

/* JADX INFO: compiled from: AvatarGroup.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class AvatarGroupKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r24v0, types: [java.lang.Throwable] */
    /* JADX INFO: renamed from: AvatarGroup--J8mCjc, reason: not valid java name */
    public static final void m59AvatarGroupJ8mCjc(final List<AvatarWrapper> avatars, androidx.compose.ui.h hVar, float f10, long j, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        long j10;
        int i12;
        androidx.compose.ui.graphics.l0 overlappedAvatarShape;
        kotlin.jvm.internal.i.e(avatars, "avatars");
        C1086g c1086gP = interfaceC1084f.p(-258460642);
        int i13 = i11 & 2;
        androidx.compose.ui.h.a aVar = androidx.compose.ui.h.a.f13984b;
        androidx.compose.ui.h hVar2 = i13 != 0 ? aVar : hVar;
        float f11 = (i11 & 4) != 0 ? 38 : f10;
        if ((i11 & 8) != 0) {
            j10 = IntercomTheme.INSTANCE.getTypography(c1086gP, IntercomTheme.$stable).getType04Point5().f15318a.f15691b;
            i12 = i10 & (-7169);
        } else {
            j10 = j;
            i12 = i10;
        }
        float f12 = 2;
        C0945e.i iVarG = C0945e.g(-f12);
        kotlin.jvm.internal.e eVar = null;
        char c10 = 3;
        androidx.compose.ui.h hVarT = androidx.compose.foundation.layout.W.t(hVar2, null, 3);
        androidx.compose.foundation.layout.T tA = androidx.compose.foundation.layout.S.a(iVarG, androidx.compose.ui.d.a.j, c1086gP, 6);
        int i14 = c1086gP.f12996P;
        InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
        androidx.compose.ui.h hVarC = ComposedModifierKt.c(c1086gP, hVarT);
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
        if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i14))) {
            J4.i.d(i14, c1086gP, i14, pVar);
        }
        R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC);
        c1086gP.L(700807476);
        int i15 = 0;
        for (Object obj : avatars) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                ?? r24 = eVar;
                kotlin.collections.l.x();
                throw r24;
            }
            AvatarWrapper avatarWrapper = (AvatarWrapper) obj;
            if (i15 == 0) {
                AvatarShape shape = avatarWrapper.getAvatar().getShape();
                kotlin.jvm.internal.i.d(shape, "getShape(...)");
                overlappedAvatarShape = AvatarIconKt.getComposeShape(shape);
            } else {
                AvatarShape shape2 = avatars.get(i15 - 1).getAvatar().getShape();
                kotlin.jvm.internal.i.d(shape2, "getShape(...)");
                AvatarShape shape3 = avatarWrapper.getAvatar().getShape();
                kotlin.jvm.internal.i.d(shape3, "getShape(...)");
                overlappedAvatarShape = new OverlappedAvatarShape(AvatarIconKt.getComposeShape(shape3), AvatarIconKt.getComposeShape(shape2), f12 * f12, eVar);
            }
            AvatarIconKt.m131AvatarIconRd90Nhg(androidx.compose.foundation.layout.W.m(aVar, f11), avatarWrapper, overlappedAvatarShape, false, j10, null, c1086gP, (57344 & (i12 << 3)) | 64, 40);
            i15 = i16;
            f12 = f12;
            c10 = c10;
            eVar = eVar;
        }
        C1105p0 c1105p0A = C4.a.a(c1086gP, false, true);
        if (c1105p0A != null) {
            final androidx.compose.ui.h hVar3 = hVar2;
            final float f13 = f11;
            final long j11 = j10;
            c1105p0A.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.components.a
                @Override // Ia.p
                public final Object invoke(Object obj2, Object obj3) {
                    int iIntValue = ((Integer) obj3).intValue();
                    androidx.compose.ui.h hVar4 = hVar3;
                    int i17 = i10;
                    int i18 = i11;
                    return AvatarGroupKt.AvatarGroup__J8mCjc$lambda$2(avatars, hVar4, f13, j11, i17, i18, (InterfaceC1084f) obj2, iIntValue);
                }
            };
        }
    }

    @IntercomPreviews
    private static final void AvatarGroupPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(-2091006176);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$AvatarGroupKt.INSTANCE.m62getLambda1$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new C2272c(i10, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r AvatarGroupPreview$lambda$3(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        AvatarGroupPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    @IntercomPreviews
    private static final void AvatarGroupWithMixedShapesPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(-1253949399);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$AvatarGroupKt.INSTANCE.m63getLambda2$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new C2270b(i10, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r AvatarGroupWithMixedShapesPreview$lambda$4(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        AvatarGroupWithMixedShapesPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r AvatarGroup__J8mCjc$lambda$2(List avatars, androidx.compose.ui.h hVar, float f10, long j, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        kotlin.jvm.internal.i.e(avatars, "$avatars");
        m59AvatarGroupJ8mCjc(avatars, hVar, f10, j, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return p293xa.r.f47939a;
    }
}
