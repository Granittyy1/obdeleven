package io.ktor.client.engine.okhttp;

import Aa.c;
import Ia.l;
import Ia.p;
import com.google.android.gms.internal.common.h;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import io.ktor.client.call.UnsupportedContentTypeException;
import io.ktor.client.engine.HttpClientEngineBase;
import io.ktor.client.engine.f;
import io.ktor.client.plugins.u;
import io.ktor.http.k;
import io.ktor.http.o;
import io.ktor.http.q;
import io.ktor.util.LRUCache;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.j;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.regex.Pattern;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.B;
import kotlin.coroutines.e;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.A;
import kotlinx.coroutines.B0;
import kotlinx.coroutines.C2673a0;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.C2693i;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.InterfaceC2694i0;
import kotlinx.coroutines.InterfaceC2707q;
import kotlinx.coroutines.InterfaceC2713x;
import me.zhanghai.android.materialprogressbar.R;
import okhttp3.Protocol;
import okhttp3.t;
import okhttp3.y;
import okhttp3.z;
import p293xa.g;
import p293xa.r;
import p318zb.InterfaceC2841h;

/* JADX INFO: compiled from: OkHttpEngine.kt */
/* JADX INFO: loaded from: classes.dex */
public final class OkHttpEngine extends HttpClientEngineBase {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final g<t> f40294k = kotlin.a.a(new Ia.a<t>() { // from class: io.ktor.client.engine.okhttp.OkHttpEngine$Companion$okHttpClientPrototype$2
        @Override // Ia.a
        public final t invoke() {
            return new t(new t.a());
        }
    });

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final OkHttpConfig f40295f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Set<io.ktor.client.engine.b<?>> f40296g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e f40297h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final e f40298i;
    public final Map<u.a, t> j;

