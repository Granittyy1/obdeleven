package io.ktor.client.plugins;

import io.ktor.client.HttpClient;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.B0;
import kotlinx.coroutines.InterfaceC2694i0;
import kotlinx.coroutines.InterfaceC2707q;
import kotlinx.coroutines.P;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: HttpRequestLifecycle.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "io.ktor.client.plugins.HttpRequestLifecycle$Plugin$install$1", f = "HttpRequestLifecycle.kt", l = {R.styleable.AppCompatTheme_alertDialogTheme}, m = "invokeSuspend")
final class HttpRequestLifecycle$Plugin$install$1 extends SuspendLambda implements Ia.q<io.ktor.util.pipeline.c<Object, io.ktor.client.request.a>, Object, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ HttpClient $scope;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpRequestLifecycle$Plugin$install$1(HttpClient httpClient, kotlin.coroutines.c<? super HttpRequestLifecycle$Plugin$install$1> cVar) {
        super(3, cVar);
        this.$scope = httpClient;
    }

    @Override // Ia.q
    public final Object invoke(io.ktor.util.pipeline.c<Object, io.ktor.client.request.a> cVar, Object obj, kotlin.coroutines.c<? super p293xa.r> cVar2) {
        HttpRequestLifecycle$Plugin$install$1 httpRequestLifecycle$Plugin$install$1 = new HttpRequestLifecycle$Plugin$install$1(this.$scope, cVar2);
        httpRequestLifecycle$Plugin$install$1.L$0 = cVar;
        return httpRequestLifecycle$Plugin$install$1.invokeSuspend(p293xa.r.f47939a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC2707q interfaceC2707q;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC2707q = (InterfaceC2707q) this.L$0;
            try {
                kotlin.b.b(obj);
                interfaceC2707q.b();
                return p293xa.r.f47939a;
            } catch (Throwable th) {
                th = th;
                try {
                    interfaceC2707q.h(th);
                    throw th;
                } catch (Throwable th2) {
                    interfaceC2707q.b();
                    throw th2;
                }
            }
        }
        kotlin.b.b(obj);
        io.ktor.util.pipeline.c cVar = (io.ktor.util.pipeline.c) this.L$0;
        final B0 b10 = new B0(((io.ktor.client.request.a) cVar.f40561b).f40414e);
        kotlin.coroutines.e.a aVar = this.$scope.f40242e.get(InterfaceC2694i0.b.f43449b);
        kotlin.jvm.internal.i.b(aVar);
        cc.b bVar = r.f40385a;
        final P pB = ((InterfaceC2694i0) aVar).B(new Ia.l<Throwable, p293xa.r>() { // from class: io.ktor.client.plugins.HttpRequestLifecycleKt$attachToClientEngineJob$handler$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // Ia.l
            public final p293xa.r invoke(Throwable th3) {
                Throwable th4 = th3;
                if (th4 != null) {
                    r.f40385a.b("Cancelling request because engine Job failed with error: " + th4);
                    b10.i(kotlin.jvm.internal.h.b("Engine failed", th4));
                } else {
                    r.f40385a.b("Cancelling request because engine Job completed");
                    b10.b();
                }
                return p293xa.r.f47939a;
            }
        });
        b10.B(new Ia.l<Throwable, p293xa.r>() { // from class: io.ktor.client.plugins.HttpRequestLifecycleKt$attachToClientEngineJob$1
            {
                super(1);
            }

            @Override // Ia.l
            public final p293xa.r invoke(Throwable th3) {
                pB.dispose();
                return p293xa.r.f47939a;
            }
        });
        try {
            io.ktor.client.request.a aVar2 = (io.ktor.client.request.a) cVar.f40561b;
            aVar2.getClass();
            aVar2.f40414e = b10;
            this.L$0 = b10;
            this.label = 1;
            if (cVar.c(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            interfaceC2707q = b10;
            interfaceC2707q.b();
            return p293xa.r.f47939a;
        } catch (Throwable th3) {
            th = th3;
            interfaceC2707q = b10;
            interfaceC2707q.h(th);
            throw th;
        }
    }
}
