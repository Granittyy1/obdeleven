package androidx.compose.ui.input.pointer;

import androidx.compose.ui.node.C1185f;
import androidx.compose.ui.platform.Y0;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.C2693i;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.InterfaceC2694i0;
import kotlinx.coroutines.z0;

/* JADX INFO: compiled from: SuspendingPointerInputFilter.kt */
/* JADX INFO: loaded from: classes.dex */
public final class SuspendingPointerInputModifierNodeImpl extends androidx.compose.ui.h.c implements D, w, p013b0.c {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public long f14051A;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Object f14052p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Object f14053q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Object[] f14054r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public SuspendLambda f14055s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public PointerInputEventHandler f14056t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public z0 f14057u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public j f14058v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final androidx.compose.runtime.collection.c<PointerEventHandlerCoroutine<?>> f14059w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final androidx.compose.runtime.collection.c f14060x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final androidx.compose.runtime.collection.c<PointerEventHandlerCoroutine<?>> f14061y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public j f14062z;

    /* JADX INFO: compiled from: SuspendingPointerInputFilter.kt */
    public final class PointerEventHandlerCoroutine<R> implements InterfaceC1152c, p013b0.c, kotlin.coroutines.c<R> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final C2693i f14063b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ SuspendingPointerInputModifierNodeImpl f14064c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public C2693i f14065d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public PointerEventPass f14066e = PointerEventPass.f14030c;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final EmptyCoroutineContext f14067f = EmptyCoroutineContext.f43032b;

        public PointerEventHandlerCoroutine(C2693i c2693i) {
            this.f14063b = c2693i;
            this.f14064c = SuspendingPointerInputModifierNodeImpl.this;
        }

        @Override // p013b0.c
        public final long A0(float f10) {
            return this.f14064c.A0(f10);
        }

        @Override // androidx.compose.ui.input.pointer.InterfaceC1152c
        public final Object K(PointerEventPass pointerEventPass, BaseContinuationImpl baseContinuationImpl) {
            C2693i c2693i = new C2693i(1, A8.p.y(baseContinuationImpl));
            c2693i.s();
            this.f14066e = pointerEventPass;
            this.f14065d = c2693i;
            Object objP = c2693i.p();
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            return objP;
        }

        @Override // androidx.compose.ui.input.pointer.InterfaceC1152c
        public final j P() {
            return SuspendingPointerInputModifierNodeImpl.this.f14058v;
        }

        @Override // p013b0.c
        public final float P0() {
            return this.f14064c.P0();
        }

        @Override // p013b0.c
        public final float T0(float f10) {
            return this.f14064c.getDensity() * f10;
        }

        @Override // p013b0.c
        public final long W(float f10) {
            return this.f14064c.W(f10);
        }

