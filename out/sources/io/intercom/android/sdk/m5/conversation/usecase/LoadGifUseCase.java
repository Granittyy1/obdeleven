package io.intercom.android.sdk.m5.conversation.usecase;

import Aa.c;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.m5.conversation.data.ConversationRepository;
import io.intercom.android.sdk.m5.conversation.states.BottomSheetState;
import io.intercom.android.sdk.m5.conversation.states.ConversationClientState;
import io.intercom.android.sdk.models.GifResponse;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.flow.q;
import p293xa.r;

/* JADX INFO: compiled from: LoadGifUseCase.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class LoadGifUseCase {
    public static final int $stable = 8;
    private final ConversationRepository conversationRepository;

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.usecase.LoadGifUseCase$invoke$1, reason: invalid class name */
    /* JADX INFO: compiled from: LoadGifUseCase.kt */
    @c(c = "io.intercom.android.sdk.m5.conversation.usecase.LoadGifUseCase", f = "LoadGifUseCase.kt", l = {17}, m = "invoke")
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
            return LoadGifUseCase.this.invoke(null, null, this);
        }
    }

    public LoadGifUseCase(ConversationRepository conversationRepository) {
        i.e(conversationRepository, "conversationRepository");
        this.conversationRepository = conversationRepository;
    }

    public static /* synthetic */ Object invoke$default(LoadGifUseCase loadGifUseCase, q qVar, String str, kotlin.coroutines.c cVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = "";
        }
        return loadGifUseCase.invoke(qVar, str, cVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object invoke(q<ConversationClientState> qVar, String str, kotlin.coroutines.c<? super r> cVar) {
        AnonymousClass1 anonymousClass1;
        q<ConversationClientState> qVar2;
        BottomSheetState.GifSearch gifSearch;
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
        Object objLoadGifs = anonymousClass1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = anonymousClass1.label;
        if (i11 == 0) {
            b.b(objLoadGifs);
            ConversationRepository conversationRepository = this.conversationRepository;
            anonymousClass1.L$0 = qVar;
            anonymousClass1.label = 1;
            objLoadGifs = conversationRepository.loadGifs(str, anonymousClass1);
            if (objLoadGifs == coroutineSingletons) {
                return coroutineSingletons;
            }
            qVar2 = qVar;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            qVar2 = (q) anonymousClass1.L$0;
            b.b(objLoadGifs);
        }
        NetworkResponse networkResponse = (NetworkResponse) objLoadGifs;
        if ((networkResponse instanceof NetworkResponse.ClientError) || (networkResponse instanceof NetworkResponse.NetworkError) || (networkResponse instanceof NetworkResponse.ServerError)) {
            gifSearch = new BottomSheetState.GifSearch(EmptyList.f42983b);
        } else {
            if (!(networkResponse instanceof NetworkResponse.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            List<Block> listResults = ((GifResponse) ((NetworkResponse.Success) networkResponse).getBody()).results();
            i.d(listResults, "results(...)");
            gifSearch = new BottomSheetState.GifSearch(listResults);
        }
        do {
            value = qVar2.getValue();
            conversationClientState = value;
        } while (!qVar2.d(value, conversationClientState.copy((1048574 & 1) != 0 ? conversationClientState.pendingMessages : null, (1048574 & 2) != 0 ? conversationClientState.conversation : null, (1048574 & 4) != 0 ? conversationClientState.conversationId : null, (1048574 & 8) != 0 ? conversationClientState.currentlyTypingState : null, (1048574 & 16) != 0 ? conversationClientState.composerState : null, (1048574 & 32) != 0 ? conversationClientState.bottomSheetState : gifSearch, (1048574 & 64) != 0 ? conversationClientState.launchMode : null, (1048574 & 128) != 0 ? conversationClientState.lastNetworkCall : null, (1048574 & 256) != 0 ? conversationClientState.articleMetadata : null, (1048574 & 512) != 0 ? conversationClientState.networkState : null, (1048574 & 1024) != 0 ? conversationClientState.failedAttributeIdentifiers : null, (1048574 & 2048) != 0 ? conversationClientState.loadingAttributeIdentifiers : null, (1048574 & 4096) != 0 ? conversationClientState.finStreamingData : null, (1048574 & 8192) != 0 ? conversationClientState.openMessengerResponse : null, (1048574 & 16384) != 0 ? conversationClientState.unreadConversationsCount : 0, (1048574 & 32768) != 0 ? conversationClientState.unreadTicketsCount : 0, (1048574 & 65536) != 0 ? conversationClientState.floatingIndicatorState : null, (1048574 & 131072) != 0 ? conversationClientState.newMessageId : null, (1048574 & 262144) != 0 ? conversationClientState.isConversationScrolled : false, (1048574 & 524288) != 0 ? conversationClientState.dismissedPrivacyNotice : false)));
        return r.f47939a;
    }
}
