package androidx.collection;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

/* JADX INFO: Add missing generic type declarations: [E] */
/* JADX INFO: compiled from: OrderedScatterSet.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.collection.MutableOrderedSetWrapper$iterator$1$iterator$1", f = "OrderedScatterSet.kt", l = {1489}, m = "invokeSuspend")
public final class MutableOrderedSetWrapper$iterator$1$iterator$1<E> extends RestrictedSuspendLambda implements Ia.p<kotlin.sequences.i<? super E>, kotlin.coroutines.c<? super p293xa.r>, Object> {
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ MutableOrderedSetWrapper<E> this$0;
    final /* synthetic */ MutableOrderedSetWrapper.AnonymousClass1 this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MutableOrderedSetWrapper$iterator$1$iterator$1(MutableOrderedSetWrapper<E> mutableOrderedSetWrapper, MutableOrderedSetWrapper.AnonymousClass1 anonymousClass1, kotlin.coroutines.c<? super MutableOrderedSetWrapper$iterator$1$iterator$1> cVar) {
        super(2, cVar);
        this.this$0 = mutableOrderedSetWrapper;
        this.this$1 = anonymousClass1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        MutableOrderedSetWrapper$iterator$1$iterator$1 mutableOrderedSetWrapper$iterator$1$iterator$1 = new MutableOrderedSetWrapper$iterator$1$iterator$1(this.this$0, this.this$1, cVar);
        mutableOrderedSetWrapper$iterator$1$iterator$1.L$0 = obj;
        return mutableOrderedSetWrapper$iterator$1$iterator$1;
    }

    @Override // Ia.p
    public final Object invoke(Object obj, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((MutableOrderedSetWrapper$iterator$1$iterator$1) create((kotlin.sequences.i) obj, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kotlin.sequences.i iVar;
        MutableOrderedSetWrapper<E> mutableOrderedSetWrapper;
        MutableOrderedSetWrapper.AnonymousClass1 anonymousClass1;
        long[] jArr;
        int i10;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = this.label;
        if (i11 == 0) {
            kotlin.b.b(obj);
            iVar = (kotlin.sequences.i) this.L$0;
            mutableOrderedSetWrapper = this.this$0;
            J<E> j = mutableOrderedSetWrapper.f9094c;
            anonymousClass1 = this.this$1;
            jArr = j.f9112c;
            i10 = j.f9114e;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i10 = this.I$0;
            jArr = (long[]) this.L$3;
            mutableOrderedSetWrapper = (MutableOrderedSetWrapper) this.L$2;
            anonymousClass1 = (MutableOrderedSetWrapper.AnonymousClass1) this.L$1;
            iVar = (kotlin.sequences.i) this.L$0;
            kotlin.b.b(obj);
        }
        if (i10 == Integer.MAX_VALUE) {
            return p293xa.r.f47939a;
        }
        int i12 = (int) ((jArr[i10] >> 31) & 2147483647L);
        anonymousClass1.f9095b = i10;
        Object obj2 = mutableOrderedSetWrapper.f9094c.f9111b[i10];
        this.L$0 = iVar;
        this.L$1 = anonymousClass1;
        this.L$2 = mutableOrderedSetWrapper;
        this.L$3 = jArr;
        this.I$0 = i12;
        this.label = 1;
        iVar.a(obj2, this);
        return coroutineSingletons;
    }
}
