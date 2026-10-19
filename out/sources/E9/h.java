package E9;

import io.grpc.internal.V0;
import p318zb.C2839f;

/* JADX INFO: compiled from: OkHttpWritableBuffer.java */
/* JADX INFO: loaded from: classes3.dex */
public final class h implements V0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2839f f3168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3169b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3170c;

    public h(C2839f c2839f, int i10) {
        this.f3168a = c2839f;
        this.f3169b = i10;
    }

    @Override // io.grpc.internal.V0
    public final void a(byte[] bArr, int i10, int i11) {
        this.f3168a.S0(bArr, i10, i11);
        this.f3169b -= i11;
        this.f3170c += i11;
    }

    @Override // io.grpc.internal.V0
    public final void b(byte b10) {
        this.f3168a.Z0(b10);
        this.f3169b--;
        this.f3170c++;
    }

    @Override // io.grpc.internal.V0
    public final int c() {
        return this.f3169b;
    }

    @Override // io.grpc.internal.V0
    public final int e() {
        return this.f3170c;
    }
}
