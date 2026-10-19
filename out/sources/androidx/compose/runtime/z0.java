package androidx.compose.runtime;

import A1.C0575j;
import java.util.ArrayList;

/* JADX INFO: compiled from: SlotTable.kt */
/* JADX INFO: loaded from: classes.dex */
public final class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final A0 f13259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f13260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f13261c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object[] f13262d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f13263e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f13264f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f13265g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f13266h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f13267i;
    public final T4.o0 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f13268k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f13269l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f13270m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f13271n;

    public z0(A0 a10) {
        this.f13259a = a10;
        this.f13260b = a10.f12770b;
        int i10 = a10.f12771c;
        this.f13261c = i10;
        this.f13262d = a10.f12772d;
        this.f13263e = a10.f12773e;
        this.f13266h = i10;
        this.f13267i = -1;
        this.j = new T4.o0(1, false);
    }

    public final C1074a a(int i10) {
        ArrayList<C1074a> arrayList = this.f13259a.j;
        int iE = C0.e(arrayList, i10, this.f13261c);
        if (iE >= 0) {
            return arrayList.get(iE);
        }
        C1074a c1074a = new C1074a(i10);
        arrayList.add(-(iE + 1), c1074a);
        return c1074a;
    }

    public final Object b(int[] iArr, int i10) {
        int i11 = i10 * 5;
        int i12 = iArr[i11 + 1];
        if ((268435456 & i12) != 0) {
            return this.f13262d[i11 >= iArr.length ? iArr.length : iArr[i11 + 4] + Integer.bitCount(i12 >> 29)];
        }
        return InterfaceC1084f.a.f12980a;
    }

    public final void c() {
        this.f13264f = true;
        A0 a10 = this.f13259a;
        a10.getClass();
        if (this.f13259a != a10 || a10.f12774f <= 0) {
            C1090i.c("Unexpected reader close()");
        }
        a10.f12774f--;
    }

    public final boolean d(int i10) {
        return (this.f13260b[(i10 * 5) + 1] & 67108864) != 0;
    }

    public final void e() {
        if (this.f13268k == 0) {
            if (!(this.f13265g == this.f13266h)) {
                C1090i.c("endGroup() not called at the end of a group");
            }
            int i10 = (this.f13267i * 5) + 2;
            int[] iArr = this.f13260b;
            int i11 = iArr[i10];
            this.f13267i = i11;
            int i12 = this.f13261c;
            this.f13266h = i11 < 0 ? i12 : C0.a(iArr, i11) + i11;
            int iE = this.j.e();
            if (iE < 0) {
                this.f13269l = 0;
                this.f13270m = 0;
            } else {
                this.f13269l = iE;
                this.f13270m = i11 >= i12 - 1 ? this.f13263e : iArr[((i11 + 1) * 5) + 4];
            }
        }
    }

    public final Object f() {
        int i10 = this.f13265g;
        if (i10 < this.f13266h) {
            return b(this.f13260b, i10);
        }
        return 0;
    }

    public final int g() {
        int i10 = this.f13265g;
        if (i10 >= this.f13266h) {
            return 0;
        }
        return this.f13260b[i10 * 5];
    }

    public final Object h(int i10, int i11) {
        int[] iArr = this.f13260b;
        int iC = C0.c(iArr, i10);
        int i12 = i10 + 1;
        int i13 = iC + i11;
        return i13 < (i12 < this.f13261c ? iArr[(i12 * 5) + 4] : this.f13263e) ? this.f13262d[i13] : InterfaceC1084f.a.f12980a;
    }

    public final boolean i(int i10) {
        return (this.f13260b[(i10 * 5) + 1] & 536870912) != 0;
    }

    public final boolean j(int i10) {
        return (this.f13260b[(i10 * 5) + 1] & 1073741824) != 0;
    }

    public final Object k() {
        int i10;
        if (this.f13268k > 0 || (i10 = this.f13269l) >= this.f13270m) {
            this.f13271n = false;
            return InterfaceC1084f.a.f12980a;
        }
        this.f13271n = true;
        this.f13269l = i10 + 1;
        return this.f13262d[i10];
    }

    public final Object l(int i10) {
        int i11 = i10 * 5;
        int[] iArr = this.f13260b;
        int i12 = iArr[i11 + 1] & 1073741824;
        if (i12 == 0) {
            return null;
        }
        if (i12 == 0) {
            return InterfaceC1084f.a.f12980a;
        }
        return this.f13262d[iArr[i11 + 4]];
    }

    public final int m(int i10) {
        return this.f13260b[(i10 * 5) + 1] & 67108863;
    }

    public final Object n(int[] iArr, int i10) {
        int i11 = i10 * 5;
        int i12 = iArr[i11 + 1];
        if ((536870912 & i12) == 0) {
            return null;
        }
        return this.f13262d[Integer.bitCount(i12 >> 30) + iArr[i11 + 4]];
    }

    public final int o(int i10) {
        return this.f13260b[(i10 * 5) + 2];
    }

    public final void p(int i10) {
        if (!(this.f13268k == 0)) {
            C1090i.c("Cannot reposition while in an empty region");
        }
        this.f13265g = i10;
        int[] iArr = this.f13260b;
        int i11 = this.f13261c;
        int i12 = i10 < i11 ? iArr[(i10 * 5) + 2] : -1;
        this.f13267i = i12;
        if (i12 < 0) {
            this.f13266h = i11;
        } else {
            this.f13266h = C0.a(iArr, i12) + i12;
        }
        this.f13269l = 0;
        this.f13270m = 0;
    }

    public final int q() {
        if (!(this.f13268k == 0)) {
            C1090i.c("Cannot skip while in an empty region");
        }
        int i10 = this.f13265g;
        int[] iArr = this.f13260b;
        int i11 = (iArr[(i10 * 5) + 1] & 1073741824) == 0 ? iArr[(i10 * 5) + 1] & 67108863 : 1;
        this.f13265g = C0.a(iArr, i10) + i10;
        return i11;
    }

    public final void r() {
        if (!(this.f13268k == 0)) {
            C1090i.c("Cannot skip the enclosing group while in an empty region");
        }
        this.f13265g = this.f13266h;
        this.f13269l = 0;
        this.f13270m = 0;
    }

    public final void s() {
        if (this.f13268k <= 0) {
            int i10 = this.f13267i;
            int i11 = this.f13265g;
            int[] iArr = this.f13260b;
            if (!(iArr[(i11 * 5) + 2] == i10)) {
                C1091i0.a("Invalid slot table detected");
            }
            int i12 = this.f13269l;
            int i13 = this.f13270m;
            T4.o0 o0Var = this.j;
            if (i12 == 0 && i13 == 0) {
                o0Var.f(-1);
            } else {
                o0Var.f(i12);
            }
            this.f13267i = i11;
            this.f13266h = C0.a(iArr, i11) + i11;
            int i14 = i11 + 1;
            this.f13265g = i14;
            this.f13269l = C0.c(iArr, i11);
            this.f13270m = i11 >= this.f13261c - 1 ? this.f13263e : iArr[(i14 * 5) + 4];
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SlotReader(current=");
        sb2.append(this.f13265g);
        sb2.append(", key=");
        sb2.append(g());
        sb2.append(", parent=");
        sb2.append(this.f13267i);
        sb2.append(", end=");
        return C0575j.b(sb2, this.f13266h, ')');
    }
}
