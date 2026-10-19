package androidx.activity.compose;

import androidx.compose.runtime.A;
import p293xa.r;

/* JADX INFO: compiled from: Effects.kt */
/* JADX INFO: loaded from: classes.dex */
public final class b implements A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a f8212a;

    public b(a aVar) {
        this.f8212a = aVar;
    }

    @Override // androidx.compose.runtime.A
    public final void dispose() {
        r rVar;
        p063f.f fVar = this.f8212a.f8211a;
        if (fVar != null) {
            fVar.b();
            rVar = r.f47939a;
        } else {
            rVar = null;
        }
        if (rVar == null) {
            throw new IllegalStateException("Launcher has not been initialized");
        }
    }
}
