package io.intercom.android.sdk.tickets.create.data;

import Aa.c;
import io.intercom.android.nexus.NexusClient;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.api.MessengerApiHelper;
import io.intercom.android.sdk.blocks.lib.models.TicketTypeV2;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.m5.conversation.data.NexusEventAsFlowKt;
import io.intercom.android.sdk.m5.conversation.data.ParsedNexusEvent;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.m5.navigation.CreateTicketDestinationKt;
import io.intercom.android.sdk.m5.upload.data.UploadRepository;
import io.intercom.android.sdk.models.Ticket;
import io.intercom.android.sdk.models.Upload;
import io.intercom.android.sdk.tickets.list.data.TicketsResponse;
import java.util.List;
import kotlin.Pair;
import kotlin.b;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.MapBuilder;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import kotlin.text.n;
import kotlinx.coroutines.flow.InterfaceC2686c;
import me.zhanghai.android.materialprogressbar.R;
import okhttp3.y;
import p293xa.r;

/* JADX INFO: compiled from: TicketRepository.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class TicketRepository {
    public static final int $stable = 8;
    private final TicketApi api;
    private final IntercomDataLayer intercomDataLayer;
    private final NexusClient nexusClient;
    private final UploadRepository uploadRepository;

    /* JADX INFO: renamed from: io.intercom.android.sdk.tickets.create.data.TicketRepository$createTicket$1, reason: invalid class name */
    /* JADX INFO: compiled from: TicketRepository.kt */
    @c(c = "io.intercom.android.sdk.tickets.create.data.TicketRepository", f = "TicketRepository.kt", l = {R.styleable.AppCompatTheme_actionOverflowButtonStyle}, m = "createTicket")
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
            return TicketRepository.this.createTicket(null, 0, null, this);
        }
    }

    public TicketRepository() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Object fetchTicketType$default(TicketRepository ticketRepository, int i10, List list, kotlin.coroutines.c cVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            list = EmptyList.f42983b;
        }
        return ticketRepository.fetchTicketType(i10, list, cVar);
    }

    public static /* synthetic */ Object fetchTickets$default(TicketRepository ticketRepository, long j, int i10, kotlin.coroutines.c cVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 10;
        }
        return ticketRepository.fetchTickets(j, i10, cVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object createTicket(String str, int i10, List<TicketAttributeRequest> list, kotlin.coroutines.c<? super NetworkResponse<Ticket>> cVar) {
        AnonymousClass1 anonymousClass1;
        TicketRepository ticketRepository;
        if (cVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) cVar;
            int i11 = anonymousClass1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i11 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(cVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(cVar);
        }
        Object objCreateTicket = anonymousClass1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i12 = anonymousClass1.label;
        if (i12 == 0) {
            b.b(objCreateTicket);
            TicketApi ticketApi = this.api;
            MessengerApiHelper messengerApiHelper = MessengerApiHelper.INSTANCE;
            MapBuilder mapBuilder = new MapBuilder();
            if (str != null && !n.S(str)) {
                mapBuilder.put(CreateTicketDestinationKt.CONVERSATION_ID, str);
            }
            mapBuilder.put("type_id", new Integer(i10));
            mapBuilder.put("attributes", list);
            r rVar = r.f47939a;
            y defaultRequestBody$intercom_sdk_base_release = messengerApiHelper.getDefaultRequestBody$intercom_sdk_base_release(mapBuilder.k());
            anonymousClass1.L$0 = this;
            anonymousClass1.label = 1;
            objCreateTicket = ticketApi.createTicket(defaultRequestBody$intercom_sdk_base_release, anonymousClass1);
            if (objCreateTicket == coroutineSingletons) {
                return coroutineSingletons;
            }
            ticketRepository = this;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ticketRepository = (TicketRepository) anonymousClass1.L$0;
            b.b(objCreateTicket);
        }
        NetworkResponse networkResponse = (NetworkResponse) objCreateTicket;
        if (networkResponse instanceof NetworkResponse.Success) {
            ticketRepository.intercomDataLayer.updateTicket((Ticket) ((NetworkResponse.Success) networkResponse).getBody());
        }
        return networkResponse;
    }

    public final Object fetchTicketDetail(String str, kotlin.coroutines.c<? super NetworkResponse<Ticket>> cVar) {
        return this.api.fetchTicketDetail(str, MessengerApiHelper.getDefaultRequestBody$intercom_sdk_base_release$default(MessengerApiHelper.INSTANCE, null, 1, null), cVar);
    }

    public final Object fetchTicketType(int i10, List<TicketAttributeRequest> list, kotlin.coroutines.c<? super NetworkResponse<TicketTypeV2>> cVar) {
        return this.api.fetchTicketType(MessengerApiHelper.INSTANCE.getDefaultRequestBody$intercom_sdk_base_release(kotlin.collections.y.s(new Pair(CreateTicketDestinationKt.TICKET_TYPE_ID, new Integer(i10)), new Pair("attributes", list))), cVar);
    }

    public final Object fetchTickets(long j, int i10, kotlin.coroutines.c<? super NetworkResponse<TicketsResponse>> cVar) {
        return this.api.fetchTickets(MessengerApiHelper.INSTANCE.getDefaultRequestBody$intercom_sdk_base_release(kotlin.collections.y.s(new Pair("page", new Long(j)), new Pair("per_page", new Integer(i10)))), cVar);
    }

    public final Object markAsRead(String str, kotlin.coroutines.c<? super NetworkResponse<r>> cVar) {
        return this.api.markAsRead(str, MessengerApiHelper.getDefaultRequestBody$intercom_sdk_base_release$default(MessengerApiHelper.INSTANCE, null, 1, null), cVar);
    }

    public final InterfaceC2686c<ParsedNexusEvent> realTimeEvents() {
        return NexusEventAsFlowKt.nexusEventAsFlow(this.nexusClient);
    }

    public final Object uploadFile(MediaData.Media media, kotlin.coroutines.c<? super NetworkResponse<Upload.Builder>> cVar) {
        return this.uploadRepository.uploadFile(media, cVar);
    }

    public TicketRepository(TicketApi api, UploadRepository uploadRepository, NexusClient nexusClient, IntercomDataLayer intercomDataLayer) {
        i.e(api, "api");
        i.e(uploadRepository, "uploadRepository");
        i.e(nexusClient, "nexusClient");
        i.e(intercomDataLayer, "intercomDataLayer");
        this.api = api;
        this.uploadRepository = uploadRepository;
        this.nexusClient = nexusClient;
        this.intercomDataLayer = intercomDataLayer;
    }

    public /* synthetic */ TicketRepository(TicketApi ticketApi, UploadRepository uploadRepository, NexusClient nexusClient, IntercomDataLayer intercomDataLayer, int i10, e eVar) {
        this((i10 & 1) != 0 ? Injector.get().getTicketApi() : ticketApi, (i10 & 2) != 0 ? new UploadRepository(null, null, null, null, 15, null) : uploadRepository, (i10 & 4) != 0 ? Injector.get().getNexusClient() : nexusClient, (i10 & 8) != 0 ? Injector.get().getDataLayer() : intercomDataLayer);
    }
}
