package io.intercom.android.sdk.m5.conversation.data;

import com.braze.Constants;
import com.google.gson.Gson;
import io.intercom.android.nexus.NexusClient;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.IntercomError;
import io.intercom.android.sdk.IntercomStatusCallback;
import io.intercom.android.sdk.api.Api;
import io.intercom.android.sdk.api.MessengerApi;
import io.intercom.android.sdk.api.MessengerApiHelper;
import io.intercom.android.sdk.api.UserUpdateRequest;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData;
import io.intercom.android.sdk.m5.upload.data.UploadRepository;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.ComposerSuggestions;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.ConversationResponse;
import io.intercom.android.sdk.models.GifResponse;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.Upload;
import io.intercom.android.sdk.utilities.TimeFormatterExtKt;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.builders.MapBuilder;
import kotlin.collections.x;
import kotlin.collections.y;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import kotlin.text.n;
import kotlinx.coroutines.A;
import kotlinx.coroutines.flow.InterfaceC2686c;
import p293xa.g;
import p293xa.r;

/* JADX INFO: compiled from: ConversationRepository.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ConversationRepository {
    public static final int $stable = 8;
    private final Api api;
    private final MessengerApi messengerApi;
    private final InterfaceC2686c<ParsedNexusEvent> nexusEventFlow;
    private final g nexusEventsRepository$delegate;
    private final UploadRepository uploadRepository;
    private final UserIdentity userIdentity;

    /* JADX INFO: compiled from: ConversationRepository.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GetConversationReason.values().length];
            try {
                iArr[GetConversationReason.NEW_COMMENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GetConversationReason.NEXUS_CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GetConversationReason.NETWORK_CONNECTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[GetConversationReason.OPEN_CONVERSATION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[GetConversationReason.POLLING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ConversationRepository(MessengerApi messengerApi, UploadRepository uploadRepository, Api api, UserIdentity userIdentity, final NexusClient nexusClient, final A scope) {
        i.e(messengerApi, "messengerApi");
        i.e(uploadRepository, "uploadRepository");
        i.e(api, "api");
        i.e(userIdentity, "userIdentity");
        i.e(nexusClient, "nexusClient");
        i.e(scope, "scope");
        this.messengerApi = messengerApi;
        this.uploadRepository = uploadRepository;
        this.api = api;
        this.userIdentity = userIdentity;
        this.nexusEventsRepository$delegate = kotlin.a.a(new Ia.a() { // from class: io.intercom.android.sdk.m5.conversation.data.a
            @Override // Ia.a
            public final Object invoke() {
                return ConversationRepository.nexusEventsRepository_delegate$lambda$0(nexusClient, this, scope);
            }
        });
        this.nexusEventFlow = NexusEventAsFlowKt.nexusEventAsFlow(nexusClient);
    }

    private final NexusEventsRepository getNexusEventsRepository() {
        return (NexusEventsRepository) this.nexusEventsRepository$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NexusEventsRepository nexusEventsRepository_delegate$lambda$0(NexusClient nexusClient, ConversationRepository this$0, A scope) {
        i.e(nexusClient, "$nexusClient");
        i.e(this$0, "this$0");
        i.e(scope, "$scope");
        return new NexusEventsRepository(nexusClient, this$0.userIdentity, scope);
    }

    public final Object addQuickReplyToConversation(String str, String str2, String str3, String str4, c<? super NetworkResponse<Part.Builder>> cVar) {
        LinkedHashMap linkedHashMapT = y.t(new Pair("reply_option_uuid", str), new Pair("client_assigned_uuid", str4));
        if (str3.length() > 0) {
            linkedHashMapT.put("quick_reply_part_id", str3);
        }
        return this.messengerApi.addConversationQuickReplySuspend(str2, MessengerApiHelper.INSTANCE.getDefaultRequestBody$intercom_sdk_base_release(linkedHashMapT), cVar);
    }

    public final Object createConversationFromSuggestion(String str, String str2, c<? super NetworkResponse<Conversation>> cVar) {
        MessengerApiHelper messengerApiHelper = MessengerApiHelper.INSTANCE;
        MapBuilder mapBuilder = new MapBuilder();
        mapBuilder.put("id", str);
        if (str2 != null) {
            mapBuilder.put("messenger_open_request_id", str2);
        }
        return this.messengerApi.triggerInboundConversationSuspend(messengerApiHelper.getDefaultRequestBody$intercom_sdk_base_release(mapBuilder.k()), cVar);
    }

    public final Object createNewConversation(List<Block.Builder> list, String str, String str2, String str3, List<ComposerSuggestions.Suggestion> list2, boolean z10, Long l10, String str4, String str5, c<? super NetworkResponse<ConversationResponse.Builder>> cVar) {
        Map<String, ? extends Object> mapBaseNewConversationParams = this.api.baseNewConversationParams();
        mapBaseNewConversationParams.put("blocks", list);
        mapBaseNewConversationParams.put("from_voice_dictation", Boolean.valueOf(z10));
        mapBaseNewConversationParams.put("client_assigned_uuid", str5);
        if (str != null) {
            mapBaseNewConversationParams.put("bot_intro", str);
        }
        if (str2 != null) {
            mapBaseNewConversationParams.put("article_id", str2);
        }
        if (str3 != null) {
            mapBaseNewConversationParams.put("resolution_bot_behavior_version_id", str3);
        }
        if (list2 != null) {
            mapBaseNewConversationParams.put(MetricTracker.Object.COMPOSER_SUGGESTIONS, new Gson().h(list2));
        }
        if (l10 != null) {
            mapBaseNewConversationParams.put("snapshot_id", l10);
        }
        if (str4 != null) {
            mapBaseNewConversationParams.put("messenger_open_request_id", str4);
        }
        return this.messengerApi.startNewConversationSuspend(MessengerApiHelper.INSTANCE.getDefaultRequestBody$intercom_sdk_base_release(mapBaseNewConversationParams), cVar);
    }

    public final void dismissPrivacyPolicy() {
        this.api.updateUser(UserUpdateRequest.create(false, false, x.o(new Pair("dismissed_privacy_policy_notice_at", Long.valueOf(System.currentTimeMillis() / ((long) Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS)))), true), new IntercomStatusCallback() { // from class: io.intercom.android.sdk.m5.conversation.data.ConversationRepository.dismissPrivacyPolicy.1
            @Override // io.intercom.android.sdk.IntercomStatusCallback
            public void onFailure(IntercomError intercomError) {
                i.e(intercomError, "intercomError");
            }

            @Override // io.intercom.android.sdk.IntercomStatusCallback
            public void onSuccess() {
            }
        });
    }

    public final Api getApi() {
        return this.api;
    }

    public final Object getConversation(String str, GetConversationReason getConversationReason, c<? super NetworkResponse<Conversation>> cVar) {
        String str2;
        int i10 = WhenMappings.$EnumSwitchMapping$0[getConversationReason.ordinal()];
        if (i10 == 1) {
            str2 = "Nexus New Comment";
        } else if (i10 == 2) {
            str2 = "Nexus Reconnected";
        } else if (i10 == 3) {
            str2 = "Internet Reconnected";
        } else if (i10 == 4) {
            str2 = "Click Conversation";
        } else {
            if (i10 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            str2 = "State Sync";
        }
        LinkedHashMap linkedHashMapT = y.t(new Pair("request_origin", str2));
        if (getConversationReason == GetConversationReason.POLLING) {
            linkedHashMapT.put("sync", "true");
        }
        return this.messengerApi.getConversationSuspend(str, MessengerApiHelper.INSTANCE.getDefaultRequestBody$intercom_sdk_base_release(linkedHashMapT), cVar);
    }

    public final MessengerApi getMessengerApi() {
        return this.messengerApi;
    }

    public final UserIdentity getUserIdentity() {
        return this.userIdentity;
    }

    public final Object loadGifs(String str, c<? super NetworkResponse<? extends GifResponse>> cVar) {
        return this.messengerApi.getGifsSuspended(MessengerApiHelper.INSTANCE.getDefaultRequestBody$intercom_sdk_base_release(!n.S(str) ? x.o(new Pair("query", str)) : y.p()), cVar);
    }

    public final Object markAsRead(String str, c<? super r> cVar) {
        Object objMarkAsReadSuspend = this.messengerApi.markAsReadSuspend(str, MessengerApiHelper.INSTANCE.getDefaultRequestBody$intercom_sdk_base_release(x.o(new Pair("app_id", Injector.get().getAppIdentity().appId()))), cVar);
        return objMarkAsReadSuspend == CoroutineSingletons.f43038b ? objMarkAsReadSuspend : r.f47939a;
    }

    public final NexusEventsRepository nexusEventsRepository() {
        return getNexusEventsRepository();
    }

    public final InterfaceC2686c<ParsedNexusEvent> realTimeEvents() {
        return this.nexusEventFlow;
    }

    public final void recordInteractions(String conversationId, String[] interactions) {
        i.e(conversationId, "conversationId");
        i.e(interactions, "interactions");
        this.api.recordInteractions(conversationId, interactions);
    }

    public final Object replyToConversation(String str, String str2, List<Block.Builder> list, Long l10, boolean z10, c<? super NetworkResponse<Part.Builder>> cVar) {
        Map<String, ? extends Object> mapCreateBaseReplyParams = this.api.createBaseReplyParams();
        mapCreateBaseReplyParams.put("blocks", list);
        mapCreateBaseReplyParams.put("client_assigned_uuid", str2);
        mapCreateBaseReplyParams.put("from_voice_dictation", Boolean.valueOf(z10));
        if (l10 != null) {
            mapCreateBaseReplyParams.put("last_admin_part_created_at", TimeFormatterExtKt.toISOFormat(l10.longValue()));
        }
        return this.messengerApi.replyToConversationSuspend(str, MessengerApiHelper.INSTANCE.getDefaultRequestBody$intercom_sdk_base_release(mapCreateBaseReplyParams), cVar);
    }

    public final Object submitForm(String str, String str2, String str3, String str4, String str5, c<? super NetworkResponse<Conversation>> cVar) {
        return this.messengerApi.submitFormSuspend(str, MessengerApiHelper.INSTANCE.getDefaultRequestBody$intercom_sdk_base_release(x.o(new Pair("form_params", y.s(new Pair("conversation_part_id", str2), new Pair("identifier", str3), new Pair("value", str4), new Pair("type", str5))))), cVar);
    }

    public final Object uploadMedia(MediaData.Media media, c<? super NetworkResponse<Upload.Builder>> cVar) {
        return this.uploadRepository.uploadFile(media, cVar);
    }

    public /* synthetic */ ConversationRepository(MessengerApi messengerApi, UploadRepository uploadRepository, Api api, UserIdentity userIdentity, NexusClient nexusClient, A a10, int i10, e eVar) {
        this((i10 & 1) != 0 ? Injector.get().getMessengerApi() : messengerApi, (i10 & 2) != 0 ? new UploadRepository(null, null, null, null, 15, null) : uploadRepository, (i10 & 4) != 0 ? Injector.get().getApi() : api, (i10 & 8) != 0 ? Injector.get().getUserIdentity() : userIdentity, (i10 & 16) != 0 ? Injector.get().getNexusClient() : nexusClient, a10);
    }
}
