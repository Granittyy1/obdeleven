package io.intercom.android.sdk.ui.component;

import androidx.compose.runtime.InterfaceC1084f;

/* JADX INFO: renamed from: io.intercom.android.sdk.ui.component.ComposableSingletons$IntercomButtonKt$lambda-1$1, reason: invalid class name */
/* JADX INFO: compiled from: IntercomButton.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ComposableSingletons$IntercomButtonKt$lambda1$1 implements Ia.p<InterfaceC1084f, Integer, p293xa.r> {
    public static final ComposableSingletons$IntercomButtonKt$lambda1$1 INSTANCE = new ComposableSingletons$IntercomButtonKt$lambda1$1();

    @Override // Ia.p
    public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
        invoke(interfaceC1084f, num.intValue());
        return p293xa.r.f47939a;
    }

    public final void invoke(InterfaceC1084f interfaceC1084f, int i10) {
        if ((i10 & 11) == 2 && interfaceC1084f.s()) {
            interfaceC1084f.w();
        } else {
            IntercomButtonKt.IntercomButton(null, IntercomButton.INSTANCE.m523primaryStyleKlgxPg(0L, 0L, null, interfaceC1084f, 3072, 7), "Button", null, new b(), interfaceC1084f, 24960, 9);
        }
    }
}
