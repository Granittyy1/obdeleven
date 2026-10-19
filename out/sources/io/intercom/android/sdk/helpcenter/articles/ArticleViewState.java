package io.intercom.android.sdk.helpcenter.articles;

import A1.C0575j;
import androidx.compose.animation.D;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.OpenMessengerResponse;

/* JADX INFO: compiled from: ArticleViewState.kt */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ArticleViewState {
    public static final int $stable = 0;

    /* JADX INFO: compiled from: ArticleViewState.kt */
    public static final class Content extends ArticleViewState {
        public static final int $stable = 0;
        private final ArticleMetadata articleMetadata;
        private final String articleUrl;
        private final ReactionState reactionState;
        private final TeamPresenceState teamPresenceState;
        private final WebViewStatus webViewStatus;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Content(String articleUrl, ArticleMetadata articleMetadata, WebViewStatus webViewStatus, ReactionState reactionState, TeamPresenceState teamPresenceState) {
            super(null);
            kotlin.jvm.internal.i.e(articleUrl, "articleUrl");
            kotlin.jvm.internal.i.e(webViewStatus, "webViewStatus");
            kotlin.jvm.internal.i.e(reactionState, "reactionState");
            kotlin.jvm.internal.i.e(teamPresenceState, "teamPresenceState");
            this.articleUrl = articleUrl;
            this.articleMetadata = articleMetadata;
            this.webViewStatus = webViewStatus;
            this.reactionState = reactionState;
            this.teamPresenceState = teamPresenceState;
        }

        public static /* synthetic */ Content copy$default(Content content, String str, ArticleMetadata articleMetadata, WebViewStatus webViewStatus, ReactionState reactionState, TeamPresenceState teamPresenceState, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = content.articleUrl;
            }
            if ((i10 & 2) != 0) {
                articleMetadata = content.articleMetadata;
            }
            ArticleMetadata articleMetadata2 = articleMetadata;
            if ((i10 & 4) != 0) {
                webViewStatus = content.webViewStatus;
            }
            WebViewStatus webViewStatus2 = webViewStatus;
            if ((i10 & 8) != 0) {
                reactionState = content.reactionState;
            }
            ReactionState reactionState2 = reactionState;
            if ((i10 & 16) != 0) {
                teamPresenceState = content.teamPresenceState;
            }
            return content.copy(str, articleMetadata2, webViewStatus2, reactionState2, teamPresenceState);
        }

        public final String component1() {
            return this.articleUrl;
        }

        public final ArticleMetadata component2() {
            return this.articleMetadata;
        }

        public final WebViewStatus component3() {
            return this.webViewStatus;
        }

        public final ReactionState component4() {
            return this.reactionState;
        }

        public final TeamPresenceState component5() {
            return this.teamPresenceState;
        }

        public final Content copy(String articleUrl, ArticleMetadata articleMetadata, WebViewStatus webViewStatus, ReactionState reactionState, TeamPresenceState teamPresenceState) {
            kotlin.jvm.internal.i.e(articleUrl, "articleUrl");
            kotlin.jvm.internal.i.e(webViewStatus, "webViewStatus");
            kotlin.jvm.internal.i.e(reactionState, "reactionState");
            kotlin.jvm.internal.i.e(teamPresenceState, "teamPresenceState");
            return new Content(articleUrl, articleMetadata, webViewStatus, reactionState, teamPresenceState);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Content)) {
                return false;
            }
            Content content = (Content) obj;
            return kotlin.jvm.internal.i.a(this.articleUrl, content.articleUrl) && kotlin.jvm.internal.i.a(this.articleMetadata, content.articleMetadata) && this.webViewStatus == content.webViewStatus && kotlin.jvm.internal.i.a(this.reactionState, content.reactionState) && kotlin.jvm.internal.i.a(this.teamPresenceState, content.teamPresenceState);
        }

        public final ArticleMetadata getArticleMetadata() {
            return this.articleMetadata;
        }

        public final String getArticleUrl() {
            return this.articleUrl;
        }

        public final ReactionState getReactionState() {
            return this.reactionState;
        }

        public final TeamPresenceState getTeamPresenceState() {
            return this.teamPresenceState;
        }

        public final WebViewStatus getWebViewStatus() {
            return this.webViewStatus;
        }

        public int hashCode() {
            int iHashCode = this.articleUrl.hashCode() * 31;
            ArticleMetadata articleMetadata = this.articleMetadata;
            return this.teamPresenceState.hashCode() + ((this.reactionState.hashCode() + ((this.webViewStatus.hashCode() + ((iHashCode + (articleMetadata == null ? 0 : articleMetadata.hashCode())) * 31)) * 31)) * 31);
        }

        public String toString() {
            return "Content(articleUrl=" + this.articleUrl + ", articleMetadata=" + this.articleMetadata + ", webViewStatus=" + this.webViewStatus + ", reactionState=" + this.reactionState + ", teamPresenceState=" + this.teamPresenceState + ')';
        }
    }

    /* JADX INFO: compiled from: ArticleViewState.kt */
    public static final class Error extends ArticleViewState {
        public static final int $stable = 0;
        private final int message;
        private final int retryButtonPrimaryColor;
        private final int retryButtonVisibility;

        public Error(int i10, int i11, int i12) {
            super(null);
            this.message = i10;
            this.retryButtonVisibility = i11;
            this.retryButtonPrimaryColor = i12;
        }

        public static /* synthetic */ Error copy$default(Error error, int i10, int i11, int i12, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                i10 = error.message;
            }
            if ((i13 & 2) != 0) {
                i11 = error.retryButtonVisibility;
            }
            if ((i13 & 4) != 0) {
                i12 = error.retryButtonPrimaryColor;
            }
            return error.copy(i10, i11, i12);
        }

        public final int component1() {
            return this.message;
        }

        public final int component2() {
            return this.retryButtonVisibility;
        }

        public final int component3() {
            return this.retryButtonPrimaryColor;
        }

        public final Error copy(int i10, int i11, int i12) {
            return new Error(i10, i11, i12);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Error)) {
                return false;
            }
            Error error = (Error) obj;
            return this.message == error.message && this.retryButtonVisibility == error.retryButtonVisibility && this.retryButtonPrimaryColor == error.retryButtonPrimaryColor;
        }

        public final int getMessage() {
            return this.message;
        }

        public final int getRetryButtonPrimaryColor() {
            return this.retryButtonPrimaryColor;
        }

        public final int getRetryButtonVisibility() {
            return this.retryButtonVisibility;
        }

        public int hashCode() {
            return Integer.hashCode(this.retryButtonPrimaryColor) + p005a4.q.b(this.retryButtonVisibility, Integer.hashCode(this.message) * 31, 31);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("Error(message=");
            sb2.append(this.message);
            sb2.append(", retryButtonVisibility=");
            sb2.append(this.retryButtonVisibility);
            sb2.append(", retryButtonPrimaryColor=");
            return C0575j.b(sb2, this.retryButtonPrimaryColor, ')');
        }
    }

    /* JADX INFO: compiled from: ArticleViewState.kt */
    public static final class Initial extends ArticleViewState {
        public static final int $stable = 0;
        public static final Initial INSTANCE = new Initial();

        private Initial() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: ArticleViewState.kt */
    public enum Reaction {
        None,
        Sad,
        Neutral,
        Happy;

        private static final /* synthetic */ Ba.a $ENTRIES = kotlin.enums.a.a(values());

        public static Ba.a<Reaction> getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX INFO: compiled from: ArticleViewState.kt */
    public enum WebViewStatus {
        Idle,
        Loading,
        Ready;

        private static final /* synthetic */ Ba.a $ENTRIES = kotlin.enums.a.a(values());

        public static Ba.a<WebViewStatus> getEntries() {
            return $ENTRIES;
        }
    }

    public /* synthetic */ ArticleViewState(kotlin.jvm.internal.e eVar) {
        this();
    }

    private ArticleViewState() {
    }

    /* JADX INFO: compiled from: ArticleViewState.kt */
    public static final class ConversationState {
        public static final int $stable = 0;
        private final String conversationId;
        private final int messageButtonText;

        public ConversationState(String conversationId, int i10) {
            kotlin.jvm.internal.i.e(conversationId, "conversationId");
            this.conversationId = conversationId;
            this.messageButtonText = i10;
        }

        public static /* synthetic */ ConversationState copy$default(ConversationState conversationState, String str, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = conversationState.conversationId;
            }
            if ((i11 & 2) != 0) {
                i10 = conversationState.messageButtonText;
            }
            return conversationState.copy(str, i10);
        }

        public final String component1() {
            return this.conversationId;
        }

        public final int component2() {
            return this.messageButtonText;
        }

        public final ConversationState copy(String conversationId, int i10) {
            kotlin.jvm.internal.i.e(conversationId, "conversationId");
            return new ConversationState(conversationId, i10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ConversationState)) {
                return false;
            }
            ConversationState conversationState = (ConversationState) obj;
            return kotlin.jvm.internal.i.a(this.conversationId, conversationState.conversationId) && this.messageButtonText == conversationState.messageButtonText;
        }

        public final String getConversationId() {
            return this.conversationId;
        }

        public final int getMessageButtonText() {
            return this.messageButtonText;
        }

        public int hashCode() {
            return Integer.hashCode(this.messageButtonText) + (this.conversationId.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("ConversationState(conversationId=");
            sb2.append(this.conversationId);
            sb2.append(", messageButtonText=");
            return C0575j.b(sb2, this.messageButtonText, ')');
        }

        public /* synthetic */ ConversationState(String str, int i10, int i11, kotlin.jvm.internal.e eVar) {
            this(str, (i11 & 2) != 0 ? R.string.intercom_continue_the_conversation : i10);
        }
    }

    /* JADX INFO: compiled from: ArticleViewState.kt */
    public static final class ReactionState {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);
        private static final ReactionState defaultReactionState = new ReactionState(8, R.id.start, null, 8, false, 4, null);
        private final int reactionComponentVisibility;
        private final Reaction selectedReaction;
        private final boolean shouldScrollToBottom;
        private final int teamHelpVisibility;
        private final int transitionState;

        /* JADX INFO: compiled from: ArticleViewState.kt */
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.e eVar) {
                this();
            }

            public final ReactionState getDefaultReactionState() {
                return ReactionState.defaultReactionState;
            }

            private Companion() {
            }
        }

        public ReactionState(int i10, int i11, Reaction selectedReaction, int i12, boolean z10) {
            kotlin.jvm.internal.i.e(selectedReaction, "selectedReaction");
            this.reactionComponentVisibility = i10;
            this.transitionState = i11;
            this.selectedReaction = selectedReaction;
            this.teamHelpVisibility = i12;
            this.shouldScrollToBottom = z10;
        }

        public static /* synthetic */ ReactionState copy$default(ReactionState reactionState, int i10, int i11, Reaction reaction, int i12, boolean z10, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                i10 = reactionState.reactionComponentVisibility;
            }
            if ((i13 & 2) != 0) {
                i11 = reactionState.transitionState;
            }
            int i14 = i11;
            if ((i13 & 4) != 0) {
                reaction = reactionState.selectedReaction;
            }
            Reaction reaction2 = reaction;
            if ((i13 & 8) != 0) {
                i12 = reactionState.teamHelpVisibility;
            }
            int i15 = i12;
            if ((i13 & 16) != 0) {
                z10 = reactionState.shouldScrollToBottom;
            }
            return reactionState.copy(i10, i14, reaction2, i15, z10);
        }

        public final int component1() {
            return this.reactionComponentVisibility;
        }

        public final int component2() {
            return this.transitionState;
        }

        public final Reaction component3() {
            return this.selectedReaction;
        }

        public final int component4() {
            return this.teamHelpVisibility;
        }

        public final boolean component5() {
            return this.shouldScrollToBottom;
        }

        public final ReactionState copy(int i10, int i11, Reaction selectedReaction, int i12, boolean z10) {
            kotlin.jvm.internal.i.e(selectedReaction, "selectedReaction");
            return new ReactionState(i10, i11, selectedReaction, i12, z10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ReactionState)) {
                return false;
            }
            ReactionState reactionState = (ReactionState) obj;
            return this.reactionComponentVisibility == reactionState.reactionComponentVisibility && this.transitionState == reactionState.transitionState && this.selectedReaction == reactionState.selectedReaction && this.teamHelpVisibility == reactionState.teamHelpVisibility && this.shouldScrollToBottom == reactionState.shouldScrollToBottom;
        }

        public final int getReactionComponentVisibility() {
            return this.reactionComponentVisibility;
        }

        public final Reaction getSelectedReaction() {
            return this.selectedReaction;
        }

        public final boolean getShouldScrollToBottom() {
            return this.shouldScrollToBottom;
        }

        public final int getTeamHelpVisibility() {
            return this.teamHelpVisibility;
        }

        public final int getTransitionState() {
            return this.transitionState;
        }

        public int hashCode() {
            return Boolean.hashCode(this.shouldScrollToBottom) + p005a4.q.b(this.teamHelpVisibility, (this.selectedReaction.hashCode() + p005a4.q.b(this.transitionState, Integer.hashCode(this.reactionComponentVisibility) * 31, 31)) * 31, 31);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("ReactionState(reactionComponentVisibility=");
            sb2.append(this.reactionComponentVisibility);
            sb2.append(", transitionState=");
            sb2.append(this.transitionState);
            sb2.append(", selectedReaction=");
            sb2.append(this.selectedReaction);
            sb2.append(", teamHelpVisibility=");
            sb2.append(this.teamHelpVisibility);
            sb2.append(", shouldScrollToBottom=");
            return Z3.o.d(sb2, this.shouldScrollToBottom, ')');
        }

        public /* synthetic */ ReactionState(int i10, int i11, Reaction reaction, int i12, boolean z10, int i13, kotlin.jvm.internal.e eVar) {
            this(i10, i11, (i13 & 4) != 0 ? Reaction.None : reaction, i12, z10);
        }
    }

    /* JADX INFO: compiled from: ArticleViewState.kt */
    public static final class TeamPresenceState {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);
        private static final TeamPresenceState defaultTeamPresenceState;
        private final ArticleMetadata articleMetadata;
        private final ConversationState conversationState;
        private final OpenMessengerResponse.NewConversationData.Cta ctaData;
        private final boolean isFromSearchBrowse;
        private final int messageButtonColor;
        private final int messageButtonIcon;
        private final int messageButtonText;
        private final String metricContext;
        private final String metricPlace;
        private final Integer subtitleText;

        /* JADX INFO: compiled from: ArticleViewState.kt */
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.e eVar) {
                this();
            }

            public final TeamPresenceState getDefaultTeamPresenceState() {
                return TeamPresenceState.defaultTeamPresenceState;
            }

            private Companion() {
            }
        }

        static {
            ArticleMetadata articleMetadata = null;
            ConversationState conversationState = null;
            defaultTeamPresenceState = new TeamPresenceState(articleMetadata, conversationState, Integer.valueOf(R.string.intercom_the_team_can_help_if_needed), R.string.intercom_send_us_a_message, R.drawable.intercom_new_conversation_send_button, -16777216, "article", MetricTracker.Context.STYLE_HUMAN, false, null, 512, null);
        }

        public TeamPresenceState(ArticleMetadata articleMetadata, ConversationState conversationState, Integer num, int i10, int i11, int i12, String metricPlace, String metricContext, boolean z10, OpenMessengerResponse.NewConversationData.Cta cta) {
            kotlin.jvm.internal.i.e(metricPlace, "metricPlace");
            kotlin.jvm.internal.i.e(metricContext, "metricContext");
            this.articleMetadata = articleMetadata;
            this.conversationState = conversationState;
            this.subtitleText = num;
            this.messageButtonText = i10;
            this.messageButtonIcon = i11;
            this.messageButtonColor = i12;
            this.metricPlace = metricPlace;
            this.metricContext = metricContext;
            this.isFromSearchBrowse = z10;
            this.ctaData = cta;
        }

        public final ArticleMetadata component1() {
            return this.articleMetadata;
        }

        public final OpenMessengerResponse.NewConversationData.Cta component10() {
            return this.ctaData;
        }

        public final ConversationState component2() {
            return this.conversationState;
        }

        public final Integer component3() {
            return this.subtitleText;
        }

        public final int component4() {
            return this.messageButtonText;
        }

        public final int component5() {
            return this.messageButtonIcon;
        }

        public final int component6() {
            return this.messageButtonColor;
        }

        public final String component7() {
            return this.metricPlace;
        }

        public final String component8() {
            return this.metricContext;
        }

        public final boolean component9() {
            return this.isFromSearchBrowse;
        }

        public final TeamPresenceState copy(ArticleMetadata articleMetadata, ConversationState conversationState, Integer num, int i10, int i11, int i12, String metricPlace, String metricContext, boolean z10, OpenMessengerResponse.NewConversationData.Cta cta) {
            kotlin.jvm.internal.i.e(metricPlace, "metricPlace");
            kotlin.jvm.internal.i.e(metricContext, "metricContext");
            return new TeamPresenceState(articleMetadata, conversationState, num, i10, i11, i12, metricPlace, metricContext, z10, cta);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TeamPresenceState)) {
                return false;
            }
            TeamPresenceState teamPresenceState = (TeamPresenceState) obj;
            return kotlin.jvm.internal.i.a(this.articleMetadata, teamPresenceState.articleMetadata) && kotlin.jvm.internal.i.a(this.conversationState, teamPresenceState.conversationState) && kotlin.jvm.internal.i.a(this.subtitleText, teamPresenceState.subtitleText) && this.messageButtonText == teamPresenceState.messageButtonText && this.messageButtonIcon == teamPresenceState.messageButtonIcon && this.messageButtonColor == teamPresenceState.messageButtonColor && kotlin.jvm.internal.i.a(this.metricPlace, teamPresenceState.metricPlace) && kotlin.jvm.internal.i.a(this.metricContext, teamPresenceState.metricContext) && this.isFromSearchBrowse == teamPresenceState.isFromSearchBrowse && kotlin.jvm.internal.i.a(this.ctaData, teamPresenceState.ctaData);
        }

        public final ArticleMetadata getArticleMetadata() {
            return this.articleMetadata;
        }

        public final ConversationState getConversationState() {
            return this.conversationState;
        }

        public final OpenMessengerResponse.NewConversationData.Cta getCtaData() {
            return this.ctaData;
        }

        public final int getMessageButtonColor() {
            return this.messageButtonColor;
        }

        public final int getMessageButtonIcon() {
            return this.messageButtonIcon;
        }

        public final int getMessageButtonText() {
            return this.messageButtonText;
        }

        public final String getMetricContext() {
            return this.metricContext;
        }

        public final String getMetricPlace() {
            return this.metricPlace;
        }

        public final Integer getSubtitleText() {
            return this.subtitleText;
        }

        public int hashCode() {
            ArticleMetadata articleMetadata = this.articleMetadata;
            int iHashCode = (articleMetadata == null ? 0 : articleMetadata.hashCode()) * 31;
            ConversationState conversationState = this.conversationState;
            int iHashCode2 = (iHashCode + (conversationState == null ? 0 : conversationState.hashCode())) * 31;
            Integer num = this.subtitleText;
            int iB = D.b(B1.a.b(this.metricContext, B1.a.b(this.metricPlace, p005a4.q.b(this.messageButtonColor, p005a4.q.b(this.messageButtonIcon, p005a4.q.b(this.messageButtonText, (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31, 31), 31), 31), 31), 31), 31, this.isFromSearchBrowse);
            OpenMessengerResponse.NewConversationData.Cta cta = this.ctaData;
            return iB + (cta != null ? cta.hashCode() : 0);
        }

        public final boolean isFromSearchBrowse() {
            return this.isFromSearchBrowse;
        }

        public String toString() {
            return "TeamPresenceState(articleMetadata=" + this.articleMetadata + ", conversationState=" + this.conversationState + ", subtitleText=" + this.subtitleText + ", messageButtonText=" + this.messageButtonText + ", messageButtonIcon=" + this.messageButtonIcon + ", messageButtonColor=" + this.messageButtonColor + ", metricPlace=" + this.metricPlace + ", metricContext=" + this.metricContext + ", isFromSearchBrowse=" + this.isFromSearchBrowse + ", ctaData=" + this.ctaData + ')';
        }

        public /* synthetic */ TeamPresenceState(ArticleMetadata articleMetadata, ConversationState conversationState, Integer num, int i10, int i11, int i12, String str, String str2, boolean z10, OpenMessengerResponse.NewConversationData.Cta cta, int i13, kotlin.jvm.internal.e eVar) {
            this(articleMetadata, conversationState, num, i10, i11, i12, str, str2, (i13 & 256) != 0 ? false : z10, (i13 & 512) != 0 ? null : cta);
        }
    }
}
