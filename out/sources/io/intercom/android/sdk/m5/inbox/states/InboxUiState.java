package io.intercom.android.sdk.m5.inbox.states;

import androidx.paging.compose.b;
import io.intercom.android.sdk.m5.components.ErrorState;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.EmptyState;
import io.intercom.android.sdk.ui.common.IntercomTopBarState;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: InboxUiState.kt */
/* JADX INFO: loaded from: classes3.dex */
public class InboxUiState {
    public static final int $stable = IntercomTopBarState.$stable;
    private final IntercomTopBarState intercomTopBarState;

    /* JADX INFO: compiled from: InboxUiState.kt */
    public static final class Content extends InboxUiState {
        public static final int $stable = 8;
        private final ErrorState errorState;
        private final b<Conversation> inboxConversations;
        private final boolean isLoadingMore;
        private final boolean showSendMessageFab;

        public /* synthetic */ Content(IntercomTopBarState intercomTopBarState, b bVar, boolean z10, boolean z11, ErrorState errorState, int i10, e eVar) {
            this(intercomTopBarState, bVar, z10, (i10 & 8) != 0 ? false : z11, (i10 & 16) != 0 ? null : errorState);
        }

        public final ErrorState getErrorState() {
            return this.errorState;
        }

        public final b<Conversation> getInboxConversations() {
            return this.inboxConversations;
        }

        public final boolean getShowSendMessageFab() {
            return this.showSendMessageFab;
        }

        public final boolean isLoadingMore() {
            return this.isLoadingMore;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Content(IntercomTopBarState intercomTopBarState, b<Conversation> inboxConversations, boolean z10, boolean z11, ErrorState errorState) {
            super(intercomTopBarState);
            i.e(intercomTopBarState, "intercomTopBarState");
            i.e(inboxConversations, "inboxConversations");
            this.inboxConversations = inboxConversations;
            this.showSendMessageFab = z10;
            this.isLoadingMore = z11;
            this.errorState = errorState;
        }
    }

    /* JADX INFO: compiled from: InboxUiState.kt */
    public static final class Empty extends InboxUiState {
        public static final int $stable = 0;
        private final EmptyState emptyState;
        private final boolean showActionButton;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Empty(IntercomTopBarState intercomTopBarState, EmptyState emptyState, boolean z10) {
            super(intercomTopBarState);
            i.e(intercomTopBarState, "intercomTopBarState");
            i.e(emptyState, "emptyState");
            this.emptyState = emptyState;
            this.showActionButton = z10;
        }

        public final EmptyState getEmptyState() {
            return this.emptyState;
        }

        public final boolean getShowActionButton() {
            return this.showActionButton;
        }
    }

    /* JADX INFO: compiled from: InboxUiState.kt */
    public static final class Error extends InboxUiState {
        public static final int $stable = 0;
        private final ErrorState errorState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(IntercomTopBarState intercomTopBarState, ErrorState errorState) {
            super(intercomTopBarState);
            i.e(intercomTopBarState, "intercomTopBarState");
            i.e(errorState, "errorState");
            this.errorState = errorState;
        }

        public final ErrorState getErrorState() {
            return this.errorState;
        }
    }

    /* JADX INFO: compiled from: InboxUiState.kt */
    public static final class Initial extends InboxUiState {
        public static final int $stable = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Initial(IntercomTopBarState intercomTopBarState) {
            super(intercomTopBarState);
            i.e(intercomTopBarState, "intercomTopBarState");
        }
    }

    /* JADX INFO: compiled from: InboxUiState.kt */
    public static final class Loading extends InboxUiState {
        public static final int $stable = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Loading(IntercomTopBarState intercomTopBarState) {
            super(intercomTopBarState);
            i.e(intercomTopBarState, "intercomTopBarState");
        }
    }

    public InboxUiState(IntercomTopBarState intercomTopBarState) {
        i.e(intercomTopBarState, "intercomTopBarState");
        this.intercomTopBarState = intercomTopBarState;
    }

    public final IntercomTopBarState getIntercomTopBarState() {
        return this.intercomTopBarState;
    }
}
