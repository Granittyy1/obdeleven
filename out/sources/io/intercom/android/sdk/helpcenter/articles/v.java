package io.intercom.android.sdk.helpcenter.articles;

import io.intercom.android.sdk.m5.components.ConversationItemKt;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class v implements Ia.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f38100b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Ia.a f38101c;

    public /* synthetic */ v(int i10, Ia.a aVar) {
        this.f38100b = i10;
        this.f38101c = aVar;
    }

    @Override // Ia.a
    public final Object invoke() {
        switch (this.f38100b) {
            case 0:
                return ReactionsComponentKt.ReactionsComponent$lambda$13$lambda$12$lambda$10$lambda$9(this.f38101c);
            default:
                return ConversationItemKt.ConversationItem$lambda$1$lambda$0(this.f38101c);
        }
    }
}
