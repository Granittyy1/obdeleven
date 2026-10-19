package io.intercom.android.sdk.survey.ui.questiontype.files;

import androidx.compose.runtime.InterfaceC1084f;

/* JADX INFO: renamed from: io.intercom.android.sdk.survey.ui.questiontype.files.ComposableSingletons$FileUploadProgressComponentKt$lambda-1$1, reason: invalid class name */
/* JADX INFO: compiled from: FileUploadProgressComponent.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$FileUploadProgressComponentKt$lambda1$1 implements Ia.p<InterfaceC1084f, Integer, p293xa.r> {
    public static final ComposableSingletons$FileUploadProgressComponentKt$lambda1$1 INSTANCE = new ComposableSingletons$FileUploadProgressComponentKt$lambda1$1();

    @Override // Ia.p
    public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
        invoke(interfaceC1084f, num.intValue());
        return p293xa.r.f47939a;
    }

    public final void invoke(InterfaceC1084f interfaceC1084f, int i10) {
        if ((i10 & 11) == 2 && interfaceC1084f.s()) {
            interfaceC1084f.w();
        } else {
            FileUploadProgressComponentKt.FileUploadProgressComponent("Test.png", new h(), interfaceC1084f, 54);
        }
    }
}
