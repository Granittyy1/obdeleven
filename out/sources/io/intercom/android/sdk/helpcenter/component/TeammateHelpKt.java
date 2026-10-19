package io.intercom.android.sdk.helpcenter.component;

import io.intercom.android.sdk.R;
import io.intercom.android.sdk.helpcenter.articles.ArticleMetadata;
import io.intercom.android.sdk.helpcenter.articles.ArticleViewState;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.ActiveBot;
import io.intercom.android.sdk.models.TeamPresence;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: TeammateHelp.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class TeammateHelpKt {
    public static final ArticleViewState.TeamPresenceState computeViewState(ArticleMetadata articleMetadata, ArticleViewState.TeamPresenceState currentState, TeamPresence teamPresence, AppConfig appConfig, String metricPlace, boolean z10) {
        String str;
        int i10;
        Integer numValueOf;
        i.e(currentState, "currentState");
        i.e(teamPresence, "teamPresence");
        i.e(appConfig, "appConfig");
        i.e(metricPlace, "metricPlace");
        int messageButtonText = currentState.getMessageButtonText();
        int messageButtonIcon = currentState.getMessageButtonIcon();
        Integer subtitleText = currentState.getSubtitleText();
        ActiveBot activeBot = teamPresence.getActiveBot();
        if (activeBot == null || !activeBot.getUseBotUx()) {
            str = MetricTracker.Context.STYLE_HUMAN;
            i10 = messageButtonIcon;
            numValueOf = subtitleText;
        } else {
            messageButtonText = R.string.intercom_ask_a_question;
            int i11 = R.drawable.intercom_conversation_card_question;
            numValueOf = appConfig.isAccessToTeammateEnabled() ? Integer.valueOf(R.string.intercom_the_team_can_help_if_needed) : null;
            i10 = i11;
            str = MetricTracker.Context.STYLE_BOT;
        }
        return currentState.copy((511 & 1) != 0 ? currentState.articleMetadata : articleMetadata, (511 & 2) != 0 ? currentState.conversationState : null, (511 & 4) != 0 ? currentState.subtitleText : numValueOf, (511 & 8) != 0 ? currentState.messageButtonText : messageButtonText, (511 & 16) != 0 ? currentState.messageButtonIcon : i10, (511 & 32) != 0 ? currentState.messageButtonColor : appConfig.getPrimaryColor(), (511 & 64) != 0 ? currentState.metricPlace : metricPlace, (511 & 128) != 0 ? currentState.metricContext : str, (511 & 256) != 0 ? currentState.isFromSearchBrowse : z10, (511 & 512) != 0 ? currentState.ctaData : null);
    }
}
