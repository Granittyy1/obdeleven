package io.intercom.android.sdk.tickets;

import androidx.compose.runtime.InterfaceC1084f;
import io.intercom.android.sdk.m5.components.ErrorState;
import io.intercom.android.sdk.ui.preview.data.IntercomPreviewFile;
import io.intercom.android.sdk.ui.preview.ui.PreviewUriKt;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class m implements Ia.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f39957b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.h f39958c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f39959d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f39960e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f39961f;

    public /* synthetic */ m(androidx.compose.ui.h hVar, IntercomPreviewFile intercomPreviewFile, int i10, int i11) {
        this.f39958c = hVar;
        this.f39961f = intercomPreviewFile;
        this.f39959d = i10;
        this.f39960e = i11;
    }

    @Override // Ia.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f39957b) {
            case 0:
                return TicketDetailErrorScreenKt.TicketDetailErrorScreen$lambda$0((ErrorState) this.f39961f, this.f39958c, this.f39959d, this.f39960e, (InterfaceC1084f) obj, ((Integer) obj2).intValue());
            default:
                return PreviewUriKt.PreviewUri$lambda$0(this.f39958c, (IntercomPreviewFile) this.f39961f, this.f39959d, this.f39960e, (InterfaceC1084f) obj, ((Integer) obj2).intValue());
        }
    }

    public /* synthetic */ m(ErrorState errorState, androidx.compose.ui.h hVar, int i10, int i11) {
        this.f39961f = errorState;
        this.f39958c = hVar;
        this.f39959d = i10;
        this.f39960e = i11;
    }
}
