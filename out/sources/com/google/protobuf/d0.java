package com.google.protobuf;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: compiled from: UnknownFieldSetLite.java */
/* JADX INFO: loaded from: classes3.dex */
public final class d0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final d0 f29137f = new d0(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f29138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f29139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f29140c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f29141d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f29142e;

    public d0() {
        this(0, new int[8], new Object[8], true);
    }

    public final void a(int i10) {
        int[] iArr = this.f29139b;
        if (i10 > iArr.length) {
            int i11 = this.f29138a;
            int i12 = (i11 / 2) + i11;
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.f29139b = Arrays.copyOf(iArr, i10);
            this.f29140c = Arrays.copyOf(this.f29140c, i10);
        }
    }

    public final int b() {
        int iX;
        int i10 = this.f29141d;
        if (i10 != -1) {
            return i10;
        }
        int iB = 0;
        for (int i11 = 0; i11 < this.f29138a; i11++) {
            int i12 = this.f29139b[i11];
            int i13 = i12 >>> 3;
            int i14 = i12 & 7;
            if (i14 == 0) {
                iX = CodedOutputStream.x(i13, ((Long) this.f29140c[i11]).longValue());
            } else if (i14 == 1) {
                ((Long) this.f29140c[i11]).getClass();
                iX = CodedOutputStream.h(i13);
            } else if (i14 != 2) {
                if (i14 == 3) {
                    iB = ((d0) this.f29140c[i11]).b() + (CodedOutputStream.u(i13) * 2) + iB;
                } else {
                    if (i14 != 5) {
                        throw new IllegalStateException(InvalidProtocolBufferException.c());
                    }
                    ((Integer) this.f29140c[i11]).getClass();
                    iX = CodedOutputStream.g(i13);
                }
            } else {
                iX = CodedOutputStream.c(i13, (ByteString) this.f29140c[i11]);
            }
            iB = iX + iB;
        }
        this.f29141d = iB;
        return iB;
    }

    public final void c(int i10, Object obj) {
        if (!this.f29142e) {
            throw new UnsupportedOperationException();
        }
        a(this.f29138a + 1);
        int[] iArr = this.f29139b;
        int i11 = this.f29138a;
        iArr[i11] = i10;
        this.f29140c[i11] = obj;
        this.f29138a = i11 + 1;
    }

    public final void d(h0 h0Var) throws IOException {
        if (this.f29138a == 0) {
            return;
        }
        h0Var.getClass();
        for (int i10 = 0; i10 < this.f29138a; i10++) {
            int i11 = this.f29139b[i10];
            Object obj = this.f29140c[i10];
            int i12 = i11 >>> 3;
            int i13 = i11 & 7;
            if (i13 == 0) {
                ((C2068j) h0Var).j(i12, ((Long) obj).longValue());
            } else if (i13 == 1) {
                ((C2068j) h0Var).f(i12, ((Long) obj).longValue());
            } else if (i13 == 2) {
                ((C2068j) h0Var).b(i12, (ByteString) obj);
            } else if (i13 == 3) {
                CodedOutputStream codedOutputStream = ((C2068j) h0Var).f29179a;
                codedOutputStream.R(i12, 3);
                ((d0) obj).d(h0Var);
                codedOutputStream.R(i12, 4);
            } else {
                if (i13 != 5) {
                    throw new RuntimeException(InvalidProtocolBufferException.c());
                }
                ((C2068j) h0Var).e(i12, ((Integer) obj).intValue());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        int i10 = this.f29138a;
        if (i10 == d0Var.f29138a) {
            int[] iArr = this.f29139b;
            int[] iArr2 = d0Var.f29139b;
            for (int i11 = 0; i11 < i10; i11++) {
                if (iArr[i11] == iArr2[i11]) {
                }
            }
            Object[] objArr = this.f29140c;
            Object[] objArr2 = d0Var.f29140c;
            int i12 = this.f29138a;
            for (int i13 = 0; i13 < i12; i13++) {
                if (objArr[i13].equals(objArr2[i13])) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f29138a;
        int i11 = (527 + i10) * 31;
        int[] iArr = this.f29139b;
        int iHashCode = 17;
        int i12 = 17;
        for (int i13 = 0; i13 < i10; i13++) {
            i12 = (i12 * 31) + iArr[i13];
        }
        int i14 = (i11 + i12) * 31;
        Object[] objArr = this.f29140c;
        int i15 = this.f29138a;
        for (int i16 = 0; i16 < i15; i16++) {
            iHashCode = (iHashCode * 31) + objArr[i16].hashCode();
        }
        return i14 + iHashCode;
    }

    public d0(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f29141d = -1;
        this.f29138a = i10;
        this.f29139b = iArr;
        this.f29140c = objArr;
        this.f29142e = z10;
    }
}
