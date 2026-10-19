package io.intercom.android.sdk.m5.conversation.reducers;

import io.intercom.android.sdk.m5.conversation.states.ConversationUiState;
import io.intercom.android.sdk.m5.conversation.states.TopAppBarUiState;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: LoadingStateReducer.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class LoadingStateReducerKt {
    public static final ConversationUiState.Loading reduceLoadingState(TopAppBarUiState topAppBarUiState) {
        i.e(topAppBarUiState, "topAppBarUiState");
        TopAppBarUiState topAppBarUiState2 = TopAppBarUiState.Companion.getDefault();
        return new ConversationUiState.Loading(topAppBarUiState2.m146copynf2GS8Y((16381 & 1) != 0 ? topAppBarUiState2.title : null, (16381 & 2) != 0 ? topAppBarUiState2.navIcon : topAppBarUiState.getNavIcon(), (16381 & 4) != 0 ? topAppBarUiState2.subTitle : null, (16381 & 8) != 0 ? topAppBarUiState2.subTitleLeadingIcon : null, (16381 & 16) != 0 ? topAppBarUiState2.avatars : null, (16381 & 32) != 0 ? topAppBarUiState2.displayActiveIndicator : false, (16381 & 64) != 0 ? topAppBarUiState2.ticketStatusState : null, (16381 & 128) != 0 ? topAppBarUiState2.headerMenuItems : null, (16381 & 256) != 0 ? topAppBarUiState2.backgroundColor : null, (16381 & 512) != 0 ? topAppBarUiState2.backgroundColorDark : null, (16381 & 1024) != 0 ? topAppBarUiState2.contentColor : null, (16381 & 2048) != 0 ? topAppBarUiState2.contentColorDark : null, (16381 & 4096) != 0 ? topAppBarUiState2.subTitleColor : null, (16381 & 8192) != 0 ? topAppBarUiState2.subTitleColorDark : null));
    }
}
