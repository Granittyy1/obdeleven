package androidx.compose.runtime.snapshots;

import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Lambda f13203a;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ f(Ia.p pVar) {
        this.f13203a = (Lambda) pVar;
    }

    @Override // androidx.compose.runtime.snapshots.d
    public final void dispose() {
        Lambda lambda = this.f13203a;
        synchronized (SnapshotKt.f13154c) {
            SnapshotKt.f13159h = kotlin.collections.q.a0((Iterable) SnapshotKt.f13159h, lambda);
            p293xa.r rVar = p293xa.r.f47939a;
        }
    }
}
