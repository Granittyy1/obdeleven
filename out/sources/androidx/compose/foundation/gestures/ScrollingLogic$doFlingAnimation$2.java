package androidx.compose.foundation.gestures;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$LongRef;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: Scrollable.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2", f = "Scrollable.kt", l = {814}, m = "invokeSuspend")
public final class ScrollingLogic$doFlingAnimation$2 extends SuspendLambda implements Ia.p<o, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ long $available;
    final /* synthetic */ Ref$LongRef $result;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ ScrollingLogic this$0;

    /* JADX INFO: compiled from: Scrollable.kt */
    public static final class a implements s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ScrollingLogic f9997a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ o f9998b;

        public a(o oVar, ScrollingLogic scrollingLogic) {
            this.f9997a = scrollingLogic;
            this.f9998b = oVar;
        }

        @Override // androidx.compose.foundation.gestures.s
        public final float f(float f10) {
            float fAbs = Math.abs(f10);
            ScrollingLogic scrollingLogic = this.f9997a;
            if (fAbs != 0.0f && ((f10 > 0.0f && !scrollingLogic.f9985a.d()) || ((f10 < 0.0f && !scrollingLogic.f9985a.c()) || !scrollingLogic.f9991g.invoke().booleanValue()))) {
                throw new FlingCancellationException();
            }
            return scrollingLogic.d(scrollingLogic.g(this.f9998b.b(2, scrollingLogic.e(scrollingLogic.h(f10)))));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollingLogic$doFlingAnimation$2(ScrollingLogic scrollingLogic, Ref$LongRef ref$LongRef, long j, kotlin.coroutines.c<? super ScrollingLogic$doFlingAnimation$2> cVar) {
        super(2, cVar);
        this.this$0 = scrollingLogic;
        this.$result = ref$LongRef;
        this.$available = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        ScrollingLogic$doFlingAnimation$2 scrollingLogic$doFlingAnimation$2 = new ScrollingLogic$doFlingAnimation$2(this.this$0, this.$result, this.$available, cVar);
        scrollingLogic$doFlingAnimation$2.L$0 = obj;
        return scrollingLogic$doFlingAnimation$2;
    }

    @Override // Ia.p
    public final Object invoke(o oVar, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((ScrollingLogic$doFlingAnimation$2) create(oVar, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ScrollingLogic scrollingLogic;
        Ref$LongRef ref$LongRef;
        ScrollingLogic scrollingLogic2;
        long j;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            o oVar = (o) this.L$0;
            scrollingLogic = this.this$0;
            a aVar = new a(oVar, scrollingLogic);
            ref$LongRef = this.$result;
            long j10 = this.$available;
            j jVar = scrollingLogic.f9987c;
            long j11 = ref$LongRef.element;
            float fD = scrollingLogic.d(scrollingLogic.f9988d == Orientation.f9958c ? p013b0.p.b(j10) : p013b0.p.c(j10));
            this.L$0 = scrollingLogic;
            this.L$1 = scrollingLogic;
            this.L$2 = ref$LongRef;
            this.J$0 = j11;
            this.label = 1;
            obj = jVar.a(aVar, fD, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            scrollingLogic2 = scrollingLogic;
            j = j11;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = this.J$0;
            ref$LongRef = (Ref$LongRef) this.L$2;
            scrollingLogic = (ScrollingLogic) this.L$1;
            scrollingLogic2 = (ScrollingLogic) this.L$0;
            kotlin.b.b(obj);
        }
        float fD2 = scrollingLogic2.d(((Number) obj).floatValue());
        ref$LongRef.element = scrollingLogic.f9988d == Orientation.f9958c ? p013b0.p.a(fD2, 0.0f, 2, j) : p013b0.p.a(0.0f, fD2, 1, j);
        return p293xa.r.f47939a;
    }
}
