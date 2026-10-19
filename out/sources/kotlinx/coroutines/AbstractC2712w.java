package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: kotlinx.coroutines.w, reason: case insensitive filesystem */
/* JADX INFO: compiled from: CoroutineDispatcher.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2712w extends kotlin.coroutines.a implements kotlin.coroutines.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f43614b = new a(kotlin.coroutines.d.a.f43035b, new Ia.l<kotlin.coroutines.e.a, AbstractC2712w>() { // from class: kotlinx.coroutines.CoroutineDispatcher$Key$1
        @Override // Ia.l
        public final AbstractC2712w invoke(kotlin.coroutines.e.a aVar) {
            kotlin.coroutines.e.a aVar2 = aVar;
            if (aVar2 instanceof AbstractC2712w) {
                return (AbstractC2712w) aVar2;
            }
            return null;
        }
    });

    /* JADX INFO: renamed from: kotlinx.coroutines.w$a */
    /* JADX INFO: compiled from: CoroutineDispatcher.kt */
    public static final class a extends kotlin.coroutines.b<kotlin.coroutines.d, AbstractC2712w> {
    }

    public AbstractC2712w() {
        super(kotlin.coroutines.d.a.f43035b);
    }

    public abstract void Z0(kotlin.coroutines.e eVar, Runnable runnable);

    public void a1(kotlin.coroutines.e eVar, Runnable runnable) {
        Z0(eVar, runnable);
    }

    public boolean b1(kotlin.coroutines.e eVar) {
        return !(this instanceof H0);
    }

    public AbstractC2712w c1(int i10) {
        com.voltasit.obdeleven.domain.usecases.device.u.g(i10);
        return new kotlinx.coroutines.internal.k(this, i10);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [Ia.l, kotlin.jvm.internal.Lambda] */
    @Override // kotlin.coroutines.a, kotlin.coroutines.e
    public final <E extends kotlin.coroutines.e.a> E get(kotlin.coroutines.e.b<E> key) {
        E e10;
        kotlin.jvm.internal.i.e(key, "key");
        if (!(key instanceof kotlin.coroutines.b)) {
            if (kotlin.coroutines.d.a.f43035b == key) {
                return this;
            }
            return null;
        }
        kotlin.coroutines.b bVar = (kotlin.coroutines.b) key;
        kotlin.coroutines.e.b<?> key2 = getKey();
        kotlin.jvm.internal.i.e(key2, "key");
        if ((key2 == bVar || bVar.f43034c == key2) && (e10 = (E) bVar.f43033b.invoke(this)) != null) {
            return e10;
        }
        return null;
    }

    @Override // kotlin.coroutines.d
    public final void j(kotlin.coroutines.c<?> cVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        kotlin.jvm.internal.i.c(cVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        kotlinx.coroutines.internal.h hVar = (kotlinx.coroutines.internal.h) cVar;
        do {
            atomicReferenceFieldUpdater = kotlinx.coroutines.internal.h.f43475i;
        } while (atomicReferenceFieldUpdater.get(hVar) == kotlinx.coroutines.internal.i.f43481b);
        Object obj = atomicReferenceFieldUpdater.get(hVar);
        C2693i c2693i = obj instanceof C2693i ? (C2693i) obj : null;
        if (c2693i != null) {
            c2693i.l();
        }
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [Ia.l, kotlin.jvm.internal.Lambda] */
    @Override // kotlin.coroutines.a, kotlin.coroutines.e
    public final kotlin.coroutines.e minusKey(kotlin.coroutines.e.b<?> key) {
        kotlin.jvm.internal.i.e(key, "key");
        if (key instanceof kotlin.coroutines.b) {
            kotlin.coroutines.b bVar = (kotlin.coroutines.b) key;
            kotlin.coroutines.e.b<?> key2 = getKey();
            kotlin.jvm.internal.i.e(key2, "key");
            if ((key2 == bVar || bVar.f43034c == key2) && ((kotlin.coroutines.e.a) bVar.f43033b.invoke(this)) != null) {
                return EmptyCoroutineContext.f43032b;
            }
        } else if (kotlin.coroutines.d.a.f43035b == key) {
            return EmptyCoroutineContext.f43032b;
        }
        return this;
    }

    @Override // kotlin.coroutines.d
    public final kotlinx.coroutines.internal.h s0(ContinuationImpl continuationImpl) {
        return new kotlinx.coroutines.internal.h(this, continuationImpl);
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + C.l(this);
    }
}
