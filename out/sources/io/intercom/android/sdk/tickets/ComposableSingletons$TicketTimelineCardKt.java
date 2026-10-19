package io.intercom.android.sdk.tickets;

import androidx.compose.foundation.C0932d;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.graphics.h0;
import io.intercom.android.sdk.ui.theme.IntercomTheme;

/* JADX INFO: compiled from: TicketTimelineCard.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$TicketTimelineCardKt {
    public static final ComposableSingletons$TicketTimelineCardKt INSTANCE = new ComposableSingletons$TicketTimelineCardKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    public static Ia.p<InterfaceC1084f, Integer, p293xa.r> f299lambda1 = new ComposableLambdaImpl(false, -762343961, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.tickets.ComposableSingletons$TicketTimelineCardKt$lambda-1$1
        @Override // Ia.p
        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
            invoke(interfaceC1084f, num.intValue());
            return p293xa.r.f47939a;
        }

        public final void invoke(InterfaceC1084f interfaceC1084f, int i10) {
            if ((i10 & 11) == 2 && interfaceC1084f.s()) {
                interfaceC1084f.w();
                return;
            }
            androidx.compose.ui.h hVarB = C0932d.b(androidx.compose.ui.h.a.f13984b, IntercomTheme.INSTANCE.getColors(interfaceC1084f, IntercomTheme.$stable).m621getBackground0d7_KjU(), h0.f13629a);
            TicketTimelineCardState sampleTicketTimelineCardState = TicketTimelineCardKt.getSampleTicketTimelineCardState();
            TicketTimelineCardKt.TicketTimelineCard(sampleTicketTimelineCardState.m480copyww6aTOc((7 & 1) != 0 ? sampleTicketTimelineCardState.adminAvatars : null, (7 & 2) != 0 ? sampleTicketTimelineCardState.statusTitle : null, (7 & 4) != 0 ? sampleTicketTimelineCardState.statusSubtitle : null, (7 & 8) != 0 ? sampleTicketTimelineCardState.progressColor : TicketStatus.WaitingOnCustomer.m477getColor0d7_KjU(), (7 & 16) != 0 ? sampleTicketTimelineCardState.progressSections : kotlin.collections.l.s(new TicketTimelineCardState.ProgressSection(true, false), new TicketTimelineCardState.ProgressSection(true, true), new TicketTimelineCardState.ProgressSection(false, false)), (7 & 32) != 0 ? sampleTicketTimelineCardState.statusLabel : "Waiting on you", (7 & 64) != 0 ? sampleTicketTimelineCardState.timestamp : null), hVarB, interfaceC1084f, 8, 0);
        }
    });

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    public static Ia.p<InterfaceC1084f, Integer, p293xa.r> f300lambda2 = new ComposableLambdaImpl(false, -519340954, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.tickets.ComposableSingletons$TicketTimelineCardKt$lambda-2$1
        @Override // Ia.p
        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
            invoke(interfaceC1084f, num.intValue());
            return p293xa.r.f47939a;
        }

        public final void invoke(InterfaceC1084f interfaceC1084f, int i10) {
            if ((i10 & 11) == 2 && interfaceC1084f.s()) {
                interfaceC1084f.w();
            } else {
                TicketTimelineCardKt.TicketTimelineCard(TicketTimelineCardKt.getSampleTicketTimelineCardState(), C0932d.b(androidx.compose.ui.h.a.f13984b, IntercomTheme.INSTANCE.getColors(interfaceC1084f, IntercomTheme.$stable).m621getBackground0d7_KjU(), h0.f13629a), interfaceC1084f, 8, 0);
            }
        }
    });

    /* JADX INFO: renamed from: lambda-3, reason: not valid java name */
    public static Ia.p<InterfaceC1084f, Integer, p293xa.r> f301lambda3 = new ComposableLambdaImpl(false, 1948582297, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.tickets.ComposableSingletons$TicketTimelineCardKt$lambda-3$1
        @Override // Ia.p
        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
            invoke(interfaceC1084f, num.intValue());
            return p293xa.r.f47939a;
        }

        public final void invoke(InterfaceC1084f interfaceC1084f, int i10) {
            if ((i10 & 11) == 2 && interfaceC1084f.s()) {
                interfaceC1084f.w();
                return;
            }
            androidx.compose.ui.h hVarB = C0932d.b(androidx.compose.ui.h.a.f13984b, IntercomTheme.INSTANCE.getColors(interfaceC1084f, IntercomTheme.$stable).m621getBackground0d7_KjU(), h0.f13629a);
            TicketTimelineCardState sampleTicketTimelineCardState = TicketTimelineCardKt.getSampleTicketTimelineCardState();
            TicketTimelineCardKt.TicketTimelineCard(sampleTicketTimelineCardState.m480copyww6aTOc((7 & 1) != 0 ? sampleTicketTimelineCardState.adminAvatars : null, (7 & 2) != 0 ? sampleTicketTimelineCardState.statusTitle : null, (7 & 4) != 0 ? sampleTicketTimelineCardState.statusSubtitle : null, (7 & 8) != 0 ? sampleTicketTimelineCardState.progressColor : TicketStatus.Resolved.m477getColor0d7_KjU(), (7 & 16) != 0 ? sampleTicketTimelineCardState.progressSections : kotlin.collections.l.s(new TicketTimelineCardState.ProgressSection(true, false), new TicketTimelineCardState.ProgressSection(true, false), new TicketTimelineCardState.ProgressSection(true, false)), (7 & 32) != 0 ? sampleTicketTimelineCardState.statusLabel : "Resolved", (7 & 64) != 0 ? sampleTicketTimelineCardState.timestamp : null), hVarB, interfaceC1084f, 8, 0);
        }
    });

    /* JADX INFO: renamed from: lambda-4, reason: not valid java name */
    public static Ia.p<InterfaceC1084f, Integer, p293xa.r> f302lambda4 = new ComposableLambdaImpl(false, 1847313119, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.tickets.ComposableSingletons$TicketTimelineCardKt$lambda-4$1
        @Override // Ia.p
        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
            invoke(interfaceC1084f, num.intValue());
            return p293xa.r.f47939a;
        }

        public final void invoke(InterfaceC1084f interfaceC1084f, int i10) {
            if ((i10 & 11) == 2 && interfaceC1084f.s()) {
                interfaceC1084f.w();
                return;
            }
            androidx.compose.ui.h hVarB = C0932d.b(androidx.compose.ui.h.a.f13984b, IntercomTheme.INSTANCE.getColors(interfaceC1084f, IntercomTheme.$stable).m621getBackground0d7_KjU(), h0.f13629a);
            TicketTimelineCardState sampleTicketTimelineCardState = TicketTimelineCardKt.getSampleTicketTimelineCardState();
            TicketTimelineCardKt.TicketTimelineCard(sampleTicketTimelineCardState.m480copyww6aTOc((7 & 1) != 0 ? sampleTicketTimelineCardState.adminAvatars : null, (7 & 2) != 0 ? sampleTicketTimelineCardState.statusTitle : null, (7 & 4) != 0 ? sampleTicketTimelineCardState.statusSubtitle : null, (7 & 8) != 0 ? sampleTicketTimelineCardState.progressColor : TicketStatus.InProgress.m477getColor0d7_KjU(), (7 & 16) != 0 ? sampleTicketTimelineCardState.progressSections : kotlin.collections.l.s(new TicketTimelineCardState.ProgressSection(true, false), new TicketTimelineCardState.ProgressSection(true, true), new TicketTimelineCardState.ProgressSection(false, false)), (7 & 32) != 0 ? sampleTicketTimelineCardState.statusLabel : null, (7 & 64) != 0 ? sampleTicketTimelineCardState.timestamp : null), hVarB, interfaceC1084f, 8, 0);
        }
    });

    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final Ia.p<InterfaceC1084f, Integer, p293xa.r> m471getLambda1$intercom_sdk_base_release() {
        return f299lambda1;
    }

    /* JADX INFO: renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final Ia.p<InterfaceC1084f, Integer, p293xa.r> m472getLambda2$intercom_sdk_base_release() {
        return f300lambda2;
    }

    /* JADX INFO: renamed from: getLambda-3$intercom_sdk_base_release, reason: not valid java name */
    public final Ia.p<InterfaceC1084f, Integer, p293xa.r> m473getLambda3$intercom_sdk_base_release() {
        return f301lambda3;
    }

    /* JADX INFO: renamed from: getLambda-4$intercom_sdk_base_release, reason: not valid java name */
    public final Ia.p<InterfaceC1084f, Integer, p293xa.r> m474getLambda4$intercom_sdk_base_release() {
        return f302lambda4;
    }
}
