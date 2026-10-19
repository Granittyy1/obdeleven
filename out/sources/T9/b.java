package T9;

import io.ktor.http.B;
import io.ktor.http.g;
import io.ktor.http.o;
import kotlin.coroutines.e;

/* JADX INFO: compiled from: DelegatedCall.kt */
/* JADX INFO: loaded from: classes.dex */
public final class b implements V9.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ V9.b f6051b;

    public b(a aVar, V9.b bVar) {
        this.f6051b = bVar;
    }

    @Override // io.ktor.http.l
    public final g a() {
        return this.f6051b.a();
    }

    @Override // V9.b
    public final io.ktor.util.b getAttributes() {
        return this.f6051b.getAttributes();
    }

    @Override // V9.b, kotlinx.coroutines.A
    public final e getCoroutineContext() {
        return this.f6051b.getCoroutineContext();
    }

    @Override // V9.b
    public final o getMethod() {
        return this.f6051b.getMethod();
    }

    @Override // V9.b
    public final B k() {
        return this.f6051b.k();
    }
}
