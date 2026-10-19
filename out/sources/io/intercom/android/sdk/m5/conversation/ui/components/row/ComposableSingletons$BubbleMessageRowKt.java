package io.intercom.android.sdk.m5.conversation.ui.components.row;

import androidx.compose.foundation.layout.U;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import io.intercom.android.sdk.R;

/* JADX INFO: compiled from: BubbleMessageRow.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$BubbleMessageRowKt {
    public static final ComposableSingletons$BubbleMessageRowKt INSTANCE = new ComposableSingletons$BubbleMessageRowKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    public static Ia.q<U, InterfaceC1084f, Integer, p293xa.r> f130lambda1 = new ComposableLambdaImpl(false, 936282466, new Ia.q<U, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.ComposableSingletons$BubbleMessageRowKt$lambda-1$1
        @Override // Ia.q
        public /* bridge */ /* synthetic */ p293xa.r invoke(U u10, InterfaceC1084f interfaceC1084f, Integer num) {
            invoke(u10, interfaceC1084f, num.intValue());
            return p293xa.r.f47939a;
        }

        public final void invoke(U Button, InterfaceC1084f interfaceC1084f, int i10) {
            kotlin.jvm.internal.i.e(Button, "$this$Button");
            if ((i10 & 81) == 16 && interfaceC1084f.s()) {
                interfaceC1084f.w();
            } else {
                TextKt.b(S4.o.p(interfaceC1084f, R.string.intercom_retry), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1084f, 0, 0, 131070);
            }
        }
    });

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    public static Ia.p<InterfaceC1084f, Integer, p293xa.r> f131lambda2 = new ComposableLambdaImpl(false, 608421069, ComposableSingletons$BubbleMessageRowKt$lambda2$1.INSTANCE);

    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final Ia.q<U, InterfaceC1084f, Integer, p293xa.r> m216getLambda1$intercom_sdk_base_release() {
        return f130lambda1;
    }

    /* JADX INFO: renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final Ia.p<InterfaceC1084f, Integer, p293xa.r> m217getLambda2$intercom_sdk_base_release() {
        return f131lambda2;
    }
}
