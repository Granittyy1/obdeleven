package androidx.lifecycle;

import io.intercom.android.sdk.m5.conversation.ConversationViewModel;
import io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt;
import io.intercom.android.sdk.m5.home.ui.HomeScreenKt;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O implements Ia.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f17763b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f17764c;

    public /* synthetic */ O(int i10, Object obj) {
        this.f17763b = i10;
        this.f17764c = obj;
    }

    @Override // Ia.a
    public final Object invoke() {
        switch (this.f17763b) {
            case 0:
                return N.c((c0) this.f17764c);
            case 1:
                return ConversationScreenKt.ConversationScreen$lambda$32((ConversationViewModel) this.f17764c);
            default:
                return HomeScreenKt.HomeScreen$lambda$11$lambda$10$lambda$8$lambda$7((Ia.a) this.f17764c);
        }
    }
}
