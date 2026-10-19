package io.intercom.android.sdk.m5.inbox.data;

import io.intercom.android.nexus.NexusClient;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.api.MessengerApi;
import io.intercom.android.sdk.api.MessengerApiHelper;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.m5.conversation.data.NexusEventAsFlowKt;
import io.intercom.android.sdk.m5.conversation.data.ParsedNexusEvent;
import io.intercom.android.sdk.models.ConversationsResponse;
import kotlin.Pair;
import kotlin.collections.x;
import kotlin.collections.y;
import kotlin.coroutines.c;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.flow.InterfaceC2686c;

/* JADX INFO: compiled from: InboxRepository.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class InboxRepository {
    public static final int $stable = 8;
    private final MessengerApi api;
    private final NexusClient nexusClient;

    /* JADX WARN: Multi-variable type inference failed */
    public InboxRepository() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ Object getConversations$default(InboxRepository inboxRepository, Long l10, int i10, c cVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            l10 = null;
        }
        if ((i11 & 2) != 0) {
            i10 = 20;
        }
        return inboxRepository.getConversations(l10, i10, cVar);
    }

    public final Object getConversations(Long l10, int i10, c<? super NetworkResponse<ConversationsResponse.Builder>> cVar) {
        return this.api.getConversationsSuspend(MessengerApiHelper.INSTANCE.getDefaultRequestBody$intercom_sdk_base_release(l10 == null ? x.o(new Pair("per_page", new Integer(i10))) : y.s(new Pair("per_page", new Integer(i10)), new Pair("before", l10))), cVar);
    }

    public final InterfaceC2686c<ParsedNexusEvent> realTimeEvents() {
        return NexusEventAsFlowKt.nexusEventAsFlow(this.nexusClient);
    }

    public InboxRepository(MessengerApi api, NexusClient nexusClient) {
        i.e(api, "api");
        i.e(nexusClient, "nexusClient");
        this.api = api;
        this.nexusClient = nexusClient;
    }

    public /* synthetic */ InboxRepository(MessengerApi messengerApi, NexusClient nexusClient, int i10, e eVar) {
        this((i10 & 1) != 0 ? Injector.get().getMessengerApi() : messengerApi, (i10 & 2) != 0 ? Injector.get().getNexusClient() : nexusClient);
    }
}
