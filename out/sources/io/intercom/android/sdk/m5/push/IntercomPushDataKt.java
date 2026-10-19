package io.intercom.android.sdk.m5.push;

import android.os.Bundle;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: IntercomPushData.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class IntercomPushDataKt {
    private static final String AppName = "app_name";
    private static final String AuthorName = "author_name";
    private static final String Body = "body";
    private static final String ContentImageUrl = "content_image_url";
    private static final String ConversationId = "conversation_id";
    private static final String ConversationPartType = "conversation_part_type";
    private static final String ImageUrl = "image_url";
    private static final String InstanceId = "instance_id";
    private static final String IntercomPushType = "intercom_push_type";
    private static final String Message = "message";
    private static final String MessageData = "message_data";
    private static final String Receiver = "receiver";
    private static final String Title = "title";
    private static final String Uri = "uri";

    /* JADX INFO: Access modifiers changed from: private */
    public static final SimplePushData getSimplePushDataFromBundle(Bundle bundle) {
        String string = bundle.getString(IntercomPushType, "");
        i.d(string, "getString(...)");
        String string2 = bundle.getString("conversation_id", "");
        i.d(string2, "getString(...)");
        String string3 = bundle.getString(Title, "");
        i.d(string3, "getString(...)");
        String string4 = bundle.getString("message", "");
        i.d(string4, "getString(...)");
        String string5 = bundle.getString(Receiver, "");
        i.d(string5, "getString(...)");
        String string6 = bundle.getString(AuthorName, "");
        i.d(string6, "getString(...)");
        String string7 = bundle.getString(Body, "");
        i.d(string7, "getString(...)");
        String string8 = bundle.getString(AppName, "");
        i.d(string8, "getString(...)");
        String string9 = bundle.getString(ContentImageUrl, "");
        i.d(string9, "getString(...)");
        String string10 = bundle.getString(ImageUrl, "");
        i.d(string10, "getString(...)");
        String string11 = bundle.getString("uri", "");
        i.d(string11, "getString(...)");
        String string12 = bundle.getString(InstanceId, "");
        i.d(string12, "getString(...)");
        String string13 = bundle.getString(ConversationPartType, "");
        i.d(string13, "getString(...)");
        String string14 = bundle.getString(MessageData, "");
        i.d(string14, "getString(...)");
        return new SimplePushData(string, string2, string3, string4, string7, string5, string6, string8, string9, string10, string11, string12, string13, string14);
    }
}
