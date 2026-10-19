package io.intercom.android.sdk.m5.conversation.usecase;

import Aa.c;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.api.MessengerApi;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.m5.conversation.data.GetConversationReason;
import io.intercom.android.sdk.m5.conversation.states.ConversationClientState;
import io.intercom.android.sdk.m5.data.CommonRepository;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.models.OpenMessengerResponse;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.flow.q;
import me.zhanghai.android.materialprogressbar.R;
import p293xa.r;

/* JADX INFO: compiled from: OpenConversationUseCase.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class OpenConversationUseCase {
    public static final int $stable = 8;
    private final CommonRepository commonRepository;
    private final RefreshConversationUseCase refreshConversationUseCase;
    private final RefreshUnreadConversationsCountUseCase refreshUnreadConversationsCountUseCase;

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.usecase.OpenConversationUseCase$invoke$1, reason: invalid class name */
    /* JADX INFO: compiled from: OpenConversationUseCase.kt */
    @c(c = "io.intercom.android.sdk.m5.conversation.usecase.OpenConversationUseCase", f = "OpenConversationUseCase.kt", l = {24, R.styleable.AppCompatTheme_borderlessButtonStyle, 44}, m = "invoke")
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return OpenConversationUseCase.this.invoke(null, null, this);
        }
    }

    public OpenConversationUseCase(RefreshConversationUseCase refreshConversationUseCase, RefreshUnreadConversationsCountUseCase refreshUnreadConversationsCountUseCase, CommonRepository commonRepository) {
        i.e(refreshConversationUseCase, "refreshConversationUseCase");
        i.e(refreshUnreadConversationsCountUseCase, "refreshUnreadConversationsCountUseCase");
        i.e(commonRepository, "commonRepository");
        this.refreshConversationUseCase = refreshConversationUseCase;
        this.refreshUnreadConversationsCountUseCase = refreshUnreadConversationsCountUseCase;
        this.commonRepository = commonRepository;
    }

    public static /* synthetic */ Object invoke$default(OpenConversationUseCase openConversationUseCase, q qVar, GetConversationReason getConversationReason, kotlin.coroutines.c cVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            getConversationReason = GetConversationReason.OPEN_CONVERSATION;
        }
        return openConversationUseCase.invoke(qVar, getConversationReason, cVar);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00f2 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object invoke(q<ConversationClientState> qVar, GetConversationReason getConversationReason, kotlin.coroutines.c<? super r> cVar) {
        AnonymousClass1 anonymousClass1;
        q<ConversationClientState> qVar2;
        GetConversationReason getConversationReason2;
        OpenConversationUseCase openConversationUseCase;
        ConversationClientState value;
        ConversationClientState conversationClientState;
        OpenConversationUseCase openConversationUseCase2;
        RefreshUnreadConversationsCountUseCase refreshUnreadConversationsCountUseCase;
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
        Object objOpenMessenger = anonymousClass1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = anonymousClass1.label;
        if (i11 != 0) {
            if (i11 == 1) {
                GetConversationReason getConversationReason3 = (GetConversationReason) anonymousClass1.L$2;
                q<ConversationClientState> qVar3 = (q) anonymousClass1.L$1;
                OpenConversationUseCase openConversationUseCase3 = (OpenConversationUseCase) anonymousClass1.L$0;
                b.b(objOpenMessenger);
                getConversationReason2 = getConversationReason3;
                qVar2 = qVar3;
                openConversationUseCase = openConversationUseCase3;
            } else if (i11 == 2) {
                qVar2 = (q) anonymousClass1.L$1;
                openConversationUseCase2 = (OpenConversationUseCase) anonymousClass1.L$0;
                b.b(objOpenMessenger);
                refreshUnreadConversationsCountUseCase = openConversationUseCase2.refreshUnreadConversationsCountUseCase;
                anonymousClass1.L$0 = null;
                anonymousClass1.L$1 = null;
                anonymousClass1.label = 3;
                if (refreshUnreadConversationsCountUseCase.invoke(qVar2, anonymousClass1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b.b(objOpenMessenger);
            }
            return r.f47939a;
        }
        b.b(objOpenMessenger);
        CommonRepository commonRepository = this.commonRepository;
        anonymousClass1.L$0 = this;
        qVar2 = qVar;
        anonymousClass1.L$1 = qVar2;
        getConversationReason2 = getConversationReason;
        anonymousClass1.L$2 = getConversationReason2;
        anonymousClass1.label = 1;
        objOpenMessenger = commonRepository.openMessenger(anonymousClass1);
        if (objOpenMessenger == coroutineSingletons) {
            return coroutineSingletons;
        }
        openConversationUseCase = this;
        OpenMessengerResponse openMessengerResponse = (OpenMessengerResponse) objOpenMessenger;
        if (qVar2.getValue().getLastNetworkCall() != null && !(qVar2.getValue().getLastNetworkCall() instanceof NetworkResponse.Success)) {
            return r.f47939a;
        }
        do {
            value = qVar2.getValue();
            conversationClientState = value;
        } while (!qVar2.d(value, conversationClientState.copy((1048574 & 1) != 0 ? conversationClientState.pendingMessages : null, (1048574 & 2) != 0 ? conversationClientState.conversation : null, (1048574 & 4) != 0 ? conversationClientState.conversationId : null, (1048574 & 8) != 0 ? conversationClientState.currentlyTypingState : null, (1048574 & 16) != 0 ? conversationClientState.composerState : null, (1048574 & 32) != 0 ? conversationClientState.bottomSheetState : null, (1048574 & 64) != 0 ? conversationClientState.launchMode : null, (1048574 & 128) != 0 ? conversationClientState.lastNetworkCall : null, (1048574 & 256) != 0 ? conversationClientState.articleMetadata : null, (1048574 & 512) != 0 ? conversationClientState.networkState : null, (1048574 & 1024) != 0 ? conversationClientState.failedAttributeIdentifiers : null, (1048574 & 2048) != 0 ? conversationClientState.loadingAttributeIdentifiers : null, (1048574 & 4096) != 0 ? conversationClientState.finStreamingData : null, (1048574 & 8192) != 0 ? conversationClientState.openMessengerResponse : openMessengerResponse, (1048574 & 16384) != 0 ? conversationClientState.unreadConversationsCount : 0, (1048574 & 32768) != 0 ? conversationClientState.unreadTicketsCount : 0, (1048574 & 65536) != 0 ? conversationClientState.floatingIndicatorState : null, (1048574 & 131072) != 0 ? conversationClientState.newMessageId : null, (1048574 & 262144) != 0 ? conversationClientState.isConversationScrolled : false, (1048574 & 524288) != 0 ? conversationClientState.dismissedPrivacyNotice : false)));
        RefreshConversationUseCase refreshConversationUseCase = openConversationUseCase.refreshConversationUseCase;
        anonymousClass1.L$0 = openConversationUseCase;
        anonymousClass1.L$1 = qVar2;
        anonymousClass1.L$2 = null;
        anonymousClass1.label = 2;
        if (refreshConversationUseCase.invoke(qVar2, getConversationReason2, anonymousClass1) == coroutineSingletons) {
            return coroutineSingletons;
        }
        openConversationUseCase2 = openConversationUseCase;
        refreshUnreadConversationsCountUseCase = openConversationUseCase2.refreshUnreadConversationsCountUseCase;
        anonymousClass1.L$0 = null;
        anonymousClass1.L$1 = null;
        anonymousClass1.label = 3;
        if (refreshUnreadConversationsCountUseCase.invoke(qVar2, anonymousClass1) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return r.f47939a;
    }

    public /* synthetic */ OpenConversationUseCase(RefreshConversationUseCase refreshConversationUseCase, RefreshUnreadConversationsCountUseCase refreshUnreadConversationsCountUseCase, CommonRepository commonRepository, int i10, e eVar) {
        if ((i10 & 4) != 0) {
            MessengerApi messengerApi = Injector.get().getMessengerApi();
            i.d(messengerApi, "getMessengerApi(...)");
            IntercomDataLayer dataLayer = Injector.get().getDataLayer();
            i.d(dataLayer, "getDataLayer(...)");
            commonRepository = new CommonRepository(messengerApi, dataLayer);
        }
        this(refreshConversationUseCase, refreshUnreadConversationsCountUseCase, commonRepository);
    }
}
