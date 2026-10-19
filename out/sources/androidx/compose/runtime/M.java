package androidx.compose.runtime;

import kotlinx.coroutines.C2680e;

/* JADX INFO: compiled from: Effects.kt */
/* JADX INFO: loaded from: classes.dex */
public final class M implements t0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> f12874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kotlinx.coroutines.internal.f f12875c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public kotlinx.coroutines.z0 f12876d;

    /* JADX WARN: Multi-variable type inference failed */
    public M(kotlin.coroutines.e eVar, Ia.p<? super kotlinx.coroutines.A, ? super kotlin.coroutines.c<? super p293xa.r>, ? extends Object> pVar) {
        this.f12874b = pVar;
        this.f12875c = kotlinx.coroutines.B.a(eVar);
    }

    @Override // androidx.compose.runtime.t0
    public final void b() {
        kotlinx.coroutines.z0 z0Var = this.f12876d;
        if (z0Var != null) {
            z0Var.F(new LeftCompositionCancellationException());
        }
        this.f12876d = null;
    }

    @Override // androidx.compose.runtime.t0
    public final void c() {
        kotlinx.coroutines.z0 z0Var = this.f12876d;
        if (z0Var != null) {
            z0Var.F(new LeftCompositionCancellationException());
        }
        this.f12876d = null;
    }

    @Override // androidx.compose.runtime.t0
    public final void d() {
        kotlinx.coroutines.z0 z0Var = this.f12876d;
        if (z0Var != null) {
            z0Var.i(kotlin.jvm.internal.h.b("Old job was still running!", null));
        }
        this.f12876d = C2680e.c(this.f12875c, null, null, this.f12874b, 3);
    }
}
