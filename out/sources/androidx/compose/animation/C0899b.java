package androidx.compose.animation;

import androidx.compose.runtime.snapshots.SnapshotStateList;

/* JADX INFO: renamed from: androidx.compose.animation.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: Effects.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C0899b implements androidx.compose.runtime.A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SnapshotStateList f9331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AnimatedContentTransitionScopeImpl f9333c;

    public C0899b(SnapshotStateList snapshotStateList, Object obj, AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl) {
        this.f9331a = snapshotStateList;
        this.f9332b = obj;
        this.f9333c = animatedContentTransitionScopeImpl;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // androidx.compose.runtime.A
    public final void dispose() {
        SnapshotStateList snapshotStateList = this.f9331a;
        Object obj = this.f9332b;
        snapshotStateList.remove(obj);
        this.f9333c.f9243e.j((S) obj);
    }
}
