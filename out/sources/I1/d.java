package I1;

import A1.C0574i;
import A1.q;
import java.io.IOException;

/* JADX INFO: compiled from: StartOffsetExtractorInput.java */
/* JADX INFO: loaded from: classes.dex */
public final class d implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0574i f3797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f3798b;

    public d(C0574i c0574i, long j) {
        this.f3797a = c0574i;
        p241t7.b.e(c0574i.f523d >= j);
        this.f3798b = j;
    }

    @Override // A1.q
    public final boolean a(byte[] bArr, int i10, int i11, boolean z10) throws IOException {
        return this.f3797a.a(bArr, 0, i11, z10);
    }

    @Override // A1.q
    public final boolean c(byte[] bArr, int i10, int i11, boolean z10) throws IOException {
        return this.f3797a.c(bArr, 0, i11, z10);
    }

    @Override // A1.q
    public final long d() {
        return this.f3797a.d() - this.f3798b;
    }

    @Override // A1.q
    public final void e(int i10) throws IOException {
        this.f3797a.k(i10, false);
    }

    @Override // A1.q
    public final long getLength() {
        return this.f3797a.f522c - this.f3798b;
    }

    @Override // A1.q
    public final long getPosition() {
        return this.f3797a.f523d - this.f3798b;
    }

    @Override // A1.q
    public final void h() {
        this.f3797a.f525f = 0;
    }

    @Override // A1.q
    public final void i(int i10) throws IOException {
        this.f3797a.i(i10);
    }

    @Override // A1.q
    public final void j(byte[] bArr, int i10, int i11) throws IOException {
        this.f3797a.c(bArr, i10, i11, false);
    }

    @Override // p078g1.i
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        return this.f3797a.read(bArr, i10, i11);
    }

    @Override // A1.q
    public final void readFully(byte[] bArr, int i10, int i11) throws IOException {
        this.f3797a.a(bArr, i10, i11, false);
    }
}
