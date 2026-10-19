package io.ktor.client.plugins;

import io.ktor.client.HttpClient;
import java.util.ArrayList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.B;

/* JADX INFO: compiled from: HttpSend.kt */
/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f40392b = new d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final io.ktor.util.a<t> f40393c = new io.ktor.util.a<>("HttpSend");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f40394a = new ArrayList();

    /* JADX INFO: compiled from: HttpSend.kt */
    public static final class a {
    }

    /* JADX INFO: compiled from: HttpSend.kt */
    public static final class b implements x {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final HttpClient f40395a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f40396b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public io.ktor.client.call.a f40397c;

        public b(HttpClient client) {
            kotlin.jvm.internal.i.e(client, "client");
            this.f40395a = client;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // io.ktor.client.plugins.x
        public final Object a(io.ktor.client.request.a aVar, ContinuationImpl continuationImpl) {
            HttpSend$DefaultSender$execute$1 httpSend$DefaultSender$execute$1;
            b bVar;
            if (continuationImpl instanceof HttpSend$DefaultSender$execute$1) {
                httpSend$DefaultSender$execute$1 = (HttpSend$DefaultSender$execute$1) continuationImpl;
                int i10 = httpSend$DefaultSender$execute$1.label;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    httpSend$DefaultSender$execute$1.label = i10 - Integer.MIN_VALUE;
                } else {
                    httpSend$DefaultSender$execute$1 = new HttpSend$DefaultSender$execute$1(this, continuationImpl);
                }
            } else {
                httpSend$DefaultSender$execute$1 = new HttpSend$DefaultSender$execute$1(this, continuationImpl);
            }
            Object objA = httpSend$DefaultSender$execute$1.result;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i11 = httpSend$DefaultSender$execute$1.label;
            if (i11 == 0) {
                kotlin.b.b(objA);
                io.ktor.client.call.a aVar2 = this.f40397c;
                if (aVar2 != null) {
                    B.c(aVar2, null);
                }
                int i12 = this.f40396b;
                if (i12 >= 20) {
                    throw new SendCountExceedException("Max send count 20 exceeded. Consider increasing the property maxSendCount if more is required.");
                }
                this.f40396b = i12 + 1;
                V9.f fVar = this.f40395a.f40245h;
                Object obj = aVar.f40413d;
                httpSend$DefaultSender$execute$1.L$0 = this;
                httpSend$DefaultSender$execute$1.label = 1;
                objA = fVar.a(aVar, obj, httpSend$DefaultSender$execute$1);
                if (objA == coroutineSingletons) {
                    return coroutineSingletons;
                }
                bVar = this;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bVar = (b) httpSend$DefaultSender$execute$1.L$0;
                kotlin.b.b(objA);
            }
            io.ktor.client.call.a aVar3 = objA instanceof io.ktor.client.call.a ? (io.ktor.client.call.a) objA : null;
            if (aVar3 != null) {
                bVar.f40397c = aVar3;
                return aVar3;
            }
            throw new IllegalStateException(("Failed to execute send pipeline. Expected [HttpClientCall], but received " + objA).toString());
        }
    }

    /* JADX INFO: compiled from: HttpSend.kt */
    public static final class c implements x {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Ia.q<x, io.ktor.client.request.a, kotlin.coroutines.c<? super io.ktor.client.call.a>, Object> f40398a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final x f40399b;

        /* JADX WARN: Multi-variable type inference failed */
        public c(Ia.q<? super x, ? super io.ktor.client.request.a, ? super kotlin.coroutines.c<? super io.ktor.client.call.a>, ? extends Object> interceptor, x nextSender) {
            kotlin.jvm.internal.i.e(interceptor, "interceptor");
            kotlin.jvm.internal.i.e(nextSender, "nextSender");
            this.f40398a = interceptor;
            this.f40399b = nextSender;
        }

        @Override // io.ktor.client.plugins.x
        public final Object a(io.ktor.client.request.a aVar, ContinuationImpl continuationImpl) {
            return this.f40398a.invoke(this.f40399b, aVar, continuationImpl);
        }
    }

    /* JADX INFO: compiled from: HttpSend.kt */
    public static final class d implements i<a, t> {
        @Override // io.ktor.client.plugins.i
        public final void a(t tVar, HttpClient scope) {
            t plugin = tVar;
            kotlin.jvm.internal.i.e(plugin, "plugin");
            kotlin.jvm.internal.i.e(scope, "scope");
            scope.f40243f.f(V9.d.j, new HttpSend$Plugin$install$1(plugin, scope, null));
        }

        @Override // io.ktor.client.plugins.i
        public final t b(Ia.l<? super a, p293xa.r> lVar) {
            lVar.invoke(new a());
            return new t();
        }

        @Override // io.ktor.client.plugins.i
        public final io.ktor.util.a<t> getKey() {
            return t.f40393c;
        }
    }
}
