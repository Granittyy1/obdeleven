package io.intercom.android.sdk.m5.home.ui;

import Ia.p;
import androidx.compose.runtime.InterfaceC1084f;
import io.intercom.android.sdk.m5.components.ErrorState;
import p293xa.r;

/* JADX INFO: renamed from: io.intercom.android.sdk.m5.home.ui.ComposableSingletons$HomeErrorContentKt$lambda-1$1, reason: invalid class name */
/* JADX INFO: compiled from: HomeErrorContent.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$HomeErrorContentKt$lambda1$1 implements p<InterfaceC1084f, Integer, r> {
    public static final ComposableSingletons$HomeErrorContentKt$lambda1$1 INSTANCE = new ComposableSingletons$HomeErrorContentKt$lambda1$1();

    @Override // Ia.p
    public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
        invoke(interfaceC1084f, num.intValue());
        return r.f47939a;
    }

    public final void invoke(InterfaceC1084f interfaceC1084f, int i10) {
        if ((i10 & 11) == 2 && interfaceC1084f.s()) {
            interfaceC1084f.w();
            return;
        }
        HomeErrorContentKt.HomeErrorContent(new ErrorState.WithCTA(0, 0, null, 0, new a(), 15, null), null, interfaceC1084f, 0, 2);
    }
}
