package io.ktor.client.plugins;

import com.braze.Constants;
import io.ktor.client.HttpClient;
import io.ktor.client.network.sockets.ConnectTimeoutException;
import io.ktor.client.network.sockets.SocketTimeoutException;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Lambda;
import kotlin.random.Random;

/* JADX INFO: compiled from: HttpRequestRetry.kt */
/* JADX INFO: loaded from: classes.dex */
public final class HttpRequestRetry {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c f40315g = new c();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final io.ktor.util.a<HttpRequestRetry> f40316h = new io.ktor.util.a<>("RetryFeature");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final com.voltasit.obdeleven.domain.usecases.device.u f40317i = new com.voltasit.obdeleven.domain.usecases.device.u();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Lambda f40318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ia.q<e, io.ktor.client.request.a, Throwable, Boolean> f40319b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Ia.p<a, Integer, Long> f40320c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Ia.p<Long, kotlin.coroutines.c<? super p293xa.r>, Object> f40321d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f40322e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Ia.p<b, io.ktor.client.request.a, p293xa.r> f40323f;

    /* JADX INFO: compiled from: HttpRequestRetry.kt */
    public static final class Configuration {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Lambda f40324a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Ia.q<? super e, ? super io.ktor.client.request.a, ? super Throwable, Boolean> f40325b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Ia.p<? super a, ? super Integer, Long> f40326c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Ia.p<? super b, ? super io.ktor.client.request.a, p293xa.r> f40327d = new Ia.p<b, io.ktor.client.request.a, p293xa.r>() { // from class: io.ktor.client.plugins.HttpRequestRetry$Configuration$modifyRequest$1
            @Override // Ia.p
            public final p293xa.r invoke(HttpRequestRetry.b bVar, io.ktor.client.request.a aVar) {
                io.ktor.client.request.a it = aVar;
                kotlin.jvm.internal.i.e(bVar, "$this$null");
                kotlin.jvm.internal.i.e(it, "it");
                return p293xa.r.f47939a;
            }
        };

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Ia.p<? super Long, ? super kotlin.coroutines.c<? super p293xa.r>, ? extends Object> f40328e = new HttpRequestRetry$Configuration$delay$1(2, null);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f40329f;

        public Configuration() {
            HttpRequestRetry$Configuration$retryOnServerErrors$1 block = new Ia.q<e, V9.b, io.ktor.client.statement.c, Boolean>() { // from class: io.ktor.client.plugins.HttpRequestRetry$Configuration$retryOnServerErrors$1
                @Override // Ia.q
                public final Boolean invoke(HttpRequestRetry.e eVar, V9.b bVar, io.ktor.client.statement.c cVar) {
                    HttpRequestRetry.e retryIf = eVar;
                    io.ktor.client.statement.c response = cVar;
                    kotlin.jvm.internal.i.e(retryIf, "$this$retryIf");
                    kotlin.jvm.internal.i.e(bVar, "<anonymous parameter 0>");
                    kotlin.jvm.internal.i.e(response, "response");
                    int i10 = response.f().f40511b;
                    boolean z10 = false;
                    if (500 <= i10 && i10 < 600) {
                        z10 = true;
                    }
                    return Boolean.valueOf(z10);
                }
            };
            kotlin.jvm.internal.i.e(block, "block");
            this.f40329f = 3;
            this.f40324a = block;
            final boolean z10 = false;
            Ia.q<e, io.ktor.client.request.a, Throwable, Boolean> qVar = new Ia.q<e, io.ktor.client.request.a, Throwable, Boolean>() { // from class: io.ktor.client.plugins.HttpRequestRetry$Configuration$retryOnException$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // Ia.q
                public final Boolean invoke(HttpRequestRetry.e eVar, io.ktor.client.request.a aVar, Throwable th) {
                    boolean z11;
                    HttpRequestRetry.e retryOnExceptionIf = eVar;
                    Throwable cause = th;
                    kotlin.jvm.internal.i.e(retryOnExceptionIf, "$this$retryOnExceptionIf");
                    kotlin.jvm.internal.i.e(aVar, "<anonymous parameter 0>");
                    kotlin.jvm.internal.i.e(cause, "cause");
                    cc.b bVar = s.f40386a;
                    Throwable thI = com.voltasit.obdeleven.domain.usecases.device.v.i(cause);
                    if ((thI instanceof HttpRequestTimeoutException) || (thI instanceof ConnectTimeoutException) || (thI instanceof SocketTimeoutException)) {
                        z11 = z10;
                    } else {
                        z11 = !(cause instanceof CancellationException);
                    }
                    return Boolean.valueOf(z11);
                }
            };
            this.f40329f = 3;
            this.f40325b = qVar;
            a(this, 0L, 15);
        }

