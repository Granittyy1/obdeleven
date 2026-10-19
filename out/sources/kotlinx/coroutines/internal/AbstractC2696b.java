package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: kotlinx.coroutines.internal.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: Atomic.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2696b<T> extends r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f43468a = AtomicReferenceFieldUpdater.newUpdater(AbstractC2696b.class, Object.class, "_consensus$volatile");
    private volatile /* synthetic */ Object _consensus$volatile = C2695a.f43467a;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.internal.r
    public final Object a(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f43468a;
        Object obj2 = atomicReferenceFieldUpdater.get(this);
        D3.l lVar = C2695a.f43467a;
        if (obj2 == lVar) {
            D3.l lVarC = c(obj);
            obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 == lVar) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, lVar, lVarC)) {
                    if (atomicReferenceFieldUpdater.get(this) != lVar) {
                        obj2 = atomicReferenceFieldUpdater.get(this);
                    }
                }
                obj2 = lVarC;
            }
        }
        b(obj, obj2);
        return obj2;
    }

    public abstract void b(T t8, Object obj);

    public abstract D3.l c(Object obj);
}
