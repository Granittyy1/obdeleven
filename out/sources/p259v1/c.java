package p259v1;

import java.util.Arrays;
import p078g1.n;
import p078g1.y;
import p241t7.b;

/* JADX INFO: compiled from: BaseTrackSelection.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class c implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f47519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f47520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f47521c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n[] f47522d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f47523e;

    public c(y yVar, int[] iArr) {
        n[] nVarArr;
        b.k(iArr.length > 0);
        yVar.getClass();
        this.f47519a = yVar;
        int length = iArr.length;
        this.f47520b = length;
        this.f47522d = new n[length];
        int i10 = 0;
        while (true) {
            int length2 = iArr.length;
            nVarArr = yVar.f35494d;
            if (i10 >= length2) {
                break;
            }
            this.f47522d[i10] = nVarArr[iArr[i10]];
            i10++;
        }
        Arrays.sort(this.f47522d, new b());
        this.f47521c = new int[this.f47520b];
        int i11 = 0;
        while (true) {
            int i12 = this.f47520b;
            if (i11 >= i12) {
                long[] jArr = new long[i12];
                return;
            }
            int[] iArr2 = this.f47521c;
            n nVar = this.f47522d[i11];
            int i13 = 0;
            while (true) {
                if (i13 >= nVarArr.length) {
                    i13 = -1;
                    break;
                } else if (nVar == nVarArr[i13]) {
                    break;
                } else {
                    i13++;
                }
            }
            iArr2[i11] = i13;
            i11++;
        }
    }

    @Override // p259v1.w
    public final y a() {
        return this.f47519a;
    }

    @Override // p259v1.w
    public final n c(int i10) {
        return this.f47522d[i10];
    }

    @Override // p259v1.w
    public final int e(int i10) {
        return this.f47521c[i10];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.f47519a.equals(cVar.f47519a) && Arrays.equals(this.f47521c, cVar.f47521c);
    }

    @Override // p259v1.t
    public final int g() {
        return this.f47521c[0];
    }

    @Override // p259v1.t
    public final n h() {
        return this.f47522d[0];
    }

    public final int hashCode() {
        if (this.f47523e == 0) {
            this.f47523e = Arrays.hashCode(this.f47521c) + (System.identityHashCode(this.f47519a) * 31);
        }
        return this.f47523e;
    }

    @Override // p259v1.w
    public final int l(int i10) {
        for (int i11 = 0; i11 < this.f47520b; i11++) {
            if (this.f47521c[i11] == i10) {
                return i11;
            }
        }
        return -1;
    }

    @Override // p259v1.w
    public final int length() {
        return this.f47521c.length;
    }

    @Override // p259v1.t
    public void d() {
    }

    @Override // p259v1.t
    public void f() {
    }

    @Override // p259v1.t
    public final void b(boolean z10) {
    }

    @Override // p259v1.t
    public void i(float f10) {
    }
}
