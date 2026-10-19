package androidx.compose.ui.input.pointer;

/* JADX INFO: compiled from: PointerInteropFilter.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class z implements Ia.l<Boolean, p293xa.r> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public PointerInteropFilter f14150b;

    @Override // Ia.l
    public final p293xa.r invoke(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        PointerInteropFilter pointerInteropFilter = this.f14150b;
        if (pointerInteropFilter != null) {
            pointerInteropFilter.f14037d = zBooleanValue;
        }
        return p293xa.r.f47939a;
    }
}
