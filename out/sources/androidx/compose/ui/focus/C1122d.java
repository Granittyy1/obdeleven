package androidx.compose.ui.focus;

/* JADX INFO: renamed from: androidx.compose.ui.focus.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: FocusChangedModifier.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C1122d extends androidx.compose.ui.h.c implements i {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Ia.l<? super y, p293xa.r> f13447p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public FocusStateImpl f13448q;

    public C1122d() {
        throw null;
    }

    @Override // androidx.compose.ui.focus.i
    public final void V0(FocusStateImpl focusStateImpl) {
        if (kotlin.jvm.internal.i.a(this.f13448q, focusStateImpl)) {
            return;
        }
        this.f13448q = focusStateImpl;
        this.f13447p.invoke(focusStateImpl);
    }
}
