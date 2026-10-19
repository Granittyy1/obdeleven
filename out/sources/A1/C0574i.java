package A1;

import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* JADX INFO: renamed from: A1.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: DefaultExtractorInput.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0574i implements q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p140l1.d f521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f522c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f523d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f525f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f526g;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[] f524e = new byte[65536];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f520a = new byte[4096];

    static {
        p078g1.q.a("media3.extractor");
    }

    public C0574i(p140l1.d dVar, long j, long j10) {
        this.f521b = dVar;
        this.f523d = j;
        this.f522c = j10;
    }

    @Override // A1.q
    public final boolean a(byte[] bArr, int i10, int i11, boolean z10) throws IOException {
        int iMin;
        int i12 = this.f526g;
        if (i12 == 0) {
            iMin = 0;
        } else {
            iMin = Math.min(i12, i11);
            System.arraycopy(this.f524e, 0, bArr, i10, iMin);
            o(iMin);
        }
        int iN = iMin;
        while (iN < i11 && iN != -1) {
            iN = n(bArr, i10, i11, iN, z10);
        }
        if (iN != -1) {
            this.f523d += (long) iN;
        }
        return iN != -1;
    }

    @Override // A1.q
    public final boolean c(byte[] bArr, int i10, int i11, boolean z10) throws IOException {
        if (!k(i11, z10)) {
            return false;
        }
        System.arraycopy(this.f524e, this.f525f - i11, bArr, i10, i11);
        return true;
    }

    @Override // A1.q
    public final long d() {
        return this.f523d + ((long) this.f525f);
    }

    @Override // A1.q
    public final void e(int i10) throws IOException {
        k(i10, false);
    }

    @Override // A1.q
    public final long getLength() {
        return this.f522c;
    }

    @Override // A1.q
    public final long getPosition() {
        return this.f523d;
    }

    @Override // A1.q
    public final void h() {
        this.f525f = 0;
    }

    @Override // A1.q
    public final void i(int i10) throws IOException {
        int iMin = Math.min(this.f526g, i10);
        o(iMin);
        int iN = iMin;
        while (iN < i10 && iN != -1) {
            byte[] bArr = this.f520a;
            iN = n(bArr, -iN, Math.min(i10, bArr.length + iN), iN, false);
        }
        if (iN != -1) {
            this.f523d += (long) iN;
        }
    }

    @Override // A1.q
    public final void j(byte[] bArr, int i10, int i11) throws IOException {
        c(bArr, i10, i11, false);
    }

    public final boolean k(int i10, boolean z10) throws IOException {
        l(i10);
        int iN = this.f526g - this.f525f;
        while (iN < i10) {
            iN = n(this.f524e, this.f525f, i10, iN, z10);
            if (iN == -1) {
                return false;
            }
            this.f526g = this.f525f + iN;
        }
        this.f525f += i10;
        return true;
    }

    public final void l(int i10) {
        int i11 = this.f525f + i10;
        byte[] bArr = this.f524e;
        if (i11 > bArr.length) {
            this.f524e = Arrays.copyOf(this.f524e, p114j1.A.g(bArr.length * 2, 65536 + i11, i11 + 524288));
        }
    }

    public final int m(byte[] bArr, int i10, int i11) throws IOException {
        int iMin;
        l(i11);
        int i12 = this.f526g;
        int i13 = this.f525f;
        int i14 = i12 - i13;
        if (i14 == 0) {
            iMin = n(this.f524e, i13, i11, 0, true);
            if (iMin == -1) {
                return -1;
            }
            this.f526g += iMin;
        } else {
            iMin = Math.min(i11, i14);
        }
        System.arraycopy(this.f524e, this.f525f, bArr, i10, iMin);
        this.f525f += iMin;
        return iMin;
    }

    public final int n(byte[] bArr, int i10, int i11, int i12, boolean z10) throws IOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int i13 = this.f521b.read(bArr, i10 + i12, i11 - i12);
        if (i13 != -1) {
            return i12 + i13;
        }
        if (i12 == 0 && z10) {
            return -1;
        }
        throw new EOFException();
    }

    public final void o(int i10) {
        int i11 = this.f526g - i10;
        this.f526g = i11;
        this.f525f = 0;
        byte[] bArr = this.f524e;
        byte[] bArr2 = i11 < bArr.length - 524288 ? new byte[65536 + i11] : bArr;
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        this.f524e = bArr2;
    }

    @Override // p078g1.i
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = this.f526g;
        int iN = 0;
        if (i12 != 0) {
            int iMin = Math.min(i12, i11);
            System.arraycopy(this.f524e, 0, bArr, i10, iMin);
            o(iMin);
            iN = iMin;
        }
        if (iN == 0) {
            iN = n(bArr, i10, i11, 0, true);
        }
        if (iN != -1) {
            this.f523d += (long) iN;
        }
        return iN;
    }

    @Override // A1.q
    public final void readFully(byte[] bArr, int i10, int i11) throws IOException {
        a(bArr, i10, i11, false);
    }
}
