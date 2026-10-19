package io.intercom.android.sdk.survey.ui.questiontype.text;

import Ia.p;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import me.zhanghai.android.materialprogressbar.R;
import p293xa.r;

/* JADX INFO: compiled from: ShortTextQuestion.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "io.intercom.android.sdk.survey.ui.questiontype.text.ShortTextQuestionKt$ShortTextQuestion$2$1", f = "ShortTextQuestion.kt", l = {R.styleable.AppCompatTheme_imageButtonStyle}, m = "invokeSuspend")
public final class ShortTextQuestionKt$ShortTextQuestion$2$1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
    final /* synthetic */ androidx.compose.foundation.relocation.a $bringIntoViewRequester;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShortTextQuestionKt$ShortTextQuestion$2$1(androidx.compose.foundation.relocation.a aVar, kotlin.coroutines.c<? super ShortTextQuestionKt$ShortTextQuestion$2$1> cVar) {
        super(2, cVar);
        this.$bringIntoViewRequester = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new ShortTextQuestionKt$ShortTextQuestion$2$1(this.$bringIntoViewRequester, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            androidx.compose.foundation.relocation.a aVar = this.$bringIntoViewRequester;
            this.label = 1;
            if (aVar.a(null, this) == coroutineSingletons) {
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
        return ((ShortTextQuestionKt$ShortTextQuestion$2$1) create(a10, cVar)).invokeSuspend(r.f47939a);
    }
}
