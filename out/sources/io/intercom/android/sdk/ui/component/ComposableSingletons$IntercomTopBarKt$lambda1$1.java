package io.intercom.android.sdk.ui.component;

import androidx.compose.runtime.InterfaceC1084f;
import io.intercom.android.sdk.ui.R;

/* JADX INFO: renamed from: io.intercom.android.sdk.ui.component.ComposableSingletons$IntercomTopBarKt$lambda-1$1, reason: invalid class name */
/* JADX INFO: compiled from: IntercomTopBar.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ComposableSingletons$IntercomTopBarKt$lambda1$1 implements Ia.p<InterfaceC1084f, Integer, p293xa.r> {
    public static final ComposableSingletons$IntercomTopBarKt$lambda1$1 INSTANCE = new ComposableSingletons$IntercomTopBarKt$lambda1$1();

    @Override // Ia.p
    public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
        invoke(interfaceC1084f, num.intValue());
        return p293xa.r.f47939a;
    }

    public final void invoke(InterfaceC1084f interfaceC1084f, int i10) {
        if ((i10 & 11) == 2 && interfaceC1084f.s()) {
            interfaceC1084f.w();
        } else {
            IntercomTopBarKt.m542IntercomTopBarbogVsAg(null, "TopBar Title", new IntercomTopBarIcon(R.drawable.intercom_ic_back, null, new e()), androidx.compose.ui.d.a.f13347n, 0L, 0L, null, null, interfaceC1084f, 3120, 241);
        }
    }
}
