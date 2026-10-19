package androidx.paging;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.C2706p;
import kotlinx.coroutines.InterfaceC2705o;
import kotlinx.coroutines.sync.MutexImpl;

/* JADX INFO: compiled from: FlowExt.kt */
/* JADX INFO: loaded from: classes.dex */
public final class H<T1, T2> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1.AnonymousClass1 f19241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C2706p f19242b = I.e.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MutexImpl f19243c = kotlinx.coroutines.sync.b.a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC2705o<p293xa.r>[] f19244d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object[] f19245e;

    public H(PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1.AnonymousClass1 anonymousClass1) {
        this.f19241a = anonymousClass1;
        InterfaceC2705o<p293xa.r>[] interfaceC2705oArr = new InterfaceC2705o[2];
        for (int i10 = 0; i10 < 2; i10++) {
            interfaceC2705oArr[i10] = I.e.a();
        }
        this.f19244d = interfaceC2705oArr;
        Object[] objArr = new Object[2];
        for (int i11 = 0; i11 < 2; i11++) {
            objArr[i11] = FlowExtKt.f19234a;
        }
        this.f19245e = objArr;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00b0 A[Catch: all -> 0x00b8, TRY_ENTER, TryCatch #0 {all -> 0x00b8, blocks: (B:34:0x00a7, B:38:0x00b0, B:45:0x00bc, B:47:0x00c2, B:50:0x00c8, B:52:0x00cc, B:56:0x00d6, B:54:0x00d1, B:55:0x00d4, B:41:0x00b6), top: B:66:0x00a7 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00b6 A[Catch: all -> 0x00b8, LOOP:0: B:36:0x00ac->B:41:0x00b6, LOOP_END, TryCatch #0 {all -> 0x00b8, blocks: (B:34:0x00a7, B:38:0x00b0, B:45:0x00bc, B:47:0x00c2, B:50:0x00c8, B:52:0x00cc, B:56:0x00d6, B:54:0x00d1, B:55:0x00d4, B:41:0x00b6), top: B:66:0x00a7 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00c2 A[Catch: all -> 0x00b8, TryCatch #0 {all -> 0x00b8, blocks: (B:34:0x00a7, B:38:0x00b0, B:45:0x00bc, B:47:0x00c2, B:50:0x00c8, B:52:0x00cc, B:56:0x00d6, B:54:0x00d1, B:55:0x00d4, B:41:0x00b6), top: B:66:0x00a7 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00c8 A[Catch: all -> 0x00b8, LOOP:1: B:46:0x00c0->B:50:0x00c8, LOOP_END, TryCatch #0 {all -> 0x00b8, blocks: (B:34:0x00a7, B:38:0x00b0, B:45:0x00bc, B:47:0x00c2, B:50:0x00c8, B:52:0x00cc, B:56:0x00d6, B:54:0x00d1, B:55:0x00d4, B:41:0x00b6), top: B:66:0x00a7 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00cc A[Catch: all -> 0x00b8, TryCatch #0 {all -> 0x00b8, blocks: (B:34:0x00a7, B:38:0x00b0, B:45:0x00bc, B:47:0x00c2, B:50:0x00c8, B:52:0x00cc, B:56:0x00d6, B:54:0x00d1, B:55:0x00d4, B:41:0x00b6), top: B:66:0x00a7 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00cf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x00d1 A[Catch: all -> 0x00b8, TryCatch #0 {all -> 0x00b8, blocks: (B:34:0x00a7, B:38:0x00b0, B:45:0x00bc, B:47:0x00c2, B:50:0x00c8, B:52:0x00cc, B:56:0x00d6, B:54:0x00d1, B:55:0x00d4, B:41:0x00b6), top: B:66:0x00a7 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x00d4 A[Catch: all -> 0x00b8, TryCatch #0 {all -> 0x00b8, blocks: (B:34:0x00a7, B:38:0x00b0, B:45:0x00bc, B:47:0x00c2, B:50:0x00c8, B:52:0x00cc, B:56:0x00d6, B:54:0x00d1, B:55:0x00d4, B:41:0x00b6), top: B:66:0x00a7 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x00ea A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:59:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x00b4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x00c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x00ca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object a(int i10, Object obj, ContinuationImpl continuationImpl) throws Throwable {
        UnbatchedFlowCombiner$onNext$1 unbatchedFlowCombiner$onNext$1;
        Object obj2;
        H<T1, T2> h8;
        Object obj3;
        kotlinx.coroutines.sync.a aVar;
        int i11;
        H<T1, T2> h10;
        kotlinx.coroutines.sync.a aVar2;
        Object[] objArr;
        int length;
        int i12;
        Object obj4;
        boolean z10;
        int length2;
        int i13;
        CombineSource combineSource;
        PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1.AnonymousClass1 anonymousClass1;
        Object obj5;
        Object obj6;
        int i14 = i10;
        if (continuationImpl instanceof UnbatchedFlowCombiner$onNext$1) {
            unbatchedFlowCombiner$onNext$1 = (UnbatchedFlowCombiner$onNext$1) continuationImpl;
            int i15 = unbatchedFlowCombiner$onNext$1.label;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                unbatchedFlowCombiner$onNext$1.label = i15 - Integer.MIN_VALUE;
            } else {
                unbatchedFlowCombiner$onNext$1 = new UnbatchedFlowCombiner$onNext$1(this, continuationImpl);
            }
        } else {
            unbatchedFlowCombiner$onNext$1 = new UnbatchedFlowCombiner$onNext$1(this, continuationImpl);
        }
        Object obj7 = unbatchedFlowCombiner$onNext$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i16 = unbatchedFlowCombiner$onNext$1.label;
        if (i16 == 0) {
            kotlin.b.b(obj7);
            InterfaceC2705o<p293xa.r>[] interfaceC2705oArr = this.f19244d;
            if (interfaceC2705oArr[i14].I0()) {
                unbatchedFlowCombiner$onNext$1.L$0 = this;
                obj2 = obj;
                unbatchedFlowCombiner$onNext$1.L$1 = obj2;
                unbatchedFlowCombiner$onNext$1.I$0 = i14;
                unbatchedFlowCombiner$onNext$1.label = 1;
                if (this.f19242b.D(unbatchedFlowCombiner$onNext$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                obj2 = obj;
                interfaceC2705oArr[i14].r0(p293xa.r.f47939a);
            }
            h8 = this;
        } else {
            if (i16 != 1) {
                if (i16 != 2) {
                    if (i16 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar2 = (kotlinx.coroutines.sync.a) unbatchedFlowCombiner$onNext$1.L$1;
                    h10 = (H) unbatchedFlowCombiner$onNext$1.L$0;
                    try {
                        kotlin.b.b(obj7);
                        h10.f19242b.c0(p293xa.r.f47939a);
                        p293xa.r rVar = p293xa.r.f47939a;
                        aVar2.g(null);
                        return p293xa.r.f47939a;
                    } catch (Throwable th) {
                        th = th;
                        aVar2.g(null);
                        throw th;
                    }
                }
                i14 = unbatchedFlowCombiner$onNext$1.I$0;
                aVar = (kotlinx.coroutines.sync.a) unbatchedFlowCombiner$onNext$1.L$2;
                obj3 = unbatchedFlowCombiner$onNext$1.L$1;
                h8 = (H) unbatchedFlowCombiner$onNext$1.L$0;
                kotlin.b.b(obj7);
                i11 = i14;
                h10 = h8;
                try {
                    objArr = h10.f19245e;
                    length = objArr.length;
                    i12 = 0;
                    while (true) {
                        obj4 = FlowExtKt.f19234a;
                        if (i12 < length) {
                            z10 = false;
                            break;
                        }
                        if (objArr[i12] == obj4) {
                            z10 = true;
                            break;
                        }
                        i12++;
                    }
                    objArr[i11] = obj3;
                    length2 = objArr.length;
                    i13 = 0;
                    while (true) {
                        if (i13 < length2) {
                            if (z10) {
                                combineSource = CombineSource.f19222b;
                            } else if (i11 == 0) {
                                combineSource = CombineSource.f19223c;
                            } else {
                                combineSource = CombineSource.f19224d;
                            }
                            anonymousClass1 = h10.f19241a;
                            obj5 = objArr[0];
                            obj6 = objArr[1];
                            unbatchedFlowCombiner$onNext$1.L$0 = h10;
                            unbatchedFlowCombiner$onNext$1.L$1 = aVar;
                            unbatchedFlowCombiner$onNext$1.L$2 = null;
                            unbatchedFlowCombiner$onNext$1.label = 3;
                            if (anonymousClass1.invoke(obj5, obj6, combineSource, unbatchedFlowCombiner$onNext$1) == coroutineSingletons) {
                                aVar2 = aVar;
                                h10.f19242b.c0(p293xa.r.f47939a);
                                break;
                            }
                            return coroutineSingletons;
                        }
                        if (objArr[i13] == obj4) {
                            aVar2 = aVar;
                            break;
                        }
                        i13++;
                    }
                    p293xa.r rVar2 = p293xa.r.f47939a;
                    aVar2.g(null);
                    return p293xa.r.f47939a;
                } catch (Throwable th2) {
                    th = th2;
                    aVar2 = aVar;
                    aVar2.g(null);
                    throw th;
                }
            }
            i14 = unbatchedFlowCombiner$onNext$1.I$0;
            obj2 = unbatchedFlowCombiner$onNext$1.L$1;
            h8 = (H) unbatchedFlowCombiner$onNext$1.L$0;
            kotlin.b.b(obj7);
        }
        MutexImpl mutexImpl = h8.f19243c;
        unbatchedFlowCombiner$onNext$1.L$0 = h8;
        unbatchedFlowCombiner$onNext$1.L$1 = obj2;
        unbatchedFlowCombiner$onNext$1.L$2 = mutexImpl;
        unbatchedFlowCombiner$onNext$1.I$0 = i14;
        unbatchedFlowCombiner$onNext$1.label = 2;
        if (mutexImpl.f(null, unbatchedFlowCombiner$onNext$1) == coroutineSingletons) {
            return coroutineSingletons;
        }
        obj3 = obj2;
        aVar = mutexImpl;
        i11 = i14;
        h10 = h8;
        objArr = h10.f19245e;
        length = objArr.length;
        i12 = 0;
        while (true) {
            obj4 = FlowExtKt.f19234a;
            if (i12 < length) {
                z10 = false;
                break;
            }
            if (objArr[i12] == obj4) {
                z10 = true;
                break;
            }
            i12++;
        }
        objArr[i11] = obj3;
        length2 = objArr.length;
        i13 = 0;
        while (true) {
            if (i13 < length2) {
                if (z10) {
                    combineSource = CombineSource.f19222b;
                } else if (i11 == 0) {
                    combineSource = CombineSource.f19223c;
                } else {
                    combineSource = CombineSource.f19224d;
                }
                anonymousClass1 = h10.f19241a;
                obj5 = objArr[0];
                obj6 = objArr[1];
                unbatchedFlowCombiner$onNext$1.L$0 = h10;
                unbatchedFlowCombiner$onNext$1.L$1 = aVar;
                unbatchedFlowCombiner$onNext$1.L$2 = null;
                unbatchedFlowCombiner$onNext$1.label = 3;
                if (anonymousClass1.invoke(obj5, obj6, combineSource, unbatchedFlowCombiner$onNext$1) == coroutineSingletons) {
                    aVar2 = aVar;
                    h10.f19242b.c0(p293xa.r.f47939a);
                    break;
                }
                return coroutineSingletons;
            }
            if (objArr[i13] == obj4) {
                aVar2 = aVar;
                break;
            }
            i13++;
        }
        p293xa.r rVar3 = p293xa.r.f47939a;
        aVar2.g(null);
        return p293xa.r.f47939a;
    }
}
