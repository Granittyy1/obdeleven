package io.intercom.android.sdk.m5.conversation.usecase;

import Aa.c;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.m5.conversation.data.ConversationRepository;
import io.intercom.android.sdk.m5.conversation.data.GetConversationReason;
import io.intercom.android.sdk.m5.conversation.states.ConversationClientState;
import io.intercom.android.sdk.m5.conversation.states.CurrentlyTypingState;
import io.intercom.android.sdk.m5.conversation.states.FinStreamingData;
import io.intercom.android.sdk.m5.conversation.states.FloatingIndicatorState;
import io.intercom.android.sdk.m5.conversation.states.PendingMessage;
import io.intercom.android.sdk.m5.conversation.states.TypingIndicatorType;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.Ticket;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import kotlin.text.n;
import kotlinx.coroutines.flow.q;
import me.zhanghai.android.materialprogressbar.R;
import p293xa.r;

/* JADX INFO: compiled from: RefreshConversationUseCase.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class RefreshConversationUseCase {
    public static final int $stable = 8;
    private final ConversationRepository conversationRepository;
    private final IntercomDataLayer intercomDataLayer;
    private final RecordOpenedInteractionUseCase recordOpenedInteractionUseCase;
    private final TrackLastReceivedPartsUseCase trackLastReceivedPartsUseCase;

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.usecase.RefreshConversationUseCase$invoke$1, reason: invalid class name */
    /* JADX INFO: compiled from: RefreshConversationUseCase.kt */
    @c(c = "io.intercom.android.sdk.m5.conversation.usecase.RefreshConversationUseCase", f = "RefreshConversationUseCase.kt", l = {R.styleable.AppCompatTheme_activityChooserViewStyle, 85}, m = "invoke")
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
            return RefreshConversationUseCase.this.invoke(null, null, this);
        }
    }

    public RefreshConversationUseCase(ConversationRepository conversationRepository, IntercomDataLayer intercomDataLayer, TrackLastReceivedPartsUseCase trackLastReceivedPartsUseCase, RecordOpenedInteractionUseCase recordOpenedInteractionUseCase) {
        i.e(conversationRepository, "conversationRepository");
        i.e(intercomDataLayer, "intercomDataLayer");
        i.e(trackLastReceivedPartsUseCase, "trackLastReceivedPartsUseCase");
        i.e(recordOpenedInteractionUseCase, "recordOpenedInteractionUseCase");
        this.conversationRepository = conversationRepository;
        this.intercomDataLayer = intercomDataLayer;
        this.trackLastReceivedPartsUseCase = trackLastReceivedPartsUseCase;
        this.recordOpenedInteractionUseCase = recordOpenedInteractionUseCase;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object invoke(q<ConversationClientState> qVar, GetConversationReason getConversationReason, kotlin.coroutines.c<? super r> cVar) {
        AnonymousClass1 anonymousClass1;
        RefreshConversationUseCase refreshConversationUseCase;
        q<ConversationClientState> qVar2;
        FinStreamingData finStreamingData;
        Conversation conversation;
        RefreshConversationUseCase refreshConversationUseCase2;
        Conversation conversation2;
        Part part;
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
        Object conversation3 = anonymousClass1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = anonymousClass1.label;
        if (i11 != 0) {
            if (i11 == 1) {
                qVar2 = (q) anonymousClass1.L$1;
                refreshConversationUseCase = (RefreshConversationUseCase) anonymousClass1.L$0;
                b.b(conversation3);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                conversation2 = (Conversation) anonymousClass1.L$1;
                refreshConversationUseCase2 = (RefreshConversationUseCase) anonymousClass1.L$0;
                b.b(conversation3);
            }
            refreshConversationUseCase2.conversationRepository.nexusEventsRepository().markAsSeen(conversation2.getId());
            refreshConversationUseCase2.intercomDataLayer.markConversationAsRead(conversation2.getId());
            return r.f47939a;
        }
        b.b(conversation3);
        String conversationId = qVar.getValue().getConversationId();
        if (conversationId != null) {
            ConversationRepository conversationRepository = this.conversationRepository;
            anonymousClass1.L$0 = this;
            anonymousClass1.L$1 = qVar;
            anonymousClass1.label = 1;
            conversation3 = conversationRepository.getConversation(conversationId, getConversationReason, anonymousClass1);
            if (conversation3 == coroutineSingletons) {
                return coroutineSingletons;
            }
            refreshConversationUseCase = this;
            qVar2 = qVar;
        }
        return r.f47939a;
        NetworkResponse networkResponse = (NetworkResponse) conversation3;
        ConversationClientState value = qVar2.getValue();
        if (networkResponse instanceof NetworkResponse.Success) {
            Conversation conversation4 = (Conversation) ((NetworkResponse.Success) networkResponse).getBody();
            refreshConversationUseCase.trackLastReceivedPartsUseCase.invoke(conversation4);
            Map<String, PendingMessage> pendingMessages = value.getPendingMessages();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, PendingMessage> entry : pendingMessages.entrySet()) {
                List<Part> listParts = conversation4.parts();
                if (!(listParts instanceof Collection) || !listParts.isEmpty()) {
                    Iterator<T> it = listParts.iterator();
                    do {
                        if (it.hasNext()) {
                            part = (Part) it.next();
                            if (i.a(part.getUuid(), entry.getValue().getPart().getUuid())) {
                                break;
                            }
                        }
                    } while (!i.a(part.getId(), entry.getValue().getPart().getId()));
                }
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
            List<Part> listParts2 = conversation4.parts();
            if (!(listParts2 instanceof Collection) || !listParts2.isEmpty()) {
                Iterator<T> it2 = listParts2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        finStreamingData = value.getFinStreamingData();
                        break;
                    }
                    Part part2 = (Part) it2.next();
                    String uuid = part2.getUuid();
                    i.d(uuid, "getUuid(...)");
                    if (!n.S(uuid) && i.a(part2.getUuid(), value.getFinStreamingData().getClientAssignedUUID())) {
                        finStreamingData = new FinStreamingData(false, EmptyList.f42983b, "", 0);
                        break;
                    }
                }
            } else {
                finStreamingData = value.getFinStreamingData();
                break;
            }
            FinStreamingData finStreamingData2 = finStreamingData;
            List<Part> listParts3 = conversation4.parts();
            ArrayList arrayList = new ArrayList();
            for (Object obj : listParts3) {
                Part part3 = (Part) obj;
                if (!part3.isUser()) {
                    Conversation conversation5 = value.getConversation();
                    List<Part> listParts4 = conversation5 != null ? conversation5.parts() : null;
                    if (listParts4 == null) {
                        listParts4 = EmptyList.f42983b;
                    }
                    List<Part> list = listParts4;
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        Iterator<T> it3 = list.iterator();
                        do {
                            if (!it3.hasNext()) {
                                arrayList.add(obj);
                                break;
                            }
                        } while (!i.a(((Part) it3.next()).getId(), part3.getId()));
                    } else {
                        arrayList.add(obj);
                        break;
                        break;
                    }
                }
            }
            Pair pairCalculateJumpToBottomButtonState = RefreshConversationUseCaseKt.calculateJumpToBottomButtonState(value, conversation4, arrayList);
            while (true) {
                ConversationClientState conversationClientState = value;
                LinkedHashMap linkedHashMap2 = linkedHashMap;
                conversation = conversation4;
                ConversationClientState conversationClientState2 = value;
                if (qVar2.d(qVar2.getValue(), conversationClientState.copy((1048574 & 1) != 0 ? conversationClientState.pendingMessages : linkedHashMap, (1048574 & 2) != 0 ? conversationClientState.conversation : conversation4, (1048574 & 4) != 0 ? conversationClientState.conversationId : null, (1048574 & 8) != 0 ? conversationClientState.currentlyTypingState : new CurrentlyTypingState(null, false, null, TypingIndicatorType.NONE, 7, null), (1048574 & 16) != 0 ? conversationClientState.composerState : null, (1048574 & 32) != 0 ? conversationClientState.bottomSheetState : null, (1048574 & 64) != 0 ? conversationClientState.launchMode : null, (1048574 & 128) != 0 ? conversationClientState.lastNetworkCall : networkResponse, (1048574 & 256) != 0 ? conversationClientState.articleMetadata : null, (1048574 & 512) != 0 ? conversationClientState.networkState : null, (1048574 & 1024) != 0 ? conversationClientState.failedAttributeIdentifiers : null, (1048574 & 2048) != 0 ? conversationClientState.loadingAttributeIdentifiers : null, (1048574 & 4096) != 0 ? conversationClientState.finStreamingData : finStreamingData2, (1048574 & 8192) != 0 ? conversationClientState.openMessengerResponse : null, (1048574 & 16384) != 0 ? conversationClientState.unreadConversationsCount : 0, (1048574 & 32768) != 0 ? conversationClientState.unreadTicketsCount : 0, (1048574 & 65536) != 0 ? conversationClientState.floatingIndicatorState : (FloatingIndicatorState) pairCalculateJumpToBottomButtonState.a(), (1048574 & 131072) != 0 ? conversationClientState.newMessageId : (String) pairCalculateJumpToBottomButtonState.b(), (1048574 & 262144) != 0 ? conversationClientState.isConversationScrolled : false, (1048574 & 524288) != 0 ? conversationClientState.dismissedPrivacyNotice : false))) {
                    break;
                }
                conversation4 = conversation;
                linkedHashMap = linkedHashMap2;
                value = conversationClientState2;
            }
            IntercomDataLayer intercomDataLayer = refreshConversationUseCase.intercomDataLayer;
            Ticket ticket = conversation.getTicket();
            if (ticket == null) {
                ticket = Ticket.Companion.getNULL();
            }
            intercomDataLayer.updateTicket(ticket);
            refreshConversationUseCase.intercomDataLayer.fetchConversationSuccess(conversation);
            refreshConversationUseCase.recordOpenedInteractionUseCase.invoke(conversation);
            if (!conversation.isRead()) {
                ConversationRepository conversationRepository2 = refreshConversationUseCase.conversationRepository;
                String id = conversation.getId();
                anonymousClass1.L$0 = refreshConversationUseCase;
                anonymousClass1.L$1 = conversation;
                anonymousClass1.label = 2;
                if (conversationRepository2.markAsRead(id, anonymousClass1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                refreshConversationUseCase2 = refreshConversationUseCase;
                conversation2 = conversation;
                refreshConversationUseCase2.conversationRepository.nexusEventsRepository().markAsSeen(conversation2.getId());
                refreshConversationUseCase2.intercomDataLayer.markConversationAsRead(conversation2.getId());
            }
        } else {
            while (!qVar2.d(qVar2.getValue(), value.copy((1048574 & 1) != 0 ? value.pendingMessages : null, (1048574 & 2) != 0 ? value.conversation : null, (1048574 & 4) != 0 ? value.conversationId : null, (1048574 & 8) != 0 ? value.currentlyTypingState : null, (1048574 & 16) != 0 ? value.composerState : null, (1048574 & 32) != 0 ? value.bottomSheetState : null, (1048574 & 64) != 0 ? value.launchMode : null, (1048574 & 128) != 0 ? value.lastNetworkCall : networkResponse, (1048574 & 256) != 0 ? value.articleMetadata : null, (1048574 & 512) != 0 ? value.networkState : null, (1048574 & 1024) != 0 ? value.failedAttributeIdentifiers : null, (1048574 & 2048) != 0 ? value.loadingAttributeIdentifiers : null, (1048574 & 4096) != 0 ? value.finStreamingData : null, (1048574 & 8192) != 0 ? value.openMessengerResponse : null, (1048574 & 16384) != 0 ? value.unreadConversationsCount : 0, (1048574 & 32768) != 0 ? value.unreadTicketsCount : 0, (1048574 & 65536) != 0 ? value.floatingIndicatorState : null, (1048574 & 131072) != 0 ? value.newMessageId : null, (1048574 & 262144) != 0 ? value.isConversationScrolled : false, (1048574 & 524288) != 0 ? value.dismissedPrivacyNotice : false))) {
            }
        }
        return r.f47939a;
    }

    public /* synthetic */ RefreshConversationUseCase(ConversationRepository conversationRepository, IntercomDataLayer intercomDataLayer, TrackLastReceivedPartsUseCase trackLastReceivedPartsUseCase, RecordOpenedInteractionUseCase recordOpenedInteractionUseCase, int i10, e eVar) {
        this(conversationRepository, (i10 & 2) != 0 ? Injector.get().getDataLayer() : intercomDataLayer, trackLastReceivedPartsUseCase, recordOpenedInteractionUseCase);
    }
}
