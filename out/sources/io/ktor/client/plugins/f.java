package io.ktor.client.plugins;

import io.ktor.client.HttpClient;
import io.ktor.util.pipeline.InvalidPhaseException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: HttpCallValidator.kt */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f40354d = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final io.ktor.util.a<f> f40355e = new io.ktor.util.a<>("HttpResponseValidator");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<Ia.p<io.ktor.client.statement.c, kotlin.coroutines.c<? super p293xa.r>, Object>> f40356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<e> f40357b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f40358c;

    /* JADX INFO: compiled from: HttpCallValidator.kt */
    public static final class a implements i<b, f> {
        @Override // io.ktor.client.plugins.i
        public final void a(f fVar, HttpClient scope) throws InvalidPhaseException {
            f plugin = fVar;
            kotlin.jvm.internal.i.e(plugin, "plugin");
            kotlin.jvm.internal.i.e(scope, "scope");
            scope.f40243f.f(V9.d.f6856f, new HttpCallValidator$Companion$install$1(plugin, null));
            P3.b bVar = new P3.b(2, "BeforeReceive");
            io.ktor.client.statement.f fVar2 = scope.f40244g;
            fVar2.getClass();
            P3.b reference = io.ktor.client.statement.f.f40430f;
            kotlin.jvm.internal.i.e(reference, "reference");
            if (!fVar2.e(bVar)) {
                int iC = fVar2.c(reference);
                if (iC == -1) {
                    throw new InvalidPhaseException("Phase " + reference + " was not registered for this pipeline");
                }
                fVar2.f40557a.add(iC, new io.ktor.util.pipeline.a(bVar, new io.ktor.util.pipeline.e.b()));
            }
            fVar2.f(bVar, new HttpCallValidator$Companion$install$2(plugin, null));
            t.d dVar = t.f40392b;
            ((t) j.a(scope)).f40394a.add(new HttpCallValidator$Companion$install$3(plugin, null));
        }

        @Override // io.ktor.client.plugins.i
        public final f b(Ia.l<? super b, p293xa.r> lVar) {
            b bVar = new b();
            lVar.invoke(bVar);
            return new f(kotlin.collections.q.e0(bVar.f40359a), kotlin.collections.q.e0(bVar.f40360b), bVar.f40361c);
        }

        @Override // io.ktor.client.plugins.i
        public final io.ktor.util.a<f> getKey() {
            return f.f40355e;
        }
    }

    /* JADX INFO: compiled from: HttpCallValidator.kt */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f40359a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList f40360b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f40361c = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(List<? extends Ia.p<? super io.ktor.client.statement.c, ? super kotlin.coroutines.c<? super p293xa.r>, ? extends Object>> responseValidators, List<? extends e> callExceptionHandlers, boolean z10) {
        kotlin.jvm.internal.i.e(responseValidators, "responseValidators");
        kotlin.jvm.internal.i.e(callExceptionHandlers, "callExceptionHandlers");
        this.f40356a = responseValidators;
        this.f40357b = callExceptionHandlers;
        this.f40358c = z10;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final p293xa.r a(f fVar, Throwable th, V9.b bVar, ContinuationImpl continuationImpl) {
        HttpCallValidator$processException$1 httpCallValidator$processException$1;
        Iterator it;
        fVar.getClass();
        if (continuationImpl instanceof HttpCallValidator$processException$1) {
            httpCallValidator$processException$1 = (HttpCallValidator$processException$1) continuationImpl;
            int i10 = httpCallValidator$processException$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                httpCallValidator$processException$1.label = i10 - Integer.MIN_VALUE;
            } else {
                httpCallValidator$processException$1 = new HttpCallValidator$processException$1(fVar, continuationImpl);
            }
        } else {
            httpCallValidator$processException$1 = new HttpCallValidator$processException$1(fVar, continuationImpl);
        }
        Object obj = httpCallValidator$processException$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = httpCallValidator$processException$1.label;
        if (i11 == 0) {
            kotlin.b.b(obj);
            h.f40366a.b("Processing exception " + th + " for request " + bVar.k());
            it = fVar.f40357b.iterator();
        } else {
            if (i11 != 1 && i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (Iterator) httpCallValidator$processException$1.L$2;
            V9.b bVar2 = (V9.b) httpCallValidator$processException$1.L$1;
            Throwable th2 = (Throwable) httpCallValidator$processException$1.L$0;
            kotlin.b.b(obj);
            bVar = bVar2;
            th = th2;
        }
        while (it.hasNext()) {
            e eVar = (e) it.next();
            if (eVar instanceof d) {
                ((d) eVar).getClass();
                httpCallValidator$processException$1.L$0 = th;
                httpCallValidator$processException$1.L$1 = bVar;
                httpCallValidator$processException$1.L$2 = it;
                httpCallValidator$processException$1.label = 1;
                throw null;
            }
            if (eVar instanceof w) {
                ((w) eVar).getClass();
                httpCallValidator$processException$1.L$0 = th;
                httpCallValidator$processException$1.L$1 = bVar;
                httpCallValidator$processException$1.L$2 = it;
                httpCallValidator$processException$1.label = 2;
                throw null;
            }
        }
        return p293xa.r.f47939a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object b(f fVar, io.ktor.client.statement.c cVar, ContinuationImpl continuationImpl) {
        HttpCallValidator$validateResponse$1 httpCallValidator$validateResponse$1;
        Iterator it;
        fVar.getClass();
        if (continuationImpl instanceof HttpCallValidator$validateResponse$1) {
            httpCallValidator$validateResponse$1 = (HttpCallValidator$validateResponse$1) continuationImpl;
            int i10 = httpCallValidator$validateResponse$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                httpCallValidator$validateResponse$1.label = i10 - Integer.MIN_VALUE;
            } else {
                httpCallValidator$validateResponse$1 = new HttpCallValidator$validateResponse$1(fVar, continuationImpl);
            }
        } else {
            httpCallValidator$validateResponse$1 = new HttpCallValidator$validateResponse$1(fVar, continuationImpl);
        }
        Object obj = httpCallValidator$validateResponse$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = httpCallValidator$validateResponse$1.label;
        if (i11 == 0) {
            kotlin.b.b(obj);
            h.f40366a.b("Validating response for request " + cVar.b().c().k());
            it = fVar.f40356a.iterator();
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (Iterator) httpCallValidator$validateResponse$1.L$1;
            cVar = (io.ktor.client.statement.c) httpCallValidator$validateResponse$1.L$0;
            kotlin.b.b(obj);
        }
        while (it.hasNext()) {
            Ia.p pVar = (Ia.p) it.next();
            httpCallValidator$validateResponse$1.L$0 = cVar;
            httpCallValidator$validateResponse$1.L$1 = it;
            httpCallValidator$validateResponse$1.label = 1;
            if (pVar.invoke(cVar, httpCallValidator$validateResponse$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return p293xa.r.f47939a;
    }
}
