package io.intercom.android.sdk.m5.conversation.states;

import java.util.List;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import p005a4.p;

/* JADX INFO: compiled from: ConversationUiState.kt */
/* JADX INFO: loaded from: classes3.dex */
public interface ConversationUiState {

    /* JADX INFO: compiled from: ConversationUiState.kt */
    public static final class Error implements ConversationUiState {
        public static final int $stable = 8;
        private final boolean showCta;
        private final TopAppBarUiState topAppBarUiState;

        public Error(boolean z10, TopAppBarUiState topAppBarUiState) {
            i.e(topAppBarUiState, "topAppBarUiState");
            this.showCta = z10;
            this.topAppBarUiState = topAppBarUiState;
        }

        public static /* synthetic */ Error copy$default(Error error, boolean z10, TopAppBarUiState topAppBarUiState, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = error.showCta;
            }
            if ((i10 & 2) != 0) {
                topAppBarUiState = error.topAppBarUiState;
            }
            return error.copy(z10, topAppBarUiState);
        }

        public final boolean component1() {
            return this.showCta;
        }

        public final TopAppBarUiState component2() {
            return this.topAppBarUiState;
        }

        public final Error copy(boolean z10, TopAppBarUiState topAppBarUiState) {
            i.e(topAppBarUiState, "topAppBarUiState");
            return new Error(z10, topAppBarUiState);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Error)) {
                return false;
            }
            Error error = (Error) obj;
            return this.showCta == error.showCta && i.a(this.topAppBarUiState, error.topAppBarUiState);
        }

        public final boolean getShowCta() {
            return this.showCta;
        }

        @Override // io.intercom.android.sdk.m5.conversation.states.ConversationUiState
        public TopAppBarUiState getTopAppBarUiState() {
            return this.topAppBarUiState;
        }

        public int hashCode() {
            return this.topAppBarUiState.hashCode() + (Boolean.hashCode(this.showCta) * 31);
        }

        public String toString() {
            return "Error(showCta=" + this.showCta + ", topAppBarUiState=" + this.topAppBarUiState + ')';
        }
    }

    /* JADX INFO: compiled from: ConversationUiState.kt */
    public static final class Loading implements ConversationUiState {
        public static final int $stable = 8;
        private final TopAppBarUiState topAppBarUiState;

        public Loading(TopAppBarUiState topAppBarUiState) {
            i.e(topAppBarUiState, "topAppBarUiState");
            this.topAppBarUiState = topAppBarUiState;
        }

        public static /* synthetic */ Loading copy$default(Loading loading, TopAppBarUiState topAppBarUiState, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                topAppBarUiState = loading.topAppBarUiState;
            }
            return loading.copy(topAppBarUiState);
        }

        public final TopAppBarUiState component1() {
            return this.topAppBarUiState;
        }

        public final Loading copy(TopAppBarUiState topAppBarUiState) {
            i.e(topAppBarUiState, "topAppBarUiState");
            return new Loading(topAppBarUiState);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Loading) && i.a(this.topAppBarUiState, ((Loading) obj).topAppBarUiState);
        }

        @Override // io.intercom.android.sdk.m5.conversation.states.ConversationUiState
        public TopAppBarUiState getTopAppBarUiState() {
            return this.topAppBarUiState;
        }

        public int hashCode() {
            return this.topAppBarUiState.hashCode();
        }

        public String toString() {
            return "Loading(topAppBarUiState=" + this.topAppBarUiState + ')';
        }
    }

    TopAppBarUiState getTopAppBarUiState();

    /* JADX INFO: compiled from: ConversationUiState.kt */
    public static final class Content implements ConversationUiState {
        public static final int $stable = 8;
        private final BottomBarUiState bottomBarUiState;
        private final BottomSheetState bottomSheetState;
        private final List<ContentRow> contentRows;
        private final FloatingIndicatorState floatingIndicatorState;
        private final NetworkState networkState;
        private final TeamPresenceState teamPresenceState;
        private final TopAppBarUiState topAppBarUiState;

        /* JADX WARN: Multi-variable type inference failed */
        public Content(TopAppBarUiState topAppBarUiState, List<? extends ContentRow> contentRows, BottomBarUiState bottomBarUiState, NetworkState networkState, BottomSheetState bottomSheetState, FloatingIndicatorState floatingIndicatorState, TeamPresenceState teamPresenceState) {
            i.e(topAppBarUiState, "topAppBarUiState");
            i.e(contentRows, "contentRows");
            i.e(bottomBarUiState, "bottomBarUiState");
            i.e(networkState, "networkState");
            i.e(bottomSheetState, "bottomSheetState");
            i.e(floatingIndicatorState, "floatingIndicatorState");
            i.e(teamPresenceState, "teamPresenceState");
            this.topAppBarUiState = topAppBarUiState;
            this.contentRows = contentRows;
            this.bottomBarUiState = bottomBarUiState;
            this.networkState = networkState;
            this.bottomSheetState = bottomSheetState;
            this.floatingIndicatorState = floatingIndicatorState;
            this.teamPresenceState = teamPresenceState;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Content copy$default(Content content, TopAppBarUiState topAppBarUiState, List list, BottomBarUiState bottomBarUiState, NetworkState networkState, BottomSheetState bottomSheetState, FloatingIndicatorState floatingIndicatorState, TeamPresenceState teamPresenceState, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                topAppBarUiState = content.topAppBarUiState;
            }
            if ((i10 & 2) != 0) {
                list = content.contentRows;
            }
            List list2 = list;
            if ((i10 & 4) != 0) {
                bottomBarUiState = content.bottomBarUiState;
            }
            BottomBarUiState bottomBarUiState2 = bottomBarUiState;
            if ((i10 & 8) != 0) {
                networkState = content.networkState;
            }
            NetworkState networkState2 = networkState;
            if ((i10 & 16) != 0) {
                bottomSheetState = content.bottomSheetState;
            }
            BottomSheetState bottomSheetState2 = bottomSheetState;
            if ((i10 & 32) != 0) {
                floatingIndicatorState = content.floatingIndicatorState;
            }
            FloatingIndicatorState floatingIndicatorState2 = floatingIndicatorState;
            if ((i10 & 64) != 0) {
                teamPresenceState = content.teamPresenceState;
            }
            return content.copy(topAppBarUiState, list2, bottomBarUiState2, networkState2, bottomSheetState2, floatingIndicatorState2, teamPresenceState);
        }

        public final TopAppBarUiState component1() {
            return this.topAppBarUiState;
        }

        public final List<ContentRow> component2() {
            return this.contentRows;
        }

        public final BottomBarUiState component3() {
            return this.bottomBarUiState;
        }

        public final NetworkState component4() {
            return this.networkState;
        }

        public final BottomSheetState component5() {
            return this.bottomSheetState;
        }

        public final FloatingIndicatorState component6() {
            return this.floatingIndicatorState;
        }

        public final TeamPresenceState component7() {
            return this.teamPresenceState;
        }

        public final Content copy(TopAppBarUiState topAppBarUiState, List<? extends ContentRow> contentRows, BottomBarUiState bottomBarUiState, NetworkState networkState, BottomSheetState bottomSheetState, FloatingIndicatorState floatingIndicatorState, TeamPresenceState teamPresenceState) {
            i.e(topAppBarUiState, "topAppBarUiState");
            i.e(contentRows, "contentRows");
            i.e(bottomBarUiState, "bottomBarUiState");
            i.e(networkState, "networkState");
            i.e(bottomSheetState, "bottomSheetState");
            i.e(floatingIndicatorState, "floatingIndicatorState");
            i.e(teamPresenceState, "teamPresenceState");
            return new Content(topAppBarUiState, contentRows, bottomBarUiState, networkState, bottomSheetState, floatingIndicatorState, teamPresenceState);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Content)) {
                return false;
            }
            Content content = (Content) obj;
            return i.a(this.topAppBarUiState, content.topAppBarUiState) && i.a(this.contentRows, content.contentRows) && i.a(this.bottomBarUiState, content.bottomBarUiState) && i.a(this.networkState, content.networkState) && i.a(this.bottomSheetState, content.bottomSheetState) && i.a(this.floatingIndicatorState, content.floatingIndicatorState) && i.a(this.teamPresenceState, content.teamPresenceState);
        }

        public final BottomBarUiState getBottomBarUiState() {
            return this.bottomBarUiState;
        }

        public final BottomSheetState getBottomSheetState() {
            return this.bottomSheetState;
        }

        public final List<ContentRow> getContentRows() {
            return this.contentRows;
        }

        public final FloatingIndicatorState getFloatingIndicatorState() {
            return this.floatingIndicatorState;
        }

        public final NetworkState getNetworkState() {
            return this.networkState;
        }

        public final TeamPresenceState getTeamPresenceState() {
            return this.teamPresenceState;
        }

        @Override // io.intercom.android.sdk.m5.conversation.states.ConversationUiState
        public TopAppBarUiState getTopAppBarUiState() {
            return this.topAppBarUiState;
        }

        public int hashCode() {
            return this.teamPresenceState.hashCode() + ((this.floatingIndicatorState.hashCode() + ((this.bottomSheetState.hashCode() + ((this.networkState.hashCode() + ((this.bottomBarUiState.hashCode() + p.d(this.topAppBarUiState.hashCode() * 31, 31, this.contentRows)) * 31)) * 31)) * 31)) * 31);
        }

        public String toString() {
            return "Content(topAppBarUiState=" + this.topAppBarUiState + ", contentRows=" + this.contentRows + ", bottomBarUiState=" + this.bottomBarUiState + ", networkState=" + this.networkState + ", bottomSheetState=" + this.bottomSheetState + ", floatingIndicatorState=" + this.floatingIndicatorState + ", teamPresenceState=" + this.teamPresenceState + ')';
        }

        public /* synthetic */ Content(TopAppBarUiState topAppBarUiState, List list, BottomBarUiState bottomBarUiState, NetworkState networkState, BottomSheetState bottomSheetState, FloatingIndicatorState floatingIndicatorState, TeamPresenceState teamPresenceState, int i10, e eVar) {
            this(topAppBarUiState, list, bottomBarUiState, (i10 & 8) != 0 ? NetworkState.Connected.INSTANCE : networkState, (i10 & 16) != 0 ? BottomSheetState.Empty.INSTANCE : bottomSheetState, floatingIndicatorState, teamPresenceState);
        }
    }
}
