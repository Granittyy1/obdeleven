package io.intercom.android.sdk.m5.conversation.usecase;

import io.intercom.android.sdk.annotations.SeenState;
import io.intercom.android.sdk.m5.conversation.states.ConversationClientState;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.Part;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.l;
import kotlin.collections.m;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.flow.q;

/* JADX INFO: compiled from: MarkUserContentAsSeenByAdmin.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class MarkUserContentAsSeenByAdmin {
    public static final int $stable = 0;

    public final void invoke(q<ConversationClientState> clientStateFlow) {
        ConversationClientState value;
        ConversationClientState conversationClientState;
        Conversation conversationCopy;
        i.e(clientStateFlow, "clientStateFlow");
        do {
            value = clientStateFlow.getValue();
            conversationClientState = value;
            Conversation conversation = conversationClientState.getConversation();
            conversationCopy = null;
            if (conversation != null) {
                List listO0 = kotlin.collections.q.o0(conversationClientState.getConversation().getPartBuilderList());
                ArrayList arrayList = new ArrayList(m.y(listO0, 10));
                int i10 = 0;
                for (Object obj : listO0) {
                    int i11 = i10 + 1;
                    if (i10 < 0) {
                        l.x();
                        throw null;
                    }
                    Part.Builder builderWithSeenByAdmin = (Part.Builder) obj;
                    Part partBuild = builderWithSeenByAdmin.build();
                    if (!partBuild.isAdmin()) {
                        if (i10 == l.r(conversationClientState.getConversation().parts())) {
                            builderWithSeenByAdmin = builderWithSeenByAdmin.withSeenByAdmin(SeenState.SEEN);
                        } else if (!i.a(partBuild.getSeenByAdmin(), SeenState.HIDE)) {
                            builderWithSeenByAdmin = builderWithSeenByAdmin.withSeenByAdmin(SeenState.HIDE);
                        }
                    }
                    arrayList.add(builderWithSeenByAdmin);
                    i10 = i11;
                }
                conversationCopy = conversation.copy((983039 & 1) != 0 ? conversation.id : null, (983039 & 2) != 0 ? conversation.isRead : false, (983039 & 4) != 0 ? conversation.participantBuilderList : null, (983039 & 8) != 0 ? conversation.partBuilderList : arrayList, (983039 & 16) != 0 ? conversation.groupConversationParticipantIds : null, (983039 & 32) != 0 ? conversation.lastParticipatingAdminBuilder : null, (983039 & 64) != 0 ? conversation.composerState : null, (983039 & 128) != 0 ? conversation.preventEndUserReplies : false, (983039 & 256) != 0 ? conversation.inboundConversationsDisabled : false, (983039 & 512) != 0 ? conversation.notificationStatus : null, (983039 & 1024) != 0 ? conversation.state : null, (983039 & 2048) != 0 ? conversation.isInbound : false, (983039 & 4096) != 0 ? conversation.ticket : null, (983039 & 8192) != 0 ? conversation.uiFlags : null, (983039 & 16384) != 0 ? conversation.header : null, (983039 & 32768) != 0 ? conversation.conversationEndedButton : null, (983039 & 65536) != 0 ? conversation.footerNotice : null, (983039 & 131072) != 0 ? conversation.poweredBy : null, (983039 & 262144) != 0 ? conversation.teamIntro : null, (983039 & 524288) != 0 ? conversation.specialNotice : null);
            }
        } while (!clientStateFlow.d(value, conversationClientState.copy((1048574 & 1) != 0 ? conversationClientState.pendingMessages : null, (1048574 & 2) != 0 ? conversationClientState.conversation : conversationCopy, (1048574 & 4) != 0 ? conversationClientState.conversationId : null, (1048574 & 8) != 0 ? conversationClientState.currentlyTypingState : null, (1048574 & 16) != 0 ? conversationClientState.composerState : null, (1048574 & 32) != 0 ? conversationClientState.bottomSheetState : null, (1048574 & 64) != 0 ? conversationClientState.launchMode : null, (1048574 & 128) != 0 ? conversationClientState.lastNetworkCall : null, (1048574 & 256) != 0 ? conversationClientState.articleMetadata : null, (1048574 & 512) != 0 ? conversationClientState.networkState : null, (1048574 & 1024) != 0 ? conversationClientState.failedAttributeIdentifiers : null, (1048574 & 2048) != 0 ? conversationClientState.loadingAttributeIdentifiers : null, (1048574 & 4096) != 0 ? conversationClientState.finStreamingData : null, (1048574 & 8192) != 0 ? conversationClientState.openMessengerResponse : null, (1048574 & 16384) != 0 ? conversationClientState.unreadConversationsCount : 0, (1048574 & 32768) != 0 ? conversationClientState.unreadTicketsCount : 0, (1048574 & 65536) != 0 ? conversationClientState.floatingIndicatorState : null, (1048574 & 131072) != 0 ? conversationClientState.newMessageId : null, (1048574 & 262144) != 0 ? conversationClientState.isConversationScrolled : false, (1048574 & 524288) != 0 ? conversationClientState.dismissedPrivacyNotice : false)));
    }
}
