package io.ktor.client.engine.okhttp;

import D2.V;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.jvm.javaio.BlockingKt;
import java.io.IOException;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.i;
import okhttp3.r;
import okhttp3.y;
import p293xa.g;
import p318zb.InterfaceC2840g;
import p318zb.v;

/* JADX INFO: compiled from: StreamRequestBody.kt */
/* JADX INFO: loaded from: classes.dex */
public final class b extends y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f40302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lambda f40303b;

    /* JADX WARN: Multi-variable type inference failed */
    public b(Long l10, Ia.a<? extends ByteReadChannel> aVar) {
        this.f40302a = l10;
        this.f40303b = (Lambda) aVar;
    }

    @Override // okhttp3.y
    public final long contentLength() {
        Long l10 = this.f40302a;
        if (l10 != null) {
            return l10.longValue();
        }
        return -1L;
    }

    @Override // okhttp3.y
    public final r contentType() {
        return null;
    }

    @Override // okhttp3.y
    public final boolean isOneShot() {
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [Ia.a, kotlin.jvm.internal.Lambda] */
    @Override // okhttp3.y
    public final void writeTo(InterfaceC2840g sink) throws IOException {
        Long lValueOf;
        i.e(sink, "sink");
        try {
            ByteReadChannel byteReadChannel = (ByteReadChannel) this.f40303b.invoke();
            g gVar = BlockingKt.f40641a;
            i.e(byteReadChannel, "<this>");
            Throwable th = null;
            p318zb.r rVarG = v.g(new io.ktor.utils.io.jvm.javaio.b(null, byteReadChannel));
            try {
                lValueOf = Long.valueOf(sink.k0(rVarG));
                try {
                    rVarG.close();
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                try {
                    rVarG.close();
                } catch (Throwable th4) {
                    V.e(th3, th4);
                }
                th = th3;
                lValueOf = null;
            }
            if (th != null) {
                throw th;
            }
            i.b(lValueOf);
        } catch (IOException e10) {
            throw e10;
        } catch (Throwable th5) {
            throw new StreamAdapterIOException(th5);
        }
    }
}
