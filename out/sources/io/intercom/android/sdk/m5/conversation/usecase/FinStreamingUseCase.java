package io.intercom.android.sdk.m5.conversation.usecase;

import Aa.c;
import io.intercom.android.sdk.m5.conversation.data.ParsedNexusEvent;
import io.intercom.android.sdk.m5.conversation.states.ConversationClientState;
import io.intercom.android.sdk.m5.conversation.states.CurrentlyTypingState;
import io.intercom.android.sdk.m5.conversation.states.TypingIndicatorType;
import io.intercom.android.sdk.models.Conversation;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.I;
import kotlinx.coroutines.flow.q;
import p293xa.r;

/* JADX INFO: compiled from: FinStreamingUseCase.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class FinStreamingUseCase {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.usecase.FinStreamingUseCase$invoke$1, reason: invalid class name */
    /* JADX INFO: compiled from: FinStreamingUseCase.kt */
    @c(c = "io.intercom.android.sdk.m5.conversation.usecase.FinStreamingUseCase", f = "FinStreamingUseCase.kt", l = {17}, m = "invoke")
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FinStreamingUseCase.this.invoke(null, null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object invoke(q<ConversationClientState> qVar, ParsedNexusEvent.ConversationNexusEvent.FinStreaming finStreaming, kotlin.coroutines.c<? super r> cVar) {
        AnonymousClass1 anonymousClass1;
        q<ConversationClientState> qVar2;
        ParsedNexusEvent.ConversationNexusEvent.FinStreaming finStreaming2;
        ConversationClientState value;
        ConversationClientState conversationClientState;
        Conversation conversation;
        if (cVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) cVar;
            int i10 = anonymousClass1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i10 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(cVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(cVar);
        }
        Object obj = anonymousClass1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = anonymousClass1.label;
        if (i11 == 0) {
            b.b(obj);
            qVar2 = qVar;
            anonymousClass1.L$0 = qVar2;
            anonymousClass1.L$1 = finStreaming;
            anonymousClass1.label = 1;
            if (I.b(100L, anonymousClass1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            finStreaming2 = finStreaming;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            finStreaming2 = (ParsedNexusEvent.ConversationNexusEvent.FinStreaming) anonymousClass1.L$1;
            q<ConversationClientState> qVar3 = (q) anonymousClass1.L$0;
            b.b(obj);
            qVar2 = qVar3;
        }
        if (finStreaming2.getTokenSequenceIndex() < qVar2.getValue().getFinStreamingData().getTokenSequenceIndex()) {
            return r.f47939a;
        }
        do {
            value = qVar2.getValue();
            conversationClientState = value;
            conversation = conversationClientState.getConversation();
        } while (!qVar2.d(value, conversationClientState.copy((1048574 & 1) != 0 ? conversationClientState.pendingMessages : null, (1048574 & 2) != 0 ? conversationClientState.conversation : conversation != null ? conversation.copy((983039 & 1) != 0 ? conversation.id : null, (983039 & 2) != 0 ? conversation.isRead : false, (983039 & 4) != 0 ? conversation.participantBuilderList : null, (983039 & 8) != 0 ? conversation.partBuilderList : null, (983039 & 16) != 0 ? conversation.groupConversationParticipantIds : null, (983039 & 32) != 0 ? conversation.lastParticipatingAdminBuilder : null, (983039 & 64) != 0 ? conversation.composerState : null, (983039 & 128) != 0 ? conversation.preventEndUserReplies : false, (983039 & 256) != 0 ? conversation.inboundConversationsDisabled : false, (983039 & 512) != 0 ? conversation.notificationStatus : null, (983039 & 1024) != 0 ? conversation.state : null, (983039 & 2048) != 0 ? conversation.isInbound : false, (983039 & 4096) != 0 ? conversation.ticket : null, (983039 & 8192) != 0 ? conversation.uiFlags : null, (983039 & 16384) != 0 ? conversation.header : null, (983039 & 32768) != 0 ? conversation.conversationEndedButton : null, (983039 & 65536) != 0 ? conversation.footerNotice : null, (983039 & 131072) != 0 ? conversation.poweredBy : null, (983039 & 262144) != 0 ? conversation.teamIntro : null, (983039 & 524288) != 0 ? conversation.specialNotice : null) : null, (1048574 & 4) != 0 ? conversationClientState.conversationId : null, (1048574 & 8) != 0 ? conversationClientState.currentlyTypingState : new CurrentlyTypingState(null, false, null, TypingIndicatorType.NONE, 7, null), (1048574 & 16) != 0 ? conversationClientState.composerState : null, (1048574 & 32) != 0 ? conversationClientState.bottomSheetState : null, (1048574 & 64) != 0 ? conversationClientState.launchMode : null, (1048574 & 128) != 0 ? conversationClientState.lastNetworkCall : null, (1048574 & 256) != 0 ? conversationClientState.articleMetadata : null, (1048574 & 512) != 0 ? conversationClientState.networkState : null, (1048574 & 1024) != 0 ? conversationClientState.failedAttributeIdentifiers : null, (1048574 & 2048) != 0 ? conversationClientState.loadingAttributeIdentifiers : null, (1048574 & 4096) != 0 ? conversationClientState.finStreamingData : conversationClientState.getFinStreamingData().copy(true, finStreaming2.getBlocks(), finStreaming2.getClientAssignedUUID(), finStreaming2.getTokenSequenceIndex()), (1048574 & 8192) != 0 ? conversationClientState.openMessengerResponse : null, (1048574 & 16384) != 0 ? conversationClientState.unreadConversationsCount : 0, (1048574 & 32768) != 0 ? conversationClientState.unreadTicketsCount : 0, (1048574 & 65536) != 0 ? conversationClientState.floatingIndicatorState : null, (1048574 & 131072) != 0 ? conversationClientState.newMessageId : null, (1048574 & 262144) != 0 ? conversationClientState.isConversationScrolled : false, (1048574 & 524288) != 0 ? conversationClientState.dismissedPrivacyNotice : false)));
        return r.f47939a;
    }
}
