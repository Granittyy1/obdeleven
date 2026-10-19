package io.intercom.android.sdk.m5.conversation.usecase;

import Aa.c;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.m5.conversation.data.ConversationRepository;
import io.intercom.android.sdk.m5.conversation.states.ConversationClientState;
import io.intercom.android.sdk.models.Attribute;
import io.intercom.android.sdk.models.Conversation;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.flow.q;
import p293xa.r;

/* JADX INFO: compiled from: SubmitAttributeUseCase.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class SubmitAttributeUseCase {
    public static final int $stable = 8;
    private final ConversationRepository conversationRepository;

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.usecase.SubmitAttributeUseCase$invoke$1, reason: invalid class name */
    /* JADX INFO: compiled from: SubmitAttributeUseCase.kt */
    @c(c = "io.intercom.android.sdk.m5.conversation.usecase.SubmitAttributeUseCase", f = "SubmitAttributeUseCase.kt", l = {27}, m = "invoke")
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
            return SubmitAttributeUseCase.this.invoke(null, null, null, this);
        }
    }

    public SubmitAttributeUseCase(ConversationRepository conversationRepository) {
        i.e(conversationRepository, "conversationRepository");
        this.conversationRepository = conversationRepository;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    public final Object invoke(q<ConversationClientState> qVar, Attribute attribute, String str, kotlin.coroutines.c<? super r> cVar) {
        AnonymousClass1 anonymousClass1;
        ConversationClientState value;
        ConversationClientState conversationClientState;
        ArrayList arrayListD0;
        ArrayList arrayList;
        q<ConversationClientState> qVar2;
        Attribute attribute2;
        ConversationClientState value2;
        ConversationClientState conversationClientState2;
        ArrayList arrayListD1;
        ArrayList arrayList2;
        ConversationClientState value3;
        ConversationClientState conversationClientState3;
        ArrayList arrayList3;
        ArrayList arrayList4;
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
        AnonymousClass1 anonymousClass2 = anonymousClass1;
        Object objSubmitForm = anonymousClass2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = anonymousClass2.label;
        if (i11 == 0) {
            b.b(objSubmitForm);
            Conversation conversation = qVar.getValue().getConversation();
            if (conversation == null) {
                return r.f47939a;
            }
            do {
                value = qVar.getValue();
                conversationClientState = value;
                arrayListD0 = kotlin.collections.q.d0(conversationClientState.getLoadingAttributeIdentifiers(), attribute.getIdentifier());
                List<String> failedAttributeIdentifiers = conversationClientState.getFailedAttributeIdentifiers();
                arrayList = new ArrayList();
                for (Object obj : failedAttributeIdentifiers) {
                    if (!i.a((String) obj, attribute.getIdentifier())) {
                        arrayList.add(obj);
                    }
                }
            } while (!qVar.d(value, conversationClientState.copy((1048574 & 1) != 0 ? conversationClientState.pendingMessages : null, (1048574 & 2) != 0 ? conversationClientState.conversation : null, (1048574 & 4) != 0 ? conversationClientState.conversationId : null, (1048574 & 8) != 0 ? conversationClientState.currentlyTypingState : null, (1048574 & 16) != 0 ? conversationClientState.composerState : null, (1048574 & 32) != 0 ? conversationClientState.bottomSheetState : null, (1048574 & 64) != 0 ? conversationClientState.launchMode : null, (1048574 & 128) != 0 ? conversationClientState.lastNetworkCall : null, (1048574 & 256) != 0 ? conversationClientState.articleMetadata : null, (1048574 & 512) != 0 ? conversationClientState.networkState : null, (1048574 & 1024) != 0 ? conversationClientState.failedAttributeIdentifiers : arrayList, (1048574 & 2048) != 0 ? conversationClientState.loadingAttributeIdentifiers : arrayListD0, (1048574 & 4096) != 0 ? conversationClientState.finStreamingData : null, (1048574 & 8192) != 0 ? conversationClientState.openMessengerResponse : null, (1048574 & 16384) != 0 ? conversationClientState.unreadConversationsCount : 0, (1048574 & 32768) != 0 ? conversationClientState.unreadTicketsCount : 0, (1048574 & 65536) != 0 ? conversationClientState.floatingIndicatorState : null, (1048574 & 131072) != 0 ? conversationClientState.newMessageId : null, (1048574 & 262144) != 0 ? conversationClientState.isConversationScrolled : false, (1048574 & 524288) != 0 ? conversationClientState.dismissedPrivacyNotice : false)));
            ConversationRepository conversationRepository = this.conversationRepository;
            String id = conversation.getId();
            String identifier = attribute.getIdentifier();
            String value4 = attribute.getValue();
            if (value4 == null) {
                value4 = "";
            }
            String type = attribute.getType();
            anonymousClass2.L$0 = qVar;
            anonymousClass2.L$1 = attribute;
            anonymousClass2.label = 1;
            objSubmitForm = conversationRepository.submitForm(id, str, identifier, value4, type, anonymousClass2);
            if (objSubmitForm == coroutineSingletons) {
                return coroutineSingletons;
            }
            qVar2 = qVar;
            attribute2 = attribute;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Attribute attribute3 = (Attribute) anonymousClass2.L$1;
            q<ConversationClientState> qVar3 = (q) anonymousClass2.L$0;
            b.b(objSubmitForm);
            attribute2 = attribute3;
            qVar2 = qVar3;
        }
        NetworkResponse networkResponse = (NetworkResponse) objSubmitForm;
        if (networkResponse instanceof NetworkResponse.Success) {
            do {
                value3 = qVar2.getValue();
                conversationClientState3 = value3;
                List<String> failedAttributeIdentifiers2 = conversationClientState3.getFailedAttributeIdentifiers();
                arrayList3 = new ArrayList();
                for (Object obj2 : failedAttributeIdentifiers2) {
                    if (!i.a((String) obj2, attribute2.getIdentifier())) {
                        arrayList3.add(obj2);
                    }
                }
                List<String> loadingAttributeIdentifiers = conversationClientState3.getLoadingAttributeIdentifiers();
                arrayList4 = new ArrayList();
                for (Object obj3 : loadingAttributeIdentifiers) {
                    if (!i.a((String) obj3, attribute2.getIdentifier())) {
                        arrayList4.add(obj3);
                    }
                }
            } while (!qVar2.d(value3, conversationClientState3.copy((1048574 & 1) != 0 ? conversationClientState3.pendingMessages : null, (1048574 & 2) != 0 ? conversationClientState3.conversation : (Conversation) ((NetworkResponse.Success) networkResponse).getBody(), (1048574 & 4) != 0 ? conversationClientState3.conversationId : null, (1048574 & 8) != 0 ? conversationClientState3.currentlyTypingState : null, (1048574 & 16) != 0 ? conversationClientState3.composerState : null, (1048574 & 32) != 0 ? conversationClientState3.bottomSheetState : null, (1048574 & 64) != 0 ? conversationClientState3.launchMode : null, (1048574 & 128) != 0 ? conversationClientState3.lastNetworkCall : null, (1048574 & 256) != 0 ? conversationClientState3.articleMetadata : null, (1048574 & 512) != 0 ? conversationClientState3.networkState : null, (1048574 & 1024) != 0 ? conversationClientState3.failedAttributeIdentifiers : arrayList3, (1048574 & 2048) != 0 ? conversationClientState3.loadingAttributeIdentifiers : arrayList4, (1048574 & 4096) != 0 ? conversationClientState3.finStreamingData : null, (1048574 & 8192) != 0 ? conversationClientState3.openMessengerResponse : null, (1048574 & 16384) != 0 ? conversationClientState3.unreadConversationsCount : 0, (1048574 & 32768) != 0 ? conversationClientState3.unreadTicketsCount : 0, (1048574 & 65536) != 0 ? conversationClientState3.floatingIndicatorState : null, (1048574 & 131072) != 0 ? conversationClientState3.newMessageId : null, (1048574 & 262144) != 0 ? conversationClientState3.isConversationScrolled : false, (1048574 & 524288) != 0 ? conversationClientState3.dismissedPrivacyNotice : false)));
        } else {
            if (!(networkResponse instanceof NetworkResponse.ClientError) && !(networkResponse instanceof NetworkResponse.NetworkError) && !(networkResponse instanceof NetworkResponse.ServerError)) {
                throw new NoWhenBranchMatchedException();
            }
            do {
                value2 = qVar2.getValue();
                conversationClientState2 = value2;
                arrayListD1 = kotlin.collections.q.d0(conversationClientState2.getFailedAttributeIdentifiers(), attribute2.getIdentifier());
                List<String> loadingAttributeIdentifiers2 = conversationClientState2.getLoadingAttributeIdentifiers();
                arrayList2 = new ArrayList();
                for (Object obj4 : loadingAttributeIdentifiers2) {
                    if (!i.a((String) obj4, attribute2.getIdentifier())) {
                        arrayList2.add(obj4);
                    }
                }
            } while (!qVar2.d(value2, conversationClientState2.copy((1048574 & 1) != 0 ? conversationClientState2.pendingMessages : null, (1048574 & 2) != 0 ? conversationClientState2.conversation : null, (1048574 & 4) != 0 ? conversationClientState2.conversationId : null, (1048574 & 8) != 0 ? conversationClientState2.currentlyTypingState : null, (1048574 & 16) != 0 ? conversationClientState2.composerState : null, (1048574 & 32) != 0 ? conversationClientState2.bottomSheetState : null, (1048574 & 64) != 0 ? conversationClientState2.launchMode : null, (1048574 & 128) != 0 ? conversationClientState2.lastNetworkCall : null, (1048574 & 256) != 0 ? conversationClientState2.articleMetadata : null, (1048574 & 512) != 0 ? conversationClientState2.networkState : null, (1048574 & 1024) != 0 ? conversationClientState2.failedAttributeIdentifiers : arrayListD1, (1048574 & 2048) != 0 ? conversationClientState2.loadingAttributeIdentifiers : arrayList2, (1048574 & 4096) != 0 ? conversationClientState2.finStreamingData : null, (1048574 & 8192) != 0 ? conversationClientState2.openMessengerResponse : null, (1048574 & 16384) != 0 ? conversationClientState2.unreadConversationsCount : 0, (1048574 & 32768) != 0 ? conversationClientState2.unreadTicketsCount : 0, (1048574 & 65536) != 0 ? conversationClientState2.floatingIndicatorState : null, (1048574 & 131072) != 0 ? conversationClientState2.newMessageId : null, (1048574 & 262144) != 0 ? conversationClientState2.isConversationScrolled : false, (1048574 & 524288) != 0 ? conversationClientState2.dismissedPrivacyNotice : false)));
        }
        return r.f47939a;
    }
}
