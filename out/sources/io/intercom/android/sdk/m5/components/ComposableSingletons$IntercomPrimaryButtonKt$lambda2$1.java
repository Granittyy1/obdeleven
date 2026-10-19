package io.intercom.android.sdk.m5.components;

import androidx.compose.runtime.InterfaceC1084f;
import io.intercom.android.sdk.R;

/* JADX INFO: renamed from: io.intercom.android.sdk.m5.components.ComposableSingletons$IntercomPrimaryButtonKt$lambda-2$1, reason: invalid class name */
/* JADX INFO: compiled from: IntercomPrimaryButton.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$IntercomPrimaryButtonKt$lambda2$1 implements Ia.p<InterfaceC1084f, Integer, p293xa.r> {
    public static final ComposableSingletons$IntercomPrimaryButtonKt$lambda2$1 INSTANCE = new ComposableSingletons$IntercomPrimaryButtonKt$lambda2$1();

    @Override // Ia.p
    public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
        invoke(interfaceC1084f, num.intValue());
        return p293xa.r.f47939a;
    }

    public final void invoke(InterfaceC1084f interfaceC1084f, int i10) {
        if ((i10 & 11) == 2 && interfaceC1084f.s()) {
            interfaceC1084f.w();
        } else {
            IntercomPrimaryButtonKt.IntercomPrimaryButton("Button", null, Integer.valueOf(R.drawable.intercom_send_message_icon), new A(), interfaceC1084f, 3078, 2);
        }
    }
}
