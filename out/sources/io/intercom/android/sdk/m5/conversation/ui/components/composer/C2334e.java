package io.intercom.android.sdk.m5.conversation.ui.components.composer;

import android.content.Context;
import androidx.compose.foundation.text.InterfaceC1000i;
import androidx.compose.ui.platform.M0;
import io.intercom.android.sdk.survey.QuestionState;
import io.intercom.android.sdk.survey.ui.components.QuestionComponentKt;

/* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ui.components.composer.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C2334e implements Ia.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f38701b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Ia.l f38702c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f38703d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f38704e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f38705f;

    public /* synthetic */ C2334e(Ia.l lVar, Context context, String str, androidx.compose.runtime.X x10) {
        this.f38702c = lVar;
        this.f38703d = context;
        this.f38704e = str;
        this.f38705f = x10;
    }

    @Override // Ia.l
    public final Object invoke(Object obj) {
        switch (this.f38701b) {
            case 0:
                String str = (String) this.f38704e;
                return CameraInputButtonKt.CameraInputButton$lambda$5(this.f38702c, (Context) this.f38703d, str, (androidx.compose.runtime.X) this.f38705f, (p063f.a) obj);
            default:
                return QuestionComponentKt.QuestionComponent_lzVJ5Jw$lambda$2((QuestionState) this.f38703d, this.f38702c, (M0) this.f38704e, (androidx.compose.ui.focus.n) this.f38705f, (InterfaceC1000i) obj);
        }
    }

    public /* synthetic */ C2334e(QuestionState questionState, Ia.l lVar, M0 m7, androidx.compose.ui.focus.n nVar) {
        this.f38703d = questionState;
        this.f38702c = lVar;
        this.f38704e = m7;
        this.f38705f = nVar;
    }
}
