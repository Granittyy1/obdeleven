package androidx.compose.runtime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import kotlin.collections.EmptyList;

/* JADX INFO: compiled from: SlotTable.kt */
/* JADX INFO: loaded from: classes.dex */
public final class D0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final A0 f12799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f12800b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f12801c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList<C1074a> f12802d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public HashMap<C1074a, H> f12803e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public androidx.collection.B<androidx.collection.C> f12804f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f12805g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f12806h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f12807i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f12808k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f12809l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f12810m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f12811n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f12812o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final T4.o0 f12813p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final T4.o0 f12814q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final T4.o0 f12815r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public androidx.collection.B<androidx.collection.I<Object>> f12816s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f12817t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f12818u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f12819v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f12820w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public androidx.collection.A f12821x;

    /* JADX INFO: compiled from: SlotTable.kt */
    public static final class a {
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public static List a(D0 d10, int i10, D0 d11, boolean z10, boolean z11, boolean z12) {
            List list;
            boolean zI;
            int i11;
            C1074a c1074aS;
            int iS = d10.s(i10);
            int i12 = i10 + iS;
            int iF = d10.f(d10.f12800b, d10.q(i10));
            int iF2 = d10.f(d10.f12800b, d10.q(i12));
            int i13 = iF2 - iF;
            boolean z13 = i10 >= 0 && (d10.f12800b[(d10.q(i10) * 5) + 1] & 201326592) != 0;
            d11.u(iS);
            d11.v(i13, d11.f12817t);
            if (d10.f12805g < i12) {
                d10.z(i12);
            }
            if (d10.f12808k < iF2) {
                d10.A(iF2, i12);
            }
            int[] iArr = d11.f12800b;
            int i14 = d11.f12817t;
            int i15 = i14 * 5;
            Q3.d.m(i15, i10 * 5, i12 * 5, d10.f12800b, iArr);
            Object[] objArr = d11.f12801c;
            int i16 = d11.f12807i;
            System.arraycopy(d10.f12801c, iF, objArr, i16, i13);
            int i17 = d11.f12819v;
            iArr[i15 + 2] = i17;
            int i18 = i14 - i10;
            int i19 = i14 + iS;
            int iF3 = i16 - d11.f(iArr, i14);
            int i20 = d11.f12810m;
            int i21 = d11.f12809l;
            int length = objArr.length;
            boolean z14 = z13;
            int i22 = i20;
            int i23 = i14;
            while (i23 < i19) {
                if (i23 != i14) {
                    int i24 = (i23 * 5) + 2;
                    iArr[i24] = iArr[i24] + i18;
                }
                int i25 = i14;
                iArr[(i23 * 5) + 4] = D0.h(d11.f(iArr, i23) + iF3, i22 < i23 ? 0 : d11.f12808k, i21, length);
                if (i23 == i22) {
                    i22++;
                }
                i23++;
                i19 = i19;
                i14 = i25;
            }
            int i26 = i19;
            d11.f12810m = i22;
            int iB = C0.b(d10.f12802d, i10, d10.n());
            int iB2 = C0.b(d10.f12802d, i12, d10.n());
            if (iB < iB2) {
                ArrayList<C1074a> arrayList = d10.f12802d;
                ArrayList arrayList2 = new ArrayList(iB2 - iB);
                for (int i27 = iB; i27 < iB2; i27++) {
                    C1074a c1074a = arrayList.get(i27);
                    c1074a.f12935a += i18;
                    arrayList2.add(c1074a);
                }
                d11.f12802d.addAll(C0.b(d11.f12802d, d11.f12817t, d11.n()), arrayList2);
                arrayList.subList(iB, iB2).clear();
                list = arrayList2;
            } else {
                list = EmptyList.f42983b;
            }
            List list2 = list;
            if (!list2.isEmpty()) {
                HashMap<C1074a, H> map = d10.f12803e;
                HashMap<C1074a, H> map2 = d11.f12803e;
                if (map != null && map2 != null) {
                    int size = list2.size();
                    for (int i28 = 0; i28 < size; i28++) {
                        C1074a c1074a2 = (C1074a) list.get(i28);
                        H h8 = map.get(c1074a2);
                        if (h8 != null) {
                            map.remove(c1074a2);
                            map2.put(c1074a2, h8);
                        }
                    }
                }
            }
            int i29 = d11.f12819v;
            H hP = d11.P(i17);
            if (hP != null) {
                int i30 = i29 + 1;
                int i31 = d11.f12817t;
                int i32 = -1;
                while (i30 < i31) {
                    i32 = i30;
                    i30 = d11.f12800b[(i30 * 5) + 3] + i30;
                }
                ArrayList<Object> arrayList3 = hP.f12845a;
                if (arrayList3 == null) {
                    arrayList3 = new ArrayList<>();
                    hP.f12845a = arrayList3;
                }
                if (i32 >= 0 && (c1074aS = d11.S(i32)) != null) {
                    int size2 = arrayList3.size();
                    int i33 = 0;
                    while (true) {
                        if (i33 >= size2) {
                            i11 = -1;
                            break;
                        }
                        Object obj = arrayList3.get(i33);
                        if (!kotlin.jvm.internal.i.a(obj, c1074aS)) {
                            int i34 = size2;
                            if (!(obj instanceof H) || !((H) obj).a(c1074aS)) {
                                i33++;
                                size2 = i34;
                            }
                        }
                        i11 = i33;
                        break;
                    }
                }
                i11 = 0;
                arrayList3.add(i11, d11.b(i31));
            }
            int iE = d10.E(d10.f12800b, i10);
            if (!z12) {
                zI = false;
            } else if (z10) {
                boolean z15 = iE >= 0;
                if (z15) {
                    d10.Q();
                    d10.a(iE - d10.f12817t);
                    d10.Q();
                }
                d10.a(i10 - d10.f12817t);
                boolean zH = d10.H();
                if (z15) {
                    d10.L();
                    d10.i();
                    d10.L();
                    d10.i();
                }
                zI = zH;
            } else {
                zI = d10.I(i10, iS);
                d10.J(iF, i13, i10 - 1);
            }
            if (zI) {
                C1090i.c("Unexpectedly removed anchors");
            }
            int i35 = d11.f12812o;
            int i36 = iArr[i15 + 1];
            d11.f12812o = i35 + ((1073741824 & i36) != 0 ? 1 : i36 & 67108863);
            if (z11) {
                d11.f12817t = i26;
                d11.f12807i = i16 + i13;
            }
            if (z14) {
                d11.V(i17);
            }
            return list;
        }
    }

    public D0(A0 a10) {
        this.f12799a = a10;
        int[] iArr = a10.f12770b;
        this.f12800b = iArr;
        Object[] objArr = a10.f12772d;
        this.f12801c = objArr;
        this.f12802d = a10.j;
        this.f12803e = a10.f12778k;
        this.f12804f = a10.f12779l;
        int i10 = a10.f12771c;
        this.f12805g = i10;
        this.f12806h = (iArr.length / 5) - i10;
        int i11 = a10.f12773e;
        this.f12808k = i11;
        this.f12809l = objArr.length - i11;
        this.f12810m = i10;
        this.f12813p = new T4.o0(1, false);
        this.f12814q = new T4.o0(1, false);
        this.f12815r = new T4.o0(1, false);
        this.f12818u = i10;
        this.f12819v = -1;
    }

    public static int h(int i10, int i11, int i12, int i13) {
        return i10 > i11 ? -(((i13 - i12) - i10) + 1) : i10;
    }

    public static void x(D0 d10) {
        int i10 = d10.f12819v;
        int iQ = d10.q(i10);
        int[] iArr = d10.f12800b;
        int i11 = (iQ * 5) + 1;
        int i12 = iArr[i11];
        if ((i12 & 134217728) != 0) {
            return;
        }
        int i13 = (i12 & (-134217729)) | 134217728;
        iArr[i11] = i13;
        if ((67108864 & i13) != 0) {
            return;
        }
        d10.V(d10.E(iArr, i10));
    }

    public final void A(int i10, int i11) {
        int i12 = this.f12809l;
        int i13 = this.f12808k;
        int i14 = this.f12810m;
        if (i13 != i10) {
            Object[] objArr = this.f12801c;
            if (i10 < i13) {
                System.arraycopy(objArr, i10, objArr, i10 + i12, i13 - i10);
            } else {
                int i15 = i13 + i12;
                System.arraycopy(objArr, i15, objArr, i13, (i10 + i12) - i15);
            }
        }
        int iMin = Math.min(i11 + 1, n());
        if (i14 != iMin) {
            int length = this.f12801c.length - i12;
            if (iMin < i14) {
                int iQ = q(iMin);
                int iQ2 = q(i14);
                int i16 = this.f12805g;
                while (iQ < iQ2) {
                    int i17 = (iQ * 5) + 4;
                    int i18 = this.f12800b[i17];
                    if (!(i18 >= 0)) {
                        C1090i.c("Unexpected anchor value, expected a positive anchor");
                    }
                    this.f12800b[i17] = -((length - i18) + 1);
                    iQ++;
                    if (iQ == i16) {
                        iQ += this.f12806h;
                    }
                }
            } else {
                int iQ3 = q(i14);
                int iQ4 = q(iMin);
                while (iQ3 < iQ4) {
                    int i19 = (iQ3 * 5) + 4;
                    int i20 = this.f12800b[i19];
                    if (!(i20 < 0)) {
                        C1090i.c("Unexpected anchor value, expected a negative anchor");
                    }
                    this.f12800b[i19] = i20 + length + 1;
                    iQ3++;
                    if (iQ3 == this.f12805g) {
                        iQ3 += this.f12806h;
                    }
                }
            }
            this.f12810m = iMin;
        }
        this.f12808k = i10;
    }

    public final List B(C1074a c1074a, D0 d10) {
        if (!(d10.f12811n > 0)) {
            C1090i.c("Check failed");
        }
        if (this.f12811n != 0) {
            C1090i.c("Check failed");
        }
        if (!c1074a.a()) {
            C1090i.c("Check failed");
        }
        int iC = c(c1074a) + 1;
        int i10 = this.f12817t;
        if (i10 > iC || iC >= this.f12818u) {
            C1090i.c("Check failed");
        }
        int iE = E(this.f12800b, iC);
        int iS = s(iC);
        int iD = w(iC) ? 1 : D(iC);
        List listA = a.a(this, iC, d10, false, false, true);
        V(iE);
        boolean z10 = iD > 0;
        while (iE >= i10) {
            int iQ = q(iE);
            int[] iArr = this.f12800b;
            int i11 = iQ * 5;
            int i12 = i11 + 3;
            iArr[i12] = iArr[i12] - iS;
            if (z10) {
                int i13 = iArr[i11 + 1];
                if ((1073741824 & i13) != 0) {
                    z10 = false;
                } else {
                    C0.d(iQ, (i13 & 67108863) - iD, iArr);
                }
            }
            iE = E(this.f12800b, iE);
        }
        if (z10) {
            if (this.f12812o < iD) {
                C1090i.c("Check failed");
            }
            this.f12812o -= iD;
        }
        return listA;
    }

    public final Object C(int i10) {
        int iQ = q(i10);
        int[] iArr = this.f12800b;
        if ((iArr[(iQ * 5) + 1] & 1073741824) != 0) {
            return this.f12801c[g(f(iArr, iQ))];
        }
        return null;
    }

    public final int D(int i10) {
        return this.f12800b[(q(i10) * 5) + 1] & 67108863;
    }

    public final int E(int[] iArr, int i10) {
        int i11 = iArr[(q(i10) * 5) + 2];
        return i11 > -2 ? i11 : n() + i11 + 2;
    }

    public final Object F(Object obj) {
        if (this.f12811n > 0) {
            v(1, this.f12819v);
        }
        Object[] objArr = this.f12801c;
        int i10 = this.f12807i;
        this.f12807i = i10 + 1;
        Object obj2 = objArr[g(i10)];
        if (this.f12807i > this.j) {
            C1090i.c("Writing to an invalid slot");
        }
        this.f12801c[g(this.f12807i - 1)] = obj;
        return obj2;
    }

    public final void G() {
        int i10;
        androidx.collection.A a10 = this.f12821x;
        if (a10 != null) {
            while (a10.f9184b != 0) {
                int iB = C1093j0.b(a10);
                int iQ = q(iB);
                int iS = iB + 1;
                int iS2 = s(iB) + iB;
                while (true) {
                    if (iS >= iS2) {
                        i10 = 0;
                        break;
                    } else {
                        if ((this.f12800b[(q(iS) * 5) + 1] & 201326592) != 0) {
                            i10 = 1;
                            break;
                        }
                        iS += s(iS);
                    }
                }
                int[] iArr = this.f12800b;
                int i11 = (iQ * 5) + 1;
                int i12 = iArr[i11];
                if (((67108864 & i12) == 0 ? 0 : 1) != i10) {
                    iArr[i11] = (i10 << 26) | ((-67108865) & i12);
                    int iE = E(iArr, iB);
                    if (iE >= 0) {
                        C1093j0.a(a10, iE);
                    }
                }
            }
        }
    }

    public final boolean H() {
        C1074a c1074aS;
        if (!(this.f12811n == 0)) {
            C1090i.c("Cannot remove group while inserting");
        }
        int i10 = this.f12817t;
        int i11 = this.f12807i;
        int iF = f(this.f12800b, q(i10));
        int iK = K();
        H hP = P(this.f12819v);
        if (hP != null && (c1074aS = S(i10)) != null) {
            hP.c(c1074aS);
        }
        androidx.collection.A a10 = this.f12821x;
        if (a10 != null) {
            while (true) {
                int i12 = a10.f9184b;
                if (i12 == 0) {
                    break;
                }
                if (i12 == 0) {
                    D9.o.s("IntList is empty.");
                    throw null;
                }
                if (a10.f9183a[0] < i10) {
                    break;
                }
                C1093j0.b(a10);
            }
        }
        boolean zI = I(i10, this.f12817t - i10);
        J(iF, this.f12807i - iF, i10 - 1);
        this.f12817t = i10;
        this.f12807i = i11;
        this.f12812o -= iK;
        return zI;
    }

    public final boolean I(int i10, int i11) {
        boolean z10 = false;
        if (i11 > 0) {
            ArrayList<C1074a> arrayList = this.f12802d;
            z(i10);
            if (!arrayList.isEmpty()) {
                HashMap<C1074a, H> map = this.f12803e;
                int i12 = i10 + i11;
                int iB = C0.b(this.f12802d, i12, m() - this.f12806h);
                if (iB >= this.f12802d.size()) {
                    iB--;
                }
                int i13 = iB + 1;
                int i14 = 0;
                while (iB >= 0) {
                    C1074a c1074a = this.f12802d.get(iB);
                    int iC = c(c1074a);
                    if (iC < i10) {
                        break;
                    }
                    if (iC < i12) {
                        c1074a.f12935a = Integer.MIN_VALUE;
                        if (map != null) {
                            map.remove(c1074a);
                        }
                        if (i14 == 0) {
                            i14 = iB + 1;
                        }
                        i13 = iB;
                    }
                    iB--;
                }
                z10 = i13 < i14;
                if (z10) {
                    this.f12802d.subList(i13, i14).clear();
                }
            }
            this.f12805g = i10;
            this.f12806h += i11;
            int i15 = this.f12810m;
            if (i15 > i10) {
                this.f12810m = Math.max(i10, i15 - i11);
            }
            int i16 = this.f12818u;
            if (i16 >= this.f12805g) {
                this.f12818u = i16 - i11;
            }
            int i17 = this.f12819v;
            if (i17 >= 0 && (this.f12800b[(q(i17) * 5) + 1] & 67108864) != 0) {
                V(i17);
            }
        }
        return z10;
    }

    public final void J(int i10, int i11, int i12) {
        if (i11 > 0) {
            int i13 = this.f12809l;
            int i14 = i10 + i11;
            A(i14, i12);
            this.f12808k = i10;
            this.f12809l = i13 + i11;
            Arrays.fill(this.f12801c, i10, i14, (Object) null);
            int i15 = this.j;
            if (i15 >= i10) {
                this.j = i15 - i11;
            }
        }
    }

    public final int K() {
        int iQ = q(this.f12817t);
        int iA = C0.a(this.f12800b, iQ) + this.f12817t;
        this.f12817t = iA;
        this.f12807i = f(this.f12800b, q(iA));
        int i10 = this.f12800b[(iQ * 5) + 1];
        if ((1073741824 & i10) != 0) {
            return 1;
        }
        return i10 & 67108863;
    }

    public final void L() {
        int i10 = this.f12818u;
        this.f12817t = i10;
        this.f12807i = f(this.f12800b, q(i10));
    }

    public final int M(int[] iArr, int i10) {
        if (i10 >= m()) {
            return this.f12801c.length - this.f12809l;
        }
        int iC = C0.c(iArr, i10);
        return iC < 0 ? (this.f12801c.length - this.f12809l) + iC + 1 : iC;
    }

    public final int N(int i10, int i11) {
        int iM = M(this.f12800b, q(i10));
        int i12 = iM + i11;
        if (!(i12 >= iM && i12 < f(this.f12800b, q(i10 + 1)))) {
            C1090i.c("Write to an invalid slot index " + i11 + " for group " + i10);
        }
        return i12;
    }

    public final int O(int i10) {
        return f(this.f12800b, q(s(i10) + i10));
    }

    public final H P(int i10) {
        C1074a c1074aS;
        HashMap<C1074a, H> map = this.f12803e;
        if (map == null || (c1074aS = S(i10)) == null) {
            return null;
        }
        return map.get(c1074aS);
    }

    public final void Q() {
        if (this.f12811n != 0) {
            C1090i.c("Key must be supplied when inserting");
        }
        InterfaceC1084f.a.C0153a c0153a = InterfaceC1084f.a.f12980a;
        R(0, c0153a, c0153a, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void R(int i10, Object obj, Object obj2, boolean z10) {
        int i11;
        H hP;
        int i12 = this.f12819v;
        Object[] objArr = this.f12811n > 0;
        this.f12815r.f(this.f12812o);
        InterfaceC1084f.a.C0153a c0153a = InterfaceC1084f.a.f12980a;
        if (objArr == true) {
            int i13 = this.f12817t;
            int iF = f(this.f12800b, q(i13));
            u(1);
            this.f12807i = iF;
            this.j = iF;
            int iQ = q(i13);
            int i14 = obj != c0153a ? 1 : 0;
            int i15 = (z10 || obj2 == c0153a) ? 0 : 1;
            int iH = h(iF, this.f12808k, this.f12809l, this.f12801c.length);
            if (iH >= 0 && this.f12810m < i13) {
                iH = -(((this.f12801c.length - this.f12809l) - iH) + 1);
            }
            int[] iArr = this.f12800b;
            int i16 = this.f12819v;
            int i17 = iQ * 5;
            iArr[i17] = i10;
            iArr[i17 + 1] = ((z10 ? 1 : 0) << 30) | (i14 << 29) | (i15 << 28);
            iArr[i17 + 2] = i16;
            iArr[i17 + 3] = 0;
            iArr[i17 + 4] = iH;
            int i18 = (z10 ? 1 : 0) + i14 + i15;
            if (i18 > 0) {
                v(i18, i13);
                Object[] objArr2 = this.f12801c;
                int i19 = this.f12807i;
                if (z10) {
                    objArr2[i19] = obj2;
                    i19++;
                }
                if (i14 != 0) {
                    objArr2[i19] = obj;
                    i19++;
                }
                if (i15 != 0) {
                    objArr2[i19] = obj2;
                    i19++;
                }
                this.f12807i = i19;
            }
            this.f12812o = 0;
            i11 = i13 + 1;
            this.f12819v = i13;
            this.f12817t = i11;
            if (i12 >= 0 && (hP = P(i12)) != null) {
                H hB = hP.b();
                C1074a c1074aB = b(i13);
                ArrayList<Object> arrayList = hB.f12845a;
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                hB.f12845a = arrayList;
                arrayList.add(c1074aB);
            }
        } else {
            this.f12813p.f(i12);
            this.f12814q.f((m() - this.f12806h) - this.f12818u);
            int i20 = this.f12817t;
            int iQ2 = q(i20);
            if (!kotlin.jvm.internal.i.a(obj2, c0153a)) {
                if (z10) {
                    W(this.f12817t, obj2);
                } else {
                    U(obj2);
                }
            }
            this.f12807i = M(this.f12800b, iQ2);
            this.j = f(this.f12800b, q(this.f12817t + 1));
            int[] iArr2 = this.f12800b;
            int i21 = iQ2 * 5;
            this.f12812o = iArr2[i21 + 1] & 67108863;
            this.f12819v = i20;
            this.f12817t = i20 + 1;
            i11 = i20 + iArr2[i21 + 3];
        }
        this.f12818u = i11;
    }

    public final C1074a S(int i10) {
        ArrayList<C1074a> arrayList;
        int iE;
        if (i10 < 0 || i10 >= n() || (iE = C0.e((arrayList = this.f12802d), i10, n())) < 0) {
            return null;
        }
        return arrayList.get(iE);
    }

    public final void T(Object obj) {
        if (this.f12811n <= 0 || this.f12807i == this.f12808k) {
            F(obj);
            return;
        }
        androidx.collection.B<androidx.collection.I<Object>> b10 = this.f12816s;
        if (b10 == null) {
            b10 = new androidx.collection.B<>();
        }
        this.f12816s = b10;
        int i10 = this.f12819v;
        androidx.collection.I<Object> iB = b10.b(i10);
        if (iB == null) {
            iB = new androidx.collection.I<>((Object) null);
            b10.h(i10, iB);
        }
        iB.g(obj);
    }

    public final void U(Object obj) {
        int iQ = q(this.f12817t);
        int i10 = (iQ * 5) + 1;
        if ((this.f12800b[i10] & 268435456) == 0) {
            C1090i.c("Updating the data of a group that was not created with a data slot");
        }
        Object[] objArr = this.f12801c;
        int[] iArr = this.f12800b;
        objArr[g(Integer.bitCount(iArr[i10] >> 29) + f(iArr, iQ))] = obj;
    }

    public final void V(int i10) {
        if (i10 >= 0) {
            androidx.collection.A a10 = this.f12821x;
            if (a10 == null) {
                a10 = new androidx.collection.A();
                this.f12821x = a10;
            }
            C1093j0.a(a10, i10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final void W(int i10, Object obj) {
        boolean z10;
        int iQ = q(i10);
        int[] iArr = this.f12800b;
        if (iQ < iArr.length) {
            z10 = (iArr[(iQ * 5) + 1] & 1073741824) != 0;
        }
        if (!z10) {
            C1090i.c("Updating the node of a group at " + i10 + " that was not created with as a node group");
        }
        this.f12801c[g(f(this.f12800b, iQ))] = obj;
    }

    public final void a(int i10) {
        boolean z10 = false;
        if (!(i10 >= 0)) {
            C1090i.c("Cannot seek backwards");
        }
        if (!(this.f12811n <= 0)) {
            C1091i0.b("Cannot call seek() while inserting");
        }
        if (i10 == 0) {
            return;
        }
        int i11 = this.f12817t + i10;
        if (i11 >= this.f12819v && i11 <= this.f12818u) {
            z10 = true;
        }
        if (!z10) {
            C1090i.c("Cannot seek outside the current group (" + this.f12819v + '-' + this.f12818u + ')');
        }
        this.f12817t = i11;
        int iF = f(this.f12800b, q(i11));
        this.f12807i = iF;
        this.j = iF;
    }

    public final C1074a b(int i10) {
        ArrayList<C1074a> arrayList = this.f12802d;
        int iE = C0.e(arrayList, i10, n());
        if (iE >= 0) {
            return arrayList.get(iE);
        }
        if (i10 > this.f12805g) {
            i10 = -(n() - i10);
        }
        C1074a c1074a = new C1074a(i10);
        arrayList.add(-(iE + 1), c1074a);
        return c1074a;
    }

    public final int c(C1074a c1074a) {
        int i10 = c1074a.f12935a;
        return i10 < 0 ? i10 + n() : i10;
    }

    public final void d() {
        int i10 = this.f12811n;
        this.f12811n = i10 + 1;
        if (i10 == 0) {
            this.f12814q.f((m() - this.f12806h) - this.f12818u);
        }
    }

    public final void e(boolean z10) {
        this.f12820w = true;
        if (z10 && this.f12813p.f5989a == 0) {
            z(n());
            A(this.f12801c.length - this.f12809l, this.f12805g);
            int i10 = this.f12808k;
            Arrays.fill(this.f12801c, i10, this.f12809l + i10, (Object) null);
            G();
        }
        int[] iArr = this.f12800b;
        int i11 = this.f12805g;
        Object[] objArr = this.f12801c;
        int i12 = this.f12808k;
        ArrayList<C1074a> arrayList = this.f12802d;
        HashMap<C1074a, H> map = this.f12803e;
        androidx.collection.B<androidx.collection.C> b10 = this.f12804f;
        A0 a10 = this.f12799a;
        a10.getClass();
        if (!a10.f12776h) {
            C1091i0.a("Unexpected writer close()");
        }
        a10.f12776h = false;
        a10.f12770b = iArr;
        a10.f12771c = i11;
        a10.f12772d = objArr;
        a10.f12773e = i12;
        a10.j = arrayList;
        a10.f12778k = map;
        a10.f12779l = b10;
    }

    public final int f(int[] iArr, int i10) {
        if (i10 >= m()) {
            return this.f12801c.length - this.f12809l;
        }
        int i11 = iArr[(i10 * 5) + 4];
        return i11 < 0 ? (this.f12801c.length - this.f12809l) + i11 + 1 : i11;
    }

    public final int g(int i10) {
        return (this.f12809l * (i10 < this.f12808k ? 0 : 1)) + i10;
    }

    public final void i() {
        androidx.collection.I<Object> iB;
        boolean z10 = this.f12811n > 0;
        int i10 = this.f12817t;
        int i11 = this.f12818u;
        int i12 = this.f12819v;
        int iQ = q(i12);
        int i13 = this.f12812o;
        int i14 = i10 - i12;
        int i15 = iQ * 5;
        int i16 = i15 + 1;
        boolean z11 = (this.f12800b[i16] & 1073741824) != 0;
        T4.o0 o0Var = this.f12815r;
        if (z10) {
            androidx.collection.B<androidx.collection.I<Object>> b10 = this.f12816s;
            if (b10 != null && (iB = b10.b(i12)) != null) {
                Object[] objArr = iB.f9108a;
                int i17 = iB.f9109b;
                for (int i18 = 0; i18 < i17; i18++) {
                    F(objArr[i18]);
                }
                b10.g(i12);
            }
            int[] iArr = this.f12800b;
            iArr[i15 + 3] = i14;
            C0.d(iQ, i13, iArr);
            int iE = o0Var.e();
            if (z11) {
                i13 = 1;
            }
            this.f12812o = iE + i13;
            int iE2 = E(this.f12800b, i12);
            this.f12819v = iE2;
            int iN = iE2 < 0 ? n() : q(iE2 + 1);
            int iF = iN >= 0 ? f(this.f12800b, iN) : 0;
            this.f12807i = iF;
            this.j = iF;
            return;
        }
        if (i10 != i11) {
            C1090i.c("Expected to be at the end of a group");
        }
        int[] iArr2 = this.f12800b;
        int i19 = i15 + 3;
        int i20 = iArr2[i19];
        int i21 = iArr2[i16] & 67108863;
        iArr2[i19] = i14;
        C0.d(iQ, i13, iArr2);
        int iE3 = this.f12813p.e();
        this.f12818u = (m() - this.f12806h) - this.f12814q.e();
        this.f12819v = iE3;
        int iE4 = E(this.f12800b, i12);
        int iE5 = o0Var.e();
        this.f12812o = iE5;
        if (iE4 == iE3) {
            this.f12812o = iE5 + (z11 ? 0 : i13 - i21);
            return;
        }
        int i22 = i14 - i20;
        int i23 = z11 ? 0 : i13 - i21;
        if (i22 != 0 || i23 != 0) {
            while (iE4 != 0 && iE4 != iE3 && (i23 != 0 || i22 != 0)) {
                int iQ2 = q(iE4);
                if (i22 != 0) {
                    int[] iArr3 = this.f12800b;
                    int i24 = (iQ2 * 5) + 3;
                    iArr3[i24] = iArr3[i24] + i22;
                }
                if (i23 != 0) {
                    int[] iArr4 = this.f12800b;
                    C0.d(iQ2, (iArr4[(iQ2 * 5) + 1] & 67108863) + i23, iArr4);
                }
                int[] iArr5 = this.f12800b;
                if ((iArr5[(iQ2 * 5) + 1] & 1073741824) != 0) {
                    i23 = 0;
                }
                iE4 = E(iArr5, iE4);
            }
        }
        this.f12812o += i23;
    }

    public final void j() {
        if (this.f12811n <= 0) {
            C1091i0.b("Unbalanced begin/end insert");
        }
        int i10 = this.f12811n - 1;
        this.f12811n = i10;
        if (i10 == 0) {
            if (this.f12815r.f5989a != this.f12813p.f5989a) {
                C1090i.c("startGroup/endGroup mismatch while inserting");
            }
            this.f12818u = (m() - this.f12806h) - this.f12814q.e();
        }
    }

    public final void k(int i10) {
        boolean z10 = false;
        if (!(this.f12811n <= 0)) {
            C1090i.c("Cannot call ensureStarted() while inserting");
        }
        int i11 = this.f12819v;
        if (i11 != i10) {
            if (i10 >= i11 && i10 < this.f12818u) {
                z10 = true;
            }
            if (!z10) {
                C1090i.c("Started group at " + i10 + " must be a subgroup of the group at " + i11);
            }
            int i12 = this.f12817t;
            int i13 = this.f12807i;
            int i14 = this.j;
            this.f12817t = i10;
            Q();
            this.f12817t = i12;
            this.f12807i = i13;
            this.j = i14;
        }
    }

    public final void l(int i10, int i11, int i12) {
        if (i10 >= this.f12805g) {
            i10 = -((n() - i10) + 2);
        }
        while (i12 < i11) {
            this.f12800b[(q(i12) * 5) + 2] = i10;
            int i13 = this.f12800b[(q(i12) * 5) + 3] + i12;
            l(i12, i13, i12 + 1);
            i12 = i13;
        }
    }

    public final int m() {
        return this.f12800b.length / 5;
    }

    public final int n() {
        return m() - this.f12806h;
    }

    public final int o() {
        return this.f12801c.length - this.f12809l;
    }

    public final Object p(int i10) {
        int iQ = q(i10);
        int[] iArr = this.f12800b;
        int i11 = (iQ * 5) + 1;
        if ((iArr[i11] & 268435456) == 0) {
            return InterfaceC1084f.a.f12980a;
        }
        return this.f12801c[Integer.bitCount(iArr[i11] >> 29) + f(iArr, iQ)];
    }

    public final int q(int i10) {
        return (this.f12806h * (i10 < this.f12805g ? 0 : 1)) + i10;
    }

    public final Object r(int i10) {
        int iQ = q(i10);
        int[] iArr = this.f12800b;
        int i11 = iQ * 5;
        int i12 = iArr[i11 + 1];
        if ((536870912 & i12) == 0) {
            return null;
        }
        return this.f12801c[Integer.bitCount(i12 >> 30) + iArr[i11 + 4]];
    }

    public final int s(int i10) {
        return C0.a(this.f12800b, q(i10));
    }

    public final boolean t(int i10, int i11) {
        int iM;
        int iS;
        if (i11 == this.f12819v) {
            iM = this.f12818u;
        } else {
            T4.o0 o0Var = this.f12813p;
            if (i11 > o0Var.d(0)) {
                iS = s(i11);
            } else {
                int[] iArr = (int[]) o0Var.f5990b;
                int iMin = Math.min(iArr.length, o0Var.f5989a);
                int i12 = 0;
                while (true) {
                    if (i12 >= iMin) {
                        i12 = -1;
                        break;
                    }
                    if (iArr[i12] == i11) {
                        break;
                    }
                    i12++;
                }
                if (i12 < 0) {
                    iS = s(i11);
                } else {
                    iM = (m() - this.f12806h) - ((int[]) this.f12814q.f5990b)[i12];
                }
            }
            iM = iS + i11;
        }
        return i10 > i11 && i10 < iM;
    }

    public final String toString() {
        return "SlotWriter(current = " + this.f12817t + " end=" + this.f12818u + " size = " + n() + " gap=" + this.f12805g + '-' + (this.f12805g + this.f12806h) + ')';
    }

    public final void u(int i10) {
        if (i10 > 0) {
            int i11 = this.f12817t;
            z(i11);
            int i12 = this.f12805g;
            int i13 = this.f12806h;
            int[] iArr = this.f12800b;
            int length = iArr.length / 5;
            int i14 = length - i13;
            if (i13 < i10) {
                int iMax = Math.max(Math.max(length * 2, i14 + i10), 32);
                int[] iArr2 = new int[iMax * 5];
                int i15 = iMax - i14;
                Q3.d.m(0, 0, i12 * 5, iArr, iArr2);
                Q3.d.m((i12 + i15) * 5, (i13 + i12) * 5, length * 5, iArr, iArr2);
                this.f12800b = iArr2;
                i13 = i15;
            }
            int i16 = this.f12818u;
            if (i16 >= i12) {
                this.f12818u = i16 + i10;
            }
            int i17 = i12 + i10;
            this.f12805g = i17;
            this.f12806h = i13 - i10;
            int iH = h(i14 > 0 ? f(this.f12800b, q(i11 + i10)) : 0, this.f12810m >= i12 ? this.f12808k : 0, this.f12809l, this.f12801c.length);
            for (int i18 = i12; i18 < i17; i18++) {
                this.f12800b[(i18 * 5) + 4] = iH;
            }
            int i19 = this.f12810m;
            if (i19 >= i12) {
                this.f12810m = i19 + i10;
            }
        }
    }

    public final void v(int i10, int i11) {
        if (i10 > 0) {
            A(this.f12807i, i11);
            int i12 = this.f12808k;
            int i13 = this.f12809l;
            if (i13 < i10) {
                Object[] objArr = this.f12801c;
                int length = objArr.length;
                int i14 = length - i13;
                int iMax = Math.max(Math.max(length * 2, i14 + i10), 32);
                Object[] objArr2 = new Object[iMax];
                for (int i15 = 0; i15 < iMax; i15++) {
                    objArr2[i15] = null;
                }
                int i16 = iMax - i14;
                int i17 = i13 + i12;
                System.arraycopy(objArr, 0, objArr2, 0, i12);
                System.arraycopy(objArr, i17, objArr2, i12 + i16, length - i17);
                this.f12801c = objArr2;
                i13 = i16;
            }
            int i18 = this.j;
            if (i18 >= i12) {
                this.j = i18 + i10;
            }
            this.f12808k = i12 + i10;
            this.f12809l = i13 - i10;
        }
    }

    public final boolean w(int i10) {
        return (this.f12800b[(q(i10) * 5) + 1] & 1073741824) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void y(A0 a10, int i10) {
        if (this.f12811n <= 0) {
            C1090i.c("Check failed");
        }
        boolean z10 = false;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if (i10 == 0 && this.f12817t == 0 && this.f12799a.f12771c == 0) {
            int[] iArr = a10.f12770b;
            int i11 = iArr[(i10 * 5) + 3];
            int i12 = a10.f12771c;
            if (i11 == i12) {
                int[] iArr2 = this.f12800b;
                Object[] objArr3 = this.f12801c;
                ArrayList<C1074a> arrayList = this.f12802d;
                HashMap<C1074a, H> map = this.f12803e;
                androidx.collection.B<androidx.collection.C> b10 = this.f12804f;
                Object[] objArr4 = a10.f12772d;
                int i13 = a10.f12773e;
                HashMap<C1074a, H> map2 = a10.f12778k;
                androidx.collection.B<androidx.collection.C> b11 = a10.f12779l;
                this.f12800b = iArr;
                this.f12801c = objArr4;
                this.f12802d = a10.j;
                this.f12805g = i12;
                this.f12806h = (iArr.length / 5) - i12;
                this.f12808k = i13;
                this.f12809l = objArr4.length - i13;
                this.f12810m = i12;
                this.f12803e = map2;
                this.f12804f = b11;
                a10.f12770b = iArr2;
                a10.f12771c = objArr2 == true ? 1 : 0;
                a10.f12772d = objArr3;
                a10.f12773e = objArr == true ? 1 : 0;
                a10.j = arrayList;
                a10.f12778k = map;
                a10.f12779l = b10;
                return;
            }
        }
        D0 d0V = a10.v();
        try {
            a.a(d0V, i10, this, true, true, false);
            boolean z11 = true;
        } finally {
            d0V.e(z10);
        }
    }

    public final void z(int i10) {
        C1074a c1074a;
        int i11;
        C1074a c1074a2;
        int i12;
        int i13;
        int i14 = this.f12806h;
        int i15 = this.f12805g;
        if (i15 != i10) {
            if (!this.f12802d.isEmpty()) {
                int iM = m() - this.f12806h;
                if (i15 < i10) {
                    for (int iB = C0.b(this.f12802d, i15, iM); iB < this.f12802d.size() && (i12 = (c1074a2 = this.f12802d.get(iB)).f12935a) < 0 && (i13 = i12 + iM) < i10; iB++) {
                        c1074a2.f12935a = i13;
                    }
                } else {
                    for (int iB2 = C0.b(this.f12802d, i10, iM); iB2 < this.f12802d.size() && (i11 = (c1074a = this.f12802d.get(iB2)).f12935a) >= 0; iB2++) {
                        c1074a.f12935a = -(iM - i11);
                    }
                }
            }
            if (i14 > 0) {
                int[] iArr = this.f12800b;
                int i16 = i10 * 5;
                int i17 = i14 * 5;
                int i18 = i15 * 5;
                if (i10 < i15) {
                    Q3.d.m(i17 + i16, i16, i18, iArr, iArr);
                } else {
                    Q3.d.m(i18, i18 + i17, i16 + i17, iArr, iArr);
                }
            }
            if (i10 < i15) {
                i15 = i10 + i14;
            }
            int iM2 = m();
            if (i15 >= iM2) {
                C1090i.c("Check failed");
            }
            while (i15 < iM2) {
                int i19 = (i15 * 5) + 2;
                int i20 = this.f12800b[i19];
                int iN = i20 > -2 ? i20 : (n() + i20) - (-2);
                if (iN >= i10) {
                    iN = -((n() - iN) - (-2));
                }
                if (iN != i20) {
                    this.f12800b[i19] = iN;
                }
                i15++;
                if (i15 == i10) {
                    i15 += i14;
                }
            }
        }
        this.f12805g = i10;
    }
}
