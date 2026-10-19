package io.intercom.android.sdk;

import io.intercom.android.sdk.m5.conversation.ui.components.composer.MessageComposerKt;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d implements Ia.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f38071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f38072c;

    public /* synthetic */ d(int i10, Object obj) {
        this.f38071b = i10;
        this.f38072c = obj;
    }

    @Override // Ia.a
    public final Object invoke() {
        switch (this.f38071b) {
            case 0:
                return AppIdentityInjector.helpCenterApi_delegate$lambda$9((AppIdentityInjector) this.f38072c);
            default:
                return MessageComposerKt.MessageComposer$lambda$6$lambda$5((String) this.f38072c);
        }
    }
}
