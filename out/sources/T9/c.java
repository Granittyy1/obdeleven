package T9;

import io.ktor.http.g;
import io.ktor.http.p;
import io.ktor.http.q;
import io.ktor.utils.io.ByteReadChannel;
import kotlin.coroutines.e;

/* JADX INFO: compiled from: DelegatedCall.kt */
/* JADX INFO: loaded from: classes.dex */
public final class c extends io.ktor.client.statement.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f6052b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final io.ktor.utils.io.a f6053c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final io.ktor.client.statement.c f6054d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e f6055e;

    public c(a aVar, io.ktor.utils.io.a aVar2, io.ktor.client.statement.c cVar) {
        this.f6052b = aVar;
        this.f6053c = aVar2;
        this.f6054d = cVar;
        this.f6055e = cVar.getCoroutineContext();
    }

    @Override // io.ktor.http.l
    public final g a() {
        return this.f6054d.a();
    }

    @Override // io.ktor.client.statement.c
    public final io.ktor.client.call.a b() {
        return this.f6052b;
    }

    @Override // io.ktor.client.statement.c
    public final ByteReadChannel c() {
        return this.f6053c;
    }

    @Override // io.ktor.client.statement.c
    public final Z9.b d() {
        return this.f6054d.d();
    }

    @Override // io.ktor.client.statement.c
    public final Z9.b e() {
        return this.f6054d.e();
    }

    @Override // io.ktor.client.statement.c
    public final q f() {
        return this.f6054d.f();
    }

    @Override // io.ktor.client.statement.c
    public final p g() {
        return this.f6054d.g();
    }

    @Override // kotlinx.coroutines.A
    public final e getCoroutineContext() {
        return this.f6055e;
    }
}
