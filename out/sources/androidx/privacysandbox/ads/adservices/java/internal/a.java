package androidx.privacysandbox.ads.adservices.java.internal;

import Ia.l;
import androidx.core.view.C1293h;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.G;
import p293xa.r;

/* JADX INFO: compiled from: CoroutineAdapter.kt */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static p052e0.a a(final G g10) {
        final androidx.concurrent.futures.a aVar = new androidx.concurrent.futures.a();
        p052e0.a<T> aVar2 = new p052e0.a<>(aVar);
        aVar.f15870b = aVar2;
        aVar.f15869a = C1293h.class;
        try {
            g10.B(new l<Throwable, r>() { // from class: androidx.privacysandbox.ads.adservices.java.internal.CoroutineAdapterKt$asListenableFuture$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // Ia.l
                public final r invoke(Throwable th) {
                    Throwable th2 = th;
                    if (th2 == null) {
                        androidx.concurrent.futures.a<Object> aVar3 = aVar;
                        Object objP = g10.p();
                        aVar3.f15872d = true;
                        p052e0.a<Object> aVar4 = aVar3.f15870b;
                        if (aVar4 != null && aVar4.f34708c.k(objP)) {
                            aVar3.f15869a = null;
                            aVar3.f15870b = null;
                            aVar3.f15871c = null;
                        }
                    } else if (th2 instanceof CancellationException) {
                        androidx.concurrent.futures.a<Object> aVar5 = aVar;
                        aVar5.f15872d = true;
                        p052e0.a<Object> aVar6 = aVar5.f15870b;
                        if (aVar6 != null && aVar6.f34708c.cancel(true)) {
                            aVar5.f15869a = null;
                            aVar5.f15870b = null;
                            aVar5.f15871c = null;
                        }
                    } else {
                        androidx.concurrent.futures.a<Object> aVar7 = aVar;
                        aVar7.f15872d = true;
                        p052e0.a<Object> aVar8 = aVar7.f15870b;
                        if (aVar8 != null && aVar8.f34708c.l(th2)) {
                            aVar7.f15869a = null;
                            aVar7.f15870b = null;
                            aVar7.f15871c = null;
                        }
                    }
                    return r.f47939a;
                }
            });
            aVar.f15869a = "Deferred.asListenableFuture";
        } catch (Exception e10) {
            aVar2.f34708c.l(e10);
        }
        return aVar2;
    }
}
