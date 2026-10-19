package io.intercom.android.sdk.m5.home.ui.header;

import Ia.p;
import androidx.compose.runtime.InterfaceC1084f;
import io.intercom.android.sdk.m5.home.states.HomeUiState;
import p293xa.r;

/* JADX INFO: renamed from: io.intercom.android.sdk.m5.home.ui.header.ComposableSingletons$HomeHeaderKt$lambda-3$1, reason: invalid class name */
/* JADX INFO: compiled from: HomeHeader.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$HomeHeaderKt$lambda3$1 implements p<InterfaceC1084f, Integer, r> {
    public static final ComposableSingletons$HomeHeaderKt$lambda3$1 INSTANCE = new ComposableSingletons$HomeHeaderKt$lambda3$1();

    @Override // Ia.p
    public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
        invoke(interfaceC1084f, num.intValue());
        return r.f47939a;
    }

    public final void invoke(InterfaceC1084f interfaceC1084f, int i10) {
        if ((i10 & 11) == 2 && interfaceC1084f.s()) {
            interfaceC1084f.w();
        } else {
            HomeHeaderKt.HomeErrorHeader(null, new HomeUiState.Error.ErrorHeader("#FFFFFF", "#000000"), new h(), interfaceC1084f, 384, 1);
        }
    }
}
