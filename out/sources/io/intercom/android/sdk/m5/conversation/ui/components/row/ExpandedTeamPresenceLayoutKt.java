package io.intercom.android.sdk.m5.conversation.ui.components.row;

import android.content.Context;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.C0945e;
import androidx.compose.foundation.layout.C0952l;
import androidx.compose.foundation.layout.C0953m;
import androidx.compose.foundation.layout.S;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.W;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.R0;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.components.AvatarGroupKt;
import io.intercom.android.sdk.m5.components.BotAndHumansFacePileKt;
import io.intercom.android.sdk.m5.components.C2282h;
import io.intercom.android.sdk.m5.components.P;
import io.intercom.android.sdk.m5.components.Q;
import io.intercom.android.sdk.m5.components.avatar.AvatarIconKt;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.conversation.states.ExpandedTeamPresenceState;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.AvatarType;
import io.intercom.android.sdk.models.Header;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import io.intercom.android.sdk.utilities.LinkOpener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;

/* JADX INFO: compiled from: ExpandedTeamPresenceLayout.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ExpandedTeamPresenceLayoutKt {
    private static final float AvatarSize = 56;

    /* JADX INFO: compiled from: ExpandedTeamPresenceLayout.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[AvatarType.values().length];
            try {
                iArr[AvatarType.FACEPILE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AvatarType.LAYERED_BUBBLES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AvatarType.LOGO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AvatarType.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[Header.Expanded.Style.values().length];
            try {
                iArr2[Header.Expanded.Style.H1.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[Header.Expanded.Style.PARAGRAPH.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[Header.Expanded.Style.INTRO.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[Header.Expanded.Style.GREETING.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void ExpandedTeamPresenceLayout(ExpandedTeamPresenceState teamPresenceUiState, androidx.compose.ui.h hVar, InterfaceC1084f interfaceC1084f, int i10, int i11) {
        ?? r10;
        int i12;
        Context context;
        boolean z10;
        kotlin.jvm.internal.i.e(teamPresenceUiState, "teamPresenceUiState");
        C1086g c1086gP = interfaceC1084f.p(-1694898660);
        int i13 = i11 & 2;
        androidx.compose.ui.h.a aVar = androidx.compose.ui.h.a.f13984b;
        androidx.compose.ui.h hVar2 = i13 != 0 ? aVar : hVar;
        Context context2 = (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b);
        androidx.compose.ui.f.a aVar2 = androidx.compose.ui.d.a.f13347n;
        C0953m c0953mA = C0952l.a(C0945e.f10286c, aVar2, c1086gP, 48);
        int i14 = c1086gP.f12996P;
        InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
        androidx.compose.ui.h hVarC = ComposedModifierKt.c(c1086gP, hVar2);
        ComposeUiNode.f14331c0.getClass();
        Ia.a<ComposeUiNode> aVar3 = ComposeUiNode.Companion.f14333b;
        c1086gP.r();
        if (c1086gP.f12995O) {
            c1086gP.v(aVar3);
        } else {
            c1086gP.A();
        }
        R0.a(ComposeUiNode.Companion.f14337f, c1086gP, c0953mA);
        R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P);
        Ia.p<ComposeUiNode, Integer, p293xa.r> pVar = ComposeUiNode.Companion.f14338g;
        if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i14))) {
            J4.i.d(i14, c1086gP, i14, pVar);
        }
        R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC);
        int i15 = WhenMappings.$EnumSwitchMapping$0[teamPresenceUiState.getAvatarType().ordinal()];
        if (i15 != 1) {
            if (i15 == 2) {
                z10 = false;
                i12 = 3;
                c1086gP.L(-654655587);
                if (teamPresenceUiState.getAvatars().size() == 1) {
                    c1086gP.L(-654606390);
                    AvatarIconKt.m131AvatarIconRd90Nhg(W.m(aVar, AvatarSize), teamPresenceUiState.getAvatars().get(0), null, teamPresenceUiState.getDisplayActiveIndicator(), G0.a.g(24), null, c1086gP, 24646, 36);
                    c1086gP.T(false);
                } else {
                    c1086gP.L(-654265855);
                    AvatarGroupKt.m59AvatarGroupJ8mCjc(teamPresenceUiState.getAvatars(), aVar, AvatarSize, G0.a.g(24), c1086gP, 3512, 0);
                    c1086gP.T(false);
                }
                c1086gP.T(false);
                p293xa.r rVar = p293xa.r.f47939a;
            } else if (i15 == 3) {
                c1086gP.L(-653933318);
                i12 = 3;
                z10 = false;
                AvatarIconKt.m131AvatarIconRd90Nhg(W.m(aVar, AvatarSize), teamPresenceUiState.getAvatars().get(0), null, teamPresenceUiState.getDisplayActiveIndicator(), G0.a.g(24), new androidx.compose.ui.graphics.H(androidx.compose.ui.graphics.H.f13503k), c1086gP, 221254, 4);
                c1086gP.T(false);
                p293xa.r rVar2 = p293xa.r.f47939a;
            } else {
                if (i15 != 4) {
                    c1086gP.L(-852429191);
                    c1086gP.T(false);
                    throw new NoWhenBranchMatchedException();
                }
                c1086gP.L(-653494885);
                c1086gP.T(false);
                p293xa.r rVar3 = p293xa.r.f47939a;
                r10 = 0;
                aVar2 = aVar2;
                context2 = context2;
                hVar2 = hVar2;
                i12 = 3;
            }
            r10 = z10;
        } else {
            r10 = 0;
            aVar2 = aVar2;
            context2 = context2;
            hVar2 = hVar2;
            i12 = 3;
            c1086gP.L(-655467756);
            BotAndHumansFacePileKt.m61BotAndHumansFacePilehGBTI10(aVar, ((AvatarWrapper) kotlin.collections.q.O(teamPresenceUiState.getAvatars())).getAvatar(), teamPresenceUiState.getAvatars().size() >= 3 ? new Pair(teamPresenceUiState.getAvatars().get(1).getAvatar(), teamPresenceUiState.getAvatars().get(2).getAvatar()) : teamPresenceUiState.getAvatars().size() == 2 ? new Pair(teamPresenceUiState.getAvatars().get(1).getAvatar(), null) : new Pair(null, null), AvatarSize, null, c1086gP, 3654, 16);
            c1086gP.T(false);
            p293xa.r rVar4 = p293xa.r.f47939a;
        }
        float f10 = 12;
        Lb.a.a(c1086gP, W.e(aVar, f10));
        c1086gP.L(-852359896);
        for (Header.Expanded.Body body : teamPresenceUiState.getBody()) {
            Lb.a.a(c1086gP, W.e(aVar, 4));
            TextKt.b(body.getText(), null, 0L, 0L, null, null, null, 0L, null, new androidx.compose.ui.text.style.g(i12), 0L, 2, false, 2, 0, null, getTextStyleFor(body.getStyle(), body.getColor(), c1086gP, r10, r10), c1086gP, 0, 3120, 54782);
            aVar = aVar;
            hVar2 = hVar2;
            f10 = f10;
            i12 = 3;
        }
        float f11 = f10;
        androidx.compose.ui.h.a aVar4 = aVar;
        androidx.compose.ui.h hVar3 = hVar2;
        c1086gP.T(r10);
        c1086gP.L(-852346650);
        boolean zIsEmpty = teamPresenceUiState.getSocialAccounts().isEmpty();
        androidx.compose.ui.f.b bVar = androidx.compose.ui.d.a.f13344k;
        int i16 = 54;
        int i17 = 8;
        if (!zIsEmpty) {
            Lb.a.a(c1086gP, W.e(aVar4, f11));
            C0945e.j jVar = C0945e.f10284a;
            T tA = S.a(C0945e.h(8, aVar2), bVar, c1086gP, 54);
            int i18 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P2 = c1086gP.P();
            androidx.compose.ui.h hVarC2 = ComposedModifierKt.c(c1086gP, aVar4);
            ComposeUiNode.f14331c0.getClass();
            Ia.a<ComposeUiNode> aVar5 = ComposeUiNode.Companion.f14333b;
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar5);
            } else {
                c1086gP.A();
            }
            R0.a(ComposeUiNode.Companion.f14337f, c1086gP, tA);
            R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P2);
            Ia.p<ComposeUiNode, Integer, p293xa.r> pVar2 = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i18))) {
                J4.i.d(i18, c1086gP, i18, pVar2);
            }
            R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC2);
            c1086gP.L(-457726390);
            for (Header.Expanded.SocialAccount socialAccount : teamPresenceUiState.getSocialAccounts()) {
                if (kotlin.jvm.internal.i.a(socialAccount.getProvider(), "twitter")) {
                    Painter painterA = U.c.a(R.drawable.intercom_twitter, c1086gP, r10);
                    String provider = socialAccount.getProvider();
                    long jM616getActionContrastWhite0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m616getActionContrastWhite0d7_KjU();
                    androidx.compose.ui.h hVarM = W.m(aVar4, 16);
                    c1086gP.L(-144020278);
                    Object objF = c1086gP.f();
                    if (objF == InterfaceC1084f.a.f12980a) {
                        objF = new androidx.compose.foundation.interaction.l();
                        c1086gP.E(objF);
                    }
                    c1086gP.T(r10);
                    Context context3 = context2;
                    context = context3;
                    IconKt.a(painterA, provider, ClickableKt.b(hVarM, (androidx.compose.foundation.interaction.k) objF, null, false, null, new F(socialAccount, 1, context3), 28), jM616getActionContrastWhite0d7_KjU, c1086gP, 8, 0);
                } else {
                    context = context2;
                }
                context2 = context;
            }
            c1086gP.T(r10);
            c1086gP.T(true);
        }
        c1086gP.T(r10);
        c1086gP.L(-852298704);
        for (Header.Expanded.Footer footer : teamPresenceUiState.getFooters()) {
            Lb.a.a(c1086gP, W.e(aVar4, 4));
            T tA2 = S.a(C0945e.g(i17), bVar, c1086gP, i16);
            int i19 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P3 = c1086gP.P();
            androidx.compose.ui.h hVarC3 = ComposedModifierKt.c(c1086gP, aVar4);
            ComposeUiNode.f14331c0.getClass();
            Ia.a<ComposeUiNode> aVar6 = ComposeUiNode.Companion.f14333b;
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar6);
            } else {
                c1086gP.A();
            }
            R0.a(ComposeUiNode.Companion.f14337f, c1086gP, tA2);
            R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P3);
            Ia.p<ComposeUiNode, Integer, p293xa.r> pVar3 = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i19))) {
                J4.i.d(i19, c1086gP, i19, pVar3);
            }
            R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC3);
            c1086gP.L(-143995125);
            if (footer.getAvatarDetails() != null) {
                List<Avatar.Builder> avatars = footer.getAvatarDetails().getAvatars();
                ArrayList arrayList = new ArrayList(kotlin.collections.m.y(avatars, 10));
                Iterator<T> it = avatars.iterator();
                while (it.hasNext()) {
                    Avatar avatarBuild = ((Avatar.Builder) it.next()).build();
                    kotlin.jvm.internal.i.d(avatarBuild, "build(...)");
                    arrayList.add(new AvatarWrapper(avatarBuild, r10, 2, null));
                }
                AvatarGroupKt.m59AvatarGroupJ8mCjc(arrayList, aVar4, 20, 0L, c1086gP, 440, 8);
            }
            c1086gP.T(r10);
            TextKt.b(footer.getText(), null, 0L, 0L, null, null, null, 0L, null, new androidx.compose.ui.text.style.g(3), 0L, 2, false, 2, 0, null, getTextStyleFor(footer.getStyle(), footer.getColor(), c1086gP, r10, r10), c1086gP, 0, 3120, 54782);
            c1086gP.T(true);
            i16 = i16;
            i17 = i17;
            bVar = bVar;
        }
        C1105p0 c1105p0A = C4.a.a(c1086gP, r10, true);
        if (c1105p0A != null) {
            c1105p0A.f13109d = new q(teamPresenceUiState, hVar3, i10, i11, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r ExpandedTeamPresenceLayout$lambda$8$lambda$4$lambda$3$lambda$2(Header.Expanded.SocialAccount it, Context context) {
        kotlin.jvm.internal.i.e(it, "$it");
        kotlin.jvm.internal.i.e(context, "$context");
        LinkOpener.handleUrl(it.getProfileUrl(), context, Injector.get().getApi());
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r ExpandedTeamPresenceLayout$lambda$9(ExpandedTeamPresenceState teamPresenceUiState, androidx.compose.ui.h hVar, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        kotlin.jvm.internal.i.e(teamPresenceUiState, "$teamPresenceUiState");
        ExpandedTeamPresenceLayout(teamPresenceUiState, hVar, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return p293xa.r.f47939a;
    }

    @IntercomPreviews
    private static final void ExpandedTeamPresenceLayoutPreviewWithAssignedAdmin(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(-1042616954);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ExpandedTeamPresenceLayoutKt.INSTANCE.m226getLambda6$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new C2282h(i10, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r ExpandedTeamPresenceLayoutPreviewWithAssignedAdmin$lambda$12(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        ExpandedTeamPresenceLayoutPreviewWithAssignedAdmin(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    @IntercomPreviews
    private static final void ExpandedTeamPresenceLayoutPreviewWithFin(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(467453596);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ExpandedTeamPresenceLayoutKt.INSTANCE.m222getLambda2$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new P(i10, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r ExpandedTeamPresenceLayoutPreviewWithFin$lambda$10(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        ExpandedTeamPresenceLayoutPreviewWithFin(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    @IntercomPreviews
    private static final void ExpandedTeamPresenceLayoutPreviewWithFinAndHumans(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(278476299);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ExpandedTeamPresenceLayoutKt.INSTANCE.m224getLambda4$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Q(i10, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r ExpandedTeamPresenceLayoutPreviewWithFinAndHumans$lambda$11(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        ExpandedTeamPresenceLayoutPreviewWithFinAndHumans(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    private static final androidx.compose.ui.text.F getTextStyleFor(Header.Expanded.Style style, String str, InterfaceC1084f interfaceC1084f, int i10, int i11) {
        androidx.compose.ui.text.F type03;
        androidx.compose.ui.graphics.H h8;
        interfaceC1084f.L(33871301);
        String str2 = (i11 & 2) != 0 ? null : str;
        int i12 = WhenMappings.$EnumSwitchMapping$1[style.ordinal()];
        if (i12 == 1) {
            interfaceC1084f.L(1720557014);
            type03 = IntercomTheme.INSTANCE.getTypography(interfaceC1084f, IntercomTheme.$stable).getType03();
            interfaceC1084f.D();
        } else if (i12 == 2) {
            interfaceC1084f.L(1720559900);
            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
            int i13 = IntercomTheme.$stable;
            androidx.compose.ui.text.F type04 = intercomTheme.getTypography(interfaceC1084f, i13).getType04();
            h8 = str2 != null ? new androidx.compose.ui.graphics.H(ColorExtensionsKt.toComposeColor$default(str2, 0.0f, 1, null)) : null;
            type03 = androidx.compose.ui.text.F.a(type04, h8 == null ? intercomTheme.getColors(interfaceC1084f, i13).m630getDescriptionText0d7_KjU() : h8.f13506a, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214);
            interfaceC1084f.D();
        } else if (i12 == 3) {
            interfaceC1084f.L(1720565846);
            IntercomTheme intercomTheme2 = IntercomTheme.INSTANCE;
            int i14 = IntercomTheme.$stable;
            androidx.compose.ui.text.F type01 = intercomTheme2.getTypography(interfaceC1084f, i14).getType01();
            h8 = str2 != null ? new androidx.compose.ui.graphics.H(ColorExtensionsKt.toComposeColor$default(str2, 0.0f, 1, null)) : null;
            type03 = androidx.compose.ui.text.F.a(type01, h8 == null ? intercomTheme2.getColors(interfaceC1084f, i14).m638getIntroText0d7_KjU() : h8.f13506a, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214);
            interfaceC1084f.D();
        } else if (i12 != 4) {
            interfaceC1084f.L(1720576342);
            type03 = IntercomTheme.INSTANCE.getTypography(interfaceC1084f, IntercomTheme.$stable).getType04();
            interfaceC1084f.D();
        } else {
            interfaceC1084f.L(1720571705);
            IntercomTheme intercomTheme3 = IntercomTheme.INSTANCE;
            int i15 = IntercomTheme.$stable;
            androidx.compose.ui.text.F type02 = intercomTheme3.getTypography(interfaceC1084f, i15).getType01();
            h8 = str2 != null ? new androidx.compose.ui.graphics.H(ColorExtensionsKt.toComposeColor$default(str2, 0.0f, 1, null)) : null;
            type03 = androidx.compose.ui.text.F.a(type02, h8 == null ? intercomTheme3.getColors(interfaceC1084f, i15).m634getGreetingText0d7_KjU() : h8.f13506a, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214);
            interfaceC1084f.D();
        }
        interfaceC1084f.D();
        return type03;
    }
}
