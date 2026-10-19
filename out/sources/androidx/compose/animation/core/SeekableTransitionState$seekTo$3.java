package androidx.compose.animation.core;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C2680e;

/* JADX INFO: compiled from: Transition.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.compose.animation.core.SeekableTransitionState$seekTo$3", f = "Transition.kt", l = {488}, m = "invokeSuspend")
final class SeekableTransitionState$seekTo$3 extends SuspendLambda implements Ia.l<kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ float $fraction;
    final /* synthetic */ Object $oldTargetState;
    final /* synthetic */ Object $targetState;
    final /* synthetic */ Transition<Object> $transition;
    int label;
    final /* synthetic */ SeekableTransitionState<Object> this$0;

    /* JADX INFO: renamed from: androidx.compose.animation.core.SeekableTransitionState$seekTo$3$1, reason: invalid class name */
    /* JADX INFO: compiled from: Transition.kt */
    @Aa.c(c = "androidx.compose.animation.core.SeekableTransitionState$seekTo$3$1", f = "Transition.kt", l = {510}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
        final /* synthetic */ float $fraction;
        final /* synthetic */ Object $oldTargetState;
        final /* synthetic */ Object $targetState;
        final /* synthetic */ Transition<Object> $transition;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ SeekableTransitionState<Object> this$0;

        /* JADX INFO: renamed from: androidx.compose.animation.core.SeekableTransitionState$seekTo$3$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: Transition.kt */
        @Aa.c(c = "androidx.compose.animation.core.SeekableTransitionState$seekTo$3$1$1", f = "Transition.kt", l = {506}, m = "invokeSuspend")
        public static final class C01201 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
            int label;
            final /* synthetic */ SeekableTransitionState<Object> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C01201(SeekableTransitionState<Object> seekableTransitionState, kotlin.coroutines.c<? super C01201> cVar) {
                super(2, cVar);
                this.this$0 = seekableTransitionState;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
                return new C01201(this.this$0, cVar);
            }

            @Override // Ia.p
            public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
                return ((C01201) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
                int i10 = this.label;
                if (i10 == 0) {
                    kotlin.b.b(obj);
                    SeekableTransitionState<Object> seekableTransitionState = this.this$0;
                    this.label = 1;
                    if (SeekableTransitionState.h(seekableTransitionState, this) == coroutineSingletons) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Object obj, Object obj2, SeekableTransitionState<Object> seekableTransitionState, Transition<Object> transition, float f10, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$targetState = obj;
            this.$oldTargetState = obj2;
            this.this$0 = seekableTransitionState;
            this.$transition = transition;
            this.$fraction = f10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$targetState, this.$oldTargetState, this.this$0, this.$transition, this.$fraction, cVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // Ia.p
        public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
            return ((AnonymousClass1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.b.b(obj);
                kotlinx.coroutines.A a10 = (kotlinx.coroutines.A) this.L$0;
                if (kotlin.jvm.internal.i.a(this.$targetState, this.$oldTargetState)) {
                    SeekableTransitionState<Object> seekableTransitionState = this.this$0;
                    seekableTransitionState.f9416n = null;
                    if (kotlin.jvm.internal.i.a(seekableTransitionState.f9406c.getValue(), this.$targetState)) {
                        return p293xa.r.f47939a;
                    }
                } else {
                    SeekableTransitionState.f(this.this$0);
                }
                if (!kotlin.jvm.internal.i.a(this.$targetState, this.$oldTargetState)) {
                    this.$transition.p(this.$targetState);
                    this.$transition.n(0L);
                    SeekableTransitionState<Object> seekableTransitionState2 = this.this$0;
                    seekableTransitionState2.f9405b.setValue(this.$targetState);
                    this.$transition.j(this.$fraction);
                }
                SeekableTransitionState<Object> seekableTransitionState3 = this.this$0;
                float f10 = this.$fraction;
                C0909i c0909i = SeekableTransitionState.f9403r;
                seekableTransitionState3.p(f10);
                if (this.this$0.f9415m.e()) {
                    C2680e.c(a10, null, null, new C01201(this.this$0, null), 3);
                } else {
                    this.this$0.f9414l = Long.MIN_VALUE;
                }
                SeekableTransitionState<Object> seekableTransitionState4 = this.this$0;
                this.label = 1;
                if (SeekableTransitionState.j(seekableTransitionState4, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            SeekableTransitionState<Object> seekableTransitionState5 = this.this$0;
            C0909i c0909i2 = SeekableTransitionState.f9403r;
            seekableTransitionState5.o();
            return p293xa.r.f47939a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SeekableTransitionState$seekTo$3(Object obj, Object obj2, SeekableTransitionState<Object> seekableTransitionState, Transition<Object> transition, float f10, kotlin.coroutines.c<? super SeekableTransitionState$seekTo$3> cVar) {
        super(1, cVar);
        this.$targetState = obj;
        this.$oldTargetState = obj2;
        this.this$0 = seekableTransitionState;
        this.$transition = transition;
        this.$fraction = f10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(kotlin.coroutines.c<?> cVar) {
        return new SeekableTransitionState$seekTo$3(this.$targetState, this.$oldTargetState, this.this$0, this.$transition, this.$fraction, cVar);
    }

    @Override // Ia.l
    public final Object invoke(kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((SeekableTransitionState$seekTo$3) create(cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$targetState, this.$oldTargetState, this.this$0, this.$transition, this.$fraction, null);
            this.label = 1;
            if (kotlinx.coroutines.B.d(anonymousClass1, this) == coroutineSingletons) {
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
