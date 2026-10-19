package io.intercom.android.sdk.m5.conversation.ui.components.row;

import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.internal.ComposableLambdaImpl;

/* JADX INFO: compiled from: DayDivider.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$DayDividerKt {
    public static final ComposableSingletons$DayDividerKt INSTANCE = new ComposableSingletons$DayDividerKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    public static Ia.p<InterfaceC1084f, Integer, p293xa.r> f132lambda1 = new ComposableLambdaImpl(false, 355794253, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.ComposableSingletons$DayDividerKt$lambda-1$1
        @Override // Ia.p
        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
            invoke(interfaceC1084f, num.intValue());
            return p293xa.r.f47939a;
        }

        public final void invoke(InterfaceC1084f interfaceC1084f, int i10) {
            if ((i10 & 11) == 2 && interfaceC1084f.s()) {
                interfaceC1084f.w();
            } else {
                DayDividerKt.DayDivider("23 August", null, interfaceC1084f, 6, 2);
            }
        }
    });

    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final Ia.p<InterfaceC1084f, Integer, p293xa.r> m218getLambda1$intercom_sdk_base_release() {
        return f132lambda1;
    }
}
