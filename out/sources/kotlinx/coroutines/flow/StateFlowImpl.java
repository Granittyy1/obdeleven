package kotlinx.coroutines.flow;

import com.google.android.gms.internal.measurement.M1;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.C2693i;
import kotlinx.coroutines.channels.BufferOverflow;

/* JADX INFO: compiled from: StateFlow.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class StateFlowImpl<T> extends kotlinx.coroutines.flow.internal.a<C> implements q<T>, InterfaceC2686c, kotlinx.coroutines.flow.internal.k<T> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f43362g = AtomicReferenceFieldUpdater.newUpdater(StateFlowImpl.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f43363f;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.StateFlowImpl$collect$1, reason: invalid class name */
    /* JADX INFO: compiled from: StateFlow.kt */
    @Aa.c(c = "kotlinx.coroutines.flow.StateFlowImpl", f = "StateFlow.kt", l = {384, 396, 401}, m = "collect")
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ StateFlowImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(StateFlowImpl<T> stateFlowImpl, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(cVar);
            this.this$0 = stateFlowImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            this.this$0.collect(null, this);
            return CoroutineSingletons.f43038b;
        }
    }

    public StateFlowImpl(Object obj) {
        this._state$volatile = obj;
    }

    @Override // kotlinx.coroutines.flow.u
    public final List<T> a() {
        return M1.k(getValue());
    }

    @Override // kotlinx.coroutines.flow.internal.k
    public final InterfaceC2686c<T> b(kotlin.coroutines.e eVar, int i10, BufferOverflow bufferOverflow) {
        return (((i10 < 0 || i10 >= 2) && i10 != -2) || bufferOverflow != BufferOverflow.f43244c) ? w.d(this, eVar, i10, bufferOverflow) : this;
    }

    /* JADX WARN: Code duplicated, block: B:62:0x0111 A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:14:0x003c, B:37:0x00a9, B:39:0x00b1, B:42:0x00b8, B:43:0x00bc, B:45:0x00bf, B:55:0x00e0, B:58:0x00f0, B:59:0x010a, B:65:0x011c, B:68:0x0125, B:62:0x0111, B:64:0x0117, B:47:0x00c5, B:51:0x00cc, B:21:0x005d, B:24:0x0070, B:36:0x009a), top: B:73:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x0117 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:80:? A[LOOP:0: B:59:0x010a->B:80:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x00ef -> B:37:0x00a9). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlinx.coroutines.flow.InterfaceC2686c
    public final java.lang.Object collect(kotlinx.coroutines.flow.InterfaceC2687d<? super T> r14, kotlin.coroutines.c<?> r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.StateFlowImpl.collect(kotlinx.coroutines.flow.d, kotlin.coroutines.c):java.lang.Object");
    }

    @Override // kotlinx.coroutines.flow.q
    public final boolean d(T t8, T t10) {
        D3.l lVar = kotlinx.coroutines.flow.internal.n.f43403a;
        if (t8 == null) {
            t8 = (T) lVar;
        }
        if (t10 == null) {
            t10 = (T) lVar;
        }
        return k(t8, t10);
    }

    @Override // kotlinx.coroutines.flow.p
    public final void e() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    @Override // kotlinx.coroutines.flow.p, kotlinx.coroutines.flow.InterfaceC2687d
    public final Object emit(T t8, kotlin.coroutines.c<? super p293xa.r> cVar) {
        setValue(t8);
        return p293xa.r.f47939a;
    }

    @Override // kotlinx.coroutines.flow.p
    public final boolean f(T t8) {
        setValue(t8);
        return true;
    }

    @Override // kotlinx.coroutines.flow.internal.a
    public final kotlinx.coroutines.flow.internal.c g() {
        return new C();
    }

    @Override // kotlinx.coroutines.flow.q, kotlinx.coroutines.flow.A
    public final T getValue() {
        D3.l lVar = kotlinx.coroutines.flow.internal.n.f43403a;
        T t8 = (T) f43362g.get(this);
        if (t8 == lVar) {
            return null;
        }
        return t8;
    }

    @Override // kotlinx.coroutines.flow.internal.a
    public final kotlinx.coroutines.flow.internal.c[] i() {
        return new C[2];
    }

    public final boolean k(Object obj, Object obj2) {
        int i10;
        Object obj3;
        D3.l lVar;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f43362g;
            Object obj4 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !kotlin.jvm.internal.i.a(obj4, obj)) {
                return false;
            }
            if (kotlin.jvm.internal.i.a(obj4, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i11 = this.f43363f;
            if ((i11 & 1) != 0) {
                this.f43363f = i11 + 2;
                return true;
            }
            int i12 = i11 + 1;
            this.f43363f = i12;
            Object obj5 = this.f43388b;
            p293xa.r rVar = p293xa.r.f47939a;
            while (true) {
                C[] cArr = (C[]) obj5;
                if (cArr != null) {
                    for (C c10 : cArr) {
                        if (c10 != null) {
                            AtomicReference<Object> atomicReference = c10.f43305a;
                            while (true) {
                                Object obj6 = atomicReference.get();
                                if (obj6 == null || obj6 == (lVar = B.f43304b)) {
                                    break;
                                }
                                D3.l lVar2 = B.f43303a;
                                if (obj6 != lVar2) {
                                    do {
                                        if (atomicReference.compareAndSet(obj6, lVar2)) {
                                            ((C2693i) obj6).resumeWith(p293xa.r.f47939a);
                                            break;
                                        }
                                    } while (atomicReference.get() == obj6);
                                } else {
                                    do {
                                        if (atomicReference.compareAndSet(obj6, lVar)) {
                                            break;
                                        }
                                    } while (atomicReference.get() == obj6);
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i10 = this.f43363f;
                    if (i10 == i12) {
                        this.f43363f = i12 + 1;
                        return true;
                    }
                    obj3 = this.f43388b;
                    p293xa.r rVar2 = p293xa.r.f47939a;
                }
                obj5 = obj3;
                i12 = i10;
            }
        }
    }

    @Override // kotlinx.coroutines.flow.q
    public final void setValue(T t8) {
        if (t8 == null) {
            t8 = (T) kotlinx.coroutines.flow.internal.n.f43403a;
        }
        k(null, t8);
    }
}
