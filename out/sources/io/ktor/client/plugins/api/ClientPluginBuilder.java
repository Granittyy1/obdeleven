package io.ktor.client.plugins.api;

import io.ktor.client.HttpClient;
import java.util.ArrayList;
import kotlin.jvm.internal.i;
import p293xa.r;

/* JADX INFO: compiled from: ClientPluginBuilder.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ClientPluginBuilder<PluginConfig> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PluginConfig f40337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f40338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Ia.a<r> f40339c;

    public ClientPluginBuilder(io.ktor.util.a<a<PluginConfig>> aVar, HttpClient client, PluginConfig pluginConfig) {
        i.e(client, "client");
        i.e(pluginConfig, "pluginConfig");
        this.f40337a = pluginConfig;
        this.f40338b = new ArrayList();
        this.f40339c = new Ia.a<r>() { // from class: io.ktor.client.plugins.api.ClientPluginBuilder$onClose$1
            @Override // Ia.a
            public final /* bridge */ /* synthetic */ r invoke() {
                return r.f47939a;
            }
        };
    }
}
