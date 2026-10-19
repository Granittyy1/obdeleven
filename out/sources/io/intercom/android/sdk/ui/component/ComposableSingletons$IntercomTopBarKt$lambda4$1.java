package io.intercom.android.sdk.ui.component;

import androidx.compose.foundation.layout.U;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.runtime.InterfaceC1084f;

/* JADX INFO: renamed from: io.intercom.android.sdk.ui.component.ComposableSingletons$IntercomTopBarKt$lambda-4$1, reason: invalid class name */
/* JADX INFO: compiled from: IntercomTopBar.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ComposableSingletons$IntercomTopBarKt$lambda4$1 implements Ia.q<U, InterfaceC1084f, Integer, p293xa.r> {
    public static final ComposableSingletons$IntercomTopBarKt$lambda4$1 INSTANCE = new ComposableSingletons$IntercomTopBarKt$lambda4$1();

    @Override // Ia.q
    public /* bridge */ /* synthetic */ p293xa.r invoke(U u10, InterfaceC1084f interfaceC1084f, Integer num) {
        invoke(u10, interfaceC1084f, num.intValue());
        return p293xa.r.f47939a;
    }

    public final void invoke(U IntercomTopBar, InterfaceC1084f interfaceC1084f, int i10) {
        kotlin.jvm.internal.i.e(IntercomTopBar, "$this$IntercomTopBar");
        if ((i10 & 81) == 16 && interfaceC1084f.s()) {
            interfaceC1084f.w();
        } else {
            IconButtonKt.b(new f(), null, false, null, null, ComposableSingletons$IntercomTopBarKt.INSTANCE.m512getLambda3$intercom_sdk_ui_release(), interfaceC1084f, 196614, 30);
        }
    }
}
