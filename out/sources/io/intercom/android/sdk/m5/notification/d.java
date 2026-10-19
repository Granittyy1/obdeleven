package io.intercom.android.sdk.m5.notification;

import Ia.p;
import androidx.compose.runtime.InterfaceC1084f;
import io.intercom.android.sdk.survey.ui.questiontype.choice.ChoicePillKt;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d implements p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f39427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f39428c;

    public /* synthetic */ d(int i10, int i11) {
        this.f39427b = i11;
        this.f39428c = i10;
    }

    @Override // Ia.p
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f39427b;
        InterfaceC1084f interfaceC1084f = (InterfaceC1084f) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i10) {
            case 0:
                return InAppNotificationCardKt.InAppNotificationCardTicketPreview$lambda$8(this.f39428c, interfaceC1084f, iIntValue);
            default:
                return ChoicePillKt.SelectedPillDark$lambda$7(this.f39428c, interfaceC1084f, iIntValue);
        }
    }
}
