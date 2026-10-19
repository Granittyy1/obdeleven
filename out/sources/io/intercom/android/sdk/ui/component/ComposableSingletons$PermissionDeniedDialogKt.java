package io.intercom.android.sdk.ui.component;

import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: PermissionDeniedDialog.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ComposableSingletons$PermissionDeniedDialogKt {
    public static final ComposableSingletons$PermissionDeniedDialogKt INSTANCE = new ComposableSingletons$PermissionDeniedDialogKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    public static Ia.p<InterfaceC1084f, Integer, p293xa.r> f331lambda1 = new ComposableLambdaImpl(false, -593234401, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.ComposableSingletons$PermissionDeniedDialogKt$lambda-1$1
        @Override // Ia.p
        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
            invoke(interfaceC1084f, num.intValue());
            return p293xa.r.f47939a;
        }

        public final void invoke(InterfaceC1084f interfaceC1084f, int i10) {
            if ((i10 & 11) == 2 && interfaceC1084f.s()) {
                interfaceC1084f.w();
            } else {
                PermissionDeniedDialogKt.PermissionDeniedDialog(null, "Audio permission is required to use voice input. Please enable it in the app settings.", "Settings", "Not now", null, null, null, interfaceC1084f, 3504, R.styleable.AppCompatTheme_toolbarStyle);
            }
        }
    });

    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_ui_release, reason: not valid java name */
    public final Ia.p<InterfaceC1084f, Integer, p293xa.r> m519getLambda1$intercom_sdk_ui_release() {
        return f331lambda1;
    }
}
