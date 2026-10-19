package io.intercom.android.sdk.m5.navigation;

import androidx.compose.animation.InterfaceC0927e;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class U implements Ia.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f39347b;

    public /* synthetic */ U(int i10) {
        this.f39347b = i10;
    }

    @Override // Ia.l
    public final Object invoke(Object obj) {
        switch (this.f39347b) {
            case 0:
                return MessagesDestinationKt.AnonymousClass7.invoke$lambda$8$lambda$7((p141l2.K) obj);
            default:
                return ConversationDestinationKt.conversationDestination$lambda$9((InterfaceC0927e) obj);
        }
    }
}
