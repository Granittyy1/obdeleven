package androidx.compose.runtime;

/* JADX INFO: compiled from: SnapshotIntState.kt */
/* JADX INFO: loaded from: classes.dex */
public interface V extends X<Integer>, N0<Integer> {
    void m(int i10);

    int o();

    @Override // androidx.compose.runtime.X
    /* bridge */ /* synthetic */ default void setValue(Integer num) {
        u(num.intValue());
    }

    default void u(int i10) {
        m(i10);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.N0
    default Integer getValue() {
        return Integer.valueOf(o());
    }
}
