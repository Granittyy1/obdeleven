package com.voltasit.sharednetwork.dataSources;

import Ia.l;
import Ia.p;
import com.voltasit.sharednetwork.domain.common.CloudException;
import com.voltasit.sharednetwork.domain.exceptions.HttpException;
import io.ktor.client.HttpClient;
import io.ktor.client.statement.c;
import io.ktor.client.statement.e;
import io.ktor.client.statement.g;
import io.ktor.http.C2476a;
import io.ktor.http.o;
import io.ktor.http.q;
import io.ktor.http.x;
import java.nio.charset.Charset;
import java.util.Map;
import kotlin.collections.y;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.i;
import kotlin.text.n;
import kotlinx.serialization.SerializationException;
import p050db.AbstractC2184a;
import p050db.d;
import p050db.r;
import p050db.s;
import p304y9.w;
import p304y9.z;

/* JADX INFO: compiled from: BaseParseKtorClient.kt */
/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseParseKtorClient implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f34437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f34438b = s.a(new l<d, p293xa.r>() { // from class: com.voltasit.sharednetwork.dataSources.BaseParseKtorClient$json$1
        @Override // Ia.l
        public final p293xa.r invoke(d dVar) {
            d Json = dVar;
            i.e(Json, "$this$Json");
            Json.f34653c = true;
            return p293xa.r.f47939a;
        }
    });

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object j(BaseParseKtorClient baseParseKtorClient, String str, String str2, ContinuationImpl continuationImpl) throws CloudException {
        BaseParseKtorClient$getClasses$1 baseParseKtorClient$getClasses$1;
        AbstractC2184a abstractC2184aA;
        Ya.a aVarSerializer;
        String str3;
        if (continuationImpl instanceof BaseParseKtorClient$getClasses$1) {
            baseParseKtorClient$getClasses$1 = (BaseParseKtorClient$getClasses$1) continuationImpl;
            int i10 = baseParseKtorClient$getClasses$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                baseParseKtorClient$getClasses$1.label = i10 - Integer.MIN_VALUE;
            } else {
                baseParseKtorClient$getClasses$1 = new BaseParseKtorClient$getClasses$1(baseParseKtorClient, continuationImpl);
            }
        } else {
            baseParseKtorClient$getClasses$1 = new BaseParseKtorClient$getClasses$1(baseParseKtorClient, continuationImpl);
        }
        Object objC = baseParseKtorClient$getClasses$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = baseParseKtorClient$getClasses$1.label;
        if (i11 == 0) {
            kotlin.b.b(objC);
            baseParseKtorClient$getClasses$1.label = 1;
            String str4 = baseParseKtorClient.i() + "/classes/" + str + "?" + str2;
            HttpClient httpClientK = baseParseKtorClient.k();
            io.ktor.client.request.a aVar = new io.ktor.client.request.a();
            F8.a.p(aVar, str4);
            baseParseKtorClient.q(aVar, y.p());
            aVar.d(o.f40482b);
            objC = new g(aVar, httpClientK).c(baseParseKtorClient$getClasses$1);
            if (objC == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i11 != 1) {
                if (i11 == 2) {
                    kotlin.b.b(objC);
                }
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVarSerializer = (Ya.a) baseParseKtorClient$getClasses$1.L$1;
                abstractC2184aA = (AbstractC2184a) baseParseKtorClient$getClasses$1.L$0;
                kotlin.b.b(objC);
                w wVar = (w) abstractC2184aA.a(aVarSerializer, (String) objC);
                int i12 = CloudException.f34455b;
                int i13 = wVar.f48657a;
                str3 = wVar.f48658b;
                if (str3 == null && (str3 = wVar.f48659c) == null) {
                    str3 = "No error or message field in parse response";
                }
                throw CloudException.a.a(i13, str3);
            }
            kotlin.b.b(objC);
        }
        c cVar = (c) objC;
        if (i.a(cVar.f(), q.f40502i)) {
            throw CloudException.NotFoundException.f34457c;
        }
        if (I.b.m(cVar.f())) {
            baseParseKtorClient$getClasses$1.label = 2;
            objC = e.a(cVar, kotlin.text.a.f43120b, baseParseKtorClient$getClasses$1);
            return objC == coroutineSingletons ? coroutineSingletons : objC;
        }
        abstractC2184aA = s.a(new l<d, p293xa.r>() { // from class: com.voltasit.sharednetwork.dataSources.BaseParseKtorClient$getClasses$parseError$1
            @Override // Ia.l
            public final p293xa.r invoke(d dVar) {
                d Json = dVar;
                i.e(Json, "$this$Json");
                Json.f34653c = true;
                return p293xa.r.f47939a;
            }
        });
        aVarSerializer = w.Companion.serializer();
        Charset charsetForName = Charset.forName("UTF-8");
        i.d(charsetForName, "forName(...)");
        baseParseKtorClient$getClasses$1.L$0 = abstractC2184aA;
        baseParseKtorClient$getClasses$1.L$1 = aVarSerializer;
        baseParseKtorClient$getClasses$1.label = 3;
        objC = e.a(cVar, charsetForName, baseParseKtorClient$getClasses$1);
        if (objC == coroutineSingletons) {
            return coroutineSingletons;
        }
        w wVar2 = (w) abstractC2184aA.a(aVarSerializer, (String) objC);
        int i14 = CloudException.f34455b;
        int i15 = wVar2.f48657a;
        str3 = wVar2.f48658b;
        if (str3 == null) {
            str3 = "No error or message field in parse response";
        }
        throw CloudException.a.a(i15, str3);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:47:0x0120  */
    /* JADX WARN: Code duplicated, block: B:49:0x0136 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:50:0x0137  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object m(BaseParseKtorClient baseParseKtorClient, String str, Map map, String str2, Map map2, ContinuationImpl continuationImpl) throws HttpException, CloudException {
        BaseParseKtorClient$post$1 baseParseKtorClient$post$1;
        BaseParseKtorClient baseParseKtorClient2;
        c cVar;
        String str3;
        int i10;
        int i11;
        String str4;
        if (continuationImpl instanceof BaseParseKtorClient$post$1) {
            baseParseKtorClient$post$1 = (BaseParseKtorClient$post$1) continuationImpl;
            int i12 = baseParseKtorClient$post$1.label;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                baseParseKtorClient$post$1.label = i12 - Integer.MIN_VALUE;
            } else {
                baseParseKtorClient$post$1 = new BaseParseKtorClient$post$1(baseParseKtorClient, continuationImpl);
            }
        } else {
            baseParseKtorClient$post$1 = new BaseParseKtorClient$post$1(baseParseKtorClient, continuationImpl);
        }
        Object objC = baseParseKtorClient$post$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i13 = baseParseKtorClient$post$1.label;
        if (i13 != 0) {
            if (i13 == 1) {
                baseParseKtorClient = (BaseParseKtorClient) baseParseKtorClient$post$1.L$0;
                kotlin.b.b(objC);
            } else if (i13 == 2) {
                cVar = (c) baseParseKtorClient$post$1.L$1;
                baseParseKtorClient2 = (BaseParseKtorClient) baseParseKtorClient$post$1.L$0;
                kotlin.b.b(objC);
                str3 = (String) objC;
                if (!I.b.m(cVar.f())) {
                    baseParseKtorClient2.getClass();
                    if (!i.a(cVar.f(), q.f40502i) && !n.J(str3, "Your account is locked due to multiple failed login attempts.", false)) {
                        throw CloudException.NotFoundException.f34457c;
                    }
                    try {
                        w wVar = (w) baseParseKtorClient2.f34438b.a(w.Companion.serializer(), str3);
                        int i14 = CloudException.f34455b;
                        int i15 = wVar.f48657a;
                        str4 = wVar.f48658b;
                        if (str4 == null && (str4 = wVar.f48659c) == null) {
                            str4 = "No error or message field in parse response";
                        }
                        throw CloudException.a.a(i15, str4);
                    } catch (SerializationException unused) {
                        throw new HttpException(cVar.f().f40511b, str3);
                    }
                }
                i10 = cVar.f().f40511b;
                baseParseKtorClient$post$1.L$0 = null;
                baseParseKtorClient$post$1.L$1 = null;
                baseParseKtorClient$post$1.I$0 = i10;
                baseParseKtorClient$post$1.label = 3;
                objC = e.a(cVar, kotlin.text.a.f43120b, baseParseKtorClient$post$1);
                if (objC == coroutineSingletons) {
                    return coroutineSingletons;
                }
                i11 = i10;
            } else {
                if (i13 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i11 = baseParseKtorClient$post$1.I$0;
                kotlin.b.b(objC);
            }
            return new z(i11, (String) objC);
        }
        kotlin.b.b(objC);
        String strF = O.a.f(baseParseKtorClient.i(), "/", str);
        HttpClient httpClientK = baseParseKtorClient.k();
        io.ktor.client.request.a aVar = new io.ktor.client.request.a();
        F8.a.p(aVar, strF);
        baseParseKtorClient.q(aVar, map2);
        aVar.f40413d = new X9.c(str2, C2476a.C0457a.f40469a);
        aVar.b(null);
        for (Map.Entry entry : map.entrySet()) {
            p241t7.b.v(aVar, (String) entry.getKey(), entry.getValue());
        }
        aVar.d(o.f40483c);
        g gVar = new g(aVar, httpClientK);
        baseParseKtorClient$post$1.L$0 = baseParseKtorClient;
        baseParseKtorClient$post$1.label = 1;
        objC = gVar.c(baseParseKtorClient$post$1);
        if (objC == coroutineSingletons) {
            return coroutineSingletons;
        }
        c cVar2 = (c) objC;
        Charset charsetForName = Charset.forName("UTF-8");
        i.d(charsetForName, "forName(...)");
        baseParseKtorClient$post$1.L$0 = baseParseKtorClient;
        baseParseKtorClient$post$1.L$1 = cVar2;
        baseParseKtorClient$post$1.label = 2;
        objC = e.a(cVar2, charsetForName, baseParseKtorClient$post$1);
        if (objC == coroutineSingletons) {
            return coroutineSingletons;
        }
        baseParseKtorClient2 = baseParseKtorClient;
        cVar = cVar2;
        str3 = (String) objC;
        if (!I.b.m(cVar.f())) {
            baseParseKtorClient2.getClass();
            if (!i.a(cVar.f(), q.f40502i)) {
            }
            w wVar2 = (w) baseParseKtorClient2.f34438b.a(w.Companion.serializer(), str3);
            int i16 = CloudException.f34455b;
            int i17 = wVar2.f48657a;
            str4 = wVar2.f48658b;
            if (str4 == null) {
                str4 = "No error or message field in parse response";
            }
            throw CloudException.a.a(i17, str4);
        }
        i10 = cVar.f().f40511b;
        baseParseKtorClient$post$1.L$0 = null;
        baseParseKtorClient$post$1.L$1 = null;
        baseParseKtorClient$post$1.I$0 = i10;
        baseParseKtorClient$post$1.label = 3;
        objC = e.a(cVar, kotlin.text.a.f43120b, baseParseKtorClient$post$1);
        if (objC == coroutineSingletons) {
            return coroutineSingletons;
        }
        i11 = i10;
        return new z(i11, (String) objC);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object n(BaseParseKtorClient baseParseKtorClient, String str, Map map, String str2, Map map2, ContinuationImpl continuationImpl) throws CloudException {
        BaseParseKtorClient$postOld$1 baseParseKtorClient$postOld$1;
        AbstractC2184a abstractC2184aA;
        Ya.a aVarSerializer;
        String str3;
        if (continuationImpl instanceof BaseParseKtorClient$postOld$1) {
            baseParseKtorClient$postOld$1 = (BaseParseKtorClient$postOld$1) continuationImpl;
            int i10 = baseParseKtorClient$postOld$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                baseParseKtorClient$postOld$1.label = i10 - Integer.MIN_VALUE;
            } else {
                baseParseKtorClient$postOld$1 = new BaseParseKtorClient$postOld$1(baseParseKtorClient, continuationImpl);
            }
        } else {
            baseParseKtorClient$postOld$1 = new BaseParseKtorClient$postOld$1(baseParseKtorClient, continuationImpl);
        }
        Object objC = baseParseKtorClient$postOld$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = baseParseKtorClient$postOld$1.label;
        if (i11 == 0) {
            kotlin.b.b(objC);
            String strF = O.a.f(baseParseKtorClient.i(), "/functions/", str);
            HttpClient httpClientK = baseParseKtorClient.k();
            io.ktor.client.request.a aVar = new io.ktor.client.request.a();
            F8.a.p(aVar, strF);
            baseParseKtorClient.q(aVar, map2);
            aVar.f40413d = new X9.c(str2, C2476a.C0457a.f40469a);
            aVar.b(null);
            for (Map.Entry entry : map.entrySet()) {
                p241t7.b.v(aVar, (String) entry.getKey(), entry.getValue());
            }
            aVar.d(o.f40483c);
            g gVar = new g(aVar, httpClientK);
            baseParseKtorClient$postOld$1.label = 1;
            objC = gVar.c(baseParseKtorClient$postOld$1);
            if (objC == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        kotlin.b.b(objC);
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVarSerializer = (Ya.a) baseParseKtorClient$postOld$1.L$1;
                abstractC2184aA = (AbstractC2184a) baseParseKtorClient$postOld$1.L$0;
                kotlin.b.b(objC);
                w wVar = (w) abstractC2184aA.a(aVarSerializer, (String) objC);
                int i12 = CloudException.f34455b;
                int i13 = wVar.f48657a;
                str3 = wVar.f48658b;
                if (str3 == null && (str3 = wVar.f48659c) == null) {
                    str3 = "No error or message field in parse response";
                }
                throw CloudException.a.a(i13, str3);
            }
            kotlin.b.b(objC);
        }
        c cVar = (c) objC;
        if (i.a(cVar.f(), q.f40502i)) {
            throw CloudException.NotFoundException.f34457c;
        }
        if (I.b.m(cVar.f())) {
            baseParseKtorClient$postOld$1.label = 3;
            objC = e.a(cVar, kotlin.text.a.f43120b, baseParseKtorClient$postOld$1);
            return objC == coroutineSingletons ? coroutineSingletons : objC;
        }
        abstractC2184aA = s.a(new l<d, p293xa.r>() { // from class: com.voltasit.sharednetwork.dataSources.BaseParseKtorClient$postOld$parseError$1
            @Override // Ia.l
            public final p293xa.r invoke(d dVar) {
                d Json = dVar;
                i.e(Json, "$this$Json");
                Json.f34653c = true;
                return p293xa.r.f47939a;
            }
        });
        aVarSerializer = w.Companion.serializer();
        Charset charsetForName = Charset.forName("UTF-8");
        i.d(charsetForName, "forName(...)");
        baseParseKtorClient$postOld$1.L$0 = abstractC2184aA;
        baseParseKtorClient$postOld$1.L$1 = aVarSerializer;
        baseParseKtorClient$postOld$1.label = 2;
        objC = e.a(cVar, charsetForName, baseParseKtorClient$postOld$1);
        if (objC == coroutineSingletons) {
            return coroutineSingletons;
        }
        w wVar2 = (w) abstractC2184aA.a(aVarSerializer, (String) objC);
        int i14 = CloudException.f34455b;
        int i15 = wVar2.f48657a;
        str3 = wVar2.f48658b;
        if (str3 == null) {
            str3 = "No error or message field in parse response";
        }
        throw CloudException.a.a(i15, str3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object o(BaseParseKtorClient baseParseKtorClient, String str, Map map, String str2, ContinuationImpl continuationImpl) throws CloudException {
        BaseParseKtorClient$put$1 baseParseKtorClient$put$1;
        int i10;
        AbstractC2184a abstractC2184aA;
        Ya.a aVarSerializer;
        String str3;
        if (continuationImpl instanceof BaseParseKtorClient$put$1) {
            baseParseKtorClient$put$1 = (BaseParseKtorClient$put$1) continuationImpl;
            int i11 = baseParseKtorClient$put$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                baseParseKtorClient$put$1.label = i11 - Integer.MIN_VALUE;
            } else {
                baseParseKtorClient$put$1 = new BaseParseKtorClient$put$1(baseParseKtorClient, continuationImpl);
            }
        } else {
            baseParseKtorClient$put$1 = new BaseParseKtorClient$put$1(baseParseKtorClient, continuationImpl);
        }
        Object objC = baseParseKtorClient$put$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i12 = baseParseKtorClient$put$1.label;
        if (i12 == 0) {
            kotlin.b.b(objC);
            String strF = O.a.f(baseParseKtorClient.i(), "/", str);
            HttpClient httpClientK = baseParseKtorClient.k();
            io.ktor.client.request.a aVar = new io.ktor.client.request.a();
            F8.a.p(aVar, strF);
            baseParseKtorClient.q(aVar, y.p());
            aVar.f40413d = new X9.c(str2, C2476a.C0457a.f40469a);
            aVar.b(null);
            for (Map.Entry entry : map.entrySet()) {
                p241t7.b.v(aVar, (String) entry.getKey(), entry.getValue());
            }
            aVar.d(o.f40484d);
            g gVar = new g(aVar, httpClientK);
            baseParseKtorClient$put$1.label = 1;
            objC = gVar.c(baseParseKtorClient$put$1);
            if (objC == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i10 = baseParseKtorClient$put$1.I$0;
                    kotlin.b.b(objC);
                    return new z(i10, (String) objC);
                }
                aVarSerializer = (Ya.a) baseParseKtorClient$put$1.L$1;
                abstractC2184aA = (AbstractC2184a) baseParseKtorClient$put$1.L$0;
                kotlin.b.b(objC);
                w wVar = (w) abstractC2184aA.a(aVarSerializer, (String) objC);
                int i13 = CloudException.f34455b;
                int i14 = wVar.f48657a;
                str3 = wVar.f48658b;
                if (str3 == null && (str3 = wVar.f48659c) == null) {
                    str3 = "No error or message field in parse response";
                }
                throw CloudException.a.a(i14, str3);
            }
            kotlin.b.b(objC);
        }
        c cVar = (c) objC;
        if (i.a(cVar.f(), q.f40502i)) {
            throw CloudException.NotFoundException.f34457c;
        }
        if (I.b.m(cVar.f())) {
            i10 = cVar.f().f40511b;
            baseParseKtorClient$put$1.I$0 = i10;
            baseParseKtorClient$put$1.label = 3;
            objC = e.a(cVar, kotlin.text.a.f43120b, baseParseKtorClient$put$1);
            if (objC == coroutineSingletons) {
                return coroutineSingletons;
            }
            return new z(i10, (String) objC);
        }
        abstractC2184aA = s.a(new l<d, p293xa.r>() { // from class: com.voltasit.sharednetwork.dataSources.BaseParseKtorClient$put$parseError$1
            @Override // Ia.l
            public final p293xa.r invoke(d dVar) {
                d Json = dVar;
                i.e(Json, "$this$Json");
                Json.f34653c = true;
                return p293xa.r.f47939a;
            }
        });
        aVarSerializer = w.Companion.serializer();
        Charset charsetForName = Charset.forName("UTF-8");
        i.d(charsetForName, "forName(...)");
        baseParseKtorClient$put$1.L$0 = abstractC2184aA;
        baseParseKtorClient$put$1.L$1 = aVarSerializer;
        baseParseKtorClient$put$1.label = 2;
        objC = e.a(cVar, charsetForName, baseParseKtorClient$put$1);
        if (objC == coroutineSingletons) {
            return coroutineSingletons;
        }
        w wVar2 = (w) abstractC2184aA.a(aVarSerializer, (String) objC);
        int i15 = CloudException.f34455b;
        int i16 = wVar2.f48657a;
        str3 = wVar2.f48658b;
        if (str3 == null) {
            str3 = "No error or message field in parse response";
        }
        throw CloudException.a.a(i16, str3);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object p(BaseParseKtorClient baseParseKtorClient, String str, l lVar, ContinuationImpl continuationImpl) throws CloudException {
        BaseParseKtorClient$request$1 baseParseKtorClient$request$1;
        AbstractC2184a abstractC2184a;
        Ya.a aVar;
        AbstractC2184a abstractC2184a2;
        Ya.a aVar2;
        String str2;
        String str3;
        if (continuationImpl instanceof BaseParseKtorClient$request$1) {
            baseParseKtorClient$request$1 = (BaseParseKtorClient$request$1) continuationImpl;
            int i10 = baseParseKtorClient$request$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                baseParseKtorClient$request$1.label = i10 - Integer.MIN_VALUE;
            } else {
                baseParseKtorClient$request$1 = new BaseParseKtorClient$request$1(baseParseKtorClient, continuationImpl);
            }
        } else {
            baseParseKtorClient$request$1 = new BaseParseKtorClient$request$1(baseParseKtorClient, continuationImpl);
        }
        Object objC = baseParseKtorClient$request$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = baseParseKtorClient$request$1.label;
        try {
            if (i11 == 0) {
                kotlin.b.b(objC);
                final String strF = O.a.f(baseParseKtorClient.i(), "/classes/", str);
                HttpClient httpClientK = baseParseKtorClient.k();
                io.ktor.client.request.a aVar3 = new io.ktor.client.request.a();
                p<x, x, p293xa.r> pVar = new p<x, x, p293xa.r>() { // from class: com.voltasit.sharednetwork.dataSources.BaseParseKtorClient$request$result$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(x xVar, x xVar2) {
                        x url = xVar;
                        x it = xVar2;
                        i.e(url, "$this$url");
                        i.e(it, "it");
                        io.ktor.http.z.b(url, strF);
                        return p293xa.r.f47939a;
                    }
                };
                x xVar = aVar3.f40410a;
                pVar.invoke(xVar, xVar);
                baseParseKtorClient.q(aVar3, y.p());
                lVar.invoke(aVar3);
                g gVar = new g(aVar3, httpClientK);
                baseParseKtorClient$request$1.label = 1;
                objC = gVar.c(baseParseKtorClient$request$1);
                if (objC == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i11 != 1) {
                    if (i11 == 2) {
                        aVar2 = (Ya.a) baseParseKtorClient$request$1.L$1;
                        abstractC2184a2 = (AbstractC2184a) baseParseKtorClient$request$1.L$0;
                        kotlin.b.b(objC);
                        w wVar = (w) abstractC2184a2.a(aVar2, (String) objC);
                        int i12 = wVar.f48657a;
                        str2 = wVar.f48658b;
                        if (str2 == null) {
                            str2 = "Unknown";
                        }
                        throw new CloudException.ParseNotFoundException(i12, str2);
                    }
                    if (i11 != 3) {
                        if (i11 == 4) {
                            kotlin.b.b(objC);
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar = (Ya.a) baseParseKtorClient$request$1.L$1;
                    abstractC2184a = (AbstractC2184a) baseParseKtorClient$request$1.L$0;
                    kotlin.b.b(objC);
                    w wVar2 = (w) abstractC2184a.a(aVar, (String) objC);
                    int i13 = CloudException.f34455b;
                    int i14 = wVar2.f48657a;
                    str3 = wVar2.f48658b;
                    if (str3 == null && (str3 = wVar2.f48659c) == null) {
                        str3 = "No error or message field in parse response";
                    }
                    throw CloudException.a.a(i14, str3);
                }
                kotlin.b.b(objC);
            }
            c cVar = (c) objC;
            if (i.a(cVar.f(), q.f40502i)) {
                r rVarA = s.a(new l<d, p293xa.r>() { // from class: com.voltasit.sharednetwork.dataSources.BaseParseKtorClient$request$cloudException$parseError$1
                    @Override // Ia.l
                    public final p293xa.r invoke(d dVar) {
                        d Json = dVar;
                        i.e(Json, "$this$Json");
                        Json.f34653c = true;
                        return p293xa.r.f47939a;
                    }
                });
                Ya.b<w> bVarSerializer = w.Companion.serializer();
                Charset charsetForName = Charset.forName("UTF-8");
                i.d(charsetForName, "forName(...)");
                baseParseKtorClient$request$1.L$0 = rVarA;
                baseParseKtorClient$request$1.L$1 = bVarSerializer;
                baseParseKtorClient$request$1.label = 2;
                objC = e.a(cVar, charsetForName, baseParseKtorClient$request$1);
                if (objC == coroutineSingletons) {
                    return coroutineSingletons;
                }
                abstractC2184a2 = rVarA;
                aVar2 = bVarSerializer;
                w wVar3 = (w) abstractC2184a2.a(aVar2, (String) objC);
                int i15 = wVar3.f48657a;
                str2 = wVar3.f48658b;
                if (str2 == null) {
                    str2 = "Unknown";
                }
                throw new CloudException.ParseNotFoundException(i15, str2);
            }
            if (I.b.m(cVar.f())) {
                baseParseKtorClient$request$1.label = 4;
                objC = e.a(cVar, kotlin.text.a.f43120b, baseParseKtorClient$request$1);
                return objC == coroutineSingletons ? coroutineSingletons : objC;
            }
            r rVarA2 = s.a(new l<d, p293xa.r>() { // from class: com.voltasit.sharednetwork.dataSources.BaseParseKtorClient$request$parseError$1
                @Override // Ia.l
                public final p293xa.r invoke(d dVar) {
                    d Json = dVar;
                    i.e(Json, "$this$Json");
                    Json.f34653c = true;
                    return p293xa.r.f47939a;
                }
            });
            Ya.b<w> bVarSerializer2 = w.Companion.serializer();
            Charset charsetForName2 = Charset.forName("UTF-8");
            i.d(charsetForName2, "forName(...)");
            baseParseKtorClient$request$1.L$0 = rVarA2;
            baseParseKtorClient$request$1.L$1 = bVarSerializer2;
            baseParseKtorClient$request$1.label = 3;
            objC = e.a(cVar, charsetForName2, baseParseKtorClient$request$1);
            if (objC == coroutineSingletons) {
                return coroutineSingletons;
            }
            abstractC2184a = rVarA2;
            aVar = bVarSerializer2;
            w wVar4 = (w) abstractC2184a.a(aVar, (String) objC);
            int i16 = CloudException.f34455b;
            int i17 = wVar4.f48657a;
            str3 = wVar4.f48658b;
            if (str3 == null) {
                str3 = "No error or message field in parse response";
            }
            throw CloudException.a.a(i17, str3);
        } catch (SerializationException unused) {
            throw CloudException.NotFoundException.f34457c;
        }
    }

    @Override // com.voltasit.sharednetwork.dataSources.a
    public final void a(String str) {
        this.f34437a = str;
    }

    @Override // com.voltasit.sharednetwork.dataSources.a
    public final Object b(String str, String str2, Map map, Map map2, ContinuationImpl continuationImpl) {
        return m(this, str, map, str2, map2, continuationImpl);
    }

    @Override // com.voltasit.sharednetwork.dataSources.a
    public final Object c(l lVar, kotlin.coroutines.c cVar) {
        return p(this, "UserPersonalInfo", lVar, (ContinuationImpl) cVar);
    }

    @Override // com.voltasit.sharednetwork.dataSources.a
    public final Object d(String str, String str2, Map map, Map map2, ContinuationImpl continuationImpl) {
        return n(this, str, map, str2, map2, continuationImpl);
    }

    @Override // com.voltasit.sharednetwork.dataSources.a
    public final Object e(String str, String str2, ContinuationImpl continuationImpl) {
        return j(this, str, str2, continuationImpl);
    }

    @Override // com.voltasit.sharednetwork.dataSources.a
    public final Object f(String str, String str2, Map map, kotlin.coroutines.c cVar) {
        return o(this, str, map, str2, (ContinuationImpl) cVar);
    }

    public abstract Map<String, String> g();

    public abstract String h();

    public abstract String i();

    public abstract HttpClient k();

    public abstract String l();

    public final void q(io.ktor.client.request.a aVar, Map<String, String> map) {
        p241t7.b.u(aVar, "X-Parse-Application-Id", h());
        p241t7.b.u(aVar, "X-Parse-Session-Token", this.f34437a);
        p241t7.b.u(aVar, "X-Mobile-Installation-Id", l());
        p241t7.b.u(aVar, "OS", "android");
        p241t7.b.u(aVar, "Connection", "close");
        for (Map.Entry<String, String> entry : g().entrySet()) {
            p241t7.b.u(aVar, entry.getKey(), entry.getValue());
        }
        for (Map.Entry<String, String> entry2 : map.entrySet()) {
            p241t7.b.u(aVar, entry2.getKey(), entry2.getValue());
        }
    }
}
