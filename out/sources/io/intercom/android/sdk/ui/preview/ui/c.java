package io.intercom.android.sdk.ui.preview.ui;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Ia.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f40066b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p248u2.e f40067c;

    public /* synthetic */ c(p248u2.e eVar, int i10) {
        this.f40066b = i10;
        this.f40067c = eVar;
    }

    @Override // Ia.a
    public final Object invoke() {
        switch (this.f40066b) {
            case 0:
                return IntercomPreviewActivity.viewModel_delegate$lambda$0((IntercomPreviewActivity) this.f40067c);
            default:
                p248u2.e eVar = this.f40067c;
                eVar.getLifecycle().a(new p248u2.a(eVar));
                return p293xa.r.f47939a;
        }
    }
}
