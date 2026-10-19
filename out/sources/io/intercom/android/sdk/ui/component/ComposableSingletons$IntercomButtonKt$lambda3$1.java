package io.intercom.android.sdk.ui.component;

import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.ui.graphics.H;
import com.google.android.gms.internal.measurement.C1787c0;
import io.intercom.android.sdk.ui.R;

/* JADX INFO: renamed from: io.intercom.android.sdk.ui.component.ComposableSingletons$IntercomButtonKt$lambda-3$1, reason: invalid class name */
/* JADX INFO: compiled from: IntercomButton.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ComposableSingletons$IntercomButtonKt$lambda3$1 implements Ia.p<InterfaceC1084f, Integer, p293xa.r> {
    public static final ComposableSingletons$IntercomButtonKt$lambda3$1 INSTANCE = new ComposableSingletons$IntercomButtonKt$lambda3$1();

    @Override // Ia.p
    public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
        invoke(interfaceC1084f, num.intValue());
        return p293xa.r.f47939a;
    }

    public final void invoke(InterfaceC1084f interfaceC1084f, int i10) {
        if ((i10 & 11) == 2 && interfaceC1084f.s()) {
            interfaceC1084f.w();
            return;
        }
        int i11 = R.drawable.intercom_send;
        IntercomButton intercomButton = IntercomButton.INSTANCE;
        int i12 = H.f13505m;
        IntercomButtonKt.IntercomButton(null, intercomButton.m522outlinedStyleKlgxPg(H.f13499f, H.f13495b, C1787c0.a(1, H.f13497d), interfaceC1084f, 3510, 0), "Button", Integer.valueOf(i11), new d(), interfaceC1084f, 24960, 1);
    }
}
