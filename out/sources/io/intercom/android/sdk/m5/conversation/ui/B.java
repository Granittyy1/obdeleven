package io.intercom.android.sdk.m5.conversation.ui;

import androidx.compose.foundation.text.InterfaceC1000i;
import androidx.compose.ui.platform.M0;
import io.intercom.android.sdk.m5.conversation.ConversationViewModel;
import io.intercom.android.sdk.m5.conversation.states.PendingMessage;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.GifGridKt;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class B implements Ia.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f38450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f38451c;

    public /* synthetic */ B(int i10, Object obj) {
        this.f38450b = i10;
        this.f38451c = obj;
    }

    @Override // Ia.l
    public final Object invoke(Object obj) {
        switch (this.f38450b) {
            case 0:
                return ConversationScreenKt.ConversationScreen$lambda$34((ConversationViewModel) this.f38451c, (PendingMessage.FailedImageUploadData) obj);
            default:
                return GifGridKt.GifGrid$lambda$11$lambda$8$lambda$3$lambda$2((M0) this.f38451c, (InterfaceC1000i) obj);
        }
    }
}
