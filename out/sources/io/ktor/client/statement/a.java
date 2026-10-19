package io.ktor.client.statement;

import io.ktor.http.p;
import io.ktor.http.q;
import io.ktor.utils.io.ByteReadChannel;

/* JADX INFO: compiled from: DefaultHttpResponse.kt */
/* JADX INFO: loaded from: classes.dex */
public final class a extends c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final io.ktor.client.call.a f40416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kotlin.coroutines.e f40417c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q f40418d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p f40419e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Z9.b f40420f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Z9.b f40421g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ByteReadChannel f40422h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final io.ktor.http.g f40423i;

    public a(io.ktor.client.call.a aVar, V9.e eVar) {
        this.f40416b = aVar;
        this.f40417c = eVar.f6866f;
        this.f40418d = eVar.f6861a;
        this.f40419e = eVar.f6864d;
        this.f40420f = eVar.f6862b;
        this.f40421g = eVar.f6867g;
        Object obj = eVar.f6865e;
        io.ktor.utils.io.a value = obj instanceof ByteReadChannel ? (ByteReadChannel) obj : null;
        if (value == null) {
            ByteReadChannel.f40586a.getClass();
            value = ByteReadChannel.Companion.f40588b.getValue();
        }
        this.f40422h = value;
        this.f40423i = eVar.f6863c;
    }

    @Override // io.ktor.http.l
    public final io.ktor.http.g a() {
        return this.f40423i;
    }

    @Override // io.ktor.client.statement.c
    public final io.ktor.client.call.a b() {
        return this.f40416b;
    }

    @Override // io.ktor.client.statement.c
    public final ByteReadChannel c() {
        return this.f40422h;
    }

    @Override // io.ktor.client.statement.c
    public final Z9.b d() {
        return this.f40420f;
    }

    @Override // io.ktor.client.statement.c
    public final Z9.b e() {
        return this.f40421g;
    }

    @Override // io.ktor.client.statement.c
    public final q f() {
        return this.f40418d;
    }

    @Override // io.ktor.client.statement.c
    public final p g() {
        return this.f40419e;
    }

    @Override // kotlinx.coroutines.A
    public final kotlin.coroutines.e getCoroutineContext() {
        return this.f40417c;
    }
}
