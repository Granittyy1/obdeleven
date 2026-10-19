package com.airbnb.lottie.compose;

import Ia.p;
import androidx.compose.runtime.X;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import me.zhanghai.android.materialprogressbar.R;
import p293xa.r;

/* JADX INFO: compiled from: animateLottieCompositionAsState.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "com.airbnb.lottie.compose.AnimateLottieCompositionAsStateKt$animateLottieCompositionAsState$3", f = "animateLottieCompositionAsState.kt", l = {R.styleable.AppCompatTheme_listChoiceBackgroundIndicator, R.styleable.AppCompatTheme_listPopupWindowStyle}, m = "invokeSuspend")
final class AnimateLottieCompositionAsStateKt$animateLottieCompositionAsState$3 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
    final /* synthetic */ float $actualSpeed;
    final /* synthetic */ a $animatable;
    final /* synthetic */ LottieCancellationBehavior $cancellationBehavior;
    final /* synthetic */ c $clipSpec;
    final /* synthetic */ p079g3.b $composition;
    final /* synthetic */ boolean $isPlaying;
    final /* synthetic */ int $iterations;
    final /* synthetic */ boolean $restartOnPlay;
    final /* synthetic */ boolean $reverseOnRepeat;
    final /* synthetic */ boolean $useCompositionFrameRate;
    final /* synthetic */ X<Boolean> $wasPlaying$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimateLottieCompositionAsStateKt$animateLottieCompositionAsState$3(boolean z10, boolean z11, a aVar, p079g3.b bVar, int i10, boolean z12, float f10, c cVar, LottieCancellationBehavior lottieCancellationBehavior, boolean z13, X<Boolean> x10, kotlin.coroutines.c<? super AnimateLottieCompositionAsStateKt$animateLottieCompositionAsState$3> cVar2) {
        super(2, cVar2);
        this.$isPlaying = z10;
        this.$restartOnPlay = z11;
        this.$animatable = aVar;
        this.$composition = bVar;
        this.$iterations = i10;
        this.$reverseOnRepeat = z12;
        this.$actualSpeed = f10;
        this.$clipSpec = cVar;
        this.$cancellationBehavior = lottieCancellationBehavior;
        this.$useCompositionFrameRate = z13;
        this.$wasPlaying$delegate = x10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new AnimateLottieCompositionAsStateKt$animateLottieCompositionAsState$3(this.$isPlaying, this.$restartOnPlay, this.$animatable, this.$composition, this.$iterations, this.$reverseOnRepeat, this.$actualSpeed, this.$clipSpec, this.$cancellationBehavior, this.$useCompositionFrameRate, this.$wasPlaying$delegate, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
        return ((AnimateLottieCompositionAsStateKt$animateLottieCompositionAsState$3) create(a10, cVar)).invokeSuspend(r.f47939a);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0050  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        float fB;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.b.b(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            return r.f47939a;
        }
        kotlin.b.b(obj);
        if (this.$isPlaying && !this.$wasPlaying$delegate.getValue().booleanValue() && this.$restartOnPlay) {
            a aVar = this.$animatable;
            this.label = 1;
            p079g3.b bVarP = aVar.p();
            c cVarR = aVar.r();
            float fD = aVar.d();
            float f10 = 0.0f;
            if (fD < 0.0f && bVarP == null) {
                f10 = 1.0f;
            } else if (bVarP != null) {
                if (fD < 0.0f) {
                    if (cVarR != null) {
                        fB = cVarR.a();
                    } else {
                        f10 = 1.0f;
                    }
                } else if (cVarR != null) {
                    fB = cVarR.b();
                }
                f10 = fB;
            }
            Object objN = aVar.n(aVar.p(), f10, 1, !(f10 == aVar.h()), this);
            if (objN != coroutineSingletons) {
                objN = r.f47939a;
            }
            if (objN == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        this.$wasPlaying$delegate.setValue(Boolean.valueOf(this.$isPlaying));
        if (!this.$isPlaying) {
            return r.f47939a;
        }
        a aVar2 = this.$animatable;
        p079g3.b bVar = this.$composition;
        int i11 = this.$iterations;
        boolean z10 = this.$reverseOnRepeat;
        float f11 = this.$actualSpeed;
        c cVar = this.$clipSpec;
        float fH = aVar2.h();
        LottieCancellationBehavior lottieCancellationBehavior = this.$cancellationBehavior;
        boolean z11 = this.$useCompositionFrameRate;
        this.label = 2;
        if (aVar2.l(bVar, aVar2.i(), i11, z10, f11, cVar, fH, false, lottieCancellationBehavior, z11, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return r.f47939a;
    }
}
