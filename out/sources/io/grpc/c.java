package io.grpc;

/* JADX INFO: compiled from: ClientStreamTracer.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class c extends C.g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final io.grpc.b.C0388b<Boolean> f36954c = new io.grpc.b.C0388b<>("io.grpc.ClientStreamTracer.NAME_RESOLUTION_DELAYED", Boolean.FALSE);

    /* JADX INFO: compiled from: ClientStreamTracer.java */
    public static abstract class a {
        public c a(b bVar, m mVar) {
            throw new UnsupportedOperationException("Not implemented");
        }
    }

    /* JADX INFO: compiled from: ClientStreamTracer.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final io.grpc.b f36955a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f36956b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f36957c;

        public b(io.grpc.b bVar, int i10, boolean z10) {
            A8.p.j(bVar, "callOptions");
            this.f36955a = bVar;
            this.f36956b = i10;
            this.f36957c = z10;
        }

        public final String toString() {
            com.google.common.base.d.a aVarB = com.google.common.base.d.b(this);
            aVarB.c(this.f36955a, "callOptions");
            aVarB.a(this.f36956b, "previousAttempts");
            aVarB.d("isTransparentRetry", this.f36957c);
            return aVarB.toString();
        }
    }

    public void i0() {
    }

    public void j0() {
    }

    public void l0() {
    }

    public void k0(m mVar) {
    }

    public void m0(io.grpc.a aVar, m mVar) {
    }
}
