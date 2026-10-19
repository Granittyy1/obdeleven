package T4;

import S4.C0760b;
import U4.C0804l;
import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f5990b;

    public o0(C0760b c0760b, int i10) {
        C0804l.h(c0760b);
        this.f5990b = c0760b;
        this.f5989a = i10;
    }

    public void a(long j) {
        int i10 = this.f5989a;
        long[] jArr = (long[]) this.f5990b;
        if (i10 == jArr.length) {
            this.f5990b = Arrays.copyOf(jArr, i10 * 2);
        }
        long[] jArr2 = (long[]) this.f5990b;
        int i11 = this.f5989a;
        this.f5989a = i11 + 1;
        jArr2[i11] = j;
    }

    public void b(long[] jArr) {
        int length = this.f5989a + jArr.length;
        long[] jArr2 = (long[]) this.f5990b;
        if (length > jArr2.length) {
            this.f5990b = Arrays.copyOf(jArr2, Math.max(jArr2.length * 2, length));
        }
        System.arraycopy(jArr, 0, (long[]) this.f5990b, this.f5989a, jArr.length);
        this.f5989a = length;
    }

    public long c(int i10) {
        if (i10 >= 0 && i10 < this.f5989a) {
            return ((long[]) this.f5990b)[i10];
        }
        StringBuilder sbE = A8.f.e(i10, "Invalid index ", ", size is ");
        sbE.append(this.f5989a);
        throw new IndexOutOfBoundsException(sbE.toString());
    }

    public int d(int i10) {
        int i11 = this.f5989a - 1;
        return i11 >= 0 ? ((int[]) this.f5990b)[i11] : i10;
    }

    public int e() {
        int[] iArr = (int[]) this.f5990b;
        int i10 = this.f5989a - 1;
        this.f5989a = i10;
        return iArr[i10];
    }

    public void f(int i10) {
        int[] iArrCopyOf = (int[]) this.f5990b;
        if (this.f5989a >= iArrCopyOf.length) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length * 2);
            kotlin.jvm.internal.i.d(iArrCopyOf, "copyOf(...)");
            this.f5990b = iArrCopyOf;
        }
        int i11 = this.f5989a;
        this.f5989a = i11 + 1;
        iArrCopyOf[i11] = i10;
    }

    public o0(int i10) {
        this.f5990b = new long[i10];
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public o0(int i10, boolean z10) {
        this(32);
        switch (i10) {
            case 2:
                break;
            default:
                this.f5990b = new int[10];
                break;
        }
    }
}
