package io.intercom.android.sdk.m5.conversation.ui.components.composer;

import androidx.compose.material3.IconKt;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.ui.theme.IntercomTheme;

/* JADX INFO: compiled from: MessageComposer.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$MessageComposerKt {
    public static final ComposableSingletons$MessageComposerKt INSTANCE = new ComposableSingletons$MessageComposerKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    public static Ia.p<InterfaceC1084f, Integer, p293xa.r> f123lambda1 = new ComposableLambdaImpl(false, 1250025835, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.ComposableSingletons$MessageComposerKt$lambda-1$1
        @Override // Ia.p
        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
            invoke(interfaceC1084f, num.intValue());
            return p293xa.r.f47939a;
        }

        public final void invoke(InterfaceC1084f interfaceC1084f, int i10) {
            if ((i10 & 11) == 2 && interfaceC1084f.s()) {
                interfaceC1084f.w();
            } else {
                IconKt.a(U.c.a(R.drawable.intercom_ic_up_arrow, interfaceC1084f, 0), null, androidx.compose.foundation.layout.W.m(androidx.compose.ui.h.a.f13984b, 24), IntercomTheme.INSTANCE.getColors(interfaceC1084f, IntercomTheme.$stable).m640getOnActionContrastWhite0d7_KjU(), interfaceC1084f, 440, 0);
            }
        }
    });

    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final Ia.p<InterfaceC1084f, Integer, p293xa.r> m201getLambda1$intercom_sdk_base_release() {
        return f123lambda1;
    }
}
