package com.google.android.gms.internal.play_billing;

import java.io.IOException;
import java.util.Locale;
import java.util.logging.Level;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.q0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1999q0 extends AbstractC2001r0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f26240e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f26241f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f26242g;

    public C1999q0(int i10, byte[] bArr) {
        int length = bArr.length;
        if (((length - i10) | i10) < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(A8.f.d(length, i10, "Array range is invalid. Buffer.length=", ", offset=0, length="));
        }
        this.f26240e = bArr;
        this.f26242g = 0;
        this.f26241f = i10;
    }

    public final void A(int i10) throws IOException {
        int i11 = this.f26242g;
        try {
            byte[] bArr = this.f26240e;
            bArr[i11] = (byte) i10;
            bArr[i11 + 1] = (byte) (i10 >> 8);
            bArr[i11 + 2] = (byte) (i10 >> 16);
            bArr[i11 + 3] = (byte) (i10 >> 24);
            this.f26242g = i11 + 4;
        } catch (IndexOutOfBoundsException e10) {
            throw new zzen(i11, this.f26241f, 4, e10);
        }
    }

    public final void B(int i10, long j) throws IOException {
        I((i10 << 3) | 1);
        C(j);
    }

    public final void C(long j) throws IOException {
        int i10 = this.f26242g;
        try {
            byte[] bArr = this.f26240e;
            bArr[i10] = (byte) j;
            bArr[i10 + 1] = (byte) (j >> 8);
            bArr[i10 + 2] = (byte) (j >> 16);
            bArr[i10 + 3] = (byte) (j >> 24);
            bArr[i10 + 4] = (byte) (j >> 32);
            bArr[i10 + 5] = (byte) (j >> 40);
            bArr[i10 + 6] = (byte) (j >> 48);
            bArr[i10 + 7] = (byte) (j >> 56);
            this.f26242g = i10 + 8;
        } catch (IndexOutOfBoundsException e10) {
            throw new zzen(i10, this.f26241f, 8, e10);
        }
    }

    public final void D(int i10, int i11) throws IOException {
        I(i10 << 3);
        E(i11);
    }

    public final void E(int i10) throws IOException {
        if (i10 >= 0) {
            I(i10);
        } else {
            K(i10);
        }
    }

    public final void F(int i10, String str) throws IOException {
        I((i10 << 3) | 2);
        int i11 = this.f26242g;
        try {
            int iR = AbstractC2001r0.r(str.length() * 3);
            int iR2 = AbstractC2001r0.r(str.length());
            byte[] bArr = this.f26240e;
            int i12 = this.f26241f;
            if (iR2 == iR) {
                int i13 = i11 + iR2;
                this.f26242g = i13;
                int iB = E1.b(str, bArr, i13, i12 - i13);
                this.f26242g = i11;
                I((iB - i11) - iR2);
                this.f26242g = iB;
            } else {
                I(E1.c(str));
                int i14 = this.f26242g;
                this.f26242g = E1.b(str, bArr, i14, i12 - i14);
            }
        } catch (zzhq e10) {
            this.f26242g = i11;
            AbstractC2001r0.f26243c.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e10);
            byte[] bytes = str.getBytes(O0.f26148a);
            try {
                int length = bytes.length;
                I(length);
                w(length, bytes);
            } catch (IndexOutOfBoundsException e11) {
                throw new zzen(e11);
            }
        } catch (IndexOutOfBoundsException e12) {
            throw new zzen(e12);
        }
    }

    public final void G(int i10, int i11) throws IOException {
        I((i10 << 3) | i11);
    }

    public final void H(int i10, int i11) throws IOException {
        I(i10 << 3);
        I(i11);
    }

    public final void I(int i10) throws IOException {
        int i11;
        int i12 = this.f26242g;
        while (true) {
            int i13 = i10 & (-128);
            byte[] bArr = this.f26240e;
            if (i13 == 0) {
                i11 = i12 + 1;
                bArr[i12] = (byte) i10;
                this.f26242g = i11;
                return;
            } else {
                i11 = i12 + 1;
                try {
                    bArr[i12] = (byte) (i10 | 128);
                    i10 >>>= 7;
                    i12 = i11;
                } catch (IndexOutOfBoundsException e10) {
                    throw new zzen(i11, this.f26241f, 1, e10);
                }
            }
            throw new zzen(i11, this.f26241f, 1, e10);
        }
    }

    public final void J(int i10, long j) throws IOException {
        I(i10 << 3);
        K(j);
    }

    public final void K(long j) throws IOException {
        int i10;
        int i11 = this.f26242g;
        byte[] bArr = this.f26240e;
        boolean z10 = AbstractC2001r0.f26244d;
        int i12 = this.f26241f;
        if (!z10 || i12 - i11 < 10) {
            long j10 = j;
            while ((j10 & (-128)) != 0) {
                i10 = i11 + 1;
                try {
                    bArr[i11] = (byte) (((int) j10) | 128);
                    j10 >>>= 7;
                    i11 = i10;
                } catch (IndexOutOfBoundsException e10) {
                    throw new zzen(i10, i12, 1, e10);
                }
            }
            i10 = i11 + 1;
            bArr[i11] = (byte) j10;
        } else {
            long j11 = j;
            while ((j11 & (-128)) != 0) {
                D1.f26113c.d(bArr, D1.f26116f + ((long) i11), (byte) (((int) j11) | 128));
                j11 >>>= 7;
                i11++;
            }
            i10 = i11 + 1;
            D1.f26113c.d(bArr, D1.f26116f + ((long) i11), (byte) j11);
        }
        this.f26242g = i10;
    }

    public final int u() {
        return this.f26241f - this.f26242g;
    }

    public final void v(byte b10) throws IOException {
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i10 = this.f26242g;
        try {
            int i11 = i10 + 1;
            try {
                this.f26240e[i10] = b10;
                this.f26242g = i11;
            } catch (IndexOutOfBoundsException e10) {
                indexOutOfBoundsException = e10;
                i10 = i11;
                throw new zzen(i10, this.f26241f, 1, indexOutOfBoundsException);
            }
        } catch (IndexOutOfBoundsException e11) {
            indexOutOfBoundsException = e11;
        }
    }

    public final void w(int i10, byte[] bArr) throws IOException {
        try {
            System.arraycopy(bArr, 0, this.f26240e, this.f26242g, i10);
            this.f26242g += i10;
        } catch (IndexOutOfBoundsException e10) {
            throw new zzen(this.f26242g, this.f26241f, i10, e10);
        }
    }

    public final void x(int i10, boolean z10) throws IOException {
        I(i10 << 3);
        v(z10 ? (byte) 1 : (byte) 0);
    }

    public final void y(int i10, zzei zzeiVar) throws IOException {
        I((i10 << 3) | 2);
        I(zzeiVar.g());
        zzeiVar.s(this);
    }

    public final void z(int i10, int i11) throws IOException {
        I((i10 << 3) | 5);
        A(i11);
    }
}
