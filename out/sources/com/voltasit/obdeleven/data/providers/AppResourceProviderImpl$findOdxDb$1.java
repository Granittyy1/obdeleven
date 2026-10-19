package com.voltasit.obdeleven.data.providers;

import com.obdeleven.service.odx.OdxFactory$Exception;
import com.voltasit.obdeleven.domain.exceptions.OdxNotFoundException;
import java.net.UnknownHostException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: AppResourceProviderImpl.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.data.providers.AppResourceProviderImpl$findOdxDb$1", f = "AppResourceProviderImpl.kt", l = {R.styleable.AppCompatTheme_colorButtonNormal}, m = "invokeSuspend")
public final class AppResourceProviderImpl$findOdxDb$1 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p255u9.l>, Object> {
    final /* synthetic */ com.obdeleven.service.odx.c $odxFileInfo;
    int label;
    final /* synthetic */ AppResourceProviderImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppResourceProviderImpl$findOdxDb$1(AppResourceProviderImpl appResourceProviderImpl, com.obdeleven.service.odx.c cVar, kotlin.coroutines.c<? super AppResourceProviderImpl$findOdxDb$1> cVar2) {
        super(2, cVar2);
        this.this$0 = appResourceProviderImpl;
        this.$odxFileInfo = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new AppResourceProviderImpl$findOdxDb$1(this.this$0, this.$odxFileInfo, cVar);
    }

    @Override // Ia.p
    public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p255u9.l> cVar) {
        return ((AppResourceProviderImpl$findOdxDb$1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            com.voltasit.obdeleven.domain.usecases.odx.g gVar = this.this$0.f30195a;
            com.obdeleven.service.odx.c cVar = this.$odxFileInfo;
            short s10 = cVar.f29481a;
            this.label = 1;
            obj = gVar.a(s10, cVar.f29482b, cVar.f29483c, cVar.f29484d, cVar.f29485e, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        C8.a aVar = (C8.a) obj;
        if (aVar instanceof C8.a.b) {
            A8.o oVar = this.this$0.f30196b;
            G8.s input = (G8.s) ((C8.a.b) aVar).f2463a;
            kotlin.jvm.internal.i.e(input, "input");
            p255u9.l lVar = new p255u9.l();
            lVar.setObjectId(input.f3536a);
            lVar.put("fileName", input.f3538c);
            lVar.put("platform", input.f3539d);
            lVar.put("values", input.f3537b);
            lVar.f47475b = input.f3540e;
            return lVar;
        }
        if (!(aVar instanceof C8.a.C0024a)) {
            throw new NoWhenBranchMatchedException();
        }
        C8.a.C0024a c0024a = (C8.a.C0024a) aVar;
        Throwable th = c0024a.f2462a;
        if (th instanceof UnknownHostException) {
            throw new OdxFactory$Exception(0);
        }
        J8.p pVar = this.this$0.f30197c;
        String message = th.getMessage();
        if (message == null) {
            message = "Unable to get odx version";
        }
        pVar.c("AppResourceProviderImpl", message);
        if (!(c0024a.f2462a instanceof OdxNotFoundException)) {
            throw new Exception("Odx not found");
        }
        J8.a aVar2 = this.this$0.f30201g;
        com.obdeleven.service.odx.c cVar2 = this.$odxFileInfo;
        aVar2.M(cVar2.f29484d, cVar2.f29482b, cVar2.f29483c);
        throw new OdxFactory$Exception(1);
    }
}
