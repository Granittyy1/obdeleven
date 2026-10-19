package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: Scrollable.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.compose.foundation.gestures.ScrollingLogic$onScrollStopped$performFling$1", f = "Scrollable.kt", l = {748, 751, 754}, m = "invokeSuspend")
final class ScrollingLogic$onScrollStopped$performFling$1 extends SuspendLambda implements Ia.p<p013b0.p, kotlin.coroutines.c<? super p013b0.p>, Object> {
    /* synthetic */ long J$0;
    long J$1;
    int label;
    final /* synthetic */ ScrollingLogic this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollingLogic$onScrollStopped$performFling$1(ScrollingLogic scrollingLogic, kotlin.coroutines.c<? super ScrollingLogic$onScrollStopped$performFling$1> cVar) {
        super(2, cVar);
        this.this$0 = scrollingLogic;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        ScrollingLogic$onScrollStopped$performFling$1 scrollingLogic$onScrollStopped$performFling$1 = new ScrollingLogic$onScrollStopped$performFling$1(this.this$0, cVar);
        scrollingLogic$onScrollStopped$performFling$1.J$0 = ((p013b0.p) obj).f20496a;
        return scrollingLogic$onScrollStopped$performFling$1;
    }

    @Override // Ia.p
    public final Object invoke(p013b0.p pVar, kotlin.coroutines.c<? super p013b0.p> cVar) {
        long j = pVar.f20496a;
        ScrollingLogic$onScrollStopped$performFling$1 scrollingLogic$onScrollStopped$performFling$1 = new ScrollingLogic$onScrollStopped$performFling$1(this.this$0, cVar);
        scrollingLogic$onScrollStopped$performFling$1.J$0 = j;
        return scrollingLogic$onScrollStopped$performFling$1.invokeSuspend(p293xa.r.f47939a);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x007d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:23:0x007e  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objB;
        long j;
        Object objB2;
        long j10;
        long j11;
        long j12;
        Object objA;
        long j13;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                j = this.J$0;
                kotlin.b.b(obj);
                objB = obj;
            } else if (i10 == 2) {
                j10 = this.J$1;
                long j14 = this.J$0;
                kotlin.b.b(obj);
                objB2 = obj;
                j11 = j14;
                j12 = ((p013b0.p) objB2).f20496a;
                NestedScrollDispatcher nestedScrollDispatcher = this.this$0.f9990f;
                long jD = p013b0.p.d(j10, j12);
                this.J$0 = j11;
                this.J$1 = j12;
                this.label = 3;
                objA = nestedScrollDispatcher.a(jD, j12, this);
                if (objA == coroutineSingletons) {
                    return coroutineSingletons;
                }
                j13 = j11;
            } else {
                if (i10 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                long j15 = this.J$1;
                j13 = this.J$0;
                kotlin.b.b(obj);
                j12 = j15;
                objA = obj;
            }
            return new p013b0.p(p013b0.p.d(j13, p013b0.p.d(j12, ((p013b0.p) objA).f20496a)));
        }
        kotlin.b.b(obj);
        long j16 = this.J$0;
        NestedScrollDispatcher nestedScrollDispatcher2 = this.this$0.f9990f;
        this.J$0 = j16;
        this.label = 1;
        objB = nestedScrollDispatcher2.b(j16, this);
        if (objB == coroutineSingletons) {
            return coroutineSingletons;
        }
        j = j16;
        long jD2 = p013b0.p.d(j, ((p013b0.p) objB).f20496a);
        ScrollingLogic scrollingLogic = this.this$0;
        this.J$0 = j;
        this.J$1 = jD2;
        this.label = 2;
        objB2 = scrollingLogic.b(jD2, this);
        if (objB2 == coroutineSingletons) {
            return coroutineSingletons;
        }
        j10 = jD2;
        j11 = j;
        j12 = ((p013b0.p) objB2).f20496a;
        NestedScrollDispatcher nestedScrollDispatcher3 = this.this$0.f9990f;
        long jD3 = p013b0.p.d(j10, j12);
        this.J$0 = j11;
        this.J$1 = j12;
        this.label = 3;
        objA = nestedScrollDispatcher3.a(jD3, j12, this);
        if (objA == coroutineSingletons) {
            return coroutineSingletons;
        }
        j13 = j11;
        return new p013b0.p(p013b0.p.d(j13, p013b0.p.d(j12, ((p013b0.p) objA).f20496a)));
    }
}
