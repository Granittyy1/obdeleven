package io.intercom.android.sdk.m5.conversation.ui.components.composer;

import androidx.compose.material3.SurfaceKt;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.internal.ComposableLambdaImpl;

/* JADX INFO: compiled from: PrivacyPolicy.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$PrivacyPolicyKt {
    public static final ComposableSingletons$PrivacyPolicyKt INSTANCE = new ComposableSingletons$PrivacyPolicyKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    public static Ia.p<InterfaceC1084f, Integer, p293xa.r> f124lambda1 = new ComposableLambdaImpl(false, -9267072, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.ComposableSingletons$PrivacyPolicyKt$lambda-1$1
        @Override // Ia.p
        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
            invoke(interfaceC1084f, num.intValue());
            return p293xa.r.f47939a;
        }

        public final void invoke(InterfaceC1084f interfaceC1084f, int i10) {
            if ((i10 & 11) == 2 && interfaceC1084f.s()) {
                interfaceC1084f.w();
            } else {
                PrivacyPolicyKt.PrivacyPolicy("By chatting with us, you agree to the monitoring and recording of this chat to improve its service as described in our <a href=\"https://google.com\" rel=\"nofollow noopener noreferrer\" target=\"_blank\">Privacy Policy</a>", null, null, interfaceC1084f, 6, 6);
            }
        }
    });

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    public static Ia.p<InterfaceC1084f, Integer, p293xa.r> f125lambda2 = new ComposableLambdaImpl(false, -655350341, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.ComposableSingletons$PrivacyPolicyKt$lambda-2$1
        @Override // Ia.p
        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
            invoke(interfaceC1084f, num.intValue());
            return p293xa.r.f47939a;
        }

        public final void invoke(InterfaceC1084f interfaceC1084f, int i10) {
            if ((i10 & 11) == 2 && interfaceC1084f.s()) {
                interfaceC1084f.w();
            } else {
                SurfaceKt.a(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$PrivacyPolicyKt.INSTANCE.m202getLambda1$intercom_sdk_base_release(), interfaceC1084f, 12582912, 127);
            }
        }
    });

    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final Ia.p<InterfaceC1084f, Integer, p293xa.r> m202getLambda1$intercom_sdk_base_release() {
        return f124lambda1;
    }

    /* JADX INFO: renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final Ia.p<InterfaceC1084f, Integer, p293xa.r> m203getLambda2$intercom_sdk_base_release() {
        return f125lambda2;
    }
}
