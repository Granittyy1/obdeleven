package io.intercom.android.sdk.m5.helpcenter.ui.components;

import io.intercom.android.sdk.helpcenter.search.ArticleSearchResultRow;
import io.intercom.android.sdk.tickets.TicketDetailContentKt;
import io.intercom.android.sdk.tickets.TicketDetailState;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements Ia.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f39123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Ia.l f39124c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f39125d;

    public /* synthetic */ b(int i10, Ia.l lVar, Object obj) {
        this.f39123b = i10;
        this.f39124c = lVar;
        this.f39125d = obj;
    }

    @Override // Ia.a
    public final Object invoke() {
        switch (this.f39123b) {
            case 0:
                return ArticleResultRowComponentKt.ArticleResultRowComponent$lambda$1$lambda$0(this.f39124c, (ArticleSearchResultRow.ArticleResultRow) this.f39125d);
            default:
                return TicketDetailContentKt.TicketDetailContent$lambda$15$lambda$14$lambda$13(this.f39124c, (TicketDetailState.TicketDetailContentState) this.f39125d);
        }
    }
}
