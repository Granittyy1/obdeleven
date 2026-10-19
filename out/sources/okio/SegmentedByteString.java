package okio;

import A8.f;
import C6.b;
import Q3.d;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kotlin.jvm.internal.i;
import p318zb.C2834a;
import p318zb.C2839f;
import p318zb.D;

/* JADX INFO: compiled from: SegmentedByteString.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class SegmentedByteString extends ByteString {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient byte[][] f45708e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient int[] f45709f;

    public SegmentedByteString(byte[][] bArr, int[] iArr) {
        super(ByteString.f45705d.d());
        this.f45708e = bArr;
        this.f45709f = iArr;
    }

    private final Object writeReplace() {
        return C();
    }

    public final ByteString C() {
        return new ByteString(u());
    }

    @Override // okio.ByteString
    public final String a() {
        throw null;
    }

    @Override // okio.ByteString
    public final ByteString c(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        byte[][] bArr = this.f45708e;
        int length = bArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int[] iArr = this.f45709f;
            int i12 = iArr[length + i10];
            int i13 = iArr[i10];
            messageDigest.update(bArr[i10], i12, i13 - i11);
            i10++;
            i11 = i13;
        }
        byte[] bArrDigest = messageDigest.digest();
        i.b(bArrDigest);
        return new ByteString(bArrDigest);
    }

    @Override // okio.ByteString
    public final int e() {
        return this.f45709f[this.f45708e.length - 1];
    }

    @Override // okio.ByteString
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            if (byteString.e() == e() && p(0, byteString, e())) {
                return true;
            }
        }
        return false;
    }

    @Override // okio.ByteString
    public final String f() {
        return C().f();
    }

    @Override // okio.ByteString
    public final int h(int i10, byte[] other) {
        i.e(other, "other");
        return C().h(i10, other);
    }

    @Override // okio.ByteString
    public final int hashCode() {
        int i10 = this.f45706b;
        if (i10 != 0) {
            return i10;
        }
        byte[][] bArr = this.f45708e;
        int length = bArr.length;
        int i11 = 0;
        int i12 = 1;
        int i13 = 0;
        while (i11 < length) {
            int[] iArr = this.f45709f;
            int i14 = iArr[length + i11];
            int i15 = iArr[i11];
            byte[] bArr2 = bArr[i11];
            int i16 = (i15 - i13) + i14;
            while (i14 < i16) {
                i12 = (i12 * 31) + bArr2[i14];
                i14++;
            }
            i11++;
            i13 = i15;
        }
        this.f45706b = i12;
        return i12;
    }

    @Override // okio.ByteString
    public final byte[] j() {
        return u();
    }

    @Override // okio.ByteString
    public final byte k(int i10) {
        byte[][] bArr = this.f45708e;
        int length = bArr.length - 1;
        int[] iArr = this.f45709f;
        C2834a.b(iArr[length], i10, 1L);
        int iC = b.c(this, i10);
        return bArr[iC][(i10 - (iC == 0 ? 0 : iArr[iC - 1])) + iArr[bArr.length + iC]];
    }

    @Override // okio.ByteString
    public final int l(int i10, byte[] other) {
        i.e(other, "other");
        return C().l(i10, other);
    }

    @Override // okio.ByteString
    public final boolean o(int i10, int i11, int i12, byte[] other) {
        i.e(other, "other");
        if (i10 < 0 || i10 > e() - i12 || i11 < 0 || i11 > other.length - i12) {
            return false;
        }
        int i13 = i12 + i10;
        int iC = b.c(this, i10);
        while (i10 < i13) {
            int[] iArr = this.f45709f;
            int i14 = iC == 0 ? 0 : iArr[iC - 1];
            int i15 = iArr[iC] - i14;
            byte[][] bArr = this.f45708e;
            int i16 = iArr[bArr.length + iC];
            int iMin = Math.min(i13, i15 + i14) - i10;
            if (!C2834a.a((i10 - i14) + i16, i11, iMin, bArr[iC], other)) {
                return false;
            }
            i11 += iMin;
            i10 += iMin;
            iC++;
        }
        return true;
    }

    @Override // okio.ByteString
    public final boolean p(int i10, ByteString other, int i11) {
        i.e(other, "other");
        if (i10 < 0 || i10 > e() - i11) {
            return false;
        }
        int i12 = i11 + i10;
        int iC = b.c(this, i10);
        int i13 = 0;
        while (i10 < i12) {
            int[] iArr = this.f45709f;
            int i14 = iC == 0 ? 0 : iArr[iC - 1];
            int i15 = iArr[iC] - i14;
            byte[][] bArr = this.f45708e;
            int i16 = iArr[bArr.length + iC];
            int iMin = Math.min(i12, i15 + i14) - i10;
            if (!other.o(i13, (i10 - i14) + i16, iMin, bArr[iC])) {
                return false;
            }
            i13 += iMin;
            i10 += iMin;
            iC++;
        }
        return true;
    }

    @Override // okio.ByteString
    public final ByteString r(int i10, int i11) {
        int iC = C2834a.c(i11, this);
        if (i10 < 0) {
            throw new IllegalArgumentException(J4.i.c(i10, "beginIndex=", " < 0").toString());
        }
        if (iC > e()) {
            StringBuilder sbE = f.e(iC, "endIndex=", " > length(");
            sbE.append(e());
            sbE.append(')');
            throw new IllegalArgumentException(sbE.toString().toString());
        }
        int i12 = iC - i10;
        if (i12 < 0) {
            throw new IllegalArgumentException(f.d(iC, i10, "endIndex=", " < beginIndex=").toString());
        }
        if (i10 == 0 && iC == e()) {
            return this;
        }
        if (i10 == iC) {
            return ByteString.f45705d;
        }
        int iC2 = b.c(this, i10);
        int iC3 = b.c(this, iC - 1);
        byte[][] bArr = this.f45708e;
        byte[][] bArr2 = (byte[][]) d.u(iC2, iC3 + 1, bArr);
        int[] iArr = new int[bArr2.length * 2];
        int[] iArr2 = this.f45709f;
        if (iC2 <= iC3) {
            int i13 = iC2;
            int i14 = 0;
            while (true) {
                iArr[i14] = Math.min(iArr2[i13] - i10, i12);
                int i15 = i14 + 1;
                iArr[i14 + bArr2.length] = iArr2[bArr.length + i13];
                if (i13 == iC3) {
                    break;
                }
                i13++;
                i14 = i15;
            }
        }
        int i16 = iC2 != 0 ? iArr2[iC2 - 1] : 0;
        int length = bArr2.length;
        iArr[length] = (i10 - i16) + iArr[length];
        return new SegmentedByteString(bArr2, iArr);
    }

    @Override // okio.ByteString
    public final ByteString t() {
        return C().t();
    }

    @Override // okio.ByteString
    public final String toString() {
        return C().toString();
    }

    @Override // okio.ByteString
    public final byte[] u() {
        byte[] bArr = new byte[e()];
        byte[][] bArr2 = this.f45708e;
        int length = bArr2.length;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < length) {
            int[] iArr = this.f45709f;
            int i13 = iArr[length + i10];
            int i14 = iArr[i10];
            int i15 = i14 - i11;
            d.l(i12, i13, i13 + i15, bArr2[i10], bArr);
            i12 += i15;
            i10++;
            i11 = i14;
        }
        return bArr;
    }

    @Override // okio.ByteString
    public final void w(C2839f buffer, int i10) {
        i.e(buffer, "buffer");
        int iC = b.c(this, 0);
        int i11 = 0;
        while (i11 < i10) {
            int[] iArr = this.f45709f;
            int i12 = iC == 0 ? 0 : iArr[iC - 1];
            int i13 = iArr[iC] - i12;
            byte[][] bArr = this.f45708e;
            int i14 = iArr[bArr.length + iC];
            int iMin = Math.min(i10, i13 + i12) - i11;
            int i15 = (i11 - i12) + i14;
            D d10 = new D(bArr[iC], i15, i15 + iMin, true, false);
            D d11 = buffer.f49073b;
            if (d11 == null) {
                d10.f49047g = d10;
                d10.f49046f = d10;
                buffer.f49073b = d10;
            } else {
                D d12 = d11.f49047g;
                i.b(d12);
                d12.b(d10);
            }
            i11 += iMin;
            iC++;
        }
        buffer.f49074c += (long) i10;
    }
}