        @Override // androidx.compose.ui.input.pointer.InterfaceC1152c
        public final long Y0() {
            SuspendingPointerInputModifierNodeImpl suspendingPointerInputModifierNodeImpl = SuspendingPointerInputModifierNodeImpl.this;
            suspendingPointerInputModifierNodeImpl.getClass();
            long jO1 = suspendingPointerInputModifierNodeImpl.o1(C1185f.f(suspendingPointerInputModifierNodeImpl).f14384B.d());
            long j = suspendingPointerInputModifierNodeImpl.f14051A;
            return (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jO1 >> 32)) - ((int) (j >> 32))) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jO1 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f)) & 4294967295L);
        }

        @Override // androidx.compose.ui.input.pointer.InterfaceC1152c
        public final long a() {
            return SuspendingPointerInputModifierNodeImpl.this.f14051A;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r7v0, types: [long] */
        /* JADX WARN: Type inference failed for: r7v1, types: [kotlinx.coroutines.i0] */
        /* JADX WARN: Type inference failed for: r7v4, types: [kotlinx.coroutines.i0] */
        /* JADX WARN: Type inference failed for: r7v8 */
        /* JADX WARN: Type inference failed for: r7v9 */
        @Override // androidx.compose.ui.input.pointer.InterfaceC1152c
        public final Object d0(long j, Ia.p pVar, ContinuationImpl continuationImpl) {
            SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1 suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1;
            C2693i c2693i;
            if (continuationImpl instanceof SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1) {
                suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1 = (SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1) continuationImpl;
                int i10 = suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1.label;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1.label = i10 - Integer.MIN_VALUE;
                } else {
                    suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1 = new SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1(this, continuationImpl);
                }
            } else {
                suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1 = new SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1(this, continuationImpl);
            }
            Object objInvoke = suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1.result;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i11 = suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1.label;
            try {
                if (i11 == 0) {
                    kotlin.b.b(objInvoke);
                    if (j <= 0 && (c2693i = this.f14065d) != null) {
                        c2693i.resumeWith(kotlin.b.a(new PointerEventTimeoutCancellationException(j)));
                    }
                    z0 z0VarC = C2680e.c(SuspendingPointerInputModifierNodeImpl.this.E1(), null, null, new SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$job$1(j, this, null), 3);
                    suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1.L$0 = z0VarC;
                    suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1.label = 1;
                    objInvoke = pVar.invoke(this, suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1);
                    j = z0VarC;
                    if (objInvoke == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    InterfaceC2694i0 interfaceC2694i0 = (InterfaceC2694i0) suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1.L$0;
                    kotlin.b.b(objInvoke);
                    j = interfaceC2694i0;
                }
                j.i(CancelTimeoutCancellationException.f14015b);
                return objInvoke;
            } catch (Throwable th) {
                j.i(CancelTimeoutCancellationException.f14015b);
                throw th;
            }
        }

        @Override // p013b0.c
        public final float e0(long j) {
            return this.f14064c.e0(j);
        }

        @Override // p013b0.c
        public final int e1(float f10) {
            return this.f14064c.e1(f10);
        }

        @Override // kotlin.coroutines.c
        public final kotlin.coroutines.e getContext() {
            return this.f14067f;
        }

        @Override // p013b0.c
        public final float getDensity() {
            return this.f14064c.getDensity();
        }

        @Override // androidx.compose.ui.input.pointer.InterfaceC1152c
        public final Y0 getViewConfiguration() {
            SuspendingPointerInputModifierNodeImpl suspendingPointerInputModifierNodeImpl = SuspendingPointerInputModifierNodeImpl.this;
            suspendingPointerInputModifierNodeImpl.getClass();
            return C1185f.f(suspendingPointerInputModifierNodeImpl).f14384B;
        }

        @Override // p013b0.c
        public final long o1(long j) {
            return this.f14064c.o1(j);
        }

        @Override // p013b0.c
        public final long p(long j) {
            return this.f14064c.p(j);
        }

        @Override // kotlin.coroutines.c
        public final void resumeWith(Object obj) {
            SuspendingPointerInputModifierNodeImpl suspendingPointerInputModifierNodeImpl = SuspendingPointerInputModifierNodeImpl.this;
            synchronized (suspendingPointerInputModifierNodeImpl.f14060x) {
                suspendingPointerInputModifierNodeImpl.f14059w.m(this);
                p293xa.r rVar = p293xa.r.f47939a;
            }
            this.f14063b.resumeWith(obj);
        }

        @Override // p013b0.c
        public final float s1(long j) {
            return this.f14064c.s1(j);
        }

        @Override // p013b0.c
        public final float u(int i10) {
            return this.f14064c.u(i10);
        }

        @Override // p013b0.c
        public final float v(float f10) {
            return f10 / this.f14064c.getDensity();
        }

        @Override // p013b0.c
        public final long w0(int i10) {
            return this.f14064c.w0(i10);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // androidx.compose.ui.input.pointer.InterfaceC1152c
        public final <T> Object z0(long j, Ia.p<? super InterfaceC1152c, ? super kotlin.coroutines.c<? super T>, ? extends Object> pVar, kotlin.coroutines.c<? super T> cVar) {
            SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1 suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1;
            if (cVar instanceof SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1) {
                suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1 = (SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1) cVar;
                int i10 = suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1.label;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1.label = i10 - Integer.MIN_VALUE;
                } else {
                    suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1 = new SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1(this, (BaseContinuationImpl) cVar);
                }
            } else {
                suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1 = new SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1(this, (BaseContinuationImpl) cVar);
            }
            Object objD0 = suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1.result;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i11 = suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1.label;
            try {
                if (i11 == 0) {
                    kotlin.b.b(objD0);
                    suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1.label = 1;
                    objD0 = d0(j, pVar, suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1);
                    if (objD0 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.b.b(objD0);
                }
                return objD0;
            } catch (PointerEventTimeoutCancellationException unused) {
                return null;
            }
        }
    }

    @p293xa.d
    public SuspendingPointerInputModifierNodeImpl() {
        throw null;
    }

    public SuspendingPointerInputModifierNodeImpl(Object obj, Object obj2, Object[] objArr, PointerInputEventHandler pointerInputEventHandler) {
        this.f14052p = obj;
        this.f14053q = obj2;
        this.f14054r = objArr;
        this.f14056t = pointerInputEventHandler;
        this.f14058v = B.f14012a;
        androidx.compose.runtime.collection.c<PointerEventHandlerCoroutine<?>> cVar = new androidx.compose.runtime.collection.c<>(new PointerEventHandlerCoroutine[16]);
        this.f14059w = cVar;
        this.f14060x = cVar;
        this.f14061y = new androidx.compose.runtime.collection.c<>(new PointerEventHandlerCoroutine[16]);
        this.f14051A = 0L;
    }

    @Override // androidx.compose.ui.input.pointer.D
    public final void D1() {
        z0 z0Var = this.f14057u;
        if (z0Var != null) {
            z0Var.F(new PointerInputResetException());
            this.f14057u = null;
        }
    }

    @Override // androidx.compose.ui.h.c
    public final void J1() {
        D1();
    }

    @Override // p013b0.c
    public final float P0() {
        return C1185f.f(this).f14423z.P0();
    }

    /* JADX WARN: Code duplicated, block: B:24:0x003d A[Catch: all -> 0x003b, TryCatch #1 {all -> 0x003b, blocks: (B:6:0x000d, B:13:0x001b, B:16:0x0027, B:18:0x002f, B:20:0x0033, B:21:0x0038, B:24:0x003d, B:26:0x0046, B:28:0x004e, B:30:0x0052), top: B:41:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:26:0x0046 A[Catch: all -> 0x003b, TryCatch #1 {all -> 0x003b, blocks: (B:6:0x000d, B:13:0x001b, B:16:0x0027, B:18:0x002f, B:20:0x0033, B:21:0x0038, B:24:0x003d, B:26:0x0046, B:28:0x004e, B:30:0x0052), top: B:41:0x000d }] */
    public final void Q1(j jVar, PointerEventPass pointerEventPass) {
        PointerEventHandlerCoroutine<?>[] pointerEventHandlerCoroutineArr;
        int i10;
        int i11;
        PointerEventHandlerCoroutine<?> pointerEventHandlerCoroutine;
        C2693i c2693i;
        C2693i c2693i2;
        synchronized (this.f14060x) {
            androidx.compose.runtime.collection.c<PointerEventHandlerCoroutine<?>> cVar = this.f14061y;
            cVar.d(cVar.f12945d, this.f14059w);
        }
        try {
            int iOrdinal = pointerEventPass.ordinal();
            if (iOrdinal == 0) {
                androidx.compose.runtime.collection.c<PointerEventHandlerCoroutine<?>> cVar2 = this.f14061y;
                pointerEventHandlerCoroutineArr = cVar2.f12943b;
                i10 = cVar2.f12945d;
                for (i11 = 0; i11 < i10; i11++) {
                    pointerEventHandlerCoroutine = pointerEventHandlerCoroutineArr[i11];
                    if (pointerEventPass != pointerEventHandlerCoroutine.f14066e && (c2693i = pointerEventHandlerCoroutine.f14065d) != null) {
                        pointerEventHandlerCoroutine.f14065d = null;
                        c2693i.resumeWith(jVar);
                    }
                }
            } else if (iOrdinal == 1) {
                androidx.compose.runtime.collection.c<PointerEventHandlerCoroutine<?>> cVar3 = this.f14061y;
                int i12 = cVar3.f12945d - 1;
                PointerEventHandlerCoroutine<?>[] pointerEventHandlerCoroutineArr2 = cVar3.f12943b;
                if (i12 < pointerEventHandlerCoroutineArr2.length) {
                    while (i12 >= 0) {
                        PointerEventHandlerCoroutine<?> pointerEventHandlerCoroutine2 = pointerEventHandlerCoroutineArr2[i12];
                        if (pointerEventPass == pointerEventHandlerCoroutine2.f14066e && (c2693i2 = pointerEventHandlerCoroutine2.f14065d) != null) {
                            pointerEventHandlerCoroutine2.f14065d = null;
                            c2693i2.resumeWith(jVar);
                        }
                        i12--;
                    }
                }
            } else if (iOrdinal == 2) {
                androidx.compose.runtime.collection.c<PointerEventHandlerCoroutine<?>> cVar4 = this.f14061y;
                pointerEventHandlerCoroutineArr = cVar4.f12943b;
                i10 = cVar4.f12945d;
                while (i11 < i10) {
                    pointerEventHandlerCoroutine = pointerEventHandlerCoroutineArr[i11];
                    if (pointerEventPass != pointerEventHandlerCoroutine.f14066e) {
                    }
                }
            }
            this.f14061y.j();
        } catch (Throwable th) {
            this.f14061y.j();
            throw th;
        }
    }

    @Override // p013b0.c
    public final float getDensity() {
        return C1185f.f(this).f14423z.getDensity();
    }

    @Override // androidx.compose.ui.input.pointer.w
    public final Y0 getViewConfiguration() {
        return C1185f.f(this).f14384B;
    }

    @Override // androidx.compose.ui.input.pointer.w
    public final <R> Object n0(Ia.p<? super InterfaceC1152c, ? super kotlin.coroutines.c<? super R>, ? extends Object> pVar, kotlin.coroutines.c<? super R> cVar) {
        C2693i c2693i = new C2693i(1, A8.p.y(cVar));
        c2693i.s();
        final PointerEventHandlerCoroutine pointerEventHandlerCoroutine = new PointerEventHandlerCoroutine(c2693i);
        synchronized (this.f14060x) {
            this.f14059w.b(pointerEventHandlerCoroutine);
            new kotlin.coroutines.f(A8.p.y(A8.p.u(pVar, pointerEventHandlerCoroutine, pointerEventHandlerCoroutine)), CoroutineSingletons.f43038b).resumeWith(p293xa.r.f47939a);
        }
        c2693i.u(new Ia.l<Throwable, p293xa.r>() { // from class: androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$awaitPointerEventScope$2$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // Ia.l
            public final p293xa.r invoke(Throwable th) {
                Throwable th2 = th;
                SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine<R> pointerEventHandlerCoroutine2 = pointerEventHandlerCoroutine;
                C2693i c2693i2 = pointerEventHandlerCoroutine2.f14065d;
                if (c2693i2 != null) {
                    c2693i2.o(th2);
                }
                pointerEventHandlerCoroutine2.f14065d = null;
                return p293xa.r.f47939a;
            }
        });
        return c2693i.p();
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.List] */
    @Override // androidx.compose.ui.node.Y
    public final void q0(j jVar, PointerEventPass pointerEventPass, long j) {
        this.f14051A = j;
        if (pointerEventPass == PointerEventPass.f14029b) {
            this.f14058v = jVar;
        }
        if (this.f14057u == null) {
            this.f14057u = C2680e.c(E1(), null, CoroutineStart.f43169e, new SuspendingPointerInputModifierNodeImpl$onPointerEvent$1(this, null), 1);
        }
        Q1(jVar, pointerEventPass);
        ?? r10 = jVar.f14091a;
        int size = ((Collection) r10).size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!I.b.e((q) r10.get(i10))) {
                this.f14062z = jVar;
            }
        }
        jVar = null;
        this.f14062z = jVar;
    }

    @Override // androidx.compose.ui.node.Y
    public final void r1() {
        D1();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    @Override // androidx.compose.ui.node.Y
    public final void u0() {
        j jVar = this.f14062z;
        if (jVar == null) {
            return;
        }
        ?? r10 = jVar.f14091a;
        int size = ((Collection) r10).size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((q) r10.get(i10)).f14103d) {
                ArrayList arrayList = new ArrayList(r10.size());
                int size2 = ((Collection) r10).size();
                for (int i11 = 0; i11 < size2; i11++) {
                    q qVar = (q) r10.get(i11);
                    long j = qVar.f14100a;
                    boolean z10 = qVar.f14103d;
                    int i12 = qVar.f14108i;
                    long j10 = qVar.f14101b;
                    long j11 = qVar.f14102c;
                    arrayList.add(new q(j, j10, j11, false, qVar.f14104e, j10, j11, z10, z10, i12, 0L));
                }
                j jVar2 = new j(arrayList, null);
                this.f14058v = jVar2;
                Q1(jVar2, PointerEventPass.f14029b);
                Q1(jVar2, PointerEventPass.f14030c);
                Q1(jVar2, PointerEventPass.f14031d);
                this.f14062z = null;
                return;
            }
        }
    }

    @Override // androidx.compose.ui.node.InterfaceC1184e, androidx.compose.ui.node.Y
    public final void w() {
        D1();
    }
}
