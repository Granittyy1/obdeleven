package V9;

import io.ktor.http.B;
import io.ktor.http.l;
import io.ktor.http.o;
import kotlinx.coroutines.A;

/* JADX INFO: compiled from: HttpRequest.kt */
/* JADX INFO: loaded from: classes.dex */
public interface b extends l, A {
    io.ktor.util.b getAttributes();

    kotlin.coroutines.e getCoroutineContext();

    o getMethod();

    B k();
}
