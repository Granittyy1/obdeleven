package io.ktor.client.plugins;

import io.ktor.client.network.sockets.ConnectTimeoutException;
import io.ktor.client.network.sockets.SocketTimeoutException;

/* JADX INFO: compiled from: HttpTimeout.kt */
/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final cc.b f40408a = p144l6.b.a("io.ktor.client.plugins.HttpTimeout");

    public static final ConnectTimeoutException a(V9.c request, Throwable th) {
        Object obj;
        kotlin.jvm.internal.i.e(request, "request");
        StringBuilder sb2 = new StringBuilder("Connect timeout has expired [url=");
        sb2.append(request.f6849a);
        sb2.append(", connect_timeout=");
        u.b bVar = u.f40400d;
        u.a aVar = (u.a) request.a();
        if (aVar == null || (obj = aVar.f40406b) == null) {
            obj = "unknown";
        }
        sb2.append(obj);
        sb2.append(" ms]");
        return new ConnectTimeoutException(sb2.toString(), th);
    }

    public static final SocketTimeoutException b(V9.c request, Throwable th) {
        Object obj;
        kotlin.jvm.internal.i.e(request, "request");
        StringBuilder sb2 = new StringBuilder("Socket timeout has expired [url=");
        sb2.append(request.f6849a);
        sb2.append(", socket_timeout=");
        u.b bVar = u.f40400d;
        u.a aVar = (u.a) request.a();
        if (aVar == null || (obj = aVar.f40407c) == null) {
            obj = "unknown";
        }
        sb2.append(obj);
        sb2.append("] ms");
        return new SocketTimeoutException(sb2.toString(), th);
    }
}
