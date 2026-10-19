package io.intercom.android.sdk.m5.components;

import androidx.compose.foundation.C0936h;
import androidx.compose.foundation.layout.C0945e;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.R0;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.LayoutDirection;
import io.intercom.android.sdk.m5.components.avatar.AvatarIconKt;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: compiled from: BotAndHumansFacePile.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class BotAndHumansFacePileKt {
    /* JADX INFO: renamed from: BotAndHumansFacePile-hGBTI10, reason: not valid java name */
    public static final void m61BotAndHumansFacePilehGBTI10(androidx.compose.ui.h hVar, final Avatar botAvatar, final Pair<? extends Avatar, ? extends Avatar> teammateAvatarPair, final float f10, String str, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        boolean z10;
        kotlin.jvm.internal.i.e(botAvatar, "botAvatar");
        kotlin.jvm.internal.i.e(teammateAvatarPair, "teammateAvatarPair");
        C1086g c1086gP = interfaceC1084f.p(957129373);
        int i12 = i11 & 1;
        androidx.compose.ui.h.a aVar = androidx.compose.ui.h.a.f13984b;
        final androidx.compose.ui.h hVar2 = i12 != 0 ? aVar : hVar;
        String str2 = (i11 & 16) != 0 ? "" : str;
        final float f11 = ((float) 0.75d) * f10;
        final float f12 = ((float) 0.25d) * f11;
        androidx.compose.foundation.layout.T tA = androidx.compose.foundation.layout.S.a(C0945e.g((((float) 0.0625d) * f10) - f12), androidx.compose.ui.d.a.f13344k, c1086gP, 48);
        int i13 = c1086gP.f12996P;
        InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
        androidx.compose.ui.h hVarC = ComposedModifierKt.c(c1086gP, hVar2);
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
        if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i13))) {
            J4.i.d(i13, c1086gP, i13, pVar);
        }
        R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC);
        Avatar avatarC = teammateAvatarPair.c();
        c1086gP.L(1213840539);
        InterfaceC1084f.a.C0153a c0153a = InterfaceC1084f.a.f12980a;
        boolean z11 = false;
        kotlin.jvm.internal.e eVar = null;
        int i14 = 2;
        if (avatarC == null) {
            z10 = false;
        } else {
            AvatarWrapper avatarWrapper = new AvatarWrapper(avatarC, z11, i14, eVar);
            androidx.compose.ui.h hVarM = androidx.compose.foundation.layout.W.m(aVar, f11);
            c1086gP.L(1012545465);
            boolean zG = c1086gP.g(f11) | c1086gP.g(f12);
            Object objF = c1086gP.f();
            if (zG || objF == c0153a) {
                objF = new Ia.l() { // from class: io.intercom.android.sdk.m5.components.i
                    @Override // Ia.l
                    public final Object invoke(Object obj) {
                        return BotAndHumansFacePileKt.BotAndHumansFacePile_hGBTI10$lambda$10$lambda$4$lambda$3$lambda$2(f11, f12, (J.c) obj);
                    }
                };
                c1086gP.E(objF);
            }
            c1086gP.T(false);
            AvatarIconKt.m131AvatarIconRd90Nhg(androidx.compose.ui.draw.f.c(hVarM, (Ia.l) objF), avatarWrapper, null, false, 0L, null, c1086gP, 64, 60);
            z10 = false;
        }
        c1086gP.T(z10);
        boolean z12 = z10;
        AvatarIconKt.m131AvatarIconRd90Nhg(androidx.compose.foundation.layout.W.m(aVar, f10), new AvatarWrapper(botAvatar, true), null, false, 0L, null, c1086gP, 64, 60);
        Avatar avatarD = teammateAvatarPair.d();
        c1086gP.L(1213869401);
        if (avatarD != null) {
            AvatarWrapper avatarWrapper2 = new AvatarWrapper(avatarD, z12, 2, null);
            androidx.compose.ui.h hVarM2 = androidx.compose.foundation.layout.W.m(aVar, f11);
            c1086gP.L(1012574327);
            boolean zG2 = c1086gP.g(f12) | c1086gP.g(f11);
            Object objF2 = c1086gP.f();
            if (zG2 || objF2 == c0153a) {
                objF2 = new Ia.l() { // from class: io.intercom.android.sdk.m5.components.j
                    @Override // Ia.l
                    public final Object invoke(Object obj) {
                        return BotAndHumansFacePileKt.BotAndHumansFacePile_hGBTI10$lambda$10$lambda$9$lambda$8$lambda$7(f12, f11, (J.c) obj);
                    }
                };
                c1086gP.E(objF2);
            }
            c1086gP.T(z12);
            AvatarIconKt.m131AvatarIconRd90Nhg(androidx.compose.ui.draw.f.c(hVarM2, (Ia.l) objF2), avatarWrapper2, null, false, 0L, null, c1086gP, 64, 60);
        }
        C1105p0 c1105p0A = C4.a.a(c1086gP, z12, true);
        if (c1105p0A != null) {
            final String str3 = str2;
            c1105p0A.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.components.k
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    androidx.compose.ui.h hVar3 = hVar2;
                    int i15 = i10;
                    int i16 = i11;
                    return BotAndHumansFacePileKt.BotAndHumansFacePile_hGBTI10$lambda$11(hVar3, botAvatar, teammateAvatarPair, f10, str3, i15, i16, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r BotAndHumansFacePile_hGBTI10$lambda$10$lambda$4$lambda$3$lambda$2(float f10, float f11, J.c drawWithContent) {
        kotlin.jvm.internal.i.e(drawWithContent, "$this$drawWithContent");
        if (drawWithContent.getLayoutDirection() == LayoutDirection.f15717b) {
            float fT0 = drawWithContent.T0(f10 - f11);
            float fIntBitsToFloat = Float.intBitsToFloat((int) (drawWithContent.j() & 4294967295L));
            J.a.b bVarW0 = drawWithContent.W0();
            long jE = bVarW0.e();
            bVarW0.a().g();
            try {
                bVarW0.f3948a.d(0.0f, 0.0f, fT0, fIntBitsToFloat, 1);
                drawWithContent.A1();
            } finally {
                C0936h.f(bVarW0, jE);
            }
        } else {
            float fT1 = drawWithContent.T0(f11);
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (drawWithContent.j() >> 32));
            float fIntBitsToFloat3 = Float.intBitsToFloat((int) (drawWithContent.j() & 4294967295L));
            J.a.b bVarW1 = drawWithContent.W0();
            long jE2 = bVarW1.e();
            bVarW1.a().g();
            try {
                bVarW1.f3948a.d(fT1, 0.0f, fIntBitsToFloat2, fIntBitsToFloat3, 1);
                drawWithContent.A1();
            } finally {
                C0936h.f(bVarW1, jE2);
            }
        }
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r BotAndHumansFacePile_hGBTI10$lambda$10$lambda$9$lambda$8$lambda$7(float f10, float f11, J.c drawWithContent) {
        kotlin.jvm.internal.i.e(drawWithContent, "$this$drawWithContent");
        if (drawWithContent.getLayoutDirection() == LayoutDirection.f15717b) {
            float fT0 = drawWithContent.T0(f10);
            float fIntBitsToFloat = Float.intBitsToFloat((int) (drawWithContent.j() >> 32));
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (drawWithContent.j() & 4294967295L));
            J.a.b bVarW0 = drawWithContent.W0();
            long jE = bVarW0.e();
            bVarW0.a().g();
            try {
                bVarW0.f3948a.d(fT0, 0.0f, fIntBitsToFloat, fIntBitsToFloat2, 1);
                drawWithContent.A1();
            } finally {
                C0936h.f(bVarW0, jE);
            }
        } else {
            float fT1 = drawWithContent.T0(f11 - f10);
            float fIntBitsToFloat3 = Float.intBitsToFloat((int) (drawWithContent.j() & 4294967295L));
            J.a.b bVarW1 = drawWithContent.W0();
            long jE2 = bVarW1.e();
            bVarW1.a().g();
            try {
                bVarW1.f3948a.d(0.0f, 0.0f, fT1, fIntBitsToFloat3, 1);
                drawWithContent.A1();
            } finally {
                C0936h.f(bVarW1, jE2);
            }
        }
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r BotAndHumansFacePile_hGBTI10$lambda$11(androidx.compose.ui.h hVar, Avatar botAvatar, Pair teammateAvatarPair, float f10, String str, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        kotlin.jvm.internal.i.e(botAvatar, "$botAvatar");
        kotlin.jvm.internal.i.e(teammateAvatarPair, "$teammateAvatarPair");
        m61BotAndHumansFacePilehGBTI10(hVar, botAvatar, teammateAvatarPair, f10, str, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return p293xa.r.f47939a;
    }

    @IntercomPreviews
    private static final void BotWithTwoTeammatesPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(-366024049);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$BotAndHumansFacePileKt.INSTANCE.m67getLambda1$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new C2282h(i10, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r BotWithTwoTeammatesPreview$lambda$12(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        BotWithTwoTeammatesPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    @IntercomPreviews
    private static final void BotsWithOneTeammatePreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(1130939763);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$BotAndHumansFacePileKt.INSTANCE.m68getLambda2$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new io.intercom.android.sdk.helpcenter.articles.t(i10, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r BotsWithOneTeammatePreview$lambda$13(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        BotsWithOneTeammatePreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    public static final Pair<Avatar, Avatar> humanAvatarPairForHome(List<? extends Avatar> humanAvatars) {
        kotlin.jvm.internal.i.e(humanAvatars, "humanAvatars");
        int size = humanAvatars.size();
        if (size != 0) {
            return size != 1 ? new Pair<>(humanAvatars.get(0), humanAvatars.get(1)) : new Pair<>(null, humanAvatars.get(0));
        }
        return new Pair<>(null, null);
    }
}
