package androidx.paging;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC2686c;
import kotlinx.coroutines.flow.InterfaceC2687d;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: CachedPageEventFlow.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.paging.CachedPageEventFlow$job$1", f = "CachedPageEventFlow.kt", l = {R.styleable.AppCompatTheme_listDividerAlertDialog}, m = "invokeSuspend")
public final class CachedPageEventFlow$job$1 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ InterfaceC2686c<PageEvent<T>> $src;
    int label;
    final /* synthetic */ CachedPageEventFlow<T> this$0;

    /* JADX INFO: renamed from: androidx.paging.CachedPageEventFlow$job$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: CachedPageEventFlow.kt */
    public static final class AnonymousClass1<T> implements InterfaceC2687d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ CachedPageEventFlow<T> f19219b;

        public AnonymousClass1(CachedPageEventFlow<T> cachedPageEventFlow) {
            this.f19219b = cachedPageEventFlow;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.InterfaceC2687d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(kotlin.collections.s<? extends PageEvent<T>> sVar, kotlin.coroutines.c<? super p293xa.r> cVar) {
            CachedPageEventFlow$job$1$1$emit$1 cachedPageEventFlow$job$1$1$emit$1;
            AnonymousClass1<T> anonymousClass1;
            if (cVar instanceof CachedPageEventFlow$job$1$1$emit$1) {
                cachedPageEventFlow$job$1$1$emit$1 = (CachedPageEventFlow$job$1$1$emit$1) cVar;
                int i10 = cachedPageEventFlow$job$1$1$emit$1.label;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    cachedPageEventFlow$job$1$1$emit$1.label = i10 - Integer.MIN_VALUE;
                } else {
                    cachedPageEventFlow$job$1$1$emit$1 = new CachedPageEventFlow$job$1$1$emit$1(this, cVar);
                }
            } else {
                cachedPageEventFlow$job$1$1$emit$1 = new CachedPageEventFlow$job$1$1$emit$1(this, cVar);
            }
            Object obj = cachedPageEventFlow$job$1$1$emit$1.result;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i11 = cachedPageEventFlow$job$1$1$emit$1.label;
            if (i11 != 0) {
                if (i11 == 1) {
                    sVar = (kotlin.collections.s) cachedPageEventFlow$job$1$1$emit$1.L$1;
                    anonymousClass1 = (AnonymousClass1) cachedPageEventFlow$job$1$1$emit$1.L$0;
                    kotlin.b.b(obj);
                } else {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.b.b(obj);
                }
                return p293xa.r.f47939a;
            }
            kotlin.b.b(obj);
            kotlinx.coroutines.flow.v vVar = this.f19219b.f19213b;
            cachedPageEventFlow$job$1$1$emit$1.L$0 = this;
            cachedPageEventFlow$job$1$1$emit$1.L$1 = sVar;
            cachedPageEventFlow$job$1$1$emit$1.label = 1;
            if (vVar.emit(sVar, cachedPageEventFlow$job$1$1$emit$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            anonymousClass1 = this;
            C1430f<T> c1430f = anonymousClass1.f19219b.f19212a;
            cachedPageEventFlow$job$1$1$emit$1.L$0 = null;
            cachedPageEventFlow$job$1$1$emit$1.L$1 = null;
            cachedPageEventFlow$job$1$1$emit$1.label = 2;
            if (c1430f.b(sVar, cachedPageEventFlow$job$1$1$emit$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            return p293xa.r.f47939a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CachedPageEventFlow$job$1(InterfaceC2686c<? extends PageEvent<T>> interfaceC2686c, CachedPageEventFlow<T> cachedPageEventFlow, kotlin.coroutines.c<? super CachedPageEventFlow$job$1> cVar) {
        super(2, cVar);
        this.$src = interfaceC2686c;
        this.this$0 = cachedPageEventFlow;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new CachedPageEventFlow$job$1(this.$src, this.this$0, cVar);
    }

    @Override // Ia.p
    public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((CachedPageEventFlow$job$1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            kotlinx.coroutines.flow.n nVar = new kotlinx.coroutines.flow.n(this.$src);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0);
            this.label = 1;
            if (nVar.collect(anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        return p293xa.r.f47939a;
    }
}
