package io.ktor.client.plugins;

import io.ktor.client.HttpClient;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.B0;

/* JADX INFO: compiled from: HttpRequestRetry.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "io.ktor.client.plugins.HttpRequestRetry$intercept$1", f = "HttpRequestRetry.kt", l = {298, 314}, m = "invokeSuspend")
final class HttpRequestRetry$intercept$1 extends SuspendLambda implements Ia.q<x, io.ktor.client.request.a, kotlin.coroutines.c<? super io.ktor.client.call.a>, Object> {
    final /* synthetic */ HttpClient $client;
    int I$0;
    int I$1;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    final /* synthetic */ HttpRequestRetry this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpRequestRetry$intercept$1(HttpRequestRetry httpRequestRetry, HttpClient httpClient, kotlin.coroutines.c<? super HttpRequestRetry$intercept$1> cVar) {
        super(3, cVar);
        this.this$0 = httpRequestRetry;
        this.$client = httpClient;
    }

    @Override // Ia.q
    public final Object invoke(x xVar, io.ktor.client.request.a aVar, kotlin.coroutines.c<? super io.ktor.client.call.a> cVar) {
        HttpRequestRetry$intercept$1 httpRequestRetry$intercept$1 = new HttpRequestRetry$intercept$1(this.this$0, this.$client, cVar);
        httpRequestRetry$intercept$1.L$0 = xVar;
        httpRequestRetry$intercept$1.L$1 = aVar;
        return httpRequestRetry$intercept$1.invokeSuspend(p293xa.r.f47939a);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00fb A[Catch: all -> 0x0077, TRY_ENTER, TryCatch #0 {all -> 0x0077, blocks: (B:34:0x00fb, B:35:0x0103, B:38:0x011e, B:40:0x0129, B:42:0x0142, B:11:0x0070), top: B:57:0x0070 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x011d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:40:0x0129 A[Catch: all -> 0x0077, TryCatch #0 {all -> 0x0077, blocks: (B:34:0x00fb, B:35:0x0103, B:38:0x011e, B:40:0x0129, B:42:0x0142, B:11:0x0070), top: B:57:0x0070 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x01bf A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:54:0x01c0  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v12, types: [Ia.q] */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3, types: [Ia.q] */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v8, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x01c0 -> B:7:0x0034). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Ia.p<HttpRequestRetry.b, io.ktor.client.request.a, p293xa.r> pVar;
        x xVar;
        io.ktor.client.request.a aVar;
        int i10;
        Ia.p<HttpRequestRetry.a, Integer, Long> pVar2;
        HttpRequestRetry.d dVar;
        Ia.q<HttpRequestRetry.e, io.ktor.client.request.a, Throwable, Boolean> qVar;
        ?? r12;
        int i11;
        ?? r13;
        final io.ktor.client.request.a aVar2;
        Object objA;
        io.ktor.client.call.a aVar3;
        HttpRequestRetry.d dVar2;
        int i12;
        int i13;
        Ia.p<HttpRequestRetry.b, io.ktor.client.request.a, p293xa.r> pVar3;
        Ia.p<HttpRequestRetry.a, Integer, Long> pVar4;
        Ia.q<HttpRequestRetry.e, io.ktor.client.request.a, Throwable, Boolean> qVar2;
        ?? r11;
        io.ktor.client.request.a aVar4;
        x xVar2;
        HttpRequestRetry.d dVar3;
        Ia.p<Long, kotlin.coroutines.c<? super p293xa.r>, Object> pVar5;
        Long lInvoke;
        char c10;
        ?? r14;
        int i14 = 1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i15 = this.label;
        if (i15 == 0) {
            kotlin.b.b(obj);
            x xVar3 = (x) this.L$0;
            io.ktor.client.request.a aVar5 = (io.ktor.client.request.a) this.L$1;
            p293xa.e eVar = (Ia.q) aVar5.f40415f.d(s.f40388c);
            if (eVar == null) {
                eVar = this.this$0.f40318a;
            }
            io.ktor.util.a<Ia.q<HttpRequestRetry.e, io.ktor.client.request.a, Throwable, Boolean>> aVar6 = s.f40389d;
            io.ktor.util.f fVar = aVar5.f40415f;
            Ia.q<HttpRequestRetry.e, io.ktor.client.request.a, Throwable, Boolean> qVar3 = (Ia.q) fVar.d(aVar6);
            if (qVar3 == null) {
                qVar3 = this.this$0.f40319b;
            }
            Integer num = (Integer) fVar.d(s.f40387b);
            int iIntValue = num != null ? num.intValue() : this.this$0.f40322e;
            Ia.p<HttpRequestRetry.a, Integer, Long> pVar6 = (Ia.p) fVar.d(s.f40391f);
            if (pVar6 == null) {
                pVar6 = this.this$0.f40320c;
            }
            pVar = (Ia.p) fVar.d(s.f40390e);
            if (pVar == null) {
                pVar = this.this$0.f40323f;
            }
            xVar = xVar3;
            aVar = aVar5;
            i10 = iIntValue;
            pVar2 = pVar6;
            dVar = null;
            qVar = qVar3;
            r12 = eVar;
            i11 = 0;
            HttpRequestRetry httpRequestRetry = this.this$0;
            HttpRequestRetry.c cVar = HttpRequestRetry.f40315g;
            httpRequestRetry.getClass();
            aVar2 = new io.ktor.client.request.a();
            aVar2.e(aVar);
            aVar.f40414e.B(new Ia.l<Throwable, p293xa.r>() { // from class: io.ktor.client.plugins.HttpRequestRetry$prepareRequest$1
                {
                    super(1);
                }

                @Override // Ia.l
                public final p293xa.r invoke(Throwable th) {
                    Throwable th2 = th;
                    B0 b10 = aVar2.f40414e;
                    kotlin.jvm.internal.i.c(b10, "null cannot be cast to non-null type kotlinx.coroutines.CompletableJob");
                    if (th2 == null) {
                        b10.b();
                    } else {
                        b10.h(th2);
                    }
                    return p293xa.r.f47939a;
                }
            });
            if (dVar != null) {
                pVar.invoke(new HttpRequestRetry.b(), aVar2);
            }
            this.L$0 = xVar;
            this.L$1 = aVar;
            this.L$2 = r12;
            this.L$3 = qVar;
            this.L$4 = pVar2;
            this.L$5 = pVar;
            this.L$6 = aVar2;
            this.I$0 = i11;
            this.I$1 = i10;
            this.label = i14;
            objA = xVar.a(aVar2, this);
            r13 = r12;
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
            aVar3 = (io.ktor.client.call.a) objA;
            HttpRequestRetry httpRequestRetry2 = this.this$0;
            HttpRequestRetry.c cVar2 = HttpRequestRetry.f40315g;
            httpRequestRetry2.getClass();
            if (i11 < i10) {
            }
            return aVar3;
        }
        if (i15 == 1) {
            i10 = this.I$1;
            i11 = this.I$0;
            aVar2 = (io.ktor.client.request.a) this.L$6;
            pVar = (Ia.p) this.L$5;
            pVar2 = (Ia.p) this.L$4;
            qVar = (Ia.q) this.L$3;
            r12 = (Ia.q) this.L$2;
            aVar = (io.ktor.client.request.a) this.L$1;
            xVar = (x) this.L$0;
            try {
                kotlin.b.b(obj);
                objA = obj;
                r13 = r12;
            } catch (Throwable th) {
                HttpRequestRetry httpRequestRetry3 = this.this$0;
                HttpRequestRetry.c cVar3 = HttpRequestRetry.f40315g;
                httpRequestRetry3.getClass();
                if (i11 >= i10 || !qVar.invoke(new HttpRequestRetry.e(), aVar2, th).booleanValue()) {
                    throw th;
                }
                int i16 = i11 + i14;
                dVar2 = new HttpRequestRetry.d(aVar2, i16, null, th);
                i12 = i10;
                i13 = i16;
                pVar3 = pVar;
                pVar4 = pVar2;
                qVar2 = qVar;
                r11 = r12;
                aVar4 = aVar;
                xVar2 = xVar;
                dVar3 = dVar2;
                this.$client.f40247k.a(HttpRequestRetry.f40317i);
                HttpRequestRetry.a aVar7 = new HttpRequestRetry.a(dVar3.f40333a, dVar3.f40334b);
                pVar5 = this.this$0.f40321d;
                lInvoke = pVar4.invoke(aVar7, new Integer(i13));
                this.L$0 = xVar2;
                this.L$1 = aVar4;
                this.L$2 = r11;
                this.L$3 = qVar2;
                this.L$4 = pVar4;
                this.L$5 = pVar3;
                this.L$6 = dVar3;
                this.I$0 = i13;
                this.I$1 = i12;
                c10 = 2;
                this.label = 2;
                if (((HttpRequestRetry$Configuration$delay$1) pVar5).invoke(lInvoke, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                xVar = xVar2;
                r14 = r11;
                aVar = aVar4;
                r12 = r14;
                qVar = qVar2;
                pVar2 = pVar4;
                pVar = pVar3;
                int i17 = i13;
                i10 = i12;
                dVar = dVar3;
                i11 = i17;
                s.f40386a.b("Retrying request " + aVar.f40410a + " attempt: " + i11);
                i14 = 1;
                HttpRequestRetry httpRequestRetry4 = this.this$0;
                HttpRequestRetry.c cVar4 = HttpRequestRetry.f40315g;
                httpRequestRetry4.getClass();
                aVar2 = new io.ktor.client.request.a();
                aVar2.e(aVar);
                aVar.f40414e.B(new Ia.l<Throwable, p293xa.r>() { // from class: io.ktor.client.plugins.HttpRequestRetry$prepareRequest$1
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final p293xa.r invoke(Throwable th2) {
                        Throwable th3 = th2;
                        B0 b10 = aVar2.f40414e;
                        kotlin.jvm.internal.i.c(b10, "null cannot be cast to non-null type kotlinx.coroutines.CompletableJob");
                        if (th3 == null) {
                            b10.b();
                        } else {
                            b10.h(th3);
                        }
                        return p293xa.r.f47939a;
                    }
                });
                if (dVar != null) {
                    pVar.invoke(new HttpRequestRetry.b(), aVar2);
                }
                this.L$0 = xVar;
                this.L$1 = aVar;
                this.L$2 = r12;
                this.L$3 = qVar;
                this.L$4 = pVar2;
                this.L$5 = pVar;
                this.L$6 = aVar2;
                this.I$0 = i11;
                this.I$1 = i10;
                this.label = i14;
                objA = xVar.a(aVar2, this);
                r13 = r12;
                if (objA == coroutineSingletons) {
                    return coroutineSingletons;
                }
                aVar3 = (io.ktor.client.call.a) objA;
                HttpRequestRetry httpRequestRetry5 = this.this$0;
                HttpRequestRetry.c cVar5 = HttpRequestRetry.f40315g;
                httpRequestRetry5.getClass();
                if (i11 < i10) {
                }
                return aVar3;
            }
            aVar3 = (io.ktor.client.call.a) objA;
            HttpRequestRetry httpRequestRetry6 = this.this$0;
            HttpRequestRetry.c cVar6 = HttpRequestRetry.f40315g;
            httpRequestRetry6.getClass();
            if (i11 < i10 || !((Boolean) r13.invoke(new HttpRequestRetry.e(), aVar3.c(), aVar3.d())).booleanValue()) {
                return aVar3;
            }
            int i18 = i11 + i14;
            dVar2 = new HttpRequestRetry.d(aVar2, i18, aVar3.d(), null);
            i12 = i10;
            i13 = i18;
            pVar3 = pVar;
            pVar4 = pVar2;
            qVar2 = qVar;
            r11 = r13;
            aVar4 = aVar;
            xVar2 = xVar;
            dVar3 = dVar2;
            this.$client.f40247k.a(HttpRequestRetry.f40317i);
            HttpRequestRetry.a aVar8 = new HttpRequestRetry.a(dVar3.f40333a, dVar3.f40334b);
            pVar5 = this.this$0.f40321d;
            lInvoke = pVar4.invoke(aVar8, new Integer(i13));
            this.L$0 = xVar2;
            this.L$1 = aVar4;
            this.L$2 = r11;
            this.L$3 = qVar2;
            this.L$4 = pVar4;
            this.L$5 = pVar3;
            this.L$6 = dVar3;
            this.I$0 = i13;
            this.I$1 = i12;
            c10 = 2;
            this.label = 2;
            if (((HttpRequestRetry$Configuration$delay$1) pVar5).invoke(lInvoke, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            xVar = xVar2;
            r14 = r11;
        } else {
            if (i15 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i12 = this.I$1;
            i13 = this.I$0;
            dVar3 = (HttpRequestRetry.d) this.L$6;
            pVar3 = (Ia.p) this.L$5;
            pVar4 = (Ia.p) this.L$4;
            qVar2 = (Ia.q) this.L$3;
            Ia.q qVar4 = (Ia.q) this.L$2;
            aVar4 = (io.ktor.client.request.a) this.L$1;
            x xVar4 = (x) this.L$0;
            kotlin.b.b(obj);
            c10 = 2;
            xVar = xVar4;
            r14 = qVar4;
        }
        aVar = aVar4;
        r12 = r14;
        qVar = qVar2;
        pVar2 = pVar4;
        pVar = pVar3;
        int i19 = i13;
        i10 = i12;
        dVar = dVar3;
        i11 = i19;
        s.f40386a.b("Retrying request " + aVar.f40410a + " attempt: " + i11);
        i14 = 1;
        HttpRequestRetry httpRequestRetry7 = this.this$0;
        HttpRequestRetry.c cVar7 = HttpRequestRetry.f40315g;
        httpRequestRetry7.getClass();
        aVar2 = new io.ktor.client.request.a();
        aVar2.e(aVar);
        aVar.f40414e.B(new Ia.l<Throwable, p293xa.r>() { // from class: io.ktor.client.plugins.HttpRequestRetry$prepareRequest$1
            {
                super(1);
            }

            @Override // Ia.l
            public final p293xa.r invoke(Throwable th2) {
                Throwable th3 = th2;
                B0 b10 = aVar2.f40414e;
                kotlin.jvm.internal.i.c(b10, "null cannot be cast to non-null type kotlinx.coroutines.CompletableJob");
                if (th3 == null) {
                    b10.b();
                } else {
                    b10.h(th3);
                }
                return p293xa.r.f47939a;
            }
        });
        if (dVar != null) {
            pVar.invoke(new HttpRequestRetry.b(), aVar2);
        }
        this.L$0 = xVar;
        this.L$1 = aVar;
        this.L$2 = r12;
        this.L$3 = qVar;
        this.L$4 = pVar2;
        this.L$5 = pVar;
        this.L$6 = aVar2;
        this.I$0 = i11;
        this.I$1 = i10;
        this.label = i14;
        objA = xVar.a(aVar2, this);
        r13 = r12;
        if (objA == coroutineSingletons) {
            return coroutineSingletons;
        }
        aVar3 = (io.ktor.client.call.a) objA;
        HttpRequestRetry httpRequestRetry8 = this.this$0;
        HttpRequestRetry.c cVar8 = HttpRequestRetry.f40315g;
        httpRequestRetry8.getClass();
        if (i11 < i10) {
        }
        return aVar3;
    }
}
