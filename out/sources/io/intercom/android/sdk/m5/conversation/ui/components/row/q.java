package io.intercom.android.sdk.m5.conversation.ui.components.row;

import androidx.compose.runtime.InterfaceC1084f;
import io.intercom.android.sdk.m5.conversation.states.ExpandedTeamPresenceState;
import io.intercom.android.sdk.m5.helpcenter.states.CollectionDetailsUiState;
import io.intercom.android.sdk.m5.helpcenter.ui.components.CollectionSummaryComponentKt;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class q implements Ia.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f38924b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.h f38925c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f38926d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f38927e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f38928f;

    public /* synthetic */ q(Object obj, androidx.compose.ui.h hVar, int i10, int i11, int i12) {
        this.f38924b = i12;
        this.f38928f = obj;
        this.f38925c = hVar;
        this.f38926d = i10;
        this.f38927e = i11;
    }

    @Override // Ia.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f38924b) {
            case 0:
                InterfaceC1084f interfaceC1084f = (InterfaceC1084f) obj;
                int iIntValue = ((Integer) obj2).intValue();
                return ExpandedTeamPresenceLayoutKt.ExpandedTeamPresenceLayout$lambda$9((ExpandedTeamPresenceState) this.f38928f, this.f38925c, this.f38926d, this.f38927e, interfaceC1084f, iIntValue);
            default:
                return CollectionSummaryComponentKt.CollectionSummaryComponent$lambda$5((CollectionDetailsUiState.Content) this.f38928f, this.f38925c, this.f38926d, this.f38927e, (InterfaceC1084f) obj, ((Integer) obj2).intValue());
        }
    }
}
