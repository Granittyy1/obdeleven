package io.intercom.android.sdk.m5.inbox.ui;

import androidx.compose.runtime.B;
import androidx.lifecycle.InterfaceC1376t;
import io.intercom.android.sdk.survey.QuestionState;
import io.intercom.android.sdk.survey.ui.components.QuestionComponentKt;
import io.intercom.android.sdk.survey.ui.models.Answer;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class l implements Ia.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f39310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f39311c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f39312d;

    public /* synthetic */ l(Object obj, int i10, Object obj2) {
        this.f39310b = i10;
        this.f39311c = obj;
        this.f39312d = obj2;
    }

    @Override // Ia.l
    public final Object invoke(Object obj) {
        switch (this.f39310b) {
            case 0:
                return InboxScreenKt.InboxScreen$lambda$2((InterfaceC1376t) this.f39311c, (androidx.paging.compose.b) this.f39312d, (B) obj);
            default:
                return QuestionComponentKt.QuestionComponent_lzVJ5Jw$lambda$1((QuestionState) this.f39311c, (Ia.l) this.f39312d, (Answer) obj);
        }
    }
}
