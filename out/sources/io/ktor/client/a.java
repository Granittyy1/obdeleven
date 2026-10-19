package io.ktor.client;

import Ia.l;
import io.ktor.client.engine.okhttp.OkHttpConfig;
import io.ktor.client.engine.okhttp.OkHttpEngine;
import java.io.IOException;
import kotlin.coroutines.e;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.InterfaceC2694i0;
import p293xa.r;

/* JADX INFO: compiled from: HttpClient.kt */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    /* JADX WARN: Type inference failed for: r3v1, types: [Ia.l, java.lang.Object, kotlin.jvm.internal.Lambda] */
    public static final HttpClient a(l lVar) {
        HttpClientConfig httpClientConfig = new HttpClientConfig();
        lVar.invoke(httpClientConfig);
        ?? block = httpClientConfig.f40253d;
        i.e(block, "block");
        OkHttpConfig okHttpConfig = new OkHttpConfig();
        block.invoke(okHttpConfig);
        final OkHttpEngine okHttpEngine = new OkHttpEngine(okHttpConfig);
        HttpClient httpClient = new HttpClient(okHttpEngine, httpClientConfig);
        e.a aVar = httpClient.f40242e.get(InterfaceC2694i0.b.f43449b);
        i.b(aVar);
        ((InterfaceC2694i0) aVar).B(new l<Throwable, r>() { // from class: io.ktor.client.HttpClientKt$HttpClient$2
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(Throwable th) throws IOException {
                okHttpEngine.close();
                return r.f47939a;
            }
        });
        return httpClient;
    }
}
