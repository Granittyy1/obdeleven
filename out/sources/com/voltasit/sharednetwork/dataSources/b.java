package com.voltasit.sharednetwork.dataSources;

import Ia.l;
import Ia.p;
import com.voltasit.sharednetwork.integrity.IntegrityEndpoint;
import com.voltasit.sharednetwork.integrity.IntegrityHeadersConfig;
import com.voltasit.sharednetwork.integrity.IntegrityHeadersKt;
import io.ktor.client.HttpClient;
import io.ktor.client.HttpClientConfig;
import io.ktor.client.engine.okhttp.OkHttpConfig;
import io.ktor.client.plugins.u;
import io.ktor.http.y;
import java.security.SecureRandom;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.collections.AbstractC2670b;
import kotlin.collections.AbstractCollection;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.i;
import me.zhanghai.android.materialprogressbar.R;
import okhttp3.t;
import p293xa.r;

/* JADX INFO: compiled from: ParseKtorClient.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends BaseParseKtorClient {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f34448c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f34449d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f34450e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map<String, String> f34451f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile p<? super byte[], ? super c<? super com.voltasit.sharednetwork.integrity.a>, ? extends Object> f34452g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile l<? super Throwable, r> f34453h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final SecureRandom f34454i;
    public final HttpClient j;

    public b(String str, String str2, Map appInfoMap, String str3) {
        i.e(appInfoMap, "appInfoMap");
        this.f34448c = str;
        this.f34449d = str2;
        this.f34450e = str3;
        this.f34451f = appInfoMap;
        this.f34454i = new SecureRandom();
        this.j = io.ktor.client.a.a(new l<HttpClientConfig<OkHttpConfig>, r>() { // from class: com.voltasit.sharednetwork.dataSources.ParseKtorClient$client$1
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(HttpClientConfig<OkHttpConfig> httpClientConfig) {
                HttpClientConfig<OkHttpConfig> HttpClient = httpClientConfig;
                i.e(HttpClient, "$this$HttpClient");
                HttpClient.b(u.f40400d, new l<u.a, r>() { // from class: com.voltasit.sharednetwork.dataSources.ParseKtorClient$client$1.1
                    @Override // Ia.l
                    public final r invoke(u.a aVar) {
                        u.a install = aVar;
                        i.e(install, "$this$install");
                        u.a.a(45000L);
                        install.f40405a = 45000L;
                        return r.f47939a;
                    }
                });
                io.ktor.client.plugins.api.b bVar = IntegrityHeadersKt.f34467a;
                final b bVar2 = this.this$0;
                HttpClient.b(bVar, new l<IntegrityHeadersConfig, r>() { // from class: com.voltasit.sharednetwork.dataSources.ParseKtorClient$client$1.2

                    /* JADX INFO: renamed from: com.voltasit.sharednetwork.dataSources.ParseKtorClient$client$1$2$1, reason: invalid class name */
                    /* JADX INFO: compiled from: ParseKtorClient.kt */
                    @Aa.c(c = "com.voltasit.sharednetwork.dataSources.ParseKtorClient$client$1$2$1", f = "ParseKtorClient.kt", l = {R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle}, m = "invokeSuspend")
                    final class AnonymousClass1 extends SuspendLambda implements p<byte[], c<? super com.voltasit.sharednetwork.integrity.a>, Object> {
                        /* synthetic */ Object L$0;
                        int label;
                        final /* synthetic */ b this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass1(b bVar, c<? super AnonymousClass1> cVar) {
                            super(2, cVar);
                            this.this$0 = bVar;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final c<r> create(Object obj, c<?> cVar) {
                            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, cVar);
                            anonymousClass1.L$0 = obj;
                            return anonymousClass1;
                        }

                        @Override // Ia.p
                        public final Object invoke(byte[] bArr, c<? super com.voltasit.sharednetwork.integrity.a> cVar) {
                            return ((AnonymousClass1) create(bArr, cVar)).invokeSuspend(r.f47939a);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
                            int i10 = this.label;
                            if (i10 == 0) {
                                kotlin.b.b(obj);
                                byte[] bArr = (byte[]) this.L$0;
                                p<? super byte[], ? super c<? super com.voltasit.sharednetwork.integrity.a>, ? extends Object> pVar = this.this$0.f34452g;
                                if (pVar == null) {
                                    return null;
                                }
                                this.label = 1;
                                obj = pVar.invoke(bArr, this);
                                if (obj == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            } else {
                                if (i10 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                kotlin.b.b(obj);
                            }
                            return (com.voltasit.sharednetwork.integrity.a) obj;
                        }
                    }

                    {
                        super(1);
                    }

                    /* JADX WARN: Type inference failed for: r0v3, types: [com.voltasit.sharednetwork.dataSources.ParseKtorClient$client$1$2$3, kotlin.jvm.internal.Lambda] */
                    /* JADX WARN: Type inference failed for: r0v4, types: [com.voltasit.sharednetwork.dataSources.ParseKtorClient$client$1$2$4, kotlin.jvm.internal.Lambda] */
                    @Override // Ia.l
                    public final r invoke(IntegrityHeadersConfig integrityHeadersConfig) {
                        IntegrityHeadersConfig install = integrityHeadersConfig;
                        i.e(install, "$this$install");
                        install.f34461a = new AnonymousClass1(bVar2, null);
                        final b bVar3 = bVar2;
                        install.f34462b = new l<Integer, byte[]>() { // from class: com.voltasit.sharednetwork.dataSources.ParseKtorClient.client.1.2.2
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final byte[] invoke(Integer num) {
                                byte[] bArr = new byte[num.intValue()];
                                bVar3.f34454i.nextBytes(bArr);
                                return bArr;
                            }
                        };
                        final b bVar4 = bVar2;
                        install.f34463c = new l<io.ktor.client.request.a, Boolean>() { // from class: com.voltasit.sharednetwork.dataSources.ParseKtorClient.client.1.2.3
                            {
                                super(1);
                            }

                            /* JADX WARN: Code duplicated, block: B:15:0x0045  */
                            @Override // Ia.l
                            public final Boolean invoke(io.ktor.client.request.a aVar) {
                                boolean z10;
                                io.ktor.client.request.a request = aVar;
                                i.e(request, "request");
                                if (bVar4.f34452g != null) {
                                    IntegrityEndpoint.a aVar2 = IntegrityEndpoint.f34458b;
                                    String encodedPath = y.c(request.f40410a);
                                    aVar2.getClass();
                                    i.e(encodedPath, "encodedPath");
                                    Collection collection = IntegrityEndpoint.f34460d;
                                    if (collection == null || !((AbstractCollection) collection).isEmpty()) {
                                        Iterator it = ((AbstractC2670b) collection).iterator();
                                        while (it.hasNext()) {
                                            if (((IntegrityEndpoint) it.next()).a(encodedPath)) {
                                                z10 = true;
                                            }
                                        }
                                        z10 = false;
                                    } else {
                                        z10 = false;
                                    }
                                } else {
                                    z10 = false;
                                }
                                return Boolean.valueOf(z10);
                            }
                        };
                        final b bVar5 = bVar2;
                        install.f34464d = new l<Throwable, r>() { // from class: com.voltasit.sharednetwork.dataSources.ParseKtorClient.client.1.2.4
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final r invoke(Throwable th) {
                                Throwable error = th;
                                i.e(error, "error");
                                l<? super Throwable, r> lVar = bVar5.f34453h;
                                if (lVar != null) {
                                    lVar.invoke(error);
                                }
                                return r.f47939a;
                            }
                        };
                        return r.f47939a;
                    }
                });
                HttpClient.a(new l<OkHttpConfig, r>() { // from class: com.voltasit.sharednetwork.dataSources.ParseKtorClient$client$1.3
                    @Override // Ia.l
                    public final r invoke(OkHttpConfig okHttpConfig) {
                        OkHttpConfig engine = okHttpConfig;
                        i.e(engine, "$this$engine");
                        engine.a(new l<t.a, r>() { // from class: com.voltasit.sharednetwork.dataSources.ParseKtorClient.client.1.3.1
                            @Override // Ia.l
                            public final r invoke(t.a aVar) {
                                t.a config = aVar;
                                i.e(config, "$this$config");
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

    @Override // com.voltasit.sharednetwork.dataSources.BaseParseKtorClient
    public final Map<String, String> g() {
        return this.f34451f;
    }

    @Override // com.voltasit.sharednetwork.dataSources.BaseParseKtorClient
    public final String h() {
        return this.f34449d;
    }

    @Override // com.voltasit.sharednetwork.dataSources.BaseParseKtorClient
    public final String i() {
        return this.f34448c;
    }

    @Override // com.voltasit.sharednetwork.dataSources.BaseParseKtorClient
    public final HttpClient k() {
        return this.j;
    }

    @Override // com.voltasit.sharednetwork.dataSources.BaseParseKtorClient
    public final String l() {
        return this.f34450e;
    }
}
