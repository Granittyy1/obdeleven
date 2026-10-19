package io.intercom.android.sdk.m5.components;

import androidx.compose.foundation.C0932d;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.ui.theme.IntercomTheme;

/* JADX INFO: compiled from: LoadingScreen.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$LoadingScreenKt {
    public static final ComposableSingletons$LoadingScreenKt INSTANCE = new ComposableSingletons$LoadingScreenKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    public static Ia.p<InterfaceC1084f, Integer, p293xa.r> f52lambda1 = new ComposableLambdaImpl(false, -1256674746, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.components.ComposableSingletons$LoadingScreenKt$lambda-1$1
        @Override // Ia.p
        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
            invoke(interfaceC1084f, num.intValue());
            return p293xa.r.f47939a;
        }

        public final void invoke(InterfaceC1084f interfaceC1084f, int i10) {
            if ((i10 & 11) == 2 && interfaceC1084f.s()) {
                interfaceC1084f.w();
            } else {
                LoadingScreenKt.LoadingScreen(C0932d.b(androidx.compose.ui.h.a.f13984b, IntercomTheme.INSTANCE.getColors(interfaceC1084f, IntercomTheme.$stable).m621getBackground0d7_KjU(), androidx.compose.ui.graphics.h0.f13629a), R.drawable.intercom_inbox_loading_state, interfaceC1084f, 0, 0);
            }
        }
    });

    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final Ia.p<InterfaceC1084f, Integer, p293xa.r> m105getLambda1$intercom_sdk_base_release() {
        return f52lambda1;
    }
}
