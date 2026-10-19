package io.ktor.client.plugins.api;

import Ia.l;
import io.ktor.client.HttpClient;
import io.ktor.client.plugins.i;
import kotlin.jvm.internal.Lambda;
import p293xa.r;

/* JADX INFO: compiled from: CreatePluginUtils.kt */
/* JADX INFO: loaded from: classes.dex */
public final class b implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final io.ktor.util.a<a<Object>> f40345a = new io.ktor.util.a<>("IntegrityHeaders");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ia.a<Object> f40346b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l<ClientPluginBuilder<Object>, r> f40347c;

    public b(Ia.a aVar, l lVar) {
        this.f40346b = aVar;
        this.f40347c = lVar;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // io.ktor.client.plugins.i
    public final void a(Object obj, HttpClient scope) {
        a plugin = (a) obj;
        kotlin.jvm.internal.i.e(plugin, "plugin");
        kotlin.jvm.internal.i.e(scope, "scope");
        ClientPluginBuilder clientPluginBuilder = new ClientPluginBuilder(new io.ktor.util.a("IntegrityHeaders"), scope, plugin.f40342b);
        plugin.f40343c.invoke((ClientPluginBuilder<PluginConfig>) clientPluginBuilder);
        plugin.f40344d = (Lambda) clientPluginBuilder.f40339c;
        for (c cVar : clientPluginBuilder.f40338b) {
            cVar.getClass();
            scope.f40243f.f(V9.d.f6857g, new RequestHook$install$1((Ia.r) cVar.f40348a, null));
        }
    }

    @Override // io.ktor.client.plugins.i
    public final Object b(l lVar) {
        Object objInvoke = this.f40346b.invoke();
        lVar.invoke(objInvoke);
        return new a(objInvoke, this.f40347c);
    }

    @Override // io.ktor.client.plugins.i
    public final io.ktor.util.a<a<Object>> getKey() {
        return this.f40345a;
    }
}
