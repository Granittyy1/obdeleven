package io.intercom.android.sdk.api;

import gc.o;
import gc.p;
import gc.s;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.m5.home.data.HomeV2Response;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.ConversationResponse;
import io.intercom.android.sdk.models.ConversationsResponse;
import io.intercom.android.sdk.models.GifResponse;
import io.intercom.android.sdk.models.LinkResponse;
import io.intercom.android.sdk.models.LogEventResponse;
import io.intercom.android.sdk.models.OpenMessengerResponse;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.Sheet;
import io.intercom.android.sdk.models.UpdateUserResponse;
import io.intercom.android.sdk.models.Upload;
import io.intercom.android.sdk.models.UsersResponse;
import io.intercom.android.sdk.models.carousel.CarouselResponse;
import io.intercom.android.sdk.survey.model.FetchSurveyRequest;
import okhttp3.y;
import retrofit2.d;

/* JADX INFO: compiled from: MessengerApi.kt */
/* JADX INFO: loaded from: classes3.dex */
public interface MessengerApi {

    /* JADX INFO: compiled from: MessengerApi.kt */
    public static final class DefaultImpls {
        public static /* synthetic */ Object getConversationSuspend$default(MessengerApi messengerApi, String str, y yVar, kotlin.coroutines.c cVar, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getConversationSuspend");
            }
            if ((i10 & 2) != 0) {
                yVar = MessengerApiHelper.getDefaultRequestBody$intercom_sdk_base_release$default(MessengerApiHelper.INSTANCE, null, 1, null);
            }
            return messengerApi.getConversationSuspend(str, yVar, cVar);
        }

