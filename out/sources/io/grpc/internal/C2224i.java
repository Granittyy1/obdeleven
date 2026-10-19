package io.grpc.internal;

import com.braze.support.BrazeLogger;
import io.grpc.MethodDescriptor;
import io.grpc.Status;
import java.net.SocketAddress;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: io.grpc.internal.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: CallCredentialsApplyingTransportFactory.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C2224i implements InterfaceC2240q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC2240q f37553b;

    /* JADX INFO: renamed from: io.grpc.internal.i$a */
    /* JADX INFO: compiled from: CallCredentialsApplyingTransportFactory.java */
    public class a extends J {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InterfaceC2243s f37554a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AtomicInteger f37555b = new AtomicInteger(-2147483647);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public volatile Status f37556c;

        /* JADX INFO: renamed from: io.grpc.internal.i$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: CallCredentialsApplyingTransportFactory.java */
        public class C0394a {
        }

        public a(InterfaceC2243s interfaceC2243s, String str) {
            A8.p.j(interfaceC2243s, "delegate");
            this.f37554a = interfaceC2243s;
        }

        @Override // io.grpc.internal.J
        public final InterfaceC2243s a() {
            return this.f37554a;
        }

        @Override // io.grpc.internal.InterfaceC2238p
        public final InterfaceC2236o b(MethodDescriptor<?, ?> methodDescriptor, io.grpc.m mVar, io.grpc.b bVar, io.grpc.c[] cVarArr) {
            bVar.getClass();
            C2224i.this.getClass();
            return this.f37555b.get() >= 0 ? new F(this.f37556c, ClientStreamListener.RpcProgress.f37134b, cVarArr) : this.f37554a.b(methodDescriptor, mVar, bVar, cVarArr);
        }

        @Override // io.grpc.internal.J, io.grpc.internal.InterfaceC2239p0
        public final void c(Status status) {
            A8.p.j(status, "status");
            synchronized (this) {
                try {
                    if (this.f37555b.get() < 0) {
                        this.f37556c = status;
                        this.f37555b.addAndGet(BrazeLogger.SUPPRESS);
                        if (this.f37555b.get() != 0) {
                            return;
                        }
                        super.c(status);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public C2224i(InterfaceC2240q interfaceC2240q, ManagedChannelImpl.g gVar) {
        A8.p.j(interfaceC2240q, "delegate");
        this.f37553b = interfaceC2240q;
    }

    @Override // io.grpc.internal.InterfaceC2240q
    public final ScheduledExecutorService G0() {
        return this.f37553b.G0();
    }

    @Override // io.grpc.internal.InterfaceC2240q
    public final InterfaceC2243s Y(SocketAddress socketAddress, InterfaceC2240q.a aVar, U.f fVar) {
        return new a(this.f37553b.Y(socketAddress, aVar, fVar), aVar.f37659a);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f37553b.close();
    }
}
