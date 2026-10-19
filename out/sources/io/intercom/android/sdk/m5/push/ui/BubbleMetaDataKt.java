package io.intercom.android.sdk.m5.push.ui;

import android.app.PendingIntent;
import android.content.Context;
import androidx.core.app.F;
import androidx.core.app.u;
import androidx.core.graphics.drawable.IconCompat;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.ConversationScreenOpenerKt;
import io.intercom.android.sdk.m5.bubble.IntercomBubbleActivity;
import kotlin.collections.q;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: BubbleMetaData.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class BubbleMetaDataKt {
    public static final u getBubbleMetaData(Context context, IntercomPushConversation conversation) {
        F person;
        i.e(context, "context");
        i.e(conversation, "conversation");
        PendingIntent activity = PendingIntent.getActivity(context, 2, ConversationScreenOpenerKt.getComposerIntent$default(context, null, false, null, conversation.getConversationId(), IntercomBubbleActivity.class, 2, null), 33554432);
        IntercomPushConversation.Message message = (IntercomPushConversation.Message) q.P(conversation.getMessages());
        IconCompat iconCompatD = (message == null || (person = message.getPerson()) == null) ? null : person.f16683b;
        if (iconCompatD == null) {
            iconCompatD = IconCompat.d(context, R.drawable.intercom_ic_avatar_person);
        }
        if (activity == null) {
            throw new NullPointerException("Bubble requires non-null pending intent");
        }
        int iMax = Math.max(600, 0);
        u uVar = new u();
        uVar.f16787a = activity;
        uVar.f16788b = iconCompatD;
        uVar.f16789c = iMax;
        uVar.f16790d = 2;
        return uVar;
    }
}
