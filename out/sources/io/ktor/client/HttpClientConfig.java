package io.ktor.client;

import Ia.l;
import io.ktor.client.engine.d;
import io.ktor.util.b;
import io.ktor.util.f;
import io.ktor.util.j;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.i;
import p293xa.r;

/* JADX INFO: compiled from: HttpClientConfig.kt */
/* JADX INFO: loaded from: classes.dex */
public final class HttpClientConfig<T extends d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f40250a = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f40251b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f40252c = new LinkedHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Lambda f40253d = new l<T, r>() { // from class: io.ktor.client.HttpClientConfig$engineConfig$1
        @Override // Ia.l
        public final r invoke(Object obj) {
            i.e((d) obj, "$this$null");
            return r.f47939a;
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f40254e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f40255f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f40256g = j.f40546a;

    /* JADX WARN: Type inference failed for: r0v1, types: [Ia.l, kotlin.jvm.internal.Lambda] */
    /* JADX WARN: Type inference failed for: r1v0, types: [io.ktor.client.HttpClientConfig$engine$1, kotlin.jvm.internal.Lambda] */
    public final void a(final l<? super T, r> block) {
        i.e(block, "block");
        final ?? r10 = this.f40253d;
        this.f40253d = new l<T, r>() { // from class: io.ktor.client.HttpClientConfig$engine$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(Object obj) {
                d dVar = (d) obj;
                i.e(dVar, "$this$null");
                r10.invoke(dVar);
                block.invoke(dVar);
                return r.f47939a;
            }
        };
    }

    public final <TBuilder, TPlugin> void b(final io.ktor.client.plugins.i<? extends TBuilder, TPlugin> plugin, final l<? super TBuilder, r> configure) {
        i.e(plugin, "plugin");
        i.e(configure, "configure");
        LinkedHashMap linkedHashMap = this.f40251b;
        final l lVar = (l) linkedHashMap.get(plugin.getKey());
        linkedHashMap.put(plugin.getKey(), new l<Object, r>() { // from class: io.ktor.client.HttpClientConfig$install$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // Ia.l
            public final r invoke(Object obj) {
                i.e(obj, "$this$null");
                l<Object, r> lVar2 = lVar;
                if (lVar2 != null) {
                    lVar2.invoke(obj);
                }
                configure.invoke((TBuilder) obj);
                return r.f47939a;
            }
        });
        LinkedHashMap linkedHashMap2 = this.f40250a;
        if (linkedHashMap2.containsKey(plugin.getKey())) {
            return;
        }
        linkedHashMap2.put(plugin.getKey(), new l<HttpClient, r>() { // from class: io.ktor.client.HttpClientConfig$install$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // Ia.l
            public final r invoke(HttpClient httpClient) {
                HttpClient scope = httpClient;
                i.e(scope, "scope");
                b bVar = (b) scope.j.e(io.ktor.client.plugins.j.f40368a, new Ia.a<b>() { // from class: io.ktor.client.HttpClientConfig$install$3$attributes$1
                    @Override // Ia.a
                    public final b invoke() {
                        return new f();
                    }
                });
                Object obj = scope.f40248l.f40251b.get(plugin.getKey());
                i.b(obj);
                Object objB = plugin.b((l<? super TBuilder, r>) ((l) obj));
                plugin.a((TPlugin) objB, scope);
                bVar.f(plugin.getKey(), objB);
                return r.f47939a;
            }
        });
    }
}
