package io.intercom.android.sdk.m5.conversation.ui.components.row;

import androidx.compose.runtime.InterfaceC1084f;
import io.intercom.android.sdk.survey.SurveyState;
import io.intercom.android.sdk.survey.ui.components.ErrorComponentKt;
import io.intercom.android.sdk.ui.preview.data.IntercomPreviewFile;
import io.intercom.android.sdk.ui.preview.ui.PreviewUriKt;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class p implements Ia.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f38919b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.h f38920c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f38921d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f38922e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f38923f;

    public /* synthetic */ p(androidx.compose.ui.h hVar, IntercomPreviewFile intercomPreviewFile, int i10, int i11) {
        this.f38919b = 2;
        this.f38920c = hVar;
        this.f38923f = intercomPreviewFile;
        this.f38921d = i10;
        this.f38922e = i11;
    }

    @Override // Ia.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f38919b) {
            case 0:
                return DayDividerKt.DayDivider$lambda$1((String) this.f38923f, this.f38920c, this.f38921d, this.f38922e, (InterfaceC1084f) obj, ((Integer) obj2).intValue());
            case 1:
                return ErrorComponentKt.SurveyError$lambda$1((SurveyState.Error) this.f38923f, this.f38920c, this.f38921d, this.f38922e, (InterfaceC1084f) obj, ((Integer) obj2).intValue());
            default:
                InterfaceC1084f interfaceC1084f = (InterfaceC1084f) obj;
                int iIntValue = ((Integer) obj2).intValue();
                return PreviewUriKt.PdfPreview$lambda$14(this.f38920c, (IntercomPreviewFile) this.f38923f, this.f38921d, this.f38922e, interfaceC1084f, iIntValue);
        }
    }

    public /* synthetic */ p(Object obj, androidx.compose.ui.h hVar, int i10, int i11, int i12) {
        this.f38919b = i12;
        this.f38923f = obj;
        this.f38920c = hVar;
        this.f38921d = i10;
        this.f38922e = i11;
    }
}
