package androidx.compose.runtime.snapshots;

import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Snapshot.kt */
/* JADX INFO: loaded from: classes.dex */
final class SnapshotKt$takeNewSnapshot$1 extends Lambda implements Ia.l<SnapshotIdSet, Object> {
    final /* synthetic */ Ia.l<SnapshotIdSet, Object> $block;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SnapshotKt$takeNewSnapshot$1(Ia.l<? super SnapshotIdSet, Object> lVar) {
        super(1);
        this.$block = lVar;
    }

    @Override // Ia.l
    public final Object invoke(SnapshotIdSet snapshotIdSet) {
        g gVar = (g) this.$block.invoke(snapshotIdSet);
        synchronized (SnapshotKt.f13154c) {
            SnapshotKt.f13155d = SnapshotKt.f13155d.A(gVar.g());
            p293xa.r rVar = p293xa.r.f47939a;
        }
        return gVar;
    }
}
