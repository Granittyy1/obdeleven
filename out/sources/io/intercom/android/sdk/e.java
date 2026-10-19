package io.intercom.android.sdk;

import io.intercom.android.sdk.m5.conversation.ui.components.MediaInputSheetContentKt;
import p141l2.z;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e implements Ia.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f38073b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f38074c;

    public /* synthetic */ e(int i10, Object obj) {
        this.f38073b = i10;
        this.f38074c = obj;
    }

    @Override // Ia.a
    public final Object invoke() {
        switch (this.f38073b) {
            case 0:
                return AppIdentityInjector.ticketApi_delegate$lambda$11((AppIdentityInjector) this.f38074c);
            case 1:
                return MediaInputSheetContentKt.MediaInputSheetContent$lambda$21$lambda$20$lambda$19$lambda$18((Ia.l) this.f38074c);
            default:
                return new z((String) this.f38074c);
        }
    }
}
