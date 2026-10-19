package com.voltasit.obdeleven.presentation.garage;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f32374b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f32375c;

    public /* synthetic */ j(int i10, Object obj) {
        this.f32374b = i10;
        this.f32375c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f32374b) {
            case 0:
                GarageFragment this$0 = (GarageFragment) this.f32375c;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                GarageViewModel garageViewModelO = this$0.O();
                GarageViewModel.a aVar = garageViewModelO.f32337d0;
                if (aVar != null) {
                    garageViewModelO.f32333Z.j(aVar);
                }
                garageViewModelO.f32337d0 = null;
                break;
            default:
                ((androidx.media3.ui.d) this.f32375c).invalidate();
                break;
        }
    }
}
