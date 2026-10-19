package io.intercom.android.sdk.m5.conversation.ui.components;

import io.intercom.android.sdk.blocks.lib.models.TicketType;
import io.intercom.android.sdk.models.ReplyOption;

/* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ui.components.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C2356e implements Ia.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f38767b;

    public /* synthetic */ C2356e(int i10) {
        this.f38767b = i10;
    }

    @Override // Ia.l
    public final Object invoke(Object obj) {
        switch (this.f38767b) {
            case 0:
                return ComposableSingletons$MessageListKt$lambda1$1.invoke$lambda$1((ReplyOption) obj);
            default:
                return LazyMessageListKt.LazyMessageList$lambda$6((TicketType) obj);
        }
    }
}
