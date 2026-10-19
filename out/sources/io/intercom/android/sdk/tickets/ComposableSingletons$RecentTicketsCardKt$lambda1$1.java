package io.intercom.android.sdk.tickets;

import androidx.compose.foundation.layout.W;
import androidx.compose.runtime.InterfaceC1084f;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.Ticket;

/* JADX INFO: renamed from: io.intercom.android.sdk.tickets.ComposableSingletons$RecentTicketsCardKt$lambda-1$1, reason: invalid class name */
/* JADX INFO: compiled from: RecentTicketsCard.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$RecentTicketsCardKt$lambda1$1 implements Ia.p<InterfaceC1084f, Integer, p293xa.r> {
    public static final ComposableSingletons$RecentTicketsCardKt$lambda1$1 INSTANCE = new ComposableSingletons$RecentTicketsCardKt$lambda1$1();

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r invoke$lambda$0(String it) {
        kotlin.jvm.internal.i.e(it, "it");
        return p293xa.r.f47939a;
    }

    @Override // Ia.p
    public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
        invoke(interfaceC1084f, num.intValue());
        return p293xa.r.f47939a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void invoke(InterfaceC1084f interfaceC1084f, int i10) {
        if ((i10 & 11) == 2 && interfaceC1084f.s()) {
            interfaceC1084f.w();
            return;
        }
        androidx.compose.ui.h hVarD = W.d(androidx.compose.ui.h.a.f13984b, 1.0f);
        int i11 = 28;
        kotlin.jvm.internal.e eVar = null;
        String str = null;
        boolean z10 = false;
        long j = 0;
        Ticket.Status status = new Ticket.Status("Waiting on you", "waiting_on_customer", str, z10, j, i11, eVar);
        Boolean bool = Boolean.FALSE;
        Ticket ticket = new Ticket("1", "1200", "This is a ticket title", null, null, null, status, null, null, 0, null, null, null, bool, 0L, 24504, null);
        Ticket.Status status2 = new Ticket.Status("Submitted", MetricTracker.Action.SUBMITTED, str, z10, j, i11, eVar);
        Boolean bool2 = Boolean.TRUE;
        Object[] objArr = 0 == true ? 1 : 0;
        RecentTicketsCardKt.RecentTicketsCard(hVarD, "Recent tickets", kotlin.collections.l.s(ticket, new Ticket("2", "1201", "Bug", null, null, null, status2, null, null, 0, null, null, null, bool2, 0L, 24504, null), new Ticket("3", "1202", "Feature Request", null, null, null, new Ticket.Status("In progress", "in_progress", null, false, 0L, 28, null), null, null, 0, null, null, null, bool2, 0L, 24504, null), new Ticket("4", "1204", "Unresolvable", null, null, null, new Ticket.Status("Resolved", "resolved", objArr, false, 0L, 28, null), null, null, 0, null, null, null, bool, 0L, 24504, null)), new a(), interfaceC1084f, 3638, 0);
    }
}
