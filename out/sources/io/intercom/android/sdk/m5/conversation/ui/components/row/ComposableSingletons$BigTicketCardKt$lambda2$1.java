package io.intercom.android.sdk.m5.conversation.ui.components.row;

import androidx.compose.runtime.InterfaceC1084f;
import io.intercom.android.sdk.tickets.TicketDetailContentKt;
import io.intercom.android.sdk.tickets.TicketDetailState;
import io.intercom.android.sdk.tickets.TicketStatus;
import io.intercom.android.sdk.tickets.TicketTimelineCardKt;
import io.intercom.android.sdk.tickets.TicketTimelineCardState;

/* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ui.components.row.ComposableSingletons$BigTicketCardKt$lambda-2$1, reason: invalid class name */
/* JADX INFO: compiled from: BigTicketCard.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$BigTicketCardKt$lambda2$1 implements Ia.p<InterfaceC1084f, Integer, p293xa.r> {
    public static final ComposableSingletons$BigTicketCardKt$lambda2$1 INSTANCE = new ComposableSingletons$BigTicketCardKt$lambda2$1();

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
        TicketDetailState.TicketDetailContentState sampleTicketDetailState = TicketDetailContentKt.getSampleTicketDetailState();
        TicketTimelineCardState sampleTicketTimelineCardState = TicketTimelineCardKt.getSampleTicketTimelineCardState();
        BigTicketCardKt.BigTicketCard(TicketDetailState.TicketDetailContentState.copy$default(sampleTicketDetailState, null, sampleTicketTimelineCardState.m480copyww6aTOc((7 & 1) != 0 ? sampleTicketTimelineCardState.adminAvatars : null, (7 & 2) != 0 ? sampleTicketTimelineCardState.statusTitle : null, (7 & 4) != 0 ? sampleTicketTimelineCardState.statusSubtitle : null, (7 & 8) != 0 ? sampleTicketTimelineCardState.progressColor : TicketStatus.WaitingOnCustomer.m477getColor0d7_KjU(), (7 & 16) != 0 ? sampleTicketTimelineCardState.progressSections : kotlin.collections.l.s(new TicketTimelineCardState.ProgressSection(true, false), new TicketTimelineCardState.ProgressSection(true, true), new TicketTimelineCardState.ProgressSection(false, false)), (7 & 32) != 0 ? sampleTicketTimelineCardState.statusLabel : "Waiting on you", (7 & 64) != 0 ? sampleTicketTimelineCardState.timestamp : Long.valueOf(System.currentTimeMillis())), null, null, null, null, 61, null), new C2380l(), true, null, interfaceC1084f, 440, 8);
    }
}
