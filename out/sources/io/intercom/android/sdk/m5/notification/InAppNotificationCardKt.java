package io.intercom.android.sdk.m5.notification;

import Ia.p;
import S4.o;
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
import androidx.compose.material3.C1061m;
import androidx.compose.material3.ColorSchemeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.R0;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.h;
import androidx.compose.ui.layout.E;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.text.C1260a;
import androidx.compose.ui.text.F;
import androidx.compose.ui.text.font.l;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.components.C2277e0;
import io.intercom.android.sdk.m5.components.TicketHeaderKt;
import io.intercom.android.sdk.m5.components.TicketStatusHeaderArgs;
import io.intercom.android.sdk.m5.components.avatar.AvatarIconKt;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.conversation.ui.components.row.x;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.MessageStyle;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.Ticket;
import io.intercom.android.sdk.overlay.ComposeCompatibilityUtilKt;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.utilities.Phrase;
import kotlin.jvm.internal.i;
import p293xa.r;

/* JADX INFO: compiled from: InAppNotificationCard.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class InAppNotificationCardKt {

    /* JADX INFO: compiled from: InAppNotificationCard.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MessageStyle.values().length];
            try {
                iArr[MessageStyle.TICKET_STATE_UPDATED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MessageStyle.CHAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [io.intercom.android.sdk.ui.theme.IntercomTheme] */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r15v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.compose.runtime.f, androidx.compose.runtime.g] */
    /* JADX WARN: Type inference failed for: r33v0 */
    /* JADX WARN: Type inference failed for: r33v1 */
    /* JADX WARN: Type inference failed for: r33v2 */
    /* JADX WARN: Type inference failed for: r33v3 */
    /* JADX WARN: Type inference failed for: r33v4 */
    /* JADX WARN: Type inference failed for: r33v5 */
    /* JADX WARN: Type inference failed for: r33v6 */
    /* JADX WARN: Type inference failed for: r33v7 */
    /* JADX WARN: Type inference failed for: r33v8 */
    /* JADX WARN: Type inference failed for: r3v4, types: [io.intercom.android.sdk.ui.theme.IntercomTheme] */
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
    public static final void InAppNotificationCard(final Conversation conversation, h hVar, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        ?? r12;
        String forename;
        ?? r33;
        ?? r15;
        ?? r10;
        ?? r34;
        ?? r16;
        i.e(conversation, "conversation");
        ?? P10 = interfaceC1084f.p(-320085669);
        int i12 = i11 & 2;
        h.a aVar = h.a.f13984b;
        h hVar2 = i12 != 0 ? aVar : hVar;
        Context context = (Context) P10.x(AndroidCompositionLocals_androidKt.f14793b);
        ?? r11 = IntercomTheme.INSTANCE;
        int i13 = IntercomTheme.$stable;
        h hVar3 = hVar2;
        h hVar4 = hVar2;
        int i14 = i13;
        float f10 = 16;
        h hVarG = PaddingKt.g(f10, f10, C0932d.b(P3.d.v(hVar3, 2, r11.getShapes(P10, i13).f12430b, 0L, 0L, 24), ((C1061m) P10.x(ColorSchemeKt.f12087a)).f12632n, r11.getShapes(P10, i14).f12430b));
        E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
        int i15 = P10.f12996P;
        InterfaceC1089h0 interfaceC1089h0P = P10.P();
        h hVarC = ComposedModifierKt.c(P10, hVarG);
        ComposeUiNode.f14331c0.getClass();
        Ia.a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f14333b;
        P10.r();
        if (P10.f12995O) {
            P10.v(aVar2);
        } else {
            P10.A();
        }
        p<ComposeUiNode, E, r> pVar = ComposeUiNode.Companion.f14337f;
        R0.a(pVar, P10, eD);
        p<ComposeUiNode, androidx.compose.runtime.r, r> pVar2 = ComposeUiNode.Companion.f14336e;
        R0.a(pVar2, P10, interfaceC1089h0P);
        p<ComposeUiNode, Integer, r> pVar3 = ComposeUiNode.Companion.f14338g;
        if (P10.f12995O || !i.a(P10.f(), Integer.valueOf(i15))) {
            J4.i.d(i15, P10, i15, pVar3);
        }
        p<ComposeUiNode, h, r> pVar4 = ComposeUiNode.Companion.f14335d;
        R0.a(pVar4, P10, hVarC);
        h hVarD = W.d(aVar, 1.0f);
        T tA = S.a(C0945e.g(8), androidx.compose.ui.d.a.j, P10, 54);
        int i16 = P10.f12996P;
        InterfaceC1089h0 interfaceC1089h0P2 = P10.P();
        h hVarC2 = ComposedModifierKt.c(P10, hVarD);
        P10.r();
        if (P10.f12995O) {
            P10.v(aVar2);
        } else {
            P10.A();
        }
        R0.a(pVar, P10, tA);
        R0.a(pVar2, P10, interfaceC1089h0P2);
        if (P10.f12995O || !i.a(P10.f(), Integer.valueOf(i16))) {
            J4.i.d(i16, P10, i16, pVar3);
        }
        R0.a(pVar4, P10, hVarC2);
        Avatar avatar = conversation.lastAdmin().getAvatar();
        i.d(avatar, "getAvatar(...)");
        Boolean boolIsBot = conversation.lastAdmin().isBot();
        i.d(boolIsBot, "isBot(...)");
        AvatarIconKt.m131AvatarIconRd90Nhg(W.m(aVar, 32), new AvatarWrapper(avatar, boolIsBot.booleanValue()), null, false, 0L, null, P10, 70, 60);
        C0953m c0953mA = C0952l.a(C0945e.g(4), androidx.compose.ui.d.a.f13346m, P10, 6);
        int i17 = P10.f12996P;
        InterfaceC1089h0 interfaceC1089h0P3 = P10.P();
        h hVarC3 = ComposedModifierKt.c(P10, aVar);
        P10.r();
        if (P10.f12995O) {
            P10.v(aVar2);
        } else {
            P10.A();
        }
        R0.a(pVar, P10, c0953mA);
        R0.a(pVar2, P10, interfaceC1089h0P3);
        if (P10.f12995O || !i.a(P10.f(), Integer.valueOf(i17))) {
            J4.i.d(i17, P10, i17, pVar3);
        }
        R0.a(pVar4, P10, hVarC3);
        P10.L(110719758);
        if (conversation.getTicket() != null) {
            r12 = 0;
            TicketHeaderKt.TicketHeader(null, new TicketStatusHeaderArgs(conversation.getTicket().getTitle(), conversation.isRead() ? l.f15442g : l.f15444i), P10, 0, 1);
        } else {
            r12 = 0;
        }
        P10.T(r12);
        if (conversation.parts().isEmpty()) {
            hVar4 = hVar4;
            i14 = i14;
            ?? r35 = r11;
            ?? r17 = r12;
            if (conversation.getTicket() != null) {
                P10.L(-860880263);
                Ticket ticket = conversation.getTicket();
                forename = i.a(ticket.getCurrentStatus().getType(), MetricTracker.Action.SUBMITTED) ? null : ticket.getAssignee().build().getForename();
                String title = ticket.getCurrentStatus().getTitle();
                String string = context.getString(R.string.intercom_time_just_now);
                i.d(string, "getString(...)");
                TicketInAppNotificationContent(forename, title, string, P10, 0, 0);
                P10.T(r17);
                r15 = r17;
                r33 = r35;
            } else {
                P10.L(-860364609);
                P10.T(r17);
                r15 = r17;
                r33 = r35;
            }
        } else {
            P10.L(-862185704);
            Part part = conversation.parts().get(r12);
            MessageStyle messageStyle = part.getMessageStyle();
            int i18 = messageStyle == null ? -1 : WhenMappings.$EnumSwitchMapping$0[messageStyle.ordinal()];
            if (i18 == 1) {
                r34 = r11;
                ?? r18 = r12;
                P10.L(-862033928);
                forename = i.a(part.getEventData().getStatus(), MetricTracker.Action.SUBMITTED) ? null : part.getParticipant().getForename();
                String eventAsPlainText = part.getEventData().getEventAsPlainText();
                String string2 = context.getString(R.string.intercom_time_just_now);
                i.d(string2, "getString(...)");
                TicketInAppNotificationContent(forename, eventAsPlainText, string2, P10, 0, 0);
                P10.T(r18);
                r rVar = r.f47939a;
                r16 = r18;
            } else if (i18 != 2) {
                P10.L(-861083964);
                P10.T(r12);
                r rVar2 = r.f47939a;
                r34 = r11;
                r16 = r12;
            } else {
                P10.L(-861473324);
                String summary = part.getSummary();
                i.d(summary, "getSummary(...)");
                r34 = r11;
                TextKt.b(summary, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 2, 0, null, r11.getTypography(P10, i14).getType04Point5(), P10, 0, 3120, 55294);
                r16 = 0;
                P10.T(false);
                r rVar3 = r.f47939a;
            }
            P10.T(r16);
            r15 = r16;
            r33 = r34;
        }
        P10.L(110794746);
        if (conversation.getTicket() == null) {
            TextKt.b(Phrase.from(context, R.string.intercom_reply_from_admin).put("name", conversation.lastAdmin().getName()).format().toString(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, F.a(r33.getTypography(P10, i14).getType04Point5(), Q3.d.e(4285887861L), 0L, null, null, 0L, null, 0, 0L, null, null, 16777214), P10, 0, 3072, 57342);
            r10 = 0;
        } else {
            r10 = r15;
        }
        P10.T(r10);
        P10.T(true);
        P10.T(true);
        P10.T(true);
        C1105p0 c1105p0V = P10.V();
        if (c1105p0V != null) {
            final h hVar5 = hVar4;
            c1105p0V.f13109d = new p() { // from class: io.intercom.android.sdk.m5.notification.c
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return InAppNotificationCardKt.InAppNotificationCard$lambda$5(conversation, hVar5, i10, i11, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r InAppNotificationCard$lambda$5(Conversation conversation, h hVar, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        i.e(conversation, "$conversation");
        InAppNotificationCard(conversation, hVar, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return r.f47939a;
    }

    @IntercomPreviews
    private static final void InAppNotificationCardPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(-2144100909);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$InAppNotificationCardKt.INSTANCE.m342getLambda1$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new C2277e0(i10, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r InAppNotificationCardPreview$lambda$7(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        InAppNotificationCardPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return r.f47939a;
    }

    @IntercomPreviews
    private static final void InAppNotificationCardTicketPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(-186124313);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$InAppNotificationCardKt.INSTANCE.m343getLambda2$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new d(i10, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r InAppNotificationCardTicketPreview$lambda$8(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        InAppNotificationCardTicketPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return r.f47939a;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x0095  */
    /* JADX WARN: Code duplicated, block: B:53:0x00cd  */
    /* JADX WARN: Instruction removed from duplicated block: B:53:0x00cd, please report this as an issue */
    public static final void TicketInAppNotificationContent(String str, String ticketStatus, String str2, InterfaceC1084f interfaceC1084f, int i10, int i11) {
        int i12;
        String str3;
        String strP;
        C1260a c1260a;
        i.e(ticketStatus, "ticketStatus");
        C1086g c1086gP = interfaceC1084f.p(818896879);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (c1086gP.K(str) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i12 |= c1086gP.K(ticketStatus) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            if ((i11 & 4) == 0) {
                str3 = str2;
                int i13 = c1086gP.K(str3) ? 256 : 128;
                i12 |= i13;
            } else {
                str3 = str2;
            }
            i12 |= i13;
        } else {
            str3 = str2;
        }
        if ((i12 & 731) == 146 && c1086gP.s()) {
            c1086gP.w();
            strP = str3;
        } else {
            c1086gP.r0();
            if ((i10 & 1) == 0 || c1086gP.a0()) {
                if ((i11 & 4) != 0) {
                    strP = o.p(c1086gP, R.string.intercom_time_just_now);
                }
                c1086gP.U();
                if (str != null) {
                    c1086gP.L(856513646);
                    C1260a c1260a2 = new C1260a(Phrase.from((Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b), R.string.intercom_tickets_status_event_moved).put("teammate", str).put("status", ticketStatus).put("timestamp", strP).format().toString());
                    c1086gP.T(false);
                    c1260a = c1260a2;
                } else {
                    c1086gP.L(856837162);
                    C1260a c1260a3 = new C1260a(o.p(c1086gP, R.string.intercom_tickets_status_description_prefix_when_submitted) + ' ' + ticketStatus);
                    c1086gP.T(false);
                    c1260a = c1260a3;
                }
                TextKt.c(c1260a, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 2, 0, null, null, IntercomTheme.INSTANCE.getTypography(c1086gP, IntercomTheme.$stable).getType05(), c1086gP, 0, 3120, 120830);
            } else {
                c1086gP.w();
            }
            strP = str3;
            c1086gP.U();
            if (str != null) {
                c1086gP.L(856513646);
                C1260a c1260a4 = new C1260a(Phrase.from((Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b), R.string.intercom_tickets_status_event_moved).put("teammate", str).put("status", ticketStatus).put("timestamp", strP).format().toString());
                c1086gP.T(false);
                c1260a = c1260a4;
            } else {
                c1086gP.L(856837162);
                C1260a c1260a5 = new C1260a(o.p(c1086gP, R.string.intercom_tickets_status_description_prefix_when_submitted) + ' ' + ticketStatus);
                c1086gP.T(false);
                c1260a = c1260a5;
            }
            TextKt.c(c1260a, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 2, 0, null, null, IntercomTheme.INSTANCE.getTypography(c1086gP, IntercomTheme.$stable).getType05(), c1086gP, 0, 3120, 120830);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new x(str, ticketStatus, strP, i10, i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r TicketInAppNotificationContent$lambda$6(String str, String ticketStatus, String str2, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        i.e(ticketStatus, "$ticketStatus");
        TicketInAppNotificationContent(str, ticketStatus, str2, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return r.f47939a;
    }

    public static final void addInappNotificationCardToView(ComposeView composeView, final Conversation conversation) {
        i.e(conversation, "conversation");
        if (composeView == null || ComposeCompatibilityUtilKt.isLegacyActivity(composeView)) {
            return;
        }
        composeView.setContent(new ComposableLambdaImpl(true, -1448950486, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.m5.notification.InAppNotificationCardKt$addInappNotificationCardToView$1$1
            @Override // Ia.p
            public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
                invoke(interfaceC1084f, num.intValue());
                return r.f47939a;
            }

            public final void invoke(InterfaceC1084f interfaceC1084f, int i10) {
                if ((i10 & 11) == 2 && interfaceC1084f.s()) {
                    interfaceC1084f.w();
                } else {
                    final Conversation conversation2 = conversation;
                    IntercomThemeKt.IntercomTheme(null, null, null, androidx.compose.runtime.internal.a.b(-395652032, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.m5.notification.InAppNotificationCardKt$addInappNotificationCardToView$1$1.1
                        @Override // Ia.p
                        public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            invoke(interfaceC1084f2, num.intValue());
                            return r.f47939a;
                        }

                        public final void invoke(InterfaceC1084f interfaceC1084f2, int i11) {
                            if ((i11 & 11) == 2 && interfaceC1084f2.s()) {
                                interfaceC1084f2.w();
                            } else {
                                InAppNotificationCardKt.InAppNotificationCard(conversation2, null, interfaceC1084f2, 8, 2);
                            }
                        }
                    }, interfaceC1084f), interfaceC1084f, 3072, 7);
                }
            }
        }));
    }

    public static final void addTicketHeaderToCompose(ComposeView composeView, final Conversation conversation) {
        i.e(conversation, "conversation");
        if (composeView == null || ComposeCompatibilityUtilKt.isLegacyActivity(composeView)) {
            return;
        }
        composeView.setContent(new ComposableLambdaImpl(true, -744078063, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.m5.notification.InAppNotificationCardKt$addTicketHeaderToCompose$1$1
            @Override // Ia.p
            public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
                invoke(interfaceC1084f, num.intValue());
                return r.f47939a;
            }

            public final void invoke(InterfaceC1084f interfaceC1084f, int i10) {
                if ((i10 & 11) == 2 && interfaceC1084f.s()) {
                    interfaceC1084f.w();
                } else {
                    final Conversation conversation2 = conversation;
                    IntercomThemeKt.IntercomTheme(null, null, null, androidx.compose.runtime.internal.a.b(-1860903769, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.m5.notification.InAppNotificationCardKt$addTicketHeaderToCompose$1$1.1
                        @Override // Ia.p
                        public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            invoke(interfaceC1084f2, num.intValue());
                            return r.f47939a;
                        }

                        public final void invoke(InterfaceC1084f interfaceC1084f2, int i11) {
                            l lVar;
                            if ((i11 & 11) == 2 && interfaceC1084f2.s()) {
                                interfaceC1084f2.w();
                                return;
                            }
                            if (conversation2.getTicket() != null) {
                                String title = conversation2.getTicket().getTitle();
                                if (conversation2.isRead()) {
                                    l lVar2 = l.f15438c;
                                    lVar = l.f15442g;
                                } else {
                                    l lVar3 = l.f15438c;
                                    lVar = l.f15444i;
                                }
                                TicketHeaderKt.TicketHeader(null, new TicketStatusHeaderArgs(title, lVar), interfaceC1084f2, 0, 1);
                            }
                        }
                    }, interfaceC1084f), interfaceC1084f, 3072, 7);
                }
            }
        }));
    }
}
