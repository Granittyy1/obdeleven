package io.intercom.android.sdk.m5.conversation.usecase;

import Aa.c;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.conversation.states.ConversationClientState;
import io.intercom.android.sdk.m5.conversation.states.CurrentlyTypingState;
import io.intercom.android.sdk.m5.conversation.states.TypingIndicatorType;
import io.intercom.android.sdk.models.Avatar;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.I;
import kotlinx.coroutines.flow.q;
import me.zhanghai.android.materialprogressbar.R;
import p293xa.r;

/* JADX INFO: compiled from: ShowAdminIsTypingUseCase.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ShowAdminIsTypingUseCase {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.usecase.ShowAdminIsTypingUseCase$sendAdminIndicator$1, reason: invalid class name */
    /* JADX INFO: compiled from: ShowAdminIsTypingUseCase.kt */
    @c(c = "io.intercom.android.sdk.m5.conversation.usecase.ShowAdminIsTypingUseCase", f = "ShowAdminIsTypingUseCase.kt", l = {R.styleable.AppCompatTheme_checkedTextViewStyle}, m = "sendAdminIndicator")
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ShowAdminIsTypingUseCase.this.sendAdminIndicator(null, null, false, false, this);
        }
    }

    public static /* synthetic */ Object invoke$default(ShowAdminIsTypingUseCase showAdminIsTypingUseCase, q qVar, Avatar avatar, boolean z10, boolean z11, kotlin.coroutines.c cVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        boolean z12 = z10;
        if ((i10 & 8) != 0) {
            z11 = true;
        }
        return showAdminIsTypingUseCase.invoke(qVar, avatar, z12, z11, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object sendAdminIndicator(q<ConversationClientState> qVar, Avatar avatar, boolean z10, boolean z11, kotlin.coroutines.c<? super r> cVar) {
        AnonymousClass1 anonymousClass1;
        ConversationClientState value;
        ConversationClientState conversationClientState;
        Object value2;
        ConversationClientState conversationClientState2;
        q qVar2 = qVar;
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
            if (qVar.getValue().getCurrentlyTypingState().getUserType() != TypingIndicatorType.NONE) {
                return r.f47939a;
            }
            do {
                value = qVar.getValue();
                conversationClientState = value;
            } while (!qVar2.d(value, conversationClientState.copy((1048574 & 1) != 0 ? conversationClientState.pendingMessages : null, (1048574 & 2) != 0 ? conversationClientState.conversation : null, (1048574 & 4) != 0 ? conversationClientState.conversationId : null, (1048574 & 8) != 0 ? conversationClientState.currentlyTypingState : new CurrentlyTypingState(new AvatarWrapper(avatar, z10), z11, null, TypingIndicatorType.ADMIN, 4, null), (1048574 & 16) != 0 ? conversationClientState.composerState : null, (1048574 & 32) != 0 ? conversationClientState.bottomSheetState : null, (1048574 & 64) != 0 ? conversationClientState.launchMode : null, (1048574 & 128) != 0 ? conversationClientState.lastNetworkCall : null, (1048574 & 256) != 0 ? conversationClientState.articleMetadata : null, (1048574 & 512) != 0 ? conversationClientState.networkState : null, (1048574 & 1024) != 0 ? conversationClientState.failedAttributeIdentifiers : null, (1048574 & 2048) != 0 ? conversationClientState.loadingAttributeIdentifiers : null, (1048574 & 4096) != 0 ? conversationClientState.finStreamingData : null, (1048574 & 8192) != 0 ? conversationClientState.openMessengerResponse : null, (1048574 & 16384) != 0 ? conversationClientState.unreadConversationsCount : 0, (1048574 & 32768) != 0 ? conversationClientState.unreadTicketsCount : 0, (1048574 & 65536) != 0 ? conversationClientState.floatingIndicatorState : null, (1048574 & 131072) != 0 ? conversationClientState.newMessageId : null, (1048574 & 262144) != 0 ? conversationClientState.isConversationScrolled : false, (1048574 & 524288) != 0 ? conversationClientState.dismissedPrivacyNotice : false)));
            anonymousClass1.L$0 = qVar2;
            anonymousClass1.label = 1;
            if (I.b(5000L, anonymousClass1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            qVar2 = (q) anonymousClass1.L$0;
            b.b(obj);
        }
        q qVar3 = qVar2;
        do {
            value2 = qVar3.getValue();
            conversationClientState2 = (ConversationClientState) value2;
        } while (!qVar3.d(value2, conversationClientState2.copy((1048574 & 1) != 0 ? conversationClientState2.pendingMessages : null, (1048574 & 2) != 0 ? conversationClientState2.conversation : null, (1048574 & 4) != 0 ? conversationClientState2.conversationId : null, (1048574 & 8) != 0 ? conversationClientState2.currentlyTypingState : new CurrentlyTypingState(null, false, null, TypingIndicatorType.NONE, 7, null), (1048574 & 16) != 0 ? conversationClientState2.composerState : null, (1048574 & 32) != 0 ? conversationClientState2.bottomSheetState : null, (1048574 & 64) != 0 ? conversationClientState2.launchMode : null, (1048574 & 128) != 0 ? conversationClientState2.lastNetworkCall : null, (1048574 & 256) != 0 ? conversationClientState2.articleMetadata : null, (1048574 & 512) != 0 ? conversationClientState2.networkState : null, (1048574 & 1024) != 0 ? conversationClientState2.failedAttributeIdentifiers : null, (1048574 & 2048) != 0 ? conversationClientState2.loadingAttributeIdentifiers : null, (1048574 & 4096) != 0 ? conversationClientState2.finStreamingData : null, (1048574 & 8192) != 0 ? conversationClientState2.openMessengerResponse : null, (1048574 & 16384) != 0 ? conversationClientState2.unreadConversationsCount : 0, (1048574 & 32768) != 0 ? conversationClientState2.unreadTicketsCount : 0, (1048574 & 65536) != 0 ? conversationClientState2.floatingIndicatorState : null, (1048574 & 131072) != 0 ? conversationClientState2.newMessageId : null, (1048574 & 262144) != 0 ? conversationClientState2.isConversationScrolled : false, (1048574 & 524288) != 0 ? conversationClientState2.dismissedPrivacyNotice : false)));
        return r.f47939a;
    }

    public final Object invoke(q<ConversationClientState> qVar, Avatar avatar, boolean z10, boolean z11, kotlin.coroutines.c<? super r> cVar) {
        Object objSendAdminIndicator = sendAdminIndicator(qVar, avatar, z10, z11 && !z10, cVar);
        return objSendAdminIndicator == CoroutineSingletons.f43038b ? objSendAdminIndicator : r.f47939a;
    }
}