        public static void a(final Configuration configuration, long j, int i10) {
            if ((i10 & 2) != 0) {
                j = 60000;
            }
            final long j10 = j;
            configuration.getClass();
            if (j10 <= 0) {
                throw new IllegalStateException("Check failed.");
            }
            final double d10 = 2.0d;
            final long j11 = 1000;
            final Ia.p<a, Integer, Long> pVar = new Ia.p<a, Integer, Long>() { // from class: io.ktor.client.plugins.HttpRequestRetry$Configuration$exponentialDelay$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final Long invoke(HttpRequestRetry.a aVar, Integer num) {
                    HttpRequestRetry.a delayMillis = aVar;
                    int iIntValue = num.intValue();
                    kotlin.jvm.internal.i.e(delayMillis, "$this$delayMillis");
                    long jMin = Math.min(((long) Math.pow(d10, iIntValue)) * 1000, j10);
                    HttpRequestRetry.Configuration configuration2 = configuration;
                    long j12 = j11;
                    configuration2.getClass();
                    long jF = 0;
                    if (j12 != 0) {
                        Random.f43064b.getClass();
                        jF = Random.f43065c.f(j12);
                    }
                    return Long.valueOf(jMin + jF);
                }
            };
            final boolean z10 = true;
            configuration.f40326c = new Ia.p<a, Integer, Long>() { // from class: io.ktor.client.plugins.HttpRequestRetry$Configuration$delayMillis$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                /* JADX WARN: Code duplicated, block: B:13:0x0038  */
                @Override // Ia.p
                public final Long invoke(HttpRequestRetry.a aVar, Integer num) {
                    long jLongValue;
                    Long lValueOf;
                    io.ktor.http.g gVarA;
                    Long lB;
                    HttpRequestRetry.a aVar2 = aVar;
                    int iIntValue = num.intValue();
                    kotlin.jvm.internal.i.e(aVar2, "$this$null");
                    if (z10) {
                        io.ktor.client.statement.c cVar = aVar2.f40332a;
                        if (cVar == null || (gVarA = cVar.a()) == null) {
                            lValueOf = null;
                        } else {
                            List<String> list = io.ktor.http.k.f40481a;
                            String str = gVarA.get("Retry-After");
                            if (str == null || (lB = kotlin.text.l.B(str)) == null) {
                                lValueOf = null;
                            } else {
                                lValueOf = Long.valueOf(lB.longValue() * ((long) Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS));
                            }
                        }
                        jLongValue = Math.max(pVar.invoke(aVar2, Integer.valueOf(iIntValue)).longValue(), lValueOf != null ? lValueOf.longValue() : 0L);
                    } else {
                        jLongValue = pVar.invoke(aVar2, Integer.valueOf(iIntValue)).longValue();
                    }
                    return Long.valueOf(jLongValue);
                }
            };
        }
    }

    /* JADX INFO: compiled from: HttpRequestRetry.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final io.ktor.client.statement.c f40332a;

        public a(io.ktor.client.request.a request, io.ktor.client.statement.c cVar) {
            kotlin.jvm.internal.i.e(request, "request");
            this.f40332a = cVar;
        }
    }

    /* JADX INFO: compiled from: HttpRequestRetry.kt */
    public static final class b {
    }

    /* JADX INFO: compiled from: HttpRequestRetry.kt */
    public static final class c implements i<Configuration, HttpRequestRetry> {
        @Override // io.ktor.client.plugins.i
        public final void a(HttpRequestRetry httpRequestRetry, HttpClient scope) {
            HttpRequestRetry plugin = httpRequestRetry;
            kotlin.jvm.internal.i.e(plugin, "plugin");
            kotlin.jvm.internal.i.e(scope, "scope");
            t.d dVar = t.f40392b;
            t tVar = (t) j.a(scope);
            tVar.f40394a.add(new HttpRequestRetry$intercept$1(plugin, scope, null));
        }

        @Override // io.ktor.client.plugins.i
        public final HttpRequestRetry b(Ia.l<? super Configuration, p293xa.r> lVar) {
            Configuration configuration = new Configuration();
            lVar.invoke(configuration);
            return new HttpRequestRetry(configuration);
        }

        @Override // io.ktor.client.plugins.i
        public final io.ktor.util.a<HttpRequestRetry> getKey() {
            return HttpRequestRetry.f40316h;
        }
    }

    /* JADX INFO: compiled from: HttpRequestRetry.kt */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final io.ktor.client.request.a f40333a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final io.ktor.client.statement.c f40334b;

        public d(io.ktor.client.request.a request, int i10, io.ktor.client.statement.c cVar, Throwable th) {
            kotlin.jvm.internal.i.e(request, "request");
            this.f40333a = request;
            this.f40334b = cVar;
        }
    }

    /* JADX INFO: compiled from: HttpRequestRetry.kt */
    public static final class e {
    }

    public HttpRequestRetry(Configuration configuration) {
        Lambda lambda = configuration.f40324a;
        if (lambda == null) {
            kotlin.jvm.internal.i.m("shouldRetry");
            throw null;
        }
        this.f40318a = lambda;
        Ia.q qVar = configuration.f40325b;
        if (qVar == null) {
            kotlin.jvm.internal.i.m("shouldRetryOnException");
            throw null;
        }
        this.f40319b = qVar;
        Ia.p pVar = configuration.f40326c;
        if (pVar == null) {
            kotlin.jvm.internal.i.m("delayMillis");
            throw null;
        }
        this.f40320c = pVar;
        this.f40321d = configuration.f40328e;
        this.f40322e = configuration.f40329f;
        this.f40323f = configuration.f40327d;
    }
}
