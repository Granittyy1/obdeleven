package com.google.android.gms.internal.common;

import io.ktor.client.engine.okhttp.StreamAdapterIOException;
import io.ktor.client.plugins.v;
import java.io.IOException;
import java.net.SocketTimeoutException;
import kotlin.text.n;
import kotlinx.coroutines.C2693i;
import kotlinx.coroutines.C2699k;
import okhttp3.InterfaceC2754e;
import okhttp3.z;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes3.dex */
public class h implements okhttp3.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f25357b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f25358c;

    public h(Class cls, Object obj) {
        this.f25357b = cls;
        this.f25358c = obj;
    }

    @Override // okhttp3.f
    public void onFailure(InterfaceC2754e call, IOException iOException) {
        kotlin.jvm.internal.i.e(call, "call");
        C2693i c2693i = (C2693i) this.f25358c;
        c2693i.getClass();
        if (C2693i.f43445h.get(c2693i) instanceof C2699k) {
            return;
        }
        if (iOException instanceof StreamAdapterIOException) {
            Throwable cause = iOException.getCause();
            if (cause != null) {
                iOException = cause;
            }
        } else if (iOException instanceof SocketTimeoutException) {
            String message = iOException.getMessage();
            V9.c cVar = (V9.c) this.f25357b;
            iOException = (message == null || !n.J(message, "connect", true)) ? v.b(cVar, iOException) : v.a(cVar, iOException);
        }
        c2693i.resumeWith(kotlin.b.a(iOException));
    }

    @Override // okhttp3.f
    public void onResponse(InterfaceC2754e call, z zVar) {
        kotlin.jvm.internal.i.e(call, "call");
        if (call.isCanceled()) {
            return;
        }
        ((C2693i) this.f25358c).resumeWith(zVar);
    }

    public h(V9.c requestData, C2693i c2693i) {
        kotlin.jvm.internal.i.e(requestData, "requestData");
        this.f25357b = requestData;
        this.f25358c = c2693i;
    }
}
