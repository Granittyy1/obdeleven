package io.intercom.android.sdk.m5.conversation.ui.components;

import io.intercom.android.sdk.m5.conversation.states.ContentRow;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.GifGridKt;
import java.util.List;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class N implements Ia.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f38551b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f38552c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f38553d;

    public /* synthetic */ N(Object obj, int i10, Object obj2) {
        this.f38551b = i10;
        this.f38552c = obj;
        this.f38553d = obj2;
    }

    @Override // Ia.l
    public final Object invoke(Object obj) {
        switch (this.f38551b) {
            case 0:
                return MessageListKt.MessageList$lambda$38$lambda$37$lambda$29((Ia.p) this.f38552c, (ContentRow.FinAnswerRow) this.f38553d, (List) obj);
            default:
                return GifGridKt.GifGrid$lambda$11$lambda$10((List) this.f38552c, (Ia.l) this.f38553d, (androidx.compose.foundation.lazy.staggeredgrid.q) obj);
        }
    }
}
