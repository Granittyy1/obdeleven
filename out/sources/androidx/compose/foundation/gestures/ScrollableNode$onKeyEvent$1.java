package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;

/* JADX INFO: compiled from: Scrollable.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.compose.foundation.gestures.ScrollableNode$onKeyEvent$1", f = "Scrollable.kt", l = {475}, m = "invokeSuspend")
public final class ScrollableNode$onKeyEvent$1 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ long $scrollAmount;
    int label;
    final /* synthetic */ ScrollableNode this$0;

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.ScrollableNode$onKeyEvent$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: Scrollable.kt */
    @Aa.c(c = "androidx.compose.foundation.gestures.ScrollableNode$onKeyEvent$1$1", f = "Scrollable.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements Ia.p<o, kotlin.coroutines.c<? super p293xa.r>, Object> {
        final /* synthetic */ long $scrollAmount;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(long j, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$scrollAmount = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$scrollAmount, cVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // Ia.p
        public final Object invoke(o oVar, kotlin.coroutines.c<? super p293xa.r> cVar) {
            return ((AnonymousClass1) create(oVar, cVar)).invokeSuspend(p293xa.r.f47939a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            ((o) this.L$0).a(this.$scrollAmount);
            return p293xa.r.f47939a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollableNode$onKeyEvent$1(ScrollableNode scrollableNode, long j, kotlin.coroutines.c<? super ScrollableNode$onKeyEvent$1> cVar) {
        super(2, cVar);
        this.this$0 = scrollableNode;
        this.$scrollAmount = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new ScrollableNode$onKeyEvent$1(this.this$0, this.$scrollAmount, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((ScrollableNode$onKeyEvent$1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            ScrollingLogic scrollingLogic = this.this$0.f9978E;
            MutatePriority mutatePriority = MutatePriority.f9811c;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$scrollAmount, null);
            this.label = 1;
            if (scrollingLogic.f(mutatePriority, anonymousClass1, this) == coroutineSingletons) {
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
