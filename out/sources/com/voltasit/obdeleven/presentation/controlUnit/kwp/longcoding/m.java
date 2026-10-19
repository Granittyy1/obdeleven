package com.voltasit.obdeleven.presentation.controlUnit.kwp.longcoding;

import android.content.DialogInterface;
import io.intercom.android.sdk.helpcenter.articles.IntercomArticleActivity;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.overlay.OverlayPresenter;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class m implements Ia.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f31822b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f31823c;

    public /* synthetic */ m(int i10, Object obj) {
        this.f31822b = i10;
        this.f31823c = obj;
    }

    @Override // Ia.l
    public final Object invoke(Object obj) {
        switch (this.f31822b) {
            case 0:
                ((q) this.f31823c).getClass();
                ((DialogInterface) obj).dismiss();
                return p293xa.r.f47939a;
            case 1:
                return IntercomArticleActivity.viewModel_delegate$lambda$2$lambda$1((IntercomArticleActivity) this.f31823c, ((Integer) obj).intValue());
            default:
                return ((OverlayPresenter) this.f31823c).lambda$new$1((AppConfig) obj);
        }
    }
}
