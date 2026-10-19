package kotlinx.coroutines.flow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.C2693i;
import kotlinx.coroutines.InterfaceC2694i0;
import kotlinx.coroutines.P;
import kotlinx.coroutines.Q;
import kotlinx.coroutines.channels.BufferOverflow;

/* JADX INFO: compiled from: SharedFlow.kt */
/* JADX INFO: loaded from: classes2.dex */
public class v<T> extends kotlinx.coroutines.flow.internal.a<x> implements p<T>, InterfaceC2686c, kotlinx.coroutines.flow.internal.k<T> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f43420f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f43421g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final BufferOverflow f43422h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object[] f43423i;
    public long j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f43424k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f43425l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f43426m;

    /* JADX INFO: compiled from: SharedFlow.kt */
    public static final class a implements P {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final v<?> f43427b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f43428c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Object f43429d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final C2693i f43430e;

        public a(v vVar, long j, Object obj, C2693i c2693i) {
            this.f43427b = vVar;
            this.f43428c = j;
            this.f43429d = obj;
            this.f43430e = c2693i;
        }

        @Override // kotlinx.coroutines.P
        public final void dispose() {
            v<?> vVar = this.f43427b;
            synchronized (vVar) {
                if (this.f43428c < vVar.q()) {
                    return;
                }
                Object[] objArr = vVar.f43423i;
                kotlin.jvm.internal.i.b(objArr);
                long j = this.f43428c;
                if (objArr[((int) j) & (objArr.length - 1)] != this) {
                    return;
                }
                w.c(objArr, j, w.f43431a);
                vVar.l();
                p293xa.r rVar = p293xa.r.f47939a;
            }
        }
    }

    public v(int i10, int i11, BufferOverflow bufferOverflow) {
        this.f43420f = i10;
        this.f43421g = i11;
        this.f43422h = bufferOverflow;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public static void m(v vVar, InterfaceC2687d interfaceC2687d, kotlin.coroutines.c cVar) throws Throwable {
        SharedFlowImpl$collect$1 sharedFlowImpl$collect$1;
        v vVar2;
        Throwable th;
        x xVar;
        InterfaceC2687d interfaceC2687d2;
        InterfaceC2694i0 interfaceC2694i0;
        InterfaceC2687d interfaceC2687d3;
        if (cVar instanceof SharedFlowImpl$collect$1) {
            sharedFlowImpl$collect$1 = (SharedFlowImpl$collect$1) cVar;
            int i10 = sharedFlowImpl$collect$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                sharedFlowImpl$collect$1.label = i10 - Integer.MIN_VALUE;
            } else {
                sharedFlowImpl$collect$1 = new SharedFlowImpl$collect$1(vVar, cVar);
            }
        } else {
            sharedFlowImpl$collect$1 = new SharedFlowImpl$collect$1(vVar, cVar);
        }
        Object obj = sharedFlowImpl$collect$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = sharedFlowImpl$collect$1.label;
        if (i11 != 0) {
            if (i11 == 1) {
                xVar = (x) sharedFlowImpl$collect$1.L$2;
                InterfaceC2687d interfaceC2687d4 = (InterfaceC2687d) sharedFlowImpl$collect$1.L$1;
                v vVar3 = (v) sharedFlowImpl$collect$1.L$0;
                try {
                    kotlin.b.b(obj);
                    interfaceC2687d2 = interfaceC2687d4;
                    vVar = vVar3;
                    try {
                        interfaceC2694i0 = (InterfaceC2694i0) sharedFlowImpl$collect$1.getContext().get(InterfaceC2694i0.b.f43449b);
                        interfaceC2687d3 = interfaceC2687d2;
                    } catch (Throwable th2) {
                        vVar2 = vVar;
                        th = th2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    vVar2 = vVar3;
                }
            } else {
                if (i11 != 2 && i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                InterfaceC2694i0 interfaceC2694i1 = (InterfaceC2694i0) sharedFlowImpl$collect$1.L$3;
                xVar = (x) sharedFlowImpl$collect$1.L$2;
                InterfaceC2687d interfaceC2687d5 = (InterfaceC2687d) sharedFlowImpl$collect$1.L$1;
                vVar2 = (v) sharedFlowImpl$collect$1.L$0;
                try {
                    kotlin.b.b(obj);
                    interfaceC2687d3 = interfaceC2687d5;
                    interfaceC2694i0 = interfaceC2694i1;
                    vVar = vVar2;
                } catch (Throwable th4) {
                    th = th4;
                }
            }
            vVar2.j(xVar);
            throw th;
        }
        kotlin.b.b(obj);
        x xVarC = vVar.c();
        try {
            if (interfaceC2687d instanceof D) {
                sharedFlowImpl$collect$1.L$0 = vVar;
                sharedFlowImpl$collect$1.L$1 = interfaceC2687d;
                sharedFlowImpl$collect$1.L$2 = xVarC;
                sharedFlowImpl$collect$1.label = 1;
                if (((D) interfaceC2687d).a(sharedFlowImpl$collect$1) == coroutineSingletons) {
                    return;
                }
            }
            interfaceC2687d2 = interfaceC2687d;
            xVar = xVarC;
            interfaceC2694i0 = (InterfaceC2694i0) sharedFlowImpl$collect$1.getContext().get(InterfaceC2694i0.b.f43449b);
            interfaceC2687d3 = interfaceC2687d2;
        } catch (Throwable th5) {
            vVar2 = vVar;
            th = th5;
            xVar = xVarC;
        }
        while (true) {
            Object objU = vVar.u(xVar);
            if (objU == w.f43431a) {
                sharedFlowImpl$collect$1.L$0 = vVar;
                sharedFlowImpl$collect$1.L$1 = interfaceC2687d3;
                sharedFlowImpl$collect$1.L$2 = xVar;
                sharedFlowImpl$collect$1.L$3 = interfaceC2694i0;
                sharedFlowImpl$collect$1.label = 2;
                if (vVar.k(xVar, sharedFlowImpl$collect$1) == coroutineSingletons) {
                    return;
                }
            } else {
                if (interfaceC2694i0 != null && !interfaceC2694i0.c()) {
                    throw interfaceC2694i0.M();
                }
                sharedFlowImpl$collect$1.L$0 = vVar;
                sharedFlowImpl$collect$1.L$1 = interfaceC2687d3;
                sharedFlowImpl$collect$1.L$2 = xVar;
                sharedFlowImpl$collect$1.L$3 = interfaceC2694i0;
                sharedFlowImpl$collect$1.label = 3;
                if (interfaceC2687d3.emit(objU, sharedFlowImpl$collect$1) == coroutineSingletons) {
                    return;
                }
            }
        }
    }

    @Override // kotlinx.coroutines.flow.u
    public final List<T> a() {
        synchronized (this) {
            int iQ = (int) ((q() + ((long) this.f43425l)) - this.j);
            if (iQ == 0) {
                return EmptyList.f42983b;
            }
            ArrayList arrayList = new ArrayList(iQ);
            Object[] objArr = this.f43423i;
            kotlin.jvm.internal.i.b(objArr);
            for (int i10 = 0; i10 < iQ; i10++) {
                arrayList.add(objArr[((int) (this.j + ((long) i10))) & (objArr.length - 1)]);
            }
            return arrayList;
        }
    }

    @Override // kotlinx.coroutines.flow.internal.k
    public final InterfaceC2686c<T> b(kotlin.coroutines.e eVar, int i10, BufferOverflow bufferOverflow) {
        return w.d(this, eVar, i10, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.InterfaceC2686c
    public final Object collect(InterfaceC2687d<? super T> interfaceC2687d, kotlin.coroutines.c<?> cVar) throws Throwable {
        m(this, interfaceC2687d, cVar);
        return CoroutineSingletons.f43038b;
    }

    @Override // kotlinx.coroutines.flow.p
    public final void e() {
        synchronized (this) {
            v(q() + ((long) this.f43425l), this.f43424k, q() + ((long) this.f43425l), q() + ((long) this.f43425l) + ((long) this.f43426m));
            p293xa.r rVar = p293xa.r.f47939a;
        }
    }

    @Override // kotlinx.coroutines.flow.p, kotlinx.coroutines.flow.InterfaceC2687d
    public final Object emit(T t8, kotlin.coroutines.c<? super p293xa.r> cVar) {
        kotlin.coroutines.c<p293xa.r>[] cVarArrP;
        a aVar;
        if (f(t8)) {
            return p293xa.r.f47939a;
        }
        C2693i c2693i = new C2693i(1, A8.p.y(cVar));
        c2693i.s();
        kotlin.coroutines.c<p293xa.r>[] cVarArrP2 = kotlinx.coroutines.flow.internal.b.f43392a;
        synchronized (this) {
            try {
                if (s(t8)) {
                    c2693i.resumeWith(p293xa.r.f47939a);
                    cVarArrP = p(cVarArrP2);
                    aVar = null;
                } else {
                    a aVar2 = new a(this, ((long) (this.f43425l + this.f43426m)) + q(), t8, c2693i);
                    o(aVar2);
                    this.f43426m++;
                    if (this.f43421g == 0) {
                        cVarArrP2 = p(cVarArrP2);
                    }
                    cVarArrP = cVarArrP2;
                    aVar = aVar2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (aVar != null) {
            c2693i.v(new Q(aVar));
        }
        for (kotlin.coroutines.c<p293xa.r> cVar2 : cVarArrP) {
            if (cVar2 != null) {
                cVar2.resumeWith(p293xa.r.f47939a);
            }
        }
        Object objP = c2693i.p();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        if (objP != coroutineSingletons) {
            objP = p293xa.r.f47939a;
        }
        return objP == coroutineSingletons ? objP : p293xa.r.f47939a;
    }

    @Override // kotlinx.coroutines.flow.p
    public final boolean f(T t8) {
        int i10;
        boolean z10;
        kotlin.coroutines.c<p293xa.r>[] cVarArrP = kotlinx.coroutines.flow.internal.b.f43392a;
        synchronized (this) {
            if (s(t8)) {
                cVarArrP = p(cVarArrP);
                z10 = true;
            } else {
                z10 = false;
            }
        }
        for (kotlin.coroutines.c<p293xa.r> cVar : cVarArrP) {
            if (cVar != null) {
                cVar.resumeWith(p293xa.r.f47939a);
            }
        }
        return z10;
    }

    @Override // kotlinx.coroutines.flow.internal.a
    public final kotlinx.coroutines.flow.internal.c g() {
        return new x();
    }

    @Override // kotlinx.coroutines.flow.internal.a
    public final kotlinx.coroutines.flow.internal.c[] i() {
        return new x[2];
    }

    public final Object k(x xVar, kotlin.coroutines.c<? super p293xa.r> cVar) {
        C2693i c2693i = new C2693i(1, A8.p.y(cVar));
        c2693i.s();
        synchronized (this) {
            if (t(xVar) < 0) {
                xVar.f43433b = c2693i;
            } else {
                c2693i.resumeWith(p293xa.r.f47939a);
            }
            p293xa.r rVar = p293xa.r.f47939a;
        }
        Object objP = c2693i.p();
        return objP == CoroutineSingletons.f43038b ? objP : p293xa.r.f47939a;
    }

    public final void l() {
        if (this.f43421g != 0 || this.f43426m > 1) {
            Object[] objArr = this.f43423i;
            kotlin.jvm.internal.i.b(objArr);
            while (this.f43426m > 0) {
                long jQ = q();
                int i10 = this.f43425l;
                int i11 = this.f43426m;
                if (objArr[((int) ((jQ + ((long) (i10 + i11))) - 1)) & (objArr.length - 1)] != w.f43431a) {
                    return;
                }
                this.f43426m = i11 - 1;
                w.c(objArr, q() + ((long) (this.f43425l + this.f43426m)), null);
            }
        }
    }

    public final void n() {
        Object[] objArr;
        Object[] objArr2 = this.f43423i;
        kotlin.jvm.internal.i.b(objArr2);
        w.c(objArr2, q(), null);
        this.f43425l--;
        long jQ = q() + 1;
        if (this.j < jQ) {
            this.j = jQ;
        }
        if (this.f43424k < jQ) {
            if (this.f43389c != 0 && (objArr = this.f43388b) != null) {
                for (Object obj : objArr) {
                    if (obj != null) {
                        x xVar = (x) obj;
                        long j = xVar.f43432a;
                        if (j >= 0 && j < jQ) {
                            xVar.f43432a = jQ;
                        }
                    }
                }
            }
            this.f43424k = jQ;
        }
    }

    public final void o(Object obj) {
        int i10 = this.f43425l + this.f43426m;
        Object[] objArrR = this.f43423i;
        if (objArrR == null) {
            objArrR = r(0, 2, null);
        } else if (i10 >= objArrR.length) {
            objArrR = r(i10, objArrR.length * 2, objArrR);
        }
        w.c(objArrR, q() + ((long) i10), obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [kotlin.coroutines.c<xa.r>[]] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r6v3 */
    public final kotlin.coroutines.c<p293xa.r>[] p(kotlin.coroutines.c<p293xa.r>[] cVarArr) {
        Object[] objArr;
        x xVar;
        C2693i c2693i;
        int length = cVarArr.length;
        if (this.f43389c != 0 && (objArr = this.f43388b) != null) {
            int length2 = objArr.length;
            int i10 = 0;
            while (i10 < length2) {
                Object obj = objArr[i10];
                if (obj == null || (c2693i = (xVar = (x) obj).f43433b) == null || t(xVar) < 0) {
                    cVarArr = cVarArr;
                } else {
                    if (length >= cVarArr.length) {
                        cVarArr = cVarArr;
                        cVarArr = cVarArr;
                        Object[] objArrCopyOf = Arrays.copyOf((Object[]) cVarArr, Math.max(2, cVarArr.length * 2));
                        kotlin.jvm.internal.i.d(objArrCopyOf, "copyOf(...)");
                        cVarArr = objArrCopyOf;
                    }
                    cVarArr = cVarArr;
                    cVarArr = cVarArr;
                    ((kotlin.coroutines.c[]) cVarArr)[length] = c2693i;
                    xVar.f43433b = null;
                    length++;
                }
                i10++;
                cVarArr = cVarArr;
            }
            cVarArr = cVarArr;
        }
        return (kotlin.coroutines.c[]) cVarArr;
    }

    public final long q() {
        return Math.min(this.f43424k, this.j);
    }

    public final Object[] r(int i10, int i11, Object[] objArr) {
        if (i11 <= 0) {
            throw new IllegalStateException("Buffer size overflow");
        }
        Object[] objArr2 = new Object[i11];
        this.f43423i = objArr2;
        if (objArr == null) {
            return objArr2;
        }
        long jQ = q();
        for (int i12 = 0; i12 < i10; i12++) {
            long j = ((long) i12) + jQ;
            w.c(objArr2, j, objArr[((int) j) & (objArr.length - 1)]);
        }
        return objArr2;
    }

    public final boolean s(T t8) {
        int i10 = this.f43389c;
        int i11 = this.f43420f;
        if (i10 == 0) {
            if (i11 != 0) {
                o(t8);
                int i12 = this.f43425l + 1;
                this.f43425l = i12;
                if (i12 > i11) {
                    n();
                }
                this.f43424k = q() + ((long) this.f43425l);
            }
            return true;
        }
        int i13 = this.f43425l;
        int i14 = this.f43421g;
        if (i13 >= i14 && this.f43424k <= this.j) {
            int iOrdinal = this.f43422h.ordinal();
            if (iOrdinal == 0) {
                return false;
            }
            if (iOrdinal == 2) {
                return true;
            }
        }
        o(t8);
        int i15 = this.f43425l + 1;
        this.f43425l = i15;
        if (i15 > i14) {
            n();
        }
        long jQ = q() + ((long) this.f43425l);
        long j = this.j;
        if (((int) (jQ - j)) > i11) {
            v(j + 1, this.f43424k, q() + ((long) this.f43425l), q() + ((long) this.f43425l) + ((long) this.f43426m));
        }
        return true;
    }

    public final long t(x xVar) {
        long j = xVar.f43432a;
        if (j < q() + ((long) this.f43425l)) {
            return j;
        }
        if (this.f43421g <= 0 && j <= q() && this.f43426m != 0) {
            return j;
        }
        return -1L;
    }

    public final Object u(x xVar) {
        Object obj;
        kotlin.coroutines.c<p293xa.r>[] cVarArrW = kotlinx.coroutines.flow.internal.b.f43392a;
        synchronized (this) {
            try {
                long jT = t(xVar);
                if (jT < 0) {
                    obj = w.f43431a;
                } else {
                    long j = xVar.f43432a;
                    Object[] objArr = this.f43423i;
                    kotlin.jvm.internal.i.b(objArr);
                    Object obj2 = objArr[((int) jT) & (objArr.length - 1)];
                    if (obj2 instanceof a) {
                        obj2 = ((a) obj2).f43429d;
                    }
                    xVar.f43432a = jT + 1;
                    Object obj3 = obj2;
                    cVarArrW = w(j);
                    obj = obj3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        for (kotlin.coroutines.c<p293xa.r> cVar : cVarArrW) {
            if (cVar != null) {
                cVar.resumeWith(p293xa.r.f47939a);
            }
        }
        return obj;
    }

    public final void v(long j, long j10, long j11, long j12) {
        long jMin = Math.min(j10, j);
        for (long jQ = q(); jQ < jMin; jQ++) {
            Object[] objArr = this.f43423i;
            kotlin.jvm.internal.i.b(objArr);
            w.c(objArr, jQ, null);
        }
        this.j = j;
        this.f43424k = j10;
        this.f43425l = (int) (j11 - jMin);
        this.f43426m = (int) (j12 - j11);
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:49:0x00be  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:60:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:71:? A[RETURN, SYNTHETIC] */
    public final kotlin.coroutines.c<p293xa.r>[] w(long j) {
        long j10;
        long j11;
        kotlin.coroutines.c<p293xa.r>[] cVarArr;
        long j12;
        long jMax;
        Object[] objArr;
        long j13;
        Object[] objArr2;
        long j14 = this.f43424k;
        kotlin.coroutines.c<p293xa.r>[] cVarArr2 = kotlinx.coroutines.flow.internal.b.f43392a;
        if (j > j14) {
            return cVarArr2;
        }
        long jQ = q();
        long j15 = ((long) this.f43425l) + jQ;
        int i10 = this.f43421g;
        if (i10 == 0 && this.f43426m > 0) {
            j15++;
        }
        if (this.f43389c != 0 && (objArr2 = this.f43388b) != null) {
            for (Object obj : objArr2) {
                if (obj != null) {
                    long j16 = ((x) obj).f43432a;
                    if (j16 >= 0 && j16 < j15) {
                        j15 = j16;
                    }
                }
            }
        }
        if (j15 <= this.f43424k) {
            return cVarArr2;
        }
        long jQ2 = q() + ((long) this.f43425l);
        int iMin = this.f43389c > 0 ? Math.min(this.f43426m, i10 - ((int) (jQ2 - j15))) : this.f43426m;
        long j17 = ((long) this.f43426m) + jQ2;
        D3.l lVar = w.f43431a;
        if (iMin > 0) {
            cVarArr2 = new kotlin.coroutines.c[iMin];
            Object[] objArr3 = this.f43423i;
            kotlin.jvm.internal.i.b(objArr3);
            j10 = j15;
            long j18 = jQ2;
            long j19 = j18;
            int i11 = 0;
            while (true) {
                if (j19 >= j17) {
                    j11 = j17;
                    cVarArr = cVarArr2;
                    jQ2 = j18;
                    break;
                }
                j11 = j17;
                Object obj2 = objArr3[((int) j19) & (objArr3.length - 1)];
                if (obj2 != lVar) {
                    kotlin.jvm.internal.i.c(obj2, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                    a aVar = (a) obj2;
                    int i12 = i11 + 1;
                    cVarArr2[i11] = aVar.f43430e;
                    w.c(objArr3, j19, lVar);
                    w.c(objArr3, j18, aVar.f43429d);
                    j13 = 1;
                    jQ2 = j18 + 1;
                    if (i12 < iMin) {
                        j18 = jQ2;
                        i11 = i12;
                    }
                } else {
                    j13 = 1;
                }
                j19 += j13;
                j17 = j11;
            }
            int i13 = (int) (jQ2 - jQ);
            if (this.f43389c == 0) {
                j12 = jQ2;
            } else {
                j12 = j10;
            }
            jMax = Math.max(this.j, jQ2 - ((long) Math.min(this.f43420f, i13)));
            if (i10 == 0 && jMax < j11) {
                objArr = this.f43423i;
                kotlin.jvm.internal.i.b(objArr);
                if (kotlin.jvm.internal.i.a(objArr[((int) jMax) & (objArr.length - 1)], lVar)) {
                    jQ2++;
                    jMax++;
                }
            }
            v(jMax, j12, jQ2, j11);
            l();
            if (cVarArr.length == 0) {
                return cVarArr;
            }
            return p(cVarArr);
        }
        j10 = j15;
        j11 = j17;
        cVarArr = cVarArr2;
        int i14 = (int) (jQ2 - jQ);
        if (this.f43389c == 0) {
            j12 = jQ2;
        } else {
            j12 = j10;
        }
        jMax = Math.max(this.j, jQ2 - ((long) Math.min(this.f43420f, i14)));
        if (i10 == 0) {
            objArr = this.f43423i;
            kotlin.jvm.internal.i.b(objArr);
            if (kotlin.jvm.internal.i.a(objArr[((int) jMax) & (objArr.length - 1)], lVar)) {
                jQ2++;
                jMax++;
            }
        }
        v(jMax, j12, jQ2, j11);
        l();
        if (cVarArr.length == 0) {
            return cVarArr;
        }
        return p(cVarArr);
    }
}
