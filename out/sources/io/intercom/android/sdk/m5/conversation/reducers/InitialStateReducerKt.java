package io.intercom.android.sdk.m5.conversation.reducers;

import io.intercom.android.sdk.m5.conversation.states.ConversationUiState;
import io.intercom.android.sdk.m5.conversation.states.LaunchMode;
import io.intercom.android.sdk.m5.conversation.states.TopAppBarUiState;
import io.intercom.android.sdk.ui.R;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: InitialStateReducer.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class InitialStateReducerKt {
    public static final ConversationUiState.Loading reduceInitialState(LaunchMode launchMode) {
        i.e(launchMode, "launchMode");
        TopAppBarUiState topAppBarUiState = TopAppBarUiState.Companion.getDefault();
        return new ConversationUiState.Loading(topAppBarUiState.m146copynf2GS8Y((16381 & 1) != 0 ? topAppBarUiState.title : null, (16381 & 2) != 0 ? topAppBarUiState.navIcon : Integer.valueOf(launchMode == LaunchMode.PROGRAMMATIC ? R.drawable.intercom_ic_close : R.drawable.intercom_ic_back), (16381 & 4) != 0 ? topAppBarUiState.subTitle : null, (16381 & 8) != 0 ? topAppBarUiState.subTitleLeadingIcon : null, (16381 & 16) != 0 ? topAppBarUiState.avatars : null, (16381 & 32) != 0 ? topAppBarUiState.displayActiveIndicator : false, (16381 & 64) != 0 ? topAppBarUiState.ticketStatusState : null, (16381 & 128) != 0 ? topAppBarUiState.headerMenuItems : null, (16381 & 256) != 0 ? topAppBarUiState.backgroundColor : null, (16381 & 512) != 0 ? topAppBarUiState.backgroundColorDark : null, (16381 & 1024) != 0 ? topAppBarUiState.contentColor : null, (16381 & 2048) != 0 ? topAppBarUiState.contentColorDark : null, (16381 & 4096) != 0 ? topAppBarUiState.subTitleColor : null, (16381 & 8192) != 0 ? topAppBarUiState.subTitleColorDark : null));
    }
}
