package E9;

import A8.p;
import io.grpc.okhttp.internal.framed.ErrorCode;
import java.io.IOException;
import java.util.ArrayList;
import p237t3.x;
import p318zb.C2839f;

/* JADX INFO: compiled from: ForwardingFrameWriter.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class b implements F9.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final F9.b f3144b;

    public b(F9.b bVar) {
        p.j(bVar, "delegate");
        this.f3144b = bVar;
    }

    @Override // F9.b
    public final void F() throws IOException {
        this.f3144b.F();
    }

    @Override // F9.b
    public final void K(ErrorCode errorCode, byte[] bArr) throws IOException {
        this.f3144b.K(errorCode, bArr);
    }

    @Override // F9.b
    public final int M0() {
        return this.f3144b.M0();
    }

    @Override // F9.b
    public final void Q(int i10, long j) throws IOException {
        this.f3144b.Q(i10, j);
    }

    @Override // F9.b
    public final void W0(boolean z10, int i10, ArrayList arrayList) throws IOException {
        this.f3144b.W0(z10, i10, arrayList);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f3144b.close();
    }

    @Override // F9.b
    public final void flush() throws IOException {
        this.f3144b.flush();
    }

    @Override // F9.b
    public final void n(x xVar) throws IOException {
        this.f3144b.n(xVar);
    }

    @Override // F9.b
    public final void v(boolean z10, int i10, C2839f c2839f, int i11) throws IOException {
        this.f3144b.v(z10, i10, c2839f, i11);
    }
}
