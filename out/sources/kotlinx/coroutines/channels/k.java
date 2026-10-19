package kotlinx.coroutines.channels;

import D2.V;
import kotlinx.coroutines.K0;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;
import kotlinx.coroutines.internal.UndeliveredElementException;

/* JADX INFO: compiled from: ConflatedBufferedChannel.kt */
/* JADX INFO: loaded from: classes2.dex */
public class k<E> extends BufferedChannel<E> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final BufferOverflow f43297n;

    public k(int i10, BufferOverflow bufferOverflow, Ia.l<? super E, p293xa.r> lVar) {
        super(lVar, i10);
        this.f43297n = bufferOverflow;
        if (bufferOverflow != BufferOverflow.f43243b) {
            if (i10 < 1) {
                throw new IllegalArgumentException(J4.i.c(i10, "Buffered channel capacity must be at least 1, but ", " was specified").toString());
            }
        } else {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + kotlin.jvm.internal.l.a(BufferedChannel.class).a() + " instead").toString());
        }
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel
    public final boolean G() {
        return this.f43297n == BufferOverflow.f43244c;
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel
    public final Object O(E e10, kotlin.coroutines.c<? super Boolean> cVar) {
        Object objV = V(e10, true);
        if (objV instanceof h.b) {
            return Boolean.FALSE;
        }
        return Boolean.TRUE;
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel
    public final boolean P() {
        return false;
    }

    public final Object V(E e10, boolean z10) {
        i iVar;
        h.a aVar;
        Ia.l<E, p293xa.r> lVar;
        UndeliveredElementException undeliveredElementExceptionB;
        if (this.f43297n == BufferOverflow.f43245d) {
            Object objN = super.n(e10);
            if (!(objN instanceof h.b) || (objN instanceof h.a)) {
                return objN;
            }
            if (!z10 || (lVar = this.f43256c) == null || (undeliveredElementExceptionB = OnUndeliveredElementKt.b(lVar, e10, null)) == null) {
                return p293xa.r.f47939a;
            }
            throw undeliveredElementExceptionB;
        }
        p191p5.c cVar = c.f43272d;
        i iVar2 = (i) BufferedChannel.f43251i.get(this);
        while (true) {
            long andIncrement = BufferedChannel.f43247e.getAndIncrement(this);
            long j = andIncrement & 1152921504606846975L;
            boolean zE = E(andIncrement, false);
            long j10 = c.f43270b;
            long j11 = j / j10;
            int i10 = (int) (j % j10);
            if (iVar2.f43504d != j11) {
                i iVarB = BufferedChannel.b(this, j11, iVar2);
                if (iVarB != null) {
                    iVar = iVarB;
                } else if (zE) {
                    aVar = new h.a(A());
                    break;
                }
            } else {
                iVar = iVar2;
            }
            i iVar3 = iVar;
            int iK = BufferedChannel.k(this, iVar, i10, e10, j, cVar, zE);
            if (iK == 0) {
                iVar3.b();
            } else if (iK != 1) {
                if (iK == 2) {
                    if (zE) {
                        iVar3.i();
                        aVar = new h.a(A());
                        break;
                    }
                    K0 k10 = cVar instanceof K0 ? (K0) cVar : null;
                    if (k10 != null) {
                        BufferedChannel.h(this, k10, iVar3, i10);
                    }
                    s((iVar3.f43504d * j10) + ((long) i10));
                    return p293xa.r.f47939a;
                }
                if (iK == 3) {
                    throw new IllegalStateException("unexpected");
                }
                if (iK == 4) {
                    if (j < BufferedChannel.f43248f.get(this)) {
                        iVar3.b();
                    }
                    aVar = new h.a(A());
                    break;
                }
                if (iK == 5) {
                    iVar3.b();
                }
                iVar2 = iVar3;
            }
            return p293xa.r.f47939a;
        }
        return aVar;
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel, kotlinx.coroutines.channels.q
    public final Object n(E e10) {
        return V(e10, false);
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel, kotlinx.coroutines.channels.q
    public final Object t(E e10, kotlin.coroutines.c<? super p293xa.r> cVar) throws Throwable {
        UndeliveredElementException undeliveredElementExceptionB;
        Object objV = V(e10, true);
        if (!(objV instanceof h.a)) {
            return p293xa.r.f47939a;
        }
        h.a(objV);
        Ia.l<E, p293xa.r> lVar = this.f43256c;
        if (lVar == null || (undeliveredElementExceptionB = OnUndeliveredElementKt.b(lVar, e10, null)) == null) {
            throw A();
        }
        V.e(undeliveredElementExceptionB, A());
        throw undeliveredElementExceptionB;
    }
}
