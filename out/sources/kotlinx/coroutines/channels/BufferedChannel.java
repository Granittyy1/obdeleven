package kotlinx.coroutines.channels;

import D2.V;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.C2693i;
import kotlinx.coroutines.C2714y;
import kotlinx.coroutines.InterfaceC2691h;
import kotlinx.coroutines.K0;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;
import kotlinx.coroutines.internal.UndeliveredElementException;
import kotlinx.coroutines.internal.v;
import kotlinx.coroutines.internal.w;
import kotlinx.coroutines.internal.x;
import kotlinx.coroutines.selects.SelectKt;
import kotlinx.coroutines.selects.TrySelectDetailedResult;

/* JADX INFO: compiled from: BufferedChannel.kt */
/* JADX INFO: loaded from: classes2.dex */
public class BufferedChannel<E> implements d<E> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f43247e = AtomicLongFieldUpdater.newUpdater(BufferedChannel.class, "sendersAndCloseStatus$volatile");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f43248f = AtomicLongFieldUpdater.newUpdater(BufferedChannel.class, "receivers$volatile");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f43249g = AtomicLongFieldUpdater.newUpdater(BufferedChannel.class, "bufferEnd$volatile");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f43250h = AtomicLongFieldUpdater.newUpdater(BufferedChannel.class, "completedExpandBuffersAndPauseFlag$volatile");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f43251i = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "sendSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater j = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "receiveSegment$volatile");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f43252k = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "bufferEndSegment$volatile");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f43253l = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "_closeCause$volatile");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f43254m = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "closeHandler$volatile");
    private volatile /* synthetic */ Object _closeCause$volatile;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f43255b;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Ia.l<E, p293xa.r> f43256c;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Ia.q<kotlinx.coroutines.selects.e<?>, Object, Object, Ia.l<Throwable, p293xa.r>> f43257d;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    /* JADX INFO: compiled from: BufferedChannel.kt */
    public final class a implements f<E>, K0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f43258b = c.f43283p;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public C2693i<? super Boolean> f43259c;

        public a() {
        }

        @Override // kotlinx.coroutines.channels.f
        public final Object a(ContinuationImpl continuationImpl) throws Throwable {
            Boolean bool;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = BufferedChannel.j;
            BufferedChannel<E> bufferedChannel = BufferedChannel.this;
            i<E> iVar = (i) atomicReferenceFieldUpdater.get(bufferedChannel);
            while (!bufferedChannel.F()) {
                long andIncrement = BufferedChannel.f43248f.getAndIncrement(bufferedChannel);
                long j = c.f43270b;
                long j10 = andIncrement / j;
                int i10 = (int) (andIncrement % j);
                if (iVar.f43504d != j10) {
                    i<E> iVarX = bufferedChannel.x(j10, iVar);
                    if (iVarX == null) {
                        continue;
                    } else {
                        iVar = iVarX;
                    }
                }
                Object objS = bufferedChannel.S(iVar, i10, andIncrement, null);
                D3.l lVar = c.f43280m;
                if (objS == lVar) {
                    throw new IllegalStateException("unreachable");
                }
                D3.l lVar2 = c.f43282o;
                if (objS != lVar2) {
                    if (objS != c.f43281n) {
                        iVar.b();
                        this.f43258b = objS;
                        return Boolean.TRUE;
                    }
                    BufferedChannel<E> bufferedChannel2 = BufferedChannel.this;
                    C2693i<? super Boolean> c2693iI = I.b.i(A8.p.y(continuationImpl));
                    try {
                        this.f43259c = c2693iI;
                        Object objS2 = bufferedChannel2.S(iVar, i10, andIncrement, this);
                        if (objS2 != lVar) {
                            Ia.l<Throwable, p293xa.r> lVarA = null;
                            kotlin.coroutines.e eVar = c2693iI.f43448f;
                            Ia.l<E, p293xa.r> lVar3 = bufferedChannel2.f43256c;
                            if (objS2 == lVar2) {
                                if (andIncrement < bufferedChannel2.B()) {
                                    iVar.b();
                                }
                                i<E> iVar2 = (i) BufferedChannel.j.get(bufferedChannel2);
                                while (true) {
                                    if (bufferedChannel2.F()) {
                                        C2693i<? super Boolean> c2693i = this.f43259c;
                                        kotlin.jvm.internal.i.b(c2693i);
                                        this.f43259c = null;
                                        this.f43258b = c.f43279l;
                                        Throwable thY = bufferedChannel.y();
                                        if (thY != null) {
                                            c2693i.resumeWith(kotlin.b.a(thY));
                                            break;
                                        }
                                        c2693i.resumeWith(Boolean.FALSE);
                                        break;
                                    }
                                    long andIncrement2 = BufferedChannel.f43248f.getAndIncrement(bufferedChannel2);
                                    long j11 = c.f43270b;
                                    long j12 = andIncrement2 / j11;
                                    int i11 = (int) (andIncrement2 % j11);
                                    if (iVar2.f43504d != j12) {
                                        i<E> iVarX2 = bufferedChannel2.x(j12, iVar2);
                                        if (iVarX2 != null) {
                                            iVar2 = iVarX2;
                                        }
                                    }
                                    Ia.l<E, p293xa.r> lVar4 = lVar3;
                                    Object objS3 = bufferedChannel2.S(iVar2, i11, andIncrement2, this);
                                    if (objS3 == c.f43280m) {
                                        d(iVar2, i11);
                                        break;
                                    }
                                    if (objS3 == c.f43282o) {
                                        if (andIncrement2 < bufferedChannel2.B()) {
                                            iVar2.b();
                                        }
                                        lVar3 = lVar4;
                                    } else {
                                        if (objS3 == c.f43281n) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        iVar2.b();
                                        this.f43258b = objS3;
                                        this.f43259c = null;
                                        bool = Boolean.TRUE;
                                        if (lVar4 != null) {
                                            lVarA = OnUndeliveredElementKt.a(lVar4, objS3, eVar);
                                        }
                                    }
                                }
                            } else {
                                iVar.b();
                                this.f43258b = objS2;
                                this.f43259c = null;
                                bool = Boolean.TRUE;
                                if (lVar3 != null) {
                                    lVarA = OnUndeliveredElementKt.a(lVar3, objS2, eVar);
                                }
                            }
                            c2693iI.q(bool, lVarA);
                            break;
                        }
                        d(iVar, i10);
                        Object objP = c2693iI.p();
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
                        return objP;
                    } catch (Throwable th) {
                        c2693iI.B();
                        throw th;
                    }
                }
                if (andIncrement < bufferedChannel.B()) {
                    iVar.b();
                }
            }
            this.f43258b = c.f43279l;
            Throwable thY2 = bufferedChannel.y();
            if (thY2 == null) {
                return Boolean.FALSE;
            }
            int i12 = x.f43505a;
            throw thY2;
        }

        @Override // kotlinx.coroutines.K0
        public final void d(v<?> vVar, int i10) {
            C2693i<? super Boolean> c2693i = this.f43259c;
            if (c2693i != null) {
                c2693i.d(vVar, i10);
            }
        }

        @Override // kotlinx.coroutines.channels.f
        public final E next() throws Throwable {
            E e10 = (E) this.f43258b;
            D3.l lVar = c.f43283p;
            if (e10 == lVar) {
                throw new IllegalStateException("`hasNext()` has not been invoked");
            }
            this.f43258b = lVar;
            if (e10 != c.f43279l) {
                return e10;
            }
            AtomicLongFieldUpdater atomicLongFieldUpdater = BufferedChannel.f43247e;
            Throwable thZ = BufferedChannel.this.z();
            int i10 = x.f43505a;
            throw thZ;
        }
    }

    /* JADX INFO: compiled from: BufferedChannel.kt */
    public static final class b implements K0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final C2693i f43261b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ C2693i<Boolean> f43262c;

        public b(C2693i c2693i) {
            this.f43261b = c2693i;
            this.f43262c = c2693i;
        }

        @Override // kotlinx.coroutines.K0
        public final void d(v<?> vVar, int i10) {
            this.f43262c.d(vVar, i10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BufferedChannel(Ia.l lVar, int i10) {
        this.f43255b = i10;
        this.f43256c = lVar;
        if (i10 < 0) {
            throw new IllegalArgumentException(J4.i.c(i10, "Invalid channel capacity: ", ", should be >=0").toString());
        }
        i<Object> iVar = c.f43269a;
        this.bufferEnd$volatile = i10 != 0 ? i10 != Integer.MAX_VALUE ? i10 : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag$volatile = f43249g.get(this);
        i<Object> iVar2 = new i<>(0L, null, this, 3);
        this.sendSegment$volatile = iVar2;
        this.receiveSegment$volatile = iVar2;
        if (H()) {
            iVar2 = c.f43269a;
            kotlin.jvm.internal.i.c(iVar2, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment$volatile = iVar2;
        this.f43257d = lVar != null ? new Ia.q<kotlinx.coroutines.selects.e<?>, Object, Object, Ia.l<? super Throwable, ? extends p293xa.r>>(this) { // from class: kotlinx.coroutines.channels.BufferedChannel$onUndeliveredElementReceiveCancellationConstructor$1$1
            final /* synthetic */ BufferedChannel<E> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
                this.this$0 = this;
            }

            @Override // Ia.q
            public final Ia.l<? super Throwable, ? extends p293xa.r> invoke(kotlinx.coroutines.selects.e<?> eVar, Object obj, final Object obj2) {
                final kotlinx.coroutines.selects.e<?> eVar2 = eVar;
                final BufferedChannel<E> bufferedChannel = this.this$0;
                return new Ia.l<Throwable, p293xa.r>() { // from class: kotlinx.coroutines.channels.BufferedChannel$onUndeliveredElementReceiveCancellationConstructor$1$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final p293xa.r invoke(Throwable th) {
                        Object obj3 = obj2;
                        if (obj3 != c.f43279l) {
                            Ia.l<Object, p293xa.r> lVar2 = bufferedChannel.f43256c;
                            kotlin.coroutines.e context = eVar2.getContext();
                            UndeliveredElementException undeliveredElementExceptionB = OnUndeliveredElementKt.b(lVar2, obj3, null);
                            if (undeliveredElementExceptionB != null) {
                                C2714y.a(context, undeliveredElementExceptionB);
                            }
                        }
                        return p293xa.r.f47939a;
                    }
                };
            }
        } : null;
        this._closeCause$volatile = c.f43286s;
    }

    public static void D(BufferedChannel bufferedChannel) {
        bufferedChannel.getClass();
        AtomicLongFieldUpdater atomicLongFieldUpdater = f43250h;
        if ((atomicLongFieldUpdater.addAndGet(bufferedChannel, 1L) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(bufferedChannel) & 4611686018427387904L) != 0) {
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public static Object K(BufferedChannel bufferedChannel, ContinuationImpl continuationImpl) {
        BufferedChannel$receiveCatching$1 bufferedChannel$receiveCatching$1;
        Object objL;
        if (continuationImpl instanceof BufferedChannel$receiveCatching$1) {
            bufferedChannel$receiveCatching$1 = (BufferedChannel$receiveCatching$1) continuationImpl;
            int i10 = bufferedChannel$receiveCatching$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bufferedChannel$receiveCatching$1.label = i10 - Integer.MIN_VALUE;
            } else {
                bufferedChannel$receiveCatching$1 = new BufferedChannel$receiveCatching$1(bufferedChannel, continuationImpl);
            }
        } else {
            bufferedChannel$receiveCatching$1 = new BufferedChannel$receiveCatching$1(bufferedChannel, continuationImpl);
        }
        BufferedChannel$receiveCatching$1 bufferedChannel$receiveCatching$2 = bufferedChannel$receiveCatching$1;
        Object obj = bufferedChannel$receiveCatching$2.result;
        Object obj2 = CoroutineSingletons.f43038b;
        int i11 = bufferedChannel$receiveCatching$2.label;
        if (i11 == 0) {
            kotlin.b.b(obj);
            i<E> iVar = (i) j.get(bufferedChannel);
            while (!bufferedChannel.F()) {
                long andIncrement = f43248f.getAndIncrement(bufferedChannel);
                long j10 = c.f43270b;
                long j11 = andIncrement / j10;
                int i12 = (int) (andIncrement % j10);
                if (iVar.f43504d != j11) {
                    i<E> iVarX = bufferedChannel.x(j11, iVar);
                    if (iVarX == null) {
                        continue;
                    } else {
                        iVar = iVarX;
                    }
                }
                Object objS = bufferedChannel.S(iVar, i12, andIncrement, null);
                if (objS == c.f43280m) {
                    throw new IllegalStateException("unexpected");
                }
                if (objS == c.f43282o) {
                    if (andIncrement < bufferedChannel.B()) {
                        iVar.b();
                    }
                } else {
                    if (objS != c.f43281n) {
                        iVar.b();
                        return objS;
                    }
                    bufferedChannel$receiveCatching$2.label = 1;
                    objL = bufferedChannel.L(iVar, i12, andIncrement, bufferedChannel$receiveCatching$2);
                    if (objL == obj2) {
                        return obj2;
                    }
                }
            }
            return new h.a(bufferedChannel.y());
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.b.b(obj);
        objL = ((h) obj).f43292a;
        return objL;
    }

    public static final i b(BufferedChannel bufferedChannel, long j10, i iVar) {
        Object objA;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j11;
        long j12;
        bufferedChannel.getClass();
        i<Object> iVar2 = c.f43269a;
        BufferedChannelKt$createSegmentFunction$1 bufferedChannelKt$createSegmentFunction$1 = BufferedChannelKt$createSegmentFunction$1.f43267b;
        loop0: while (true) {
            objA = kotlinx.coroutines.internal.d.a(iVar, j10, bufferedChannelKt$createSegmentFunction$1);
            if (!w.b(objA)) {
                v vVarA = w.a(objA);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f43251i;
                    v vVar = (v) atomicReferenceFieldUpdater.get(bufferedChannel);
                    if (vVar.f43504d >= vVarA.f43504d) {
                        break loop0;
                    }
                    if (!vVarA.j()) {
                        break;
                    }
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(bufferedChannel, vVar, vVarA)) {
                            if (!vVar.f()) {
                                break loop0;
                            }
                            vVar.e();
                            break loop0;
                        }
                    } while (atomicReferenceFieldUpdater.get(bufferedChannel) == vVar);
                    if (vVarA.f()) {
                        vVarA.e();
                    }
                }
            } else {
                break;
            }
        }
        boolean zB = w.b(objA);
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f43248f;
        if (zB) {
            bufferedChannel.v();
            if (iVar.f43504d * ((long) c.f43270b) >= atomicLongFieldUpdater2.get(bufferedChannel)) {
                return null;
            }
            iVar.b();
            return null;
        }
        i iVar3 = (i) w.a(objA);
        long j13 = iVar3.f43504d;
        if (j13 <= j10) {
            return iVar3;
        }
        long j14 = ((long) c.f43270b) * j13;
        do {
            atomicLongFieldUpdater = f43247e;
            j11 = atomicLongFieldUpdater.get(bufferedChannel);
            j12 = 1152921504606846975L & j11;
            if (j12 >= j14) {
                break;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(bufferedChannel, j11, j12 + (((long) ((int) (j11 >> 60))) << 60)));
        if (j13 * ((long) c.f43270b) >= atomicLongFieldUpdater2.get(bufferedChannel)) {
            return null;
        }
        iVar3.b();
        return null;
    }

    public static final void c(BufferedChannel bufferedChannel, Object obj, C2693i c2693i) {
        UndeliveredElementException undeliveredElementExceptionB;
        Ia.l<E, p293xa.r> lVar = bufferedChannel.f43256c;
        if (lVar != null && (undeliveredElementExceptionB = OnUndeliveredElementKt.b(lVar, obj, null)) != null) {
            C2714y.a(c2693i.f43448f, undeliveredElementExceptionB);
        }
        c2693i.resumeWith(kotlin.b.a(bufferedChannel.A()));
    }

    public static final void h(BufferedChannel bufferedChannel, K0 k10, i iVar, int i10) {
        bufferedChannel.getClass();
        k10.d(iVar, i10 + c.f43270b);
    }

    public static final void j(BufferedChannel bufferedChannel, kotlinx.coroutines.selects.e eVar) {
        bufferedChannel.getClass();
        i<E> iVar = (i) j.get(bufferedChannel);
        while (!bufferedChannel.F()) {
            long andIncrement = f43248f.getAndIncrement(bufferedChannel);
            long j10 = c.f43270b;
            long j11 = andIncrement / j10;
            int i10 = (int) (andIncrement % j10);
            if (iVar.f43504d != j11) {
                i<E> iVarX = bufferedChannel.x(j11, iVar);
                if (iVarX == null) {
                    continue;
                } else {
                    iVar = iVarX;
                }
            }
            Object objS = bufferedChannel.S(iVar, i10, andIncrement, eVar);
            if (objS == c.f43280m) {
                K0 k10 = eVar instanceof K0 ? (K0) eVar : null;
                if (k10 != null) {
                    k10.d(iVar, i10);
                    return;
                }
                return;
            }
            if (objS != c.f43282o) {
                if (objS == c.f43281n) {
                    throw new IllegalStateException("unexpected");
                }
                iVar.b();
                eVar.e(objS);
                return;
            }
            if (andIncrement < bufferedChannel.B()) {
                iVar.b();
            }
        }
        eVar.e(c.f43279l);
    }

    public static final int k(BufferedChannel bufferedChannel, i iVar, int i10, Object obj, long j10, Object obj2, boolean z10) {
        bufferedChannel.getClass();
        iVar.n(i10, obj);
        if (z10) {
            return bufferedChannel.T(iVar, i10, obj, j10, obj2, z10);
        }
        Object objL = iVar.l(i10);
        if (objL == null) {
            if (bufferedChannel.o(j10)) {
                if (iVar.k(null, i10, c.f43272d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (iVar.k(null, i10, obj2)) {
                    return 2;
                }
            }
        } else if (objL instanceof K0) {
            iVar.n(i10, null);
            if (bufferedChannel.Q(objL, obj)) {
                iVar.o(i10, c.f43277i);
                return 0;
            }
            D3.l lVar = c.f43278k;
            if (iVar.f43295g.getAndSet((i10 * 2) + 1, lVar) != lVar) {
                iVar.m(i10, true);
            }
            return 5;
        }
        return bufferedChannel.T(iVar, i10, obj, j10, obj2, z10);
    }

    public final Throwable A() {
        Throwable thY = y();
        return thY == null ? new ClosedSendChannelException("Channel was closed") : thY;
    }

    public final long B() {
        return f43247e.get(this) & 1152921504606846975L;
    }

    public final boolean C() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = j;
            i<E> iVarX = (i) atomicReferenceFieldUpdater.get(this);
            AtomicLongFieldUpdater atomicLongFieldUpdater = f43248f;
            long j10 = atomicLongFieldUpdater.get(this);
            if (B() <= j10) {
                return false;
            }
            int i10 = c.f43270b;
            long j11 = j10 / ((long) i10);
            if (iVarX.f43504d == j11 || (iVarX = x(j11, iVarX)) != null) {
                iVarX.b();
                int i11 = (int) (j10 % ((long) i10));
                while (true) {
                    Object objL = iVarX.l(i11);
                    if (objL != null && objL != c.f43273e) {
                        if (objL != c.f43272d) {
                            if (objL != c.j && objL != c.f43279l && objL != c.f43277i && objL != c.f43276h) {
                                if (objL != c.f43275g) {
                                    if (objL == c.f43274f || j10 != atomicLongFieldUpdater.get(this)) {
                                        break;
                                        break;
                                    }
                                    return true;
                                }
                                return true;
                            }
                            break;
                            break;
                            break;
                            break;
                        }
                        return true;
                    }
                    if (iVarX.k(objL, i11, c.f43276h)) {
                        w();
                        break;
                    }
                }
                f43248f.compareAndSet(this, j10, j10 + 1);
            } else if (((i) atomicReferenceFieldUpdater.get(this)).f43504d < j11) {
                return false;
            }
        }
    }

    public final boolean E(long j10, boolean z10) {
        int i10 = (int) (j10 >> 60);
        if (i10 == 0 || i10 == 1) {
            return false;
        }
        if (i10 == 2) {
            r(j10 & 1152921504606846975L);
            if (z10 && C()) {
                return false;
            }
        } else {
            if (i10 != 3) {
                throw new IllegalStateException(J4.i.b(i10, "unexpected close status: ").toString());
            }
            i<E> iVarR = r(j10 & 1152921504606846975L);
            UndeliveredElementException undeliveredElementExceptionB = null;
            Object objA = null;
            loop0: do {
                for (int i11 = c.f43270b - 1; -1 < i11; i11--) {
                    long j11 = (iVarR.f43504d * ((long) c.f43270b)) + ((long) i11);
                    while (true) {
                        Object objL = iVarR.l(i11);
                        if (objL == c.f43277i) {
                            break loop0;
                        }
                        D3.l lVar = c.f43272d;
                        AtomicReferenceArray atomicReferenceArray = iVarR.f43295g;
                        AtomicLongFieldUpdater atomicLongFieldUpdater = f43248f;
                        Ia.l<E, p293xa.r> lVar2 = this.f43256c;
                        if (objL != lVar) {
                            if (objL != c.f43273e && objL != null) {
                                if (!(objL instanceof K0) && !(objL instanceof r)) {
                                    D3.l lVar3 = c.f43275g;
                                    if (objL == lVar3 || objL == c.f43274f) {
                                        break loop0;
                                    }
                                    if (objL != lVar3) {
                                        break;
                                    }
                                } else {
                                    if (j11 < atomicLongFieldUpdater.get(this)) {
                                        break loop0;
                                    }
                                    K0 k10 = objL instanceof r ? ((r) objL).f43299a : (K0) objL;
                                    if (iVarR.k(objL, i11, c.f43279l)) {
                                        if (lVar2 != null) {
                                            undeliveredElementExceptionB = OnUndeliveredElementKt.b(lVar2, atomicReferenceArray.get(i11 * 2), undeliveredElementExceptionB);
                                        }
                                        objA = kotlinx.coroutines.internal.j.a(objA, k10);
                                        iVarR.n(i11, null);
                                        iVarR.i();
                                        break;
                                    }
                                }
                            } else {
                                if (iVarR.k(objL, i11, c.f43279l)) {
                                    iVarR.i();
                                    break;
                                }
                            }
                        } else {
                            if (j11 < atomicLongFieldUpdater.get(this)) {
                                break loop0;
                            }
                            if (iVarR.k(objL, i11, c.f43279l)) {
                                if (lVar2 != null) {
                                    undeliveredElementExceptionB = OnUndeliveredElementKt.b(lVar2, atomicReferenceArray.get(i11 * 2), undeliveredElementExceptionB);
                                }
                                iVarR.n(i11, null);
                                iVarR.i();
                                break;
                            }
                        }
                    }
                }
                iVarR = (i) ((kotlinx.coroutines.internal.e) kotlinx.coroutines.internal.e.f43472c.get(iVarR));
            } while (iVarR != null);
            if (objA != null) {
                if (objA instanceof ArrayList) {
                    ArrayList arrayList = (ArrayList) objA;
                    for (int size = arrayList.size() - 1; -1 < size; size--) {
                        M((K0) arrayList.get(size), false);
                    }
                } else {
                    M((K0) objA, false);
                }
            }
            if (undeliveredElementExceptionB != null) {
                throw undeliveredElementExceptionB;
            }
        }
        return true;
    }

    public final boolean F() {
        return E(f43247e.get(this), true);
    }

    public boolean G() {
        return false;
    }

    public final boolean H() {
        long j10 = f43249g.get(this);
        return j10 == 0 || j10 == Long.MAX_VALUE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void I(long j10, i<E> iVar) {
        i<E> iVar2;
        i<E> iVar3;
        while (iVar.f43504d < j10 && (iVar3 = (i) iVar.c()) != null) {
            iVar = iVar3;
        }
        while (true) {
            if (!iVar.d() || (iVar2 = (i) iVar.c()) == null) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f43252k;
                    v vVar = (v) atomicReferenceFieldUpdater.get(this);
                    if (vVar.f43504d >= iVar.f43504d) {
                        return;
                    }
                    if (!iVar.j()) {
                        break;
                    }
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, vVar, iVar)) {
                            if (vVar.f()) {
                                vVar.e();
                                return;
                            }
                            return;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == vVar);
                    if (iVar.f()) {
                        iVar.e();
                    }
                }
            } else {
                iVar = iVar2;
            }
        }
    }

    public final Object J(E e10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        UndeliveredElementException undeliveredElementExceptionB;
        C2693i c2693i = new C2693i(1, A8.p.y(cVar));
        c2693i.s();
        Ia.l<E, p293xa.r> lVar = this.f43256c;
        if (lVar == null || (undeliveredElementExceptionB = OnUndeliveredElementKt.b(lVar, e10, null)) == null) {
            c2693i.resumeWith(kotlin.b.a(A()));
        } else {
            V.e(undeliveredElementExceptionB, A());
            c2693i.resumeWith(kotlin.b.a(undeliveredElementExceptionB));
        }
        Object objP = c2693i.p();
        return objP == CoroutineSingletons.f43038b ? objP : p293xa.r.f47939a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    public final Object L(i iVar, int i10, long j10, ContinuationImpl continuationImpl) {
        BufferedChannel$receiveCatchingOnNoWaiterSuspend$1 bufferedChannel$receiveCatchingOnNoWaiterSuspend$1;
        h hVar;
        Ia.l<Throwable, p293xa.r> lVarA;
        if (continuationImpl instanceof BufferedChannel$receiveCatchingOnNoWaiterSuspend$1) {
            bufferedChannel$receiveCatchingOnNoWaiterSuspend$1 = (BufferedChannel$receiveCatchingOnNoWaiterSuspend$1) continuationImpl;
            int i11 = bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.label = i11 - Integer.MIN_VALUE;
            } else {
                bufferedChannel$receiveCatchingOnNoWaiterSuspend$1 = new BufferedChannel$receiveCatchingOnNoWaiterSuspend$1(this, continuationImpl);
            }
        } else {
            bufferedChannel$receiveCatchingOnNoWaiterSuspend$1 = new BufferedChannel$receiveCatchingOnNoWaiterSuspend$1(this, continuationImpl);
        }
        Object objP = bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i12 = bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.label;
        if (i12 == 0) {
            kotlin.b.b(objP);
            bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.L$0 = this;
            bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.L$1 = iVar;
            bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.I$0 = i10;
            bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.J$0 = j10;
            bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.label = 1;
            C2693i c2693iI = I.b.i(A8.p.y(bufferedChannel$receiveCatchingOnNoWaiterSuspend$1));
            try {
                o oVar = new o(c2693iI);
                Object objS = S(iVar, i10, j10, oVar);
                if (objS != c.f43280m) {
                    D3.l lVar = c.f43282o;
                    Ia.l<E, p293xa.r> lVar2 = this.f43256c;
                    kotlin.coroutines.e eVar = c2693iI.f43448f;
                    if (objS == lVar) {
                        if (j10 < B()) {
                            iVar.b();
                        }
                        i<E> iVar2 = (i) j.get(this);
                        while (true) {
                            if (F()) {
                                c2693iI.resumeWith(new h(new h.a(y())));
                                break;
                            }
                            long andIncrement = f43248f.getAndIncrement(this);
                            long j11 = c.f43270b;
                            long j12 = andIncrement / j11;
                            int i13 = (int) (andIncrement % j11);
                            if (iVar2.f43504d != j12) {
                                i<E> iVarX = x(j12, iVar2);
                                if (iVarX != null) {
                                    iVar2 = iVarX;
                                }
                            }
                            Object objS2 = S(iVar2, i13, andIncrement, oVar);
                            if (objS2 == c.f43280m) {
                                oVar.d(iVar2, i13);
                                break;
                            }
                            if (objS2 == c.f43282o) {
                                if (andIncrement < B()) {
                                    iVar2.b();
                                }
                            } else {
                                if (objS2 == c.f43281n) {
                                    throw new IllegalStateException("unexpected");
                                }
                                iVar2.b();
                                hVar = new h(objS2);
                                lVarA = lVar2 != null ? OnUndeliveredElementKt.a(lVar2, objS2, eVar) : null;
                            }
                        }
                    } else {
                        iVar.b();
                        hVar = new h(objS);
                        lVarA = lVar2 != null ? OnUndeliveredElementKt.a(lVar2, objS, eVar) : null;
                    }
                    c2693iI.q(hVar, lVarA);
                    break;
                }
                oVar.d(iVar, i10);
                objP = c2693iI.p();
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.f43038b;
                if (objP == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } catch (Throwable th) {
                c2693iI.B();
                throw th;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(objP);
        }
        return ((h) objP).f43292a;
    }

    public final void M(K0 k10, boolean z10) {
        if (k10 instanceof b) {
            ((b) k10).f43261b.resumeWith(Boolean.FALSE);
            return;
        }
        if (k10 instanceof InterfaceC2691h) {
            ((kotlin.coroutines.c) k10).resumeWith(kotlin.b.a(z10 ? z() : A()));
            return;
        }
        if (k10 instanceof o) {
            ((o) k10).f43298b.resumeWith(new h(new h.a(y())));
            return;
        }
        if (!(k10 instanceof a)) {
            if (k10 instanceof kotlinx.coroutines.selects.e) {
                ((kotlinx.coroutines.selects.e) k10).c(this, c.f43279l);
                return;
            } else {
                throw new IllegalStateException(("Unexpected waiter: " + k10).toString());
            }
        }
        a aVar = (a) k10;
        C2693i<? super Boolean> c2693i = aVar.f43259c;
        kotlin.jvm.internal.i.b(c2693i);
        aVar.f43259c = null;
        aVar.f43258b = c.f43279l;
        Throwable thY = BufferedChannel.this.y();
        if (thY == null) {
            c2693i.resumeWith(Boolean.FALSE);
        } else {
            c2693i.resumeWith(kotlin.b.a(thY));
        }
    }

    public Object O(E e10, kotlin.coroutines.c<? super Boolean> cVar) {
        i iVar;
        C2693i c2693i = new C2693i(1, A8.p.y(cVar));
        c2693i.s();
        if (this.f43256c != null) {
            throw new IllegalStateException("the `onUndeliveredElement` feature is unsupported for `sendBroadcast(e)`");
        }
        b bVar = new b(c2693i);
        i iVar2 = (i) f43251i.get(this);
        while (true) {
            long andIncrement = f43247e.getAndIncrement(this);
            long j10 = andIncrement & 1152921504606846975L;
            boolean zE = E(andIncrement, false);
            long j11 = c.f43270b;
            long j12 = j10 / j11;
            int i10 = (int) (j10 % j11);
            if (iVar2.f43504d != j12) {
                i iVarB = b(this, j12, iVar2);
                if (iVarB != null) {
                    iVar = iVarB;
                } else if (zE) {
                    c2693i.resumeWith(Boolean.FALSE);
                    break;
                }
            } else {
                iVar = iVar2;
            }
            i iVar3 = iVar;
            int iK = k(this, iVar, i10, e10, j10, bVar, zE);
            if (iK == 0) {
                iVar3.b();
            } else if (iK != 1) {
                if (iK == 2) {
                    if (!zE) {
                        h(this, bVar, iVar3, i10);
                        break;
                    }
                    iVar3.i();
                } else {
                    if (iK == 3) {
                        throw new IllegalStateException("unexpected");
                    }
                    if (iK != 4) {
                        if (iK == 5) {
                            iVar3.b();
                        }
                        iVar2 = iVar3;
                    } else if (j10 < f43248f.get(this)) {
                        iVar3.b();
                    }
                }
                c2693i.resumeWith(Boolean.FALSE);
                break;
            }
            c2693i.resumeWith(Boolean.TRUE);
            break;
        }
        Object objP = c2693i.p();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        return objP;
    }

    public boolean P() {
        long j10 = f43247e.get(this);
        if (E(j10, false)) {
            return false;
        }
        return !o(j10 & 1152921504606846975L);
    }

    public final boolean Q(Object obj, E e10) {
        if (obj instanceof kotlinx.coroutines.selects.e) {
            return ((kotlinx.coroutines.selects.e) obj).c(this, e10);
        }
        boolean z10 = obj instanceof o;
        Ia.l<E, p293xa.r> lVar = this.f43256c;
        if (z10) {
            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveCatching<E of kotlinx.coroutines.channels.BufferedChannel>");
            C2693i<h<? extends E>> c2693i = ((o) obj).f43298b;
            return c.a(c2693i, new h(e10), lVar != null ? OnUndeliveredElementKt.a(lVar, e10, c2693i.f43448f) : null);
        }
        if (!(obj instanceof a)) {
            if (obj instanceof InterfaceC2691h) {
                kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
                InterfaceC2691h interfaceC2691h = (InterfaceC2691h) obj;
                return c.a(interfaceC2691h, e10, lVar != null ? OnUndeliveredElementKt.a(lVar, e10, interfaceC2691h.getContext()) : null);
            }
            throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
        }
        kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
        a aVar = (a) obj;
        C2693i<? super Boolean> c2693i2 = aVar.f43259c;
        kotlin.jvm.internal.i.b(c2693i2);
        aVar.f43259c = null;
        aVar.f43258b = e10;
        Boolean bool = Boolean.TRUE;
        Ia.l<E, p293xa.r> lVar2 = BufferedChannel.this.f43256c;
        return c.a(c2693i2, bool, lVar2 != null ? OnUndeliveredElementKt.a(lVar2, e10, c2693i2.f43448f) : null);
    }

    public final boolean R(Object obj, i<E> iVar, int i10) {
        TrySelectDetailedResult trySelectDetailedResult;
        if (obj instanceof InterfaceC2691h) {
            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return c.a((InterfaceC2691h) obj, p293xa.r.f47939a, null);
        }
        if (!(obj instanceof kotlinx.coroutines.selects.e)) {
            if (obj instanceof b) {
                return c.a(((b) obj).f43261b, Boolean.TRUE, null);
            }
            throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
        }
        kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
        int iK = ((kotlinx.coroutines.selects.d) obj).k(this, p293xa.r.f47939a);
        Ia.q<Object, Object, Object, Object> qVar = SelectKt.f43558a;
        if (iK == 0) {
            trySelectDetailedResult = TrySelectDetailedResult.f43565b;
        } else if (iK == 1) {
            trySelectDetailedResult = TrySelectDetailedResult.f43566c;
        } else if (iK == 2) {
            trySelectDetailedResult = TrySelectDetailedResult.f43567d;
        } else {
            if (iK != 3) {
                throw new IllegalStateException(("Unexpected internal result: " + iK).toString());
            }
            trySelectDetailedResult = TrySelectDetailedResult.f43568e;
        }
        if (trySelectDetailedResult == TrySelectDetailedResult.f43566c) {
            iVar.n(i10, null);
        }
        return trySelectDetailedResult == TrySelectDetailedResult.f43565b;
    }

    public final Object S(i<E> iVar, int i10, long j10, Object obj) {
        Object objL = iVar.l(i10);
        AtomicReferenceArray atomicReferenceArray = iVar.f43295g;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f43247e;
        if (objL == null) {
            if (j10 >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return c.f43281n;
                }
                if (iVar.k(objL, i10, obj)) {
                    w();
                    return c.f43280m;
                }
            }
        } else if (objL == c.f43272d && iVar.k(objL, i10, c.f43277i)) {
            w();
            Object obj2 = atomicReferenceArray.get(i10 * 2);
            iVar.n(i10, null);
            return obj2;
        }
        while (true) {
            Object objL2 = iVar.l(i10);
            if (objL2 == null || objL2 == c.f43273e) {
                if (j10 < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (iVar.k(objL2, i10, c.f43276h)) {
                        w();
                        return c.f43282o;
                    }
                } else {
                    if (obj == null) {
                        return c.f43281n;
                    }
                    if (iVar.k(objL2, i10, obj)) {
                        w();
                        return c.f43280m;
                    }
                }
            } else if (objL2 != c.f43272d) {
                D3.l lVar = c.j;
                if (objL2 == lVar) {
                    return c.f43282o;
                }
                if (objL2 == c.f43276h) {
                    return c.f43282o;
                }
                if (objL2 == c.f43279l) {
                    w();
                    return c.f43282o;
                }
                if (objL2 != c.f43275g && iVar.k(objL2, i10, c.f43274f)) {
                    boolean z10 = objL2 instanceof r;
                    if (z10) {
                        objL2 = ((r) objL2).f43299a;
                    }
                    if (R(objL2, iVar, i10)) {
                        iVar.o(i10, c.f43277i);
                        w();
                        Object obj3 = atomicReferenceArray.get(i10 * 2);
                        iVar.n(i10, null);
                        return obj3;
                    }
                    iVar.o(i10, lVar);
                    iVar.i();
                    if (z10) {
                        w();
                    }
                    return c.f43282o;
                }
            } else if (iVar.k(objL2, i10, c.f43277i)) {
                w();
                Object obj4 = atomicReferenceArray.get(i10 * 2);
                iVar.n(i10, null);
                return obj4;
            }
        }
    }

    public final int T(i<E> iVar, int i10, E e10, long j10, Object obj, boolean z10) {
        while (true) {
            Object objL = iVar.l(i10);
            if (objL == null) {
                if (!o(j10) || z10) {
                    if (z10) {
                        if (iVar.k(null, i10, c.j)) {
                            iVar.i();
                            return 4;
                        }
                    } else {
                        if (obj == null) {
                            return 3;
                        }
                        if (iVar.k(null, i10, obj)) {
                            return 2;
                        }
                    }
                } else if (iVar.k(null, i10, c.f43272d)) {
                    return 1;
                }
            } else {
                if (objL != c.f43273e) {
                    D3.l lVar = c.f43278k;
                    if (objL == lVar) {
                        iVar.n(i10, null);
                        return 5;
                    }
                    if (objL == c.f43276h) {
                        iVar.n(i10, null);
                        return 5;
                    }
                    if (objL == c.f43279l) {
                        iVar.n(i10, null);
                        v();
                        return 4;
                    }
                    iVar.n(i10, null);
                    if (objL instanceof r) {
                        objL = ((r) objL).f43299a;
                    }
                    if (Q(objL, e10)) {
                        iVar.o(i10, c.f43277i);
                        return 0;
                    }
                    if (iVar.f43295g.getAndSet((i10 * 2) + 1, lVar) == lVar) {
                        return 5;
                    }
                    iVar.m(i10, true);
                    return 5;
                }
                if (iVar.k(objL, i10, c.f43272d)) {
                    return 1;
                }
            }
        }
    }

    public final void U(long j10) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j11;
        long j12;
        if (H()) {
            return;
        }
        do {
            atomicLongFieldUpdater = f43249g;
        } while (atomicLongFieldUpdater.get(this) <= j10);
        int i10 = c.f43271c;
        int i11 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f43250h;
            if (i11 >= i10) {
                do {
                    j11 = atomicLongFieldUpdater2.get(this);
                } while (!atomicLongFieldUpdater2.compareAndSet(this, j11, 4611686018427387904L + (j11 & 4611686018427387903L)));
                while (true) {
                    long j13 = atomicLongFieldUpdater.get(this);
                    long j14 = atomicLongFieldUpdater2.get(this);
                    long j15 = j14 & 4611686018427387903L;
                    boolean z10 = (j14 & 4611686018427387904L) != 0;
                    if (j13 == j15 && j13 == atomicLongFieldUpdater.get(this)) {
                        break;
                    } else if (!z10) {
                        atomicLongFieldUpdater2.compareAndSet(this, j14, j15 + 4611686018427387904L);
                    }
                }
                do {
                    j12 = atomicLongFieldUpdater2.get(this);
                } while (!atomicLongFieldUpdater2.compareAndSet(this, j12, j12 & 4611686018427387903L));
                return;
            }
            long j16 = atomicLongFieldUpdater.get(this);
            if (j16 == (atomicLongFieldUpdater2.get(this) & 4611686018427387903L) && j16 == atomicLongFieldUpdater.get(this)) {
                return;
            } else {
                i11++;
            }
        }
    }

    @Override // kotlinx.coroutines.channels.q
    public boolean a(Throwable th) {
        return q(th, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2, types: [kotlinx.coroutines.i] */
    /* JADX WARN: Type inference failed for: r13v6 */
    @Override // kotlinx.coroutines.channels.p
    public final Object d(ContinuationImpl continuationImpl) throws Throwable {
        i<E> iVar;
        ?? r13;
        C2693i c2693i;
        Ia.l<Throwable, p293xa.r> lVarA;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = j;
        i<E> iVar2 = (i) atomicReferenceFieldUpdater.get(this);
        while (!F()) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f43248f;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j10 = c.f43270b;
            long j11 = andIncrement / j10;
            int i10 = (int) (andIncrement % j10);
            if (iVar2.f43504d != j11) {
                i<E> iVarX = x(j11, iVar2);
                if (iVarX == null) {
                    continue;
                } else {
                    iVar = iVarX;
                }
            } else {
                iVar = iVar2;
            }
            Object objS = S(iVar, i10, andIncrement, null);
            D3.l lVar = c.f43280m;
            if (objS == lVar) {
                throw new IllegalStateException("unexpected");
            }
            D3.l lVar2 = c.f43282o;
            if (objS == lVar2) {
                if (andIncrement < B()) {
                    iVar.b();
                }
                iVar2 = iVar;
            } else {
                if (objS != c.f43281n) {
                    iVar.b();
                    return objS;
                }
                C2693i c2693iI = I.b.i(A8.p.y(continuationImpl));
                try {
                    Object objS2 = S(iVar, i10, andIncrement, c2693iI);
                    try {
                        if (objS2 != lVar) {
                            c2693i = c2693iI;
                            Ia.l<E, p293xa.r> lVar3 = this.f43256c;
                            kotlin.coroutines.e eVar = c2693i.f43448f;
                            if (objS2 == lVar2) {
                                if (andIncrement < B()) {
                                    iVar.b();
                                }
                                i<E> iVar3 = (i) atomicReferenceFieldUpdater.get(this);
                                while (true) {
                                    if (F()) {
                                        c2693i.resumeWith(kotlin.b.a(z()));
                                        break;
                                    }
                                    long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(this);
                                    long j12 = c.f43270b;
                                    long j13 = andIncrement2 / j12;
                                    int i11 = (int) (andIncrement2 % j12);
                                    if (iVar3.f43504d != j13) {
                                        i<E> iVarX2 = x(j13, iVar3);
                                        if (iVarX2 != null) {
                                            iVar3 = iVarX2;
                                        }
                                    }
                                    kotlin.coroutines.e eVar2 = eVar;
                                    Ia.l<E, p293xa.r> lVar4 = lVar3;
                                    objS2 = S(iVar3, i11, andIncrement2, c2693i);
                                    if (objS2 == c.f43280m) {
                                        c2693i.d(iVar3, i11);
                                        break;
                                    }
                                    if (objS2 == c.f43282o) {
                                        if (andIncrement2 < B()) {
                                            iVar3.b();
                                        }
                                        eVar = eVar2;
                                        lVar3 = lVar4;
                                    } else {
                                        if (objS2 == c.f43281n) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        iVar3.b();
                                        lVarA = lVar4 != null ? OnUndeliveredElementKt.a(lVar4, objS2, eVar2) : null;
                                    }
                                }
                            } else {
                                iVar.b();
                                lVarA = lVar3 != null ? OnUndeliveredElementKt.a(lVar3, objS2, eVar) : null;
                            }
                            c2693i.q(objS2, lVarA);
                            break;
                        }
                        c2693i = c2693iI;
                        c2693i.d(iVar, i10);
                        Object objP = c2693i.p();
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
                        return objP;
                    } catch (Throwable th) {
                        th = th;
                        r13 = lVar;
                        r13.B();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    r13 = c2693iI;
                }
            }
        }
        Throwable thZ = z();
        int i12 = x.f43505a;
        throw thZ;
    }

    @Override // kotlinx.coroutines.channels.p
    public final kotlinx.coroutines.selects.c e() {
        BufferedChannel$onReceive$1 bufferedChannel$onReceive$1 = BufferedChannel$onReceive$1.f43263b;
        kotlin.jvm.internal.i.c(bufferedChannel$onReceive$1, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }");
        kotlin.jvm.internal.o.d(3, bufferedChannel$onReceive$1);
        BufferedChannel$onReceive$2 bufferedChannel$onReceive$2 = BufferedChannel$onReceive$2.f43264b;
        kotlin.jvm.internal.i.c(bufferedChannel$onReceive$2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'param')] kotlin.Any?, @[ParameterName(name = 'clauseResult')] kotlin.Any?, kotlin.Any?>{ kotlinx.coroutines.selects.SelectKt.ProcessResultFunction }");
        kotlin.jvm.internal.o.d(3, bufferedChannel$onReceive$2);
        return new kotlinx.coroutines.selects.c(this, bufferedChannel$onReceive$1, bufferedChannel$onReceive$2, this.f43257d);
    }

    @Override // kotlinx.coroutines.channels.p
    public final kotlinx.coroutines.selects.c f() {
        BufferedChannel$onReceiveCatching$1 bufferedChannel$onReceiveCatching$1 = BufferedChannel$onReceiveCatching$1.f43265b;
        kotlin.jvm.internal.i.c(bufferedChannel$onReceiveCatching$1, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }");
        kotlin.jvm.internal.o.d(3, bufferedChannel$onReceiveCatching$1);
        BufferedChannel$onReceiveCatching$2 bufferedChannel$onReceiveCatching$2 = BufferedChannel$onReceiveCatching$2.f43266b;
        kotlin.jvm.internal.i.c(bufferedChannel$onReceiveCatching$2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'param')] kotlin.Any?, @[ParameterName(name = 'clauseResult')] kotlin.Any?, kotlin.Any?>{ kotlinx.coroutines.selects.SelectKt.ProcessResultFunction }");
        kotlin.jvm.internal.o.d(3, bufferedChannel$onReceiveCatching$2);
        return new kotlinx.coroutines.selects.c(this, bufferedChannel$onReceiveCatching$1, bufferedChannel$onReceiveCatching$2, this.f43257d);
    }

    @Override // kotlinx.coroutines.channels.p
    public final Object g() {
        i<E> iVar;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f43248f;
        long j10 = atomicLongFieldUpdater.get(this);
        long j11 = f43247e.get(this);
        if (E(j11, true)) {
            return new h.a(y());
        }
        long j12 = j11 & 1152921504606846975L;
        Object obj = h.f43291b;
        if (j10 >= j12) {
            return obj;
        }
        p191p5.c cVar = c.f43278k;
        i<E> iVar2 = (i) j.get(this);
        while (!F()) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j13 = c.f43270b;
            long j14 = andIncrement / j13;
            int i10 = (int) (andIncrement % j13);
            if (iVar2.f43504d != j14) {
                i<E> iVarX = x(j14, iVar2);
                if (iVarX == null) {
                    continue;
                } else {
                    iVar = iVarX;
                }
            } else {
                iVar = iVar2;
            }
            Object objS = S(iVar, i10, andIncrement, cVar);
            if (objS == c.f43280m) {
                K0 k10 = cVar instanceof K0 ? (K0) cVar : null;
                if (k10 != null) {
                    k10.d(iVar, i10);
                }
                U(andIncrement);
                iVar.i();
            } else if (objS == c.f43282o) {
                if (andIncrement < B()) {
                    iVar.b();
                }
                iVar2 = iVar;
            } else {
                if (objS == c.f43281n) {
                    throw new IllegalStateException("unexpected");
                }
                iVar.b();
                obj = objS;
            }
            return obj;
        }
        return new h.a(y());
    }

    @Override // kotlinx.coroutines.channels.p
    public final void i(CancellationException cancellationException) {
        p(cancellationException);
    }

    @Override // kotlinx.coroutines.channels.p
    public final f<E> iterator() {
        return new a();
    }

    @Override // kotlinx.coroutines.channels.p
    public final Object l(kotlin.coroutines.c<? super h<? extends E>> cVar) {
        return K(this, (ContinuationImpl) cVar);
    }

    @Override // kotlinx.coroutines.channels.q
    public Object n(E e10) {
        i iVar;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f43247e;
        long j10 = atomicLongFieldUpdater.get(this);
        boolean z10 = false;
        boolean z11 = E(j10, false) ? false : !o(j10 & 1152921504606846975L);
        h.b bVar = h.f43291b;
        if (z11) {
            return bVar;
        }
        p191p5.c cVar = c.j;
        i iVar2 = (i) f43251i.get(this);
        while (true) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j11 = andIncrement & 1152921504606846975L;
            boolean zE = E(andIncrement, z10);
            long j12 = c.f43270b;
            long j13 = j11 / j12;
            int i10 = (int) (j11 % j12);
            if (iVar2.f43504d != j13) {
                i iVarB = b(this, j13, iVar2);
                if (iVarB != null) {
                    iVar = iVarB;
                } else if (zE) {
                    return new h.a(A());
                }
            } else {
                iVar = iVar2;
            }
            i iVar3 = iVar;
            int iK = k(this, iVar, i10, e10, j11, cVar, zE);
            if (iK == 0) {
                iVar3.b();
            } else if (iK != 1) {
                if (iK == 2) {
                    if (zE) {
                        iVar3.i();
                        return new h.a(A());
                    }
                    K0 k10 = cVar instanceof K0 ? (K0) cVar : null;
                    if (k10 != null) {
                        h(this, k10, iVar3, i10);
                    }
                    iVar3.i();
                    return bVar;
                }
                if (iK == 3) {
                    throw new IllegalStateException("unexpected");
                }
                if (iK == 4) {
                    if (j11 < f43248f.get(this)) {
                        iVar3.b();
                    }
                    return new h.a(A());
                }
                if (iK == 5) {
                    iVar3.b();
                }
                iVar2 = iVar3;
                z10 = false;
            }
            return p293xa.r.f47939a;
        }
    }

    public final boolean o(long j10) {
        return j10 < f43249g.get(this) || j10 < f43248f.get(this) + ((long) this.f43255b);
    }

    public boolean p(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        return q(cancellationException, true);
    }

    public final boolean q(Throwable th, boolean z10) {
        boolean z11;
        long j10;
        long j11;
        long j12;
        Object obj;
        long j13;
        long j14;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f43247e;
        if (z10) {
            do {
                j14 = atomicLongFieldUpdater.get(this);
                if (((int) (j14 >> 60)) != 0) {
                    break;
                }
                i<Object> iVar = c.f43269a;
            } while (!atomicLongFieldUpdater.compareAndSet(this, j14, (((long) 1) << 60) + (j14 & 1152921504606846975L)));
        }
        D3.l lVar = c.f43286s;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f43253l;
            if (atomicReferenceFieldUpdater.compareAndSet(this, lVar, th)) {
                z11 = true;
                break;
            }
            if (atomicReferenceFieldUpdater.get(this) != lVar) {
                z11 = false;
                break;
            }
        }
        if (z10) {
            do {
                j13 = atomicLongFieldUpdater.get(this);
            } while (!atomicLongFieldUpdater.compareAndSet(this, j13, (((long) 3) << 60) + (j13 & 1152921504606846975L)));
        } else {
            do {
                j10 = atomicLongFieldUpdater.get(this);
                int i10 = (int) (j10 >> 60);
                if (i10 == 0) {
                    j11 = j10 & 1152921504606846975L;
                    j12 = 2;
                } else {
                    if (i10 != 1) {
                        break;
                    }
                    j11 = j10 & 1152921504606846975L;
                    j12 = 3;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(this, j10, (j12 << 60) + j11));
        }
        v();
        if (z11) {
            loop3: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f43254m;
                obj = atomicReferenceFieldUpdater2.get(this);
                D3.l lVar2 = obj == null ? c.f43284q : c.f43285r;
                do {
                    if (atomicReferenceFieldUpdater2.compareAndSet(this, obj, lVar2)) {
                        break loop3;
                    }
                } while (atomicReferenceFieldUpdater2.get(this) == obj);
            }
            if (obj != null) {
                kotlin.jvm.internal.o.d(1, obj);
                ((Ia.l) obj).invoke(y());
            }
        }
        return z11;
    }

    public final i<E> r(long j10) {
        Object objA;
        long j11;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object obj = f43252k.get(this);
        i iVar = (i) f43251i.get(this);
        if (iVar.f43504d > ((i) obj).f43504d) {
            obj = iVar;
        }
        i iVar2 = (i) j.get(this);
        if (iVar2.f43504d > ((i) obj).f43504d) {
            obj = iVar2;
        }
        kotlinx.coroutines.internal.e eVar = (kotlinx.coroutines.internal.e) obj;
        loop0: while (true) {
            eVar.getClass();
            Object obj2 = kotlinx.coroutines.internal.e.f43471b.get(eVar);
            D3.l lVar = kotlinx.coroutines.internal.d.f43470a;
            objA = null;
            if (obj2 == lVar) {
                break;
            }
            kotlinx.coroutines.internal.e eVar2 = (kotlinx.coroutines.internal.e) obj2;
            if (eVar2 == null) {
                do {
                    atomicReferenceFieldUpdater = kotlinx.coroutines.internal.e.f43471b;
                    if (atomicReferenceFieldUpdater.compareAndSet(eVar, null, lVar)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(eVar) == null);
            } else {
                eVar = eVar2;
            }
        }
        i<E> iVar3 = (i) eVar;
        if (G()) {
            i<E> iVar4 = iVar3;
            loop2: while (true) {
                int i10 = c.f43270b - 1;
                while (true) {
                    if (-1 < i10) {
                        j11 = (iVar4.f43504d * ((long) c.f43270b)) + ((long) i10);
                        if (j11 >= f43248f.get(this)) {
                            while (true) {
                                Object objL = iVar4.l(i10);
                                if (objL != null && objL != c.f43273e) {
                                    if (objL != c.f43272d) {
                                        break;
                                    }
                                    break loop2;
                                }
                                if (iVar4.k(objL, i10, c.f43279l)) {
                                    iVar4.i();
                                    break;
                                }
                            }
                            i10--;
                        }
                    } else {
                        iVar4 = (i) ((kotlinx.coroutines.internal.e) kotlinx.coroutines.internal.e.f43472c.get(iVar4));
                        if (iVar4 == null) {
                        }
                    }
                    j11 = -1;
                    break;
                }
            }
            if (j11 != -1) {
                s(j11);
            }
        }
        loop5: for (i<E> iVar5 = iVar3; iVar5 != null; iVar5 = (i) ((kotlinx.coroutines.internal.e) kotlinx.coroutines.internal.e.f43472c.get(iVar5))) {
            for (int i11 = c.f43270b - 1; -1 < i11; i11--) {
                if ((iVar5.f43504d * ((long) c.f43270b)) + ((long) i11) < j10) {
                    break loop5;
                }
                while (true) {
                    Object objL2 = iVar5.l(i11);
                    if (objL2 != null && objL2 != c.f43273e) {
                        if (!(objL2 instanceof r)) {
                            if (!(objL2 instanceof K0)) {
                                break;
                            }
                            if (iVar5.k(objL2, i11, c.f43279l)) {
                                objA = kotlinx.coroutines.internal.j.a(objA, objL2);
                                iVar5.m(i11, true);
                                break;
                            }
                        } else {
                            if (iVar5.k(objL2, i11, c.f43279l)) {
                                objA = kotlinx.coroutines.internal.j.a(objA, ((r) objL2).f43299a);
                                iVar5.m(i11, true);
                                break;
                            }
                        }
                    } else {
                        if (iVar5.k(objL2, i11, c.f43279l)) {
                            iVar5.i();
                            break;
                        }
                    }
                }
            }
        }
        if (objA != null) {
            if (objA instanceof ArrayList) {
                ArrayList arrayList = (ArrayList) objA;
                for (int size = arrayList.size() - 1; -1 < size; size--) {
                    M((K0) arrayList.get(size), true);
                }
            } else {
                M((K0) objA, true);
            }
        }
        return iVar3;
    }

    public final void s(long j10) {
        UndeliveredElementException undeliveredElementExceptionB;
        i<E> iVar = (i) j.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f43248f;
            long j11 = atomicLongFieldUpdater.get(this);
            if (j10 < Math.max(((long) this.f43255b) + j11, f43249g.get(this))) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j11, j11 + 1)) {
                long j12 = c.f43270b;
                long j13 = j11 / j12;
                int i10 = (int) (j11 % j12);
                if (iVar.f43504d != j13) {
                    i<E> iVarX = x(j13, iVar);
                    if (iVarX == null) {
                        continue;
                    } else {
                        iVar = iVarX;
                    }
                }
                Object objS = S(iVar, i10, j11, null);
                if (objS != c.f43282o) {
                    iVar.b();
                    Ia.l<E, p293xa.r> lVar = this.f43256c;
                    if (lVar != null && (undeliveredElementExceptionB = OnUndeliveredElementKt.b(lVar, objS, null)) != null) {
                        throw undeliveredElementExceptionB;
                    }
                } else if (j11 < B()) {
                    iVar.b();
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:104:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:152:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [kotlinx.coroutines.i] */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v43 */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // kotlinx.coroutines.channels.q
    public Object t(E e10, kotlin.coroutines.c<? super p293xa.r> cVar) throws Throwable {
        i iVar;
        ?? r10;
        C2693i c2693i;
        p293xa.r rVar;
        Object objP;
        CoroutineSingletons coroutineSingletons;
        i iVar2;
        i iVar3;
        C2693i c2693i2;
        C2693i c2693i3;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f43251i;
        i iVar4 = (i) atomicReferenceFieldUpdater.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f43247e;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j10 = andIncrement & 1152921504606846975L;
            boolean zE = E(andIncrement, false);
            long j11 = c.f43270b;
            long j12 = j10 / j11;
            int i10 = (int) (j10 % j11);
            if (iVar4.f43504d != j12) {
                i iVarB = b(this, j12, iVar4);
                if (iVarB != null) {
                    iVar = iVarB;
                } else if (zE) {
                    Object objJ = J(e10, cVar);
                    if (objJ != CoroutineSingletons.f43038b) {
                        break;
                    }
                    return objJ;
                }
            } else {
                iVar = iVar4;
            }
            i iVar5 = iVar;
            int iK = k(this, iVar, i10, e10, j10, null, zE);
            if (iK == 0) {
                iVar5.b();
                break;
            }
            if (iK != 1) {
                if (iK == 2) {
                    if (!zE) {
                        break;
                    }
                    iVar5.i();
                    Object objJ2 = J(e10, cVar);
                    if (objJ2 != CoroutineSingletons.f43038b) {
                        break;
                    }
                    return objJ2;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = f43248f;
                if (iK == 3) {
                    C2693i c2693iI = I.b.i(A8.p.y(cVar));
                    try {
                        int iK2 = k(this, iVar5, i10, e10, j10, c2693iI, false);
                        try {
                            if (iK2 == 0) {
                                c2693i = c2693iI;
                                iVar5.b();
                                rVar = p293xa.r.f47939a;
                            } else {
                                if (iK2 != 1) {
                                    if (iK2 != 2) {
                                        if (iK2 != 4) {
                                            if (iK2 != 5) {
                                                throw new IllegalStateException("unexpected");
                                            }
                                            iVar5.b();
                                            i iVar6 = (i) atomicReferenceFieldUpdater.get(this);
                                            while (true) {
                                                long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(this);
                                                long j13 = andIncrement2 & 1152921504606846975L;
                                                boolean zE2 = E(andIncrement2, false);
                                                long j14 = c.f43270b;
                                                long j15 = j13 / j14;
                                                int i11 = (int) (j13 % j14);
                                                try {
                                                    if (iVar6.f43504d != j15) {
                                                        try {
                                                            i iVarB2 = b(this, j15, iVar6);
                                                            if (iVarB2 != null) {
                                                                iVar2 = iVarB2;
                                                            } else if (zE2) {
                                                                c2693i3 = c2693iI;
                                                                try {
                                                                    c(this, e10, c2693i3);
                                                                    c2693i = c2693i3;
                                                                    break;
                                                                } catch (Throwable th) {
                                                                    th = th;
                                                                    r10 = c2693i3;
                                                                    r10.B();
                                                                    throw th;
                                                                }
                                                            }
                                                        } catch (Throwable th2) {
                                                            th = th2;
                                                            c2693i3 = c2693iI;
                                                        }
                                                    } else {
                                                        iVar2 = iVar6;
                                                    }
                                                    int iK3 = k(this, iVar2, i11, e10, j13, c2693iI, zE2);
                                                    if (iK3 == 0) {
                                                        c2693i = c2693i2;
                                                        iVar3.b();
                                                        rVar = p293xa.r.f47939a;
                                                    } else if (iK3 == 1) {
                                                        c2693i = c2693i2;
                                                        rVar = p293xa.r.f47939a;
                                                    } else if (iK3 == 2) {
                                                        c2693i = c2693i2;
                                                        if (!zE2) {
                                                            h(this, c2693i, iVar3, i11);
                                                            break;
                                                        }
                                                        iVar3.i();
                                                    } else {
                                                        if (iK3 == 3) {
                                                            throw new IllegalStateException("unexpected");
                                                        }
                                                        if (iK3 != 4) {
                                                            if (iK3 == 5) {
                                                                iVar3.b();
                                                            }
                                                            iVar6 = iVar3;
                                                            c2693iI = c2693i2;
                                                        } else {
                                                            if (j13 < atomicLongFieldUpdater2.get(this)) {
                                                                iVar3.b();
                                                            }
                                                            c2693i = c2693i2;
                                                        }
                                                    }
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                    r10 = c2693i2;
                                                }
                                                iVar3 = iVar2;
                                                c2693i2 = c2693iI;
                                            }
                                            r10.B();
                                            throw th;
                                        }
                                        c2693i = c2693iI;
                                        if (j10 < atomicLongFieldUpdater2.get(this)) {
                                            iVar5.b();
                                        }
                                        c(this, e10, c2693i);
                                        break;
                                    } else {
                                        c2693i = c2693iI;
                                        h(this, c2693i, iVar5, i10);
                                    }
                                    objP = c2693i.p();
                                    coroutineSingletons = CoroutineSingletons.f43038b;
                                    if (objP != coroutineSingletons) {
                                        objP = p293xa.r.f47939a;
                                    }
                                    if (objP == coroutineSingletons) {
                                        break;
                                    }
                                    return objP;
                                }
                                c2693i = c2693iI;
                                rVar = p293xa.r.f47939a;
                            }
                            c2693i.resumeWith(rVar);
                            objP = c2693i.p();
                            coroutineSingletons = CoroutineSingletons.f43038b;
                            if (objP != coroutineSingletons) {
                                objP = p293xa.r.f47939a;
                            }
                            if (objP == coroutineSingletons) {
                                break;
                            }
                            return objP;
                        } catch (Throwable th4) {
                            th = th4;
                            r10 = iK2;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        r10 = c2693iI;
                    }
                } else {
                    if (iK == 4) {
                        if (j10 < atomicLongFieldUpdater2.get(this)) {
                            iVar5.b();
                        }
                        Object objJ3 = J(e10, cVar);
                        if (objJ3 != CoroutineSingletons.f43038b) {
                            break;
                        }
                        return objJ3;
                    }
                    if (iK == 5) {
                        iVar5.b();
                    }
                    iVar4 = iVar5;
                }
            } else {
                break;
            }
        }
        return p293xa.r.f47939a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String toString() {
        String string;
        StringBuilder sb2 = new StringBuilder();
        int i10 = (int) (f43247e.get(this) >> 60);
        if (i10 == 2) {
            sb2.append("closed,");
        } else if (i10 == 3) {
            sb2.append("cancelled,");
        }
        sb2.append("capacity=" + this.f43255b + ',');
        sb2.append("data=[");
        int i11 = 0;
        List listS = kotlin.collections.l.s(j.get(this), f43251i.get(this), f43252k.get(this));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listS) {
            if (((i) obj) != c.f43269a) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j10 = ((i) next).f43504d;
            do {
                Object next2 = it.next();
                long j11 = ((i) next2).f43504d;
                if (j10 > j11) {
                    next = next2;
                    j10 = j11;
                }
            } while (it.hasNext());
        }
        i iVar = (i) next;
        long j12 = f43248f.get(this);
        long jB = B();
        loop2: while (true) {
            int i12 = c.f43270b;
            for (int i13 = i11; i13 < i12; i13++) {
                long j13 = (iVar.f43504d * ((long) c.f43270b)) + ((long) i13);
                if (j13 >= jB && j13 >= j12) {
                    break loop2;
                }
                Object objL = iVar.l(i13);
                Object obj2 = iVar.f43295g.get(i13 * 2);
                if (objL instanceof InterfaceC2691h) {
                    string = (j13 >= j12 || j13 < jB) ? (j13 >= jB || j13 < j12) ? "cont" : "send" : "receive";
                } else if (objL instanceof kotlinx.coroutines.selects.e) {
                    string = (j13 >= j12 || j13 < jB) ? (j13 >= jB || j13 < j12) ? "select" : "onSend" : "onReceive";
                } else if (objL instanceof o) {
                    string = "receiveCatching";
                } else if (objL instanceof b) {
                    string = "sendBroadcast";
                } else if (objL instanceof r) {
                    string = "EB(" + objL + ')';
                } else if (kotlin.jvm.internal.i.a(objL, c.f43274f) ? true : kotlin.jvm.internal.i.a(objL, c.f43275g)) {
                    string = "resuming_sender";
                } else {
                    if (!(objL == null ? true : objL.equals(c.f43273e) ? true : kotlin.jvm.internal.i.a(objL, c.f43277i) ? true : kotlin.jvm.internal.i.a(objL, c.f43276h) ? true : kotlin.jvm.internal.i.a(objL, c.f43278k) ? true : kotlin.jvm.internal.i.a(objL, c.j) ? true : kotlin.jvm.internal.i.a(objL, c.f43279l))) {
                        string = objL.toString();
                    }
                }
                if (obj2 != null) {
                    sb2.append("(" + string + ',' + obj2 + "),");
                } else {
                    sb2.append(string + ',');
                }
            }
            iVar = (i) iVar.c();
            if (iVar == null) {
                break;
            }
            i11 = 0;
        }
        if (kotlin.text.o.s0(sb2) == ',') {
            kotlin.jvm.internal.i.d(sb2.deleteCharAt(sb2.length() - 1), "deleteCharAt(...)");
        }
        sb2.append("]");
        return sb2.toString();
    }

    @Override // kotlinx.coroutines.channels.q
    public final void u(Ia.l<? super Throwable, p293xa.r> lVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = f43254m;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, lVar)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            D3.l lVar2 = c.f43284q;
            if (obj != lVar2) {
                if (obj == c.f43285r) {
                    throw new IllegalStateException("Another handler was already registered and successfully invoked");
                }
                throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
            }
            D3.l lVar3 = c.f43285r;
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, lVar2, lVar3)) {
                    ((ProduceKt$awaitClose$4$1) lVar).invoke(y());
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(this) == lVar2);
        }
    }

    @Override // kotlinx.coroutines.channels.q
    public boolean v() {
        return E(f43247e.get(this), false);
    }

    public final void w() {
        Object objA;
        if (H()) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f43252k;
        i<E> iVar = (i) atomicReferenceFieldUpdater.get(this);
        while (true) {
            long andIncrement = f43249g.getAndIncrement(this);
            long j10 = andIncrement / ((long) c.f43270b);
            if (B() <= andIncrement) {
                if (iVar.f43504d < j10 && iVar.c() != 0) {
                    I(j10, iVar);
                }
                D(this);
                return;
            }
            if (iVar.f43504d != j10) {
                BufferedChannelKt$createSegmentFunction$1 bufferedChannelKt$createSegmentFunction$1 = BufferedChannelKt$createSegmentFunction$1.f43267b;
                while (true) {
                    objA = kotlinx.coroutines.internal.d.a(iVar, j10, bufferedChannelKt$createSegmentFunction$1);
                    if (!w.b(objA)) {
                        v vVarA = w.a(objA);
                        while (true) {
                            v vVar = (v) atomicReferenceFieldUpdater.get(this);
                            if (vVar.f43504d >= vVarA.f43504d) {
                                break;
                            }
                            if (!vVarA.j()) {
                                break;
                            }
                            do {
                                if (atomicReferenceFieldUpdater.compareAndSet(this, vVar, vVarA)) {
                                    if (!vVar.f()) {
                                        break;
                                    }
                                    vVar.e();
                                    break;
                                }
                            } while (atomicReferenceFieldUpdater.get(this) == vVar);
                            if (vVarA.f()) {
                                vVarA.e();
                            }
                        }
                    } else {
                        break;
                    }
                }
                i<E> iVar2 = null;
                if (w.b(objA)) {
                    v();
                    I(j10, iVar);
                    D(this);
                } else {
                    i<E> iVar3 = (i) w.a(objA);
                    long j11 = iVar3.f43504d;
                    if (j11 > j10) {
                        long j12 = j11 * ((long) c.f43270b);
                        if (f43249g.compareAndSet(this, andIncrement + 1, j12)) {
                            AtomicLongFieldUpdater atomicLongFieldUpdater = f43250h;
                            if ((atomicLongFieldUpdater.addAndGet(this, j12 - andIncrement) & 4611686018427387904L) != 0) {
                                while ((atomicLongFieldUpdater.get(this) & 4611686018427387904L) != 0) {
                                }
                            }
                        } else {
                            D(this);
                        }
                    } else {
                        iVar2 = iVar3;
                    }
                }
                if (iVar2 == null) {
                    continue;
                } else {
                    iVar = iVar2;
                }
            }
            int i10 = (int) (andIncrement % ((long) c.f43270b));
            Object objL = iVar.l(i10);
            boolean z10 = objL instanceof K0;
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f43248f;
            if (!z10 || andIncrement < atomicLongFieldUpdater2.get(this) || !iVar.k(objL, i10, c.f43275g)) {
                while (true) {
                    Object objL2 = iVar.l(i10);
                    if (objL2 instanceof K0) {
                        if (andIncrement < atomicLongFieldUpdater2.get(this)) {
                            if (iVar.k(objL2, i10, new r((K0) objL2))) {
                                D(this);
                                return;
                            }
                        } else if (iVar.k(objL2, i10, c.f43275g)) {
                            if (!R(objL2, iVar, i10)) {
                                iVar.o(i10, c.j);
                                iVar.i();
                                break;
                            } else {
                                iVar.o(i10, c.f43272d);
                                D(this);
                                return;
                            }
                        }
                    } else {
                        if (objL2 == c.j) {
                            break;
                        }
                        if (objL2 == null) {
                            if (iVar.k(objL2, i10, c.f43273e)) {
                                D(this);
                                return;
                            }
                        } else if (objL2 == c.f43272d || objL2 == c.f43276h || objL2 == c.f43277i || objL2 == c.f43278k || objL2 == c.f43279l) {
                            D(this);
                            return;
                        } else if (objL2 != c.f43274f) {
                            throw new IllegalStateException(("Unexpected cell state: " + objL2).toString());
                        }
                    }
                }
                D(this);
            } else if (R(objL, iVar, i10)) {
                iVar.o(i10, c.f43272d);
                D(this);
                return;
            } else {
                iVar.o(i10, c.j);
                iVar.i();
                D(this);
            }
        }
    }

    public final i<E> x(long j10, i<E> iVar) {
        Object objA;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j11;
        i<Object> iVar2 = c.f43269a;
        BufferedChannelKt$createSegmentFunction$1 bufferedChannelKt$createSegmentFunction$1 = BufferedChannelKt$createSegmentFunction$1.f43267b;
        loop0: while (true) {
            objA = kotlinx.coroutines.internal.d.a(iVar, j10, bufferedChannelKt$createSegmentFunction$1);
            if (!w.b(objA)) {
                v vVarA = w.a(objA);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = j;
                    v vVar = (v) atomicReferenceFieldUpdater.get(this);
                    if (vVar.f43504d >= vVarA.f43504d) {
                        break loop0;
                    }
                    if (!vVarA.j()) {
                        break;
                    }
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, vVar, vVarA)) {
                            if (!vVar.f()) {
                                break loop0;
                            }
                            vVar.e();
                            break loop0;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == vVar);
                    if (vVarA.f()) {
                        vVarA.e();
                    }
                }
            } else {
                break;
            }
        }
        if (w.b(objA)) {
            v();
            if (iVar.f43504d * ((long) c.f43270b) >= B()) {
                return null;
            }
            iVar.b();
            return null;
        }
        i<E> iVar3 = (i) w.a(objA);
        boolean zH = H();
        long j12 = iVar3.f43504d;
        if (!zH && j10 <= f43249g.get(this) / ((long) c.f43270b)) {
            loop3: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f43252k;
                v vVar2 = (v) atomicReferenceFieldUpdater2.get(this);
                if (vVar2.f43504d >= j12 || !iVar3.j()) {
                    break;
                }
                do {
                    if (atomicReferenceFieldUpdater2.compareAndSet(this, vVar2, iVar3)) {
                        if (!vVar2.f()) {
                            break loop3;
                        }
                        vVar2.e();
                        break loop3;
                    }
                } while (atomicReferenceFieldUpdater2.get(this) == vVar2);
                if (iVar3.f()) {
                    iVar3.e();
                }
            }
        }
        if (j12 <= j10) {
            return iVar3;
        }
        long j13 = ((long) c.f43270b) * j12;
        do {
            atomicLongFieldUpdater = f43248f;
            j11 = atomicLongFieldUpdater.get(this);
            if (j11 >= j13) {
                break;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j11, j13));
        if (j12 * ((long) c.f43270b) >= B()) {
            return null;
        }
        iVar3.b();
        return null;
    }

    public final Throwable y() {
        return (Throwable) f43253l.get(this);
    }

    public final Throwable z() {
        Throwable thY = y();
        return thY == null ? new ClosedReceiveChannelException("Channel was closed") : thY;
    }
}
