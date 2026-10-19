package io.intercom.android.sdk.m5.conversation.ui.components;

import androidx.compose.ui.platform.InterfaceC1209a0;
import io.intercom.android.sdk.m5.conversation.ui.components.row.ClickableMessageRowKt;
import io.intercom.android.sdk.m5.helpcenter.states.CollectionDetailsRow;
import io.intercom.android.sdk.m5.helpcenter.ui.components.ArticleRowComponentKt;
import io.intercom.android.sdk.models.Part;

/* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ui.components.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C2361j implements Ia.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f38779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f38780c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f38781d;

    public /* synthetic */ C2361j(Ia.l lVar, CollectionDetailsRow.ArticleRow articleRow) {
        this.f38779b = 2;
        this.f38781d = lVar;
        this.f38780c = articleRow;
    }

    @Override // Ia.a
    public final Object invoke() {
        switch (this.f38779b) {
            case 0:
                return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$13$lambda$12$lambda$9$lambda$8((androidx.compose.runtime.X) this.f38780c, (Ia.l) this.f38781d);
            case 1:
                return ClickableMessageRowKt.ClickableMessageRow$lambda$3((InterfaceC1209a0) this.f38780c, (Part) this.f38781d);
            default:
                return ArticleRowComponentKt.ArticleRowComponent$lambda$2$lambda$1((Ia.l) this.f38781d, (CollectionDetailsRow.ArticleRow) this.f38780c);
        }
    }

    public /* synthetic */ C2361j(Object obj, int i10, Object obj2) {
        this.f38779b = i10;
        this.f38780c = obj;
        this.f38781d = obj2;
    }
}
