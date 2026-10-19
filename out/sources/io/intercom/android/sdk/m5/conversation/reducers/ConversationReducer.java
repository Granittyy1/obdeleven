package io.intercom.android.sdk.m5.conversation.reducers;

import Ia.a;
import M9.b;
import Z3.o;
import com.google.android.gms.internal.measurement.M1;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.helpcenter.articles.ArticleMetadata;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.conversation.states.BottomBarUiState;
import io.intercom.android.sdk.m5.conversation.states.BottomSheetState;
import io.intercom.android.sdk.m5.conversation.states.ContentRow;
import io.intercom.android.sdk.m5.conversation.states.ConversationClientState;
import io.intercom.android.sdk.m5.conversation.states.ConversationUiState;
import io.intercom.android.sdk.m5.conversation.states.FooterNoticeState;
import io.intercom.android.sdk.m5.conversation.states.NetworkState;
import io.intercom.android.sdk.m5.conversation.states.PendingMessage;
import io.intercom.android.sdk.m5.conversation.states.TeamPresenceState;
import io.intercom.android.sdk.m5.conversation.states.TopAppBarUiState;
import io.intercom.android.sdk.m5.conversation.states.TypingIndicatorType;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.models.ActiveBot;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.AvatarDetails;
import io.intercom.android.sdk.models.ComposerSuggestions;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.FooterNotice;
import io.intercom.android.sdk.models.OpenMessengerResponse;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.StreamingPart;
import io.intercom.android.sdk.utilities.commons.TimeProvider;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlin.collections.l;
import kotlin.collections.m;
import kotlin.collections.q;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import kotlin.text.n;