        public static /* synthetic */ Object getConversationsSuspend$default(MessengerApi messengerApi, y yVar, kotlin.coroutines.c cVar, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getConversationsSuspend");
            }
            if ((i10 & 1) != 0) {
                yVar = MessengerApiHelper.getDefaultRequestBody$intercom_sdk_base_release$default(MessengerApiHelper.INSTANCE, null, 1, null);
            }
            return messengerApi.getConversationsSuspend(yVar, cVar);
        }

        public static /* synthetic */ Object getHomeCardsV2Suspend$default(MessengerApi messengerApi, y yVar, kotlin.coroutines.c cVar, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getHomeCardsV2Suspend");
            }
            if ((i10 & 1) != 0) {
                yVar = MessengerApiHelper.getDefaultRequestBody$intercom_sdk_base_release$default(MessengerApiHelper.INSTANCE, null, 1, null);
            }
            return messengerApi.getHomeCardsV2Suspend(yVar, cVar);
        }

        public static /* synthetic */ Object getUnreadConversationsSuspended$default(MessengerApi messengerApi, y yVar, kotlin.coroutines.c cVar, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getUnreadConversationsSuspended");
            }
            if ((i10 & 1) != 0) {
                yVar = MessengerApiHelper.getDefaultRequestBody$intercom_sdk_base_release$default(MessengerApiHelper.INSTANCE, null, 1, null);
            }
            return messengerApi.getUnreadConversationsSuspended(yVar, cVar);
        }

        public static /* synthetic */ Object openMessengerSuspended$default(MessengerApi messengerApi, y yVar, kotlin.coroutines.c cVar, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openMessengerSuspended");
            }
            if ((i10 & 1) != 0) {
                yVar = MessengerApiHelper.getDefaultRequestBody$intercom_sdk_base_release$default(MessengerApiHelper.INSTANCE, null, 1, null);
            }
            return messengerApi.openMessengerSuspended(yVar, cVar);
        }
    }

    @o("conversations/{conversationId}/quick_reply")
    Object addConversationQuickReplySuspend(@s("conversationId") String str, @gc.a y yVar, kotlin.coroutines.c<? super NetworkResponse<Part.Builder>> cVar);

    @o("conversations/{conversationId}/remark")
    d<Void> addConversationRatingRemark(@s("conversationId") String str, @gc.a y yVar);

    @p("device_tokens")
    d<Void> deleteDeviceToken(@gc.a y yVar);

    @o("content/fetch_carousel")
    d<CarouselResponse.Builder> getCarousel(@gc.a y yVar);

    @o("conversations/{conversationId}")
    Object getConversationSuspend(@s("conversationId") String str, @gc.a y yVar, kotlin.coroutines.c<? super NetworkResponse<Conversation>> cVar);

    @o("conversations/inbox")
    Object getConversationsSuspend(@gc.a y yVar, kotlin.coroutines.c<? super NetworkResponse<ConversationsResponse.Builder>> cVar);

    @o("gifs")
    Object getGifsSuspended(@gc.a y yVar, kotlin.coroutines.c<? super NetworkResponse<? extends GifResponse>> cVar);

    @o("home")
    Object getHomeCardsV2Suspend(@gc.a y yVar, kotlin.coroutines.c<? super NetworkResponse<HomeV2Response>> cVar);

    @o("articles/{articleId}")
    d<LinkResponse.Builder> getLink(@s("articleId") String str, @gc.a y yVar);

    @o("carousels/{carouselId}/fetch")
    d<CarouselResponse.Builder> getProgrammaticCarousel(@s("carouselId") String str, @gc.a y yVar);

    @o("sheets/open")
    d<Sheet.Builder> getSheet(@gc.a y yVar);

    @o("content/fetch_survey")
    d<FetchSurveyRequest> getSurvey(@gc.a y yVar);

    @o("conversations/unread")
    d<UsersResponse.Builder> getUnreadConversations(@gc.a y yVar);

    @o("conversations/unread")
    Object getUnreadConversationsSuspended(@gc.a y yVar, kotlin.coroutines.c<? super NetworkResponse<? extends UsersResponse.Builder>> cVar);

    @o("uploads")
    Object getUploadFileUrlSuspended(@gc.a y yVar, kotlin.coroutines.c<? super NetworkResponse<Upload.Builder>> cVar);

    @o("events")
    d<LogEventResponse.Builder> logEvent(@gc.a y yVar);

    @o("conversations/dismiss")
    d<Void> markAsDismissed(@gc.a y yVar);

    @o("conversations/{conversationId}/read")
    d<Void> markAsRead(@s("conversationId") String str, @gc.a y yVar);

    @o("conversations/{conversationId}/read")
    Object markAsReadSuspend(@s("conversationId") String str, @gc.a y yVar, kotlin.coroutines.c<? super NetworkResponse<Void>> cVar);

    @o("stats_system/carousel_button_action_tapped")
    d<Void> markCarouselActionButtonTapped(@gc.a y yVar);

    @o("stats_system/carousel_completed")
    d<Void> markCarouselAsCompleted(@gc.a y yVar);

    @o("stats_system/carousel_dismissed")
    d<Void> markCarouselAsDismissed(@gc.a y yVar);

    @o("stats_system/carousel_screen_viewed")
    d<Void> markCarouselScreenViewed(@gc.a y yVar);

    @o("stats_system/carousel_permission_granted")
    d<Void> markPermissionGranted(@gc.a y yVar);

    @o("stats_system/push_opened")
    d<Void> markPushAsOpened(@gc.a y yVar);

    @o("open")
    d<OpenMessengerResponse> openMessenger(@gc.a y yVar);

    @o("open")
    Object openMessengerSuspended(@gc.a y yVar, kotlin.coroutines.c<? super NetworkResponse<OpenMessengerResponse>> cVar);

    @o("conversations/{conversationId}/rate")
    d<Void> rateConversation(@s("conversationId") String str, @gc.a y yVar);

    @o("conversations/{conversationId}/react")
    d<Void> reactToConversation(@s("conversationId") String str, @gc.a y yVar);

    @o("articles/{articleId}/react")
    d<Void> reactToLink(@s("articleId") String str, @gc.a y yVar);

    @o("conversations/{conversationId}/record_interactions")
    d<Void> recordInteractions(@s("conversationId") String str, @gc.a y yVar);

    @o("conversations/{conversationId}/reply")
    Object replyToConversationSuspend(@s("conversationId") String str, @gc.a y yVar, kotlin.coroutines.c<? super NetworkResponse<Part.Builder>> cVar);

    @o("error_reports")
    d<Void> reportError(@gc.a y yVar);

    @o("metrics")
    d<Void> sendMetrics(@gc.a y yVar);

    @o("user_auth_tokens")
    d<Void> setAuthToken(@gc.a y yVar);

    @o("device_tokens")
    d<Void> setDeviceToken(@gc.a y yVar);

    @o("conversations")
    Object startNewConversationSuspend(@gc.a y yVar, kotlin.coroutines.c<? super NetworkResponse<ConversationResponse.Builder>> cVar);

    @o("conversations/{conversationId}/form")
    Object submitFormSuspend(@s("conversationId") String str, @gc.a y yVar, kotlin.coroutines.c<? super NetworkResponse<Conversation>> cVar);

    @o("sheets/submit")
    d<Void> submitSheet(@gc.a y yVar);

    @o("custom_bots/trigger_inbound_conversation")
    Object triggerInboundConversationSuspend(@gc.a y yVar, kotlin.coroutines.c<? super NetworkResponse<Conversation>> cVar);

    @o("users")
    d<UpdateUserResponse.Builder> updateUser(@gc.a y yVar);
}
