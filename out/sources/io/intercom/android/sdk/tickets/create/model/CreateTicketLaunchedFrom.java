package io.intercom.android.sdk.tickets.create.model;

import io.intercom.android.sdk.metrics.MetricTracker;

/* JADX INFO: compiled from: CreateTicketViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
public enum CreateTicketLaunchedFrom {
    Conversation("conversation"),
    Home(MetricTracker.Context.HOME_SCREEN);

    private static final /* synthetic */ Ba.a $ENTRIES = kotlin.enums.a.a(values());
    private final String from;

    CreateTicketLaunchedFrom(String str) {
        this.from = str;
    }

    public static Ba.a<CreateTicketLaunchedFrom> getEntries() {
        return $ENTRIES;
    }

    public final String getFrom() {
        return this.from;
    }
}
