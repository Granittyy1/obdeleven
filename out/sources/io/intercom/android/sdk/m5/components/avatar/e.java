package io.intercom.android.sdk.m5.components.avatar;

import Ia.p;
import androidx.compose.runtime.InterfaceC1084f;
import io.intercom.android.sdk.m5.conversation.ui.components.row.NewMessagesRowKt;
import io.intercom.android.sdk.tickets.list.ui.TicketsLoadingScreenKt;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e implements p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f38293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.h f38294c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f38295d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f38296e;

    public /* synthetic */ e(androidx.compose.ui.h hVar, int i10, int i11, int i12) {
        this.f38293b = i12;
        this.f38294c = hVar;
        this.f38295d = i10;
        this.f38296e = i11;
    }

    @Override // Ia.p
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f38293b;
        InterfaceC1084f interfaceC1084f = (InterfaceC1084f) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i10) {
            case 0:
                return AvatarIconKt.AvatarActiveIndicator$lambda$17(this.f38294c, this.f38295d, this.f38296e, interfaceC1084f, iIntValue);
            case 1:
                return NewMessagesRowKt.NewMessagesRow$lambda$1(this.f38294c, this.f38295d, this.f38296e, interfaceC1084f, iIntValue);
            default:
                return TicketsLoadingScreenKt.TicketsLoadingScreen$lambda$0(this.f38294c, this.f38295d, this.f38296e, interfaceC1084f, iIntValue);
        }
    }
}
