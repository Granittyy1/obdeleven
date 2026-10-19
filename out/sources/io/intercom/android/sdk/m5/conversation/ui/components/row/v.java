package io.intercom.android.sdk.m5.conversation.ui.components.row;

import android.content.Context;
import io.intercom.android.sdk.helpcenter.articles.ArticleViewState;
import io.intercom.android.sdk.m5.helpcenter.ui.components.TeamPresenceComponentKt;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class v implements Ia.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f38951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f38952c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f38953d;

    public /* synthetic */ v(Object obj, int i10, Object obj2) {
        this.f38951b = i10;
        this.f38952c = obj;
        this.f38953d = obj2;
    }

    @Override // Ia.a
    public final Object invoke() {
        switch (this.f38951b) {
            case 0:
                return MergedConversationRowKt.MergedConversationRow$lambda$3$lambda$2$lambda$1((Ia.l) this.f38952c, (String) this.f38953d);
            default:
                return TeamPresenceComponentKt.TeamPresenceComponent$lambda$3$lambda$1((ArticleViewState.TeamPresenceState) this.f38952c, (Context) this.f38953d);
        }
    }
}
