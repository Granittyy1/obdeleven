package kotlinx.coroutines.channels;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlinx.coroutines.C2714y;
import kotlinx.coroutines.K0;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;
import kotlinx.coroutines.internal.UndeliveredElementException;
import kotlinx.coroutines.internal.v;

/* JADX INFO: compiled from: BufferedChannel.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class i<E> extends v<i<E>> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final BufferedChannel<E> f43294f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f43295g;

    public i(long j, i<E> iVar, BufferedChannel<E> bufferedChannel, int i10) {
        super(j, iVar, i10);
        this.f43294f = bufferedChannel;
        this.f43295g = new AtomicReferenceArray(c.f43270b * 2);
    }

    @Override // kotlinx.coroutines.internal.v
    public final int g() {
        return c.f43270b;
    }

    @Override // kotlinx.coroutines.internal.v
    public final void h(int i10, kotlin.coroutines.e eVar) {
        BufferedChannel<E> bufferedChannel;
        UndeliveredElementException undeliveredElementExceptionB;
        UndeliveredElementException undeliveredElementExceptionB2;
        int i11 = c.f43270b;
        boolean z10 = i10 >= i11;
        if (z10) {
            i10 -= i11;
        }
        Object obj = this.f43295g.get(i10 * 2);
        while (true) {
            Object objL = l(i10);
            boolean z11 = objL instanceof K0;
            bufferedChannel = this.f43294f;
            if (z11 || (objL instanceof r)) {
                if (k(objL, i10, z10 ? c.j : c.f43278k)) {
                    n(i10, null);
                    m(i10, !z10);
                    if (z10) {
                        kotlin.jvm.internal.i.b(bufferedChannel);
                        Ia.l<E, p293xa.r> lVar = bufferedChannel.f43256c;
                        if (lVar == null || (undeliveredElementExceptionB = OnUndeliveredElementKt.b(lVar, obj, null)) == null) {
                            return;
                        }
                        C2714y.a(eVar, undeliveredElementExceptionB);
                        return;
                    }
                    return;
                }
            } else {
                if (objL == c.j || objL == c.f43278k) {
                    break;
                }
                if (objL != c.f43275g && objL != c.f43274f) {
                    if (objL == c.f43277i || objL == c.f43272d || objL == c.f43279l) {
                        return;
                    }
                    throw new IllegalStateException(("unexpected state: " + objL).toString());
                }
            }
        }
        n(i10, null);
        if (z10) {
            kotlin.jvm.internal.i.b(bufferedChannel);
            Ia.l<E, p293xa.r> lVar2 = bufferedChannel.f43256c;
            if (lVar2 == null || (undeliveredElementExceptionB2 = OnUndeliveredElementKt.b(lVar2, obj, null)) == null) {
                return;
            }
            C2714y.a(eVar, undeliveredElementExceptionB2);
        }
    }

    public final boolean k(Object obj, int i10, Object obj2) {
        AtomicReferenceArray atomicReferenceArray = this.f43295g;
        int i11 = (i10 * 2) + 1;
        while (!atomicReferenceArray.compareAndSet(i11, obj, obj2)) {
            if (atomicReferenceArray.get(i11) != obj) {
                return false;
            }
        }
        return true;
    }

    public final Object l(int i10) {
        return this.f43295g.get((i10 * 2) + 1);
    }

    public final void m(int i10, boolean z10) {
        if (z10) {
            BufferedChannel<E> bufferedChannel = this.f43294f;
            kotlin.jvm.internal.i.b(bufferedChannel);
            bufferedChannel.U((this.f43504d * ((long) c.f43270b)) + ((long) i10));
        }
        i();
    }

    public final void n(int i10, Object obj) {
        this.f43295g.set(i10 * 2, obj);
    }

    public final void o(int i10, D3.l lVar) {
        this.f43295g.set((i10 * 2) + 1, lVar);
    }
}
