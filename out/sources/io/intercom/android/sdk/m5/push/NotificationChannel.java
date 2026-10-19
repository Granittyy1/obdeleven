package io.intercom.android.sdk.m5.push;

/* JADX INFO: compiled from: IntercomNotificationHandler.kt */
/* JADX INFO: loaded from: classes3.dex */
public enum NotificationChannel {
    CHAT_REPLIES_CHANNEL("intercom_chat_replies_channel"),
    NEW_CHATS_CHANNEL("intercom_new_chats_channel"),
    ACTIONS_CHANNEL("intercom_actions_channel");

    private static final /* synthetic */ Ba.a $ENTRIES = kotlin.enums.a.a(values());
    private final String channelName;

    NotificationChannel(String str) {
        this.channelName = str;
    }

    public static Ba.a<NotificationChannel> getEntries() {
        return $ENTRIES;
    }

    public final String getChannelName() {
        return this.channelName;
    }
}
