package io.ktor.client.call;

import io.ktor.http.B;
import io.ktor.http.g;
import io.ktor.http.o;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: SavedCall.kt */
/* JADX INFO: loaded from: classes.dex */
public final class d implements V9.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ V9.b f40267b;

    public d(c call, V9.b bVar) {
        i.e(call, "call");
        this.f40267b = bVar;
    }

    @Override // io.ktor.http.l
    public final g a() {
        return this.f40267b.a();
    }

    @Override // V9.b
    public final io.ktor.util.b getAttributes() {
        return this.f40267b.getAttributes();
    }

    @Override // V9.b, kotlinx.coroutines.A
    public final kotlin.coroutines.e getCoroutineContext() {
        return this.f40267b.getCoroutineContext();
    }

    @Override // V9.b
    public final o getMethod() {
        return this.f40267b.getMethod();
    }

    @Override // V9.b
    public final B k() {
        return this.f40267b.k();
    }
}
