package io.intercom.android.sdk.m5.navigation;

import android.content.Context;
import java.util.List;
import kotlin.collections.EmptyList;

/* JADX INFO: compiled from: IntercomRootActivityLauncher.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class IntercomRootActivityLauncher {
    public static final int $stable = 0;
    public static final IntercomRootActivityLauncher INSTANCE = new IntercomRootActivityLauncher();

    private IntercomRootActivityLauncher() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void startHelpCenterCollections$default(IntercomRootActivityLauncher intercomRootActivityLauncher, Context context, List list, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            list = EmptyList.f42983b;
        }
        intercomRootActivityLauncher.startHelpCenterCollections(context, list, str);
    }

    public final void startHelpCenterCollection(Context context, String collectionId, String place) {
        kotlin.jvm.internal.i.e(context, "context");
        kotlin.jvm.internal.i.e(collectionId, "collectionId");
        kotlin.jvm.internal.i.e(place, "place");
        context.startActivity(IntercomRootActivityArgsKt.getIntentForArgs$default(context, new IntercomRootActivityArgs.HelpCenterCollectionArgs(collectionId, place), null, null, 12, null));
    }

    public final void startHelpCenterCollections(Context context, List<String> collectionIds, String metricPlace) {
        kotlin.jvm.internal.i.e(context, "context");
        kotlin.jvm.internal.i.e(collectionIds, "collectionIds");
        kotlin.jvm.internal.i.e(metricPlace, "metricPlace");
        context.startActivity(IntercomRootActivityArgsKt.getIntentForArgs$default(context, new IntercomRootActivityArgs.HelpCenterCollectionsArgs(collectionIds, metricPlace), null, null, 12, null));
    }

    public final void startHome(Context context) {
        kotlin.jvm.internal.i.e(context, "context");
        context.startActivity(IntercomRootActivityArgsKt.getIntentForArgs$default(context, IntercomRootActivityArgs.HomeScreenArgs.INSTANCE, null, null, 12, null));
    }

    public final void startMessages(Context context) {
        kotlin.jvm.internal.i.e(context, "context");
        context.startActivity(IntercomRootActivityArgsKt.getIntentForArgs$default(context, IntercomRootActivityArgs.MessagesScreenArgs.INSTANCE, null, null, 12, null));
    }

    public final void startTicketDetails(Context context, String ticketId, String from) {
        kotlin.jvm.internal.i.e(context, "context");
        kotlin.jvm.internal.i.e(ticketId, "ticketId");
        kotlin.jvm.internal.i.e(from, "from");
        context.startActivity(IntercomRootActivityArgsKt.getIntentForArgs$default(context, new IntercomRootActivityArgs.TicketDetailsScreenArgs(ticketId, from), null, null, 12, null));
    }

    public final void startTickets(Context context) {
        kotlin.jvm.internal.i.e(context, "context");
        context.startActivity(IntercomRootActivityArgsKt.getIntentForArgs$default(context, IntercomRootActivityArgs.TicketsScreenArgs.INSTANCE, null, null, 12, null));
    }
}
