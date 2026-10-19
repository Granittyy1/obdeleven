package io.ktor.client.plugins;

import io.ktor.client.HttpClient;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.TypeReference;
import kotlinx.coroutines.C;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: HttpSend.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "io.ktor.client.plugins.HttpSend$Plugin$install$1", f = "HttpSend.kt", l = {R.styleable.AppCompatTheme_textAppearanceListItemSecondary, 105}, m = "invokeSuspend")
final class HttpSend$Plugin$install$1 extends SuspendLambda implements Ia.q<io.ktor.util.pipeline.c<Object, io.ktor.client.request.a>, Object, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ t $plugin;
    final /* synthetic */ HttpClient $scope;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpSend$Plugin$install$1(t tVar, HttpClient httpClient, kotlin.coroutines.c<? super HttpSend$Plugin$install$1> cVar) {
        super(3, cVar);
        this.$plugin = tVar;
        this.$scope = httpClient;
    }

    @Override // Ia.q
    public final Object invoke(io.ktor.util.pipeline.c<Object, io.ktor.client.request.a> cVar, Object obj, kotlin.coroutines.c<? super p293xa.r> cVar2) {
        HttpSend$Plugin$install$1 httpSend$Plugin$install$1 = new HttpSend$Plugin$install$1(this.$plugin, this.$scope, cVar2);
        httpSend$Plugin$install$1.L$0 = cVar;
        httpSend$Plugin$install$1.L$1 = obj;
        return httpSend$Plugin$install$1.invokeSuspend(p293xa.r.f47939a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v14, types: [T, io.ktor.client.plugins.t$b] */
    /* JADX WARN: Type inference failed for: r6v5, types: [T, io.ktor.client.plugins.t$c] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        io.ktor.util.pipeline.c cVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                cVar = (io.ktor.util.pipeline.c) this.L$0;
                kotlin.b.b(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            return p293xa.r.f47939a;
        }
        kotlin.b.b(obj);
        cVar = (io.ktor.util.pipeline.c) this.L$0;
        Object obj2 = this.L$1;
        if (!(obj2 instanceof X9.b)) {
            throw new IllegalStateException(kotlin.text.i.w("\n|Fail to prepare request body for sending. \n|The body type is: " + kotlin.jvm.internal.l.a(obj2.getClass()) + ", with Content-Type: " + io.ktor.http.n.b((io.ktor.http.m) cVar.f40561b) + ".\n|\n|If you expect serialized body, please check that you have installed the corresponding plugin(like `ContentNegotiation`) and set `Content-Type` header.").toString());
        }
        io.ktor.client.request.a aVar = (io.ktor.client.request.a) cVar.f40561b;
        if (obj2 == null) {
            X9.a aVar2 = X9.a.f7430a;
            aVar.getClass();
            aVar.f40413d = aVar2;
            TypeReference typeReferenceB = kotlin.jvm.internal.l.b(X9.b.class);
            aVar.b(new p023ba.a(kotlin.jvm.internal.l.a(X9.b.class), kotlin.reflect.a.e(typeReferenceB), typeReferenceB));
        } else if (obj2 instanceof X9.b) {
            aVar.getClass();
            kotlin.jvm.internal.i.e(obj2, "<set-?>");
            aVar.f40413d = obj2;
            aVar.b(null);
        } else {
            aVar.getClass();
            kotlin.jvm.internal.i.e(obj2, "<set-?>");
            aVar.f40413d = obj2;
            TypeReference typeReferenceB2 = kotlin.jvm.internal.l.b(X9.b.class);
            aVar.b(new p023ba.a(kotlin.jvm.internal.l.a(X9.b.class), kotlin.reflect.a.e(typeReferenceB2), typeReferenceB2));
        }
        this.$plugin.getClass();
        ?? bVar = new t.b(this.$scope);
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = bVar;
        int iR = kotlin.collections.l.r(this.$plugin.f40394a);
        int iN = C.n(iR, 0, -1);
        t tVar = this.$plugin;
        Na.h hVar = new Na.h(iR, iN, -1);
        while (hVar.f4692d) {
            ref$ObjectRef.element = new t.c((Ia.q) tVar.f40394a.get(hVar.a()), (x) ref$ObjectRef.element);
        }
        x xVar = (x) ref$ObjectRef.element;
        io.ktor.client.request.a aVar3 = (io.ktor.client.request.a) cVar.f40561b;
        this.L$0 = cVar;
        this.label = 1;
        obj = xVar.a(aVar3, this);
        if (obj == coroutineSingletons) {
            return coroutineSingletons;
        }
        this.L$0 = null;
        this.label = 2;
        if (cVar.d((io.ktor.client.call.a) obj, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return p293xa.r.f47939a;
    }
}
