package io.intercom.android.sdk.metrics;

import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.DeliveryOption;
import io.intercom.android.sdk.models.MessageStyle;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.UsersResponse;
import io.intercom.android.sdk.utilities.extensions.PartExtensionsKt;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: UnreadConversationsTracker.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class UnreadConversationsTracker {
    public static final int $stable = 8;
    private final Set<String> trackedPartIds;
    private final Provider<MetricTracker> trackerProvider;

    public UnreadConversationsTracker(Provider<MetricTracker> trackerProvider) {
        i.e(trackerProvider, "trackerProvider");
        this.trackerProvider = trackerProvider;
        this.trackedPartIds = new LinkedHashSet();
    }

    private final MetricTracker getTracker() {
        MetricTracker metricTracker = this.trackerProvider.get();
        i.d(metricTracker, "get(...)");
        return metricTracker;
    }

    private final void trackReceivedPart(Part part, String str) {
        boolean zHasAttachments = part.hasAttachments();
        boolean zIsLinkCard = PartExtensionsKt.isLinkCard(part);
        String id = part.getId();
        MessageStyle messageStyle = part.getMessageStyle();
        if (DeliveryOption.SUMMARY != part.getDeliveryOption()) {
            getTracker().receivedMessageFromFullWhenClosed(zHasAttachments, zIsLinkCard, str, id, messageStyle);
        } else if (part.isInitialMessage()) {
            getTracker().receivedMessageFromSnippetWhenClosed(zHasAttachments, zIsLinkCard, str, id, messageStyle);
        } else {
            getTracker().receivedReplyFromSnippetWhenClosed(zHasAttachments, zIsLinkCard, str, id);
        }
    }

    public final void clear() {
        this.trackedPartIds.clear();
    }

    public final void track(UsersResponse response) {
        i.e(response, "response");
        List<Conversation> conversations = response.getUnreadConversations().getConversations();
        i.b(conversations);
        for (Conversation conversation : conversations) {
            Part partLastPart = conversation.lastPart();
            if (!this.trackedPartIds.contains(partLastPart.getId())) {
                Set<String> set = this.trackedPartIds;
                String id = partLastPart.getId();
                i.d(id, "getId(...)");
                set.add(id);
                trackReceivedPart(partLastPart, conversation.getId());
            }
        }
    }
}
