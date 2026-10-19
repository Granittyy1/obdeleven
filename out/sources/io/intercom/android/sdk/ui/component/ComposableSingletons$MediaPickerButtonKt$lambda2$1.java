package io.intercom.android.sdk.ui.component;

import androidx.compose.material3.ButtonKt;
import androidx.compose.runtime.InterfaceC1084f;

/* JADX INFO: renamed from: io.intercom.android.sdk.ui.component.ComposableSingletons$MediaPickerButtonKt$lambda-2$1, reason: invalid class name */
/* JADX INFO: compiled from: MediaPickerButton.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ComposableSingletons$MediaPickerButtonKt$lambda2$1 implements Ia.p<InterfaceC1084f, Integer, p293xa.r> {
    public static final ComposableSingletons$MediaPickerButtonKt$lambda2$1 INSTANCE = new ComposableSingletons$MediaPickerButtonKt$lambda2$1();

    @Override // Ia.p
    public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
        invoke(interfaceC1084f, num.intValue());
        return p293xa.r.f47939a;
    }

    public final void invoke(InterfaceC1084f interfaceC1084f, int i10) {
        if ((i10 & 11) == 2 && interfaceC1084f.s()) {
            interfaceC1084f.w();
        } else {
            ButtonKt.a(new h(), null, false, null, null, null, null, null, null, ComposableSingletons$MediaPickerButtonKt.INSTANCE.m516getLambda1$intercom_sdk_ui_release(), interfaceC1084f, 805306374, 510);
        }
    }
}
