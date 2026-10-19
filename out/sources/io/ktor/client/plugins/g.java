package io.ktor.client.plugins;

import io.ktor.http.B;

/* JADX INFO: compiled from: HttpCallValidator.kt */
/* JADX INFO: loaded from: classes.dex */
public final class g implements V9.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final io.ktor.http.o f40362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final B f40363c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final io.ktor.util.f f40364d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final io.ktor.http.i f40365e;

    public g(io.ktor.client.request.a aVar) {
        this.f40362b = aVar.f40411b;
        this.f40363c = aVar.f40410a.b();
        this.f40364d = aVar.f40415f;
        this.f40365e = new io.ktor.http.i(aVar.f40412c.f40530a);
    }

    @Override // io.ktor.http.l
    public final io.ktor.http.g a() {
        return this.f40365e;
    }

    @Override // V9.b
    public final io.ktor.util.b getAttributes() {
        return this.f40364d;
    }

    @Override // V9.b, kotlinx.coroutines.A
    public final kotlin.coroutines.e getCoroutineContext() {
        throw new IllegalStateException("Call is not initialized");
    }

    @Override // V9.b
    public final io.ktor.http.o getMethod() {
        return this.f40362b;
    }

    @Override // V9.b
    public final B k() {
        return this.f40363c;
    }
}
