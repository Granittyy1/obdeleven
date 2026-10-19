package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: compiled from: UnknownFieldSetLite.java */
/* JADX INFO: loaded from: classes.dex */
public final class d0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final d0 f17217f = new d0(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f17218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f17219b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f17220c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f17221d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f17222e;

    public d0() {
        this(0, new int[8], new Object[8], true);
    }

    public final int a() {
        int iX;
        int i10 = this.f17221d;
        if (i10 != -1) {
            return i10;
        }
        int iA = 0;
        for (int i11 = 0; i11 < this.f17218a; i11++) {
            int i12 = this.f17219b[i11];
            int i13 = i12 >>> 3;
            int i14 = i12 & 7;
            if (i14 == 0) {
                iX = CodedOutputStream.x(i13, ((Long) this.f17220c[i11]).longValue());
            } else if (i14 == 1) {
                ((Long) this.f17220c[i11]).getClass();
                iX = CodedOutputStream.h(i13);
            } else if (i14 != 2) {
                if (i14 == 3) {
                    iA = ((d0) this.f17220c[i11]).a() + (CodedOutputStream.u(i13) * 2) + iA;
                } else {
                    if (i14 != 5) {
                        throw new IllegalStateException(InvalidProtocolBufferException.b());
                    }
                    ((Integer) this.f17220c[i11]).getClass();
                    iX = CodedOutputStream.g(i13);
                }
            } else {
                iX = CodedOutputStream.c(i13, (ByteString) this.f17220c[i11]);
            }
            iA = iX + iA;
        }
        this.f17221d = iA;
        return iA;
    }

    public final void b(int i10, Object obj) {
        if (!this.f17222e) {
            throw new UnsupportedOperationException();
        }
        int i11 = this.f17218a;
        int[] iArr = this.f17219b;
        if (i11 == iArr.length) {
            int i12 = i11 + (i11 < 4 ? 8 : i11 >> 1);
            this.f17219b = Arrays.copyOf(iArr, i12);
            this.f17220c = Arrays.copyOf(this.f17220c, i12);
        }
        int[] iArr2 = this.f17219b;
        int i13 = this.f17218a;
        iArr2[i13] = i10;
        this.f17220c[i13] = obj;
        this.f17218a = i13 + 1;
    }

    public final void c(h0 h0Var) throws IOException {
        if (this.f17218a == 0) {
            return;
        }
        h0Var.getClass();
        for (int i10 = 0; i10 < this.f17218a; i10++) {
            int i11 = this.f17219b[i10];
            Object obj = this.f17220c[i10];
            int i12 = i11 >>> 3;
            int i13 = i11 & 7;
            if (i13 == 0) {
                ((C1320j) h0Var).j(i12, ((Long) obj).longValue());
            } else if (i13 == 1) {
                ((C1320j) h0Var).f(i12, ((Long) obj).longValue());
            } else if (i13 == 2) {
                ((C1320j) h0Var).b(i12, (ByteString) obj);
            } else if (i13 == 3) {
                CodedOutputStream codedOutputStream = ((C1320j) h0Var).f17260a;
                codedOutputStream.R(i12, 3);
                ((d0) obj).c(h0Var);
                codedOutputStream.R(i12, 4);
            } else {
                if (i13 != 5) {
                    throw new RuntimeException(InvalidProtocolBufferException.b());
                }
                ((C1320j) h0Var).e(i12, ((Integer) obj).intValue());
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
        int i10 = this.f17218a;
        if (i10 == d0Var.f17218a) {
            int[] iArr = this.f17219b;
            int[] iArr2 = d0Var.f17219b;
            for (int i11 = 0; i11 < i10; i11++) {
                if (iArr[i11] == iArr2[i11]) {
                }
            }
            Object[] objArr = this.f17220c;
            Object[] objArr2 = d0Var.f17220c;
            int i12 = this.f17218a;
            for (int i13 = 0; i13 < i12; i13++) {
                if (objArr[i13].equals(objArr2[i13])) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f17218a;
        int i11 = (527 + i10) * 31;
        int[] iArr = this.f17219b;
        int iHashCode = 17;
        int i12 = 17;
        for (int i13 = 0; i13 < i10; i13++) {
            i12 = (i12 * 31) + iArr[i13];
        }
        int i14 = (i11 + i12) * 31;
        Object[] objArr = this.f17220c;
        int i15 = this.f17218a;
        for (int i16 = 0; i16 < i15; i16++) {
            iHashCode = (iHashCode * 31) + objArr[i16].hashCode();
        }
        return i14 + iHashCode;
    }

    public d0(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f17221d = -1;
        this.f17218a = i10;
        this.f17219b = iArr;
        this.f17220c = objArr;
        this.f17222e = z10;
    }
}
