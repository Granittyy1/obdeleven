package kotlin;

import java.io.Serializable;
import p293xa.g;

/* JADX INFO: compiled from: Lazy.kt */
/* JADX INFO: loaded from: classes.dex */
public final class InitializedLazyImpl<T> implements g<T>, Serializable {
    private final T value;

    public InitializedLazyImpl(T t8) {
        this.value = t8;
    }

    @Override // p293xa.g
    public final boolean d() {
        return true;
    }

    @Override // p293xa.g
    public final T getValue() {
        return this.value;
    }

    public final String toString() {
        return String.valueOf(this.value);
    }
}
