package androidx.lifecycle;

/* JADX INFO: compiled from: SavedStateHandleSupport.kt */
/* JADX INFO: loaded from: classes.dex */
public final class L implements r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final P f17746b;

    public L(P p10) {
        this.f17746b = p10;
    }

    @Override // androidx.lifecycle.r
    public final void h(InterfaceC1376t interfaceC1376t, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_CREATE) {
            interfaceC1376t.getLifecycle().c(this);
            this.f17746b.b();
        } else {
            throw new IllegalStateException(("Next event must be ON_CREATE, it was " + event).toString());
        }
    }
}
