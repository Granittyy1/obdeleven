package io.intercom.android.sdk.m5.components;

import io.intercom.android.sdk.m5.conversation.ConversationViewModel;
import io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt;
import io.intercom.android.sdk.m5.conversation.ui.components.MediaInputSheetContentKt;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class q0 implements Ia.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f38401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f38402c;

    public /* synthetic */ q0(int i10, Object obj) {
        this.f38401b = i10;
        this.f38402c = obj;
    }

    @Override // Ia.a
    public final Object invoke() {
        switch (this.f38401b) {
            case 0:
                return HomeItemKt.HomeItem$lambda$2$lambda$1((Ia.a) this.f38402c);
            case 1:
                return ConversationScreenKt.ConversationScreen$lambda$31((ConversationViewModel) this.f38402c);
            default:
                return MediaInputSheetContentKt.MediaInputSheetContent$lambda$21$lambda$20$lambda$15$lambda$14((Ia.l) this.f38402c);
        }
    }
}
