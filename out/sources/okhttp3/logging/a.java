package okhttp3.logging;

import kotlin.jvm.internal.i;
import p244tb.h;

/* JADX INFO: compiled from: HttpLoggingInterceptor.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class a implements HttpLoggingInterceptor.a {
    @Override // okhttp3.logging.HttpLoggingInterceptor.a
    public final void a(String message) {
        i.e(message, "message");
        h hVar = h.f47384a;
        h.j(h.f47384a, message, 0, 6);
    }
}
