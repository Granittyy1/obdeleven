package io.intercom.android.sdk.m5.conversation.states;

import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: ConversationUiState.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class TeamPresenceState {
    public static final int $stable = 8;
    private final ExpandedTeamPresenceState expandedTeamPresenceState;
    private final String specialNotice;
    private final String teamIntro;

    public TeamPresenceState(ExpandedTeamPresenceState expandedTeamPresenceState, String teamIntro, String specialNotice) {
        i.e(expandedTeamPresenceState, "expandedTeamPresenceState");
        i.e(teamIntro, "teamIntro");
        i.e(specialNotice, "specialNotice");
        this.expandedTeamPresenceState = expandedTeamPresenceState;
        this.teamIntro = teamIntro;
        this.specialNotice = specialNotice;
    }

    public final ExpandedTeamPresenceState getExpandedTeamPresenceState() {
        return this.expandedTeamPresenceState;
    }

    public final String getSpecialNotice() {
        return this.specialNotice;
    }

    public final String getTeamIntro() {
        return this.teamIntro;
    }
}
