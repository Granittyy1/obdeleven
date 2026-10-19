package androidx.compose.material3;

import android.window.OnBackInvokedCallback;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Q implements OnBackInvokedCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ia.a f12282b;

    public /* synthetic */ Q(int i10, Ia.a aVar) {
        this.f12281a = i10;
        this.f12282b = aVar;
    }

    public final void onBackInvoked() {
        switch (this.f12281a) {
            case 0:
                this.f12282b.invoke();
                break;
            default:
                Ia.a aVar = this.f12282b;
                if (aVar != null) {
                    aVar.invoke();
                }
                break;
        }
    }
}
