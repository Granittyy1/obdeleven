package io.intercom.android.sdk.m5.components;

import androidx.compose.foundation.C0932d;
import androidx.compose.runtime.InterfaceC1084f;
import io.intercom.android.sdk.models.Ticket;
import io.intercom.android.sdk.ui.theme.IntercomTheme;

/* JADX INFO: renamed from: io.intercom.android.sdk.m5.components.ComposableSingletons$ConversationItemKt$lambda-1$1, reason: invalid class name */
/* JADX INFO: compiled from: ConversationItem.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$ConversationItemKt$lambda1$1 implements Ia.p<InterfaceC1084f, Integer, p293xa.r> {
    public static final ComposableSingletons$ConversationItemKt$lambda1$1 INSTANCE = new ComposableSingletons$ConversationItemKt$lambda1$1();

    @Override // Ia.p
    public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
        invoke(interfaceC1084f, num.intValue());
        return p293xa.r.f47939a;
    }

    public final void invoke(InterfaceC1084f interfaceC1084f, int i10) {
        if ((i10 & 11) == 2 && interfaceC1084f.s()) {
            interfaceC1084f.w();
            return;
        }
        float f10 = 16;
        ConversationItemKt.ConversationItem(ConversationItemKt.sampleConversation(new Ticket(null, null, "Feature request", null, null, null, new Ticket.Status("Resolved", "resolved", null, false, 0L, 28, null), null, null, 0, null, null, null, null, 0L, 32699, null), true), C0932d.b(androidx.compose.foundation.layout.W.d(androidx.compose.ui.h.a.f13984b, 1.0f), IntercomTheme.INSTANCE.getColors(interfaceC1084f, IntercomTheme.$stable).m621getBackground0d7_KjU(), androidx.compose.ui.graphics.h0.f13629a), new androidx.compose.foundation.layout.N(f10, f10, f10, f10), false, new C2300q(), interfaceC1084f, 24584, 8);
    }
}