/* JADX INFO: compiled from: ConversationReducer.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ConversationReducer {
    public static final int $stable = 8;
    private final a<AppConfig> config;
    private final IntercomDataLayer intercomDataLayer;
    private final TimeProvider timeProvider;
    private final a<UserIdentity> userIdentity;

    public ConversationReducer() {
        this(null, null, null, null, 15, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AppConfig _init_$lambda$0() {
        return (AppConfig) o.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserIdentity _init_$lambda$1() {
        return Injector.get().getUserIdentity();
    }

    private final boolean isBotIntroEmpty(ConversationClientState conversationClientState) {
        ComposerSuggestions composerSuggestions;
        OpenMessengerResponse.NewConversationData newConversationData;
        if (this.intercomDataLayer.getBotIntro().getValue().getBlocks().isEmpty()) {
            OpenMessengerResponse openMessengerResponse = conversationClientState.getOpenMessengerResponse();
            List<ComposerSuggestions.Suggestion> suggestions = null;
            List<Part.Builder> parts = (openMessengerResponse == null || (newConversationData = openMessengerResponse.getNewConversationData()) == null) ? null : newConversationData.getParts();
            if (parts == null || parts.isEmpty()) {
                OpenMessengerResponse openMessengerResponse2 = conversationClientState.getOpenMessengerResponse();
                if (openMessengerResponse2 != null && (composerSuggestions = openMessengerResponse2.getComposerSuggestions()) != null) {
                    suggestions = composerSuggestions.getSuggestions();
                }
                List<ComposerSuggestions.Suggestion> list = suggestions;
                if (list == null || list.isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }

    private final Part toArticlePart(ArticleMetadata articleMetadata) {
        Part partBuild = new Part.Builder().withIsInitialMessage(Boolean.TRUE).withBlocks(M1.k(new Block.Builder().withArticleId(articleMetadata.getId()).withTitle(articleMetadata.getTitle()))).build();
        i.d(partBuild, "build(...)");
        return partBuild;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v18, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r7v19, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v20, types: [java.util.ArrayList] */
    public final ConversationUiState computeUiState$intercom_sdk_base_release(ConversationClientState clientState) {
        List<Part> listParts;
        FooterNotice footerNotice;
        ?? arrayList;
        List<Avatar.Builder> avatars;
        ActiveBot activeBot;
        StreamingPart streamingPart;
        List<Part> listParts2;
        OpenMessengerResponse openMessengerResponse;
        ComposerSuggestions composerSuggestions;
        ContentRow contentRowReduceComposerSuggestions;
        OpenMessengerResponse.NewConversationData newConversationData;
        i.e(clientState, "clientState");
        Conversation conversation = clientState.getConversation();
        String conversationId = clientState.getConversationId();
        NetworkResponse<Object> lastNetworkCall = clientState.getLastNetworkCall();
        boolean z10 = true;
        boolean z11 = conversation == null && conversationId != null;
        boolean z12 = conversation == null && conversationId == null;
        boolean z13 = z12 && (clientState.getArticleMetadata() != null) && isBotIntroEmpty(clientState);
        boolean z14 = z12 && clientState.getOpenMessengerResponse() == null;
        TeamPresenceState teamPresenceStateReduceTeamPresenceState = TeamPresenceReducerKt.reduceTeamPresenceState(clientState.getConversation(), clientState.getOpenMessengerResponse());
        boolean z15 = !clientState.getPendingMessages().isEmpty();
        Conversation conversation2 = clientState.getConversation();
        OpenMessengerResponse openMessengerResponse2 = clientState.getOpenMessengerResponse();
        e eVar = null;
        TopAppBarUiState topAppBarUiStateReduceTopAppBarUiState = HeaderReducerKt.reduceTopAppBarUiState(z12, z15, conversation2, (openMessengerResponse2 == null || (newConversationData = openMessengerResponse2.getNewConversationData()) == null) ? null : newConversationData.getHeader(), this.config.invoke(), clientState.getUnreadConversationsCount(), clientState.getUnreadTicketsCount(), clientState.getLaunchMode());
        if (z11 && lastNetworkCall != null && !(lastNetworkCall instanceof NetworkResponse.Success)) {
            return ErrorReducerKt.reduceError(lastNetworkCall, topAppBarUiStateReduceTopAppBarUiState);
        }
        if (z11 || z14) {
            return LoadingStateReducerKt.reduceLoadingState(topAppBarUiStateReduceTopAppBarUiState);
        }
        NetworkState networkState = clientState.getNetworkState();
        BottomSheetState bottomSheetState = clientState.getBottomSheetState();
        BottomBarUiState bottomBarUiStateReduceComposerState = ComposerStateReducerKt.reduceComposerState(clientState, this.config.invoke(), z12);
        ListBuilder listBuilderF = M1.f();
        if (!n.S(teamPresenceStateReduceTeamPresenceState.getTeamIntro())) {
            listBuilderF.add(new ContentRow.TeamIntroRow(teamPresenceStateReduceTeamPresenceState.getTeamIntro()));
        }
        if (!n.S(teamPresenceStateReduceTeamPresenceState.getSpecialNotice())) {
            listBuilderF.add(new ContentRow.SpecialNoticeRow(teamPresenceStateReduceTeamPresenceState.getSpecialNotice()));
        }
        if (z13 && clientState.getArticleMetadata() != null) {
            listBuilderF.add(new ContentRow.AskedAboutRow(toArticlePart(clientState.getArticleMetadata())));
        }
        if (z12) {
            listBuilderF.addAll(IntroPartsReducerKt.reduceIntroParts(clientState, this.intercomDataLayer.getBotIntro().getValue(), this.timeProvider));
        }
        listBuilderF.addAll(ConversationPartsReducerKt.reduceMessages(clientState, this.userIdentity.invoke(), this.config.invoke()));
        if (z12 && clientState.getPendingMessages().isEmpty() && (openMessengerResponse = clientState.getOpenMessengerResponse()) != null && (composerSuggestions = openMessengerResponse.getComposerSuggestions()) != null && (contentRowReduceComposerSuggestions = ComposerSuggestionsReducerKt.reduceComposerSuggestions(composerSuggestions)) != null) {
            listBuilderF.add(contentRowReduceComposerSuggestions);
        }
        Conversation conversation3 = clientState.getConversation();
        if (conversation3 == null || (listParts = conversation3.parts()) == null) {
            listParts = EmptyList.f42983b;
        }
        List<Part> list = listParts;
        Collection<PendingMessage> collectionValues = clientState.getPendingMessages().values();
        ArrayList arrayList2 = new ArrayList(m.y(collectionValues, 10));
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            arrayList2.add(((PendingMessage) it.next()).getPart());
        }
        ArrayList arrayListC0 = q.c0(list, arrayList2);
        Conversation conversation4 = clientState.getConversation();
        int size = (conversation4 == null || (listParts2 = conversation4.parts()) == null) ? 0 : listParts2.size();
        int i10 = 0;
        for (Object obj : clientState.getPendingMessages().values()) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                l.x();
                throw null;
            }
            PendingMessage pendingMessage = (PendingMessage) obj;
            listBuilderF.add(new ContentRow.BubbleMessageRow(new ContentRow.BubbleMessageRow.PartWrapper(pendingMessage.getPart(), i10 == clientState.getPendingMessages().size() + (-1), ConversationPartsReducerKt.isAdminOrAltParticipant(pendingMessage.getPart(), this.userIdentity.invoke()), null, null, 24, null), ConversationPartsReducerKt.getGroupingPosition(arrayListC0, size + i10), pendingMessage.getFailedImageUploadData(), pendingMessage.isFailed(), true));
            i10 = i11;
        }
        if (conversation != null) {
            List<Part> listParts3 = conversation.parts();
            if (!(listParts3 instanceof Collection) || !listParts3.isEmpty()) {
                Iterator it2 = listParts3.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        z10 = false;
                        break;
                    }
                    Part part = (Part) it2.next();
                    String uuid = part.getUuid();
                    i.d(uuid, "getUuid(...)");
                    if (!n.S(uuid) && i.a(part.getUuid(), clientState.getFinStreamingData().getClientAssignedUUID())) {
                        break;
                    }
                }
            } else {
                z10 = false;
                break;
            }
            if (clientState.getFinStreamingData().isFinStreaming() && !z10 && (activeBot = this.intercomDataLayer.getTeamPresence().getValue().getActiveBot()) != null && (streamingPart = activeBot.getStreamingPart()) != null) {
                listBuilderF.add(new ContentRow.FinStreamingRow(clientState.getFinStreamingData().getBlocks(), streamingPart));
            }
        }
        if (clientState.getCurrentlyTypingState().getUserType() != TypingIndicatorType.NONE) {
            listBuilderF.add(new ContentRow.TypingIndicatorRow(clientState.getCurrentlyTypingState()));
        }
        if (conversation != null && (footerNotice = conversation.getFooterNotice()) != null) {
            String title = footerNotice.getTitle();
            String subtitle = footerNotice.getSubtitle();
            if (subtitle == null) {
                subtitle = "";
            }
            AvatarDetails avatarDetails = footerNotice.getAvatarDetails();
            if (avatarDetails == null || (avatars = avatarDetails.getAvatars()) == null) {
                arrayList = EmptyList.f42983b;
            } else {
                List<Avatar.Builder> list2 = avatars;
                arrayList = new ArrayList(m.y(list2, 10));
                Iterator it3 = list2.iterator();
                while (it3.hasNext()) {
                    Avatar avatarBuild = ((Avatar.Builder) it3.next()).build();
                    i.d(avatarBuild, "build(...)");
                    arrayList.add(new AvatarWrapper(avatarBuild, false, 2, eVar));
                }
            }
            listBuilderF.add(new ContentRow.FooterNoticeRow(new FooterNoticeState(title, subtitle, arrayList)));
        }
        return new ConversationUiState.Content(topAppBarUiStateReduceTopAppBarUiState, listBuilderF.I(), bottomBarUiStateReduceComposerState, networkState, bottomSheetState, clientState.getFloatingIndicatorState(), teamPresenceStateReduceTeamPresenceState);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ConversationReducer(a<AppConfig> config, a<? extends UserIdentity> userIdentity, TimeProvider timeProvider, IntercomDataLayer intercomDataLayer) {
        i.e(config, "config");
        i.e(userIdentity, "userIdentity");
        i.e(timeProvider, "timeProvider");
        i.e(intercomDataLayer, "intercomDataLayer");
        this.config = config;
        this.userIdentity = userIdentity;
        this.timeProvider = timeProvider;
        this.intercomDataLayer = intercomDataLayer;
    }

    public /* synthetic */ ConversationReducer(a aVar, a aVar2, TimeProvider timeProvider, IntercomDataLayer intercomDataLayer, int i10, e eVar) {
        this((i10 & 1) != 0 ? new M9.a(0) : aVar, (i10 & 2) != 0 ? new b(0) : aVar2, (i10 & 4) != 0 ? TimeProvider.SYSTEM : timeProvider, (i10 & 8) != 0 ? Injector.get().getDataLayer() : intercomDataLayer);
    }
}
