package com.voltasit.obdeleven.ui.feature.boomboarding;

import Ia.p;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.runtime.J0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$IntRef;
import kotlinx.coroutines.A;
import kotlinx.coroutines.flow.C2688e;
import kotlinx.coroutines.flow.InterfaceC2686c;
import kotlinx.coroutines.flow.InterfaceC2687d;
import p293xa.r;

/* JADX INFO: compiled from: BoomboardingDialog.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.ui.feature.boomboarding.BoomboardingDialog$BoomboardingContent$1", f = "BoomboardingDialog.kt", l = {133}, m = "invokeSuspend")
public final class BoomboardingDialog$BoomboardingContent$1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
    final /* synthetic */ PagerState $pagerState;
    final /* synthetic */ Ref$IntRef $previousPage;
    int label;

    /* JADX INFO: compiled from: BoomboardingDialog.kt */
    public static final class a<T> implements InterfaceC2687d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Ref$IntRef f34069b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ PagerState f34070c;

        public a(Ref$IntRef ref$IntRef, PagerState pagerState) {
            this.f34069b = ref$IntRef;
            this.f34070c = pagerState;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC2687d
        public final Object emit(Object obj, kotlin.coroutines.c cVar) {
            int iIntValue = ((Number) obj).intValue();
            Ref$IntRef ref$IntRef = this.f34069b;
            if (ref$IntRef.element == 0 && iIntValue == 3) {
                Object objT = PagerState.t(this.f34070c, 0, cVar);
                return objT == CoroutineSingletons.f43038b ? objT : r.f47939a;
            }
            ref$IntRef.element = iIntValue;
            return r.f47939a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BoomboardingDialog$BoomboardingContent$1(PagerState pagerState, Ref$IntRef ref$IntRef, kotlin.coroutines.c<? super BoomboardingDialog$BoomboardingContent$1> cVar) {
        super(2, cVar);
        this.$pagerState = pagerState;
        this.$previousPage = ref$IntRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new BoomboardingDialog$BoomboardingContent$1(this.$pagerState, this.$previousPage, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
        return ((BoomboardingDialog$BoomboardingContent$1) create(a10, cVar)).invokeSuspend(r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            final PagerState pagerState = this.$pagerState;
            InterfaceC2686c interfaceC2686cH = C2688e.h(J0.j(new Ia.a<Integer>() { // from class: com.voltasit.obdeleven.ui.feature.boomboarding.BoomboardingDialog$BoomboardingContent$1.1
                {
                    super(0);
                }

                @Override // Ia.a
                public final Integer invoke() {
                    return Integer.valueOf(pagerState.j());
                }
            }));
            a aVar = new a(this.$previousPage, this.$pagerState);
            this.label = 1;
            if (interfaceC2686cH.collect(aVar, this) == coroutineSingletons) {
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
