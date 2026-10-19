package io.ktor.client.plugins.api;

import Ia.l;
import java.io.Closeable;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.i;
import p293xa.r;

/* JADX INFO: compiled from: ClientPluginInstance.kt */
/* JADX INFO: loaded from: classes.dex */
public final class a<PluginConfig> implements Closeable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PluginConfig f40342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l<ClientPluginBuilder<PluginConfig>, r> f40343c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Lambda f40344d;

    /* JADX WARN: Multi-variable type inference failed */
    public a(Object config, l body) {
        i.e(config, "config");
        i.e(body, "body");
        this.f40342b = config;
        this.f40343c = body;
        this.f40344d = new Ia.a<r>() { // from class: io.ktor.client.plugins.api.ClientPluginInstance$onClose$1
            @Override // Ia.a
            public final /* bridge */ /* synthetic */ r invoke() {
                return r.f47939a;
            }
        };
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Ia.a, kotlin.jvm.internal.Lambda] */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f40344d.invoke();
    }
}
