package C1;

import A1.C0574i;
import A1.C0576k;
import A1.E;
import A1.F;
import A1.K;
import A1.p;
import A1.q;
import X1.m;
import androidx.media3.common.ParserException;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import p078g1.n;
import p078g1.t;
import p114j1.A;
import p114j1.k;
import p114j1.r;

/* JADX INFO: compiled from: AviExtractor.java */
/* JADX INFO: loaded from: classes.dex */
public final class b implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f2281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0021b f2282b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f2283c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final X1.e f2284d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f2285e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public A1.r f2286f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c f2287g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f2288h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public e[] f2289i;
    public long j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public e f2290k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f2291l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f2292m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f2293n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f2294o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f2295p;

    /* JADX INFO: compiled from: AviExtractor.java */
    public class a implements F {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f2296a;

        public a(long j) {
            this.f2296a = j;
        }

        @Override // A1.F
        public final boolean d() {
            return true;
        }

        @Override // A1.F
        public final F.a i(long j) {
            b bVar = b.this;
            F.a aVarB = bVar.f2289i[0].b(j);
            int i10 = 1;
            while (true) {
                e[] eVarArr = bVar.f2289i;
                if (i10 >= eVarArr.length) {
                    return aVarB;
                }
                F.a aVarB2 = eVarArr[i10].b(j);
                if (aVarB2.f415a.f421b < aVarB.f415a.f421b) {
                    aVarB = aVarB2;
                }
                i10++;
            }
        }

        @Override // A1.F
        public final long k() {
            return this.f2296a;
        }
    }

    /* JADX INFO: renamed from: C1.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AviExtractor.java */
    public static class C0021b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f2298a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f2299b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f2300c;
    }

    public b(int i10, X1.e eVar) {
        this.f2284d = eVar;
        this.f2283c = (i10 & 1) == 0;
        this.f2281a = new r(12);
        this.f2282b = new C0021b();
        this.f2286f = new p241t7.b();
        this.f2289i = new e[0];
        this.f2292m = -1L;
        this.f2293n = -1L;
        this.f2291l = -1;
        this.f2288h = -9223372036854775807L;
    }

    @Override // A1.p
    public final void f(long j, long j10) {
        this.j = -1L;
        this.f2290k = null;
        for (e eVar : this.f2289i) {
            if (eVar.f2319k == 0) {
                eVar.f2318i = 0;
            } else {
                eVar.f2318i = eVar.f2322n[A.d(eVar.f2321m, j, true)];
            }
        }
        if (j != 0) {
            this.f2285e = 6;
        } else if (this.f2289i.length == 0) {
            this.f2285e = 0;
        } else {
            this.f2285e = 3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:173:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:61:0x0101  */
    /* JADX WARN: Code duplicated, block: B:62:0x0108  */
    @Override // A1.p
    public final int h(q qVar, E e10) throws IOException {
        boolean z10;
        e eVar;
        long j;
        int i10;
        e eVar2;
        long j10 = this.j;
        int i11 = 0;
        if (j10 != -1) {
            long j11 = ((C0574i) qVar).f523d;
            if (j10 < j11 || j10 > 262144 + j11) {
                e10.f414a = j10;
                z10 = true;
            } else {
                ((C0574i) qVar).i((int) (j10 - j11));
                z10 = false;
            }
        } else {
            z10 = false;
        }
        this.j = -1L;
        if (z10) {
            return 1;
        }
        int i12 = this.f2285e;
        e eVar3 = null;
        int i13 = 4;
        C0021b c0021b = this.f2282b;
        r rVar = this.f2281a;
        switch (i12) {
            case 0:
                if (!l(qVar)) {
                    throw ParserException.a(null, "AVI Header List not found");
                }
                ((C0574i) qVar).i(12);
                this.f2285e = 1;
                return 0;
            case 1:
                ((C0574i) qVar).a(rVar.f41062a, 0, 12, false);
                rVar.G(0);
                c0021b.getClass();
                c0021b.f2298a = rVar.j();
                c0021b.f2299b = rVar.j();
                c0021b.f2300c = 0;
                if (c0021b.f2298a != 1414744396) {
                    throw ParserException.a(null, "LIST expected, found: " + c0021b.f2298a);
                }
                int iJ = rVar.j();
                c0021b.f2300c = iJ;
                if (iJ == 1819436136) {
                    this.f2291l = c0021b.f2299b;
                    this.f2285e = 2;
                    return 0;
                }
                throw ParserException.a(null, "hdrl expected, found: " + c0021b.f2300c);
            case 2:
                int i14 = this.f2291l - 4;
                r rVar2 = new r(i14);
                ((C0574i) qVar).a(rVar2.f41062a, 0, i14, false);
                f fVarB = f.b(1819436136, rVar2);
                int i15 = fVarB.f2324b;
                if (i15 != 1819436136) {
                    throw ParserException.a(null, "Unexpected header list type " + i15);
                }
                c cVar = (c) fVarB.a(c.class);
                if (cVar == null) {
                    throw ParserException.a(null, "AviHeader not found");
                }
                this.f2287g = cVar;
                this.f2288h = ((long) cVar.f2303c) * ((long) cVar.f2301a);
                ArrayList arrayList = new ArrayList();
                ImmutableList.b bVarListIterator = fVarB.f2323a.listIterator(0);
                int i16 = 0;
                while (bVarListIterator.hasNext()) {
                    C1.a aVar = (C1.a) bVarListIterator.next();
                    if (aVar.getType() == 1819440243) {
                        f fVar = (f) aVar;
                        int i17 = i16 + 1;
                        d dVar = (d) fVar.a(d.class);
                        g gVar = (g) fVar.a(g.class);
                        if (dVar == null) {
                            k.f("Missing Stream Header");
                        } else if (gVar == null) {
                            k.f("Missing Stream Format");
                        } else {
                            long j12 = dVar.f2307d;
                            long j13 = ((long) dVar.f2305b) * 1000000;
                            long j14 = dVar.f2306c;
                            int i18 = A.f40996a;
                            long jL = A.L(j12, j13, j14, RoundingMode.DOWN);
                            n nVar = gVar.f2325a;
                            n.a aVarA = nVar.a();
                            aVarA.f35327a = Integer.toString(i16);
                            int i19 = dVar.f2308e;
                            if (i19 != 0) {
                                aVarA.f35339n = i19;
                            }
                            h hVar = (h) fVar.a(h.class);
                            if (hVar != null) {
                                aVarA.f35328b = hVar.f2326a;
                            }
                            int iH = t.h(nVar.f35302n);
                            if (iH == 1 || iH == 2) {
                                K kP = this.f2286f.p(i16, iH);
                                C0576k.b(aVarA, kP);
                                this.f2288h = Math.max(this.f2288h, jL);
                                eVar = new e(i16, dVar, kP);
                            }
                            if (eVar != null) {
                                arrayList.add(eVar);
                            }
                            i16 = i17;
                        }
                        eVar = null;
                        if (eVar != null) {
                            arrayList.add(eVar);
                        }
                        i16 = i17;
                    }
                }
                this.f2289i = (e[]) arrayList.toArray(new e[0]);
                this.f2286f.j();
                this.f2285e = 3;
                return 0;
            case 3:
                long j15 = this.f2292m;
                if (j15 != -1 && ((C0574i) qVar).f523d != j15) {
                    this.j = j15;
                    return 0;
                }
                ((C0574i) qVar).c(rVar.f41062a, 0, 12, false);
                C0574i c0574i = (C0574i) qVar;
                c0574i.f525f = 0;
                rVar.G(0);
                c0021b.getClass();
                c0021b.f2298a = rVar.j();
                c0021b.f2299b = rVar.j();
                c0021b.f2300c = 0;
                int iJ2 = rVar.j();
                int i20 = c0021b.f2298a;
                if (i20 == 1179011410) {
                    c0574i.i(12);
                    return 0;
                }
                if (i20 != 1414744396 || iJ2 != 1769369453) {
                    this.j = c0574i.f523d + ((long) c0021b.f2299b) + 8;
                    return 0;
                }
                long j16 = c0574i.f523d;
                this.f2292m = j16;
                this.f2293n = j16 + ((long) c0021b.f2299b) + 8;
                if (!this.f2295p) {
                    c cVar2 = this.f2287g;
                    cVar2.getClass();
                    if ((cVar2.f2302b & 16) == 16) {
                        this.f2285e = 4;
                        this.j = this.f2293n;
                        return 0;
                    }
                    this.f2286f.g(new F.b(this.f2288h));
                    this.f2295p = true;
                }
                this.j = c0574i.f523d + 12;
                this.f2285e = 6;
                return 0;
            case 4:
                ((C0574i) qVar).a(rVar.f41062a, 0, 8, false);
                rVar.G(0);
                int iJ3 = rVar.j();
                int iJ4 = rVar.j();
                if (iJ3 != 829973609) {
                    this.j = ((C0574i) qVar).f523d + ((long) iJ4);
                    return 0;
                }
                this.f2285e = 5;
                this.f2294o = iJ4;
                return 0;
            case 5:
                r rVar3 = new r(this.f2294o);
                ((C0574i) qVar).a(rVar3.f41062a, 0, this.f2294o, false);
                if (rVar3.a() < 16) {
                    j = 0;
                } else {
                    int i21 = rVar3.f41063b;
                    rVar3.H(8);
                    long j17 = rVar3.j();
                    long j18 = this.f2292m;
                    j = j17 > j18 ? 0L : j18 + 8;
                    rVar3.G(i21);
                }
                while (rVar3.a() >= 16) {
                    int iJ5 = rVar3.j();
                    int iJ6 = rVar3.j();
                    long j19 = ((long) rVar3.j()) + j;
                    rVar3.H(i13);
                    e[] eVarArr = this.f2289i;
                    int length = eVarArr.length;
                    int i22 = i11;
                    while (true) {
                        if (i22 < length) {
                            eVar2 = eVarArr[i22];
                            if (eVar2.f2312c != iJ5 && eVar2.f2313d != iJ5) {
                                i22++;
                            }
                        } else {
                            eVar2 = null;
                        }
                    }
                    if (eVar2 != null) {
                        boolean z11 = (iJ6 & 16) == 16;
                        if (eVar2.f2320l == -1) {
                            eVar2.f2320l = j19;
                        }
                        if (z11) {
                            if (eVar2.f2319k == eVar2.f2322n.length) {
                                long[] jArr = eVar2.f2321m;
                                eVar2.f2321m = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
                                int[] iArr = eVar2.f2322n;
                                eVar2.f2322n = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
                            }
                            long[] jArr2 = eVar2.f2321m;
                            int i23 = eVar2.f2319k;
                            jArr2[i23] = j19;
                            eVar2.f2322n[i23] = eVar2.j;
                            eVar2.f2319k = i23 + 1;
                        }
                        eVar2.j++;
                    }
                    i11 = 0;
                    i13 = 4;
                }
                for (e eVar4 : this.f2289i) {
                    eVar4.f2321m = Arrays.copyOf(eVar4.f2321m, eVar4.f2319k);
                    eVar4.f2322n = Arrays.copyOf(eVar4.f2322n, eVar4.f2319k);
                    if ((eVar4.f2312c & 1651965952) == 1651965952 && eVar4.f2310a.f2309f != 0 && (i10 = eVar4.f2319k) > 0) {
                        eVar4.f2315f = i10;
                    }
                }
                this.f2295p = true;
                if (this.f2289i.length == 0) {
                    this.f2286f.g(new F.b(this.f2288h));
                } else {
                    this.f2286f.g(new a(this.f2288h));
                }
                this.f2285e = 6;
                this.j = this.f2292m;
                return 0;
            case 6:
                if (((C0574i) qVar).f523d >= this.f2293n) {
                    return -1;
                }
                e eVar5 = this.f2290k;
                if (eVar5 != null) {
                    int i24 = eVar5.f2317h;
                    int iF = i24 - eVar5.f2311b.f(qVar, i24, false);
                    eVar5.f2317h = iF;
                    boolean z12 = iF == 0;
                    if (z12) {
                        if (eVar5.f2316g > 0) {
                            int i25 = eVar5.f2318i;
                            eVar5.f2311b.b((eVar5.f2314e * ((long) i25)) / ((long) eVar5.f2315f), Arrays.binarySearch(eVar5.f2322n, i25) >= 0 ? 1 : 0, eVar5.f2316g, 0, null);
                        }
                        eVar5.f2318i++;
                    }
                    if (!z12) {
                        return 0;
                    }
                    this.f2290k = null;
                    return 0;
                }
                C0574i c0574i2 = (C0574i) qVar;
                if ((c0574i2.f523d & 1) == 1) {
                    c0574i2.i(1);
                }
                c0574i2.c(rVar.f41062a, 0, 12, false);
                rVar.G(0);
                int iJ7 = rVar.j();
                if (iJ7 == 1414744396) {
                    rVar.G(8);
                    c0574i2.i(rVar.j() == 1769369453 ? 12 : 8);
                    c0574i2.f525f = 0;
                    return 0;
                }
                int iJ8 = rVar.j();
                if (iJ7 == 1263424842) {
                    this.j = c0574i2.f523d + ((long) iJ8) + 8;
                    return 0;
                }
                c0574i2.i(8);
                c0574i2.f525f = 0;
                for (e eVar6 : this.f2289i) {
                    if (eVar6.f2312c == iJ7 || eVar6.f2313d == iJ7) {
                        eVar3 = eVar6;
                        if (eVar3 == null) {
                            this.j = c0574i2.f523d + ((long) iJ8);
                            return 0;
                        }
                        eVar3.f2316g = iJ8;
                        eVar3.f2317h = iJ8;
                        this.f2290k = eVar3;
                        return 0;
                    }
                }
                if (eVar3 == null) {
                    this.j = c0574i2.f523d + ((long) iJ8);
                    return 0;
                }
                eVar3.f2316g = iJ8;
                eVar3.f2317h = iJ8;
                this.f2290k = eVar3;
                return 0;
            default:
                throw new AssertionError();
        }
    }

    @Override // A1.p
    public final boolean l(q qVar) throws IOException {
        r rVar = this.f2281a;
        ((C0574i) qVar).c(rVar.f41062a, 0, 12, false);
        rVar.G(0);
        if (rVar.j() != 1179011410) {
            return false;
        }
        rVar.H(4);
        return rVar.j() == 541677121;
    }

    @Override // A1.p
    public final void m(A1.r rVar) {
        this.f2285e = 0;
        if (this.f2283c) {
            rVar = new m(rVar, this.f2284d);
        }
        this.f2286f = rVar;
        this.j = -1L;
    }

    @Override // A1.p
    public final void a() {
    }
}
