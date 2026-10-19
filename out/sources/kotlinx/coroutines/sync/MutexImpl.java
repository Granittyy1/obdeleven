package kotlinx.coroutines.sync;

import A8.p;
import Ia.l;
import Ia.q;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.C;
import kotlinx.coroutines.C2693i;
import kotlinx.coroutines.InterfaceC2691h;
import kotlinx.coroutines.K0;
import kotlinx.coroutines.internal.v;
import p293xa.r;

/* JADX INFO: compiled from: Mutex.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class MutexImpl extends SemaphoreImpl implements kotlinx.coroutines.sync.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f43590h = AtomicReferenceFieldUpdater.newUpdater(MutexImpl.class, Object.class, "owner$volatile");
    private volatile /* synthetic */ Object owner$volatile;

    /* JADX INFO: compiled from: Mutex.kt */
    public final class a implements InterfaceC2691h<r>, K0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final C2693i<r> f43591b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Object f43592c;

        /* JADX WARN: Multi-variable type inference failed */
        public a(C2693i<? super r> c2693i, Object obj) {
            this.f43591b = c2693i;
            this.f43592c = obj;
        }

        @Override // kotlinx.coroutines.InterfaceC2691h
        public final boolean c() {
            return this.f43591b.c();
        }

        @Override // kotlinx.coroutines.K0
        public final void d(v<?> vVar, int i10) {
            this.f43591b.d(vVar, i10);
        }

        @Override // kotlin.coroutines.c
        public final kotlin.coroutines.e getContext() {
            return this.f43591b.f43448f;
        }

        @Override // kotlinx.coroutines.InterfaceC2691h
        public final boolean o(Throwable th) {
            return this.f43591b.o(th);
        }

        @Override // kotlinx.coroutines.InterfaceC2691h
        public final void q(r rVar, l lVar) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = MutexImpl.f43590h;
            Object obj = this.f43592c;
            final MutexImpl mutexImpl = MutexImpl.this;
            atomicReferenceFieldUpdater.set(mutexImpl, obj);
            l<Throwable, r> lVar2 = new l<Throwable, r>() { // from class: kotlinx.coroutines.sync.MutexImpl$CancellableContinuationWithOwner$resume$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // Ia.l
                public final r invoke(Throwable th) {
                    mutexImpl.g(this.f43592c);
                    return r.f47939a;
                }
            };
            this.f43591b.q(rVar, lVar2);
        }

        @Override // kotlinx.coroutines.InterfaceC2691h
        public final D3.l r(Object obj, l lVar) {
            final MutexImpl mutexImpl = MutexImpl.this;
            l<Throwable, r> lVar2 = new l<Throwable, r>() { // from class: kotlinx.coroutines.sync.MutexImpl$CancellableContinuationWithOwner$tryResume$token$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // Ia.l
                public final r invoke(Throwable th) {
                    MutexImpl.f43590h.set(mutexImpl, this.f43592c);
                    mutexImpl.g(this.f43592c);
                    return r.f47939a;
                }
            };
            D3.l lVarR = this.f43591b.r((r) obj, lVar2);
            if (lVarR != null) {
                MutexImpl.f43590h.set(mutexImpl, this.f43592c);
            }
            return lVarR;
        }

        @Override // kotlin.coroutines.c
        public final void resumeWith(Object obj) {
            this.f43591b.resumeWith(obj);
        }

        @Override // kotlinx.coroutines.InterfaceC2691h
        public final void w(Object obj) {
            this.f43591b.w(obj);
        }
    }

    public MutexImpl(boolean z10) {
        super(1, z10 ? 1 : 0);
        this.owner$volatile = z10 ? null : b.f43603a;
        new q<kotlinx.coroutines.selects.e<?>, Object, Object, l<? super Throwable, ? extends r>>() { // from class: kotlinx.coroutines.sync.MutexImpl$onSelectCancellationUnlockConstructor$1
            {
                super(3);
            }

            @Override // Ia.q
            public final l<? super Throwable, ? extends r> invoke(kotlinx.coroutines.selects.e<?> eVar, final Object obj, Object obj2) {
                final MutexImpl mutexImpl = this.this$0;
                return new l<Throwable, r>() { // from class: kotlinx.coroutines.sync.MutexImpl$onSelectCancellationUnlockConstructor$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final r invoke(Throwable th) {
                        mutexImpl.g(obj);
                        return r.f47939a;
                    }
                };
            }
        };
    }

    @Override // kotlinx.coroutines.sync.a
    public final boolean d(Object obj) {
        char c10;
        char c11;
        while (true) {
            boolean zH = h();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f43590h;
            if (!zH) {
                if (obj != null) {
                    while (true) {
                        if (!e()) {
                            c11 = 0;
                            break;
                        }
                        Object obj2 = atomicReferenceFieldUpdater.get(this);
                        if (obj2 != b.f43603a) {
                            if (obj2 != obj) {
                                c11 = 2;
                                break;
                            }
                            c11 = 1;
                            break;
                        }
                    }
                    if (c11 == 1) {
                        c10 = 2;
                        break;
                    }
                    if (c11 != 2) {
                    }
                }
                c10 = 1;
                break;
            }
            atomicReferenceFieldUpdater.set(this, obj);
            c10 = 0;
            break;
        }
        if (c10 == 0) {
            return true;
        }
        if (c10 == 1) {
            return false;
        }
        if (c10 != 2) {
            throw new IllegalStateException("unexpected");
        }
        throw new IllegalStateException(("This mutex is already locked by the specified owner: " + obj).toString());
    }

    @Override // kotlinx.coroutines.sync.a
    public final boolean e() {
        return c() == 0;
    }

    @Override // kotlinx.coroutines.sync.a
    public final Object f(Object obj, kotlin.coroutines.c<? super r> cVar) {
        if (d(obj)) {
            return r.f47939a;
        }
        C2693i c2693iI = I.b.i(p.y(cVar));
        try {
            a aVar = new a(c2693iI, obj);
            while (true) {
                int andDecrement = SemaphoreImpl.f43598g.getAndDecrement(this);
                if (andDecrement <= this.f43599a) {
                    if (andDecrement > 0) {
                        aVar.q(r.f47939a, this.f43600b);
                        break;
                    }
                    if (i(aVar)) {
                        break;
                    }
                }
            }
            Object objP = c2693iI.p();
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            if (objP != coroutineSingletons) {
                objP = r.f47939a;
            }
            return objP == coroutineSingletons ? objP : r.f47939a;
        } catch (Throwable th) {
            c2693iI.B();
            throw th;
        }
    }

    @Override // kotlinx.coroutines.sync.a
    public final void g(Object obj) {
        while (e()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f43590h;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            D3.l lVar = b.f43603a;
            if (obj2 != lVar) {
                if (obj2 != obj && obj != null) {
                    throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
                }
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, lVar)) {
                        a();
                        return;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == obj2);
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }

    public final String toString() {
        return "Mutex@" + C.l(this) + "[isLocked=" + e() + ",owner=" + f43590h.get(this) + ']';
    }
}
