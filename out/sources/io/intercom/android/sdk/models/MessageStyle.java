package io.intercom.android.sdk.models;

import Ba.a;

/* JADX INFO: compiled from: MessageStyle.kt */
/* JADX INFO: loaded from: classes3.dex */
public enum MessageStyle {
    CHAT,
    POST,
    NOTE,
    ADMIN_IS_TYPING_STYLE,
    QUICK_REPLY,
    ATTRIBUTE_COLLECTOR,
    TICKET_STATE_UPDATED,
    MERGED_PRIMARY_CONVERSATION,
    FIN_ANSWER;

    private static final /* synthetic */ a $ENTRIES = kotlin.enums.a.a(values());

    public static a<MessageStyle> getEntries() {
        return $ENTRIES;
    }
}
