package kotlinx.coroutines;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: compiled from: Timeout.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class G0 {
    public static final <U, T extends U> Object a(F0<U, ? super T> f10, Ia.p<? super A, ? super kotlin.coroutines.c<? super T>, ? extends Object> pVar) throws Throwable {
        Object c2708s;
        Object objD0;
        C2702l0.g(f10, false, new S(I.c(f10.f43502e.getContext()).m0(f10.f43179f, f10, f10.f43222d)), 3);
        try {
            if (pVar instanceof BaseContinuationImpl) {
                kotlin.jvm.internal.o.d(2, pVar);
                c2708s = pVar.invoke(f10, f10);
            } else {
                c2708s = A8.p.H(pVar, f10, f10);
            }
        } catch (Throwable th) {
            c2708s = new C2708s(th, false);
        }
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        if (c2708s == coroutineSingletons || (objD0 = f10.d0(c2708s)) == o0.f43518b) {
            return coroutineSingletons;
        }
        if (objD0 instanceof C2708s) {
            Throwable th2 = ((C2708s) objD0).f43531a;
            if (!(th2 instanceof TimeoutCancellationException) || ((TimeoutCancellationException) th2).f43205b != f10) {
                throw th2;
            }
            if (c2708s instanceof C2708s) {
                throw ((C2708s) c2708s).f43531a;
            }
        } else {
            c2708s = o0.a(objD0);
        }
        return c2708s;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0068 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:31:0x0069  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, kotlinx.coroutines.F0] */
    public static final Object b(long j, Ia.p pVar, ContinuationImpl continuationImpl) throws Throwable {
        TimeoutKt$withTimeoutOrNull$1 timeoutKt$withTimeoutOrNull$1;
        Ref$ObjectRef ref$ObjectRef;
        if (continuationImpl instanceof TimeoutKt$withTimeoutOrNull$1) {
            timeoutKt$withTimeoutOrNull$1 = (TimeoutKt$withTimeoutOrNull$1) continuationImpl;
            int i10 = timeoutKt$withTimeoutOrNull$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                timeoutKt$withTimeoutOrNull$1.label = i10 - Integer.MIN_VALUE;
            } else {
                timeoutKt$withTimeoutOrNull$1 = new TimeoutKt$withTimeoutOrNull$1(continuationImpl);
            }
        } else {
            timeoutKt$withTimeoutOrNull$1 = new TimeoutKt$withTimeoutOrNull$1(continuationImpl);
        }
        Object objA = timeoutKt$withTimeoutOrNull$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = timeoutKt$withTimeoutOrNull$1.label;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ref$ObjectRef = (Ref$ObjectRef) timeoutKt$withTimeoutOrNull$1.L$1;
            try {
                kotlin.b.b(objA);
            } catch (TimeoutCancellationException e10) {
                e = e10;
                if (e.f43205b == ref$ObjectRef.element) {
                    return null;
                }
                throw e;
            }
        }
        kotlin.b.b(objA);
        if (j <= 0) {
            return null;
        }
        Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
        try {
            timeoutKt$withTimeoutOrNull$1.L$0 = pVar;
            timeoutKt$withTimeoutOrNull$1.L$1 = ref$ObjectRef2;
            timeoutKt$withTimeoutOrNull$1.J$0 = j;
            timeoutKt$withTimeoutOrNull$1.label = 1;
            ?? f10 = new F0(j, timeoutKt$withTimeoutOrNull$1);
            ref$ObjectRef2.element = f10;
            objA = a(f10, pVar);
            return objA == coroutineSingletons ? coroutineSingletons : objA;
        } catch (TimeoutCancellationException e11) {
            e = e11;
            ref$ObjectRef = ref$ObjectRef2;
            if (e.f43205b == ref$ObjectRef.element) {
                return null;
            }
            throw e;
        }
    }
}
