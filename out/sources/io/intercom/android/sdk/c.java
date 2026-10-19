package io.intercom.android.sdk;

import android.app.Application;
import android.content.Context;
import io.intercom.android.sdk.survey.block.VideoFileBlockKt;
import io.intercom.android.sdk.survey.ui.questiontype.choice.ChoicePillKt;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements Ia.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f38068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f38069c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f38070d;

    public /* synthetic */ c(Object obj, int i10, Object obj2) {
        this.f38068b = i10;
        this.f38069c = obj;
        this.f38070d = obj2;
    }

    @Override // Ia.a
    public final Object invoke() {
        switch (this.f38068b) {
            case 0:
                return AppIdentityInjector.api_delegate$lambda$8((Application) this.f38069c, (AppIdentityInjector) this.f38070d);
            case 1:
                return VideoFileBlockKt.VideoFileBlock$lambda$1((String) this.f38069c, (Context) this.f38070d);
            default:
                return ChoicePillKt.ChoicePill_UdaoDFU$lambda$2$lambda$1((Ia.l) this.f38069c, (String) this.f38070d);
        }
    }
}
