package kotlinx.coroutines;

/* JADX INFO: compiled from: Unconfined.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class H0 extends AbstractC2712w {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final H0 f43180c = new H0();

    @Override // kotlinx.coroutines.AbstractC2712w
    public final void Z0(kotlin.coroutines.e eVar, Runnable runnable) {
        L0 l10 = (L0) eVar.get(L0.f43196c);
        if (l10 == null) {
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
        l10.f43197b = true;
    }

    @Override // kotlinx.coroutines.AbstractC2712w
    public final String toString() {
        return "Dispatchers.Unconfined";
    }
}
