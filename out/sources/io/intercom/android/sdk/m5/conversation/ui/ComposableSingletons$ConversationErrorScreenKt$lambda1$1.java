package io.intercom.android.sdk.m5.conversation.ui;

import androidx.compose.runtime.InterfaceC1084f;
import io.intercom.android.sdk.m5.conversation.states.ConversationUiState;
import io.intercom.android.sdk.m5.conversation.states.TopAppBarUiState;

/* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ui.ComposableSingletons$ConversationErrorScreenKt$lambda-1$1, reason: invalid class name */
/* JADX INFO: compiled from: ConversationErrorScreen.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$ConversationErrorScreenKt$lambda1$1 implements Ia.p<InterfaceC1084f, Integer, p293xa.r> {
    public static final ComposableSingletons$ConversationErrorScreenKt$lambda1$1 INSTANCE = new ComposableSingletons$ConversationErrorScreenKt$lambda1$1();

    @Override // Ia.p
    public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
        invoke(interfaceC1084f, num.intValue());
        return p293xa.r.f47939a;
    }

    public final void invoke(InterfaceC1084f interfaceC1084f, int i10) {
        if ((i10 & 11) == 2 && interfaceC1084f.s()) {
            interfaceC1084f.w();
        } else {
            ConversationErrorScreenKt.ConversationErrorScreen(new ConversationUiState.Error(true, TopAppBarUiState.Companion.getDefault()), new C2324a(), null, interfaceC1084f, 56, 4);
        }
    }
}
