package io.ktor.client.content;

import Aa.c;
import Ia.p;
import io.ktor.utils.io.j;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import me.zhanghai.android.materialprogressbar.R;
import p293xa.r;

/* JADX INFO: compiled from: ObservableContent.kt */
/* JADX INFO: loaded from: classes.dex */
@c(c = "io.ktor.client.content.ObservableContent$content$1", f = "ObservableContent.kt", l = {R.styleable.AppCompatTheme_alertDialogCenterButtons}, m = "invokeSuspend")
final class ObservableContent$content$1 extends SuspendLambda implements p<j, kotlin.coroutines.c<? super r>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ObservableContent$content$1(a aVar, kotlin.coroutines.c<? super ObservableContent$content$1> cVar) {
        super(2, cVar);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        ObservableContent$content$1 observableContent$content$1 = new ObservableContent$content$1(this.this$0, cVar);
        observableContent$content$1.L$0 = obj;
        return observableContent$content$1;
    }

    @Override // Ia.p
    public final Object invoke(j jVar, kotlin.coroutines.c<? super r> cVar) {
        return ((ObservableContent$content$1) create(jVar, cVar)).invokeSuspend(r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            b.b(obj);
            j jVar = (j) this.L$0;
            X9.b.d dVar = (X9.b.d) this.this$0.f40276a;
            jVar.getClass();
            this.label = 1;
            if (dVar.d() == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.b(obj);
        }
        return r.f47939a;
    }
}
