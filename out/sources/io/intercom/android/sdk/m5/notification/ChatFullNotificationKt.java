package io.intercom.android.sdk.m5.notification;

import Ia.p;
import android.content.Context;
import androidx.compose.foundation.C0932d;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.C0945e;
import androidx.compose.foundation.layout.C0952l;
import androidx.compose.foundation.layout.C0953m;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.S;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.W;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.R0;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.graphics.h0;
import androidx.compose.ui.h;
import androidx.compose.ui.layout.E;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.text.F;
import androidx.compose.ui.text.font.l;
import io.intercom.android.nexus.NexusConfig;
import io.intercom.android.sdk.carousel.CarouselScreenFragment;
import io.intercom.android.sdk.helpcenter.articles.x;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.m5.components.A0;
import io.intercom.android.sdk.m5.components.C2271b0;
import io.intercom.android.sdk.m5.components.TicketHeaderKt;
import io.intercom.android.sdk.m5.components.TicketStatusHeaderArgs;
import io.intercom.android.sdk.m5.components.Y;
import io.intercom.android.sdk.m5.components.avatar.AvatarIconKt;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.O;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.AttachmentSettings;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.ConversationStateSyncSettings;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.Ticket;
import io.intercom.android.sdk.overlay.ComposeCompatibilityUtilKt;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.i;
import kotlin.text.n;
import p270w.g;
import p293xa.r;

