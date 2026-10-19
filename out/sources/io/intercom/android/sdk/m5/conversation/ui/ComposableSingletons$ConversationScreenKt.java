package io.intercom.android.sdk.m5.conversation.ui;

import androidx.compose.material3.SnackbarKt;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;

/* JADX INFO: compiled from: ConversationScreen.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$ConversationScreenKt {
    public static final ComposableSingletons$ConversationScreenKt INSTANCE = new ComposableSingletons$ConversationScreenKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    public static Ia.q<androidx.compose.material3.f0, InterfaceC1084f, Integer, p293xa.r> f84lambda1 = new ComposableLambdaImpl(false, 1529671133, new Ia.q<androidx.compose.material3.f0, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.ComposableSingletons$ConversationScreenKt$lambda-1$1
        @Override // Ia.q
        public /* bridge */ /* synthetic */ p293xa.r invoke(androidx.compose.material3.f0 f0Var, InterfaceC1084f interfaceC1084f, Integer num) {
            invoke(f0Var, interfaceC1084f, num.intValue());
            return p293xa.r.f47939a;
        }

        public final void invoke(androidx.compose.material3.f0 it, InterfaceC1084f interfaceC1084f, int i10) {
            int i11;
            kotlin.jvm.internal.i.e(it, "it");
            if ((i10 & 14) == 0) {
                i11 = i10 | (interfaceC1084f.K(it) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 91) == 18 && interfaceC1084f.s()) {
                interfaceC1084f.w();
                return;
            }
            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
            int i12 = IntercomTheme.$stable;
            SnackbarKt.b(it, null, false, intercomTheme.getShapes(interfaceC1084f, i12).f12430b, 0L, 0L, ColorExtensionsKt.m660getAccessibleColorOnDarkBackground8_81llA(intercomTheme.getColors(interfaceC1084f, i12).m615getAction0d7_KjU()), 0L, 0L, interfaceC1084f, i11 & 14, 438);
        }
    });

    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final Ia.q<androidx.compose.material3.f0, InterfaceC1084f, Integer, p293xa.r> m155getLambda1$intercom_sdk_base_release() {
        return f84lambda1;
    }
}
