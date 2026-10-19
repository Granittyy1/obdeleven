package androidx.compose.runtime;

/* JADX INFO: compiled from: SnapshotLongState.kt */
/* JADX INFO: loaded from: classes.dex */
public interface W extends X<Long>, N0<Long> {
    long b();

    @Override // androidx.compose.runtime.N0
    default Long getValue() {
        return Long.valueOf(b());
    }

    @Override // androidx.compose.runtime.X
    default void setValue(Long l10) {
        t(l10.longValue());
    }

    void t(long j);
}
