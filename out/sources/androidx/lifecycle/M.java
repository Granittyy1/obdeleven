package androidx.lifecycle;

/* JADX INFO: compiled from: SavedStateHandleController.kt */
/* JADX INFO: loaded from: classes.dex */
public final class M implements r, AutoCloseable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f17757b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final K f17758c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f17759d;

    public M(String str, K k10) {
        this.f17757b = str;
        this.f17758c = k10;
    }

    @Override // androidx.lifecycle.r
    public final void h(InterfaceC1376t interfaceC1376t, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            this.f17759d = false;
            interfaceC1376t.getLifecycle().c(this);
        }
    }

    public final void j(Lifecycle lifecycle, p248u2.c registry) {
        kotlin.jvm.internal.i.e(registry, "registry");
        kotlin.jvm.internal.i.e(lifecycle, "lifecycle");
        if (this.f17759d) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.f17759d = true;
        lifecycle.a(this);
        registry.c(this.f17757b, this.f17758c.f17743b.f7997e);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }
}
