package io.intercom.android.sdk.m5.conversation.ui.components;

import io.intercom.android.sdk.overlay.OverlayPresenter;
import io.intercom.android.sdk.survey.ui.questiontype.files.FileActionSheetKt;
import io.intercom.android.sdk.ui.preview.data.IntercomPreviewFile;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class L implements Ia.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f38548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f38549c;

    public /* synthetic */ L(int i10, Object obj) {
        this.f38548b = i10;
        this.f38549c = obj;
    }

    @Override // Ia.l
    public final Object invoke(Object obj) {
        switch (this.f38548b) {
            case 0:
                return MediaInputSheetContentKt.MediaInputSheetContent$lambda$21$lambda$20$lambda$13$lambda$12((Ia.l) this.f38549c, (List) obj);
            case 1:
                return ((OverlayPresenter) this.f38549c).lambda$new$0((Set) obj);
            default:
                return FileActionSheetKt.FileActionSheet$lambda$4$lambda$3((Ia.a) this.f38549c, (IntercomPreviewFile) obj);
        }
    }
}
