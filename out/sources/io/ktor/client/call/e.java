package io.ktor.client.call;

import io.ktor.http.g;
import io.ktor.http.p;
import io.ktor.http.q;
import io.ktor.utils.io.ByteBufferChannel;
import io.ktor.utils.io.ByteReadChannel;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.C2700k0;
import kotlinx.coroutines.C2702l0;

/* JADX INFO: compiled from: SavedCall.kt */
/* JADX INFO: loaded from: classes.dex */
public final class e extends io.ktor.client.statement.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f40268b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f40269c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p f40270d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Z9.b f40271e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Z9.b f40272f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final g f40273g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final kotlin.coroutines.e f40274h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ByteBufferChannel f40275i;

    public e(c call, byte[] bArr, io.ktor.client.statement.c cVar) {
        i.e(call, "call");
        this.f40268b = call;
        C2700k0 c2700k0A = C2702l0.a();
        this.f40269c = cVar.f();
        this.f40270d = cVar.g();
        this.f40271e = cVar.d();
        this.f40272f = cVar.e();
        this.f40273g = cVar.a();
        this.f40274h = cVar.getCoroutineContext().plus(c2700k0A);
        this.f40275i = h.a(bArr);
    }

    @Override // io.ktor.http.l
    public final g a() {
        return this.f40273g;
    }

    @Override // io.ktor.client.statement.c
    public final a b() {
        return this.f40268b;
    }

    @Override // io.ktor.client.statement.c
    public final ByteReadChannel c() {
        return this.f40275i;
    }

    @Override // io.ktor.client.statement.c
    public final Z9.b d() {
        return this.f40271e;
    }

    @Override // io.ktor.client.statement.c
    public final Z9.b e() {
        return this.f40272f;
    }

    @Override // io.ktor.client.statement.c
    public final q f() {
        return this.f40269c;
    }

    @Override // io.ktor.client.statement.c
    public final p g() {
        return this.f40270d;
    }

    @Override // kotlinx.coroutines.A
    public final kotlin.coroutines.e getCoroutineContext() {
        return this.f40274h;
    }
}
