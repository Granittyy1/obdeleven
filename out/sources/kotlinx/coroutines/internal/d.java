package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: ConcurrentLinkedList.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final D3.l f43470a = new D3.l(4, "CLOSED");

    public static final <S extends v<S>> Object a(S s10, long j, Ia.p<? super Long, ? super S, ? extends S> pVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        while (true) {
            if (s10.f43504d >= j && !s10.d()) {
                return s10;
            }
            Object obj = e.f43471b.get(s10);
            D3.l lVar = f43470a;
            if (obj == lVar) {
                return lVar;
            }
            S sInvoke = (S) ((e) obj);
            if (sInvoke == null) {
                sInvoke = pVar.invoke(Long.valueOf(s10.f43504d + 1), s10);
                do {
                    atomicReferenceFieldUpdater = e.f43471b;
                    if (atomicReferenceFieldUpdater.compareAndSet(s10, null, sInvoke)) {
                        if (s10.d()) {
                            s10.e();
                        }
                    }
                } while (atomicReferenceFieldUpdater.get(s10) == null);
            }
            s10 = (Object) sInvoke;
        }
    }
}