/* JADX INFO: compiled from: ChatFullNotification.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ChatFullNotificationKt {
    private static final AppConfig previewAppConfig;

    static {
        EmptySet emptySet = EmptySet.f42985b;
        previewAppConfig = new AppConfig("", -12627531, -13615201, -15064194, false, false, false, 100, 1000L, 1000L, 1000L, 1000L, true, true, "", "", false, true, "", emptySet, emptySet, "", "", false, true, false, false, false, null, new NexusConfig(), AttachmentSettings.Companion.getDEFAULT(), true, false, ConversationStateSyncSettings.Companion.getDEFAULT());
    }

    private static final void ChatFullContent(final Conversation conversation, final Context context, InterfaceC1084f interfaceC1084f, final int i10) {
        C1086g c1086gP = interfaceC1084f.p(649010099);
        Part partLastPart = conversation.lastPart();
        String summary = partLastPart.getSummary();
        i.d(summary, "getSummary(...)");
        if (n.S(summary)) {
            c1086gP.L(341123830);
            if (conversation.getTicket() != null) {
                Ticket ticket = conversation.getTicket();
                InAppNotificationCardKt.TicketInAppNotificationContent(i.a(ticket.getCurrentStatus().getType(), MetricTracker.Action.SUBMITTED) ? null : ticket.getAssignee().build().getForename(), ticket.getCurrentStatus().getTitle(), "Just now", c1086gP, 384, 0);
            }
            c1086gP.T(false);
        } else {
            c1086gP.L(340941240);
            String summary2 = partLastPart.getSummary();
            i.d(summary2, "getSummary(...)");
            TextKt.b(summary2, W.d(h.a.f13984b, 1.0f), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(c1086gP, IntercomTheme.$stable).getType05(), c1086gP, 48, 0, 65532);
            c1086gP.T(false);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new p() { // from class: io.intercom.android.sdk.m5.notification.a
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return ChatFullNotificationKt.ChatFullContent$lambda$5(conversation, context, i10, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r ChatFullContent$lambda$5(Conversation conversation, Context context, int i10, InterfaceC1084f interfaceC1084f, int i11) {
        i.e(conversation, "$conversation");
        i.e(context, "$context");
        ChatFullContent(conversation, context, interfaceC1084f, L4.b.l(i10 | 1));
        return r.f47939a;
    }

    public static final void ChatFullNotification(final Conversation conversation, final AppConfig appConfig, h hVar, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        boolean z10;
        i.e(conversation, "conversation");
        i.e(appConfig, "appConfig");
        C1086g c1086gP = interfaceC1084f.p(1263781866);
        int i12 = i11 & 4;
        h.a aVar = h.a.f13984b;
        h hVar2 = i12 != 0 ? aVar : hVar;
        Context context = (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b);
        float f10 = 8;
        h hVarR = A8.p.r(P3.d.v(hVar2, 4, g.b(f10), 0L, 0L, 24), g.b(f10));
        IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
        int i13 = IntercomTheme.$stable;
        h hVarG = W.g(PaddingKt.f(C0932d.b(hVarR, intercomTheme.getColors(c1086gP, i13).m621getBackground0d7_KjU(), h0.f13629a), 16), 0.0f, CarouselScreenFragment.CAROUSEL_ANIMATION_MS, 1);
        E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
        int i14 = c1086gP.f12996P;
        InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
        h hVarC = ComposedModifierKt.c(c1086gP, hVarG);
        ComposeUiNode.f14331c0.getClass();
        Ia.a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f14333b;
        c1086gP.r();
        if (c1086gP.f12995O) {
            c1086gP.v(aVar2);
        } else {
            c1086gP.A();
        }
        p<ComposeUiNode, E, r> pVar = ComposeUiNode.Companion.f14337f;
        R0.a(pVar, c1086gP, eD);
        p<ComposeUiNode, androidx.compose.runtime.r, r> pVar2 = ComposeUiNode.Companion.f14336e;
        R0.a(pVar2, c1086gP, interfaceC1089h0P);
        p<ComposeUiNode, Integer, r> pVar3 = ComposeUiNode.Companion.f14338g;
        if (c1086gP.f12995O || !i.a(c1086gP.f(), Integer.valueOf(i14))) {
            J4.i.d(i14, c1086gP, i14, pVar3);
        }
        p<ComposeUiNode, h, r> pVar4 = ComposeUiNode.Companion.f14335d;
        R0.a(pVar4, c1086gP, hVarC);
        h hVarD = W.d(aVar, 1.0f);
        C0953m c0953mA = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, c1086gP, 0);
        int i15 = c1086gP.f12996P;
        InterfaceC1089h0 interfaceC1089h0P2 = c1086gP.P();
        h hVarC2 = ComposedModifierKt.c(c1086gP, hVarD);
        c1086gP.r();
        if (c1086gP.f12995O) {
            c1086gP.v(aVar2);
        } else {
            c1086gP.A();
        }
        R0.a(pVar, c1086gP, c0953mA);
        R0.a(pVar2, c1086gP, interfaceC1089h0P2);
        if (c1086gP.f12995O || !i.a(c1086gP.f(), Integer.valueOf(i15))) {
            J4.i.d(i15, c1086gP, i15, pVar3);
        }
        R0.a(pVar4, c1086gP, hVarC2);
        h hVarD2 = W.d(aVar, 1.0f);
        float f11 = 12;
        T tA = S.a(C0945e.g(f11), androidx.compose.ui.d.a.f13344k, c1086gP, 54);
        int i16 = c1086gP.f12996P;
        InterfaceC1089h0 interfaceC1089h0P3 = c1086gP.P();
        h hVarC3 = ComposedModifierKt.c(c1086gP, hVarD2);
        c1086gP.r();
        if (c1086gP.f12995O) {
            c1086gP.v(aVar2);
        } else {
            c1086gP.A();
        }
        R0.a(pVar, c1086gP, tA);
        R0.a(pVar2, c1086gP, interfaceC1089h0P3);
        if (c1086gP.f12995O || !i.a(c1086gP.f(), Integer.valueOf(i16))) {
            J4.i.d(i16, c1086gP, i16, pVar3);
        }
        R0.a(pVar4, c1086gP, hVarC3);
        Avatar avatar = conversation.lastAdmin().getAvatar();
        i.d(avatar, "getAvatar(...)");
        Boolean boolIsBot = conversation.lastAdmin().isBot();
        i.d(boolIsBot, "isBot(...)");
        AvatarIconKt.m131AvatarIconRd90Nhg(W.m(aVar, 32), new AvatarWrapper(avatar, boolIsBot.booleanValue()), null, false, 0L, null, c1086gP, 70, 60);
        if (conversation.getTicket() != null) {
            c1086gP.L(2114072472);
            TicketHeaderKt.TicketHeader(null, new TicketStatusHeaderArgs(conversation.getTicket().getTitle(), conversation.isRead() ? l.f15442g : l.f15444i), c1086gP, 0, 1);
            c1086gP.T(false);
            z10 = true;
        } else {
            c1086gP.L(2114407458);
            String name = conversation.lastAdmin().getName();
            i.d(name, "getName(...)");
            TextKt.b(name, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, F.a(intercomTheme.getTypography(c1086gP, i13).getType05(), 0L, 0L, l.f15444i, null, 0L, null, 0, 0L, null, null, 16777211), c1086gP, 0, 3120, 55294);
            c1086gP.T(false);
            z10 = true;
        }
        c1086gP.T(z10);
        Lb.a.a(c1086gP, W.e(aVar, f11));
        ChatFullContent(conversation, context, c1086gP, 72);
        C1105p0 c1105p0A = C4.a.a(c1086gP, z10, z10);
        if (c1105p0A != null) {
            final h hVar3 = hVar2;
            c1105p0A.f13109d = new p() { // from class: io.intercom.android.sdk.m5.notification.b
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return ChatFullNotificationKt.ChatFullNotification$lambda$4(conversation, appConfig, hVar3, i10, i11, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r ChatFullNotification$lambda$4(Conversation conversation, AppConfig appConfig, h hVar, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        i.e(conversation, "$conversation");
        i.e(appConfig, "$appConfig");
        ChatFullNotification(conversation, appConfig, hVar, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return r.f47939a;
    }

    @IntercomPreviews
    public static final void ChatFullNotificationAssignedTicketPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(-671495709);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ChatFullNotificationKt.INSTANCE.m341getLambda5$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new O(i10, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r ChatFullNotificationAssignedTicketPreview$lambda$10(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        ChatFullNotificationAssignedTicketPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return r.f47939a;
    }

    @IntercomPreviews
    public static final void ChatFullNotificationBotPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(1053171888);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ChatFullNotificationKt.INSTANCE.m339getLambda3$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new C2271b0(i10, 6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r ChatFullNotificationBotPreview$lambda$8(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        ChatFullNotificationBotPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return r.f47939a;
    }

    @IntercomPreviews
    public static final void ChatFullNotificationPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(1120680649);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ChatFullNotificationKt.INSTANCE.m337getLambda1$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new A0(i10, 5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r ChatFullNotificationPreview$lambda$6(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        ChatFullNotificationPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return r.f47939a;
    }

    @IntercomPreviews
    public static final void ChatFullNotificationShortMessagePreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(735919252);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ChatFullNotificationKt.INSTANCE.m338getLambda2$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new x(i10, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r ChatFullNotificationShortMessagePreview$lambda$7(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        ChatFullNotificationShortMessagePreview(interfaceC1084f, L4.b.l(i10 | 1));
        return r.f47939a;
    }

    @IntercomPreviews
    public static final void ChatFullNotificationTicketPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(202840309);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ChatFullNotificationKt.INSTANCE.m340getLambda4$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Y(i10, 5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r ChatFullNotificationTicketPreview$lambda$9(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        ChatFullNotificationTicketPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return r.f47939a;
    }

    public static final void addChatFullNotificationToView(ComposeView composeView, final Conversation conversation, final AppConfig appConfig) {
        i.e(conversation, "conversation");
        i.e(appConfig, "appConfig");
        if (composeView == null || ComposeCompatibilityUtilKt.isLegacyActivity(composeView)) {
            return;
        }
        composeView.setContent(new ComposableLambdaImpl(true, 1805122629, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.m5.notification.ChatFullNotificationKt$addChatFullNotificationToView$1$1
            @Override // Ia.p
            public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
                invoke(interfaceC1084f, num.intValue());
                return r.f47939a;
            }

            public final void invoke(InterfaceC1084f interfaceC1084f, int i10) {
                if ((i10 & 11) == 2 && interfaceC1084f.s()) {
                    interfaceC1084f.w();
                    return;
                }
                final Conversation conversation2 = conversation;
                final AppConfig appConfig2 = appConfig;
                IntercomThemeKt.IntercomTheme(null, null, null, androidx.compose.runtime.internal.a.b(583177563, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.m5.notification.ChatFullNotificationKt$addChatFullNotificationToView$1$1.1
                    @Override // Ia.p
                    public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        invoke(interfaceC1084f2, num.intValue());
                        return r.f47939a;
                    }

                    public final void invoke(InterfaceC1084f interfaceC1084f2, int i11) {
                        if ((i11 & 11) == 2 && interfaceC1084f2.s()) {
                            interfaceC1084f2.w();
                        } else {
                            ChatFullNotificationKt.ChatFullNotification(conversation2, appConfig2, null, interfaceC1084f2, 72, 4);
                        }
                    }
                }, interfaceC1084f), interfaceC1084f, 3072, 7);
            }
        }));
    }
}
