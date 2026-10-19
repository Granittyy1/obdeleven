package io.intercom.android.sdk.m5.conversation.ui.components.row;

import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.internal.ComposableLambdaImpl;

/* JADX INFO: compiled from: MergedConversationRow.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$MergedConversationRowKt {
    public static final ComposableSingletons$MergedConversationRowKt INSTANCE = new ComposableSingletons$MergedConversationRowKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    public static Ia.p<InterfaceC1084f, Integer, p293xa.r> f144lambda1 = new ComposableLambdaImpl(false, 1774522715, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.ComposableSingletons$MergedConversationRowKt$lambda-1$1
        @Override // Ia.p
        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
            invoke(interfaceC1084f, num.intValue());
            return p293xa.r.f47939a;
        }

        public final void invoke(InterfaceC1084f interfaceC1084f, int i10) {
            if ((i10 & 11) == 2 && interfaceC1084f.s()) {
                interfaceC1084f.w();
            } else {
                MergedConversationRowKt.MergedConversationRow(null, "A conversation was merged into this one", "123", null, interfaceC1084f, 432, 9);
            }
        }
    });

    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final Ia.p<InterfaceC1084f, Integer, p293xa.r> m230getLambda1$intercom_sdk_base_release() {
        return f144lambda1;
    }
}
