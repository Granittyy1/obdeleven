package com.voltasit.obdeleven.presentation.controlUnit.kwp.longcoding;

import com.voltasit.obdeleven.domain.models.Feature;
import io.intercom.android.sdk.m5.conversation.usecase.FallbackPollingUseCase;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Ia.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f31796b;

    public /* synthetic */ a(int i10) {
        this.f31796b = i10;
    }

    @Override // Ia.a
    public final Object invoke() {
        switch (this.f31796b) {
            case 0:
                return I.e.j(Feature.LongCoding);
            default:
                return FallbackPollingUseCase._init_$lambda$0();
        }
    }
}
