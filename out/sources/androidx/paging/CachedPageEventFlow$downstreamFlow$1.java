package androidx.paging;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$IntRef;
import kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.InterfaceC2687d;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: CachedPageEventFlow.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.paging.CachedPageEventFlow$downstreamFlow$1", f = "CachedPageEventFlow.kt", l = {R.styleable.AppCompatTheme_textAppearanceLargePopupMenu}, m = "invokeSuspend")
public final class CachedPageEventFlow$downstreamFlow$1<T> extends SuspendLambda implements Ia.p<InterfaceC2687d<? super PageEvent<T>>, kotlin.coroutines.c<? super p293xa.r>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CachedPageEventFlow<T> this$0;

    /* JADX INFO: renamed from: androidx.paging.CachedPageEventFlow$downstreamFlow$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: CachedPageEventFlow.kt */
    @Aa.c(c = "androidx.paging.CachedPageEventFlow$downstreamFlow$1$1", f = "CachedPageEventFlow.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements Ia.p<kotlin.collections.s<? extends PageEvent<T>>, kotlin.coroutines.c<? super Boolean>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public AnonymousClass1() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(2, cVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // Ia.p
        public final Object invoke(Object obj, kotlin.coroutines.c<? super Boolean> cVar) {
            return ((AnonymousClass1) create((kotlin.collections.s) obj, cVar)).invokeSuspend(p293xa.r.f47939a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            return Boolean.valueOf(((kotlin.collections.s) this.L$0) != null);
        }
    }

    /* JADX INFO: renamed from: androidx.paging.CachedPageEventFlow$downstreamFlow$1$2, reason: invalid class name */
    /* JADX INFO: compiled from: CachedPageEventFlow.kt */
    public static final class AnonymousClass2<T> implements InterfaceC2687d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Ref$IntRef f19217b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2687d<PageEvent<T>> f19218c;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(Ref$IntRef ref$IntRef, InterfaceC2687d<? super PageEvent<T>> interfaceC2687d) {
            this.f19217b = ref$IntRef;
            this.f19218c = interfaceC2687d;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // kotlinx.coroutines.flow.InterfaceC2687d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(kotlin.collections.s<? extends PageEvent<T>> sVar, kotlin.coroutines.c<? super p293xa.r> cVar) {
            CachedPageEventFlow$downstreamFlow$1$2$emit$1 cachedPageEventFlow$downstreamFlow$1$2$emit$1;
            AnonymousClass2<T> anonymousClass2;
            if (cVar instanceof CachedPageEventFlow$downstreamFlow$1$2$emit$1) {
                cachedPageEventFlow$downstreamFlow$1$2$emit$1 = (CachedPageEventFlow$downstreamFlow$1$2$emit$1) cVar;
                int i10 = cachedPageEventFlow$downstreamFlow$1$2$emit$1.label;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    cachedPageEventFlow$downstreamFlow$1$2$emit$1.label = i10 - Integer.MIN_VALUE;
                } else {
                    cachedPageEventFlow$downstreamFlow$1$2$emit$1 = new CachedPageEventFlow$downstreamFlow$1$2$emit$1(this, cVar);
                }
            } else {
                cachedPageEventFlow$downstreamFlow$1$2$emit$1 = new CachedPageEventFlow$downstreamFlow$1$2$emit$1(this, cVar);
            }
            Object obj = cachedPageEventFlow$downstreamFlow$1$2$emit$1.result;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i11 = cachedPageEventFlow$downstreamFlow$1$2$emit$1.label;
            if (i11 == 0) {
                kotlin.b.b(obj);
                kotlin.jvm.internal.i.b(sVar);
                if (sVar.f43022a > this.f19217b.element) {
                    cachedPageEventFlow$downstreamFlow$1$2$emit$1.L$0 = this;
                    cachedPageEventFlow$downstreamFlow$1$2$emit$1.L$1 = sVar;
                    cachedPageEventFlow$downstreamFlow$1$2$emit$1.label = 1;
                    if (this.f19218c.emit((PageEvent<T>) sVar.f43023b, cachedPageEventFlow$downstreamFlow$1$2$emit$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    anonymousClass2 = this;
                }
                return p293xa.r.f47939a;
            }
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sVar = (kotlin.collections.s) cachedPageEventFlow$downstreamFlow$1$2$emit$1.L$1;
            anonymousClass2 = (AnonymousClass2) cachedPageEventFlow$downstreamFlow$1$2$emit$1.L$0;
            kotlin.b.b(obj);
            anonymousClass2.f19217b.element = sVar.f43022a;
            return p293xa.r.f47939a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CachedPageEventFlow$downstreamFlow$1(CachedPageEventFlow<T> cachedPageEventFlow, kotlin.coroutines.c<? super CachedPageEventFlow$downstreamFlow$1> cVar) {
        super(2, cVar);
        this.this$0 = cachedPageEventFlow;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        CachedPageEventFlow$downstreamFlow$1 cachedPageEventFlow$downstreamFlow$1 = new CachedPageEventFlow$downstreamFlow$1(this.this$0, cVar);
        cachedPageEventFlow$downstreamFlow$1.L$0 = obj;
        return cachedPageEventFlow$downstreamFlow$1;
    }

    @Override // Ia.p
    public final Object invoke(Object obj, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((CachedPageEventFlow$downstreamFlow$1) create((InterfaceC2687d) obj, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            InterfaceC2687d interfaceC2687d = (InterfaceC2687d) this.L$0;
            Ref$IntRef ref$IntRef = new Ref$IntRef();
            ref$IntRef.element = Integer.MIN_VALUE;
            FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1 flowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1 = new FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1(this.this$0.f19214c, new AnonymousClass1(2, null));
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(ref$IntRef, interfaceC2687d);
            this.label = 1;
            if (flowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1.collect(anonymousClass2, this) == coroutineSingletons) {
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
