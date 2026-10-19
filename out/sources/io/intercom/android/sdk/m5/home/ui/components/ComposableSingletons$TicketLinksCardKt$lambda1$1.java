package io.intercom.android.sdk.m5.home.ui.components;

import androidx.compose.runtime.InterfaceC1084f;
import io.intercom.android.sdk.blocks.lib.models.TicketType;
import io.intercom.android.sdk.m5.home.data.HomeCardType;
import io.intercom.android.sdk.m5.home.data.HomeCards;
import io.intercom.android.sdk.m5.home.data.TicketLink;

/* JADX INFO: renamed from: io.intercom.android.sdk.m5.home.ui.components.ComposableSingletons$TicketLinksCardKt$lambda-1$1, reason: invalid class name */
/* JADX INFO: compiled from: TicketLinksCard.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$TicketLinksCardKt$lambda1$1 implements Ia.p<InterfaceC1084f, Integer, p293xa.r> {
    public static final ComposableSingletons$TicketLinksCardKt$lambda1$1 INSTANCE = new ComposableSingletons$TicketLinksCardKt$lambda1$1();

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r invoke$lambda$0(TicketType it) {
        kotlin.jvm.internal.i.e(it, "it");
        return p293xa.r.f47939a;
    }

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
        TicketType.Companion companion = TicketType.Companion;
        TicketLinksCardKt.TicketLinksCard(new HomeCards.HomeTicketLinksData("Create a ticket", HomeCardType.TICKET_LINKS, kotlin.collections.l.s(new TicketLink(1, "Billing issue", "", 0, companion.getNULL()), new TicketLink(2, "Bug", "", 1, companion.getNULL()))), new e(), interfaceC1084f, 56);
    }
}
