package androidx.datastore.core;

import Ia.p;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: compiled from: SingleProcessDataStore.kt */
/* JADX INFO: loaded from: classes.dex */
public final class k implements h<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.sync.a f17062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ref$BooleanRef f17063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Ref$ObjectRef<Object> f17064c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j<Object> f17065d;

    public k(kotlinx.coroutines.sync.a aVar, Ref$BooleanRef ref$BooleanRef, Ref$ObjectRef<Object> ref$ObjectRef, j<Object> jVar) {
        this.f17062a = aVar;
        this.f17063b = ref$BooleanRef;
        this.f17064c = ref$ObjectRef;
        this.f17065d = jVar;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00b8 A[Catch: all -> 0x0054, TRY_LEAVE, TryCatch #0 {all -> 0x0054, blocks: (B:21:0x0050, B:36:0x00b0, B:38:0x00b8), top: B:53:0x0050 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00c6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:41:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.datastore.core.h
    public final Object a(p pVar, ContinuationImpl continuationImpl) throws Throwable {
        SingleProcessDataStore$readAndInit$api$1$updateData$1 singleProcessDataStore$readAndInit$api$1$updateData$1;
        kotlinx.coroutines.sync.a aVar;
        j<Object> jVar;
        Ref$BooleanRef ref$BooleanRef;
        Ref$ObjectRef<Object> ref$ObjectRef;
        kotlinx.coroutines.sync.a aVar2;
        kotlinx.coroutines.sync.a aVar3;
        j<Object> jVar2;
        T t8;
        Ref$ObjectRef<Object> ref$ObjectRef2;
        if (continuationImpl instanceof SingleProcessDataStore$readAndInit$api$1$updateData$1) {
            singleProcessDataStore$readAndInit$api$1$updateData$1 = (SingleProcessDataStore$readAndInit$api$1$updateData$1) continuationImpl;
            int i10 = singleProcessDataStore$readAndInit$api$1$updateData$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                singleProcessDataStore$readAndInit$api$1$updateData$1.label = i10 - Integer.MIN_VALUE;
            } else {
                singleProcessDataStore$readAndInit$api$1$updateData$1 = new SingleProcessDataStore$readAndInit$api$1$updateData$1(this, continuationImpl);
            }
        } else {
            singleProcessDataStore$readAndInit$api$1$updateData$1 = new SingleProcessDataStore$readAndInit$api$1$updateData$1(this, continuationImpl);
        }
        Object obj = singleProcessDataStore$readAndInit$api$1$updateData$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = singleProcessDataStore$readAndInit$api$1$updateData$1.label;
        try {
            if (i11 == 0) {
                kotlin.b.b(obj);
                singleProcessDataStore$readAndInit$api$1$updateData$1.L$0 = pVar;
                aVar = this.f17062a;
                singleProcessDataStore$readAndInit$api$1$updateData$1.L$1 = aVar;
                Ref$BooleanRef ref$BooleanRef2 = this.f17063b;
                singleProcessDataStore$readAndInit$api$1$updateData$1.L$2 = ref$BooleanRef2;
                Ref$ObjectRef<Object> ref$ObjectRef3 = this.f17064c;
                singleProcessDataStore$readAndInit$api$1$updateData$1.L$3 = ref$ObjectRef3;
                jVar = this.f17065d;
                singleProcessDataStore$readAndInit$api$1$updateData$1.L$4 = jVar;
                singleProcessDataStore$readAndInit$api$1$updateData$1.label = 1;
                if (aVar.f(null, singleProcessDataStore$readAndInit$api$1$updateData$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                ref$BooleanRef = ref$BooleanRef2;
                ref$ObjectRef = ref$ObjectRef3;
            } else {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Object obj2 = singleProcessDataStore$readAndInit$api$1$updateData$1.L$2;
                        ref$ObjectRef2 = (Ref$ObjectRef) singleProcessDataStore$readAndInit$api$1$updateData$1.L$1;
                        aVar2 = (kotlinx.coroutines.sync.a) singleProcessDataStore$readAndInit$api$1$updateData$1.L$0;
                        try {
                            kotlin.b.b(obj);
                            t8 = obj2;
                            ref$ObjectRef2.element = t8;
                            ref$ObjectRef = ref$ObjectRef2;
                            Object obj3 = ref$ObjectRef.element;
                            aVar2.g(null);
                            return obj3;
                        } catch (Throwable th) {
                            th = th;
                            aVar2.g(null);
                            throw th;
                        }
                    }
                    jVar2 = (j) singleProcessDataStore$readAndInit$api$1$updateData$1.L$2;
                    ref$ObjectRef = (Ref$ObjectRef) singleProcessDataStore$readAndInit$api$1$updateData$1.L$1;
                    aVar3 = (kotlinx.coroutines.sync.a) singleProcessDataStore$readAndInit$api$1$updateData$1.L$0;
                    try {
                        kotlin.b.b(obj);
                        if (kotlin.jvm.internal.i.a(obj, ref$ObjectRef.element)) {
                            aVar2 = aVar3;
                        } else {
                            singleProcessDataStore$readAndInit$api$1$updateData$1.L$0 = aVar3;
                            singleProcessDataStore$readAndInit$api$1$updateData$1.L$1 = ref$ObjectRef;
                            singleProcessDataStore$readAndInit$api$1$updateData$1.L$2 = obj;
                            singleProcessDataStore$readAndInit$api$1$updateData$1.label = 3;
                            if (jVar2.j(obj, singleProcessDataStore$readAndInit$api$1$updateData$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            t8 = obj;
                            ref$ObjectRef2 = ref$ObjectRef;
                            aVar2 = aVar3;
                            ref$ObjectRef2.element = t8;
                            ref$ObjectRef = ref$ObjectRef2;
                        }
                        Object obj4 = ref$ObjectRef.element;
                        aVar2.g(null);
                        return obj4;
                    } catch (Throwable th2) {
                        th = th2;
                        aVar2 = aVar3;
                        aVar2.g(null);
                        throw th;
                    }
                }
                j<Object> jVar3 = (j) singleProcessDataStore$readAndInit$api$1$updateData$1.L$4;
                ref$ObjectRef = (Ref$ObjectRef) singleProcessDataStore$readAndInit$api$1$updateData$1.L$3;
                ref$BooleanRef = (Ref$BooleanRef) singleProcessDataStore$readAndInit$api$1$updateData$1.L$2;
                kotlinx.coroutines.sync.a aVar4 = (kotlinx.coroutines.sync.a) singleProcessDataStore$readAndInit$api$1$updateData$1.L$1;
                p pVar2 = (p) singleProcessDataStore$readAndInit$api$1$updateData$1.L$0;
                kotlin.b.b(obj);
                aVar = aVar4;
                jVar = jVar3;
                pVar = pVar2;
            }
            if (ref$BooleanRef.element) {
                throw new IllegalStateException("InitializerApi.updateData should not be called after initialization is complete.");
            }
            Object obj5 = ref$ObjectRef.element;
            singleProcessDataStore$readAndInit$api$1$updateData$1.L$0 = aVar;
            singleProcessDataStore$readAndInit$api$1$updateData$1.L$1 = ref$ObjectRef;
            singleProcessDataStore$readAndInit$api$1$updateData$1.L$2 = jVar;
            singleProcessDataStore$readAndInit$api$1$updateData$1.L$3 = null;
            singleProcessDataStore$readAndInit$api$1$updateData$1.L$4 = null;
            singleProcessDataStore$readAndInit$api$1$updateData$1.label = 2;
            Object objInvoke = pVar.invoke(obj5, singleProcessDataStore$readAndInit$api$1$updateData$1);
            if (objInvoke == coroutineSingletons) {
                return coroutineSingletons;
            }
            aVar3 = aVar;
            obj = objInvoke;
            jVar2 = jVar;
            if (kotlin.jvm.internal.i.a(obj, ref$ObjectRef.element)) {
                singleProcessDataStore$readAndInit$api$1$updateData$1.L$0 = aVar3;
                singleProcessDataStore$readAndInit$api$1$updateData$1.L$1 = ref$ObjectRef;
                singleProcessDataStore$readAndInit$api$1$updateData$1.L$2 = obj;
                singleProcessDataStore$readAndInit$api$1$updateData$1.label = 3;
                if (jVar2.j(obj, singleProcessDataStore$readAndInit$api$1$updateData$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                t8 = obj;
                ref$ObjectRef2 = ref$ObjectRef;
                aVar2 = aVar3;
                ref$ObjectRef2.element = t8;
                ref$ObjectRef = ref$ObjectRef2;
            } else {
                aVar2 = aVar3;
            }
            Object obj6 = ref$ObjectRef.element;
            aVar2.g(null);
            return obj6;
        } catch (Throwable th3) {
            th = th3;
            aVar2 = aVar;
            aVar2.g(null);
            throw th;
        }
    }
}
