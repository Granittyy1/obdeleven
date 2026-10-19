package io.intercom.android.sdk.m5.conversation.ui;

import androidx.compose.ui.layout.InterfaceC1170p;
import io.intercom.android.sdk.m5.conversation.ConversationViewModel;
import io.intercom.android.sdk.m5.conversation.states.AttributeData;
import io.intercom.android.sdk.m5.conversation.ui.components.MessageListKt;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C implements Ia.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f38452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f38453c;

    public /* synthetic */ C(int i10, Object obj) {
        this.f38452b = i10;
        this.f38453c = obj;
    }

    @Override // Ia.l
    public final Object invoke(Object obj) {
        switch (this.f38452b) {
            case 0:
                return ConversationScreenKt.ConversationScreen$lambda$36((ConversationViewModel) this.f38453c, (AttributeData) obj);
            default:
                return MessageListKt.MessageList$lambda$26$lambda$25((androidx.compose.runtime.X) this.f38453c, (InterfaceC1170p) obj);
        }
    }
}
