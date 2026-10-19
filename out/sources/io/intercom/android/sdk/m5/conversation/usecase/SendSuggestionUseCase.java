package io.intercom.android.sdk.m5.conversation.usecase;

import Aa.c;
import androidx.compose.animation.D;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.blocks.BlockFactory;
import io.intercom.android.sdk.blocks.logic.TextSplittingStrategy;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.m5.conversation.data.ConversationRepository;
import io.intercom.android.sdk.m5.conversation.states.ConversationClientState;
import io.intercom.android.sdk.m5.conversation.states.PendingMessage;
import io.intercom.android.sdk.m5.conversation.states.ReplySuggestion;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.OpenMessengerResponse;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.Participant;
import java.util.LinkedHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.b;
import kotlin.collections.y;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.flow.q;
import me.zhanghai.android.materialprogressbar.R;
import p293xa.r;

/* JADX INFO: compiled from: SendSuggestionUseCase.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class SendSuggestionUseCase {
    public static final int $stable = 8;
    private final ConversationRepository conversationRepository;
    private final IntercomDataLayer intercomDataLayer;
    private final SoundEffectsUseCase soundEffectsUseCase;
    private final UserIdentity userIdentity;

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.usecase.SendSuggestionUseCase$invoke$1, reason: invalid class name */
    /* JADX INFO: compiled from: SendSuggestionUseCase.kt */
    @c(c = "io.intercom.android.sdk.m5.conversation.usecase.SendSuggestionUseCase", f = "SendSuggestionUseCase.kt", l = {R.styleable.AppCompatTheme_colorPrimaryDark}, m = "invoke")
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
            return SendSuggestionUseCase.this.invoke(null, null, this);
        }
    }

    public SendSuggestionUseCase(ConversationRepository conversationRepository, SoundEffectsUseCase soundEffectsUseCase, UserIdentity userIdentity, IntercomDataLayer intercomDataLayer) {
        i.e(conversationRepository, "conversationRepository");
        i.e(soundEffectsUseCase, "soundEffectsUseCase");
        i.e(userIdentity, "userIdentity");
        i.e(intercomDataLayer, "intercomDataLayer");
        this.conversationRepository = conversationRepository;
        this.soundEffectsUseCase = soundEffectsUseCase;
        this.userIdentity = userIdentity;
        this.intercomDataLayer = intercomDataLayer;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object invoke(q<ConversationClientState> qVar, ReplySuggestion replySuggestion, kotlin.coroutines.c<? super r> cVar) {
        AnonymousClass1 anonymousClass1;
        SendSuggestionUseCase sendSuggestionUseCase;
        Object value;
        ConversationClientState conversationClientState;
        SendSuggestionUseCase sendSuggestionUseCase2 = this;
        q qVar2 = qVar;
        if (cVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) cVar;
            int i10 = anonymousClass1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i10 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = sendSuggestionUseCase2.new AnonymousClass1(cVar);
            }
        } else {
            anonymousClass1 = sendSuggestionUseCase2.new AnonymousClass1(cVar);
        }
        Object objCreateConversationFromSuggestion = anonymousClass1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = anonymousClass1.label;
        if (i11 == 0) {
            b.b(objCreateConversationFromSuggestion);
            BlockFactory blockFactory = new BlockFactory(new TextSplittingStrategy());
            String strC = D.c("toString(...)");
            while (true) {
                ConversationClientState value2 = qVar.getValue();
                ConversationClientState conversationClientState2 = value2;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.putAll(conversationClientState2.getPendingMessages());
                Part partBuild = new Part.Builder().withBlocks(blockFactory.getBlocksForText(replySuggestion.getText())).withClientAssignedUuid(strC).build();
                partBuild.setParticipant(new Participant.Builder().withId(sendSuggestionUseCase2.userIdentity.getIntercomId()).build());
                partBuild.setMessageState(Part.MessageState.SENDING);
                r rVar = r.f47939a;
                linkedHashMap.put(strC, new PendingMessage(partBuild, false, null, 4, null));
                if (qVar2.d(value2, conversationClientState2.copy((1048574 & 1) != 0 ? conversationClientState2.pendingMessages : linkedHashMap, (1048574 & 2) != 0 ? conversationClientState2.conversation : null, (1048574 & 4) != 0 ? conversationClientState2.conversationId : null, (1048574 & 8) != 0 ? conversationClientState2.currentlyTypingState : null, (1048574 & 16) != 0 ? conversationClientState2.composerState : null, (1048574 & 32) != 0 ? conversationClientState2.bottomSheetState : null, (1048574 & 64) != 0 ? conversationClientState2.launchMode : null, (1048574 & 128) != 0 ? conversationClientState2.lastNetworkCall : null, (1048574 & 256) != 0 ? conversationClientState2.articleMetadata : null, (1048574 & 512) != 0 ? conversationClientState2.networkState : null, (1048574 & 1024) != 0 ? conversationClientState2.failedAttributeIdentifiers : null, (1048574 & 2048) != 0 ? conversationClientState2.loadingAttributeIdentifiers : null, (1048574 & 4096) != 0 ? conversationClientState2.finStreamingData : null, (1048574 & 8192) != 0 ? conversationClientState2.openMessengerResponse : null, (1048574 & 16384) != 0 ? conversationClientState2.unreadConversationsCount : 0, (1048574 & 32768) != 0 ? conversationClientState2.unreadTicketsCount : 0, (1048574 & 65536) != 0 ? conversationClientState2.floatingIndicatorState : null, (1048574 & 131072) != 0 ? conversationClientState2.newMessageId : null, (1048574 & 262144) != 0 ? conversationClientState2.isConversationScrolled : false, (1048574 & 524288) != 0 ? conversationClientState2.dismissedPrivacyNotice : false))) {
                    break;
                }
                sendSuggestionUseCase2 = this;
            }
            if (qVar.getValue().getConversation() == null) {
                ConversationRepository conversationRepository = sendSuggestionUseCase2.conversationRepository;
                String id = replySuggestion.getId();
                OpenMessengerResponse openResponse = sendSuggestionUseCase2.intercomDataLayer.getOpenResponse();
                String requestId = openResponse != null ? openResponse.getRequestId() : null;
                anonymousClass1.L$0 = sendSuggestionUseCase2;
                anonymousClass1.L$1 = qVar2;
                anonymousClass1.label = 1;
                objCreateConversationFromSuggestion = conversationRepository.createConversationFromSuggestion(id, requestId, anonymousClass1);
                if (objCreateConversationFromSuggestion == coroutineSingletons) {
                    return coroutineSingletons;
                }
                sendSuggestionUseCase = sendSuggestionUseCase2;
            }
            return r.f47939a;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        qVar2 = (q) anonymousClass1.L$1;
        sendSuggestionUseCase = (SendSuggestionUseCase) anonymousClass1.L$0;
        b.b(objCreateConversationFromSuggestion);
        NetworkResponse networkResponse = (NetworkResponse) objCreateConversationFromSuggestion;
        if ((networkResponse instanceof NetworkResponse.ClientError) || (networkResponse instanceof NetworkResponse.NetworkError) || (networkResponse instanceof NetworkResponse.ServerError)) {
            sendSuggestionUseCase.soundEffectsUseCase.invoke$intercom_sdk_base_release(Action.MESSAGE_FAILED);
        } else {
            if (!(networkResponse instanceof NetworkResponse.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            sendSuggestionUseCase.soundEffectsUseCase.invoke$intercom_sdk_base_release(Action.MESSAGE_SENT);
            Conversation conversation = (Conversation) ((NetworkResponse.Success) networkResponse).getBody();
            do {
                value = qVar2.getValue();
                conversationClientState = (ConversationClientState) value;
            } while (!qVar2.d(value, conversationClientState.copy((1048574 & 1) != 0 ? conversationClientState.pendingMessages : y.p(), (1048574 & 2) != 0 ? conversationClientState.conversation : conversation, (1048574 & 4) != 0 ? conversationClientState.conversationId : conversation.getId(), (1048574 & 8) != 0 ? conversationClientState.currentlyTypingState : null, (1048574 & 16) != 0 ? conversationClientState.composerState : null, (1048574 & 32) != 0 ? conversationClientState.bottomSheetState : null, (1048574 & 64) != 0 ? conversationClientState.launchMode : null, (1048574 & 128) != 0 ? conversationClientState.lastNetworkCall : null, (1048574 & 256) != 0 ? conversationClientState.articleMetadata : null, (1048574 & 512) != 0 ? conversationClientState.networkState : null, (1048574 & 1024) != 0 ? conversationClientState.failedAttributeIdentifiers : null, (1048574 & 2048) != 0 ? conversationClientState.loadingAttributeIdentifiers : null, (1048574 & 4096) != 0 ? conversationClientState.finStreamingData : null, (1048574 & 8192) != 0 ? conversationClientState.openMessengerResponse : null, (1048574 & 16384) != 0 ? conversationClientState.unreadConversationsCount : 0, (1048574 & 32768) != 0 ? conversationClientState.unreadTicketsCount : 0, (1048574 & 65536) != 0 ? conversationClientState.floatingIndicatorState : null, (1048574 & 131072) != 0 ? conversationClientState.newMessageId : null, (1048574 & 262144) != 0 ? conversationClientState.isConversationScrolled : false, (1048574 & 524288) != 0 ? conversationClientState.dismissedPrivacyNotice : false)));
        }
        return r.f47939a;
    }

    public /* synthetic */ SendSuggestionUseCase(ConversationRepository conversationRepository, SoundEffectsUseCase soundEffectsUseCase, UserIdentity userIdentity, IntercomDataLayer intercomDataLayer, int i10, e eVar) {
        this(conversationRepository, soundEffectsUseCase, (i10 & 4) != 0 ? Injector.get().getUserIdentity() : userIdentity, (i10 & 8) != 0 ? Injector.get().getDataLayer() : intercomDataLayer);
    }
}
