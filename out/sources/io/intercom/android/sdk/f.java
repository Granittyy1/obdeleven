package io.intercom.android.sdk;

import io.intercom.android.sdk.m5.conversation.ui.components.UploadSizeLimitDialogKt;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f implements Ia.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f38075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f38076c;

    public /* synthetic */ f(int i10, Object obj) {
        this.f38075b = i10;
        this.f38076c = obj;
    }

    @Override // Ia.a
    public final Object invoke() {
        switch (this.f38075b) {
            case 0:
                return AppIdentityInjector.externalUploadApi_delegate$lambda$12((AppIdentityInjector) this.f38076c);
            default:
                return UploadSizeLimitDialogKt.UploadSizeLimitDialog$lambda$2$lambda$1((Ia.a) this.f38076c);
        }
    }
}
