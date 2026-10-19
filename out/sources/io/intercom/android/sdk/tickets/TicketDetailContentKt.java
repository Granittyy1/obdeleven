package io.intercom.android.sdk.tickets;

import androidx.compose.animation.core.C0902b;
import androidx.compose.animation.core.C0907g;
import androidx.compose.animation.core.InterfaceC0921v;
import androidx.compose.animation.core.InterfaceC0923x;
import androidx.compose.foundation.C0932d;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.C0945e;
import androidx.compose.foundation.layout.C0952l;
import androidx.compose.foundation.layout.C0953m;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.S;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.W;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.E;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.R0;
import androidx.compose.runtime.X;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.graphics.H;
import androidx.compose.ui.graphics.h0;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.C1260a;
import androidx.compose.ui.text.F;
import androidx.compose.ui.text.v;
import com.braze.Constants;
import com.google.android.gms.internal.measurement.M1;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.components.C2277e0;
import io.intercom.android.sdk.m5.components.C2281g0;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.Ticket;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.common.StringProvider;
import io.intercom.android.sdk.ui.component.IntercomButton;
import io.intercom.android.sdk.ui.component.IntercomButtonKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.utilities.TimeFormatter;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: TicketDetailContent.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class TicketDetailContentKt {
    private static final TicketDetailState.TicketDetailContentState sampleTicketDetailState;

    static {
        Avatar avatarCreate = Avatar.create("https://static.intercomassets.com/avatars/5355644/square_128/002Bizimply-Headshots-1641919551.jpeg", "");
        kotlin.jvm.internal.i.d(avatarCreate, "create(...)");
        List listK = M1.k(new AvatarWrapper(avatarCreate, false, 2, null));
        int i10 = H.f13505m;
        String str = null;
        sampleTicketDetailState = new TicketDetailState.TicketDetailContentState("API issue", new TicketTimelineCardState(listK, "Hannah will pick this up soon", "🕑  Estimated to be resolved today at 4pm", H.f13502i, kotlin.collections.l.s(new TicketTimelineCardState.ProgressSection(true, false), new TicketTimelineCardState.ProgressSection(false, true), new TicketTimelineCardState.ProgressSection(false, false)), "Submitted", Long.valueOf(System.currentTimeMillis()), null), kotlin.collections.l.s(new Ticket.TicketAttribute.PrimitiveAttribute(str, null, "Description", false, null, "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Et, ut hendrerit et lacus, dictumst ridiculus morbi elementum.", 27, null), new Ticket.TicketAttribute.PrimitiveAttribute(null, null, "API Version", false, null, "1.2", 27, null), new Ticket.TicketAttribute.DateTimeAttribute(null, str, "When did the issue occur?", false, null, "1676555323", 27, null)), "test@gmail.com", "123", new ConversationButtonState(true, Integer.valueOf(R.drawable.intercom_send_message_icon), new StringProvider.StringRes(R.string.intercom_send_us_a_message, null, 2, null)));
    }

    /* JADX WARN: Code duplicated, block: B:52:0x019a  */
    /* JADX WARN: Code duplicated, block: B:53:0x019e  */
    /* JADX WARN: Code duplicated, block: B:58:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:61:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:63:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:66:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:67:0x0200  */
    /* JADX WARN: Code duplicated, block: B:70:0x020a  */
    /* JADX WARN: Code duplicated, block: B:71:0x0211  */
    /* JADX WARN: Code duplicated, block: B:74:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:77:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:80:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:81:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:86:0x0314  */
    /* JADX WARN: Code duplicated, block: B:89:0x03ca  */
    /* JADX WARN: Code duplicated, block: B:92:0x03d6  */
    /* JADX WARN: Code duplicated, block: B:94:? A[RETURN, SYNTHETIC] */
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
    public static final void TicketDetailContent(androidx.compose.ui.h hVar, final TicketDetailState.TicketDetailContentState ticketDetailContentState, Ia.l<? super String, p293xa.r> lVar, boolean z10, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        androidx.compose.ui.h hVar2;
        Ia.p<ComposeUiNode, androidx.compose.ui.h, p293xa.r> pVar;
        IntercomTheme intercomTheme;
        int i12;
        Ia.l<? super String, p293xa.r> lVar2;
        int i13;
        float f10;
        Object obj;
        float f11;
        float fTicketDetailContent$lambda$9;
        InterfaceC0921v interfaceC0921v;
        InterfaceC0923x interfaceC0923xC;
        Ia.l<? super String, p293xa.r> lVar3;
        boolean z11;
        C1105p0 c1105p0A;
        int i14;
        kotlin.jvm.internal.i.e(ticketDetailContentState, "ticketDetailContentState");
        C1086g c1086gP = interfaceC1084f.p(-872031756);
        int i15 = i11 & 1;
        androidx.compose.ui.h.a aVar = androidx.compose.ui.h.a.f13984b;
        androidx.compose.ui.h hVar3 = i15 != 0 ? aVar : hVar;
        Ia.l<? super String, p293xa.r> rVar = (i11 & 4) != 0 ? new coil.compose.r(4) : lVar;
        final boolean z12 = (i11 & 8) != 0 ? false : z10;
        Object[] objArr = new Object[0];
        c1086gP.L(1639443041);
        boolean z13 = (((i10 & 7168) ^ 3072) > 2048 && c1086gP.c(z12)) || (i10 & 3072) == 2048;
        Object objF = c1086gP.f();
        InterfaceC1084f.a.C0153a c0153a = InterfaceC1084f.a.f12980a;
        if (z13 || objF == c0153a) {
            objF = new Ia.a() { // from class: io.intercom.android.sdk.tickets.j
                @Override // Ia.a
                public final Object invoke() {
                    return TicketDetailContentKt.TicketDetailContent$lambda$2$lambda$1(z12);
                }
            };
            c1086gP.E(objF);
        }
        c1086gP.T(false);
        X x10 = (X) androidx.compose.runtime.saveable.b.c(objArr, null, null, (Ia.a) objF, c1086gP, 8, 6);
        c1086gP.L(1639447110);
        Object objF2 = c1086gP.f();
        if (objF2 == c0153a) {
            objF2 = J0.f(new p013b0.f(-56));
            c1086gP.E(objF2);
        }
        X x11 = (X) objF2;
        c1086gP.T(false);
        c1086gP.L(1639449312);
        Object objF3 = c1086gP.f();
        if (objF3 == c0153a) {
            objF3 = J0.f(Float.valueOf(0.0f));
            c1086gP.E(objF3);
        }
        X x12 = (X) objF3;
        c1086gP.T(false);
        c1086gP.L(1639450743);
        CardState cardStateTicketDetailContent$lambda$3 = TicketDetailContent$lambda$3(x10);
        CardState cardState = CardState.SubmissionCard;
        if (cardStateTicketDetailContent$lambda$3 == cardState) {
            c1086gP.L(1639454260);
            boolean zK = c1086gP.K(x10);
            Object objF4 = c1086gP.f();
            if (zK || objF4 == c0153a) {
                objF4 = new TicketDetailContentKt$TicketDetailContent$2$1(x11, x12, x10, null);
                c1086gP.E(objF4);
            }
            c1086gP.T(false);
            E.d((Ia.p) objF4, c1086gP, null);
        }
        c1086gP.T(false);
        androidx.compose.ui.h hVarB = ScrollKt.b(W.c(hVar3, 1.0f), ScrollKt.a(0, c1086gP, 0, 1), false, 14);
        C0945e.k kVar = C0945e.f10286c;
        C0953m c0953mA = C0952l.a(kVar, androidx.compose.ui.d.a.f13346m, c1086gP, 0);
        int i16 = c1086gP.f12996P;
        InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
        androidx.compose.ui.h hVarC = ComposedModifierKt.c(c1086gP, hVarB);
        ComposeUiNode.f14331c0.getClass();
        final boolean z14 = z12;
        Ia.a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f14333b;
        c1086gP.r();
        if (c1086gP.f12995O) {
            c1086gP.v(aVar2);
        } else {
            c1086gP.A();
        }
        Ia.p<ComposeUiNode, androidx.compose.ui.layout.E, p293xa.r> pVar2 = ComposeUiNode.Companion.f14337f;
        R0.a(pVar2, c1086gP, c0953mA);
        Ia.p<ComposeUiNode, androidx.compose.runtime.r, p293xa.r> pVar3 = ComposeUiNode.Companion.f14336e;
        R0.a(pVar3, c1086gP, interfaceC1089h0P);
        Ia.p<ComposeUiNode, Integer, p293xa.r> pVar4 = ComposeUiNode.Companion.f14338g;
        if (!c1086gP.f12995O) {
            hVar2 = hVar3;
            if (!kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i16))) {
            }
            pVar = ComposeUiNode.Companion.f14335d;
            R0.a(pVar, c1086gP, hVarC);
            intercomTheme = IntercomTheme.INSTANCE;
            i12 = IntercomTheme.$stable;
            androidx.compose.ui.h hVarB2 = C0932d.b(aVar, intercomTheme.getColors(c1086gP, i12).m621getBackground0d7_KjU(), h0.f13629a);
            FillElement fillElement = W.f10226c;
            lVar2 = rVar;
            androidx.compose.ui.h hVarA = androidx.compose.animation.h.a(W.g(hVarB2.i(fillElement), 194, 0.0f, 2), C0907g.d(0, 0, null, 7));
            androidx.compose.ui.layout.E eD = BoxKt.d(androidx.compose.ui.d.a.f13339e, false);
            i13 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P2 = c1086gP.P();
            androidx.compose.ui.h hVarC2 = ComposedModifierKt.c(c1086gP, hVarA);
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar2);
            } else {
                c1086gP.A();
            }
            R0.a(pVar2, c1086gP, eD);
            R0.a(pVar3, c1086gP, interfaceC1089h0P2);
            if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i13))) {
                J4.i.d(i13, c1086gP, i13, pVar4);
            }
            R0.a(pVar, c1086gP, hVarC2);
            TicketTimelineCardState ticketTimelineCardState = ticketDetailContentState.getTicketTimelineCardState();
            if (TicketDetailContent$lambda$3(x10) == CardState.TimelineCard) {
                f10 = 0.0f;
                obj = null;
                f11 = 1.0f;
            } else {
                f10 = 0.0f;
                obj = null;
                f11 = 0.0f;
            }
            TicketTimelineCardKt.TicketTimelineCard(ticketTimelineCardState, Cb.a.c(aVar, ((Number) C0902b.b(f11, C0907g.c(f10, f10, obj, 7), c1086gP, 48).getValue()).floatValue()), c1086gP, 8, 0);
            if (TicketDetailContent$lambda$3(x10) == cardState) {
                fTicketDetailContent$lambda$9 = TicketDetailContent$lambda$9(x12);
            } else {
                fTicketDetailContent$lambda$9 = 0.0f;
            }
            if (TicketDetailContent$lambda$3(x10) == cardState) {
                interfaceC0921v = null;
                interfaceC0923xC = C0907g.d(Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS, 0, null, 6);
            } else {
                interfaceC0921v = null;
                interfaceC0923xC = C0907g.c(0.0f, 0.0f, null, 7);
            }
            TicketSubmissionCard(OffsetKt.b(0, ((p013b0.f) C0902b.a(TicketDetailContent$lambda$6(x11), C0907g.d(Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS, 0, interfaceC0921v, 6), c1086gP, 48, 12).getValue()).f20481b, Cb.a.c(aVar, ((Number) C0902b.b(fTicketDetailContent$lambda$9, interfaceC0923xC, c1086gP, 64).getValue()).floatValue())), c1086gP, 0, 0);
            c1086gP.T(true);
            SurfaceKt.a(fillElement, null, intercomTheme.getColors(c1086gP, i12).m621getBackground0d7_KjU(), 0L, 0.0f, 0.0f, null, androidx.compose.runtime.internal.a.b(925724611, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.tickets.TicketDetailContentKt$TicketDetailContent$3$2
                @Override // Ia.p
                public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    invoke(interfaceC1084f2, num.intValue());
                    return p293xa.r.f47939a;
                }

                public final void invoke(InterfaceC1084f interfaceC1084f2, int i17) {
                    char c10;
                    androidx.compose.ui.h.a aVar3;
                    androidx.compose.ui.h.a aVar4;
                    if ((i17 & 11) == 2 && interfaceC1084f2.s()) {
                        interfaceC1084f2.w();
                        return;
                    }
                    androidx.compose.ui.h.a aVar5 = androidx.compose.ui.h.a.f13984b;
                    float f12 = 16;
                    androidx.compose.ui.h hVarF = PaddingKt.f(aVar5, f12);
                    TicketDetailState.TicketDetailContentState ticketDetailContentState2 = ticketDetailContentState;
                    C0945e.k kVar2 = C0945e.f10286c;
                    androidx.compose.ui.f.a aVar6 = androidx.compose.ui.d.a.f13346m;
                    C0953m c0953mA2 = C0952l.a(kVar2, aVar6, interfaceC1084f2, 0);
                    int iF = interfaceC1084f2.F();
                    InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f2.z();
                    androidx.compose.ui.h hVarC3 = ComposedModifierKt.c(interfaceC1084f2, hVarF);
                    ComposeUiNode.f14331c0.getClass();
                    Ia.a<ComposeUiNode> aVar7 = ComposeUiNode.Companion.f14333b;
                    if (interfaceC1084f2.u() == null) {
                        I.b.k();
                        throw null;
                    }
                    interfaceC1084f2.r();
                    if (interfaceC1084f2.m()) {
                        interfaceC1084f2.v(aVar7);
                    } else {
                        interfaceC1084f2.A();
                    }
                    Ia.p<ComposeUiNode, androidx.compose.ui.layout.E, p293xa.r> pVar5 = ComposeUiNode.Companion.f14337f;
                    R0.a(pVar5, interfaceC1084f2, c0953mA2);
                    Ia.p<ComposeUiNode, androidx.compose.runtime.r, p293xa.r> pVar6 = ComposeUiNode.Companion.f14336e;
                    R0.a(pVar6, interfaceC1084f2, interfaceC1089h0Z);
                    Ia.p<ComposeUiNode, Integer, p293xa.r> pVar7 = ComposeUiNode.Companion.f14338g;
                    if (interfaceC1084f2.m() || !kotlin.jvm.internal.i.a(interfaceC1084f2.f(), Integer.valueOf(iF))) {
                        androidx.compose.animation.k.b(iF, interfaceC1084f2, iF, pVar7);
                    }
                    Ia.p<ComposeUiNode, androidx.compose.ui.h, p293xa.r> pVar8 = ComposeUiNode.Companion.f14335d;
                    R0.a(pVar8, interfaceC1084f2, hVarC3);
                    androidx.compose.ui.f.b bVar = androidx.compose.ui.d.a.f13344k;
                    androidx.compose.ui.h hVarR = A8.p.r(aVar5, p270w.g.b(8));
                    IntercomTheme intercomTheme2 = IntercomTheme.INSTANCE;
                    int i18 = IntercomTheme.$stable;
                    float f13 = 12;
                    androidx.compose.ui.h hVarF2 = PaddingKt.f(W.d(C0932d.b(hVarR, intercomTheme2.getColors(interfaceC1084f2, i18).m624getBubbleBackground0d7_KjU(), h0.f13629a), 1.0f), f13);
                    T tA = S.a(C0945e.f10284a, bVar, interfaceC1084f2, 48);
                    int iF2 = interfaceC1084f2.F();
                    InterfaceC1089h0 interfaceC1089h0Z2 = interfaceC1084f2.z();
                    androidx.compose.ui.h hVarC4 = ComposedModifierKt.c(interfaceC1084f2, hVarF2);
                    if (interfaceC1084f2.u() == null) {
                        I.b.k();
                        throw null;
                    }
                    interfaceC1084f2.r();
                    if (interfaceC1084f2.m()) {
                        interfaceC1084f2.v(aVar7);
                    } else {
                        interfaceC1084f2.A();
                    }
                    R0.a(pVar5, interfaceC1084f2, tA);
                    R0.a(pVar6, interfaceC1084f2, interfaceC1089h0Z2);
                    if (interfaceC1084f2.m() || !kotlin.jvm.internal.i.a(interfaceC1084f2.f(), Integer.valueOf(iF2))) {
                        androidx.compose.animation.k.b(iF2, interfaceC1084f2, iF2, pVar7);
                    }
                    R0.a(pVar8, interfaceC1084f2, hVarC4);
                    IconKt.a(U.c.a(R.drawable.intercom_ticket_notification, interfaceC1084f2, 0), null, W.m(PaddingKt.j(aVar5, 0.0f, 4, 0.0f, 0.0f, 13), f12), intercomTheme2.getColors(interfaceC1084f2, i18).m644getPrimaryIcon0d7_KjU(), interfaceC1084f2, 440, 0);
                    Lb.a.a(interfaceC1084f2, W.q(aVar5, f12));
                    F type04 = intercomTheme2.getTypography(interfaceC1084f2, i18).getType04();
                    interfaceC1084f2.L(1807110670);
                    C1260a.b bVar2 = new C1260a.b();
                    interfaceC1084f2.L(1807112154);
                    int iH = bVar2.h(new v(0L, 0L, androidx.compose.ui.text.font.l.f15444i, null, null, null, null, 0L, null, null, null, 0L, null, null, 65531));
                    try {
                        bVar2.c(S4.o.p(interfaceC1084f2, R.string.intercom_youll_be_notified_here_and_by_email));
                        bVar2.c(" ");
                        p293xa.r rVar2 = p293xa.r.f47939a;
                        bVar2.e(iH);
                        interfaceC1084f2.D();
                        bVar2.c(ticketDetailContentState2.getUserEmail());
                        C1260a c1260aI = bVar2.i();
                        interfaceC1084f2.D();
                        float f14 = f12;
                        TextKt.c(c1260aI, null, intercomTheme2.getColors(interfaceC1084f2, i18).m645getPrimaryText0d7_KjU(), 0L, null, null, null, 0L, null, null, G0.a.g(22), 0, false, 0, 0, null, null, type04, interfaceC1084f2, 0, 6, 130042);
                        interfaceC1084f2.J();
                        androidx.compose.ui.h.a aVar8 = aVar5;
                        Lb.a.a(interfaceC1084f2, W.e(aVar8, 24));
                        interfaceC1084f2.L(-711350793);
                        if (!ticketDetailContentState2.getTicketAttributes().isEmpty()) {
                            androidx.compose.ui.h hVarI = PaddingKt.h(aVar8, f13, 0.0f, 2).i(W.f10226c);
                            C0953m c0953mA3 = C0952l.a(kVar2, aVar6, interfaceC1084f2, 0);
                            int iF3 = interfaceC1084f2.F();
                            InterfaceC1089h0 interfaceC1089h0Z3 = interfaceC1084f2.z();
                            androidx.compose.ui.h hVarC5 = ComposedModifierKt.c(interfaceC1084f2, hVarI);
                            if (interfaceC1084f2.u() == null) {
                                I.b.k();
                                throw null;
                            }
                            interfaceC1084f2.r();
                            if (interfaceC1084f2.m()) {
                                interfaceC1084f2.v(aVar7);
                            } else {
                                interfaceC1084f2.A();
                            }
                            R0.a(pVar5, interfaceC1084f2, c0953mA3);
                            R0.a(pVar6, interfaceC1084f2, interfaceC1089h0Z3);
                            if (interfaceC1084f2.m() || !kotlin.jvm.internal.i.a(interfaceC1084f2.f(), Integer.valueOf(iF3))) {
                                androidx.compose.animation.k.b(iF3, interfaceC1084f2, iF3, pVar7);
                            }
                            R0.a(pVar8, interfaceC1084f2, hVarC5);
                            interfaceC1084f2.L(1807143465);
                            for (Ticket.TicketAttribute ticketAttribute : ticketDetailContentState2.getTicketAttributes()) {
                                String name = ticketAttribute.getName();
                                IntercomTheme intercomTheme3 = IntercomTheme.INSTANCE;
                                int i19 = IntercomTheme.$stable;
                                androidx.compose.ui.h.a aVar9 = aVar8;
                                TextKt.b(name, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme3.getTypography(interfaceC1084f2, i19).getType04SemiBold(), interfaceC1084f2, 0, 0, 65534);
                                Lb.a.a(interfaceC1084f2, W.e(aVar9, 2));
                                if (ticketAttribute instanceof Ticket.TicketAttribute.PrimitiveAttribute) {
                                    interfaceC1084f2.L(2134715913);
                                    c10 = 2;
                                    aVar3 = aVar9;
                                    TextKt.b(((Ticket.TicketAttribute.PrimitiveAttribute) ticketAttribute).getValue(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme3.getTypography(interfaceC1084f2, i19).getType04(), interfaceC1084f2, 0, 0, 65534);
                                    interfaceC1084f2.D();
                                } else {
                                    c10 = 2;
                                    aVar3 = aVar9;
                                    if (ticketAttribute instanceof Ticket.TicketAttribute.ListAttribute) {
                                        interfaceC1084f2.L(2135020457);
                                        TextKt.b(((Ticket.TicketAttribute.ListAttribute) ticketAttribute).getValue(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme3.getTypography(interfaceC1084f2, i19).getType04(), interfaceC1084f2, 0, 0, 65534);
                                        interfaceC1084f2.D();
                                    } else {
                                        if (ticketAttribute instanceof Ticket.TicketAttribute.DateTimeAttribute) {
                                            interfaceC1084f2.L(2135335386);
                                            String timeInMillisAsDate = TimeFormatter.formatTimeInMillisAsDate(Long.parseLong(((Ticket.TicketAttribute.DateTimeAttribute) ticketAttribute).getValue()) * ((long) Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS), "dd-MM-yyy, HH:mm");
                                            kotlin.jvm.internal.i.d(timeInMillisAsDate, "formatTimeInMillisAsDate(...)");
                                            TextKt.b(timeInMillisAsDate, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme3.getTypography(interfaceC1084f2, i19).getType04(), interfaceC1084f2, 0, 0, 65534);
                                            interfaceC1084f2.D();
                                        } else {
                                            if (ticketAttribute instanceof Ticket.TicketAttribute.FilesAttribute) {
                                                interfaceC1084f2.L(2135835354);
                                                FIleAttachmentListKt.FileAttachmentList(null, ((Ticket.TicketAttribute.FilesAttribute) ticketAttribute).getValue(), interfaceC1084f2, 64, 1);
                                                interfaceC1084f2.D();
                                            } else {
                                                if (!(ticketAttribute instanceof Ticket.TicketAttribute.UnSupported)) {
                                                    interfaceC1084f2.L(1592882332);
                                                    interfaceC1084f2.D();
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                interfaceC1084f2.L(2136019990);
                                                TextKt.b(((Ticket.TicketAttribute.UnSupported) ticketAttribute).getValue().toString(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme3.getTypography(interfaceC1084f2, i19).getType04(), interfaceC1084f2, 0, 0, 65534);
                                                interfaceC1084f2.D();
                                            }
                                            aVar4 = aVar3;
                                        }
                                        Lb.a.a(interfaceC1084f2, W.e(aVar4, f14));
                                        aVar8 = aVar4;
                                        f14 = f14;
                                    }
                                }
                                aVar4 = aVar3;
                                Lb.a.a(interfaceC1084f2, W.e(aVar4, f14));
                                aVar8 = aVar4;
                                f14 = f14;
                            }
                            interfaceC1084f2.D();
                            interfaceC1084f2.J();
                        }
                        interfaceC1084f2.D();
                        interfaceC1084f2.J();
                    } catch (Throwable th) {
                        bVar2.e(iH);
                        throw th;
                    }
                }
            }, c1086gP), c1086gP, 12582918, me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_windowFixedWidthMajor);
            c1086gP.L(1933740147);
            if (ticketDetailContentState.getConversationButtonState().getShowButton()) {
                if (1.0f <= 0.0d) {
                    p258v.a.a("invalid weight; must be greater than zero");
                }
                Lb.a.a(c1086gP, new LayoutWeightElement(true, Na.l.z(1.0f, Float.MAX_VALUE)));
                float f12 = 16;
                androidx.compose.ui.h hVarH = PaddingKt.h(W.d(aVar, 1.0f), 0.0f, f12, 1);
                C0953m c0953mA2 = C0952l.a(kVar, androidx.compose.ui.d.a.f13347n, c1086gP, 48);
                i14 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P3 = c1086gP.P();
                androidx.compose.ui.h hVarC3 = ComposedModifierKt.c(c1086gP, hVarH);
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar2);
                } else {
                    c1086gP.A();
                }
                R0.a(pVar2, c1086gP, c0953mA2);
                R0.a(pVar3, c1086gP, interfaceC1089h0P3);
                if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i14))) {
                    J4.i.d(i14, c1086gP, i14, pVar4);
                }
                R0.a(pVar, c1086gP, hVarC3);
                TextKt.b(S4.o.p(c1086gP, R.string.intercom_tickets_cta_text), W.d(aVar, 1.0f), 0L, 0L, null, null, null, 0L, null, new androidx.compose.ui.text.style.g(3), 0L, 0, false, 0, 0, null, F.a(intercomTheme.getTypography(c1086gP, i12).getType04Point5(), intercomTheme.getColors(c1086gP, i12).m630getDescriptionText0d7_KjU(), 0L, null, null, 0L, null, 0, 0L, null, null, 16777214), c1086gP, 48, 0, 65020);
                Lb.a.a(c1086gP, W.e(aVar, 8));
                ConversationButtonState conversationButtonState = ticketDetailContentState.getConversationButtonState();
                lVar3 = lVar2;
                IntercomButtonKt.IntercomButton(null, IntercomButton.INSTANCE.m523primaryStyleKlgxPg(0L, 0L, null, c1086gP, IntercomButton.$stable << 9, 7), conversationButtonState.getText().getText(c1086gP, StringProvider.$stable), conversationButtonState.getIconRes(), new io.intercom.android.sdk.m5.helpcenter.ui.components.b(1, lVar3, ticketDetailContentState), c1086gP, IntercomButton.Style.$stable << 3, 1);
                Lb.a.a(c1086gP, W.e(aVar, f12));
                z11 = true;
                c1086gP.T(true);
            } else {
                lVar3 = lVar2;
                z11 = true;
            }
            c1105p0A = C4.a.a(c1086gP, false, z11);
            if (c1105p0A != null) {
                final androidx.compose.ui.h hVar4 = hVar2;
                final Ia.l<? super String, p293xa.r> lVar4 = lVar3;
                c1105p0A.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.tickets.k
                    @Override // Ia.p
                    public final Object invoke(Object obj2, Object obj3) {
                        int iIntValue = ((Integer) obj3).intValue();
                        return TicketDetailContentKt.TicketDetailContent$lambda$16(hVar4, ticketDetailContentState, lVar4, z14, i10, i11, (InterfaceC1084f) obj2, iIntValue);
                    }
                };
            }
        }
        hVar2 = hVar3;
        J4.i.d(i16, c1086gP, i16, pVar4);
        pVar = ComposeUiNode.Companion.f14335d;
        R0.a(pVar, c1086gP, hVarC);
        intercomTheme = IntercomTheme.INSTANCE;
        i12 = IntercomTheme.$stable;
        androidx.compose.ui.h hVarB3 = C0932d.b(aVar, intercomTheme.getColors(c1086gP, i12).m621getBackground0d7_KjU(), h0.f13629a);
        FillElement fillElement2 = W.f10226c;
        lVar2 = rVar;
        androidx.compose.ui.h hVarA2 = androidx.compose.animation.h.a(W.g(hVarB3.i(fillElement2), 194, 0.0f, 2), C0907g.d(0, 0, null, 7));
        androidx.compose.ui.layout.E eD2 = BoxKt.d(androidx.compose.ui.d.a.f13339e, false);
        i13 = c1086gP.f12996P;
        InterfaceC1089h0 interfaceC1089h0P4 = c1086gP.P();
        androidx.compose.ui.h hVarC4 = ComposedModifierKt.c(c1086gP, hVarA2);
        c1086gP.r();
        if (c1086gP.f12995O) {
            c1086gP.v(aVar2);
        } else {
            c1086gP.A();
        }
        R0.a(pVar2, c1086gP, eD2);
        R0.a(pVar3, c1086gP, interfaceC1089h0P4);
        if (c1086gP.f12995O) {
            J4.i.d(i13, c1086gP, i13, pVar4);
        } else {
            J4.i.d(i13, c1086gP, i13, pVar4);
        }
        R0.a(pVar, c1086gP, hVarC4);
        TicketTimelineCardState ticketTimelineCardState2 = ticketDetailContentState.getTicketTimelineCardState();
        if (TicketDetailContent$lambda$3(x10) == CardState.TimelineCard) {
            f10 = 0.0f;
            obj = null;
            f11 = 1.0f;
        } else {
            f10 = 0.0f;
            obj = null;
            f11 = 0.0f;
        }
        TicketTimelineCardKt.TicketTimelineCard(ticketTimelineCardState2, Cb.a.c(aVar, ((Number) C0902b.b(f11, C0907g.c(f10, f10, obj, 7), c1086gP, 48).getValue()).floatValue()), c1086gP, 8, 0);
        if (TicketDetailContent$lambda$3(x10) == cardState) {
            fTicketDetailContent$lambda$9 = TicketDetailContent$lambda$9(x12);
        } else {
            fTicketDetailContent$lambda$9 = 0.0f;
        }
        if (TicketDetailContent$lambda$3(x10) == cardState) {
            interfaceC0921v = null;
            interfaceC0923xC = C0907g.d(Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS, 0, null, 6);
        } else {
            interfaceC0921v = null;
            interfaceC0923xC = C0907g.c(0.0f, 0.0f, null, 7);
        }
        TicketSubmissionCard(OffsetKt.b(0, ((p013b0.f) C0902b.a(TicketDetailContent$lambda$6(x11), C0907g.d(Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS, 0, interfaceC0921v, 6), c1086gP, 48, 12).getValue()).f20481b, Cb.a.c(aVar, ((Number) C0902b.b(fTicketDetailContent$lambda$9, interfaceC0923xC, c1086gP, 64).getValue()).floatValue())), c1086gP, 0, 0);
        c1086gP.T(true);
        SurfaceKt.a(fillElement2, null, intercomTheme.getColors(c1086gP, i12).m621getBackground0d7_KjU(), 0L, 0.0f, 0.0f, null, androidx.compose.runtime.internal.a.b(925724611, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.tickets.TicketDetailContentKt$TicketDetailContent$3$2
            @Override // Ia.p
            public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                invoke(interfaceC1084f2, num.intValue());
                return p293xa.r.f47939a;
            }

            public final void invoke(InterfaceC1084f interfaceC1084f2, int i17) {
                char c10;
                androidx.compose.ui.h.a aVar3;
                androidx.compose.ui.h.a aVar4;
                if ((i17 & 11) == 2 && interfaceC1084f2.s()) {
                    interfaceC1084f2.w();
                    return;
                }
                androidx.compose.ui.h.a aVar5 = androidx.compose.ui.h.a.f13984b;
                float f13 = 16;
                androidx.compose.ui.h hVarF = PaddingKt.f(aVar5, f13);
                TicketDetailState.TicketDetailContentState ticketDetailContentState2 = ticketDetailContentState;
                C0945e.k kVar2 = C0945e.f10286c;
                androidx.compose.ui.f.a aVar6 = androidx.compose.ui.d.a.f13346m;
                C0953m c0953mA3 = C0952l.a(kVar2, aVar6, interfaceC1084f2, 0);
                int iF = interfaceC1084f2.F();
                InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f2.z();
                androidx.compose.ui.h hVarC5 = ComposedModifierKt.c(interfaceC1084f2, hVarF);
                ComposeUiNode.f14331c0.getClass();
                Ia.a<ComposeUiNode> aVar7 = ComposeUiNode.Companion.f14333b;
                if (interfaceC1084f2.u() == null) {
                    I.b.k();
                    throw null;
                }
                interfaceC1084f2.r();
                if (interfaceC1084f2.m()) {
                    interfaceC1084f2.v(aVar7);
                } else {
                    interfaceC1084f2.A();
                }
                Ia.p<ComposeUiNode, androidx.compose.ui.layout.E, p293xa.r> pVar5 = ComposeUiNode.Companion.f14337f;
                R0.a(pVar5, interfaceC1084f2, c0953mA3);
                Ia.p<ComposeUiNode, androidx.compose.runtime.r, p293xa.r> pVar6 = ComposeUiNode.Companion.f14336e;
                R0.a(pVar6, interfaceC1084f2, interfaceC1089h0Z);
                Ia.p<ComposeUiNode, Integer, p293xa.r> pVar7 = ComposeUiNode.Companion.f14338g;
                if (interfaceC1084f2.m() || !kotlin.jvm.internal.i.a(interfaceC1084f2.f(), Integer.valueOf(iF))) {
                    androidx.compose.animation.k.b(iF, interfaceC1084f2, iF, pVar7);
                }
                Ia.p<ComposeUiNode, androidx.compose.ui.h, p293xa.r> pVar8 = ComposeUiNode.Companion.f14335d;
                R0.a(pVar8, interfaceC1084f2, hVarC5);
                androidx.compose.ui.f.b bVar = androidx.compose.ui.d.a.f13344k;
                androidx.compose.ui.h hVarR = A8.p.r(aVar5, p270w.g.b(8));
                IntercomTheme intercomTheme2 = IntercomTheme.INSTANCE;
                int i18 = IntercomTheme.$stable;
                float f14 = 12;
                androidx.compose.ui.h hVarF2 = PaddingKt.f(W.d(C0932d.b(hVarR, intercomTheme2.getColors(interfaceC1084f2, i18).m624getBubbleBackground0d7_KjU(), h0.f13629a), 1.0f), f14);
                T tA = S.a(C0945e.f10284a, bVar, interfaceC1084f2, 48);
                int iF2 = interfaceC1084f2.F();
                InterfaceC1089h0 interfaceC1089h0Z2 = interfaceC1084f2.z();
                androidx.compose.ui.h hVarC6 = ComposedModifierKt.c(interfaceC1084f2, hVarF2);
                if (interfaceC1084f2.u() == null) {
                    I.b.k();
                    throw null;
                }
                interfaceC1084f2.r();
                if (interfaceC1084f2.m()) {
                    interfaceC1084f2.v(aVar7);
                } else {
                    interfaceC1084f2.A();
                }
                R0.a(pVar5, interfaceC1084f2, tA);
                R0.a(pVar6, interfaceC1084f2, interfaceC1089h0Z2);
                if (interfaceC1084f2.m() || !kotlin.jvm.internal.i.a(interfaceC1084f2.f(), Integer.valueOf(iF2))) {
                    androidx.compose.animation.k.b(iF2, interfaceC1084f2, iF2, pVar7);
                }
                R0.a(pVar8, interfaceC1084f2, hVarC6);
                IconKt.a(U.c.a(R.drawable.intercom_ticket_notification, interfaceC1084f2, 0), null, W.m(PaddingKt.j(aVar5, 0.0f, 4, 0.0f, 0.0f, 13), f13), intercomTheme2.getColors(interfaceC1084f2, i18).m644getPrimaryIcon0d7_KjU(), interfaceC1084f2, 440, 0);
                Lb.a.a(interfaceC1084f2, W.q(aVar5, f13));
                F type04 = intercomTheme2.getTypography(interfaceC1084f2, i18).getType04();
                interfaceC1084f2.L(1807110670);
                C1260a.b bVar2 = new C1260a.b();
                interfaceC1084f2.L(1807112154);
                int iH = bVar2.h(new v(0L, 0L, androidx.compose.ui.text.font.l.f15444i, null, null, null, null, 0L, null, null, null, 0L, null, null, 65531));
                try {
                    bVar2.c(S4.o.p(interfaceC1084f2, R.string.intercom_youll_be_notified_here_and_by_email));
                    bVar2.c(" ");
                    p293xa.r rVar2 = p293xa.r.f47939a;
                    bVar2.e(iH);
                    interfaceC1084f2.D();
                    bVar2.c(ticketDetailContentState2.getUserEmail());
                    C1260a c1260aI = bVar2.i();
                    interfaceC1084f2.D();
                    float f15 = f13;
                    TextKt.c(c1260aI, null, intercomTheme2.getColors(interfaceC1084f2, i18).m645getPrimaryText0d7_KjU(), 0L, null, null, null, 0L, null, null, G0.a.g(22), 0, false, 0, 0, null, null, type04, interfaceC1084f2, 0, 6, 130042);
                    interfaceC1084f2.J();
                    androidx.compose.ui.h.a aVar8 = aVar5;
                    Lb.a.a(interfaceC1084f2, W.e(aVar8, 24));
                    interfaceC1084f2.L(-711350793);
                    if (!ticketDetailContentState2.getTicketAttributes().isEmpty()) {
                        androidx.compose.ui.h hVarI = PaddingKt.h(aVar8, f14, 0.0f, 2).i(W.f10226c);
                        C0953m c0953mA4 = C0952l.a(kVar2, aVar6, interfaceC1084f2, 0);
                        int iF3 = interfaceC1084f2.F();
                        InterfaceC1089h0 interfaceC1089h0Z3 = interfaceC1084f2.z();
                        androidx.compose.ui.h hVarC7 = ComposedModifierKt.c(interfaceC1084f2, hVarI);
                        if (interfaceC1084f2.u() == null) {
                            I.b.k();
                            throw null;
                        }
                        interfaceC1084f2.r();
                        if (interfaceC1084f2.m()) {
                            interfaceC1084f2.v(aVar7);
                        } else {
                            interfaceC1084f2.A();
                        }
                        R0.a(pVar5, interfaceC1084f2, c0953mA4);
                        R0.a(pVar6, interfaceC1084f2, interfaceC1089h0Z3);
                        if (interfaceC1084f2.m() || !kotlin.jvm.internal.i.a(interfaceC1084f2.f(), Integer.valueOf(iF3))) {
                            androidx.compose.animation.k.b(iF3, interfaceC1084f2, iF3, pVar7);
                        }
                        R0.a(pVar8, interfaceC1084f2, hVarC7);
                        interfaceC1084f2.L(1807143465);
                        for (Ticket.TicketAttribute ticketAttribute : ticketDetailContentState2.getTicketAttributes()) {
                            String name = ticketAttribute.getName();
                            IntercomTheme intercomTheme3 = IntercomTheme.INSTANCE;
                            int i19 = IntercomTheme.$stable;
                            androidx.compose.ui.h.a aVar9 = aVar8;
                            TextKt.b(name, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme3.getTypography(interfaceC1084f2, i19).getType04SemiBold(), interfaceC1084f2, 0, 0, 65534);
                            Lb.a.a(interfaceC1084f2, W.e(aVar9, 2));
                            if (ticketAttribute instanceof Ticket.TicketAttribute.PrimitiveAttribute) {
                                interfaceC1084f2.L(2134715913);
                                c10 = 2;
                                aVar3 = aVar9;
                                TextKt.b(((Ticket.TicketAttribute.PrimitiveAttribute) ticketAttribute).getValue(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme3.getTypography(interfaceC1084f2, i19).getType04(), interfaceC1084f2, 0, 0, 65534);
                                interfaceC1084f2.D();
                            } else {
                                c10 = 2;
                                aVar3 = aVar9;
                                if (ticketAttribute instanceof Ticket.TicketAttribute.ListAttribute) {
                                    interfaceC1084f2.L(2135020457);
                                    TextKt.b(((Ticket.TicketAttribute.ListAttribute) ticketAttribute).getValue(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme3.getTypography(interfaceC1084f2, i19).getType04(), interfaceC1084f2, 0, 0, 65534);
                                    interfaceC1084f2.D();
                                } else {
                                    if (ticketAttribute instanceof Ticket.TicketAttribute.DateTimeAttribute) {
                                        interfaceC1084f2.L(2135335386);
                                        String timeInMillisAsDate = TimeFormatter.formatTimeInMillisAsDate(Long.parseLong(((Ticket.TicketAttribute.DateTimeAttribute) ticketAttribute).getValue()) * ((long) Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS), "dd-MM-yyy, HH:mm");
                                        kotlin.jvm.internal.i.d(timeInMillisAsDate, "formatTimeInMillisAsDate(...)");
                                        TextKt.b(timeInMillisAsDate, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme3.getTypography(interfaceC1084f2, i19).getType04(), interfaceC1084f2, 0, 0, 65534);
                                        interfaceC1084f2.D();
                                    } else {
                                        if (ticketAttribute instanceof Ticket.TicketAttribute.FilesAttribute) {
                                            interfaceC1084f2.L(2135835354);
                                            FIleAttachmentListKt.FileAttachmentList(null, ((Ticket.TicketAttribute.FilesAttribute) ticketAttribute).getValue(), interfaceC1084f2, 64, 1);
                                            interfaceC1084f2.D();
                                        } else {
                                            if (!(ticketAttribute instanceof Ticket.TicketAttribute.UnSupported)) {
                                                interfaceC1084f2.L(1592882332);
                                                interfaceC1084f2.D();
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            interfaceC1084f2.L(2136019990);
                                            TextKt.b(((Ticket.TicketAttribute.UnSupported) ticketAttribute).getValue().toString(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme3.getTypography(interfaceC1084f2, i19).getType04(), interfaceC1084f2, 0, 0, 65534);
                                            interfaceC1084f2.D();
                                        }
                                        aVar4 = aVar3;
                                    }
                                    Lb.a.a(interfaceC1084f2, W.e(aVar4, f15));
                                    aVar8 = aVar4;
                                    f15 = f15;
                                }
                            }
                            aVar4 = aVar3;
                            Lb.a.a(interfaceC1084f2, W.e(aVar4, f15));
                            aVar8 = aVar4;
                            f15 = f15;
                        }
                        interfaceC1084f2.D();
                        interfaceC1084f2.J();
                    }
                    interfaceC1084f2.D();
                    interfaceC1084f2.J();
                } catch (Throwable th) {
                    bVar2.e(iH);
                    throw th;
                }
            }
        }, c1086gP), c1086gP, 12582918, me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_windowFixedWidthMajor);
        c1086gP.L(1933740147);
        if (ticketDetailContentState.getConversationButtonState().getShowButton()) {
            if (1.0f <= 0.0d) {
                p258v.a.a("invalid weight; must be greater than zero");
            }
            Lb.a.a(c1086gP, new LayoutWeightElement(true, Na.l.z(1.0f, Float.MAX_VALUE)));
            float f13 = 16;
            androidx.compose.ui.h hVarH2 = PaddingKt.h(W.d(aVar, 1.0f), 0.0f, f13, 1);
            C0953m c0953mA3 = C0952l.a(kVar, androidx.compose.ui.d.a.f13347n, c1086gP, 48);
            i14 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P5 = c1086gP.P();
            androidx.compose.ui.h hVarC5 = ComposedModifierKt.c(c1086gP, hVarH2);
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar2);
            } else {
                c1086gP.A();
            }
            R0.a(pVar2, c1086gP, c0953mA3);
            R0.a(pVar3, c1086gP, interfaceC1089h0P5);
            if (c1086gP.f12995O) {
                J4.i.d(i14, c1086gP, i14, pVar4);
            } else {
                J4.i.d(i14, c1086gP, i14, pVar4);
            }
            R0.a(pVar, c1086gP, hVarC5);
            TextKt.b(S4.o.p(c1086gP, R.string.intercom_tickets_cta_text), W.d(aVar, 1.0f), 0L, 0L, null, null, null, 0L, null, new androidx.compose.ui.text.style.g(3), 0L, 0, false, 0, 0, null, F.a(intercomTheme.getTypography(c1086gP, i12).getType04Point5(), intercomTheme.getColors(c1086gP, i12).m630getDescriptionText0d7_KjU(), 0L, null, null, 0L, null, 0, 0L, null, null, 16777214), c1086gP, 48, 0, 65020);
            Lb.a.a(c1086gP, W.e(aVar, 8));
            ConversationButtonState conversationButtonState2 = ticketDetailContentState.getConversationButtonState();
            lVar3 = lVar2;
            IntercomButtonKt.IntercomButton(null, IntercomButton.INSTANCE.m523primaryStyleKlgxPg(0L, 0L, null, c1086gP, IntercomButton.$stable << 9, 7), conversationButtonState2.getText().getText(c1086gP, StringProvider.$stable), conversationButtonState2.getIconRes(), new io.intercom.android.sdk.m5.helpcenter.ui.components.b(1, lVar3, ticketDetailContentState), c1086gP, IntercomButton.Style.$stable << 3, 1);
            Lb.a.a(c1086gP, W.e(aVar, f13));
            z11 = true;
            c1086gP.T(true);
        } else {
            lVar3 = lVar2;
            z11 = true;
        }
        c1105p0A = C4.a.a(c1086gP, false, z11);
        if (c1105p0A != null) {
            final androidx.compose.ui.h hVar5 = hVar2;
            final Ia.l lVar5 = lVar3;
            c1105p0A.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.tickets.k
                @Override // Ia.p
                public final Object invoke(Object obj2, Object obj3) {
                    int iIntValue = ((Integer) obj3).intValue();
                    return TicketDetailContentKt.TicketDetailContent$lambda$16(hVar5, ticketDetailContentState, lVar5, z14, i10, i11, (InterfaceC1084f) obj2, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r TicketDetailContent$lambda$0(String str) {
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TicketDetailContent$lambda$10(X<Float> x10, float f10) {
        x10.setValue(Float.valueOf(f10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r TicketDetailContent$lambda$15$lambda$14$lambda$13(Ia.l lVar, TicketDetailState.TicketDetailContentState ticketDetailContentState) {
        kotlin.jvm.internal.i.e(ticketDetailContentState, "$ticketDetailContentState");
        lVar.invoke(ticketDetailContentState.getConversationId());
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r TicketDetailContent$lambda$16(androidx.compose.ui.h hVar, TicketDetailState.TicketDetailContentState ticketDetailContentState, Ia.l lVar, boolean z10, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        kotlin.jvm.internal.i.e(ticketDetailContentState, "$ticketDetailContentState");
        TicketDetailContent(hVar, ticketDetailContentState, lVar, z10, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final X TicketDetailContent$lambda$2$lambda$1(boolean z10) {
        return J0.f(z10 ? CardState.SubmissionCard : CardState.TimelineCard);
    }

    private static final CardState TicketDetailContent$lambda$3(X<CardState> x10) {
        return x10.getValue();
    }

    private static final float TicketDetailContent$lambda$6(X<p013b0.f> x10) {
        return x10.getValue().f20481b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TicketDetailContent$lambda$7(X<p013b0.f> x10, float f10) {
        x10.setValue(new p013b0.f(f10));
    }

    private static final float TicketDetailContent$lambda$9(X<Float> x10) {
        return x10.getValue().floatValue();
    }

    @IntercomPreviews
    public static final void TicketPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(-1759013677);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TicketDetailContentKt.INSTANCE.m463getLambda3$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new C2281g0(i10, 5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r TicketPreview$lambda$20(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        TicketPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    @IntercomPreviews
    public static final void TicketPreviewSubmittedCard(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(2122497154);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TicketDetailContentKt.INSTANCE.m464getLambda4$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new C2277e0(i10, 6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r TicketPreviewSubmittedCard$lambda$21(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        TicketPreviewSubmittedCard(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TicketSubmissionCard(androidx.compose.ui.h hVar, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        final androidx.compose.ui.h hVar2;
        int i12;
        C1086g c1086gP = interfaceC1084f.p(-2022209692);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
            hVar2 = hVar;
        } else if ((i10 & 14) == 0) {
            hVar2 = hVar;
            i12 = (c1086gP.K(hVar2) ? 4 : 2) | i10;
        } else {
            hVar2 = hVar;
            i12 = i10;
        }
        if ((i12 & 11) == 2 && c1086gP.s()) {
            c1086gP.w();
        } else {
            androidx.compose.ui.h.a aVar = androidx.compose.ui.h.a.f13984b;
            androidx.compose.ui.h hVar3 = i13 != 0 ? aVar : hVar2;
            float f10 = 16;
            C0945e.i iVarG = C0945e.g(f10);
            androidx.compose.ui.f.a aVar2 = androidx.compose.ui.d.a.f13347n;
            androidx.compose.ui.h hVarF = PaddingKt.f(hVar3, f10);
            C0953m c0953mA = C0952l.a(iVarG, aVar2, c1086gP, 54);
            int i14 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
            androidx.compose.ui.h hVarC = ComposedModifierKt.c(c1086gP, hVarF);
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
            IconKt.a(U.c.a(R.drawable.intercom_submitted, c1086gP, 0), null, W.m(aVar, 48), Q3.d.e(4279072050L), c1086gP, 3512, 0);
            String strP = S4.o.p(c1086gP, R.string.intercom_tickets_created_confirmation_header);
            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
            int i15 = IntercomTheme.$stable;
            TextKt.b(strP, null, intercomTheme.getColors(c1086gP, i15).m645getPrimaryText0d7_KjU(), 0L, null, null, null, 0L, null, new androidx.compose.ui.text.style.g(3), 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c1086gP, i15).getType04(), c1086gP, 0, 0, 65018);
            TextKt.b(S4.o.p(c1086gP, R.string.intercom_tickets_submitted_confirmation_paragraph), null, intercomTheme.getColors(c1086gP, i15).m645getPrimaryText0d7_KjU(), 0L, null, null, null, 0L, null, new androidx.compose.ui.text.style.g(3), 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c1086gP, i15).getType04(), c1086gP, 0, 0, 65018);
            c1086gP.T(true);
            hVar2 = hVar3;
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.tickets.l
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return TicketDetailContentKt.TicketSubmissionCard$lambda$18(hVar2, i10, i11, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r TicketSubmissionCard$lambda$18(androidx.compose.ui.h hVar, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        TicketSubmissionCard(hVar, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return p293xa.r.f47939a;
    }

    @IntercomPreviews
    public static final void TicketSubmissionCardPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(-981393609);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TicketDetailContentKt.INSTANCE.m462getLambda2$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new io.intercom.android.sdk.m5.home.ui.components.q(i10, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r TicketSubmissionCardPreview$lambda$19(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        TicketSubmissionCardPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    public static final TicketDetailState.TicketDetailContentState getSampleTicketDetailState() {
        return sampleTicketDetailState;
    }
}
