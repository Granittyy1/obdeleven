package kotlin;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.i;
import p293xa.g;
import p293xa.o;

/* JADX INFO: compiled from: LazyJVM.kt */
/* JADX INFO: loaded from: classes.dex */
final class SafePublicationLazyImpl<T> implements g<T>, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater<SafePublicationLazyImpl<?>, Object> f42975b = AtomicReferenceFieldUpdater.newUpdater(SafePublicationLazyImpl.class, Object.class, "_value");
    private volatile Object _value;

    /* JADX INFO: renamed from: final, reason: not valid java name */
    private final Object f377final;
    private volatile Ia.a<? extends T> initializer;

    public SafePublicationLazyImpl(Ia.a<? extends T> initializer) {
        i.e(initializer, "initializer");
        this.initializer = initializer;
        o oVar = o.f47934a;
        this._value = oVar;
        this.f377final = oVar;
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
        T t8 = (T) this._value;
        o oVar = o.f47934a;
        if (t8 != oVar) {
            return t8;
        }
        Ia.a<? extends T> aVar = this.initializer;
        if (aVar != null) {
            T tInvoke = aVar.invoke();
            AtomicReferenceFieldUpdater<SafePublicationLazyImpl<?>, Object> atomicReferenceFieldUpdater = f42975b;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, oVar, tInvoke)) {
                if (atomicReferenceFieldUpdater.get(this) != oVar) {
                }
            }
            this.initializer = null;
            return tInvoke;
        }
        return (T) this._value;
    }

    public final String toString() {
        return d() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
