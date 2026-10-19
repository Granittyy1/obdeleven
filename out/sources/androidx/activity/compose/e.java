package androidx.activity.compose;

import androidx.compose.runtime.X;
import p293xa.r;

/* JADX INFO: compiled from: ActivityResultRegistry.kt */
/* JADX INFO: loaded from: classes.dex */
public final class e<I, O> extends p063f.c<I> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a<I> f8215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final X f8216b;

    public e(a aVar, X x10) {
        this.f8215a = aVar;
        this.f8216b = x10;
    }

    @Override // p063f.c
    public final void a(Object obj) {
        r rVar;
        p063f.f fVar = this.f8215a.f8211a;
        if (fVar != null) {
            fVar.a(obj);
            rVar = r.f47939a;
        } else {
            rVar = null;
        }
        if (rVar == null) {
            throw new IllegalStateException("Launcher has not been initialized");
        }
    }
}
