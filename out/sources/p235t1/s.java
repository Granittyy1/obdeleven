package p235t1;

import java.util.Arrays;
import java.util.Random;

/* JADX INFO: compiled from: ShuffleOrder.java */
/* JADX INFO: loaded from: classes.dex */
public interface s {

    /* JADX INFO: compiled from: ShuffleOrder.java */
    public static class a implements s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Random f47086a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f47087b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int[] f47088c;

        public a() {
            this(new Random());
        }

        @Override // p235t1.s
        public final int a() {
            int[] iArr = this.f47087b;
            if (iArr.length > 0) {
                return iArr[0];
            }
            return -1;
        }

        @Override // p235t1.s
        public final a b(int i10) {
            int[] iArr = this.f47087b;
            int[] iArr2 = new int[iArr.length - i10];
            int i11 = 0;
            for (int i12 = 0; i12 < iArr.length; i12++) {
                int i13 = iArr[i12];
                if (i13 < 0 || i13 >= i10) {
                    int i14 = i12 - i11;
                    if (i13 >= 0) {
                        i13 -= i10;
                    }
                    iArr2[i14] = i13;
                } else {
                    i11++;
                }
            }
            return new a(iArr2, new Random(this.f47086a.nextLong()));
        }

        @Override // p235t1.s
        public final int c(int i10) {
            int i11 = this.f47088c[i10] - 1;
            if (i11 >= 0) {
                return this.f47087b[i11];
            }
            return -1;
        }

        @Override // p235t1.s
        public final int d(int i10) {
            int i11 = this.f47088c[i10] + 1;
            int[] iArr = this.f47087b;
            if (i11 < iArr.length) {
                return iArr[i11];
            }
            return -1;
        }

        @Override // p235t1.s
        public final a e(int i10) {
            Random random;
            int[] iArr;
            int[] iArr2 = new int[i10];
            int[] iArr3 = new int[i10];
            int i11 = 0;
            while (true) {
                random = this.f47086a;
                iArr = this.f47087b;
                if (i11 >= i10) {
                    break;
                }
                iArr2[i11] = random.nextInt(iArr.length + 1);
                int i12 = i11 + 1;
                int iNextInt = random.nextInt(i12);
                iArr3[i11] = iArr3[iNextInt];
                iArr3[iNextInt] = i11;
                i11 = i12;
            }
            Arrays.sort(iArr2);
            int[] iArr4 = new int[iArr.length + i10];
            int i13 = 0;
            int i14 = 0;
            for (int i15 = 0; i15 < iArr.length + i10; i15++) {
                if (i13 >= i10 || i14 != iArr2[i13]) {
                    int i16 = i14 + 1;
                    int i17 = iArr[i14];
                    iArr4[i15] = i17;
                    if (i17 >= 0) {
                        iArr4[i15] = i17 + i10;
                    }
                    i14 = i16;
                } else {
                    iArr4[i15] = iArr3[i13];
                    i13++;
                }
            }
            return new a(iArr4, new Random(random.nextLong()));
        }

        @Override // p235t1.s
        public final int f() {
            int[] iArr = this.f47087b;
            if (iArr.length > 0) {
                return iArr[iArr.length - 1];
            }
            return -1;
        }

        @Override // p235t1.s
        public final a g() {
            return new a(new Random(this.f47086a.nextLong()));
        }

        @Override // p235t1.s
        public final int getLength() {
            return this.f47087b.length;
        }

        public a(int[] iArr, Random random) {
            this.f47087b = iArr;
            this.f47086a = random;
            this.f47088c = new int[iArr.length];
            for (int i10 = 0; i10 < iArr.length; i10++) {
                this.f47088c[iArr[i10]] = i10;
            }
        }

        public a(Random random) {
            this(new int[0], random);
        }
    }

    int a();

    a b(int i10);

    int c(int i10);

    int d(int i10);

    a e(int i10);

    int f();

    a g();

    int getLength();
}
