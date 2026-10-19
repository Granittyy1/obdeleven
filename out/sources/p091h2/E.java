package p091h2;

import A1.AbstractC0570e;
import A1.C0574i;
import A1.F;
import A1.p;
import A1.q;
import X1.l;
import X1.m;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import com.google.android.gms.internal.measurement.Y;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p114j1.r;
import p114j1.w;

/* JADX INFO: compiled from: TsExtractor.java */
/* JADX INFO: loaded from: classes.dex */
public final class E implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f35775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<w> f35776b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r f35777c = new r(0, new byte[9400]);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SparseIntArray f35778d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C2207g f35779e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l.a f35780f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final SparseArray<F> f35781g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final SparseBooleanArray f35782h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final SparseBooleanArray f35783i;
    public final D j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public C f35784k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public A1.r f35785l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f35786m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f35787n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f35788o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f35789p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final F f35790q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f35791r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f35792s;

    public E(int i10, l.a aVar, w wVar, C2207g c2207g) {
        this.f35779e = c2207g;
        this.f35775a = i10;
        this.f35780f = aVar;
        this.f35776b = Collections.singletonList(wVar);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.f35782h = sparseBooleanArray;
        this.f35783i = new SparseBooleanArray();
        SparseArray<F> sparseArray = new SparseArray<>();
        this.f35781g = sparseArray;
        this.f35778d = new SparseIntArray();
        this.j = new D();
        this.f35785l = A1.r.f552a0;
        this.f35792s = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i11 = 0; i11 < size; i11++) {
            sparseArray.put(sparseArray2.keyAt(i11), (F) sparseArray2.valueAt(i11));
        }
        sparseArray.put(0, new A(new a()));
        this.f35790q = null;
    }

    @Override // A1.p
    public final void f(long j, long j10) {
        C c10;
        long j11;
        List<w> list = this.f35776b;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            w wVar = list.get(i10);
            synchronized (wVar) {
                j11 = wVar.f41076b;
            }
            boolean z10 = j11 == -9223372036854775807L;
            if (!z10) {
                long jD = wVar.d();
                z10 = (jD == -9223372036854775807L || jD == 0 || jD == j10) ? false : true;
            }
            if (z10) {
                wVar.e(j10);
            }
        }
        if (j10 != 0 && (c10 = this.f35784k) != null) {
            c10.c(j10);
        }
        this.f35777c.D(0);
        this.f35778d.clear();
        int i11 = 0;
        while (true) {
            SparseArray<F> sparseArray = this.f35781g;
            if (i11 >= sparseArray.size()) {
                this.f35791r = 0;
                return;
            } else {
                sparseArray.valueAt(i11).c();
                i11++;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2, types: [int] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3, types: [int] */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5, types: [h2.v] */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r5v8, types: [int] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [h2.F] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [android.util.SparseBooleanArray] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    @Override // A1.p
    public final int h(q qVar, A1.E e10) throws IOException {
        ?? r10;
        ?? r11;
        ?? r12;
        F f10;
        boolean z10;
        long j;
        long j10;
        long j11 = ((C0574i) qVar).f522c;
        if (this.f35787n) {
            D d10 = this.j;
            if (j11 != -1 && !d10.f35769c) {
                int i10 = this.f35792s;
                if (i10 <= 0) {
                    d10.a((C0574i) qVar);
                    return 0;
                }
                boolean z11 = d10.f35771e;
                r rVar = d10.f35768b;
                if (!z11) {
                    C0574i c0574i = (C0574i) qVar;
                    long j12 = c0574i.f522c;
                    int iMin = (int) Math.min(112800, j12);
                    long j13 = j12 - ((long) iMin);
                    if (c0574i.f523d == j13) {
                        rVar.D(iMin);
                        c0574i.f525f = 0;
                        c0574i.c(rVar.f41062a, 0, iMin, false);
                        int i11 = rVar.f41063b;
                        int i12 = rVar.f41064c;
                        for (int i13 = i12 - 188; i13 >= i11; i13--) {
                            byte[] bArr = rVar.f41062a;
                            int i14 = 0;
                            for (int i15 = -4; i15 <= 4; i15++) {
                                int i16 = (i15 * 188) + i13;
                                if (i16 < i11 || i16 >= i12 || bArr[i16] != 71) {
                                    i14 = 0;
                                } else {
                                    i14++;
                                    if (i14 == 5) {
                                        long j14 = Y.j(rVar, i13, i10);
                                        if (j14 == -9223372036854775807L) {
                                            break;
                                        }
                                        j10 = j14;
                                        d10.f35773g = j10;
                                        d10.f35771e = true;
                                        return 0;
                                    }
                                }
                            }
                        }
                        j10 = -9223372036854775807L;
                        d10.f35773g = j10;
                        d10.f35771e = true;
                        return 0;
                    }
                    e10.f414a = j13;
                } else {
                    if (d10.f35773g == -9223372036854775807L) {
                        d10.a((C0574i) qVar);
                        return 0;
                    }
                    if (d10.f35770d) {
                        long j15 = d10.f35772f;
                        if (j15 == -9223372036854775807L) {
                            d10.a((C0574i) qVar);
                            return 0;
                        }
                        w wVar = d10.f35767a;
                        d10.f35774h = wVar.c(d10.f35773g) - wVar.b(j15);
                        d10.a((C0574i) qVar);
                        return 0;
                    }
                    C0574i c0574i2 = (C0574i) qVar;
                    int iMin2 = (int) Math.min(112800, c0574i2.f522c);
                    long j16 = 0;
                    if (c0574i2.f523d == j16) {
                        rVar.D(iMin2);
                        c0574i2.f525f = 0;
                        c0574i2.c(rVar.f41062a, 0, iMin2, false);
                        int i17 = rVar.f41064c;
                        for (int i18 = rVar.f41063b; i18 < i17; i18++) {
                            if (rVar.f41062a[i18] == 71) {
                                long j17 = Y.j(rVar, i18, i10);
                                if (j17 != -9223372036854775807L) {
                                    j = j17;
                                    d10.f35772f = j;
                                    d10.f35770d = true;
                                    return 0;
                                }
                            }
                        }
                        j = -9223372036854775807L;
                        d10.f35772f = j;
                        d10.f35770d = true;
                        return 0;
                    }
                    e10.f414a = j16;
                }
                return 1;
            }
            if (!this.f35788o) {
                this.f35788o = true;
                long j18 = d10.f35774h;
                if (j18 != -9223372036854775807L) {
                    C c10 = new C(new AbstractC0570e.b(), new C.a(this.f35792s, d10.f35767a), j18, j18 + 1, 0L, j11, 188L, 940);
                    this.f35784k = c10;
                    this.f35785l.g(c10.f485a);
                } else {
                    this.f35785l.g(new F.b(j18));
                }
            }
            if (this.f35789p) {
                z10 = false;
                this.f35789p = false;
                f(0L, 0L);
                if (((C0574i) qVar).f523d != 0) {
                    e10.f414a = 0L;
                    return 1;
                }
            } else {
                z10 = false;
            }
            r10 = 1;
            r10 = 1;
            C c11 = this.f35784k;
            r11 = z10;
            if (c11 != null && c11.f487c != null) {
                r11 = z10;
                return c11.a((C0574i) qVar, e10);
            }
        } else {
            r10 = 1;
            r11 = 0;
            j11 = j11;
        }
        r11 = z10;
        r rVar2 = this.f35777c;
        byte[] bArr2 = rVar2.f41062a;
        if (9400 - rVar2.f41063b < 188) {
            int iA = rVar2.a();
            if (iA > 0) {
                System.arraycopy(bArr2, rVar2.f41063b, bArr2, r11, iA);
            }
            rVar2.E(iA, bArr2);
        }
        while (true) {
            int iA2 = rVar2.a();
            SparseArray<F> sparseArray = this.f35781g;
            if (iA2 >= 188) {
                int i19 = rVar2.f41063b;
                int i20 = rVar2.f41064c;
                byte[] bArr3 = rVar2.f41062a;
                int i21 = i19;
                while (i21 < i20 && bArr3[i21] != 71) {
                    i21++;
                }
                rVar2.G(i21);
                int i22 = i21 + 188;
                if (i22 > i20) {
                    this.f35791r = (i21 - i19) + this.f35791r;
                } else {
                    this.f35791r = r11;
                }
                int i23 = rVar2.f41064c;
                if (i22 > i23) {
                    return r11;
                }
                int iH = rVar2.h();
                if ((8388608 & iH) != 0) {
                    rVar2.G(i22);
                    return r11;
                }
                ?? r13 = (4194304 & iH) != 0 ? r10 : r11;
                int i24 = (2096896 & iH) >> 8;
                ?? r14 = (iH & 32) != 0 ? r10 : r11;
                if ((iH & 16) != 0) {
                    f10 = sparseArray.get(i24);
                } else {
                    r12 = 0;
                }
                if (r12 == 0) {
                    r12 = f10;
                    rVar2.G(i22);
                    return r11;
                }
                int i25 = iH & 15;
                SparseIntArray sparseIntArray = this.f35778d;
                int i26 = sparseIntArray.get(i24, i25 - 1);
                sparseIntArray.put(i24, i25);
                if (i26 == i25) {
                    r12 = f10;
                    rVar2.G(i22);
                    return r11;
                }
                if (i25 != ((i26 + r10) & 15)) {
                    r12 = f10;
                    r12.c();
                }
                if (r14 != 0) {
                    int iU = rVar2.u();
                    r13 = (r13 == true ? 1 : 0) | ((rVar2.u() & 64) != 0 ? 2 : r11);
                    rVar2.H(iU - r10);
                }
                boolean z12 = this.f35787n;
                if (z12 || !this.f35783i.get(i24, r11)) {
                    rVar2.F(i22);
                    r12.a(r13, rVar2);
                    rVar2.F(i23);
                }
                if (!z12 && this.f35787n && j11 != -1) {
                    this.f35789p = r10;
                }
                rVar2.G(i22);
                return r11;
            }
            int i27 = rVar2.f41064c;
            int i28 = ((C0574i) qVar).read(bArr2, i27, 9400 - i27);
            if (i28 == -1) {
                for (?? r15 = r11; r15 < sparseArray.size(); r15++) {
                    F fValueAt = sparseArray.valueAt(r15);
                    if (fValueAt instanceof v) {
                        ?? r16 = (v) fValueAt;
                        if (r16.f36094c == 3 && r16.j == -1) {
                            r16.a(r10, new r());
                        }
                    }
                }
                return -1;
            }
            rVar2.F(i27 + i28);
        }
    }

    @Override // A1.p
    public final boolean l(q qVar) throws IOException {
        byte[] bArr = this.f35777c.f41062a;
        C0574i c0574i = (C0574i) qVar;
        c0574i.c(bArr, 0, 940, false);
        for (int i10 = 0; i10 < 188; i10++) {
            int i11 = 0;
            while (true) {
                if (i11 >= 5) {
                    c0574i.i(i10);
                    return true;
                }
                if (bArr[(i11 * 188) + i10] != 71) {
                    break;
                }
                i11++;
            }
        }
        return false;
    }

    @Override // A1.p
    public final void m(A1.r rVar) {
        if ((this.f35775a & 1) == 0) {
            rVar = new m(rVar, this.f35780f);
        }
        this.f35785l = rVar;
    }

    @Override // A1.p
    public final void a() {
    }

    /* JADX INFO: compiled from: TsExtractor.java */
    public class a implements z {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p114j1.q f35793a = new p114j1.q(4, new byte[4]);

        public a() {
        }

        @Override // p091h2.z
        public final void a(r rVar) {
            if (rVar.u() != 0 || (rVar.u() & 128) == 0) {
                return;
            }
            rVar.H(6);
            int iA = rVar.a() / 4;
            int i10 = 0;
            while (true) {
                E e10 = E.this;
                if (i10 >= iA) {
                    e10.getClass();
                    e10.f35781g.remove(0);
                    return;
                }
                p114j1.q qVar = this.f35793a;
                rVar.f(qVar.f41055a, 0, 4);
                qVar.m(0);
                int iG = qVar.g(16);
                qVar.o(3);
                if (iG == 0) {
                    qVar.o(13);
                } else {
                    int iG2 = qVar.g(13);
                    if (e10.f35781g.get(iG2) == null) {
                        e10.f35781g.put(iG2, new A(e10.new b(iG2)));
                        e10.f35786m++;
                    }
                }
                i10++;
            }
        }

        @Override // p091h2.z
        public final void b(w wVar, A1.r rVar, F.c cVar) {
        }
    }

    /* JADX INFO: compiled from: TsExtractor.java */
    public class b implements z {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p114j1.q f35795a = new p114j1.q(5, new byte[5]);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final SparseArray<F> f35796b = new SparseArray<>();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final SparseIntArray f35797c = new SparseIntArray();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f35798d;

        public b(int i10) {
            this.f35798d = i10;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:105:0x021c  */
        /* JADX WARN: Code duplicated, block: B:110:0x0274  */
        /* JADX WARN: Code duplicated, block: B:118:0x02ef  */
        /* JADX WARN: Code duplicated, block: B:119:0x02fe  */
        /* JADX WARN: Code duplicated, block: B:138:0x0317 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:27:0x00dd  */
        /* JADX WARN: Code duplicated, block: B:71:0x01bd  */
        /* JADX WARN: Code duplicated, block: B:75:0x01cb  */
        /* JADX WARN: Code duplicated, block: B:77:0x01d2  */
        @Override // p091h2.z
        public final void a(r rVar) {
            w wVar;
            int i10;
            F.b bVar;
            C2207g c2207g;
            F vVar;
            String str;
            if (rVar.u() != 2) {
                return;
            }
            E e10 = E.this;
            e10.getClass();
            int i11 = 0;
            w wVar2 = e10.f35776b.get(0);
            if ((rVar.u() & 128) == 0) {
                return;
            }
            rVar.H(1);
            int iA = rVar.A();
            int i12 = 3;
            rVar.H(3);
            p114j1.q qVar = this.f35795a;
            rVar.f(qVar.f41055a, 0, 2);
            qVar.m(0);
            qVar.o(3);
            int i13 = 13;
            e10.f35792s = qVar.g(13);
            rVar.f(qVar.f41055a, 0, 2);
            qVar.m(0);
            int i14 = 4;
            qVar.o(4);
            rVar.H(qVar.g(12));
            SparseArray<F> sparseArray = this.f35796b;
            sparseArray.clear();
            SparseIntArray sparseIntArray = this.f35797c;
            sparseIntArray.clear();
            int iA2 = rVar.a();
            while (true) {
                SparseBooleanArray sparseBooleanArray = e10.f35782h;
                if (iA2 > 0) {
                    rVar.f(qVar.f41055a, i11, 5);
                    qVar.m(i11);
                    int iG = qVar.g(8);
                    qVar.o(i12);
                    int iG2 = qVar.g(i13);
                    qVar.o(i14);
                    int iG3 = qVar.g(12);
                    int i15 = rVar.f41063b;
                    int i16 = i15 + iG3;
                    int i17 = -1;
                    String str2 = null;
                    ArrayList arrayList = null;
                    int iU = 0;
                    while (rVar.f41063b < i16) {
                        int iU2 = rVar.u();
                        int iU3 = rVar.f41063b + rVar.u();
                        if (iU3 > i16) {
                            w wVar3 = wVar2;
                            int i18 = iA;
                            p114j1.q qVar2 = qVar;
                            rVar.G(i16);
                            bVar = new F.b(i17, str2, iU, arrayList, Arrays.copyOfRange(rVar.f41062a, i15, i16));
                            if (iG != 6 || iG == 5) {
                                iG = i17;
                            }
                            iA2 -= iG3 + 5;
                            if (sparseBooleanArray.get(iG2)) {
                                c2207g = e10.f35779e;
                                if (iG != 2) {
                                    c2207g.getClass();
                                    str = bVar.f35802a;
                                    if (iG != 3 || iG == 4) {
                                        vVar = new v(new q(str, bVar.a(), "video/mp2t"));
                                    } else if (iG == 21) {
                                        vVar = new v(new o());
                                    } else if (iG == 27) {
                                        vVar = new v(new m(new B(c2207g.a(bVar)), false, false));
                                    } else if (iG == 36) {
                                        vVar = new v(new n(new B(c2207g.a(bVar))));
                                    } else if (iG == 45) {
                                        vVar = new v(new r());
                                    } else if (iG == 89) {
                                        vVar = new v(new i(bVar.f35804c));
                                    } else if (iG == 172) {
                                        vVar = new v(new C2204d(str, bVar.a(), "video/mp2t"));
                                    } else if (iG == 257) {
                                        vVar = new A(new u("application/vnd.dvb.ait"));
                                    } else if (iG == 138) {
                                        vVar = new v(new h(str, bVar.a(), 4096));
                                    } else if (iG != 139) {
                                        switch (iG) {
                                            case 15:
                                                vVar = new v(new C2206f(str, "video/mp2t", bVar.a(), false));
                                                break;
                                            case 16:
                                                vVar = new v(new l(new G(c2207g.a(bVar))));
                                                break;
                                            case 17:
                                                vVar = new v(new p(str, bVar.a()));
                                                break;
                                            default:
                                                vVar = null;
                                                switch (iG) {
                                                    case 128:
                                                        vVar = new v(new k(new G(c2207g.a(bVar)), "video/mp2t"));
                                                        break;
                                                    case 129:
                                                        vVar = new v(new C2202b(str, bVar.a(), "video/mp2t"));
                                                        break;
                                                    case 130:
                                                        break;
                                                    default:
                                                        switch (iG) {
                                                            case 134:
                                                                vVar = new A(new u("application/x-scte35"));
                                                                break;
                                                            case 135:
                                                                vVar = new v(new C2202b(str, bVar.a(), "video/mp2t"));
                                                                break;
                                                            case 136:
                                                                vVar = new v(new h(str, bVar.a(), 4096));
                                                                break;
                                                        }
                                                        break;
                                                }
                                                break;
                                        }
                                    } else {
                                        vVar = new v(new h(str, bVar.a(), 5408));
                                    }
                                } else {
                                    vVar = new v(new k(new G(c2207g.a(bVar)), "video/mp2t"));
                                }
                                sparseIntArray.put(iG2, iG2);
                                sparseArray.put(iG2, vVar);
                            }
                            i14 = 4;
                            wVar2 = wVar3;
                            qVar = qVar2;
                            iA = i18;
                            i11 = 0;
                            i12 = 3;
                            i13 = 13;
                        } else {
                            p114j1.q qVar3 = qVar;
                            if (iU2 == 5) {
                                long jW = rVar.w();
                                if (jW == 1094921523) {
                                    i17 = 129;
                                } else if (jW == 1161904947) {
                                    i17 = 135;
                                } else if (jW == 1094921524) {
                                    i17 = 172;
                                } else if (jW == 1212503619) {
                                    i17 = 36;
                                }
                            } else if (iU2 == 106) {
                                i17 = 129;
                            } else if (iU2 == 122) {
                                i17 = 135;
                            } else if (iU2 == 127) {
                                int iU4 = rVar.u();
                                if (iU4 == 21) {
                                    i17 = 172;
                                } else if (iU4 == 14) {
                                    i17 = 136;
                                } else if (iU4 == 33) {
                                    i17 = 139;
                                }
                            } else if (iU2 == 123) {
                                i17 = 138;
                            } else if (iU2 == 10) {
                                String strTrim = rVar.s(3, StandardCharsets.UTF_8).trim();
                                iU = rVar.u();
                                str2 = strTrim;
                            } else if (iU2 == 89) {
                                ArrayList arrayList2 = new ArrayList();
                                while (rVar.f41063b < iU3) {
                                    String strTrim2 = rVar.s(3, StandardCharsets.UTF_8).trim();
                                    rVar.u();
                                    w wVar4 = wVar2;
                                    byte[] bArr = new byte[4];
                                    rVar.f(bArr, 0, 4);
                                    arrayList2.add(new F.a(strTrim2, bArr));
                                    wVar2 = wVar4;
                                    iA = iA;
                                }
                                wVar2 = wVar2;
                                iA = iA;
                                arrayList = arrayList2;
                                i17 = 89;
                            } else {
                                wVar2 = wVar2;
                                iA = iA;
                                if (iU2 == 111) {
                                    i17 = 257;
                                }
                            }
                            rVar.H(iU3 - rVar.f41063b);
                            wVar2 = wVar2;
                            qVar = qVar3;
                            iA = iA;
                        }
                    }
                    w wVar5 = wVar2;
                    int i19 = iA;
                    p114j1.q qVar4 = qVar;
                    rVar.G(i16);
                    bVar = new F.b(i17, str2, iU, arrayList, Arrays.copyOfRange(rVar.f41062a, i15, i16));
                    if (iG != 6) {
                        iG = i17;
                    } else {
                        iG = i17;
                    }
                    iA2 -= iG3 + 5;
                    if (sparseBooleanArray.get(iG2)) {
                        c2207g = e10.f35779e;
                        if (iG != 2) {
                            c2207g.getClass();
                            str = bVar.f35802a;
                            if (iG != 3) {
                                vVar = new v(new q(str, bVar.a(), "video/mp2t"));
                            } else {
                                vVar = new v(new q(str, bVar.a(), "video/mp2t"));
                            }
                        } else {
                            vVar = new v(new k(new G(c2207g.a(bVar)), "video/mp2t"));
                        }
                        sparseIntArray.put(iG2, iG2);
                        sparseArray.put(iG2, vVar);
                    }
                    i14 = 4;
                    wVar2 = wVar5;
                    qVar = qVar4;
                    iA = i19;
                    i11 = 0;
                    i12 = 3;
                    i13 = 13;
                } else {
                    w wVar6 = wVar2;
                    int i20 = iA;
                    int size = sparseIntArray.size();
                    int i21 = 0;
                    while (true) {
                        SparseArray<F> sparseArray2 = e10.f35781g;
                        if (i21 >= size) {
                            sparseArray2.remove(this.f35798d);
                            e10.f35786m = 0;
                            e10.f35785l.j();
                            e10.f35787n = true;
                            return;
                        }
                        int iKeyAt = sparseIntArray.keyAt(i21);
                        int iValueAt = sparseIntArray.valueAt(i21);
                        sparseBooleanArray.put(iKeyAt, true);
                        e10.f35783i.put(iValueAt, true);
                        F fValueAt = sparseArray.valueAt(i21);
                        if (fValueAt != null) {
                            if (fValueAt != e10.f35790q) {
                                A1.r rVar2 = e10.f35785l;
                                i10 = i20;
                                F.c cVar = new F.c(i10, iKeyAt, 8192);
                                wVar = wVar6;
                                fValueAt.b(wVar, rVar2, cVar);
                            } else {
                                wVar = wVar6;
                                i10 = i20;
                            }
                            sparseArray2.put(iValueAt, fValueAt);
                        } else {
                            wVar = wVar6;
                            i10 = i20;
                        }
                        i21++;
                        wVar6 = wVar;
                        i20 = i10;
                    }
                }
            }
        }

        @Override // p091h2.z
        public final void b(w wVar, A1.r rVar, F.c cVar) {
        }
    }
}
