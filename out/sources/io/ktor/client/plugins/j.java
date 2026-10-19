package io.ktor.client.plugins;

import io.ktor.client.HttpClient;

/* JADX INFO: compiled from: HttpClientPlugin.kt */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final io.ktor.util.a<io.ktor.util.b> f40368a = new io.ktor.util.a<>("ApplicationPluginRegistry");

    public static final Object a(HttpClient httpClient) {
        t.d dVar = t.f40392b;
        kotlin.jvm.internal.i.e(httpClient, "<this>");
        Object objB = b(httpClient, dVar);
        if (objB != null) {
            return objB;
        }
        throw new IllegalStateException("Plugin " + dVar + " is not installed. Consider using `install(" + t.f40393c + ")` in client config first.");
    }

    public static final <B, F> F b(HttpClient httpClient, i<? extends B, F> plugin) {
        kotlin.jvm.internal.i.e(httpClient, "<this>");
        kotlin.jvm.internal.i.e(plugin, "plugin");
        io.ktor.util.b bVar = (io.ktor.util.b) httpClient.j.d(f40368a);
        if (bVar != null) {
            return (F) bVar.d(plugin.getKey());
        }
        return null;
    }
}
