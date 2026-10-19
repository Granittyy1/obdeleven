package io.ktor.client.plugins;

import io.ktor.client.HttpClient;

/* JADX INFO: compiled from: HttpClientPlugin.kt */
/* JADX INFO: loaded from: classes.dex */
public interface i<TConfig, TPlugin> {
    void a(TPlugin tplugin, HttpClient httpClient);

    TPlugin b(Ia.l<? super TConfig, p293xa.r> lVar);

    io.ktor.util.a<TPlugin> getKey();
}
