package io.intercom.android.sdk.m5.conversation;

import io.intercom.android.sdk.m5.conversation.data.ParsedNexusEvent;
import io.intercom.android.sdk.m5.conversation.states.ConversationClientState;
import io.intercom.android.sdk.m5.conversation.states.PendingMessage;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: ConversationViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ConversationViewModelKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isFastFinTyping(ParsedNexusEvent.ConversationNexusEvent.AdminIsTyping adminIsTyping, ConversationClientState conversationClientState) {
        if (adminIsTyping.getClientId().length() > 0) {
            Map<String, PendingMessage> pendingMessages = conversationClientState.getPendingMessages();
            if (!pendingMessages.isEmpty()) {
                Iterator<Map.Entry<String, PendingMessage>> it = pendingMessages.entrySet().iterator();
                while (it.hasNext()) {
                    if (i.a(it.next().getValue().getPart().getUuid(), adminIsTyping.getClientId())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
