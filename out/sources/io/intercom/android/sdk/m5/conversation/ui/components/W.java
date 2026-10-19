package io.intercom.android.sdk.m5.conversation.ui.components;

import androidx.compose.runtime.InterfaceC1084f;
import io.intercom.android.sdk.m5.conversation.states.ExpandedTeamPresenceState;
import io.intercom.android.sdk.m5.helpcenter.states.CollectionDetailsRow;
import io.intercom.android.sdk.m5.helpcenter.ui.components.ArticleRowComponentKt;
import io.intercom.android.sdk.tickets.list.data.TicketsScreenUiState;
import io.intercom.android.sdk.tickets.list.ui.TicketsScreenKt;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class W implements Ia.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f38589b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f38590c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f38591d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f38592e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f38593f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f38594g;

    public /* synthetic */ W(Object obj, Object obj2, Object obj3, int i10, int i11, int i12) {
        this.f38589b = i12;
        this.f38590c = obj;
        this.f38593f = obj2;
        this.f38594g = obj3;
        this.f38591d = i10;
        this.f38592e = i11;
    }

    @Override // Ia.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f38589b) {
            case 0:
                InterfaceC1084f interfaceC1084f = (InterfaceC1084f) obj;
                int iIntValue = ((Integer) obj2).intValue();
                return TeammateSheetContentKt.TeammateSheetContent$lambda$1((androidx.compose.ui.h) this.f38590c, (String) this.f38593f, (ExpandedTeamPresenceState) this.f38594g, this.f38591d, this.f38592e, interfaceC1084f, iIntValue);
            case 1:
                return ArticleRowComponentKt.ArticleRowComponent$lambda$4((androidx.compose.ui.h) this.f38590c, (CollectionDetailsRow.ArticleRow) this.f38593f, (Ia.l) this.f38594g, this.f38591d, this.f38592e, (InterfaceC1084f) obj, ((Integer) obj2).intValue());
            default:
                return TicketsScreenKt.TicketsScreenContent$lambda$4((TicketsScreenUiState.Content) this.f38590c, (androidx.compose.foundation.layout.L) this.f38593f, (Ia.l) this.f38594g, this.f38591d, this.f38592e, (InterfaceC1084f) obj, ((Integer) obj2).intValue());
        }
    }
}
