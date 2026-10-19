package androidx.paging.compose;

import Ia.p;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.e;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.A;
import kotlinx.coroutines.C2680e;
import p293xa.r;

/* JADX INFO: compiled from: LazyPagingItems.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.paging.compose.LazyPagingItemsKt$collectAsLazyPagingItems$2$1", f = "LazyPagingItems.kt", l = {220, 222}, m = "invokeSuspend")
final class LazyPagingItemsKt$collectAsLazyPagingItems$2$1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
    final /* synthetic */ e $context;
    final /* synthetic */ b<Object> $lazyPagingItems;
    int label;

    /* JADX INFO: renamed from: androidx.paging.compose.LazyPagingItemsKt$collectAsLazyPagingItems$2$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: LazyPagingItems.kt */
    @Aa.c(c = "androidx.paging.compose.LazyPagingItemsKt$collectAsLazyPagingItems$2$1$1", f = "LazyPagingItems.kt", l = {223}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
        final /* synthetic */ b<Object> $lazyPagingItems;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(b<Object> bVar, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$lazyPagingItems = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return new AnonymousClass1(this.$lazyPagingItems, cVar);
        }

        @Override // Ia.p
        public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
            return ((AnonymousClass1) create(a10, cVar)).invokeSuspend(r.f47939a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.b.b(obj);
                b<Object> bVar = this.$lazyPagingItems;
                this.label = 1;
                if (bVar.a(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            return r.f47939a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyPagingItemsKt$collectAsLazyPagingItems$2$1(e eVar, b<Object> bVar, kotlin.coroutines.c<? super LazyPagingItemsKt$collectAsLazyPagingItems$2$1> cVar) {
        super(2, cVar);
        this.$context = eVar;
        this.$lazyPagingItems = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new LazyPagingItemsKt$collectAsLazyPagingItems$2$1(this.$context, this.$lazyPagingItems, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
        return ((LazyPagingItemsKt$collectAsLazyPagingItems$2$1) create(a10, cVar)).invokeSuspend(r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            if (i.a(this.$context, EmptyCoroutineContext.f43032b)) {
                b<Object> bVar = this.$lazyPagingItems;
                this.label = 1;
                if (bVar.a(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                e eVar = this.$context;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$lazyPagingItems, null);
                this.label = 2;
                if (C2680e.f(eVar, anonymousClass1, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            if (i10 != 1 && i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        return r.f47939a;
    }
}
