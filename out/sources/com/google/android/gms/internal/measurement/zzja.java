package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzja extends C.g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Logger f26051d = Logger.getLogger(zzja.class.getName());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f26052e = V3.f25614e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public B2 f26053c;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@21.6.1 */
    public static class a extends zzja {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final byte[] f26054f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f26055g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f26056h;

        public a(int i10, byte[] bArr) {
            if (((bArr.length - i10) | i10) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i10)));
            }
            this.f26054f = bArr;
            this.f26056h = 0;
            this.f26055g = i10;
        }

        public final int D0() {
            return this.f26055g - this.f26056h;
        }

        public final void E0(byte b10) throws IOException {
            try {
                byte[] bArr = this.f26054f;
                int i10 = this.f26056h;
                this.f26056h = i10 + 1;
                bArr[i10] = b10;
            } catch (IndexOutOfBoundsException e10) {
                throw new zza(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f26056h), Integer.valueOf(this.f26055g), 1), e10);
            }
        }

        public final void F0(int i10, String str) throws IOException {
            R0(i10, 2);
            int i11 = this.f26056h;
            try {
                int iC0 = zzja.C0(str.length() * 3);
                int iC1 = zzja.C0(str.length());
                byte[] bArr = this.f26054f;
                if (iC1 == iC0) {
                    int i12 = i11 + iC1;
                    this.f26056h = i12;
                    int iB = Z3.b(str, bArr, i12, D0());
                    this.f26056h = i11;
                    S0((iB - i11) - iC1);
                    this.f26056h = iB;
                } else {
                    S0(Z3.a(str));
                    this.f26056h = Z3.b(str, bArr, this.f26056h, D0());
                }
            } catch (zznh e10) {
                this.f26056h = i11;
                zzja.f26051d.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e10);
                byte[] bytes = str.getBytes(Q2.f25563a);
                try {
                    S0(bytes.length);
                    I0(bytes, 0, bytes.length);
                } catch (IndexOutOfBoundsException e11) {
                    throw new zza(e11);
                }
            } catch (IndexOutOfBoundsException e12) {
                throw new zza(e12);
            }
        }

        public final void G0(int i10, boolean z10) throws IOException {
            R0(i10, 0);
            E0(z10 ? (byte) 1 : (byte) 0);
        }

        public final void H0(int i10, zzij zzijVar) throws IOException {
            R0(i10, 2);
            S0(zzijVar.B());
            zzijVar.v(this);
        }

        public final void I0(byte[] bArr, int i10, int i11) throws IOException {
            try {
                System.arraycopy(bArr, i10, this.f26054f, this.f26056h, i11);
                this.f26056h += i11;
            } catch (IndexOutOfBoundsException e10) {
                throw new zza(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f26056h), Integer.valueOf(this.f26055g), Integer.valueOf(i11)), e10);
            }
        }

        public final void J0(int i10, long j) throws IOException {
            R0(i10, 1);
            K0(j);
        }

        public final void K0(long j) throws IOException {
            try {
                byte[] bArr = this.f26054f;
                int i10 = this.f26056h;
                int i11 = i10 + 1;
                this.f26056h = i11;
                bArr[i10] = (byte) j;
                int i12 = i10 + 2;
                this.f26056h = i12;
                bArr[i11] = (byte) (j >> 8);
                int i13 = i10 + 3;
                this.f26056h = i13;
                bArr[i12] = (byte) (j >> 16);
                int i14 = i10 + 4;
                this.f26056h = i14;
                bArr[i13] = (byte) (j >> 24);
                int i15 = i10 + 5;
                this.f26056h = i15;
                bArr[i14] = (byte) (j >> 32);
                int i16 = i10 + 6;
                this.f26056h = i16;
                bArr[i15] = (byte) (j >> 40);
                int i17 = i10 + 7;
                this.f26056h = i17;
                bArr[i16] = (byte) (j >> 48);
                this.f26056h = i10 + 8;
                bArr[i17] = (byte) (j >> 56);
            } catch (IndexOutOfBoundsException e10) {
                throw new zza(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f26056h), Integer.valueOf(this.f26055g), 1), e10);
            }
        }

        public final void L0(int i10, int i11) throws IOException {
            R0(i10, 5);
            M0(i11);
        }

        public final void M0(int i10) throws IOException {
            try {
                byte[] bArr = this.f26054f;
                int i11 = this.f26056h;
                int i12 = i11 + 1;
                this.f26056h = i12;
                bArr[i11] = (byte) i10;
                int i13 = i11 + 2;
                this.f26056h = i13;
                bArr[i12] = (byte) (i10 >> 8);
                int i14 = i11 + 3;
                this.f26056h = i14;
                bArr[i13] = (byte) (i10 >> 16);
                this.f26056h = i11 + 4;
                bArr[i14] = (byte) (i10 >>> 24);
            } catch (IndexOutOfBoundsException e10) {
                throw new zza(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f26056h), Integer.valueOf(this.f26055g), 1), e10);
            }
        }

        public final void N0(int i10, int i11) throws IOException {
            R0(i10, 0);
            Q0(i11);
        }

        public final void O0(int i10, long j) throws IOException {
            R0(i10, 0);
            P0(j);
        }

        public final void P0(long j) throws IOException {
            boolean z10 = zzja.f26052e;
            byte[] bArr = this.f26054f;
            if (!z10 || D0() < 10) {
                while ((j & (-128)) != 0) {
                    try {
                        int i10 = this.f26056h;
                        this.f26056h = i10 + 1;
                        bArr[i10] = (byte) (((int) j) | 128);
                        j >>>= 7;
                    } catch (IndexOutOfBoundsException e10) {
                        throw new zza(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f26056h), Integer.valueOf(this.f26055g), 1), e10);
                    }
                }
                int i11 = this.f26056h;
                this.f26056h = i11 + 1;
                bArr[i11] = (byte) j;
                return;
            }
            while ((j & (-128)) != 0) {
                int i12 = this.f26056h;
                this.f26056h = i12 + 1;
                V3.f25612c.c(bArr, V3.f25615f + ((long) i12), (byte) (((int) j) | 128));
                j >>>= 7;
            }
            int i13 = this.f26056h;
            this.f26056h = i13 + 1;
            V3.f25612c.c(bArr, V3.f25615f + ((long) i13), (byte) j);
        }

        public final void Q0(int i10) throws IOException {
            if (i10 >= 0) {
                S0(i10);
            } else {
                P0(i10);
            }
        }

        public final void R0(int i10, int i11) throws IOException {
            S0((i10 << 3) | i11);
        }

        public final void S0(int i10) throws IOException {
            while (true) {
                int i11 = i10 & (-128);
                byte[] bArr = this.f26054f;
                if (i11 == 0) {
                    int i12 = this.f26056h;
                    this.f26056h = i12 + 1;
                    bArr[i12] = (byte) i10;
                    return;
                } else {
                    try {
                        int i13 = this.f26056h;
                        this.f26056h = i13 + 1;
                        bArr[i13] = (byte) (i10 | 128);
                        i10 >>>= 7;
                    } catch (IndexOutOfBoundsException e10) {
                        throw new zza(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f26056h), Integer.valueOf(this.f26055g), 1), e10);
                    }
                }
                throw new zza(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f26056h), Integer.valueOf(this.f26055g), 1), e10);
            }
        }

        public final void T0(int i10, int i11) throws IOException {
            R0(i10, 0);
            S0(i11);
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@21.6.1 */
    public static class zza extends IOException {
        public zza() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        public zza(IndexOutOfBoundsException indexOutOfBoundsException) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
        }

        public zza(String str, IndexOutOfBoundsException indexOutOfBoundsException) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(str), indexOutOfBoundsException);
        }
    }

    public static int A0(int i10) {
        return C0(i10 << 3);
    }

    public static int B0(int i10, int i11) {
        return C0(i11) + C0(i10 << 3);
    }

    public static int C0(int i10) {
        return (352 - (Integer.numberOfLeadingZeros(i10) * 9)) >>> 6;
    }

    public static int i0(int i10) {
        return C0(i10 << 3) + 1;
    }

    public static int j0(int i10, int i11) {
        return z0(i11) + C0(i10 << 3);
    }

    public static int k0(int i10, zzij zzijVar) {
        int iC0 = C0(i10 << 3);
        int iB = zzijVar.B();
        return C0(iB) + iB + iC0;
    }

    @Deprecated
    public static int l0(int i10, InterfaceC1894r3 interfaceC1894r3, E3 e10) {
        return ((AbstractC1887q2) interfaceC1894r3).f(e10) + (C0(i10 << 3) << 1);
    }

    public static int m0(int i10, String str) {
        return n0(str) + C0(i10 << 3);
    }

    public static int n0(String str) {
        int length;
        try {
            length = Z3.a(str);
        } catch (zznh unused) {
            length = str.getBytes(Q2.f25563a).length;
        }
        return C0(length) + length;
    }

    public static int o0(int i10) {
        return C0(i10 << 3) + 8;
    }

    public static int p0(int i10) {
        return C0(i10 << 3) + 8;
    }

    public static int q0(int i10) {
        return C0(i10 << 3) + 4;
    }

    public static int r0(int i10) {
        return C0(i10 << 3) + 4;
    }

    public static int s0(int i10, long j) {
        return z0(j) + C0(i10 << 3);
    }

    public static int t0(int i10) {
        return C0(i10 << 3) + 8;
    }

    public static int u0(int i10, int i11) {
        return z0(i11) + C0(i10 << 3);
    }

    public static int v0(int i10) {
        return C0(i10 << 3) + 4;
    }

    public static int w0(int i10, long j) {
        return z0((j >> 63) ^ (j << 1)) + C0(i10 << 3);
    }

    public static int x0(int i10, int i11) {
        return C0((i11 >> 31) ^ (i11 << 1)) + C0(i10 << 3);
    }

    public static int y0(int i10, long j) {
        return z0(j) + C0(i10 << 3);
    }

    public static int z0(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }
}
