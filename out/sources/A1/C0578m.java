package A1;

import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: renamed from: A1.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: DiscardingTrackOutput.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0578m implements K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f538a = new byte[4096];

    @Override // A1.K
    public final void c(p114j1.r rVar, int i10, int i11) {
        rVar.H(i10);
    }

    @Override // A1.K
    public final int e(p078g1.i iVar, int i10, boolean z10) throws IOException {
        byte[] bArr = this.f538a;
        int i11 = iVar.read(bArr, 0, Math.min(bArr.length, i10));
        if (i11 != -1) {
            return i11;
        }
        if (z10) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // A1.K
    public final void d(p078g1.n nVar) {
    }

    @Override // A1.K
    public final void b(long j, int i10, int i11, int i12, K.a aVar) {
    }
}
