package androidx.compose.ui;

import com.braze.ui.BrazeFeedFragment;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f13304b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f13305c;

    public /* synthetic */ b(int i10, Object obj) {
        this.f13304b = i10;
        this.f13305c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f13304b) {
            case 0:
                ((Ia.a) this.f13305c).invoke();
                break;
            case 1:
                ((BrazeFeedFragment) this.f13305c).lambda$onRefresh$5();
                break;
            default:
                ((com.google.firebase.installations.a) this.f13305c).b();
                break;
        }
    }
}