    /* JADX INFO: renamed from: io.ktor.client.engine.okhttp.OkHttpEngine$1, reason: invalid class name */
    /* JADX INFO: compiled from: OkHttpEngine.kt */
    @c(c = "io.ktor.client.engine.okhttp.OkHttpEngine$1", f = "OkHttpEngine.kt", l = {R.styleable.AppCompatTheme_colorAccent}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
        int label;

        public AnonymousClass1(kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return OkHttpEngine.this.new AnonymousClass1(cVar);
        }

        @Override // Ia.p
        public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
            return ((AnonymousClass1) create(a10, cVar)).invokeSuspend(r.f47939a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i10 = this.label;
            try {
                if (i10 == 0) {
                    kotlin.b.b(obj);
                    e.a aVar = OkHttpEngine.this.f40297h.get(InterfaceC2694i0.b.f43449b);
                    i.b(aVar);
                    this.label = 1;
                    if (((InterfaceC2694i0) aVar).C(this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.b.b(obj);
                }
                Iterator<Map.Entry<u.a, t>> it = OkHttpEngine.this.j.entrySet().iterator();
                while (it.hasNext()) {
                    t value = it.next().getValue();
                    value.f45612c.b();
                    ((ThreadPoolExecutor) value.f45611b.a()).shutdown();
                }
                return r.f47939a;
            } catch (Throwable th) {
                Iterator<Map.Entry<u.a, t>> it2 = OkHttpEngine.this.j.entrySet().iterator();
                while (it2.hasNext()) {
                    t value2 = it2.next().getValue();
                    value2.f45612c.b();
                    ((ThreadPoolExecutor) value2.f45611b.a()).shutdown();
                }
                throw th;
            }
        }
    }

    public OkHttpEngine(OkHttpConfig okHttpConfig) {
        super("ktor-okhttp");
        this.f40295f = okHttpConfig;
        this.f40296g = B.C(u.f40400d, U9.a.f6567a);
        OkHttpEngine$clientCache$1 okHttpEngine$clientCache$1 = new OkHttpEngine$clientCache$1(1, this, OkHttpEngine.class, "createOkHttpClient", "createOkHttpClient(Lio/ktor/client/plugins/HttpTimeout$HttpTimeoutCapabilityConfiguration;)Lokhttp3/OkHttpClient;", 0);
        OkHttpEngine$clientCache$2 close = new l<t, r>() { // from class: io.ktor.client.engine.okhttp.OkHttpEngine$clientCache$2
            @Override // Ia.l
            public final r invoke(t tVar) {
                t it = tVar;
                i.e(it, "it");
                return r.f47939a;
            }
        };
        i.e(close, "close");
        Map<u.a, t> mapSynchronizedMap = Collections.synchronizedMap(new LRUCache(okHttpEngine$clientCache$1, close, okHttpConfig.f40292b));
        i.d(mapSynchronizedMap, "synchronizedMap(LRUCache…upplier, close, maxSize))");
        this.j = mapSynchronizedMap;
        e.a aVar = super.getCoroutineContext().get(InterfaceC2694i0.b.f43449b);
        i.b(aVar);
        e eVarD = e.a.C0479a.d(new B0((InterfaceC2694i0) aVar), new io.ktor.util.g(InterfaceC2713x.a.f43616b));
        this.f40297h = eVarD;
        this.f40298i = super.getCoroutineContext().plus(eVarD);
        C2680e.b(C2673a0.f43223b, super.getCoroutineContext(), CoroutineStart.f43168d, new AnonymousClass1(null));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // io.ktor.client.engine.a
    public final Object C0(V9.c cVar, ContinuationImpl continuationImpl) {
        OkHttpEngine$execute$1 okHttpEngine$execute$1;
        OkHttpEngine okHttpEngine;
        y yVarB;
        if (continuationImpl instanceof OkHttpEngine$execute$1) {
            okHttpEngine$execute$1 = (OkHttpEngine$execute$1) continuationImpl;
            int i10 = okHttpEngine$execute$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                okHttpEngine$execute$1.label = i10 - Integer.MIN_VALUE;
            } else {
                okHttpEngine$execute$1 = new OkHttpEngine$execute$1(this, continuationImpl);
            }
        } else {
            okHttpEngine$execute$1 = new OkHttpEngine$execute$1(this, continuationImpl);
        }
        OkHttpEngine$execute$1 okHttpEngine$execute$2 = okHttpEngine$execute$1;
        Object objB = okHttpEngine$execute$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = okHttpEngine$execute$2.label;
        if (i11 != 0) {
            if (i11 == 1) {
                cVar = (V9.c) okHttpEngine$execute$2.L$1;
                okHttpEngine = (OkHttpEngine) okHttpEngine$execute$2.L$0;
                kotlin.b.b(objB);
            } else {
                if (i11 == 2) {
                    kotlin.b.b(objB);
                    return objB;
                }
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(objB);
            }
        }
        kotlin.b.b(objB);
        okHttpEngine$execute$2.L$0 = this;
        okHttpEngine$execute$2.L$1 = cVar;
        okHttpEngine$execute$2.label = 1;
        Set<String> set = io.ktor.client.engine.g.f40290a;
        e.a aVar = okHttpEngine$execute$2.getContext().get(f.f40288c);
        i.b(aVar);
        objB = ((f) aVar).f40289b;
        if (objB == coroutineSingletons) {
            return coroutineSingletons;
        }
        okHttpEngine = this;
        V9.c cVar2 = cVar;
        final e callContext = (e) objB;
        final okhttp3.u.a aVar2 = new okhttp3.u.a();
        aVar2.g(cVar2.f6849a.f40454h);
        p<String, String, r> pVar = new p<String, String, r>() { // from class: io.ktor.client.engine.okhttp.OkHttpEngineKt$convertToOkHttpRequest$1$1
            {
                super(2);
            }

            @Override // Ia.p
            public final r invoke(String str, String str2) {
                String key = str;
                String value = str2;
                i.e(key, "key");
                i.e(value, "value");
                List<String> list = k.f40481a;
                if (!key.equals("Content-Length")) {
                    okhttp3.u.a aVar3 = aVar2;
                    aVar3.getClass();
                    aVar3.f45669c.a(key, value);
                }
                return r.f47939a;
            }
        };
        io.ktor.http.i iVar = cVar2.f6851c;
        final X9.b content = cVar2.f6852d;
        io.ktor.client.engine.g.a(iVar, content, pVar);
        o oVar = cVar2.f6850b;
        if (S4.o.m(oVar.f40488a)) {
            i.e(callContext, "callContext");
            if (content instanceof X9.b.a) {
                byte[] bArrD = ((X9.b.a) content).d();
                y.a aVar3 = y.Companion;
                Pattern pattern = okhttp3.r.f45588d;
                okhttp3.r rVarB = okhttp3.r.a.b(String.valueOf(content.b()));
                int length = bArrD.length;
                aVar3.getClass();
                yVarB = y.a.b(rVarB, bArrD, 0, length);
            } else if (content instanceof X9.b.c) {
                yVarB = new b(content.a(), new Ia.a<ByteReadChannel>() { // from class: io.ktor.client.engine.okhttp.OkHttpEngineKt$convertToOkHttpBody$2
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final ByteReadChannel invoke() {
                        return ((X9.b.c) content).d();
                    }
                });
            } else if (content instanceof X9.b.d) {
                yVarB = new b(content.a(), new Ia.a<ByteReadChannel>() { // from class: io.ktor.client.engine.okhttp.OkHttpEngineKt$convertToOkHttpBody$3

                    /* JADX INFO: renamed from: io.ktor.client.engine.okhttp.OkHttpEngineKt$convertToOkHttpBody$3$1, reason: invalid class name */
                    /* JADX INFO: compiled from: OkHttpEngine.kt */
                    @c(c = "io.ktor.client.engine.okhttp.OkHttpEngineKt$convertToOkHttpBody$3$1", f = "OkHttpEngine.kt", l = {204}, m = "invokeSuspend")
                    final class AnonymousClass1 extends SuspendLambda implements p<j, kotlin.coroutines.c<? super r>, Object> {
                        final /* synthetic */ X9.b $this_convertToOkHttpBody;
                        private /* synthetic */ Object L$0;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass1(X9.b bVar, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
                            super(2, cVar);
                            this.$this_convertToOkHttpBody = bVar;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
                            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_convertToOkHttpBody, cVar);
                            anonymousClass1.L$0 = obj;
                            return anonymousClass1;
                        }

                        @Override // Ia.p
                        public final Object invoke(j jVar, kotlin.coroutines.c<? super r> cVar) {
                            return ((AnonymousClass1) create(jVar, cVar)).invokeSuspend(r.f47939a);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
                            int i10 = this.label;
                            if (i10 == 0) {
                                kotlin.b.b(obj);
                                j jVar = (j) this.L$0;
                                X9.b.d dVar = (X9.b.d) this.$this_convertToOkHttpBody;
                                jVar.getClass();
                                this.label = 1;
                                if (dVar.d() == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            } else {
                                if (i10 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                kotlin.b.b(obj);
                            }
                            return r.f47939a;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final ByteReadChannel invoke() {
                        return io.ktor.utils.io.i.a(C2673a0.f43223b, callContext, false, new AnonymousClass1(content, null)).f40597c;
                    }
                });
            } else {
                if (!(content instanceof X9.b.AbstractC0103b)) {
                    i.e(content, "content");
                    throw new UnsupportedContentTypeException("Failed to write body: " + kotlin.jvm.internal.l.a(content.getClass()));
                }
                y.Companion.getClass();
                yVarB = y.a.b(null, new byte[0], 0, 0);
            }
        } else {
            yVarB = null;
        }
        aVar2.e(oVar.f40488a, yVarB);
        okhttp3.u uVarA = aVar2.a();
        Map<u.a, t> map = okHttpEngine.j;
        u.b bVar = u.f40400d;
        t tVar = map.get(cVar2.a());
        if (tVar == null) {
            throw new IllegalStateException("OkHttpClient can't be constructed because HttpTimeout plugin is not installed");
        }
        okHttpEngine$execute$2.L$0 = null;
        okHttpEngine$execute$2.L$1 = null;
        okHttpEngine$execute$2.label = 3;
        objB = okHttpEngine.b(tVar, uVarA, callContext, cVar2, okHttpEngine$execute$2);
        return objB == coroutineSingletons ? coroutineSingletons : objB;
    }

    @Override // io.ktor.client.engine.HttpClientEngineBase, io.ktor.client.engine.a
    public final Set<io.ktor.client.engine.b<?>> I() {
        return this.f40296g;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    public final Object b(t tVar, okhttp3.u uVar, e eVar, V9.c cVar, ContinuationImpl continuationImpl) {
        OkHttpEngine$executeHttpRequest$1 okHttpEngine$executeHttpRequest$1;
        Z9.b bVar;
        e eVar2;
        OkHttpEngine okHttpEngine;
        io.ktor.utils.io.a value;
        io.ktor.http.p pVar;
        io.ktor.http.p pVar2;
        InterfaceC2841h interfaceC2841hH;
        V9.c cVar2 = cVar;
        if (continuationImpl instanceof OkHttpEngine$executeHttpRequest$1) {
            okHttpEngine$executeHttpRequest$1 = (OkHttpEngine$executeHttpRequest$1) continuationImpl;
            int i10 = okHttpEngine$executeHttpRequest$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                okHttpEngine$executeHttpRequest$1.label = i10 - Integer.MIN_VALUE;
            } else {
                okHttpEngine$executeHttpRequest$1 = new OkHttpEngine$executeHttpRequest$1(this, continuationImpl);
            }
        } else {
            okHttpEngine$executeHttpRequest$1 = new OkHttpEngine$executeHttpRequest$1(this, continuationImpl);
        }
        Object obj = okHttpEngine$executeHttpRequest$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = okHttpEngine$executeHttpRequest$1.label;
        if (i11 == 0) {
            kotlin.b.b(obj);
            Z9.b bVarA = Z9.a.a(null);
            okHttpEngine$executeHttpRequest$1.L$0 = this;
            okHttpEngine$executeHttpRequest$1.L$1 = eVar;
            okHttpEngine$executeHttpRequest$1.L$2 = cVar2;
            okHttpEngine$executeHttpRequest$1.L$3 = bVarA;
            okHttpEngine$executeHttpRequest$1.label = 1;
            C2693i c2693i = new C2693i(1, A8.p.y(okHttpEngine$executeHttpRequest$1));
            c2693i.s();
            final okhttp3.internal.connection.e eVarA = tVar.a(uVar);
            FirebasePerfOkHttpClient.enqueue(eVarA, new h(cVar2, c2693i));
            c2693i.u(new l<Throwable, r>() { // from class: io.ktor.client.engine.okhttp.OkUtilsKt$execute$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // Ia.l
                public final r invoke(Throwable th) {
                    eVarA.cancel();
                    return r.f47939a;
                }
            });
            Object objP = c2693i.p();
            if (objP == coroutineSingletons) {
                return coroutineSingletons;
            }
            bVar = bVarA;
            obj = objP;
            eVar2 = eVar;
            okHttpEngine = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Z9.b bVar2 = (Z9.b) okHttpEngine$executeHttpRequest$1.L$3;
            V9.c cVar3 = (V9.c) okHttpEngine$executeHttpRequest$1.L$2;
            e eVar3 = (e) okHttpEngine$executeHttpRequest$1.L$1;
            okHttpEngine = (OkHttpEngine) okHttpEngine$executeHttpRequest$1.L$0;
            kotlin.b.b(obj);
            bVar = bVar2;
            cVar2 = cVar3;
            eVar2 = eVar3;
        }
        z zVar = (z) obj;
        final okhttp3.A a10 = zVar.f45686h;
        e.a aVar = eVar2.get(InterfaceC2694i0.b.f43449b);
        i.b(aVar);
        ((InterfaceC2694i0) aVar).B(new l<Throwable, r>() { // from class: io.ktor.client.engine.okhttp.OkHttpEngine$executeHttpRequest$2
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(Throwable th) {
                okhttp3.A a11 = a10;
                if (a11 != null) {
                    a11.close();
                }
                return r.f47939a;
            }
        });
        if (a10 == null || (interfaceC2841hH = a10.h()) == null) {
            ByteReadChannel.f40586a.getClass();
            value = ByteReadChannel.Companion.f40588b.getValue();
        } else {
            value = io.ktor.utils.io.i.a(C2673a0.f43223b, eVar2, false, new OkHttpEngineKt$toChannel$1(interfaceC2841hH, eVar2, cVar2, null)).f40597c;
        }
        Object obj2 = value;
        okHttpEngine.getClass();
        q qVar = new q(zVar.f45683e, zVar.f45682d);
        Protocol protocol = zVar.f45681c;
        i.e(protocol, "<this>");
        int iOrdinal = protocol.ordinal();
        if (iOrdinal == 0) {
            pVar = io.ktor.http.p.f40491f;
        } else if (iOrdinal == 1) {
            pVar = io.ktor.http.p.f40490e;
        } else {
            if (iOrdinal != 2) {
                io.ktor.http.p pVar3 = io.ktor.http.p.f40489d;
                if (iOrdinal == 3 || iOrdinal == 4) {
                    pVar2 = pVar3;
                } else {
                    if (iOrdinal != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    pVar = io.ktor.http.p.f40493h;
                }
                return new V9.e(qVar, bVar, new a(zVar.f45685g), pVar2, obj2, eVar2);
            }
            pVar = io.ktor.http.p.f40492g;
        }
        pVar2 = pVar;
        return new V9.e(qVar, bVar, new a(zVar.f45685g), pVar2, obj2, eVar2);
    }

    @Override // io.ktor.client.engine.HttpClientEngineBase, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        super.close();
        e.a aVar = this.f40297h.get(InterfaceC2694i0.b.f43449b);
        i.c(aVar, "null cannot be cast to non-null type kotlinx.coroutines.CompletableJob");
        ((InterfaceC2707q) aVar).b();
    }

    @Override // io.ktor.client.engine.HttpClientEngineBase, kotlinx.coroutines.A
    public final e getCoroutineContext() {
        return this.f40298i;
    }
}
