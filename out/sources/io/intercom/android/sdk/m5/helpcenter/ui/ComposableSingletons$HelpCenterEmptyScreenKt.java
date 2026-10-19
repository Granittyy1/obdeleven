package io.intercom.android.sdk.m5.helpcenter.ui;

import androidx.compose.foundation.C0932d;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.graphics.h0;
import io.intercom.android.sdk.ui.theme.IntercomTheme;

/* JADX INFO: compiled from: HelpCenterEmptyScreen.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$HelpCenterEmptyScreenKt {
    public static final ComposableSingletons$HelpCenterEmptyScreenKt INSTANCE = new ComposableSingletons$HelpCenterEmptyScreenKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    public static Ia.p<InterfaceC1084f, Integer, p293xa.r> f167lambda1 = new ComposableLambdaImpl(false, -1732760450, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.ComposableSingletons$HelpCenterEmptyScreenKt$lambda-1$1
        @Override // Ia.p
        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
            invoke(interfaceC1084f, num.intValue());
            return p293xa.r.f47939a;
        }

        public final void invoke(InterfaceC1084f interfaceC1084f, int i10) {
            if ((i10 & 11) == 2 && interfaceC1084f.s()) {
                interfaceC1084f.w();
            } else {
                HelpCenterEmptyScreenKt.HelpCenterEmptyScreen(C0932d.b(androidx.compose.ui.h.a.f13984b, IntercomTheme.INSTANCE.getColors(interfaceC1084f, IntercomTheme.$stable).m621getBackground0d7_KjU(), h0.f13629a), interfaceC1084f, 0, 0);
            }
        }
    });

    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final Ia.p<InterfaceC1084f, Integer, p293xa.r> m267getLambda1$intercom_sdk_base_release() {
        return f167lambda1;
    }
}
