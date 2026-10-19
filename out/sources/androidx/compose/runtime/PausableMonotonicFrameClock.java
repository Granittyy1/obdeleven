package androidx.compose.runtime;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.C2693i;
import kotlinx.coroutines.InterfaceC2691h;

/* JADX INFO: compiled from: PausableMonotonicFrameClock.kt */
/* JADX INFO: loaded from: classes.dex */
public final class PausableMonotonicFrameClock implements O {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final O f12886b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final L f12887c = new L();

    public PausableMonotonicFrameClock(O o10) {
        this.f12886b = o10;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.compose.runtime.O
    public final <R> Object P0(Ia.l<? super Long, ? extends R> lVar, kotlin.coroutines.c<? super R> cVar) {
        PausableMonotonicFrameClock$withFrameNanos$1 pausableMonotonicFrameClock$withFrameNanos$1;
        boolean z10;
        Object objP;
        PausableMonotonicFrameClock pausableMonotonicFrameClock;
        if (cVar instanceof PausableMonotonicFrameClock$withFrameNanos$1) {
            pausableMonotonicFrameClock$withFrameNanos$1 = (PausableMonotonicFrameClock$withFrameNanos$1) cVar;
            int i10 = pausableMonotonicFrameClock$withFrameNanos$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                pausableMonotonicFrameClock$withFrameNanos$1.label = i10 - Integer.MIN_VALUE;
            } else {
                pausableMonotonicFrameClock$withFrameNanos$1 = new PausableMonotonicFrameClock$withFrameNanos$1(this, cVar);
            }
        } else {
            pausableMonotonicFrameClock$withFrameNanos$1 = new PausableMonotonicFrameClock$withFrameNanos$1(this, cVar);
        }
        Object objP0 = pausableMonotonicFrameClock$withFrameNanos$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = pausableMonotonicFrameClock$withFrameNanos$1.label;
        if (i11 != 0) {
            if (i11 == 1) {
                lVar = (Ia.l) pausableMonotonicFrameClock$withFrameNanos$1.L$1;
                pausableMonotonicFrameClock = (PausableMonotonicFrameClock) pausableMonotonicFrameClock$withFrameNanos$1.L$0;
                kotlin.b.b(objP0);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(objP0);
            }
        }
        kotlin.b.b(objP0);
        final L l10 = this.f12887c;
        pausableMonotonicFrameClock$withFrameNanos$1.L$0 = this;
        pausableMonotonicFrameClock$withFrameNanos$1.L$1 = lVar;
        pausableMonotonicFrameClock$withFrameNanos$1.label = 1;
        synchronized (l10.f12865a) {
            z10 = l10.f12868d;
        }
        if (z10) {
            objP = p293xa.r.f47939a;
        } else {
            final C2693i c2693i = new C2693i(1, A8.p.y(pausableMonotonicFrameClock$withFrameNanos$1));
            c2693i.s();
            synchronized (l10.f12865a) {
                l10.f12866b.add(c2693i);
            }
            c2693i.u(new Ia.l<Throwable, p293xa.r>() { // from class: androidx.compose.runtime.Latch$await$2$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // Ia.l
                public final p293xa.r invoke(Throwable th) {
                    L l11 = l10;
                    Object obj = l11.f12865a;
                    InterfaceC2691h<p293xa.r> interfaceC2691h = c2693i;
                    synchronized (obj) {
                        l11.f12866b.remove(interfaceC2691h);
                    }
                    return p293xa.r.f47939a;
                }
            });
            objP = c2693i.p();
            if (objP != coroutineSingletons) {
                objP = p293xa.r.f47939a;
            }
        }
        if (objP == coroutineSingletons) {
            return coroutineSingletons;
        }
        pausableMonotonicFrameClock = this;
        O o10 = pausableMonotonicFrameClock.f12886b;
        pausableMonotonicFrameClock$withFrameNanos$1.L$0 = null;
        pausableMonotonicFrameClock$withFrameNanos$1.L$1 = null;
        pausableMonotonicFrameClock$withFrameNanos$1.label = 2;
        objP0 = o10.P0(lVar, pausableMonotonicFrameClock$withFrameNanos$1);
        return objP0 == coroutineSingletons ? coroutineSingletons : objP0;
    }

    @Override // kotlin.coroutines.e
    public final <R> R fold(R r10, Ia.p<? super R, ? super kotlin.coroutines.e.a, ? extends R> pVar) {
        return (R) kotlin.coroutines.e.a.C0479a.a(this, r10, pVar);
    }

    @Override // kotlin.coroutines.e
    public final <E extends kotlin.coroutines.e.a> E get(kotlin.coroutines.e.b<E> bVar) {
        return (E) kotlin.coroutines.e.a.C0479a.b(this, bVar);
    }

    @Override // kotlin.coroutines.e
    public final kotlin.coroutines.e minusKey(kotlin.coroutines.e.b<?> bVar) {
        return kotlin.coroutines.e.a.C0479a.c(this, bVar);
    }

    @Override // kotlin.coroutines.e
    public final kotlin.coroutines.e plus(kotlin.coroutines.e eVar) {
        return kotlin.coroutines.e.a.C0479a.d(this, eVar);
    }
}
