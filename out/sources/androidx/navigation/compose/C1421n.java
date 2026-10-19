package androidx.navigation.compose;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import p141l2.C2749t;

/* JADX INFO: renamed from: androidx.navigation.compose.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: Effects.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C1421n implements androidx.compose.runtime.A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1423p f19185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2749t f19186b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SnapshotStateList f19187c;

    public C1421n(SnapshotStateList snapshotStateList, C1423p c1423p, C2749t c2749t) {
        this.f19185a = c1423p;
        this.f19186b = c2749t;
        this.f19187c = snapshotStateList;
    }

    @Override // androidx.compose.runtime.A
    public final void dispose() {
        C1423p c1423p = this.f19185a;
        C2749t c2749t = this.f19186b;
        c1423p.b().b(c2749t);
        this.f19187c.remove(c2749t);
    }
}
