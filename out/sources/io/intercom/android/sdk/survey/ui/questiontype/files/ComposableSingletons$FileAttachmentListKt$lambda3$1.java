package io.intercom.android.sdk.survey.ui.questiontype.files;

import android.net.Uri;
import androidx.compose.runtime.InterfaceC1084f;
import com.google.android.gms.internal.measurement.M1;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData;
import io.intercom.android.sdk.survey.ui.models.Answer;
import io.intercom.android.sdk.ui.common.StringProvider;

/* JADX INFO: renamed from: io.intercom.android.sdk.survey.ui.questiontype.files.ComposableSingletons$FileAttachmentListKt$lambda-3$1, reason: invalid class name */
/* JADX INFO: compiled from: FileAttachmentList.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$FileAttachmentListKt$lambda3$1 implements Ia.p<InterfaceC1084f, Integer, p293xa.r> {
    public static final ComposableSingletons$FileAttachmentListKt$lambda3$1 INSTANCE = new ComposableSingletons$FileAttachmentListKt$lambda3$1();

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r invoke$lambda$1(Answer.MediaAnswer.MediaItem it) {
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
            return;
        }
        Uri EMPTY = Uri.EMPTY;
        kotlin.jvm.internal.i.d(EMPTY, "EMPTY");
        Answer.MediaAnswer.MediaItem mediaItem = new Answer.MediaAnswer.MediaItem(new MediaData.Media.Image("image/png", 0, 0, 0L, "google.png", EMPTY));
        mediaItem.setUploadStatus(new Answer.MediaAnswer.FileUploadStatus.Error(new Answer.MediaAnswer.FileUploadError.FileLimitExceeded(M1.k(new StringProvider.StringRes(R.string.intercom_file_max_limit, null, 2, null)))));
        FileAttachmentListKt.FileAttachmentList(M1.k(mediaItem), new c(), interfaceC1084f, 48);
    }
}
