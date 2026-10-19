package kotlin;

import java.io.Serializable;
import kotlin.jvm.internal.i;
import p293xa.g;
import p293xa.o;

/* JADX INFO: compiled from: Lazy.kt */
/* JADX INFO: loaded from: classes.dex */
public final class UnsafeLazyImpl<T> implements g<T>, Serializable {
    private Object _value;
    private Ia.a<? extends T> initializer;

    public UnsafeLazyImpl(Ia.a<? extends T> initializer) {
        i.e(initializer, "initializer");
        this.initializer = initializer;
        this._value = o.f47934a;
    }

    private final Object writeReplace() {
        return new InitializedLazyImpl(getValue());
    }

    @Override // p293xa.g
    public final boolean d() {
        return this._value != o.f47934a;
    }

    @Override // p293xa.g
    public final T getValue() {
        if (this._value == o.f47934a) {
            Ia.a<? extends T> aVar = this.initializer;
            i.b(aVar);
            this._value = aVar.invoke();
            this.initializer = null;
        }
        return (T) this._value;
    }

    public final String toString() {
        return d() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
