package io.intercom.android.sdk.m5.components;

import androidx.compose.runtime.InterfaceC1084f;
import io.intercom.android.sdk.m5.conversation.ui.components.row.BubbleMessageRowKt;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class X implements Ia.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f38257b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.h f38258c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f38259d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f38260e;

    public /* synthetic */ X(androidx.compose.ui.h hVar, int i10, int i11, int i12) {
        this.f38257b = i12;
        this.f38258c = hVar;
        this.f38259d = i10;
        this.f38260e = i11;
    }

    @Override // Ia.p
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f38257b;
        InterfaceC1084f interfaceC1084f = (InterfaceC1084f) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i10) {
            case 0:
                return ConversationItemKt.UnreadIndicator$lambda$6(this.f38258c, this.f38259d, this.f38260e, interfaceC1084f, iIntValue);
            default:
                return BubbleMessageRowKt.FailedMessageIcon$lambda$6(this.f38258c, this.f38259d, this.f38260e, interfaceC1084f, iIntValue);
        }
    }
}
