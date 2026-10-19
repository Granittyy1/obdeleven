package com.voltasit.obdeleven.network;

import Ia.l;
import Ia.p;
import Ia.q;
import com.voltasit.obdeleven.network.models.ErrorDTO;
import io.ktor.client.HttpClient;
import io.ktor.client.HttpClientConfig;
import io.ktor.client.engine.okhttp.OkHttpConfig;
import io.ktor.client.plugins.HttpRequestRetry;
import io.ktor.client.plugins.u;
import io.ktor.client.statement.e;
import io.ktor.client.statement.g;
import io.ktor.http.C2476a;
import io.ktor.http.o;
import io.ktor.http.x;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.i;
import kotlin.text.n;
import okhttp3.logging.HttpLoggingInterceptor;
import okhttp3.m;
import okhttp3.t;
import p293xa.r;

/* JADX INFO: compiled from: AndroidHttpClient.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f31184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<String, String> f31185b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f31186c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HttpClient f31187d;

    public a(String url, final boolean z10, String session, Map appInfoMap, final EmptyList interceptors, final p291x8.a aVar, final O.a aVar2) {
        i.e(url, "url");
        i.e(session, "session");
        i.e(appInfoMap, "appInfoMap");
        i.e(interceptors, "interceptors");
        this.f31184a = url;
        this.f31185b = appInfoMap;
        this.f31186c = session;
        this.f31187d = io.ktor.client.a.a(new l<HttpClientConfig<OkHttpConfig>, r>() { // from class: com.voltasit.obdeleven.network.AndroidHttpClient$client$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(HttpClientConfig<OkHttpConfig> httpClientConfig) {
                HttpClientConfig<OkHttpConfig> HttpClient = httpClientConfig;
                i.e(HttpClient, "$this$HttpClient");
                HttpClient.b(u.f40400d, new l<u.a, r>() { // from class: com.voltasit.obdeleven.network.AndroidHttpClient$client$1.1
                    @Override // Ia.l
                    public final r invoke(u.a aVar3) {
                        u.a install = aVar3;
                        i.e(install, "$this$install");
                        u.a.a(30000L);
                        install.f40405a = 30000L;
                        u.a.a(30000L);
                        install.f40407c = 30000L;
                        u.a.a(30000L);
                        install.f40406b = 30000L;
                        return r.f47939a;
                    }
                });
                HttpClient.b(HttpRequestRetry.f40315g, new l<HttpRequestRetry.Configuration, r>() { // from class: com.voltasit.obdeleven.network.AndroidHttpClient$client$1.2
                    @Override // Ia.l
                    public final r invoke(HttpRequestRetry.Configuration configuration) {
                        HttpRequestRetry.Configuration install = configuration;
                        i.e(install, "$this$install");
                        install.f40329f = 3;
                        AnonymousClass1 block = new q<HttpRequestRetry.e, V9.b, io.ktor.client.statement.c, Boolean>() { // from class: com.voltasit.obdeleven.network.AndroidHttpClient.client.1.2.1
                            @Override // Ia.q
                            public final Boolean invoke(HttpRequestRetry.e eVar, V9.b bVar, io.ktor.client.statement.c cVar) {
                                HttpRequestRetry.e retryIf = eVar;
                                io.ktor.client.statement.c response = cVar;
                                i.e(retryIf, "$this$retryIf");
                                i.e(bVar, "<anonymous parameter 0>");
                                i.e(response, "response");
                                io.ktor.http.q qVarF = response.f();
                                return Boolean.valueOf(i.a(qVarF, io.ktor.http.q.f40503k) || i.a(qVarF, io.ktor.http.q.j) || i.a(qVarF, io.ktor.http.q.f40504l) || i.a(qVarF, io.ktor.http.q.f40505m) || i.a(qVarF, io.ktor.http.q.f40506n) || i.a(qVarF, io.ktor.http.q.f40507o) || i.a(qVarF, io.ktor.http.q.f40508p) || i.a(qVarF, io.ktor.http.q.f40509q));
                            }
                        };
                        i.e(block, "block");
                        install.f40324a = block;
                        HttpRequestRetry.Configuration.a(install, 4000L, 13);
                        return r.f47939a;
                    }
                });
                final List<okhttp3.q> list = interceptors;
                final okhttp3.q qVar = aVar;
                final m.b bVar = aVar2;
                final boolean z11 = z10;
                HttpClient.a(new l<OkHttpConfig, r>() { // from class: com.voltasit.obdeleven.network.AndroidHttpClient$client$1.3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final r invoke(OkHttpConfig okHttpConfig) {
                        OkHttpConfig engine = okHttpConfig;
                        i.e(engine, "$this$engine");
                        final List<okhttp3.q> list2 = list;
                        final okhttp3.q qVar2 = qVar;
                        final m.b bVar2 = bVar;
                        final boolean z12 = z11;
                        engine.a(new l<t.a, r>() { // from class: com.voltasit.obdeleven.network.AndroidHttpClient.client.1.3.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final r invoke(t.a aVar3) {
                                t.a config = aVar3;
                                i.e(config, "$this$config");
                                Iterator<T> it = list2.iterator();
                                while (it.hasNext()) {
                                    config.a((okhttp3.q) it.next());
                                }
                                okhttp3.q interceptor = qVar2;
                                i.e(interceptor, "interceptor");
                                config.f45639d.add(interceptor);
                                m.b eventListenerFactory = bVar2;
                                i.e(eventListenerFactory, "eventListenerFactory");
                                config.f45640e = eventListenerFactory;
                                config.f45641f = false;
                                if (z12) {
                                    HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor(0);
                                    httpLoggingInterceptor.f45555c = HttpLoggingInterceptor.Level.f45558d;
                                    config.a(httpLoggingInterceptor);
                                }
                                return r.f47939a;
                            }
                        });
                        return r.f47939a;
                    }
                });
                return r.f47939a;
            }
        });
    }

    @Override // com.voltasit.obdeleven.network.b
    public final void a(String str) {
        this.f31186c = str;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00d6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:30:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.voltasit.obdeleven.network.b
    public final Object b(String str, String str2, Map map, Map map2, ContinuationImpl continuationImpl) throws NetworkException {
        AndroidHttpClient$post$1 androidHttpClient$post$1;
        a aVar;
        io.ktor.client.statement.c cVar;
        String str3;
        if (continuationImpl instanceof AndroidHttpClient$post$1) {
            androidHttpClient$post$1 = (AndroidHttpClient$post$1) continuationImpl;
            int i10 = androidHttpClient$post$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                androidHttpClient$post$1.label = i10 - Integer.MIN_VALUE;
            } else {
                androidHttpClient$post$1 = new AndroidHttpClient$post$1(this, continuationImpl);
            }
        } else {
            androidHttpClient$post$1 = new AndroidHttpClient$post$1(this, continuationImpl);
        }
        Object objC = androidHttpClient$post$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = androidHttpClient$post$1.label;
        if (i11 != 0) {
            if (i11 == 1) {
                a aVar2 = (a) androidHttpClient$post$1.L$0;
                kotlin.b.b(objC);
                aVar = aVar2;
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                cVar = (io.ktor.client.statement.c) androidHttpClient$post$1.L$1;
                aVar = (a) androidHttpClient$post$1.L$0;
                kotlin.b.b(objC);
            }
            str3 = (String) objC;
            if (I.b.m(cVar.f())) {
                return str3;
            }
            aVar.getClass();
            ErrorDTO errorDTO = (ErrorDTO) JsonExtensionsKt.f31179a.a(ErrorDTO.Companion.serializer(), str3);
            throw new NetworkException(errorDTO.f31190c, errorDTO.toString());
        }
        kotlin.b.b(objC);
        String str4 = this.f31184a + "/" + str;
        io.ktor.client.request.a aVar3 = new io.ktor.client.request.a();
        F8.a.p(aVar3, str4);
        d(aVar3, map);
        aVar3.f40413d = new X9.c(str2, C2476a.C0457a.f40469a);
        aVar3.b(null);
        for (Map.Entry entry : map2.entrySet()) {
            p241t7.b.v(aVar3, (String) entry.getKey(), entry.getValue());
        }
        aVar3.d(o.f40483c);
        g gVar = new g(aVar3, this.f31187d);
        androidHttpClient$post$1.L$0 = this;
        androidHttpClient$post$1.label = 1;
        objC = gVar.c(androidHttpClient$post$1);
        if (objC == coroutineSingletons) {
            return coroutineSingletons;
        }
        aVar = this;
        cVar = (io.ktor.client.statement.c) objC;
        Charset charsetForName = Charset.forName("UTF-8");
        i.d(charsetForName, "forName(UTF_8)");
        androidHttpClient$post$1.L$0 = aVar;
        androidHttpClient$post$1.L$1 = cVar;
        androidHttpClient$post$1.label = 2;
        objC = e.a(cVar, charsetForName, androidHttpClient$post$1);
        if (objC == coroutineSingletons) {
            return coroutineSingletons;
        }
        str3 = (String) objC;
        if (I.b.m(cVar.f())) {
            return str3;
        }
        aVar.getClass();
        ErrorDTO errorDTO2 = (ErrorDTO) JsonExtensionsKt.f31179a.a(ErrorDTO.Companion.serializer(), str3);
        throw new NetworkException(errorDTO2.f31190c, errorDTO2.toString());
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00be A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.voltasit.obdeleven.network.b
    public final Object c(String str, String str2, Map map, final Map map2, ContinuationImpl continuationImpl) throws NetworkException {
        AndroidHttpClient$patch$1 androidHttpClient$patch$1;
        a aVar;
        io.ktor.client.statement.c cVar;
        String str3;
        if (continuationImpl instanceof AndroidHttpClient$patch$1) {
            androidHttpClient$patch$1 = (AndroidHttpClient$patch$1) continuationImpl;
            int i10 = androidHttpClient$patch$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                androidHttpClient$patch$1.label = i10 - Integer.MIN_VALUE;
            } else {
                androidHttpClient$patch$1 = new AndroidHttpClient$patch$1(this, continuationImpl);
            }
        } else {
            androidHttpClient$patch$1 = new AndroidHttpClient$patch$1(this, continuationImpl);
        }
        Object objC = androidHttpClient$patch$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = androidHttpClient$patch$1.label;
        if (i11 != 0) {
            if (i11 == 1) {
                a aVar2 = (a) androidHttpClient$patch$1.L$0;
                kotlin.b.b(objC);
                aVar = aVar2;
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                cVar = (io.ktor.client.statement.c) androidHttpClient$patch$1.L$1;
                aVar = (a) androidHttpClient$patch$1.L$0;
                kotlin.b.b(objC);
            }
            str3 = (String) objC;
            if (I.b.m(cVar.f())) {
                return str3;
            }
            aVar.getClass();
            ErrorDTO errorDTO = (ErrorDTO) JsonExtensionsKt.f31179a.a(ErrorDTO.Companion.serializer(), str3);
            throw new NetworkException(errorDTO.f31190c, errorDTO.toString());
        }
        kotlin.b.b(objC);
        String str4 = this.f31184a + "/" + str;
        io.ktor.client.request.a aVar3 = new io.ktor.client.request.a();
        F8.a.p(aVar3, str4);
        d(aVar3, map);
        aVar3.f40413d = new X9.c(str2, C2476a.C0457a.f40469a);
        aVar3.b(null);
        p<x, x, r> pVar = new p<x, x, r>() { // from class: com.voltasit.obdeleven.network.AndroidHttpClient$patch$response$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // Ia.p
            public final r invoke(x xVar, x xVar2) {
                x url = xVar;
                x it = xVar2;
                i.e(url, "$this$url");
                i.e(it, "it");
                for (Map.Entry<String, Object> entry : map2.entrySet()) {
                    url.f40524i.d(entry.getKey(), entry.getValue().toString());
                }
                return r.f47939a;
            }
        };
        x xVar = aVar3.f40410a;
        pVar.invoke(xVar, xVar);
        aVar3.d(o.f40485e);
        g gVar = new g(aVar3, this.f31187d);
        androidHttpClient$patch$1.L$0 = this;
        androidHttpClient$patch$1.label = 1;
        objC = gVar.c(androidHttpClient$patch$1);
        if (objC == coroutineSingletons) {
            return coroutineSingletons;
        }
        aVar = this;
        cVar = (io.ktor.client.statement.c) objC;
        Charset charsetForName = Charset.forName("UTF-8");
        i.d(charsetForName, "forName(UTF_8)");
        androidHttpClient$patch$1.L$0 = aVar;
        androidHttpClient$patch$1.L$1 = cVar;
        androidHttpClient$patch$1.label = 2;
        objC = e.a(cVar, charsetForName, androidHttpClient$patch$1);
        if (objC == coroutineSingletons) {
            return coroutineSingletons;
        }
        str3 = (String) objC;
        if (I.b.m(cVar.f())) {
            return str3;
        }
        aVar.getClass();
        ErrorDTO errorDTO2 = (ErrorDTO) JsonExtensionsKt.f31179a.a(ErrorDTO.Companion.serializer(), str3);
        throw new NetworkException(errorDTO2.f31190c, errorDTO2.toString());
    }

    public final void d(io.ktor.client.request.a aVar, Map<String, String> map) {
        if (!n.S(this.f31186c)) {
            p241t7.b.u(aVar, "X-Parse-Session-Token", this.f31186c);
        }
        p241t7.b.u(aVar, "X-Language-Code", "");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            p241t7.b.u(aVar, entry.getKey(), entry.getValue());
        }
        for (Map.Entry<String, String> entry2 : this.f31185b.entrySet()) {
            p241t7.b.u(aVar, entry2.getKey(), entry2.getValue());
        }
    }
}
