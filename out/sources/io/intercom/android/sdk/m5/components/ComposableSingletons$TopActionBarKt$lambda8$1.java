package io.intercom.android.sdk.m5.components;

import androidx.compose.material3.IconButtonKt;
import androidx.compose.runtime.InterfaceC1084f;

/* JADX INFO: renamed from: io.intercom.android.sdk.m5.components.ComposableSingletons$TopActionBarKt$lambda-8$1, reason: invalid class name */
/* JADX INFO: compiled from: TopActionBar.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$TopActionBarKt$lambda8$1 implements Ia.q<androidx.compose.foundation.layout.U, InterfaceC1084f, Integer, p293xa.r> {
    public static final ComposableSingletons$TopActionBarKt$lambda8$1 INSTANCE = new ComposableSingletons$TopActionBarKt$lambda8$1();

    @Override // Ia.q
    public /* bridge */ /* synthetic */ p293xa.r invoke(androidx.compose.foundation.layout.U u10, InterfaceC1084f interfaceC1084f, Integer num) {
        invoke(u10, interfaceC1084f, num.intValue());
        return p293xa.r.f47939a;
    }

    public final void invoke(androidx.compose.foundation.layout.U TopActionBar, InterfaceC1084f interfaceC1084f, int i10) {
        kotlin.jvm.internal.i.e(TopActionBar, "$this$TopActionBar");
        if ((i10 & 81) == 16 && interfaceC1084f.s()) {
            interfaceC1084f.w();
        } else {
            IconButtonKt.b(new I(), null, false, null, null, ComposableSingletons$TopActionBarKt.INSTANCE.m125getLambda7$intercom_sdk_base_release(), interfaceC1084f, 196614, 30);
        }
    }
}
