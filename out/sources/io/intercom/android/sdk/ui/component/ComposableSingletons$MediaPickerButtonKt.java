package io.intercom.android.sdk.ui.component;

import androidx.compose.foundation.layout.U;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.internal.ComposableLambdaImpl;

/* JADX INFO: compiled from: MediaPickerButton.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ComposableSingletons$MediaPickerButtonKt {
    public static final ComposableSingletons$MediaPickerButtonKt INSTANCE = new ComposableSingletons$MediaPickerButtonKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    public static Ia.q<U, InterfaceC1084f, Integer, p293xa.r> f328lambda1 = new ComposableLambdaImpl(false, 1720634073, new Ia.q<U, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.ComposableSingletons$MediaPickerButtonKt$lambda-1$1
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
                TextKt.b("Open Picker", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1084f, 6, 0, 131070);
            }
        }
    });

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    public static Ia.p<InterfaceC1084f, Integer, p293xa.r> f329lambda2 = new ComposableLambdaImpl(false, -55957783, ComposableSingletons$MediaPickerButtonKt$lambda2$1.INSTANCE);

    /* JADX INFO: renamed from: lambda-3, reason: not valid java name */
    public static Ia.p<InterfaceC1084f, Integer, p293xa.r> f330lambda3 = new ComposableLambdaImpl(false, 1358094075, ComposableSingletons$MediaPickerButtonKt$lambda3$1.INSTANCE);

    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_ui_release, reason: not valid java name */
    public final Ia.q<U, InterfaceC1084f, Integer, p293xa.r> m516getLambda1$intercom_sdk_ui_release() {
        return f328lambda1;
    }

    /* JADX INFO: renamed from: getLambda-2$intercom_sdk_ui_release, reason: not valid java name */
    public final Ia.p<InterfaceC1084f, Integer, p293xa.r> m517getLambda2$intercom_sdk_ui_release() {
        return f329lambda2;
    }

    /* JADX INFO: renamed from: getLambda-3$intercom_sdk_ui_release, reason: not valid java name */
    public final Ia.p<InterfaceC1084f, Integer, p293xa.r> m518getLambda3$intercom_sdk_ui_release() {
        return f330lambda3;
    }
}
