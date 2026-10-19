package V9;

import io.ktor.http.B;
import io.ktor.http.i;
import io.ktor.http.o;

/* JADX INFO: compiled from: DefaultHttpRequest.kt */
/* JADX INFO: loaded from: classes.dex */
public final class a implements b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final io.ktor.client.call.a f6844b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f6845c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final B f6846d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i f6847e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final io.ktor.util.f f6848f;

    public a(io.ktor.client.call.a aVar, c cVar) {
        this.f6844b = aVar;
        this.f6845c = cVar.f6850b;
        this.f6846d = cVar.f6849a;
        this.f6847e = cVar.f6851c;
        this.f6848f = cVar.f6854f;
    }

    @Override // io.ktor.http.l
    public final io.ktor.http.g a() {
        return this.f6847e;
    }

    @Override // V9.b
    public final io.ktor.util.b getAttributes() {
        return this.f6848f;
    }

    @Override // V9.b, kotlinx.coroutines.A
    public final kotlin.coroutines.e getCoroutineContext() {
        return this.f6844b.getCoroutineContext();
    }

    @Override // V9.b
    public final o getMethod() {
        return this.f6845c;
    }

    @Override // V9.b
    public final B k() {
        return this.f6846d;
    }
}
