package io.intercom.android.sdk.m5.conversation.ui.components;

import androidx.compose.material3.TextKt;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.ui.theme.IntercomTheme;

/* JADX INFO: compiled from: UploadSizeLimitDialog.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$UploadSizeLimitDialogKt {
    public static final ComposableSingletons$UploadSizeLimitDialogKt INSTANCE = new ComposableSingletons$UploadSizeLimitDialogKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    public static Ia.q<androidx.compose.foundation.layout.U, InterfaceC1084f, Integer, p293xa.r> f108lambda1 = new ComposableLambdaImpl(false, 133212014, new Ia.q<androidx.compose.foundation.layout.U, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.ComposableSingletons$UploadSizeLimitDialogKt$lambda-1$1
        @Override // Ia.q
        public /* bridge */ /* synthetic */ p293xa.r invoke(androidx.compose.foundation.layout.U u10, InterfaceC1084f interfaceC1084f, Integer num) {
            invoke(u10, interfaceC1084f, num.intValue());
            return p293xa.r.f47939a;
        }

        public final void invoke(androidx.compose.foundation.layout.U TextButton, InterfaceC1084f interfaceC1084f, int i10) {
            kotlin.jvm.internal.i.e(TextButton, "$this$TextButton");
            if ((i10 & 81) == 16 && interfaceC1084f.s()) {
                interfaceC1084f.w();
                return;
            }
            String strP = S4.o.p(interfaceC1084f, R.string.intercom_ok);
            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
            int i11 = IntercomTheme.$stable;
            TextKt.b(strP, null, intercomTheme.getColors(interfaceC1084f, i11).m616getActionContrastWhite0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(interfaceC1084f, i11).getType04SemiBold(), interfaceC1084f, 0, 0, 65530);
        }
    });

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    public static Ia.p<InterfaceC1084f, Integer, p293xa.r> f109lambda2 = new ComposableLambdaImpl(false, 1891807555, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.ComposableSingletons$UploadSizeLimitDialogKt$lambda-2$1
        @Override // Ia.p
        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
            invoke(interfaceC1084f, num.intValue());
            return p293xa.r.f47939a;
        }

        public final void invoke(InterfaceC1084f interfaceC1084f, int i10) {
            if ((i10 & 11) == 2 && interfaceC1084f.s()) {
                interfaceC1084f.w();
            } else {
                UploadSizeLimitDialogKt.UploadSizeLimitDialog("Couldn't send", "Can't send files over 100MB", null, interfaceC1084f, 54, 4);
            }
        }
    });

    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final Ia.q<androidx.compose.foundation.layout.U, InterfaceC1084f, Integer, p293xa.r> m179getLambda1$intercom_sdk_base_release() {
        return f108lambda1;
    }

    /* JADX INFO: renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final Ia.p<InterfaceC1084f, Integer, p293xa.r> m180getLambda2$intercom_sdk_base_release() {
        return f109lambda2;
    }
}
