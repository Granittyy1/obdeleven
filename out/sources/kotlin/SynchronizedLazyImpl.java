package kotlin;

import java.io.Serializable;
import kotlin.jvm.internal.i;
import p293xa.g;
import p293xa.o;

/* JADX INFO: compiled from: LazyJVM.kt */
/* JADX INFO: loaded from: classes.dex */
final class SynchronizedLazyImpl<T> implements g<T>, Serializable {
    private volatile Object _value;
    private Ia.a<? extends T> initializer;
    private final Object lock;

    public SynchronizedLazyImpl(Ia.a initializer) {
        i.e(initializer, "initializer");
        this.initializer = initializer;
        this._value = o.f47934a;
        this.lock = this;
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
        T tInvoke;
        T t8 = (T) this._value;
        o oVar = o.f47934a;
        if (t8 != oVar) {
            return t8;
        }
        synchronized (this.lock) {
            tInvoke = (T) this._value;
            if (tInvoke == oVar) {
                Ia.a<? extends T> aVar = this.initializer;
                i.b(aVar);
                tInvoke = aVar.invoke();
                this._value = tInvoke;
                this.initializer = null;
            }
        }
        return tInvoke;
    }

    public final String toString() {
        return d() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
