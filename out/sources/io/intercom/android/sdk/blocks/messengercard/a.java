package io.intercom.android.sdk.blocks.messengercard;

import Ia.l;
import io.intercom.android.sdk.m5.data.IntercomEvent;
import io.intercom.android.sdk.survey.ui.questiontype.text.LongTextQuestionKt;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f38066b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f38067c;

    public /* synthetic */ a(int i10, Object obj) {
        this.f38066b = i10;
        this.f38067c = obj;
    }

    @Override // Ia.l
    public final Object invoke(Object obj) {
        switch (this.f38066b) {
            case 0:
                return ((CardWebView) this.f38067c).lambda$setUp$0((IntercomEvent) obj);
            default:
                return LongTextQuestionKt.LongTextQuestion$lambda$4$lambda$3$lambda$2$lambda$1((l) this.f38067c, (String) obj);
        }
    }
}
