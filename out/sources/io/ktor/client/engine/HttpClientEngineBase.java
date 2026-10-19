package io.ktor.client.engine;

import io.intercom.android.sdk.metrics.MetricTracker;
import io.ktor.client.HttpClient;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.B0;
import kotlinx.coroutines.C2715z;
import kotlinx.coroutines.InterfaceC2694i0;
import kotlinx.coroutines.InterfaceC2707q;
import kotlinx.coroutines.InterfaceC2713x;
import kotlinx.coroutines.N;

/* JADX INFO: compiled from: HttpClientEngineBase.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class HttpClientEngineBase implements a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f40280e = AtomicIntegerFieldUpdater.newUpdater(HttpClientEngineBase.class, MetricTracker.Action.CLOSED);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f40281b;
    private volatile /* synthetic */ int closed = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Sa.a f40282c = N.f43200c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p293xa.g f40283d = kotlin.a.a(new Ia.a<kotlin.coroutines.e>() { // from class: io.ktor.client.engine.HttpClientEngineBase$coroutineContext$2
        {
            super(0);
        }

        @Override // Ia.a
        public final kotlin.coroutines.e invoke() {
            return kotlin.coroutines.e.a.C0479a.d(new B0(null), new io.ktor.util.g(InterfaceC2713x.a.f43616b)).plus(this.this$0.f40282c).plus(new C2715z(this.this$0.f40281b.concat("-context")));
        }
    });

    public HttpClientEngineBase(String str) {
        this.f40281b = str;
    }

    @Override // io.ktor.client.engine.a
    public Set<b<?>> I() {
        return EmptySet.f42985b;
    }

    @Override // io.ktor.client.engine.a
    public final void J0(HttpClient client) {
        i.e(client, "client");
        client.f40245h.f(V9.f.f6871i, new HttpClientEngine$install$1(client, this, null));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (f40280e.compareAndSet(this, 0, 1)) {
            kotlin.coroutines.e.a aVar = getCoroutineContext().get(InterfaceC2694i0.b.f43449b);
            InterfaceC2707q interfaceC2707q = aVar instanceof InterfaceC2707q ? (InterfaceC2707q) aVar : null;
            if (interfaceC2707q == null) {
                return;
            }
            interfaceC2707q.b();
        }
    }

    @Override // kotlinx.coroutines.A
    public kotlin.coroutines.e getCoroutineContext() {
        return (kotlin.coroutines.e) this.f40283d.getValue();
    }
}
