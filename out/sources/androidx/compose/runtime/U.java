package androidx.compose.runtime;

/* JADX INFO: compiled from: SnapshotFloatState.kt */
/* JADX INFO: loaded from: classes.dex */
public interface U extends X<Float>, N0<Float> {
    void f(float f10);

    float j();

    @Override // androidx.compose.runtime.X
    /* bridge */ /* synthetic */ default void setValue(Float f10) {
        w(f10.floatValue());
    }

    default void w(float f10) {
        f(f10);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.N0
    default Float getValue() {
        return Float.valueOf(j());
    }
}
