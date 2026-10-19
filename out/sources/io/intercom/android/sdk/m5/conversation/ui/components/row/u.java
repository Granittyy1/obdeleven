package io.intercom.android.sdk.m5.conversation.ui.components.row;

import androidx.compose.runtime.InterfaceC1084f;
import io.intercom.android.sdk.m5.home.states.HomeUiState;
import io.intercom.android.sdk.m5.home.ui.header.HomeHeaderKt;
import io.intercom.android.sdk.models.StreamingPart;
import java.util.List;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class u implements Ia.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f38945b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.h f38946c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f38947d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f38948e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f38949f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f38950g;

    public /* synthetic */ u(androidx.compose.ui.h hVar, HomeUiState.Error.ErrorHeader errorHeader, Ia.a aVar, int i10, int i11) {
        this.f38946c = hVar;
        this.f38949f = errorHeader;
        this.f38950g = aVar;
        this.f38947d = i10;
        this.f38948e = i11;
    }

    @Override // Ia.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f38945b) {
            case 0:
                InterfaceC1084f interfaceC1084f = (InterfaceC1084f) obj;
                int iIntValue = ((Integer) obj2).intValue();
                return FinStreamingRowKt.FinStreamingRow$lambda$1((List) this.f38949f, (StreamingPart) this.f38950g, this.f38946c, this.f38947d, this.f38948e, interfaceC1084f, iIntValue);
            default:
                return HomeHeaderKt.HomeErrorHeader$lambda$18(this.f38946c, (HomeUiState.Error.ErrorHeader) this.f38949f, (Ia.a) this.f38950g, this.f38947d, this.f38948e, (InterfaceC1084f) obj, ((Integer) obj2).intValue());
        }
    }

    public /* synthetic */ u(List list, StreamingPart streamingPart, androidx.compose.ui.h hVar, int i10, int i11) {
        this.f38949f = list;
        this.f38950g = streamingPart;
        this.f38946c = hVar;
        this.f38947d = i10;
        this.f38948e = i11;
    }
}
