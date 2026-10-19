package io.intercom.android.sdk.survey.ui.questiontype.files;

import androidx.compose.runtime.InterfaceC1084f;
import com.google.android.gms.internal.measurement.M1;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.survey.ui.models.Answer;
import io.intercom.android.sdk.ui.common.StringProvider;

/* JADX INFO: renamed from: io.intercom.android.sdk.survey.ui.questiontype.files.ComposableSingletons$FileUploadErrorComponentKt$lambda-1$1, reason: invalid class name */
/* JADX INFO: compiled from: FileUploadErrorComponent.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$FileUploadErrorComponentKt$lambda1$1 implements Ia.p<InterfaceC1084f, Integer, p293xa.r> {
    public static final ComposableSingletons$FileUploadErrorComponentKt$lambda1$1 INSTANCE = new ComposableSingletons$FileUploadErrorComponentKt$lambda1$1();

    @Override // Ia.p
    public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
        invoke(interfaceC1084f, num.intValue());
        return p293xa.r.f47939a;
    }

    public final void invoke(InterfaceC1084f interfaceC1084f, int i10) {
        if ((i10 & 11) == 2 && interfaceC1084f.s()) {
            interfaceC1084f.w();
        } else {
            FileUploadErrorComponentKt.FileUploadErrorComponent("Error", new Answer.MediaAnswer.FileUploadError.FileLimitExceeded(M1.k(new StringProvider.StringRes(R.string.intercom_upload_failed, null, 2, null))), new d(), new e(), interfaceC1084f, 3462);
        }
    }
}
