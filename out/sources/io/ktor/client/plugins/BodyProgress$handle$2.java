package io.ktor.client.plugins;

import io.ktor.client.HttpClient;
import io.ktor.utils.io.ByteReadChannel;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: BodyProgress.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "io.ktor.client.plugins.BodyProgress$handle$2", f = "BodyProgress.kt", l = {R.styleable.AppCompatTheme_buttonBarStyle}, m = "invokeSuspend")
final class BodyProgress$handle$2 extends SuspendLambda implements Ia.q<io.ktor.util.pipeline.c<io.ktor.client.statement.c, p293xa.r>, io.ktor.client.statement.c, kotlin.coroutines.c<? super p293xa.r>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // Ia.q
    public final Object invoke(io.ktor.util.pipeline.c<io.ktor.client.statement.c, p293xa.r> cVar, io.ktor.client.statement.c cVar2, kotlin.coroutines.c<? super p293xa.r> cVar3) {
        BodyProgress$handle$2 bodyProgress$handle$2 = new BodyProgress$handle$2(3, cVar3);
        bodyProgress$handle$2.L$0 = cVar;
        bodyProgress$handle$2.L$1 = cVar2;
        return bodyProgress$handle$2.invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            io.ktor.util.pipeline.c cVar = (io.ktor.util.pipeline.c) this.L$0;
            io.ktor.client.statement.c cVar2 = (io.ktor.client.statement.c) this.L$1;
            Ia.q qVar = (Ia.q) cVar2.b().c().getAttributes().d(b.f40350b);
            if (qVar == null) {
                return p293xa.r.f47939a;
            }
            ByteReadChannel byteReadChannelC = cVar2.c();
            kotlin.coroutines.e coroutineContext = cVar2.getCoroutineContext();
            io.ktor.http.g gVarA = cVar2.a();
            List<String> list = io.ktor.http.k.f40481a;
            String str = gVarA.get("Content-Length");
            io.ktor.utils.io.a aVarA = io.ktor.client.utils.a.a(byteReadChannelC, coroutineContext, str != null ? Long.valueOf(Long.parseLong(str)) : null, qVar);
            io.ktor.client.call.a aVarB = cVar2.b();
            kotlin.jvm.internal.i.e(aVarB, "<this>");
            HttpClient client = aVarB.f40262b;
            kotlin.jvm.internal.i.e(client, "client");
            T9.a aVar = new T9.a(client);
            aVar.f40263c = new T9.b(aVar, aVarB.c());
            aVar.f40264d = new T9.c(aVar, aVarA, aVarB.d());
            io.ktor.client.statement.c cVarD = aVar.d();
            this.L$0 = null;
            this.label = 1;
            if (cVar.d(cVarD, this) == coroutineSingletons) {
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
