package io.ktor.client.engine;

import Ia.l;
import io.ktor.client.HttpClient;
import java.io.Closeable;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.A;
import kotlinx.coroutines.B0;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.C2700k0;
import kotlinx.coroutines.C2715z;
import kotlinx.coroutines.G;
import kotlinx.coroutines.InterfaceC2694i0;
import kotlinx.coroutines.P;
import p293xa.r;

/* JADX INFO: compiled from: HttpClientEngine.kt */
/* JADX INFO: loaded from: classes.dex */
public interface a extends A, Closeable {

    /* JADX INFO: renamed from: io.ktor.client.engine.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: HttpClientEngine.kt */
    public static final class C0455a {
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        public static final Object a(a aVar, V9.c cVar, ContinuationImpl continuationImpl) {
            HttpClientEngine$executeWithinCallContext$1 httpClientEngine$executeWithinCallContext$1;
            if (continuationImpl instanceof HttpClientEngine$executeWithinCallContext$1) {
                httpClientEngine$executeWithinCallContext$1 = (HttpClientEngine$executeWithinCallContext$1) continuationImpl;
                int i10 = httpClientEngine$executeWithinCallContext$1.label;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    httpClientEngine$executeWithinCallContext$1.label = i10 - Integer.MIN_VALUE;
                } else {
                    httpClientEngine$executeWithinCallContext$1 = new HttpClientEngine$executeWithinCallContext$1(continuationImpl);
                }
            } else {
                httpClientEngine$executeWithinCallContext$1 = new HttpClientEngine$executeWithinCallContext$1(continuationImpl);
            }
            Object objPlus = httpClientEngine$executeWithinCallContext$1.result;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i11 = httpClientEngine$executeWithinCallContext$1.label;
            if (i11 != 0) {
                if (i11 == 1) {
                    cVar = (V9.c) httpClientEngine$executeWithinCallContext$1.L$1;
                    aVar = (a) httpClientEngine$executeWithinCallContext$1.L$0;
                    kotlin.b.b(objPlus);
                } else {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.b.b(objPlus);
                }
                return objPlus;
            }
            kotlin.b.b(objPlus);
            B0 b10 = cVar.f6853e;
            httpClientEngine$executeWithinCallContext$1.L$0 = aVar;
            httpClientEngine$executeWithinCallContext$1.L$1 = cVar;
            httpClientEngine$executeWithinCallContext$1.label = 1;
            C2715z c2715z = e.f40286a;
            final C2700k0 c2700k0 = new C2700k0(b10);
            objPlus = aVar.getCoroutineContext().plus(c2700k0).plus(e.f40286a);
            InterfaceC2694i0 interfaceC2694i0 = (InterfaceC2694i0) httpClientEngine$executeWithinCallContext$1.getContext().get(InterfaceC2694i0.b.f43449b);
            if (interfaceC2694i0 != null) {
                final P pF0 = interfaceC2694i0.f0(true, true, new l<Throwable, r>() { // from class: io.ktor.client.engine.UtilsKt$attachToUserJob$cleanupHandler$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final r invoke(Throwable th) {
                        Throwable th2 = th;
                        if (th2 != null) {
                            c2700k0.i(new CancellationException(th2.getMessage()));
                        }
                        return r.f47939a;
                    }
                });
                c2700k0.B(new l<Throwable, r>() { // from class: io.ktor.client.engine.UtilsKt$attachToUserJob$2
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final r invoke(Throwable th) {
                        pF0.dispose();
                        return r.f47939a;
                    }
                });
            }
            if (objPlus == coroutineSingletons) {
                return coroutineSingletons;
            }
            kotlin.coroutines.e eVar = (kotlin.coroutines.e) objPlus;
            G gA = C2680e.a(aVar, eVar.plus(new f(eVar)), new HttpClientEngine$executeWithinCallContext$2(aVar, cVar, null), 2);
            httpClientEngine$executeWithinCallContext$1.L$0 = null;
            httpClientEngine$executeWithinCallContext$1.L$1 = null;
            httpClientEngine$executeWithinCallContext$1.label = 2;
            objPlus = gA.D(httpClientEngine$executeWithinCallContext$1);
            if (objPlus == coroutineSingletons) {
                return coroutineSingletons;
            }
            return objPlus;
        }
    }

    Object C0(V9.c cVar, ContinuationImpl continuationImpl);

    Set<b<?>> I();

    void J0(HttpClient httpClient);
}
