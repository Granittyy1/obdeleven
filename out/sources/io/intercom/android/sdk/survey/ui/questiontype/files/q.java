package io.intercom.android.sdk.survey.ui.questiontype.files;

import io.intercom.android.sdk.m5.conversation.states.AttributeData;
import io.intercom.android.sdk.models.CountryAreaCode;
import io.intercom.android.sdk.survey.ui.models.Answer;
import io.intercom.android.sdk.views.compose.TextAttributeCollectorKt;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class q implements Ia.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f39736b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f39737c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f39738d;

    public /* synthetic */ q(Object obj, int i10, Object obj2) {
        this.f39736b = i10;
        this.f39737c = obj;
        this.f39738d = obj2;
    }

    @Override // Ia.a
    public final Object invoke() {
        switch (this.f39736b) {
            case 0:
                return FileAttachmentListKt.FileAttachmentList$lambda$3$lambda$2$lambda$0((Ia.l) this.f39737c, (Answer.MediaAnswer.MediaItem) this.f39738d);
            default:
                return TextAttributeCollectorKt.TextAttributeCollector$lambda$5((AttributeData) this.f39737c, (CountryAreaCode) this.f39738d);
        }
    }
}
