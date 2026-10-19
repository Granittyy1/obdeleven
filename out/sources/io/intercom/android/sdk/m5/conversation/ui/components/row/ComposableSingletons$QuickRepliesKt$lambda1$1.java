package io.intercom.android.sdk.m5.conversation.ui.components.row;

import androidx.compose.runtime.InterfaceC1084f;

/* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ui.components.row.ComposableSingletons$QuickRepliesKt$lambda-1$1, reason: invalid class name */
/* JADX INFO: compiled from: QuickReplies.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$QuickRepliesKt$lambda1$1 implements Ia.p<InterfaceC1084f, Integer, p293xa.r> {
    public static final ComposableSingletons$QuickRepliesKt$lambda1$1 INSTANCE = new ComposableSingletons$QuickRepliesKt$lambda1$1();

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r invoke$lambda$0(QuickReply it) {
        kotlin.jvm.internal.i.e(it, "it");
        return p293xa.r.f47939a;
    }

    @Override // Ia.p
    public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
        invoke(interfaceC1084f, num.intValue());
        return p293xa.r.f47939a;
    }

    public final void invoke(InterfaceC1084f interfaceC1084f, int i10) {
        if ((i10 & 11) == 2 && interfaceC1084f.s()) {
            interfaceC1084f.w();
        } else {
            QuickRepliesKt.QuickReplies(kotlin.collections.l.s(new QuickReply("1", "Option 1"), new QuickReply("2", "Option 2"), new QuickReply("3", "Option 3"), new QuickReply("4", "Option 4"), new QuickReply("5", "Option 5")), new o(0), null, interfaceC1084f, 48, 4);
        }
    }
}
