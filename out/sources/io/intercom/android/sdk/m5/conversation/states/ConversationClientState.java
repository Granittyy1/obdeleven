package io.intercom.android.sdk.m5.conversation.states;

import Z3.o;
import androidx.compose.animation.D;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.helpcenter.articles.ArticleMetadata;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.OpenMessengerResponse;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.ui.common.StringProvider;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlin.collections.y;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import p005a4.p;
import p005a4.q;

/* JADX INFO: compiled from: ConversationClientState.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ConversationClientState {
    public static final int $stable = 8;
    private final ArticleMetadata articleMetadata;
    private final BottomSheetState bottomSheetState;
    private final ComposerState composerState;
    private final Conversation conversation;
    private final String conversationId;
    private final CurrentlyTypingState currentlyTypingState;
    private final boolean dismissedPrivacyNotice;
    private final List<String> failedAttributeIdentifiers;
    private final FinStreamingData finStreamingData;
    private final FloatingIndicatorState floatingIndicatorState;
    private final boolean isConversationScrolled;
    private final NetworkResponse<Object> lastNetworkCall;
    private final LaunchMode launchMode;
    private final List<String> loadingAttributeIdentifiers;
    private final NetworkState networkState;
    private final String newMessageId;
    private final OpenMessengerResponse openMessengerResponse;
    private final Map<String, PendingMessage> pendingMessages;
    private final int unreadConversationsCount;
    private final int unreadTicketsCount;

    public ConversationClientState() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, null, null, false, false, 1048575, null);
    }

    public final Map<String, PendingMessage> component1() {
        return this.pendingMessages;
    }

    public final NetworkState component10() {
        return this.networkState;
    }

    public final List<String> component11() {
        return this.failedAttributeIdentifiers;
    }

    public final List<String> component12() {
        return this.loadingAttributeIdentifiers;
    }

    public final FinStreamingData component13() {
        return this.finStreamingData;
    }

    public final OpenMessengerResponse component14() {
        return this.openMessengerResponse;
    }

    public final int component15() {
        return this.unreadConversationsCount;
    }

    public final int component16() {
        return this.unreadTicketsCount;
    }

    public final FloatingIndicatorState component17() {
        return this.floatingIndicatorState;
    }

    public final String component18() {
        return this.newMessageId;
    }

    public final boolean component19() {
        return this.isConversationScrolled;
    }

    public final Conversation component2() {
        return this.conversation;
    }

    public final boolean component20() {
        return this.dismissedPrivacyNotice;
    }

    public final String component3() {
        return this.conversationId;
    }

    public final CurrentlyTypingState component4() {
        return this.currentlyTypingState;
    }

    public final ComposerState component5() {
        return this.composerState;
    }

    public final BottomSheetState component6() {
        return this.bottomSheetState;
    }

    public final LaunchMode component7() {
        return this.launchMode;
    }

    public final NetworkResponse<Object> component8() {
        return this.lastNetworkCall;
    }

    public final ArticleMetadata component9() {
        return this.articleMetadata;
    }

    public final ConversationClientState copy(Map<String, PendingMessage> pendingMessages, Conversation conversation, String str, CurrentlyTypingState currentlyTypingState, ComposerState composerState, BottomSheetState bottomSheetState, LaunchMode launchMode, NetworkResponse<? extends Object> networkResponse, ArticleMetadata articleMetadata, NetworkState networkState, List<String> failedAttributeIdentifiers, List<String> loadingAttributeIdentifiers, FinStreamingData finStreamingData, OpenMessengerResponse openMessengerResponse, int i10, int i11, FloatingIndicatorState floatingIndicatorState, String str2, boolean z10, boolean z11) {
        i.e(pendingMessages, "pendingMessages");
        i.e(currentlyTypingState, "currentlyTypingState");
        i.e(composerState, "composerState");
        i.e(bottomSheetState, "bottomSheetState");
        i.e(launchMode, "launchMode");
        i.e(networkState, "networkState");
        i.e(failedAttributeIdentifiers, "failedAttributeIdentifiers");
        i.e(loadingAttributeIdentifiers, "loadingAttributeIdentifiers");
        i.e(finStreamingData, "finStreamingData");
        i.e(floatingIndicatorState, "floatingIndicatorState");
        return new ConversationClientState(pendingMessages, conversation, str, currentlyTypingState, composerState, bottomSheetState, launchMode, networkResponse, articleMetadata, networkState, failedAttributeIdentifiers, loadingAttributeIdentifiers, finStreamingData, openMessengerResponse, i10, i11, floatingIndicatorState, str2, z10, z11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConversationClientState)) {
            return false;
        }
        ConversationClientState conversationClientState = (ConversationClientState) obj;
        return i.a(this.pendingMessages, conversationClientState.pendingMessages) && i.a(this.conversation, conversationClientState.conversation) && i.a(this.conversationId, conversationClientState.conversationId) && i.a(this.currentlyTypingState, conversationClientState.currentlyTypingState) && i.a(this.composerState, conversationClientState.composerState) && i.a(this.bottomSheetState, conversationClientState.bottomSheetState) && this.launchMode == conversationClientState.launchMode && i.a(this.lastNetworkCall, conversationClientState.lastNetworkCall) && i.a(this.articleMetadata, conversationClientState.articleMetadata) && i.a(this.networkState, conversationClientState.networkState) && i.a(this.failedAttributeIdentifiers, conversationClientState.failedAttributeIdentifiers) && i.a(this.loadingAttributeIdentifiers, conversationClientState.loadingAttributeIdentifiers) && i.a(this.finStreamingData, conversationClientState.finStreamingData) && i.a(this.openMessengerResponse, conversationClientState.openMessengerResponse) && this.unreadConversationsCount == conversationClientState.unreadConversationsCount && this.unreadTicketsCount == conversationClientState.unreadTicketsCount && i.a(this.floatingIndicatorState, conversationClientState.floatingIndicatorState) && i.a(this.newMessageId, conversationClientState.newMessageId) && this.isConversationScrolled == conversationClientState.isConversationScrolled && this.dismissedPrivacyNotice == conversationClientState.dismissedPrivacyNotice;
    }

    public final ArticleMetadata getArticleMetadata() {
        return this.articleMetadata;
    }

    public final BottomSheetState getBottomSheetState() {
        return this.bottomSheetState;
    }

    public final ComposerState getComposerState() {
        return this.composerState;
    }

    public final Conversation getConversation() {
        return this.conversation;
    }

    public final String getConversationId() {
        return this.conversationId;
    }

    public final CurrentlyTypingState getCurrentlyTypingState() {
        return this.currentlyTypingState;
    }

    public final boolean getDismissedPrivacyNotice() {
        return this.dismissedPrivacyNotice;
    }

    public final List<String> getFailedAttributeIdentifiers() {
        return this.failedAttributeIdentifiers;
    }

    public final FinStreamingData getFinStreamingData() {
        return this.finStreamingData;
    }

    public final FloatingIndicatorState getFloatingIndicatorState() {
        return this.floatingIndicatorState;
    }

    public final NetworkResponse<Object> getLastNetworkCall() {
        return this.lastNetworkCall;
    }

    public final LaunchMode getLaunchMode() {
        return this.launchMode;
    }

    public final List<String> getLoadingAttributeIdentifiers() {
        return this.loadingAttributeIdentifiers;
    }

    public final NetworkState getNetworkState() {
        return this.networkState;
    }

    public final String getNewMessageId() {
        return this.newMessageId;
    }

    public final OpenMessengerResponse getOpenMessengerResponse() {
        return this.openMessengerResponse;
    }

    public final Map<String, PendingMessage> getPendingMessages() {
        return this.pendingMessages;
    }

    public final int getUnreadConversationsCount() {
        return this.unreadConversationsCount;
    }

    public final int getUnreadTicketsCount() {
        return this.unreadTicketsCount;
    }

    public final boolean hasUserSentAMessage$intercom_sdk_base_release() {
        List<Part> listParts;
        boolean z10 = true;
        if (!this.pendingMessages.isEmpty()) {
            return true;
        }
        Conversation conversation = this.conversation;
        if (conversation == null || (listParts = conversation.parts()) == null) {
            return false;
        }
        List<Part> list = listParts;
        if ((list instanceof Collection) && list.isEmpty()) {
            z10 = false;
        } else {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((Part) it.next()).isUser()) {
                }
            }
            z10 = false;
        }
        return z10;
    }

    public int hashCode() {
        int iHashCode = this.pendingMessages.hashCode() * 31;
        Conversation conversation = this.conversation;
        int iHashCode2 = (iHashCode + (conversation == null ? 0 : conversation.hashCode())) * 31;
        String str = this.conversationId;
        int iHashCode3 = (this.launchMode.hashCode() + ((this.bottomSheetState.hashCode() + ((this.composerState.hashCode() + ((this.currentlyTypingState.hashCode() + ((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31)) * 31)) * 31;
        NetworkResponse<Object> networkResponse = this.lastNetworkCall;
        int iHashCode4 = (iHashCode3 + (networkResponse == null ? 0 : networkResponse.hashCode())) * 31;
        ArticleMetadata articleMetadata = this.articleMetadata;
        int iHashCode5 = (this.finStreamingData.hashCode() + p.d(p.d((this.networkState.hashCode() + ((iHashCode4 + (articleMetadata == null ? 0 : articleMetadata.hashCode())) * 31)) * 31, 31, this.failedAttributeIdentifiers), 31, this.loadingAttributeIdentifiers)) * 31;
        OpenMessengerResponse openMessengerResponse = this.openMessengerResponse;
        int iHashCode6 = (this.floatingIndicatorState.hashCode() + q.b(this.unreadTicketsCount, q.b(this.unreadConversationsCount, (iHashCode5 + (openMessengerResponse == null ? 0 : openMessengerResponse.hashCode())) * 31, 31), 31)) * 31;
        String str2 = this.newMessageId;
        return Boolean.hashCode(this.dismissedPrivacyNotice) + D.b((iHashCode6 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.isConversationScrolled);
    }

    public final boolean isConversationScrolled() {
        return this.isConversationScrolled;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ConversationClientState(pendingMessages=");
        sb2.append(this.pendingMessages);
        sb2.append(", conversation=");
        sb2.append(this.conversation);
        sb2.append(", conversationId=");
        sb2.append(this.conversationId);
        sb2.append(", currentlyTypingState=");
        sb2.append(this.currentlyTypingState);
        sb2.append(", composerState=");
        sb2.append(this.composerState);
        sb2.append(", bottomSheetState=");
        sb2.append(this.bottomSheetState);
        sb2.append(", launchMode=");
        sb2.append(this.launchMode);
        sb2.append(", lastNetworkCall=");
        sb2.append(this.lastNetworkCall);
        sb2.append(", articleMetadata=");
        sb2.append(this.articleMetadata);
        sb2.append(", networkState=");
        sb2.append(this.networkState);
        sb2.append(", failedAttributeIdentifiers=");
        sb2.append(this.failedAttributeIdentifiers);
        sb2.append(", loadingAttributeIdentifiers=");
        sb2.append(this.loadingAttributeIdentifiers);
        sb2.append(", finStreamingData=");
        sb2.append(this.finStreamingData);
        sb2.append(", openMessengerResponse=");
        sb2.append(this.openMessengerResponse);
        sb2.append(", unreadConversationsCount=");
        sb2.append(this.unreadConversationsCount);
        sb2.append(", unreadTicketsCount=");
        sb2.append(this.unreadTicketsCount);
        sb2.append(", floatingIndicatorState=");
        sb2.append(this.floatingIndicatorState);
        sb2.append(", newMessageId=");
        sb2.append(this.newMessageId);
        sb2.append(", isConversationScrolled=");
        sb2.append(this.isConversationScrolled);
        sb2.append(", dismissedPrivacyNotice=");
        return o.d(sb2, this.dismissedPrivacyNotice, ')');
    }

    public ConversationClientState(Map<String, PendingMessage> pendingMessages, Conversation conversation, String str, CurrentlyTypingState currentlyTypingState, ComposerState composerState, BottomSheetState bottomSheetState, LaunchMode launchMode, NetworkResponse<? extends Object> networkResponse, ArticleMetadata articleMetadata, NetworkState networkState, List<String> failedAttributeIdentifiers, List<String> loadingAttributeIdentifiers, FinStreamingData finStreamingData, OpenMessengerResponse openMessengerResponse, int i10, int i11, FloatingIndicatorState floatingIndicatorState, String str2, boolean z10, boolean z11) {
        i.e(pendingMessages, "pendingMessages");
        i.e(currentlyTypingState, "currentlyTypingState");
        i.e(composerState, "composerState");
        i.e(bottomSheetState, "bottomSheetState");
        i.e(launchMode, "launchMode");
        i.e(networkState, "networkState");
        i.e(failedAttributeIdentifiers, "failedAttributeIdentifiers");
        i.e(loadingAttributeIdentifiers, "loadingAttributeIdentifiers");
        i.e(finStreamingData, "finStreamingData");
        i.e(floatingIndicatorState, "floatingIndicatorState");
        this.pendingMessages = pendingMessages;
        this.conversation = conversation;
        this.conversationId = str;
        this.currentlyTypingState = currentlyTypingState;
        this.composerState = composerState;
        this.bottomSheetState = bottomSheetState;
        this.launchMode = launchMode;
        this.lastNetworkCall = networkResponse;
        this.articleMetadata = articleMetadata;
        this.networkState = networkState;
        this.failedAttributeIdentifiers = failedAttributeIdentifiers;
        this.loadingAttributeIdentifiers = loadingAttributeIdentifiers;
        this.finStreamingData = finStreamingData;
        this.openMessengerResponse = openMessengerResponse;
        this.unreadConversationsCount = i10;
        this.unreadTicketsCount = i11;
        this.floatingIndicatorState = floatingIndicatorState;
        this.newMessageId = str2;
        this.isConversationScrolled = z10;
        this.dismissedPrivacyNotice = z11;
    }

    public ConversationClientState(Map map, Conversation conversation, String str, CurrentlyTypingState currentlyTypingState, ComposerState composerState, BottomSheetState bottomSheetState, LaunchMode launchMode, NetworkResponse networkResponse, ArticleMetadata articleMetadata, NetworkState networkState, List list, List list2, FinStreamingData finStreamingData, OpenMessengerResponse openMessengerResponse, int i10, int i11, FloatingIndicatorState floatingIndicatorState, String str2, boolean z10, boolean z11, int i12, e eVar) {
        CurrentlyTypingState currentlyTypingState2;
        ComposerState textInput;
        Map mapP = (i12 & 1) != 0 ? y.p() : map;
        Conversation conversation2 = (i12 & 2) != 0 ? null : conversation;
        String str3 = (i12 & 4) != 0 ? null : str;
        if ((i12 & 8) != 0) {
            currentlyTypingState2 = new CurrentlyTypingState(null, false, null, TypingIndicatorType.NONE, 7, null);
        } else {
            currentlyTypingState2 = currentlyTypingState;
        }
        if ((i12 & 16) != 0) {
            textInput = new ComposerState.TextInput("", new StringProvider.StringRes(R.string.intercom_reply_to_conversation, null, 2, null), false, 4, null);
        } else {
            textInput = composerState;
        }
        this(mapP, conversation2, str3, currentlyTypingState2, textInput, (i12 & 32) != 0 ? BottomSheetState.Empty.INSTANCE : bottomSheetState, (i12 & 64) != 0 ? LaunchMode.CLASSIC : launchMode, (i12 & 128) != 0 ? null : networkResponse, (i12 & 256) != 0 ? null : articleMetadata, (i12 & 512) != 0 ? NetworkState.Connected.INSTANCE : networkState, (i12 & 1024) != 0 ? EmptyList.f42983b : list, (i12 & 2048) != 0 ? EmptyList.f42983b : list2, (i12 & 4096) != 0 ? new FinStreamingData(false, EmptyList.f42983b, "", 0) : finStreamingData, (i12 & 8192) != 0 ? null : openMessengerResponse, (i12 & 16384) != 0 ? 0 : i10, (i12 & 32768) != 0 ? 0 : i11, (i12 & 65536) != 0 ? FloatingIndicatorState.None.INSTANCE : floatingIndicatorState, (i12 & 131072) != 0 ? null : str2, (i12 & 262144) != 0 ? false : z10, (i12 & 524288) == 0 ? z11 : false);
    }
}
