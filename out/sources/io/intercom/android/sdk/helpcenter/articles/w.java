package io.intercom.android.sdk.helpcenter.articles;

import androidx.compose.runtime.InterfaceC1084f;
import io.intercom.android.sdk.survey.SurveyState;
import io.intercom.android.sdk.survey.ui.components.SurveyComponentKt;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class w implements Ia.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f38102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Ia.a f38103c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f38104d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f38105e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f38106f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f38107g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p293xa.e f38108h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p293xa.e f38109i;

    public /* synthetic */ w(Object obj, Object obj2, Ia.a aVar, p293xa.e eVar, p293xa.e eVar2, int i10, int i11, int i12) {
        this.f38102b = i12;
        this.f38106f = obj;
        this.f38107g = obj2;
        this.f38103c = aVar;
        this.f38108h = eVar;
        this.f38109i = eVar2;
        this.f38104d = i10;
        this.f38105e = i11;
    }

    @Override // Ia.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f38102b) {
            case 0:
                return ReactionsComponentKt.ReactionsComponent$lambda$14((androidx.compose.ui.h) this.f38106f, (ArticleViewState.ReactionState) this.f38107g, this.f38103c, (Ia.a) this.f38108h, (Ia.a) this.f38109i, this.f38104d, this.f38105e, (InterfaceC1084f) obj, ((Integer) obj2).intValue());
            default:
                return SurveyComponentKt.SurveyComponent$lambda$3((SurveyState) this.f38106f, (Ia.l) this.f38107g, this.f38103c, (Ia.l) this.f38108h, (Ia.l) this.f38109i, this.f38104d, this.f38105e, (InterfaceC1084f) obj, ((Integer) obj2).intValue());
        }
    }
}
