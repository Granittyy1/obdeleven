package io.intercom.android.sdk.m5.home.ui.components;

import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.graphics.H;
import io.intercom.android.sdk.ui.theme.IntercomTheme;

/* JADX INFO: compiled from: WrapReportingText.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$WrapReportingTextKt {
    public static final ComposableSingletons$WrapReportingTextKt INSTANCE = new ComposableSingletons$WrapReportingTextKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    public static Ia.p<InterfaceC1084f, Integer, p293xa.r> f201lambda1 = new ComposableLambdaImpl(false, 136624489, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.home.ui.components.ComposableSingletons$WrapReportingTextKt$lambda-1$1
        @Override // Ia.p
        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
            invoke(interfaceC1084f, num.intValue());
            return p293xa.r.f47939a;
        }

        public final void invoke(InterfaceC1084f interfaceC1084f, int i10) {
            if ((i10 & 11) == 2 && interfaceC1084f.s()) {
                interfaceC1084f.w();
            } else {
                int i11 = H.f13505m;
                WrapReportingTextKt.m311WrapReportingTextT042LqI(null, "Hello there", H.j, IntercomTheme.INSTANCE.getTypography(interfaceC1084f, IntercomTheme.$stable).getType01(), null, interfaceC1084f, 432, 17);
            }
        }
    });

    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final Ia.p<InterfaceC1084f, Integer, p293xa.r> m310getLambda1$intercom_sdk_base_release() {
        return f201lambda1;
    }
}
