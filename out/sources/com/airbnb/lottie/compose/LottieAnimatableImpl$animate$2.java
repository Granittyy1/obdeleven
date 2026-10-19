package com.airbnb.lottie.compose;

import Ia.l;
import Ia.p;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.C2702l0;
import kotlinx.coroutines.InterfaceC2694i0;
import kotlinx.coroutines.s0;
import p293xa.r;

/* JADX INFO: compiled from: LottieAnimatable.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "com.airbnb.lottie.compose.LottieAnimatableImpl$animate$2", f = "LottieAnimatable.kt", l = {269}, m = "invokeSuspend")
final class LottieAnimatableImpl$animate$2 extends SuspendLambda implements l<kotlin.coroutines.c<? super r>, Object> {
    final /* synthetic */ LottieCancellationBehavior $cancellationBehavior;
    final /* synthetic */ c $clipSpec;
    final /* synthetic */ p079g3.b $composition;
    final /* synthetic */ boolean $continueFromPreviousAnimate;
    final /* synthetic */ float $initialProgress;
    final /* synthetic */ int $iteration;
    final /* synthetic */ int $iterations;
    final /* synthetic */ boolean $reverseOnRepeat;
    final /* synthetic */ float $speed;
    final /* synthetic */ boolean $useCompositionFrameRate;
    int label;
    final /* synthetic */ LottieAnimatableImpl this$0;

    /* JADX INFO: renamed from: com.airbnb.lottie.compose.LottieAnimatableImpl$animate$2$1, reason: invalid class name */
    /* JADX INFO: compiled from: LottieAnimatable.kt */
    @Aa.c(c = "com.airbnb.lottie.compose.LottieAnimatableImpl$animate$2$1", f = "LottieAnimatable.kt", l = {277}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
        final /* synthetic */ LottieCancellationBehavior $cancellationBehavior;
        final /* synthetic */ int $iteration;
        final /* synthetic */ int $iterations;
        final /* synthetic */ InterfaceC2694i0 $parentJob;
        int label;
        final /* synthetic */ LottieAnimatableImpl this$0;

        /* JADX INFO: renamed from: com.airbnb.lottie.compose.LottieAnimatableImpl$animate$2$1$a */
        /* JADX INFO: compiled from: LottieAnimatable.kt */
        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f23355a;

            static {
                int[] iArr = new int[LottieCancellationBehavior.values().length];
                try {
                    iArr[1] = 1;
                } catch (NoSuchFieldError unused) {
                }
                f23355a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(LottieCancellationBehavior lottieCancellationBehavior, InterfaceC2694i0 interfaceC2694i0, int i10, int i11, LottieAnimatableImpl lottieAnimatableImpl, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$cancellationBehavior = lottieCancellationBehavior;
            this.$parentJob = interfaceC2694i0;
            this.$iterations = i10;
            this.$iteration = i11;
            this.this$0 = lottieAnimatableImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return new AnonymousClass1(this.$cancellationBehavior, this.$parentJob, this.$iterations, this.$iteration, this.this$0, cVar);
        }

        @Override // Ia.p
        public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
            return ((AnonymousClass1) create(a10, cVar)).invokeSuspend(r.f47939a);
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0024  */
        /* JADX WARN: Code duplicated, block: B:15:0x0032 A[ADDED_TO_REGION, REMOVE] */
        /* JADX WARN: Code duplicated, block: B:18:0x0040  */
        /* JADX WARN: Code duplicated, block: B:19:0x004a  */
        /* JADX WARN: Code duplicated, block: B:21:0x005d A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:24:0x0066  */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:11:0x0024
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f43038b
                int r1 = r4.label
                r2 = 1
                if (r1 == 0) goto L15
                if (r1 != r2) goto Ld
                kotlin.b.b(r5)
                goto L5e
            Ld:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L15:
                kotlin.b.b(r5)
            L18:
                com.airbnb.lottie.compose.LottieCancellationBehavior r5 = r4.$cancellationBehavior
                int[] r1 = com.airbnb.lottie.compose.LottieAnimatableImpl$animate$2.AnonymousClass1.a.f23355a
                int r5 = r5.ordinal()
                r5 = r1[r5]
                if (r5 != r2) goto L32
                kotlinx.coroutines.i0 r5 = r4.$parentJob
                boolean r5 = r5.c()
                if (r5 == 0) goto L2f
                int r5 = r4.$iterations
                goto L34
            L2f:
                int r5 = r4.$iteration
                goto L34
            L32:
                int r5 = r4.$iterations
            L34:
                com.airbnb.lottie.compose.LottieAnimatableImpl r1 = r4.this$0
                r4.label = r2
                r1.getClass()
                r3 = 2147483647(0x7fffffff, float:NaN)
                if (r5 != r3) goto L4a
                com.airbnb.lottie.compose.LottieAnimatableImpl$doFrame$2 r3 = new com.airbnb.lottie.compose.LottieAnimatableImpl$doFrame$2
                r3.<init>()
                java.lang.Object r5 = androidx.compose.animation.core.D.a(r3, r4)
                goto L5b
            L4a:
                com.airbnb.lottie.compose.LottieAnimatableImpl$doFrame$3 r3 = new com.airbnb.lottie.compose.LottieAnimatableImpl$doFrame$3
                r3.<init>()
                kotlin.coroutines.e r5 = r4.getContext()
                androidx.compose.runtime.O r5 = androidx.compose.runtime.P.a(r5)
                java.lang.Object r5 = r5.P0(r3, r4)
            L5b:
                if (r5 != r0) goto L5e
                return r0
            L5e:
                java.lang.Boolean r5 = (java.lang.Boolean) r5
                boolean r5 = r5.booleanValue()
                if (r5 != 0) goto L18
                xa.r r5 = p293xa.r.f47939a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.compose.LottieAnimatableImpl$animate$2.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LottieAnimatableImpl$animate$2(LottieAnimatableImpl lottieAnimatableImpl, int i10, int i11, boolean z10, float f10, c cVar, p079g3.b bVar, float f11, boolean z11, boolean z12, LottieCancellationBehavior lottieCancellationBehavior, kotlin.coroutines.c<? super LottieAnimatableImpl$animate$2> cVar2) {
        super(1, cVar2);
        this.this$0 = lottieAnimatableImpl;
        this.$iteration = i10;
        this.$iterations = i11;
        this.$reverseOnRepeat = z10;
        this.$speed = f10;
        this.$clipSpec = cVar;
        this.$composition = bVar;
        this.$initialProgress = f11;
        this.$useCompositionFrameRate = z11;
        this.$continueFromPreviousAnimate = z12;
        this.$cancellationBehavior = lottieCancellationBehavior;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(kotlin.coroutines.c<?> cVar) {
        return new LottieAnimatableImpl$animate$2(this.this$0, this.$iteration, this.$iterations, this.$reverseOnRepeat, this.$speed, this.$clipSpec, this.$composition, this.$initialProgress, this.$useCompositionFrameRate, this.$continueFromPreviousAnimate, this.$cancellationBehavior, cVar);
    }

    @Override // Ia.l
    public final Object invoke(kotlin.coroutines.c<? super r> cVar) {
        return ((LottieAnimatableImpl$animate$2) create(cVar)).invokeSuspend(r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kotlin.coroutines.e eVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        try {
            if (i10 == 0) {
                kotlin.b.b(obj);
                this.this$0.q(this.$iteration);
                this.this$0.f23344d.setValue(Integer.valueOf(this.$iterations));
                this.this$0.f23345e.setValue(Boolean.valueOf(this.$reverseOnRepeat));
                this.this$0.f23347g.setValue(Float.valueOf(this.$speed));
                LottieAnimatableImpl lottieAnimatableImpl = this.this$0;
                lottieAnimatableImpl.f23346f.setValue(this.$clipSpec);
                LottieAnimatableImpl lottieAnimatableImpl2 = this.this$0;
                lottieAnimatableImpl2.j.setValue(this.$composition);
                this.this$0.s(this.$initialProgress);
                this.this$0.f23348h.setValue(Boolean.valueOf(this.$useCompositionFrameRate));
                if (!this.$continueFromPreviousAnimate) {
                    this.this$0.f23352m.setValue(Long.MIN_VALUE);
                }
                if (this.$composition == null) {
                    LottieAnimatableImpl.g(this.this$0, false);
                    return r.f47939a;
                }
                if (Float.isInfinite(this.$speed)) {
                    LottieAnimatableImpl lottieAnimatableImpl3 = this.this$0;
                    lottieAnimatableImpl3.s(lottieAnimatableImpl3.k());
                    LottieAnimatableImpl.g(this.this$0, false);
                    this.this$0.q(this.$iterations);
                    return r.f47939a;
                }
                LottieAnimatableImpl.g(this.this$0, true);
                int iOrdinal = this.$cancellationBehavior.ordinal();
                if (iOrdinal == 0) {
                    eVar = EmptyCoroutineContext.f43032b;
                } else {
                    if (iOrdinal != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    eVar = s0.f43532b;
                }
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$cancellationBehavior, C2702l0.f(getContext()), this.$iterations, this.$iteration, this.this$0, null);
                this.label = 1;
                if (C2680e.f(eVar, anonymousClass1, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            C2702l0.e(getContext());
            LottieAnimatableImpl.g(this.this$0, false);
            return r.f47939a;
        } catch (Throwable th) {
            LottieAnimatableImpl.g(this.this$0, false);
            throw th;
        }
    }
}
