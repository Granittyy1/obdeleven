package io.ktor.client.statement;

import io.ktor.http.l;
import io.ktor.http.p;
import io.ktor.http.q;
import io.ktor.utils.io.ByteReadChannel;
import kotlinx.coroutines.A;

/* JADX INFO: compiled from: HttpResponse.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class c implements l, A {
    public abstract io.ktor.client.call.a b();

    public abstract ByteReadChannel c();

    public abstract Z9.b d();

    public abstract Z9.b e();

    public abstract q f();

    public abstract p g();

    public final String toString() {
        return "HttpResponse[" + b().c().k() + ", " + f() + ']';
    }
}
