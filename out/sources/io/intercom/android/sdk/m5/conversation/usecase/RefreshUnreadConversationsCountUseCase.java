package io.intercom.android.sdk.m5.conversation.usecase;

import Aa.c;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.api.MessengerApi;
import io.intercom.android.sdk.m5.conversation.states.ConversationClientState;
import io.intercom.android.sdk.m5.conversation.states.LaunchMode;
import io.intercom.android.sdk.m5.data.CommonRepository;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.models.Config;
import io.intercom.android.sdk.models.UsersResponse;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.flow.q;
import p293xa.r;

/* JADX INFO: compiled from: RefreshUnreadConversationsCountUseCase.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class RefreshUnreadConversationsCountUseCase {
    public static final int $stable = 8;
    private final CommonRepository commonRepository;
    private final IntercomDataLayer intercomDataLayer;

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.usecase.RefreshUnreadConversationsCountUseCase$invoke$1, reason: invalid class name */
    /* JADX INFO: compiled from: RefreshUnreadConversationsCountUseCase.kt */
    @c(c = "io.intercom.android.sdk.m5.conversation.usecase.RefreshUnreadConversationsCountUseCase", f = "RefreshUnreadConversationsCountUseCase.kt", l = {21}, m = "invoke")
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
            return RefreshUnreadConversationsCountUseCase.this.invoke(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RefreshUnreadConversationsCountUseCase() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object invoke(q<ConversationClientState> qVar, kotlin.coroutines.c<? super r> cVar) {
        AnonymousClass1 anonymousClass1;
        RefreshUnreadConversationsCountUseCase refreshUnreadConversationsCountUseCase;
        q<ConversationClientState> qVar2;
        ConversationClientState value;
        ConversationClientState conversationClientState;
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
        Object objFetchUnreadCounts = anonymousClass1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = anonymousClass1.label;
        if (i11 == 0) {
            b.b(objFetchUnreadCounts);
            if (qVar.getValue().getLaunchMode() == LaunchMode.PROGRAMMATIC) {
                CommonRepository commonRepository = this.commonRepository;
                anonymousClass1.L$0 = this;
                anonymousClass1.L$1 = qVar;
                anonymousClass1.label = 1;
                objFetchUnreadCounts = commonRepository.fetchUnreadCounts(anonymousClass1);
                if (objFetchUnreadCounts == coroutineSingletons) {
                    return coroutineSingletons;
                }
                refreshUnreadConversationsCountUseCase = this;
                qVar2 = qVar;
            }
            return r.f47939a;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        qVar2 = (q) anonymousClass1.L$1;
        refreshUnreadConversationsCountUseCase = (RefreshUnreadConversationsCountUseCase) anonymousClass1.L$0;
        b.b(objFetchUnreadCounts);
        UsersResponse usersResponse = (UsersResponse) objFetchUnreadCounts;
        if (usersResponse == null) {
            return r.f47939a;
        }
        IntercomDataLayer intercomDataLayer = refreshUnreadConversationsCountUseCase.intercomDataLayer;
        Config config = usersResponse.getConfig();
        i.d(config, "getConfig(...)");
        intercomDataLayer.updateConfig(config);
        do {
            value = qVar2.getValue();
            conversationClientState = value;
        } while (!qVar2.d(value, conversationClientState.copy((1048574 & 1) != 0 ? conversationClientState.pendingMessages : null, (1048574 & 2) != 0 ? conversationClientState.conversation : null, (1048574 & 4) != 0 ? conversationClientState.conversationId : null, (1048574 & 8) != 0 ? conversationClientState.currentlyTypingState : null, (1048574 & 16) != 0 ? conversationClientState.composerState : null, (1048574 & 32) != 0 ? conversationClientState.bottomSheetState : null, (1048574 & 64) != 0 ? conversationClientState.launchMode : null, (1048574 & 128) != 0 ? conversationClientState.lastNetworkCall : null, (1048574 & 256) != 0 ? conversationClientState.articleMetadata : null, (1048574 & 512) != 0 ? conversationClientState.networkState : null, (1048574 & 1024) != 0 ? conversationClientState.failedAttributeIdentifiers : null, (1048574 & 2048) != 0 ? conversationClientState.loadingAttributeIdentifiers : null, (1048574 & 4096) != 0 ? conversationClientState.finStreamingData : null, (1048574 & 8192) != 0 ? conversationClientState.openMessengerResponse : null, (1048574 & 16384) != 0 ? conversationClientState.unreadConversationsCount : usersResponse.getUnreadConversations().getUnreadConversationsCount(), (1048574 & 32768) != 0 ? conversationClientState.unreadTicketsCount : usersResponse.getUnreadTickets().getTotalCount(), (1048574 & 65536) != 0 ? conversationClientState.floatingIndicatorState : null, (1048574 & 131072) != 0 ? conversationClientState.newMessageId : null, (1048574 & 262144) != 0 ? conversationClientState.isConversationScrolled : false, (1048574 & 524288) != 0 ? conversationClientState.dismissedPrivacyNotice : false)));
        return r.f47939a;
    }

    public RefreshUnreadConversationsCountUseCase(CommonRepository commonRepository, IntercomDataLayer intercomDataLayer) {
        i.e(commonRepository, "commonRepository");
        i.e(intercomDataLayer, "intercomDataLayer");
        this.commonRepository = commonRepository;
        this.intercomDataLayer = intercomDataLayer;
    }

    public /* synthetic */ RefreshUnreadConversationsCountUseCase(CommonRepository commonRepository, IntercomDataLayer intercomDataLayer, int i10, e eVar) {
        if ((i10 & 1) != 0) {
            MessengerApi messengerApi = Injector.get().getMessengerApi();
            i.d(messengerApi, "getMessengerApi(...)");
            IntercomDataLayer dataLayer = Injector.get().getDataLayer();
            i.d(dataLayer, "getDataLayer(...)");
            commonRepository = new CommonRepository(messengerApi, dataLayer);
        }
        this(commonRepository, (i10 & 2) != 0 ? Injector.get().getDataLayer() : intercomDataLayer);
    }
}
