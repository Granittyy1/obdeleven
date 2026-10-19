package io.grpc.internal;

import java.io.InputStream;

/* JADX INFO: renamed from: io.grpc.internal.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: AbstractStream.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2216e implements P0 {

    /* JADX INFO: renamed from: io.grpc.internal.e$a */
    /* JADX INFO: compiled from: AbstractStream.java */
    public static abstract class a implements MessageDeframer.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public InterfaceC2247u f37531a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f37532b = new Object();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final U0 f37533c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final MessageDeframer f37534d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f37535e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f37536f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f37537g;

        public a(int i10, O0 o10, U0 u10) {
            A8.p.j(u10, "transportTracer");
            this.f37533c = u10;
            MessageDeframer messageDeframer = new MessageDeframer(this, i10, o10, u10);
            this.f37534d = messageDeframer;
            this.f37531a = messageDeframer;
        }

        @Override // io.grpc.internal.MessageDeframer.a
        public final void a(Q0.a aVar) {
            ((AbstractC2208a.b) this).j.a(aVar);
        }

        public final void b(int i10) {
            boolean z10;
            boolean zE;
            synchronized (this.f37532b) {
                A8.p.p("onStreamAllocated was not called, but it seems the stream is active", this.f37536f);
                int i11 = this.f37535e;
                z10 = false;
                boolean z11 = i11 < 32768;
                int i12 = i11 - i10;
                this.f37535e = i12;
                boolean z12 = i12 < 32768;
                if (!z11 && z12) {
                    z10 = true;
                }
            }
            if (z10) {
                synchronized (this.f37532b) {
                    zE = e();
                }
                if (zE) {
                    ((AbstractC2208a.b) this).j.c();
                }
            }
        }

        public final boolean e() {
            boolean z10;
            synchronized (this.f37532b) {
                try {
                    z10 = this.f37536f && this.f37535e < 32768 && !this.f37537g;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return z10;
        }
    }

    @Override // io.grpc.internal.P0
    public final void a(D9.f fVar) {
        ((AbstractC2208a) this).f37500b.a(fVar);
    }

    @Override // io.grpc.internal.P0
    public final void flush() {
        M m7 = ((AbstractC2208a) this).f37500b;
        if (m7.isClosed()) {
            return;
        }
        m7.flush();
    }

    @Override // io.grpc.internal.P0
    public final void k(InputStream inputStream) {
        A8.p.j(inputStream, "message");
        try {
            if (!((AbstractC2208a) this).f37500b.isClosed()) {
                ((AbstractC2208a) this).f37500b.b(inputStream);
            }
        } finally {
            GrpcUtil.b(inputStream);
        }
    }

    @Override // io.grpc.internal.P0
    public final void l() {
        a aVarM = m();
        MessageDeframer messageDeframer = aVarM.f37534d;
        messageDeframer.f37397b = aVarM;
        aVarM.f37531a = messageDeframer;
    }

    public abstract a m();

    @Override // io.grpc.internal.P0
    public final void request() {
        a aVarM = m();
        aVarM.getClass();
        p111ia.b.b();
        RunnableC2214d runnableC2214d = new RunnableC2214d(aVarM);
        synchronized (((io.grpc.okhttp.c.b) aVarM).f37865w) {
            runnableC2214d.run();
        }
    }
}
