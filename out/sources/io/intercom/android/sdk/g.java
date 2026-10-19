package io.intercom.android.sdk;

import android.app.Application;
import io.intercom.android.sdk.survey.SurveyState;
import io.intercom.android.sdk.survey.ui.components.SurveyCtaButtonComponentKt;
import io.intercom.android.sdk.ui.coil.PdfDecoder;
import kotlin.jvm.internal.Ref$BooleanRef;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class g implements Ia.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f38078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f38079c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f38080d;

    public /* synthetic */ g(Object obj, int i10, Object obj2) {
        this.f38078b = i10;
        this.f38079c = obj;
        this.f38080d = obj2;
    }

    @Override // Ia.a
    public final Object invoke() {
        switch (this.f38078b) {
            case 0:
                return AppIdentityInjector.configurableHttpClient_delegate$lambda$1((Application) this.f38079c, (AppIdentityInjector) this.f38080d);
            case 1:
                return SurveyCtaButtonComponentKt.SurveyCtaButtonComponent$lambda$5$lambda$4$lambda$3$lambda$2((Ia.l) this.f38079c, (SurveyState.Content.SecondaryCta) this.f38080d);
            default:
                return PdfDecoder.decode$lambda$2((PdfDecoder) this.f38079c, (Ref$BooleanRef) this.f38080d);
        }
    }
}
