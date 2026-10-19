package io.intercom.android.sdk.survey.ui.components;

import Ia.p;
import androidx.compose.foundation.ScrollState;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import p293xa.r;

/* JADX INFO: compiled from: SurveyComponent.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "io.intercom.android.sdk.survey.ui.components.SurveyComponentKt$SurveyContent$1$1$1", f = "SurveyComponent.kt", l = {141}, m = "invokeSuspend")
public final class SurveyComponentKt$SurveyContent$1$1$1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
    final /* synthetic */ ScrollState $scrollState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SurveyComponentKt$SurveyContent$1$1$1(ScrollState scrollState, kotlin.coroutines.c<? super SurveyComponentKt$SurveyContent$1$1$1> cVar) {
        super(2, cVar);
        this.$scrollState = scrollState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new SurveyComponentKt$SurveyContent$1$1$1(this.$scrollState, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            ScrollState scrollState = this.$scrollState;
            this.label = 1;
            if (scrollState.f(0, this) == coroutineSingletons) {
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

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
        return ((SurveyComponentKt$SurveyContent$1$1$1) create(a10, cVar)).invokeSuspend(r.f47939a);
    }
}
