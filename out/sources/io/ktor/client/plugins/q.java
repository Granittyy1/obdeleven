package io.ktor.client.plugins;

import io.ktor.client.HttpClient;

/* JADX INFO: compiled from: HttpRequestLifecycle.kt */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f40383a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final io.ktor.util.a<q> f40384b = new io.ktor.util.a<>("RequestLifecycle");

    /* JADX INFO: compiled from: HttpRequestLifecycle.kt */
    public static final class a implements i<p293xa.r, q> {
        @Override // io.ktor.client.plugins.i
        public final void a(q qVar, HttpClient scope) {
            q plugin = qVar;
            kotlin.jvm.internal.i.e(plugin, "plugin");
            kotlin.jvm.internal.i.e(scope, "scope");
            scope.f40243f.f(V9.d.f6856f, new HttpRequestLifecycle$Plugin$install$1(scope, null));
        }

        @Override // io.ktor.client.plugins.i
        public final q b(Ia.l<? super p293xa.r, p293xa.r> lVar) {
            return new q();
        }

        @Override // io.ktor.client.plugins.i
        public final io.ktor.util.a<q> getKey() {
            return q.f40384b;
        }
    }
}
