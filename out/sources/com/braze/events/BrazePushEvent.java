package com.braze.events;

import com.braze.enums.BrazePushEventType;
import com.braze.models.push.BrazeNotificationPayload;
import kotlin.jvm.internal.i;

/* JADX INFO: loaded from: classes.dex */
public final class BrazePushEvent {
    private final BrazePushEventType eventType;
    private final BrazeNotificationPayload notificationPayload;

    public BrazePushEvent(BrazePushEventType eventType, BrazeNotificationPayload notificationPayload) {
        i.e(eventType, "eventType");
        i.e(notificationPayload, "notificationPayload");
        this.eventType = eventType;
        this.notificationPayload = notificationPayload;
    }

    public static /* synthetic */ BrazePushEvent copy$default(BrazePushEvent brazePushEvent, BrazePushEventType brazePushEventType, BrazeNotificationPayload brazeNotificationPayload, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            brazePushEventType = brazePushEvent.eventType;
        }
        if ((i10 & 2) != 0) {
            brazeNotificationPayload = brazePushEvent.notificationPayload;
        }
        return brazePushEvent.copy(brazePushEventType, brazeNotificationPayload);
    }

    public final BrazePushEventType component1() {
        return this.eventType;
    }

    public final BrazeNotificationPayload component2() {
        return this.notificationPayload;
    }

    public final BrazePushEvent copy(BrazePushEventType eventType, BrazeNotificationPayload notificationPayload) {
        i.e(eventType, "eventType");
        i.e(notificationPayload, "notificationPayload");
        return new BrazePushEvent(eventType, notificationPayload);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BrazePushEvent)) {
            return false;
        }
        BrazePushEvent brazePushEvent = (BrazePushEvent) obj;
        return this.eventType == brazePushEvent.eventType && i.a(this.notificationPayload, brazePushEvent.notificationPayload);
    }

    public final BrazePushEventType getEventType() {
        return this.eventType;
    }

    public final BrazeNotificationPayload getNotificationPayload() {
        return this.notificationPayload;
    }

    public int hashCode() {
        return this.notificationPayload.hashCode() + (this.eventType.hashCode() * 31);
    }

    public String toString() {
        return "BrazePushEvent(eventType=" + this.eventType + ", notificationPayload=" + this.notificationPayload + ')';
    }
}
