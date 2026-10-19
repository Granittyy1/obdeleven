package androidx.compose.runtime;

/* JADX INFO: renamed from: androidx.compose.runtime.u, reason: case insensitive filesystem */
/* JADX INFO: compiled from: Effects.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C1113u implements t0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kotlinx.coroutines.A f13246b;

    public C1113u(kotlinx.coroutines.A a10) {
        this.f13246b = a10;
    }

    @Override // androidx.compose.runtime.t0
    public final void b() {
        kotlinx.coroutines.A a10 = this.f13246b;
        if (a10 instanceof v0) {
            ((v0) a10).a();
        } else {
            kotlinx.coroutines.B.c(a10, new LeftCompositionCancellationException());
        }
    }

    @Override // androidx.compose.runtime.t0
    public final void c() {
        kotlinx.coroutines.A a10 = this.f13246b;
        if (a10 instanceof v0) {
            ((v0) a10).a();
        } else {
            kotlinx.coroutines.B.c(a10, new LeftCompositionCancellationException());
        }
    }

    @Override // androidx.compose.runtime.t0
    public final void d() {
    }
}
