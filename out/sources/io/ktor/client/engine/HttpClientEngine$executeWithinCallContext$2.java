package io.ktor.client.engine;

import Ia.p;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import kotlinx.coroutines.InterfaceC2694i0;
import me.zhanghai.android.materialprogressbar.R;
import p293xa.r;

/* JADX INFO: compiled from: HttpClientEngine.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "io.ktor.client.engine.HttpClientEngine$executeWithinCallContext$2", f = "HttpClientEngine.kt", l = {R.styleable.AppCompatTheme_spinnerDropDownItemStyle}, m = "invokeSuspend")
final class HttpClientEngine$executeWithinCallContext$2 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super V9.e>, Object> {
    final /* synthetic */ V9.c $requestData;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpClientEngine$executeWithinCallContext$2(a aVar, V9.c cVar, kotlin.coroutines.c<? super HttpClientEngine$executeWithinCallContext$2> cVar2) {
        super(2, cVar2);
        this.this$0 = aVar;
        this.$requestData = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new HttpClientEngine$executeWithinCallContext$2(this.this$0, this.$requestData, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super V9.e> cVar) {
        return ((HttpClientEngine$executeWithinCallContext$2) create(a10, cVar)).invokeSuspend(r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            InterfaceC2694i0 interfaceC2694i0 = (InterfaceC2694i0) this.this$0.getCoroutineContext().get(InterfaceC2694i0.b.f43449b);
            if (!(interfaceC2694i0 != null ? interfaceC2694i0.c() : false)) {
                throw new ClientEngineClosedException(0);
            }
            a aVar = this.this$0;
            V9.c cVar = this.$requestData;
            this.label = 1;
            obj = aVar.C0(cVar, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        return obj;
    }
}
