package p114j1;

import java.util.Arrays;
import p241t7.b;

/* JADX INFO: compiled from: TimedValueQueue.java */
/* JADX INFO: loaded from: classes.dex */
public final class v<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f41071a = new long[10];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public V[] f41072b = (V[]) new Object[10];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f41073c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f41074d;

    public final synchronized void a(Object obj, long j) {
        int i10 = this.f41074d;
        if (i10 > 0) {
            if (j <= this.f41071a[((this.f41073c + i10) - 1) % this.f41072b.length]) {
                b();
            }
        }
        c();
        int i11 = this.f41073c;
        int i12 = this.f41074d;
        Object[] objArr = (V[]) this.f41072b;
        int length = (i11 + i12) % objArr.length;
        this.f41071a[length] = j;
        objArr[length] = obj;
        this.f41074d = i12 + 1;
    }

    public final synchronized void b() {
        this.f41073c = 0;
        this.f41074d = 0;
        Arrays.fill(this.f41072b, (Object) null);
    }

    public final void c() {
        int length = this.f41072b.length;
        if (this.f41074d < length) {
            return;
        }
        int i10 = length * 2;
        long[] jArr = new long[i10];
        V[] vArr = (V[]) new Object[i10];
        int i11 = this.f41073c;
        int i12 = length - i11;
        System.arraycopy(this.f41071a, i11, jArr, 0, i12);
        System.arraycopy(this.f41072b, this.f41073c, vArr, 0, i12);
        int i13 = this.f41073c;
        if (i13 > 0) {
            System.arraycopy(this.f41071a, 0, jArr, i12, i13);
            System.arraycopy(this.f41072b, 0, vArr, i12, this.f41073c);
        }
        this.f41071a = jArr;
        this.f41072b = vArr;
        this.f41073c = 0;
    }

    public final V d(long j, boolean z10) {
        V vG = null;
        long j10 = Long.MAX_VALUE;
        while (this.f41074d > 0) {
            long j11 = j - this.f41071a[this.f41073c];
            if (j11 < 0 && (z10 || (-j11) >= j10)) {
                break;
            }
            vG = g();
            j10 = j11;
        }
        return vG;
    }

    public final synchronized V e() {
        return this.f41074d == 0 ? null : g();
    }

    public final synchronized V f(long j) {
        return d(j, true);
    }

    public final V g() {
        b.k(this.f41074d > 0);
        V[] vArr = this.f41072b;
        int i10 = this.f41073c;
        V v10 = vArr[i10];
        vArr[i10] = null;
        this.f41073c = (i10 + 1) % vArr.length;
        this.f41074d--;
        return v10;
    }

    public final synchronized int h() {
        return this.f41074d;
    }
}
