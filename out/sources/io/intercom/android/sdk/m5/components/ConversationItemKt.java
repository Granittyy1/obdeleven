package io.intercom.android.sdk.m5.components;

import android.content.Context;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.C0945e;
import androidx.compose.foundation.layout.C0952l;
import androidx.compose.foundation.layout.C0953m;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.VerticalAlignElement;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.R0;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.gms.internal.measurement.M1;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.LastParticipatingAdmin;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.Participant;
import io.intercom.android.sdk.models.Ticket;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.utilities.GroupConversationTextFormatter;
import io.intercom.android.sdk.utilities.TimeFormatterExtKt;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: ConversationItem.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ConversationItemKt {
    public static final void ConversationItem(final Conversation conversation, androidx.compose.ui.h hVar, androidx.compose.foundation.layout.L l10, boolean z10, final Ia.a<p293xa.r> onClick, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        final androidx.compose.foundation.layout.L n10;
        kotlin.jvm.internal.i.e(conversation, "conversation");
        kotlin.jvm.internal.i.e(onClick, "onClick");
        C1086g c1086gP = interfaceC1084f.p(-1756864283);
        final androidx.compose.ui.h hVar2 = (i11 & 2) != 0 ? androidx.compose.ui.h.a.f13984b : hVar;
        if ((i11 & 4) != 0) {
            float f10 = 0;
            n10 = new androidx.compose.foundation.layout.N(f10, f10, f10, f10);
        } else {
            n10 = l10;
        }
        boolean z11 = true;
        final boolean z12 = (i11 & 8) != 0 ? !conversation.isRead() : z10;
        final Context context = (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b);
        c1086gP.L(-437498000);
        if ((((57344 & i10) ^ 24576) <= 16384 || !c1086gP.K(onClick)) && (i10 & 24576) != 16384) {
            z11 = false;
        }
        Object objF = c1086gP.f();
        if (z11 || objF == InterfaceC1084f.a.f12980a) {
            objF = new io.intercom.android.sdk.helpcenter.articles.v(1, onClick);
            c1086gP.E(objF);
        }
        c1086gP.T(false);
        final boolean z13 = z12;
        SurfaceKt.a(ClickableKt.c(hVar2, false, null, (Ia.a) objF, 7), null, 0L, 0L, 0.0f, 0.0f, null, androidx.compose.runtime.internal.a.b(1413097514, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.components.ConversationItemKt.ConversationItem.2
            @Override // Ia.p
            public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                invoke(interfaceC1084f2, num.intValue());
                return p293xa.r.f47939a;
            }

            public final void invoke(InterfaceC1084f interfaceC1084f2, int i12) {
                List listK;
                Object obj;
                Context context2;
                String string;
                if ((i12 & 11) == 2 && interfaceC1084f2.s()) {
                    interfaceC1084f2.w();
                    return;
                }
                androidx.compose.ui.h.a aVar = androidx.compose.ui.h.a.f13984b;
                androidx.compose.ui.h hVarE = PaddingKt.e(aVar, n10);
                androidx.compose.ui.f.b bVar = androidx.compose.ui.d.a.f13344k;
                Conversation conversation2 = conversation;
                boolean z14 = z12;
                Context context3 = context;
                C0945e.j jVar = C0945e.f10284a;
                androidx.compose.foundation.layout.T tA = androidx.compose.foundation.layout.S.a(jVar, bVar, interfaceC1084f2, 48);
                int iF = interfaceC1084f2.F();
                InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f2.z();
                androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f2, hVarE);
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
                Ia.p<ComposeUiNode, androidx.compose.ui.layout.E, p293xa.r> pVar = ComposeUiNode.Companion.f14337f;
                R0.a(pVar, interfaceC1084f2, tA);
                Ia.p<ComposeUiNode, androidx.compose.runtime.r, p293xa.r> pVar2 = ComposeUiNode.Companion.f14336e;
                R0.a(pVar2, interfaceC1084f2, interfaceC1089h0Z);
                Ia.p<ComposeUiNode, Integer, p293xa.r> pVar3 = ComposeUiNode.Companion.f14338g;
                if (interfaceC1084f2.m() || !kotlin.jvm.internal.i.a(interfaceC1084f2.f(), Integer.valueOf(iF))) {
                    androidx.compose.animation.k.b(iF, interfaceC1084f2, iF, pVar3);
                }
                Ia.p<ComposeUiNode, androidx.compose.ui.h, p293xa.r> pVar4 = ComposeUiNode.Companion.f14335d;
                R0.a(pVar4, interfaceC1084f2, hVarC);
                if (LastParticipatingAdmin.isNull(conversation2.lastParticipatingAdmin())) {
                    listK = ConversationItemKt.getActiveAdminsAvatars();
                } else {
                    Avatar avatar = conversation2.lastParticipatingAdmin().getAvatar();
                    kotlin.jvm.internal.i.d(avatar, "getAvatar(...)");
                    listK = M1.k(new AvatarWrapper(avatar, conversation2.lastParticipatingAdmin().isBot()));
                }
                AvatarTriangleGroupKt.m60AvatarTriangleGroupjt2gSs(listK, new VerticalAlignElement(bVar), null, 32, interfaceC1084f2, 3080, 4);
                Lb.a.a(interfaceC1084f2, androidx.compose.foundation.layout.W.q(aVar, 12));
                if (2.0f <= 0.0d) {
                    p258v.a.a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement = new LayoutWeightElement(true, Na.l.z(2.0f, Float.MAX_VALUE));
                C0953m c0953mA = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, interfaceC1084f2, 0);
                int iF2 = interfaceC1084f2.F();
                InterfaceC1089h0 interfaceC1089h0Z2 = interfaceC1084f2.z();
                androidx.compose.ui.h hVarC2 = ComposedModifierKt.c(interfaceC1084f2, layoutWeightElement);
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
                R0.a(pVar, interfaceC1084f2, c0953mA);
                R0.a(pVar2, interfaceC1084f2, interfaceC1089h0Z2);
                if (interfaceC1084f2.m() || !kotlin.jvm.internal.i.a(interfaceC1084f2.f(), Integer.valueOf(iF2))) {
                    androidx.compose.animation.k.b(iF2, interfaceC1084f2, iF2, pVar3);
                }
                R0.a(pVar4, interfaceC1084f2, hVarC2);
                interfaceC1084f2.L(-1283476508);
                if (conversation2.getTicket() != null) {
                    obj = null;
                    TicketHeaderKt.TicketHeader(null, new TicketStatusHeaderArgs(conversation2.getTicket().getTitle(), conversation2.isRead() ? androidx.compose.ui.text.font.l.f15442g : androidx.compose.ui.text.font.l.f15444i), interfaceC1084f2, 0, 1);
                } else {
                    obj = null;
                }
                interfaceC1084f2.D();
                String summary = conversation2.lastPart().getSummary();
                if (summary.length() == 0) {
                    summary = conversation2.getTicket() != null ? conversation2.getTicket().getCurrentStatus().getStatusDetail() : "";
                }
                interfaceC1084f2.L(-1283454258);
                kotlin.jvm.internal.i.b(summary);
                if (summary.length() > 0) {
                    interfaceC1084f2.L(-1283451787);
                    if (conversation2.lastPart().getParticipant().isUserWithId(ConversationItemKt.getUserIntercomId())) {
                        summary = ((Context) interfaceC1084f2.x(AndroidCompositionLocals_androidKt.f14793b)).getString(R.string.intercom_you) + ": " + summary;
                    }
                    interfaceC1084f2.D();
                    kotlin.jvm.internal.i.b(summary);
                    TextKt.b(summary, PaddingKt.j(aVar, 0.0f, 0.0f, 0.0f, 4, 7), 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, androidx.compose.ui.text.F.a(IntercomTheme.INSTANCE.getTypography(interfaceC1084f2, IntercomTheme.$stable).getType04(), 0L, 0L, conversation2.isRead() ? androidx.compose.ui.text.font.l.f15442g : androidx.compose.ui.text.font.l.f15444i, null, 0L, null, 0, 0L, null, null, 16777211), interfaceC1084f2, 48, 3120, 55292);
                }
                interfaceC1084f2.D();
                androidx.compose.foundation.layout.T tA2 = androidx.compose.foundation.layout.S.a(jVar, androidx.compose.ui.d.a.j, interfaceC1084f2, 0);
                int iF3 = interfaceC1084f2.F();
                InterfaceC1089h0 interfaceC1089h0Z3 = interfaceC1084f2.z();
                androidx.compose.ui.h hVarC3 = ComposedModifierKt.c(interfaceC1084f2, aVar);
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
                R0.a(pVar, interfaceC1084f2, tA2);
                R0.a(pVar2, interfaceC1084f2, interfaceC1089h0Z3);
                if (interfaceC1084f2.m() || !kotlin.jvm.internal.i.a(interfaceC1084f2.f(), Integer.valueOf(iF3))) {
                    androidx.compose.animation.k.b(iF3, interfaceC1084f2, iF3, pVar3);
                }
                R0.a(pVar4, interfaceC1084f2, hVarC3);
                String firstName = conversation2.lastParticipatingAdmin().getFirstName();
                kotlin.jvm.internal.i.d(firstName, "getFirstName(...)");
                if (firstName.length() == 0) {
                    string = ConversationItemKt.getWorkspaceName();
                    context2 = context3;
                } else {
                    String firstName2 = conversation2.lastParticipatingAdmin().getFirstName();
                    kotlin.jvm.internal.i.d(firstName2, "getFirstName(...)");
                    context2 = r19;
                    string = GroupConversationTextFormatter.groupConversationSubtitle(firstName2, conversation2.groupConversationParticipants().size(), context2).toString();
                }
                String str = TimeFormatterExtKt.formattedDateFromLong(conversation2.lastPart().getCreatedAt(), context2);
                if (str.length() == 0) {
                    str = conversation2.getTicket() != null ? TimeFormatterExtKt.formattedDateFromLong(conversation2.getTicket().getCurrentStatus().getCreatedDate(), context2) : "";
                }
                IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                int i13 = IntercomTheme.$stable;
                TextWithSeparatorKt.m129TextWithSeparatorwV1YYcM(string, str, null, null, intercomTheme.getTypography(interfaceC1084f2, i13).getType04(), intercomTheme.getColors(interfaceC1084f2, i13).m630getDescriptionText0d7_KjU(), 0, 0, null, interfaceC1084f2, 0, 460);
                interfaceC1084f2.J();
                interfaceC1084f2.J();
                if (z14) {
                    interfaceC1084f2.L(-1055527017);
                    ConversationItemKt.UnreadIndicator(null, interfaceC1084f2, 0, 1);
                    interfaceC1084f2.D();
                } else {
                    interfaceC1084f2.L(-1055471186);
                    IntercomChevronKt.IntercomChevron(PaddingKt.j(aVar, 6, 0.0f, 0.0f, 0.0f, 14), interfaceC1084f2, 6, 0);
                    interfaceC1084f2.D();
                }
                interfaceC1084f2.J();
            }
        }, c1086gP), c1086gP, 12582912, me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_windowNoTitle);
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.components.V
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return ConversationItemKt.ConversationItem$lambda$2(conversation, hVar2, n10, z13, onClick, i10, i11, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r ConversationItem$lambda$1$lambda$0(Ia.a onClick) {
        kotlin.jvm.internal.i.e(onClick, "$onClick");
        onClick.invoke();
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r ConversationItem$lambda$2(Conversation conversation, androidx.compose.ui.h hVar, androidx.compose.foundation.layout.L l10, boolean z10, Ia.a onClick, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        kotlin.jvm.internal.i.e(conversation, "$conversation");
        kotlin.jvm.internal.i.e(onClick, "$onClick");
        ConversationItem(conversation, hVar, l10, z10, onClick, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return p293xa.r.f47939a;
    }

    @IntercomPreviews
    public static final void ReadConversationWithSimpleTicketHeaderPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(1446702226);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ConversationItemKt.INSTANCE.m75getLambda1$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new io.intercom.android.sdk.helpcenter.articles.u(i10, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r ReadConversationWithSimpleTicketHeaderPreview$lambda$7(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        ReadConversationWithSimpleTicketHeaderPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    @IntercomPreviews
    public static final void UnreadConversationCardPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(-1292079862);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ConversationItemKt.INSTANCE.m77getLambda3$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new io.intercom.android.sdk.helpcenter.articles.t(i10, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r UnreadConversationCardPreview$lambda$9(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        UnreadConversationCardPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    @IntercomPreviews
    public static final void UnreadConversationCardWithBotPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(-516742229);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ConversationItemKt.INSTANCE.m78getLambda4$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new T(i10, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r UnreadConversationCardWithBotPreview$lambda$10(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        UnreadConversationCardWithBotPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    @IntercomPreviews
    public static final void UnreadConversationWithSimpleTicketHeaderPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(1866912491);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ConversationItemKt.INSTANCE.m76getLambda2$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new U(i10, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r UnreadConversationWithSimpleTicketHeaderPreview$lambda$8(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        UnreadConversationWithSimpleTicketHeaderPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    public static final void UnreadIndicator(androidx.compose.ui.h hVar, InterfaceC1084f interfaceC1084f, int i10, int i11) {
        int i12;
        C1086g c1086gP = interfaceC1084f.p(481161991);
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
            androidx.compose.ui.h.a aVar = androidx.compose.ui.h.a.f13984b;
            if (i13 != 0) {
                hVar = aVar;
            }
            androidx.compose.ui.h hVarM = androidx.compose.foundation.layout.W.m(hVar, 16);
            androidx.compose.ui.layout.E eD = BoxKt.d(androidx.compose.ui.d.a.f13340f, false);
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
            CanvasKt.a(androidx.compose.foundation.layout.W.m(aVar, 8), new W(), c1086gP, 54);
            c1086gP.T(true);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new X(hVar, i10, i11, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r UnreadIndicator$lambda$5$lambda$4(J.e Canvas) {
        kotlin.jvm.internal.i.e(Canvas, "$this$Canvas");
        long jE = Q3.d.e(4292544041L);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (Canvas.j() >> 32)) / 2.0f;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (Canvas.j() & 4294967295L)) / 2.0f;
        Canvas.S(jE, (me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_windowFixedWidthMajor & 2) != 0 ? I.h.c(Canvas.j()) / 2.0f : 0.0f, (me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_windowFixedWidthMajor & 4) != 0 ? Canvas.j1() : (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L), 1.0f, J.h.f3954a, null, (me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_windowFixedWidthMajor & 64) != 0 ? 3 : 0);
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r UnreadIndicator$lambda$6(androidx.compose.ui.h hVar, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        UnreadIndicator(hVar, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<AvatarWrapper> getActiveAdminsAvatars() {
        List<Participant> listI0 = kotlin.collections.q.i0(Injector.get().getDataLayer().getTeamPresence().getValue().getBuiltActiveAdmins(), 3);
        ArrayList arrayList = new ArrayList(kotlin.collections.m.y(listI0, 10));
        for (Participant participant : listI0) {
            Avatar avatar = participant.getAvatar();
            kotlin.jvm.internal.i.d(avatar, "getAvatar(...)");
            Boolean boolIsBot = participant.isBot();
            kotlin.jvm.internal.i.d(boolIsBot, "isBot(...)");
            arrayList.add(new AvatarWrapper(avatar, boolIsBot.booleanValue()));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getUserIntercomId() {
        if (Injector.isNotInitialised()) {
            return "";
        }
        String intercomId = Injector.get().getUserIdentity().getIntercomId();
        kotlin.jvm.internal.i.d(intercomId, "getIntercomId(...)");
        return intercomId;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getWorkspaceName() {
        return ((AppConfig) Z3.o.b()).getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Conversation sampleConversation(Ticket ticket, boolean z10) {
        LastParticipatingAdmin.Builder builderWithAvatar = new LastParticipatingAdmin.Builder().withFirstName("Santhosh Kumar").withAvatar(new Avatar.Builder().withInitials("SK"));
        kotlin.jvm.internal.i.d(builderWithAvatar, "withAvatar(...)");
        return new Conversation("123", z10, null, M1.k(new Part.Builder().withSummary("This is the last message received/sent to/from this user").withCreatedAt(1659081886L)), null, builderWithAvatar, null, false, false, null, null, false, ticket, null, null, null, null, null, null, null, 1044436, null);
    }

    public static /* synthetic */ Conversation sampleConversation$default(Ticket ticket, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            ticket = null;
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return sampleConversation(ticket, z10);
    }

    private static final Conversation sampleConversationWithBot(Ticket ticket) {
        LastParticipatingAdmin.Builder builderWithIsBot = new LastParticipatingAdmin.Builder().withFirstName("Operator").withAvatar(new Avatar.Builder().withInitials("O")).withIsBot(Boolean.TRUE);
        kotlin.jvm.internal.i.d(builderWithIsBot, "withIsBot(...)");
        return new Conversation("123", false, null, M1.k(new Part.Builder().withSummary("This is the last message received/sent to/from this user").withCreatedAt(1659081886L)), null, builderWithIsBot, null, false, false, null, null, false, ticket, null, null, null, null, null, null, null, 1044438, null);
    }

    public static /* synthetic */ Conversation sampleConversationWithBot$default(Ticket ticket, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            ticket = null;
        }
        return sampleConversationWithBot(ticket);
    }
}
