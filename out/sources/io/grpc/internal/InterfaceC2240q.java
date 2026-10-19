package io.grpc.internal;

import io.grpc.HttpConnectProxiedSocketAddress;
import java.io.Closeable;
import java.net.SocketAddress;
import java.util.Arrays;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: renamed from: io.grpc.internal.q, reason: case insensitive filesystem */
/* JADX INFO: compiled from: ClientTransportFactory.java */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC2240q extends Closeable {

    /* JADX INFO: renamed from: io.grpc.internal.q$a */
    /* JADX INFO: compiled from: ClientTransportFactory.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f37659a = "unknown-authority";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public io.grpc.a f37660b = io.grpc.a.f36932b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public HttpConnectProxiedSocketAddress f37661c;

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f37659a.equals(aVar.f37659a) && this.f37660b.equals(aVar.f37660b) && kotlinx.coroutines.C.j(null, null) && kotlinx.coroutines.C.j(this.f37661c, aVar.f37661c);
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.f37659a, this.f37660b, null, this.f37661c});
        }
    }

    ScheduledExecutorService G0();

    InterfaceC2243s Y(SocketAddress socketAddress, a aVar, U.f fVar);
}
