package androidx.lifecycle;

/* JADX INFO: renamed from: androidx.lifecycle.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: LegacySavedStateHandleController.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C1371n implements r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Lifecycle f17821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p248u2.c f17822c;

    public C1371n(Lifecycle lifecycle, p248u2.c cVar) {
        this.f17821b = lifecycle;
        this.f17822c = cVar;
    }

    @Override // androidx.lifecycle.r
    public final void h(InterfaceC1376t interfaceC1376t, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_START) {
            this.f17821b.c(this);
            this.f17822c.d();
        }
    }
}
