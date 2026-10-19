package io.intercom.android.sdk.m5.home.ui.components;

import androidx.compose.runtime.InterfaceC1084f;
import io.intercom.android.sdk.models.OpenMessengerResponse;
import io.intercom.android.sdk.survey.ui.questiontype.files.FileUploadProgressComponentKt;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class l implements Ia.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f39230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Ia.a f39231c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f39232d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f39233e;

    public /* synthetic */ l(Object obj, Ia.a aVar, int i10, int i11) {
        this.f39230b = i11;
        this.f39233e = obj;
        this.f39231c = aVar;
        this.f39232d = i10;
    }

    @Override // Ia.p
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f39230b;
        InterfaceC1084f interfaceC1084f = (InterfaceC1084f) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i10) {
            case 0:
                return NewConversationCardKt.NewConversationCardV2$lambda$2((OpenMessengerResponse.NewConversationData.HomeCard) this.f39233e, this.f39231c, this.f39232d, interfaceC1084f, iIntValue);
            default:
                return FileUploadProgressComponentKt.FileUploadProgressComponent$lambda$1((String) this.f39233e, this.f39231c, this.f39232d, interfaceC1084f, iIntValue);
        }
    }
}
