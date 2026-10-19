package io.intercom.android.sdk.m5.home.reducers;

import Ia.a;
import Z3.o;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.m5.components.ErrorState;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.m5.home.data.HomeCardType;
import io.intercom.android.sdk.m5.home.data.HomeCards;
import io.intercom.android.sdk.m5.home.data.HomeV2Response;
import io.intercom.android.sdk.m5.home.states.HomeClientState;
import io.intercom.android.sdk.m5.home.states.HomeUiState;
import io.intercom.android.sdk.models.ActiveBot;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.OpenMessengerResponse;
import io.intercom.android.sdk.models.Participant;
import io.intercom.android.sdk.models.PoweredBy;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.m;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import p293xa.r;

/* JADX INFO: compiled from: HomeReducer.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class HomeReducer {
    public static final int $stable = 8;
    private final a<AppConfig> config;
    private final IntercomDataLayer intercomDataLayer;

    /* JADX WARN: Multi-variable type inference failed */
    public HomeReducer() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AppConfig _init_$lambda$0() {
        return (AppConfig) o.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final List<HomeCards> reduceHomeCards(List<? extends HomeCards> list, OpenMessengerResponse.NewConversationData newConversationData) {
        if (newConversationData == null) {
            return list;
        }
        List<? extends HomeCards> list2 = list;
        ArrayList arrayList = new ArrayList(m.y(list2, 10));
        for (HomeCards homeNewConversationData : list2) {
            if (homeNewConversationData instanceof HomeCards.HomeNewConversationData) {
                HomeCards.HomeNewConversationData homeNewConversationData2 = (HomeCards.HomeNewConversationData) homeNewConversationData;
                homeNewConversationData = new HomeCards.HomeNewConversationData("", HomeCardType.NEW_CONVERSATION, homeNewConversationData2.getAction(), homeNewConversationData2.getPreventMultipleInboundConversationsEnabled(), homeNewConversationData2.getOpenInboundConversationsIds(), homeNewConversationData2.getShowFinAvatar(), homeNewConversationData2.getShowTeammateExpectations(), newConversationData.getHomeCard());
            }
            arrayList.add(homeNewConversationData);
        }
        return arrayList;
    }

    public final HomeUiState computeUiState$intercom_sdk_base_release(HomeClientState homeClientState, a<r> onRetryClicked) {
        Participant.Builder participant;
        Participant participantBuild;
        i.e(homeClientState, "homeClientState");
        i.e(onRetryClicked, "onRetryClicked");
        OpenMessengerResponse openMessengerResponseData = homeClientState.getOpenMessengerResponseData();
        AvatarWrapper avatarWrapper = null;
        OpenMessengerResponse.NewConversationData newConversationData = openMessengerResponseData != null ? openMessengerResponseData.getNewConversationData() : null;
        NetworkResponse<HomeV2Response> homeResponse = homeClientState.getHomeResponse();
        if ((homeResponse instanceof NetworkResponse.ClientError) || (homeResponse instanceof NetworkResponse.ServerError)) {
            return new HomeUiState.Error(null, new ErrorState.WithoutCTA(0, 0, null, 7, null), HomeHeaderStateReducerKt.computeErrorHeader(this.config.invoke().getConfigModules()));
        }
        if (homeResponse instanceof NetworkResponse.NetworkError) {
            return new HomeUiState.Error(null, new ErrorState.WithCTA(0, 0, null, 0, onRetryClicked, 15, null), HomeHeaderStateReducerKt.computeErrorHeader(this.config.invoke().getConfigModules()));
        }
        if (!(homeResponse instanceof NetworkResponse.Success)) {
            if (homeResponse == null) {
                return new HomeUiState.Loading(null);
            }
            throw new NoWhenBranchMatchedException();
        }
        OpenMessengerResponse openMessengerResponseData2 = homeClientState.getOpenMessengerResponseData();
        PoweredBy poweredBy = openMessengerResponseData2 != null ? openMessengerResponseData2.getPoweredBy() : null;
        List<HomeCards> listReduceHomeCards = reduceHomeCards(((HomeV2Response) ((NetworkResponse.Success) homeResponse).getBody()).getCards(), newConversationData);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listReduceHomeCards) {
            HomeCards homeCards = (HomeCards) obj;
            if (homeCards instanceof HomeCards.HomeNewConversationData) {
                HomeCards.HomeNewConversationData homeNewConversationData = (HomeCards.HomeNewConversationData) homeCards;
                if (!homeNewConversationData.getPreventMultipleInboundConversationsEnabled() || homeNewConversationData.getOpenInboundConversationsIds().isEmpty()) {
                }
            }
            arrayList.add(obj);
        }
        List<Participant> builtActiveAdmins = this.intercomDataLayer.getTeamPresence().getValue().getBuiltActiveAdmins();
        ArrayList arrayList2 = new ArrayList(m.y(builtActiveAdmins, 10));
        for (Participant participant2 : builtActiveAdmins) {
            Avatar avatar = participant2.getAvatar();
            i.d(avatar, "getAvatar(...)");
            Boolean boolIsBot = participant2.isBot();
            i.d(boolIsBot, "isBot(...)");
            arrayList2.add(new AvatarWrapper(avatar, boolIsBot.booleanValue()));
        }
        ActiveBot activeBot = this.intercomDataLayer.getTeamPresence().getValue().getActiveBot();
        if (activeBot != null && (participant = activeBot.getParticipant()) != null && (participantBuild = participant.build()) != null) {
            Avatar avatar2 = participantBuild.getAvatar();
            i.d(avatar2, "getAvatar(...)");
            Boolean boolIsBot2 = participantBuild.isBot();
            i.d(boolIsBot2, "isBot(...)");
            avatarWrapper = new AvatarWrapper(avatar2, boolIsBot2.booleanValue());
        }
        return new HomeUiState.Content(poweredBy, arrayList, arrayList2, avatarWrapper, this.config.invoke().isAccessToTeammateEnabled(), HomeHeaderStateReducerKt.computeContentHeader(this.config.invoke().getConfigModules(), this.intercomDataLayer.getTeamPresence().getValue(), homeClientState.isHeaderImageLoaded()));
    }

    public HomeReducer(a<AppConfig> config, IntercomDataLayer intercomDataLayer) {
        i.e(config, "config");
        i.e(intercomDataLayer, "intercomDataLayer");
        this.config = config;
        this.intercomDataLayer = intercomDataLayer;
    }

    public /* synthetic */ HomeReducer(a aVar, IntercomDataLayer intercomDataLayer, int i10, e eVar) {
        this((i10 & 1) != 0 ? new O9.a(0) : aVar, (i10 & 2) != 0 ? Injector.get().getDataLayer() : intercomDataLayer);
    }
}
