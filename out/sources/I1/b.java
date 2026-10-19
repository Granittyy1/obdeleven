package I1;

import A1.C0574i;
import A1.C0576k;
import A1.E;
import A1.F;
import A1.K;
import A1.p;
import A1.q;
import U1.g;
import X1.l;
import androidx.media3.common.ParserException;
import androidx.media3.exoplayer.source.k;
import java.io.IOException;
import java.util.List;
import org.xmlpull.v1.XmlPullParserException;
import p078g1.n;
import p078g1.s;
import p078g1.t;
import p114j1.r;

/* JADX INFO: compiled from: JpegMotionPhotoExtractor.java */
/* JADX INFO: loaded from: classes.dex */
public final class b implements p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public k f3784b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3785c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3786d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f3787e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public P1.a f3789g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public C0574i f3790h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public d f3791i;
    public g j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f3783a = new r(6);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f3788f = -1;

    @Override // A1.p
    public final void a() {
        g gVar = this.j;
        if (gVar != null) {
            gVar.getClass();
        }
    }

    public final void c() {
        k kVar = this.f3784b;
        kVar.getClass();
        kVar.j();
        this.f3784b.g(new F.b(-9223372036854775807L));
        this.f3785c = 6;
    }

    @Override // A1.p
    public final void f(long j, long j10) {
        if (j == 0) {
            this.f3785c = 0;
            this.j = null;
        } else if (this.f3785c == 5) {
            g gVar = this.j;
            gVar.getClass();
            gVar.f(j, j10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0107  */
    @Override // A1.p
    public final int h(q qVar, E e10) throws IOException {
        String strP;
        c cVarA;
        P1.a aVar;
        long j;
        int i10 = this.f3785c;
        r rVar = this.f3783a;
        if (i10 == 0) {
            rVar.D(2);
            ((C0574i) qVar).a(rVar.f41062a, 0, 2, false);
            int iA = rVar.A();
            this.f3786d = iA;
            if (iA == 65498) {
                if (this.f3788f != -1) {
                    this.f3785c = 4;
                    return 0;
                }
                c();
                return 0;
            }
            if ((iA >= 65488 && iA <= 65497) || iA == 65281) {
                return 0;
            }
            this.f3785c = 1;
            return 0;
        }
        if (i10 == 1) {
            rVar.D(2);
            ((C0574i) qVar).a(rVar.f41062a, 0, 2, false);
            this.f3787e = rVar.A() - 2;
            this.f3785c = 2;
            return 0;
        }
        if (i10 != 2) {
            if (i10 != 4) {
                if (i10 != 5) {
                    if (i10 == 6) {
                        return -1;
                    }
                    throw new IllegalStateException();
                }
                if (this.f3791i == null || qVar != this.f3790h) {
                    C0574i c0574i = (C0574i) qVar;
                    this.f3790h = c0574i;
                    this.f3791i = new d(c0574i, this.f3788f);
                }
                g gVar = this.j;
                gVar.getClass();
                int iH = gVar.h(this.f3791i, e10);
                if (iH == 1) {
                    e10.f414a += this.f3788f;
                }
                return iH;
            }
            long j10 = ((C0574i) qVar).f523d;
            long j11 = this.f3788f;
            if (j10 != j11) {
                e10.f414a = j11;
                return 1;
            }
            C0574i c0574i2 = (C0574i) qVar;
            if (c0574i2.c(rVar.f41062a, 0, 1, true)) {
                c0574i2.f525f = 0;
                if (this.j == null) {
                    this.j = new g(l.a.f7151a, 8);
                }
                d dVar = new d(c0574i2, this.f3788f);
                this.f3791i = dVar;
                if (this.j.l(dVar)) {
                    g gVar2 = this.j;
                    long j12 = this.f3788f;
                    k kVar = this.f3784b;
                    kVar.getClass();
                    gVar2.m(new e(j12, kVar));
                    P1.a aVar2 = this.f3789g;
                    aVar2.getClass();
                    k kVar2 = this.f3784b;
                    kVar2.getClass();
                    K kP = kVar2.p(1024, 4);
                    n.a aVar3 = new n.a();
                    aVar3.f35337l = t.m("image/jpeg");
                    aVar3.f35336k = new s(aVar2);
                    C0576k.b(aVar3, kP);
                    this.f3785c = 5;
                } else {
                    c();
                }
            } else {
                c();
            }
            return 0;
        }
        if (this.f3786d == 65505) {
            r rVar2 = new r(this.f3787e);
            ((C0574i) qVar).a(rVar2.f41062a, 0, this.f3787e, false);
            if (this.f3789g == null && "http://ns.adobe.com/xap/1.0/".equals(rVar2.p()) && (strP = rVar2.p()) != null) {
                long j13 = ((C0574i) qVar).f522c;
                if (j13 == -1) {
                    aVar = null;
                } else {
                    try {
                        cVarA = f.a(strP);
                    } catch (ParserException | NumberFormatException | XmlPullParserException unused) {
                        p114j1.k.f("Ignoring unexpected XMP metadata");
                        cVarA = null;
                    }
                    if (cVarA == null) {
                        aVar = null;
                    } else {
                        List<c.a> list = cVarA.f3793b;
                        if (list.size() < 2) {
                            aVar = null;
                        } else {
                            boolean zEquals = false;
                            long j14 = -1;
                            long j15 = -1;
                            long j16 = -1;
                            long j17 = -1;
                            for (int size = list.size() - 1; size >= 0; size--) {
                                c.a aVar4 = list.get(size);
                                zEquals |= "video/mp4".equals(aVar4.f3794a);
                                if (size == 0) {
                                    j13 -= aVar4.f3796c;
                                    j = 0;
                                } else {
                                    j = j13 - aVar4.f3795b;
                                }
                                long j18 = j;
                                long j19 = j13;
                                j13 = j18;
                                if (zEquals && j13 != j19) {
                                    j17 = j19 - j13;
                                    j16 = j13;
                                    zEquals = false;
                                }
                                if (size == 0) {
                                    j15 = j19;
                                    j14 = j13;
                                }
                            }
                            if (j16 == -1 || j17 == -1 || j14 == -1 || j15 == -1) {
                                aVar = null;
                            } else {
                                aVar = new P1.a(j14, j15, cVarA.f3792a, j16, j17);
                            }
                        }
                    }
                }
                this.f3789g = aVar;
                if (aVar != null) {
                    this.f3788f = aVar.f4887d;
                }
            }
        } else {
            ((C0574i) qVar).i(this.f3787e);
        }
        this.f3785c = 0;
        return 0;
    }

    @Override // A1.p
    public final boolean l(q qVar) throws IOException {
        C0574i c0574i = (C0574i) qVar;
        r rVar = this.f3783a;
        rVar.D(2);
        c0574i.c(rVar.f41062a, 0, 2, false);
        if (rVar.A() != 65496) {
            return false;
        }
        rVar.D(2);
        c0574i.c(rVar.f41062a, 0, 2, false);
        int iA = rVar.A();
        this.f3786d = iA;
        if (iA == 65504) {
            rVar.D(2);
            c0574i.c(rVar.f41062a, 0, 2, false);
            c0574i.k(rVar.A() - 2, false);
            rVar.D(2);
            c0574i.c(rVar.f41062a, 0, 2, false);
            this.f3786d = rVar.A();
        }
        if (this.f3786d != 65505) {
            return false;
        }
        c0574i.k(2, false);
        rVar.D(6);
        c0574i.c(rVar.f41062a, 0, 6, false);
        return rVar.w() == 1165519206 && rVar.A() == 0;
    }

    @Override // A1.p
    public final void m(A1.r rVar) {
        this.f3784b = (k) rVar;
    }
}
