package io.ktor.client.plugins;

import io.ktor.http.C2476a;
import io.ktor.utils.io.ByteReadChannel;
import java.io.InputStream;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: DefaultTransform.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "io.ktor.client.plugins.DefaultTransformKt$defaultTransformers$1", f = "DefaultTransform.kt", l = {R.styleable.AppCompatTheme_colorPrimary}, m = "invokeSuspend")
public final class DefaultTransformKt$defaultTransformers$1 extends SuspendLambda implements Ia.q<io.ktor.util.pipeline.c<Object, io.ktor.client.request.a>, Object, kotlin.coroutines.c<? super p293xa.r>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX INFO: compiled from: DefaultTransform.kt */
    public static final class a extends X9.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C2476a f40307a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f40308b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Object f40309c;

        public a(C2476a c2476a, Object obj) {
            this.f40309c = obj;
            if (c2476a == null) {
                C2476a c2476a2 = C2476a.C0457a.f40469a;
                c2476a = C2476a.C0457a.f40470b;
            }
            this.f40307a = c2476a;
            this.f40308b = ((byte[]) obj).length;
        }

        @Override // X9.b
        public final Long a() {
            return Long.valueOf(this.f40308b);
        }

        @Override // X9.b
        public final C2476a b() {
            return this.f40307a;
        }

        @Override // X9.b.a
        public final byte[] d() {
            return (byte[]) this.f40309c;
        }
    }

    /* JADX INFO: compiled from: DefaultTransform.kt */
    public static final class b extends X9.b.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Long f40310a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final C2476a f40311b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Object f40312c;

        public b(io.ktor.util.pipeline.c<Object, io.ktor.client.request.a> cVar, C2476a c2476a, Object obj) {
            this.f40312c = obj;
            io.ktor.http.h hVar = cVar.f40561b.f40412c;
            List<String> list = io.ktor.http.k.f40481a;
            String strG = hVar.g("Content-Length");
            this.f40310a = strG != null ? Long.valueOf(Long.parseLong(strG)) : null;
            if (c2476a == null) {
                C2476a c2476a2 = C2476a.C0457a.f40469a;
                c2476a = C2476a.C0457a.f40470b;
            }
            this.f40311b = c2476a;
        }

        @Override // X9.b
        public final Long a() {
            return this.f40310a;
        }

        @Override // X9.b
        public final C2476a b() {
            return this.f40311b;
        }

        @Override // X9.b.c
        public final ByteReadChannel d() {
            return (ByteReadChannel) this.f40312c;
        }
    }

    @Override // Ia.q
    public final Object invoke(io.ktor.util.pipeline.c<Object, io.ktor.client.request.a> cVar, Object obj, kotlin.coroutines.c<? super p293xa.r> cVar2) {
        DefaultTransformKt$defaultTransformers$1 defaultTransformKt$defaultTransformers$1 = new DefaultTransformKt$defaultTransformers$1(3, cVar2);
        defaultTransformKt$defaultTransformers$1.L$0 = cVar;
        defaultTransformKt$defaultTransformers$1.L$1 = obj;
        return defaultTransformKt$defaultTransformers$1.invokeSuspend(p293xa.r.f47939a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        X9.b cVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            io.ktor.util.pipeline.c cVar2 = (io.ktor.util.pipeline.c) this.L$0;
            Object body = this.L$1;
            io.ktor.http.h hVar = ((io.ktor.client.request.a) cVar2.f40561b).f40412c;
            List<String> list = io.ktor.http.k.f40481a;
            String strG = hVar.g("Accept");
            TContext tcontext = cVar2.f40561b;
            if (strG == null) {
                ((io.ktor.client.request.a) tcontext).f40412c.d("Accept", "*/*");
            }
            C2476a c2476aB = io.ktor.http.n.b((io.ktor.http.m) tcontext);
            if (body instanceof String) {
                String str = (String) body;
                if (c2476aB == null) {
                    c2476aB = C2476a.c.f40471a;
                }
                cVar = new X9.c(str, c2476aB);
            } else if (body instanceof byte[]) {
                cVar = new a(c2476aB, body);
            } else if (body instanceof ByteReadChannel) {
                cVar = new b(cVar2, c2476aB, body);
            } else if (body instanceof X9.b) {
                cVar = (X9.b) body;
            } else {
                io.ktor.client.request.a context = (io.ktor.client.request.a) tcontext;
                kotlin.jvm.internal.i.e(context, "context");
                kotlin.jvm.internal.i.e(body, "body");
                cVar = body instanceof InputStream ? new c(context, c2476aB, body) : null;
            }
            if ((cVar != null ? cVar.b() : null) != null) {
                io.ktor.client.request.a aVar = (io.ktor.client.request.a) tcontext;
                aVar.f40412c.f40530a.remove("Content-Type");
                DefaultTransformKt.f40306a.b("Transformed with default transformers request body for " + aVar.f40410a + " from " + kotlin.jvm.internal.l.a(body.getClass()));
                this.L$0 = null;
                this.label = 1;
                if (cVar2.d(cVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
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
