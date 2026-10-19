package io.intercom.android.sdk.ui.component;

import androidx.compose.runtime.InterfaceC1084f;
import java.util.List;

/* JADX INFO: renamed from: io.intercom.android.sdk.ui.component.ComposableSingletons$MediaPickerButtonKt$lambda-3$1, reason: invalid class name */
/* JADX INFO: compiled from: MediaPickerButton.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ComposableSingletons$MediaPickerButtonKt$lambda3$1 implements Ia.p<InterfaceC1084f, Integer, p293xa.r> {
    public static final ComposableSingletons$MediaPickerButtonKt$lambda3$1 INSTANCE = new ComposableSingletons$MediaPickerButtonKt$lambda3$1();

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r invoke$lambda$0(List it) {
        kotlin.jvm.internal.i.e(it, "it");
        return p293xa.r.f47939a;
    }

    @Override // Ia.p
    public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
        invoke(interfaceC1084f, num.intValue());
        return p293xa.r.f47939a;
    }

    public final void invoke(InterfaceC1084f interfaceC1084f, int i10) {
        if ((i10 & 11) == 2 && interfaceC1084f.s()) {
            interfaceC1084f.w();
        } else {
            MediaPickerButtonKt.MediaPickerButton(1, null, null, null, new i(), new MediaPickerButtonCTAStyle.TextButton("Open Picker"), null, ComposableSingletons$MediaPickerButtonKt.INSTANCE.m517getLambda2$intercom_sdk_ui_release(), interfaceC1084f, 12607494, 78);
        }
    }
}
