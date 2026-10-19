package io.intercom.android.sdk.m5.conversation.usecase;

import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.conversation.states.ConversationClientState;
import io.intercom.android.sdk.m5.conversation.states.FloatingIndicatorState;
import io.intercom.android.sdk.m5.conversation.states.FooterNoticeState;
import io.intercom.android.sdk.m5.conversation.states.JumpToBottomButtonState;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.AvatarDetails;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.FooterNotice;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.m;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.flow.q;

/* JADX INFO: compiled from: UpdateFloatingIndicatorUseCase.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class UpdateFloatingIndicatorUseCase {
    public static final int $stable = 0;

    public final void invoke(q<ConversationClientState> clientState, ConversationScrolledState conversationScrolledState) {
        ConversationClientState value;
        ConversationClientState conversationClientState;
        ConversationClientState value2;
        ConversationClientState conversationClientState2;
        ConversationClientState value3;
        ConversationClientState conversationClientState3;
        String title;
        String subtitle;
        List arrayList;
        List<Avatar.Builder> avatars;
        i.e(clientState, "clientState");
        i.e(conversationScrolledState, "conversationScrolledState");
        boolean scrolled = conversationScrolledState.getScrolled();
        Conversation conversation = clientState.getValue().getConversation();
        FooterNotice footerNotice = conversation != null ? conversation.getFooterNotice() : null;
        if (footerNotice == null || conversationScrolledState.isLandscape() || conversationScrolledState.isLargeFont()) {
            if (scrolled && !(clientState.getValue().getFloatingIndicatorState() instanceof FloatingIndicatorState.JumpToBottomIndicator)) {
                do {
                    value = clientState.getValue();
                    conversationClientState = value;
                } while (!clientState.d(value, conversationClientState.copy((1048574 & 1) != 0 ? conversationClientState.pendingMessages : null, (1048574 & 2) != 0 ? conversationClientState.conversation : null, (1048574 & 4) != 0 ? conversationClientState.conversationId : null, (1048574 & 8) != 0 ? conversationClientState.currentlyTypingState : null, (1048574 & 16) != 0 ? conversationClientState.composerState : null, (1048574 & 32) != 0 ? conversationClientState.bottomSheetState : null, (1048574 & 64) != 0 ? conversationClientState.launchMode : null, (1048574 & 128) != 0 ? conversationClientState.lastNetworkCall : null, (1048574 & 256) != 0 ? conversationClientState.articleMetadata : null, (1048574 & 512) != 0 ? conversationClientState.networkState : null, (1048574 & 1024) != 0 ? conversationClientState.failedAttributeIdentifiers : null, (1048574 & 2048) != 0 ? conversationClientState.loadingAttributeIdentifiers : null, (1048574 & 4096) != 0 ? conversationClientState.finStreamingData : null, (1048574 & 8192) != 0 ? conversationClientState.openMessengerResponse : null, (1048574 & 16384) != 0 ? conversationClientState.unreadConversationsCount : 0, (1048574 & 32768) != 0 ? conversationClientState.unreadTicketsCount : 0, (1048574 & 65536) != 0 ? conversationClientState.floatingIndicatorState : new FloatingIndicatorState.JumpToBottomIndicator(new JumpToBottomButtonState(0, conversationScrolledState.getScrollToPosition(), conversationScrolledState.getLastSeenItemIndex(), 1, null)), (1048574 & 131072) != 0 ? conversationClientState.newMessageId : null, (1048574 & 262144) != 0 ? conversationClientState.isConversationScrolled : false, (1048574 & 524288) != 0 ? conversationClientState.dismissedPrivacyNotice : false)));
            }
        } else if (scrolled && !(clientState.getValue().getFloatingIndicatorState() instanceof FloatingIndicatorState.FooterNoticeIndicator)) {
            do {
                value3 = clientState.getValue();
                conversationClientState3 = value3;
                title = footerNotice.getTitle();
                subtitle = footerNotice.getSubtitle();
                if (subtitle == null) {
                    subtitle = "";
                }
                AvatarDetails avatarDetails = footerNotice.getAvatarDetails();
                if (avatarDetails == null || (avatars = avatarDetails.getAvatars()) == null) {
                    arrayList = EmptyList.f42983b;
                } else {
                    List<Avatar.Builder> list = avatars;
                    arrayList = new ArrayList(m.y(list, 10));
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        Avatar avatarBuild = ((Avatar.Builder) it.next()).build();
                        i.d(avatarBuild, "build(...)");
                        arrayList.add(new AvatarWrapper(avatarBuild, false, 2, null));
                    }
                }
            } while (!clientState.d(value3, conversationClientState3.copy((1048574 & 1) != 0 ? conversationClientState3.pendingMessages : null, (1048574 & 2) != 0 ? conversationClientState3.conversation : null, (1048574 & 4) != 0 ? conversationClientState3.conversationId : null, (1048574 & 8) != 0 ? conversationClientState3.currentlyTypingState : null, (1048574 & 16) != 0 ? conversationClientState3.composerState : null, (1048574 & 32) != 0 ? conversationClientState3.bottomSheetState : null, (1048574 & 64) != 0 ? conversationClientState3.launchMode : null, (1048574 & 128) != 0 ? conversationClientState3.lastNetworkCall : null, (1048574 & 256) != 0 ? conversationClientState3.articleMetadata : null, (1048574 & 512) != 0 ? conversationClientState3.networkState : null, (1048574 & 1024) != 0 ? conversationClientState3.failedAttributeIdentifiers : null, (1048574 & 2048) != 0 ? conversationClientState3.loadingAttributeIdentifiers : null, (1048574 & 4096) != 0 ? conversationClientState3.finStreamingData : null, (1048574 & 8192) != 0 ? conversationClientState3.openMessengerResponse : null, (1048574 & 16384) != 0 ? conversationClientState3.unreadConversationsCount : 0, (1048574 & 32768) != 0 ? conversationClientState3.unreadTicketsCount : 0, (1048574 & 65536) != 0 ? conversationClientState3.floatingIndicatorState : new FloatingIndicatorState.FooterNoticeIndicator(new FooterNoticeState(title, subtitle, arrayList)), (1048574 & 131072) != 0 ? conversationClientState3.newMessageId : null, (1048574 & 262144) != 0 ? conversationClientState3.isConversationScrolled : false, (1048574 & 524288) != 0 ? conversationClientState3.dismissedPrivacyNotice : false)));
        }
        if (scrolled || (clientState.getValue().getFloatingIndicatorState() instanceof FloatingIndicatorState.None)) {
            return;
        }
        do {
            value2 = clientState.getValue();
            conversationClientState2 = value2;
        } while (!clientState.d(value2, conversationClientState2.copy((1048574 & 1) != 0 ? conversationClientState2.pendingMessages : null, (1048574 & 2) != 0 ? conversationClientState2.conversation : null, (1048574 & 4) != 0 ? conversationClientState2.conversationId : null, (1048574 & 8) != 0 ? conversationClientState2.currentlyTypingState : null, (1048574 & 16) != 0 ? conversationClientState2.composerState : null, (1048574 & 32) != 0 ? conversationClientState2.bottomSheetState : null, (1048574 & 64) != 0 ? conversationClientState2.launchMode : null, (1048574 & 128) != 0 ? conversationClientState2.lastNetworkCall : null, (1048574 & 256) != 0 ? conversationClientState2.articleMetadata : null, (1048574 & 512) != 0 ? conversationClientState2.networkState : null, (1048574 & 1024) != 0 ? conversationClientState2.failedAttributeIdentifiers : null, (1048574 & 2048) != 0 ? conversationClientState2.loadingAttributeIdentifiers : null, (1048574 & 4096) != 0 ? conversationClientState2.finStreamingData : null, (1048574 & 8192) != 0 ? conversationClientState2.openMessengerResponse : null, (1048574 & 16384) != 0 ? conversationClientState2.unreadConversationsCount : 0, (1048574 & 32768) != 0 ? conversationClientState2.unreadTicketsCount : 0, (1048574 & 65536) != 0 ? conversationClientState2.floatingIndicatorState : FloatingIndicatorState.None.INSTANCE, (1048574 & 131072) != 0 ? conversationClientState2.newMessageId : null, (1048574 & 262144) != 0 ? conversationClientState2.isConversationScrolled : false, (1048574 & 524288) != 0 ? conversationClientState2.dismissedPrivacyNotice : false)));
    }
}
