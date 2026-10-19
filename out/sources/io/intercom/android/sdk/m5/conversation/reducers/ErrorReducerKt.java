package io.intercom.android.sdk.m5.conversation.reducers;

import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.m5.conversation.states.ConversationUiState;
import io.intercom.android.sdk.m5.conversation.states.TopAppBarUiState;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: ErrorReducer.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ErrorReducerKt {
    public static final ConversationUiState reduceError(NetworkResponse<? extends Object> networkResponse, TopAppBarUiState topAppBarUiState) {
        i.e(networkResponse, "networkResponse");
        i.e(topAppBarUiState, "topAppBarUiState");
        return ((networkResponse instanceof NetworkResponse.ClientError) || (networkResponse instanceof NetworkResponse.ServerError)) ? new ConversationUiState.Error(false, topAppBarUiState) : new ConversationUiState.Error(true, topAppBarUiState);
    }
}
