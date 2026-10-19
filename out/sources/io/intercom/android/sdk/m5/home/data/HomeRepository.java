package io.intercom.android.sdk.m5.home.data;

import io.intercom.android.nexus.NexusClient;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.api.MessengerApi;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.m5.conversation.data.NexusEventAsFlowKt;
import io.intercom.android.sdk.m5.conversation.data.ParsedNexusEvent;
import kotlin.coroutines.c;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.flow.InterfaceC2686c;

/* JADX INFO: compiled from: HomeRepository.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class HomeRepository {
    public static final int $stable = 8;
    private final MessengerApi messengerApi;
    private final NexusClient nexusClient;

    /* JADX WARN: Multi-variable type inference failed */
    public HomeRepository() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final Object getHomeCards(c<? super NetworkResponse<HomeV2Response>> cVar) {
        return MessengerApi.DefaultImpls.getHomeCardsV2Suspend$default(this.messengerApi, null, cVar, 1, null);
    }

    public final InterfaceC2686c<ParsedNexusEvent> realTimeEvents() {
        return NexusEventAsFlowKt.nexusEventAsFlow(this.nexusClient);
    }

    public HomeRepository(MessengerApi messengerApi, NexusClient nexusClient) {
        i.e(messengerApi, "messengerApi");
        i.e(nexusClient, "nexusClient");
        this.messengerApi = messengerApi;
        this.nexusClient = nexusClient;
    }

    public /* synthetic */ HomeRepository(MessengerApi messengerApi, NexusClient nexusClient, int i10, e eVar) {
        this((i10 & 1) != 0 ? Injector.get().getMessengerApi() : messengerApi, (i10 & 2) != 0 ? Injector.get().getNexusClient() : nexusClient);
    }
}
