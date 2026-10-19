package io.ktor.client.plugins;

import io.ktor.http.C2476a;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: HttpPlainText.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "io.ktor.client.plugins.HttpPlainText$Plugin$install$1", f = "HttpPlainText.kt", l = {130}, m = "invokeSuspend")
final class HttpPlainText$Plugin$install$1 extends SuspendLambda implements Ia.q<io.ktor.util.pipeline.c<Object, io.ktor.client.request.a>, Object, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ k $plugin;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpPlainText$Plugin$install$1(k kVar, kotlin.coroutines.c<? super HttpPlainText$Plugin$install$1> cVar) {
        super(3, cVar);
        this.$plugin = kVar;
    }

    @Override // Ia.q
    public final Object invoke(io.ktor.util.pipeline.c<Object, io.ktor.client.request.a> cVar, Object obj, kotlin.coroutines.c<? super p293xa.r> cVar2) {
        HttpPlainText$Plugin$install$1 httpPlainText$Plugin$install$1 = new HttpPlainText$Plugin$install$1(this.$plugin, cVar2);
        httpPlainText$Plugin$install$1.L$0 = cVar;
        httpPlainText$Plugin$install$1.L$1 = obj;
        return httpPlainText$Plugin$install$1.invokeSuspend(p293xa.r.f47939a);
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0119 A[EDGE_INSN: B:51:0x0119->B:52:0x0132 BREAK  A[LOOP:0: B:39:0x00e4->B:60:0x00e4]] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Charset charset;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            io.ktor.util.pipeline.c cVar = (io.ktor.util.pipeline.c) this.L$0;
            Object obj2 = this.L$1;
            k kVar = this.$plugin;
            io.ktor.client.request.a context = (io.ktor.client.request.a) cVar.f40561b;
            kVar.getClass();
            kotlin.jvm.internal.i.e(context, "context");
            List<String> list = io.ktor.http.k.f40481a;
            io.ktor.http.h hVar = context.f40412c;
            if (hVar.g("Accept-Charset") == null) {
                cc.b bVar = n.f40377a;
                StringBuilder sb2 = new StringBuilder("Adding Accept-Charset=");
                String str = kVar.f40373c;
                sb2.append(str);
                sb2.append(" to ");
                sb2.append(context.f40410a);
                bVar.b(sb2.toString());
                hVar.h("Accept-Charset", str);
            }
            if (!(obj2 instanceof String)) {
                return p293xa.r.f47939a;
            }
            TContext tcontext = cVar.f40561b;
            C2476a c2476aB = io.ktor.http.n.b((io.ktor.http.m) tcontext);
            if (c2476aB != null) {
                if (!kotlin.jvm.internal.i.a(c2476aB.f40467d, C2476a.c.f40471a.f40467d)) {
                    return p293xa.r.f47939a;
                }
            }
            k kVar2 = this.$plugin;
            io.ktor.client.request.a aVar = (io.ktor.client.request.a) tcontext;
            String str2 = (String) obj2;
            kVar2.getClass();
            C2476a c2476a = c2476aB == null ? C2476a.c.f40471a : c2476aB;
            if (c2476aB == null || (charset = p241t7.b.c(c2476aB)) == null) {
                charset = kVar2.f40372b;
            }
            n.f40377a.b("Sending request body to " + aVar.f40410a + " as text/plain with charset " + charset);
            kotlin.jvm.internal.i.e(c2476a, "<this>");
            kotlin.jvm.internal.i.e(charset, "charset");
            String strC = p049da.a.c(charset);
            List list2 = (List) c2476a.f9363c;
            int size = list2.size();
            if (size != 0) {
                if (size == 1) {
                    io.ktor.http.e eVar = (io.ktor.http.e) list2.get(0);
                    if (!kotlin.text.m.D(eVar.f40476a, "charset", true) || !kotlin.text.m.D(eVar.f40477b, strC, true)) {
                        c2476a = new C2476a(c2476a.f40467d, c2476a.f40468e, (String) c2476a.f9362b, kotlin.collections.q.d0(list2, new io.ktor.http.e("charset", strC)));
                        break;
                    }
                } else {
                    List list3 = list2;
                    if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                        Iterator it = list3.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                c2476a = new C2476a(c2476a.f40467d, c2476a.f40468e, (String) c2476a.f9362b, kotlin.collections.q.d0(list2, new io.ktor.http.e("charset", strC)));
                                break;
                            }
                            io.ktor.http.e eVar2 = (io.ktor.http.e) it.next();
                            if (kotlin.text.m.D(eVar2.f40476a, "charset", true) && kotlin.text.m.D(eVar2.f40477b, strC, true)) {
                                break;
                            }
                        }
                    } else {
                        c2476a = new C2476a(c2476a.f40467d, c2476a.f40468e, (String) c2476a.f9362b, kotlin.collections.q.d0(list2, new io.ktor.http.e("charset", strC)));
                        break;
                    }
                }
            } else {
                c2476a = new C2476a(c2476a.f40467d, c2476a.f40468e, (String) c2476a.f9362b, kotlin.collections.q.d0(list2, new io.ktor.http.e("charset", strC)));
                break;
            }
            X9.c cVar2 = new X9.c(str2, c2476a);
            this.L$0 = null;
            this.label = 1;
            if (cVar.d(cVar2, this) == coroutineSingletons) {
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
