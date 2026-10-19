package io.intercom.android.sdk.m5.components;

import io.intercom.android.sdk.m5.conversation.ui.components.composer.GifGridKt;
import io.intercom.android.sdk.tickets.list.reducers.TicketsListReducerKt;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class O0 implements Ia.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f38223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f38224c;

    public /* synthetic */ O0(int i10, Object obj) {
        this.f38223b = i10;
        this.f38224c = obj;
    }

    @Override // Ia.a
    public final Object invoke() {
        switch (this.f38223b) {
            case 0:
                return TopActionBarKt.TopActionBar_NpQZenA$lambda$9$lambda$4$lambda$3((Ia.a) this.f38224c);
            case 1:
                return GifGridKt.GifGridIcon$lambda$14$lambda$13((Ia.a) this.f38224c);
            default:
                return TicketsListReducerKt.reduceToTicketsScreenUiState$lambda$2$lambda$1((androidx.paging.compose.b) this.f38224c);
        }
    }
}
