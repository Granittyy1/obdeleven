package io.intercom.android.sdk.m5.inbox.ui;

import Ia.p;
import androidx.compose.runtime.InterfaceC1084f;
import io.intercom.android.sdk.models.ActionType;
import io.intercom.android.sdk.models.EmptyState;
import p293xa.r;

/* JADX INFO: renamed from: io.intercom.android.sdk.m5.inbox.ui.ComposableSingletons$InboxEmptyScreenKt$lambda-3$1, reason: invalid class name */
/* JADX INFO: compiled from: InboxEmptyScreen.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$InboxEmptyScreenKt$lambda3$1 implements p<InterfaceC1084f, Integer, r> {
    public static final ComposableSingletons$InboxEmptyScreenKt$lambda3$1 INSTANCE = new ComposableSingletons$InboxEmptyScreenKt$lambda3$1();

    @Override // Ia.p
    public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
        invoke(interfaceC1084f, num.intValue());
        return r.f47939a;
    }

    public final void invoke(InterfaceC1084f interfaceC1084f, int i10) {
        if ((i10 & 11) == 2 && interfaceC1084f.s()) {
            interfaceC1084f.w();
            return;
        }
        InboxEmptyScreenKt.InboxEmptyScreen(new EmptyState("No messages", "Messages from the team, queries and support tickets will be visible here", new EmptyState.Action(ActionType.HELP, "Browse our help articles", null, 4, null)), true, new b(), null, interfaceC1084f, 432, 8);
    }
}
