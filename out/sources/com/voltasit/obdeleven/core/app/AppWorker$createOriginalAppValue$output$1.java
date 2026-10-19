package com.voltasit.obdeleven.core.app;

import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: AppWorker.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.core.app.AppWorker$createOriginalAppValue$output$1", f = "AppWorker.kt", l = {268}, m = "invokeSuspend")
final class AppWorker$createOriginalAppValue$output$1 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super C8.a<? extends List<? extends I8.e>>>, Object> {
    int label;
    final /* synthetic */ C2098m this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppWorker$createOriginalAppValue$output$1(C2098m c2098m, kotlin.coroutines.c<? super AppWorker$createOriginalAppValue$output$1> cVar) {
        super(2, cVar);
        this.this$0 = c2098m;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new AppWorker$createOriginalAppValue$output$1(this.this$0, cVar);
    }

    @Override // Ia.p
    public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super C8.a<? extends List<? extends I8.e>>> cVar) {
        return ((AppWorker$createOriginalAppValue$output$1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            C2098m c2098m = this.this$0;
            com.voltasit.obdeleven.domain.usecases.oca.a aVar = c2098m.f30119d;
            String str = c2098m.f30116a.f3901a;
            ArrayList<AbstractC2107w> arrayList = c2098m.f30122g;
            this.label = 1;
            obj = aVar.b(str, arrayList, this);
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
